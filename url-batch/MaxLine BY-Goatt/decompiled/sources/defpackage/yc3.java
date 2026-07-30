package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yc3 extends bb3 {
    public final /* synthetic */ ln a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc3(ln lnVar, Looper looper) {
        super(looper, 4);
        this.a = lnVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        int i = this.a.I.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                eb3 eb3Var = (eb3) message.obj;
                eb3Var.getClass();
                eb3Var.c();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !this.a.f()) {
            eb3 eb3Var2 = (eb3) message.obj;
            eb3Var2.getClass();
            eb3Var2.c();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            ln lnVar = this.a;
            lnVar.F = new c10(message.arg2);
            if (!lnVar.G && !TextUtils.isEmpty(lnVar.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(lnVar.u());
                    ln lnVar2 = this.a;
                    if (!lnVar2.G) {
                        lnVar2.y(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ln lnVar3 = this.a;
            c10 c10Var = lnVar3.F;
            if (c10Var == null) {
                c10Var = new c10(8);
            }
            lnVar3.v.g(c10Var);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ln lnVar4 = this.a;
            c10 c10Var2 = lnVar4.F;
            if (c10Var2 == null) {
                c10Var2 = new c10(8);
            }
            lnVar4.v.g(c10Var2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            this.a.v.g(new c10(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            this.a.y(5, null);
            in inVar = this.a.A;
            if (inVar != null) {
                inVar.b(message.arg2);
            }
            System.currentTimeMillis();
            ln.x(this.a, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.a.a()) {
            eb3 eb3Var3 = (eb3) message.obj;
            eb3Var3.getClass();
            eb3Var3.c();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", in1.k(i5, "Don't know how to handle message: "), new Exception());
            return;
        }
        eb3 eb3Var4 = (eb3) message.obj;
        synchronized (eb3Var4) {
            try {
                bool = eb3Var4.a;
                if (eb3Var4.b) {
                    Log.w("GmsClient", "Callback proxy " + eb3Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            ln lnVar5 = eb3Var4.f;
            int i6 = eb3Var4.d;
            if (i6 != 0) {
                lnVar5.y(1, null);
                Bundle bundle = eb3Var4.e;
                eb3Var4.a(new c10(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!eb3Var4.b()) {
                lnVar5.y(1, null);
                eb3Var4.a(new c10(8, null));
            }
        }
        synchronized (eb3Var4) {
            eb3Var4.b = true;
        }
        eb3Var4.c();
    }
}
