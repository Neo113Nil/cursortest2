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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ic2 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final yq c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public ue3 g;
    public final fl2 a = new fl2(0);
    public final Messenger e = new Messenger(new rb3(this, Looper.getMainLooper()));

    public ic2(Context context) {
        this.b = context;
        this.c = new yq(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final ys3 a(Bundle bundle) {
        String num;
        synchronized (ic2.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        kt2 kt2Var = new kt2();
        synchronized (this.a) {
            this.a.put(num, kt2Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        int i3 = 2;
        if (this.c.v() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (ic2.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, fb3.a);
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
                    Messenger messenger2 = this.g.m;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            kt2Var.a.c(of3.o, new t13(this, num, this.d.schedule(new r7(16, kt2Var), 30L, TimeUnit.SECONDS), i3));
            return kt2Var.a;
        }
        int v = this.c.v();
        Context context2 = this.b;
        if (v == 2) {
            context2.sendBroadcast(intent);
        } else {
            context2.startService(intent);
        }
        kt2Var.a.c(of3.o, new t13(this, num, this.d.schedule(new r7(16, kt2Var), 30L, TimeUnit.SECONDS), i3));
        return kt2Var.a;
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.a) {
            try {
                kt2 kt2Var = (kt2) this.a.remove(str);
                if (kt2Var != null) {
                    kt2Var.a(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
