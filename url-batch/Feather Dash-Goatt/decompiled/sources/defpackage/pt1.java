package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pt1 extends gt1 {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt1(a aVar, Looper looper) {
        super(looper, 3);
        this.a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        int i = this.a.v.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                it1 it1Var = (it1) message.obj;
                it1Var.getClass();
                it1Var.c();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !this.a.f()) {
            it1 it1Var2 = (it1) message.obj;
            it1Var2.getClass();
            it1Var2.c();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            a aVar = this.a;
            aVar.s = new fm(message.arg2);
            if (!aVar.t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    a aVar2 = this.a;
                    if (!aVar2.t) {
                        aVar2.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            a aVar3 = this.a;
            fm fmVar = aVar3.s;
            if (fmVar == null) {
                fmVar = new fm(8);
            }
            aVar3.i.g(fmVar);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            a aVar4 = this.a;
            fm fmVar2 = aVar4.s;
            if (fmVar2 == null) {
                fmVar2 = new fm(8);
            }
            aVar4.i.g(fmVar2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            this.a.i.g(new fm(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            this.a.v(5, null);
            nq0 nq0Var = this.a.n;
            if (nq0Var != null) {
                ((e50) nq0Var.e).a(message.arg2);
            }
            System.currentTimeMillis();
            a.u(this.a, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.a.a()) {
            it1 it1Var3 = (it1) message.obj;
            it1Var3.getClass();
            it1Var3.c();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", qy0.i(i5, "Don't know how to handle message: "), new Exception());
            return;
        }
        it1 it1Var4 = (it1) message.obj;
        synchronized (it1Var4) {
            try {
                bool = it1Var4.a;
                if (it1Var4.b) {
                    Log.w("GmsClient", "Callback proxy " + it1Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a aVar5 = it1Var4.f;
            int i6 = it1Var4.d;
            if (i6 != 0) {
                aVar5.v(1, null);
                Bundle bundle = it1Var4.e;
                it1Var4.a(new fm(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!it1Var4.b()) {
                aVar5.v(1, null);
                it1Var4.a(new fm(8, null));
            }
        }
        synchronized (it1Var4) {
            it1Var4.b = true;
        }
        it1Var4.c();
    }
}
