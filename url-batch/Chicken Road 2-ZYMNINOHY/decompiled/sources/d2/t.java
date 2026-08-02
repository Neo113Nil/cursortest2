package d2;

import E.AbstractC0005f;
import a2.C0162b;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import m2.HandlerC1312d;

/* loaded from: classes.dex */
public final class t extends HandlerC1312d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8301a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 1);
        this.f8301a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f8301a.v.get() != message.arg1) {
            int i4 = message.what;
            if (i4 == 2 || i4 == 1 || i4 == 7) {
                p pVar = (p) message.obj;
                pVar.getClass();
                pVar.c();
                return;
            }
            return;
        }
        int i5 = message.what;
        if ((i5 == 1 || i5 == 7 || i5 == 4 || i5 == 5) && !this.f8301a.c()) {
            p pVar2 = (p) message.obj;
            pVar2.getClass();
            pVar2.c();
            return;
        }
        int i6 = message.what;
        if (i6 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f8301a;
            aVar.f5794s = new C0162b(message.arg2);
            if (!aVar.f5795t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    com.google.android.gms.common.internal.a aVar2 = this.f8301a;
                    if (!aVar2.f5795t) {
                        aVar2.w(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f8301a;
            C0162b c0162b = aVar3.f5794s;
            if (c0162b == null) {
                c0162b = new C0162b(8);
            }
            aVar3.f5786i.a(c0162b);
            System.currentTimeMillis();
            return;
        }
        if (i6 == 5) {
            com.google.android.gms.common.internal.a aVar4 = this.f8301a;
            C0162b c0162b2 = aVar4.f5794s;
            if (c0162b2 == null) {
                c0162b2 = new C0162b(8);
            }
            aVar4.f5786i.a(c0162b2);
            System.currentTimeMillis();
            return;
        }
        if (i6 == 3) {
            Object obj = message.obj;
            this.f8301a.f5786i.a(new C0162b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i6 == 6) {
            this.f8301a.w(5, null);
            h hVar = this.f8301a.n;
            if (hVar != null) {
                ((b2.g) hVar.f8268a).a(message.arg2);
            }
            System.currentTimeMillis();
            com.google.android.gms.common.internal.a.v(this.f8301a, 5, 1, null);
            return;
        }
        if (i6 == 2 && !this.f8301a.g()) {
            p pVar3 = (p) message.obj;
            pVar3.getClass();
            pVar3.c();
            return;
        }
        int i7 = message.what;
        if (i7 != 2 && i7 != 1 && i7 != 7) {
            Log.wtf("GmsClient", AbstractC0005f.j(i7, "Don't know how to handle message: "), new Exception());
            return;
        }
        p pVar4 = (p) message.obj;
        synchronized (pVar4) {
            try {
                bool = pVar4.f8291a;
                if (pVar4.f8292b) {
                    Log.w("GmsClient", "Callback proxy " + pVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = pVar4.f8296f;
            int i8 = pVar4.f8294d;
            if (i8 != 0) {
                aVar5.w(1, null);
                Bundle bundle = pVar4.f8295e;
                pVar4.a(new C0162b(i8, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!pVar4.b()) {
                aVar5.w(1, null);
                pVar4.a(new C0162b(8, null));
            }
        }
        synchronized (pVar4) {
            pVar4.f8292b = true;
        }
        pVar4.c();
    }
}
