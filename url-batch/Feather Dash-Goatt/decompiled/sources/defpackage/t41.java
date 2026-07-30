package defpackage;

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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class t41 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final xq0 c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public wt1 g;
    public final qa1 a = new qa1(0);
    public final Messenger e = new Messenger(new nt1(this, Looper.getMainLooper()));

    public t41(Context context) {
        this.b = context;
        this.c = new xq0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final zu1 a(Bundle bundle) {
        String num;
        synchronized (t41.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        ng1 ng1Var = new ng1();
        synchronized (this.a) {
            this.a.put(num, ng1Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.l() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (t41.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, jt1.a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.g.d;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            ng1Var.a.b(du1.g, new i8(this, num, this.d.schedule(new b4(7, ng1Var), 30L, TimeUnit.SECONDS), 26));
            return ng1Var.a;
        }
        int l = this.c.l();
        Context context2 = this.b;
        if (l == 2) {
            context2.sendBroadcast(intent);
        } else {
            context2.startService(intent);
        }
        ng1Var.a.b(du1.g, new i8(this, num, this.d.schedule(new b4(7, ng1Var), 30L, TimeUnit.SECONDS), 26));
        return ng1Var.a;
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.a) {
            try {
                ng1 ng1Var = (ng1) this.a.remove(str);
                if (ng1Var != null) {
                    ng1Var.a(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
