package y6;

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
import n0.c1;
import s.r0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static int f10632h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f10633i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f10635b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f10636c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f10637d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f10639f;
    public f g;

    /* renamed from: a, reason: collision with root package name */
    public final r0 f10634a = new r0(0);

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f10638e = new Messenger(new n(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f10635b = context;
        this.f10636c = new c1(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new h7.a("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f10637d = scheduledThreadPoolExecutor;
    }

    public final void a(String str, Bundle bundle) {
        r0 r0Var = this.f10634a;
        synchronized (r0Var) {
            try {
                w7.g gVar = (w7.g) r0Var.remove(str);
                if (gVar != null) {
                    gVar.a(bundle);
                    return;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21);
                sb2.append("Missing callback for ");
                sb2.append(str);
                Log.w("Rpc", sb2.toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final w7.n b(Bundle bundle) {
        String num;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle2;
        synchronized (c.class) {
            int i3 = f10632h;
            f10632h = i3 + 1;
            num = Integer.toString(i3);
        }
        w7.g gVar = new w7.g();
        r0 r0Var = this.f10634a;
        synchronized (r0Var) {
            r0Var.put(num, gVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f10636c.o() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f10635b;
        synchronized (c.class) {
            try {
                if (f10633i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f10633i = PendingIntent.getBroadcast(context, 0, intent2, n7.f.f7175a);
                }
                intent.putExtra("app", f10633i);
            } finally {
            }
        }
        intent.putExtra("kid", v4.a.p(new StringBuilder(String.valueOf(num).length() + 5), "|ID|", num, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f10638e);
        if (this.f10639f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f10639f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.f10641d.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            gVar.f10117a.b(d6.n.f3648i, new p.e(this, num, this.f10637d.schedule(new b7.k(25, gVar), 30L, TimeUnit.SECONDS), 17));
            return gVar.f10117a;
        }
        int o6 = this.f10636c.o();
        Context context2 = this.f10635b;
        if (o6 != 2) {
            context2.startService(intent);
        } else if (Build.VERSION.SDK_INT < 34) {
            context2.sendBroadcast(intent);
        } else {
            makeBasic = BroadcastOptions.makeBasic();
            shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
            bundle2 = shareIdentityEnabled.toBundle();
            context2.sendBroadcast(intent, null, bundle2);
        }
        gVar.f10117a.b(d6.n.f3648i, new p.e(this, num, this.f10637d.schedule(new b7.k(25, gVar), 30L, TimeUnit.SECONDS), 17));
        return gVar.f10117a;
    }
}
