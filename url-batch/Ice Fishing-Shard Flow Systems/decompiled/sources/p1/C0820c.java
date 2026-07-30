package p1;

import K1.n;
import K1.p;
import K6.B;
import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import u.C0939j;
import y1.ThreadFactoryC1023a;

/* renamed from: p1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820c {

    /* renamed from: h, reason: collision with root package name */
    public static int f7160h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f7161i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f7163b;

    /* renamed from: c, reason: collision with root package name */
    public final B f7164c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f7165d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f7167f;

    /* renamed from: g, reason: collision with root package name */
    public C0822e f7168g;

    /* renamed from: a, reason: collision with root package name */
    public final C0939j f7162a = new C0939j(0);

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f7166e = new Messenger(new m(this, Looper.getMainLooper()));

    public C0820c(Context context) {
        this.f7163b = context;
        this.f7164c = new B(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1023a("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7165d = scheduledThreadPoolExecutor;
    }

    public final void a(String str, Bundle bundle) {
        C0939j c0939j = this.f7162a;
        synchronized (c0939j) {
            try {
                K1.h hVar = (K1.h) c0939j.remove(str);
                if (hVar != null) {
                    hVar.b(bundle);
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
                sb.append("Missing callback for ");
                sb.append(str);
                Log.w("Rpc", sb.toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p b(Bundle bundle) {
        String num;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle2;
        synchronized (C0820c.class) {
            int i2 = f7160h;
            f7160h = i2 + 1;
            num = Integer.toString(i2);
        }
        K1.h hVar = new K1.h();
        C0939j c0939j = this.f7162a;
        synchronized (c0939j) {
            c0939j.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f7164c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f7163b;
        synchronized (C0820c.class) {
            try {
                if (f7161i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f7161i = PendingIntent.getBroadcast(context, 0, intent2, D1.g.f353a);
                }
                intent.putExtra("app", f7161i);
            } finally {
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 5);
        sb.append("|ID|");
        sb.append(num);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f7166e);
        if (this.f7167f != null || this.f7168g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f7167f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f7168g.f7169d.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.f1428a.b(n.f1442e, new D0.j(this, num, this.f7165d.schedule(new F.b(19, hVar), 30L, TimeUnit.SECONDS), 24));
            return hVar.f1428a;
        }
        if (this.f7164c.b() == 2) {
            Context context2 = this.f7163b;
            if (Build.VERSION.SDK_INT < 34) {
                context2.sendBroadcast(intent);
            } else {
                makeBasic = BroadcastOptions.makeBasic();
                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                bundle2 = shareIdentityEnabled.toBundle();
                context2.sendBroadcast(intent, null, bundle2);
            }
        } else {
            this.f7163b.startService(intent);
        }
        hVar.f1428a.b(n.f1442e, new D0.j(this, num, this.f7165d.schedule(new F.b(19, hVar), 30L, TimeUnit.SECONDS), 24));
        return hVar.f1428a;
    }
}
