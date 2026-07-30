package K2;

import F3.C;
import a3.AbstractC0427a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f1566h;
    public static PendingIntent i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f1567j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f1569b;

    /* renamed from: c, reason: collision with root package name */
    public final o f1570c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f1571d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f1573f;

    /* renamed from: g, reason: collision with root package name */
    public g f1574g;

    /* renamed from: a, reason: collision with root package name */
    public final s.k f1568a = new s.k();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f1572e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f1569b = context;
        this.f1570c = new o(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1571d = scheduledThreadPoolExecutor;
    }

    public final h3.n a(Bundle bundle) {
        String num;
        synchronized (b.class) {
            int i4 = f1566h;
            f1566h = i4 + 1;
            num = Integer.toString(i4);
        }
        h3.h hVar = new h3.h();
        synchronized (this.f1568a) {
            this.f1568a.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f1570c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f1569b;
        synchronized (b.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC0427a.f4375a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + com.anythink.expressad.foundation.g.a.bU);
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f1572e);
        if (this.f1573f != null || this.f1574g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f1573f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f1574g.f1581n;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.f38206a.a(h.f1583v, new Y2.e(this, num, this.f1571d.schedule(new C(3, hVar), 30L, TimeUnit.SECONDS), 7));
            return hVar.f38206a;
        }
        if (this.f1570c.b() == 2) {
            this.f1569b.sendBroadcast(intent);
        } else {
            this.f1569b.startService(intent);
        }
        hVar.f38206a.a(h.f1583v, new Y2.e(this, num, this.f1571d.schedule(new C(3, hVar), 30L, TimeUnit.SECONDS), 7));
        return hVar.f38206a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f1568a) {
            try {
                h3.h hVar = (h3.h) this.f1568a.remove(str);
                if (hVar != null) {
                    hVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
