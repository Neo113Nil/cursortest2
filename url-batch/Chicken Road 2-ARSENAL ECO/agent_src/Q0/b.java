package Q0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import d1.AbstractC0316a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q.C0591k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f1963h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f1964i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f1965j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f1967b;

    /* renamed from: c, reason: collision with root package name */
    public final D4.h f1968c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f1969d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f1971f;

    /* renamed from: g, reason: collision with root package name */
    public g f1972g;

    /* renamed from: a, reason: collision with root package name */
    public final C0591k f1966a = new C0591k();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f1970e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f1967b = context;
        this.f1968c = new D4.h(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1969d = scheduledThreadPoolExecutor;
    }

    public final k1.n a(Bundle bundle) {
        String num;
        synchronized (b.class) {
            int i7 = f1963h;
            f1963h = i7 + 1;
            num = Integer.toString(i7);
        }
        k1.h hVar = new k1.h();
        synchronized (this.f1966a) {
            this.f1966a.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f1968c.c() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f1967b;
        synchronized (b.class) {
            try {
                if (f1964i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f1964i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC0316a.f3941a);
                }
                intent.putExtra("app", f1964i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f1970e);
        if (this.f1971f != null || this.f1972g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f1971f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f1972g.f1979f;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.f5157a.a(h.f1981h, new B0.c((Object) this, num, (Object) this.f1969d.schedule(new A.b(5, hVar), 30L, TimeUnit.SECONDS), 13));
            return hVar.f5157a;
        }
        if (this.f1968c.c() == 2) {
            this.f1967b.sendBroadcast(intent);
        } else {
            this.f1967b.startService(intent);
        }
        hVar.f5157a.a(h.f1981h, new B0.c((Object) this, num, (Object) this.f1969d.schedule(new A.b(5, hVar), 30L, TimeUnit.SECONDS), 13));
        return hVar.f5157a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f1966a) {
            try {
                k1.h hVar = (k1.h) this.f1966a.remove(str);
                if (hVar != null) {
                    hVar.a(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
