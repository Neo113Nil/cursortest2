package m4;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends u4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper);
        this.f6389a = aVar;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f6389a.f1800v.get() != message.arg1) {
            int i7 = message.what;
            if (i7 == 2 || i7 == 1 || i7 == 7) {
                l lVar = (l) message.obj;
                lVar.getClass();
                lVar.c();
                return;
            }
            return;
        }
        int i8 = message.what;
        if ((i8 == 1 || i8 == 7 || i8 == 4 || i8 == 5) && !this.f6389a.f()) {
            l lVar2 = (l) message.obj;
            lVar2.getClass();
            lVar2.c();
            return;
        }
        int i9 = message.what;
        if (i9 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f6389a;
            aVar.f1797s = new j4.b(message.arg2);
            if (!aVar.f1798t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    com.google.android.gms.common.internal.a aVar2 = this.f6389a;
                    if (!aVar2.f1798t) {
                        aVar2.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f6389a;
            j4.b bVar = aVar3.f1797s;
            if (bVar == null) {
                bVar = new j4.b(8);
            }
            aVar3.f1787i.a(bVar);
            System.currentTimeMillis();
            return;
        }
        if (i9 == 5) {
            com.google.android.gms.common.internal.a aVar4 = this.f6389a;
            j4.b bVar2 = aVar4.f1797s;
            if (bVar2 == null) {
                bVar2 = new j4.b(8);
            }
            aVar4.f1787i.a(bVar2);
            System.currentTimeMillis();
            return;
        }
        if (i9 == 3) {
            Object obj = message.obj;
            this.f6389a.f1787i.a(new j4.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i9 == 6) {
            this.f6389a.v(5, null);
            l1.x xVar = this.f6389a.f1792n;
            if (xVar != null) {
                ((k4.c) xVar.f5847g).a(message.arg2);
            }
            System.currentTimeMillis();
            com.google.android.gms.common.internal.a.u(this.f6389a, 5, 1, null);
            return;
        }
        if (i9 == 2 && !this.f6389a.a()) {
            l lVar3 = (l) message.obj;
            lVar3.getClass();
            lVar3.c();
            return;
        }
        int i10 = message.what;
        if (i10 != 2 && i10 != 1 && i10 != 7) {
            Log.wtf("GmsClient", a0.m.i("Don't know how to handle message: ", i10), new Exception());
            return;
        }
        l lVar4 = (l) message.obj;
        synchronized (lVar4) {
            try {
                bool = lVar4.f6379a;
                if (lVar4.f6380b) {
                    Log.w("GmsClient", "Callback proxy " + lVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = lVar4.f6384f;
            int i11 = lVar4.f6382d;
            if (i11 != 0) {
                aVar5.v(1, null);
                Bundle bundle = lVar4.f6383e;
                lVar4.a(new j4.b(i11, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!lVar4.b()) {
                aVar5.v(1, null);
                lVar4.a(new j4.b(8, null));
            }
        }
        synchronized (lVar4) {
            lVar4.f6380b = true;
        }
        lVar4.c();
    }
}
