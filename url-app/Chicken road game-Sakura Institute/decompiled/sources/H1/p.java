package H1;

import A.AbstractC0017m;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import w2.C1294c;

/* loaded from: classes.dex */
public final class p extends P1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f3287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper);
        this.f3287a = aVar;
        Looper.getMainLooper();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r0 == 5) goto L18;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f3287a.f6055v.get() != message.arg1) {
            int i2 = message.what;
            if (i2 == 2 || i2 == 1 || i2 == 7) {
                l lVar = (l) message.obj;
                lVar.getClass();
                lVar.c();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 != 1 && i4 != 7) {
            if (i4 == 4) {
                this.f3287a.getClass();
            }
        }
        if (!this.f3287a.a()) {
            l lVar2 = (l) message.obj;
            lVar2.getClass();
            lVar2.c();
            return;
        }
        int i5 = message.what;
        if (i5 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f3287a;
            aVar.f6052s = new E1.b(message.arg2);
            if (!aVar.f6053t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    com.google.android.gms.common.internal.a aVar2 = this.f3287a;
                    if (!aVar2.f6053t) {
                        aVar2.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f3287a;
            E1.b bVar = aVar3.f6052s;
            if (bVar == null) {
                bVar = new E1.b(8);
            }
            aVar3.f6042i.a(bVar);
            this.f3287a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i5 == 5) {
            com.google.android.gms.common.internal.a aVar4 = this.f3287a;
            E1.b bVar2 = aVar4.f6052s;
            if (bVar2 == null) {
                bVar2 = new E1.b(8);
            }
            aVar4.f6042i.a(bVar2);
            this.f3287a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i5 == 3) {
            Object obj = message.obj;
            this.f3287a.f6042i.a(new E1.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            this.f3287a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i5 == 6) {
            this.f3287a.v(5, null);
            C1294c c1294c = this.f3287a.f6047n;
            if (c1294c != null) {
                ((F1.c) c1294c.f11388d).a(message.arg2);
            }
            this.f3287a.getClass();
            System.currentTimeMillis();
            com.google.android.gms.common.internal.a.u(this.f3287a, 5, 1, null);
            return;
        }
        if (i5 == 2 && !this.f3287a.c()) {
            l lVar3 = (l) message.obj;
            lVar3.getClass();
            lVar3.c();
            return;
        }
        int i6 = message.what;
        if (i6 != 2 && i6 != 1 && i6 != 7) {
            Log.wtf("GmsClient", AbstractC0017m.g(i6, "Don't know how to handle message: "), new Exception());
            return;
        }
        l lVar4 = (l) message.obj;
        synchronized (lVar4) {
            try {
                bool = lVar4.f3277a;
                if (lVar4.f3278b) {
                    Log.w("GmsClient", "Callback proxy " + lVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = lVar4.f3282f;
            int i7 = lVar4.f3280d;
            if (i7 != 0) {
                aVar5.v(1, null);
                Bundle bundle = lVar4.f3281e;
                lVar4.a(new E1.b(i7, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!lVar4.b()) {
                aVar5.v(1, null);
                lVar4.a(new E1.b(8, null));
            }
        }
        synchronized (lVar4) {
            lVar4.f3278b = true;
        }
        lVar4.c();
    }
}
