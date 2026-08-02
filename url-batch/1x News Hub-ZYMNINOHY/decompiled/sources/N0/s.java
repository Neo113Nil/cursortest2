package N0;

import E1.AbstractC0033i;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class s extends W0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1058a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 1);
        this.f1058a = aVar;
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
        if (this.f1058a.v.get() != message.arg1) {
            int i3 = message.what;
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                o oVar = (o) message.obj;
                oVar.getClass();
                oVar.c();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 != 1 && i4 != 7) {
            if (i4 == 4) {
                this.f1058a.getClass();
            }
        }
        if (!this.f1058a.h()) {
            o oVar2 = (o) message.obj;
            oVar2.getClass();
            oVar2.c();
            return;
        }
        int i5 = message.what;
        if (i5 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f1058a;
            aVar.f2698s = new K0.b(message.arg2);
            if (!aVar.f2699t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    com.google.android.gms.common.internal.a aVar2 = this.f1058a;
                    if (!aVar2.f2699t) {
                        aVar2.w(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f1058a;
            K0.b bVar = aVar3.f2698s;
            if (bVar == null) {
                bVar = new K0.b(8);
            }
            aVar3.f2689i.a(bVar);
            this.f1058a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i5 == 5) {
            com.google.android.gms.common.internal.a aVar4 = this.f1058a;
            K0.b bVar2 = aVar4.f2698s;
            if (bVar2 == null) {
                bVar2 = new K0.b(8);
            }
            aVar4.f2689i.a(bVar2);
            this.f1058a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i5 == 3) {
            Object obj = message.obj;
            this.f1058a.f2689i.a(new K0.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            this.f1058a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i5 == 6) {
            this.f1058a.w(5, null);
            g gVar = this.f1058a.f2694n;
            if (gVar != null) {
                ((L0.g) gVar.f1026a).a(message.arg2);
            }
            this.f1058a.getClass();
            System.currentTimeMillis();
            com.google.android.gms.common.internal.a.v(this.f1058a, 5, 1, null);
            return;
        }
        if (i5 == 2 && !this.f1058a.a()) {
            o oVar3 = (o) message.obj;
            oVar3.getClass();
            oVar3.c();
            return;
        }
        int i6 = message.what;
        if (i6 != 2 && i6 != 1 && i6 != 7) {
            Log.wtf("GmsClient", AbstractC0033i.h(i6, "Don't know how to handle message: "), new Exception());
            return;
        }
        o oVar4 = (o) message.obj;
        synchronized (oVar4) {
            try {
                bool = oVar4.f1049a;
                if (oVar4.f1050b) {
                    Log.w("GmsClient", "Callback proxy " + oVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = oVar4.f;
            int i7 = oVar4.f1052d;
            if (i7 != 0) {
                aVar5.w(1, null);
                Bundle bundle = oVar4.f1053e;
                oVar4.a(new K0.b(i7, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!oVar4.b()) {
                aVar5.w(1, null);
                oVar4.a(new K0.b(8, null));
            }
        }
        synchronized (oVar4) {
            oVar4.f1050b = true;
        }
        oVar4.c();
    }
}
