package U0;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class u extends c1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f2583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper);
        this.f2583a = aVar;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f2583a.f3864A.get() != message.arg1) {
            int i7 = message.what;
            if (i7 == 2 || i7 == 1 || i7 == 7) {
                q qVar = (q) message.obj;
                qVar.getClass();
                qVar.c();
                return;
            }
            return;
        }
        int i8 = message.what;
        if ((i8 == 1 || i8 == 7 || i8 == 4 || i8 == 5) && !this.f2583a.f()) {
            q qVar2 = (q) message.obj;
            qVar2.getClass();
            qVar2.c();
            return;
        }
        int i9 = message.what;
        if (i9 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f2583a;
            aVar.f3889x = new R0.a(message.arg2);
            if (!aVar.y && !TextUtils.isEmpty(aVar.s()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.s());
                    com.google.android.gms.common.internal.a aVar2 = this.f2583a;
                    if (!aVar2.y) {
                        aVar2.w(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f2583a;
            R0.a aVar4 = aVar3.f3889x;
            if (aVar4 == null) {
                aVar4 = new R0.a(8);
            }
            aVar3.f3879n.a(aVar4);
            com.google.android.gms.common.internal.a aVar5 = this.f2583a;
            aVar5.f3869d = aVar4.f2053g;
            aVar5.f3870e = System.currentTimeMillis();
            return;
        }
        if (i9 == 5) {
            com.google.android.gms.common.internal.a aVar6 = this.f2583a;
            R0.a aVar7 = aVar6.f3889x;
            if (aVar7 == null) {
                aVar7 = new R0.a(8);
            }
            aVar6.f3879n.a(aVar7);
            com.google.android.gms.common.internal.a aVar8 = this.f2583a;
            aVar8.f3869d = aVar7.f2053g;
            aVar8.f3870e = System.currentTimeMillis();
            return;
        }
        if (i9 == 3) {
            Object obj = message.obj;
            PendingIntent pendingIntent = obj instanceof PendingIntent ? (PendingIntent) obj : null;
            int i10 = message.arg2;
            this.f2583a.f3879n.a(new R0.a(i10, pendingIntent));
            com.google.android.gms.common.internal.a aVar9 = this.f2583a;
            aVar9.f3869d = i10;
            aVar9.f3870e = System.currentTimeMillis();
            return;
        }
        if (i9 == 6) {
            this.f2583a.w(5, null);
            J1.c cVar = this.f2583a.f3884s;
            if (cVar != null) {
                ((S0.e) cVar.f1289g).onConnectionSuspended(message.arg2);
            }
            com.google.android.gms.common.internal.a aVar10 = this.f2583a;
            aVar10.f3866a = message.arg2;
            aVar10.f3867b = System.currentTimeMillis();
            com.google.android.gms.common.internal.a.v(this.f2583a, 5, 1, null);
            return;
        }
        if (i9 == 2 && !this.f2583a.a()) {
            q qVar3 = (q) message.obj;
            qVar3.getClass();
            qVar3.c();
            return;
        }
        int i11 = message.what;
        if (i11 != 2 && i11 != 1 && i11 != 7) {
            Log.wtf("GmsClient", W4.o.c("Don't know how to handle message: ", i11), new Exception());
            return;
        }
        q qVar4 = (q) message.obj;
        synchronized (qVar4) {
            try {
                bool = qVar4.f2573a;
                if (qVar4.f2574b) {
                    Log.w("GmsClient", "Callback proxy " + qVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar11 = qVar4.f2578f;
            int i12 = qVar4.f2576d;
            if (i12 != 0) {
                aVar11.w(1, null);
                Bundle bundle = qVar4.f2577e;
                qVar4.a(new R0.a(i12, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!qVar4.b()) {
                aVar11.w(1, null);
                qVar4.a(new R0.a(8, null));
            }
        }
        synchronized (qVar4) {
            qVar4.f2574b = true;
        }
        qVar4.c();
    }
}
