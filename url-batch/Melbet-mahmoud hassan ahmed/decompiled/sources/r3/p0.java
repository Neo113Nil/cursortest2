package r3;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import r3.c;

/* loaded from: classes.dex */
final class p0 extends b4.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f21313a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(c cVar, Looper looper) {
        super(looper);
        this.f21313a = cVar;
    }

    private static final void a(Message message) {
        q0 q0Var = (q0) message.obj;
        q0Var.a();
        q0Var.d();
    }

    private static final boolean b(Message message) {
        int i7 = message.what;
        return i7 == 2 || i7 == 1 || i7 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.a aVar;
        c.a aVar2;
        o3.b bVar;
        o3.b bVar2;
        boolean z6;
        if (this.f21313a.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i7 = message.what;
        if ((i7 == 1 || i7 == 7 || ((i7 == 4 && !this.f21313a.t()) || message.what == 5)) && !this.f21313a.k()) {
            a(message);
            return;
        }
        int i8 = message.what;
        if (i8 == 4) {
            this.f21313a.f21227z = new o3.b(message.arg2);
            if (c.Y(this.f21313a)) {
                z6 = this.f21313a.A;
                if (!z6) {
                    this.f21313a.h0(3, null);
                    return;
                }
            }
            bVar2 = this.f21313a.f21227z;
            o3.b bVar3 = bVar2 != null ? this.f21313a.f21227z : new o3.b(8);
            this.f21313a.f21217p.c(bVar3);
            this.f21313a.K(bVar3);
            return;
        }
        if (i8 == 5) {
            bVar = this.f21313a.f21227z;
            o3.b bVar4 = bVar != null ? this.f21313a.f21227z : new o3.b(8);
            this.f21313a.f21217p.c(bVar4);
            this.f21313a.K(bVar4);
            return;
        }
        if (i8 == 3) {
            Object obj = message.obj;
            o3.b bVar5 = new o3.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f21313a.f21217p.c(bVar5);
            this.f21313a.K(bVar5);
            return;
        }
        if (i8 == 6) {
            this.f21313a.h0(5, null);
            aVar = this.f21313a.f21222u;
            if (aVar != null) {
                aVar2 = this.f21313a.f21222u;
                aVar2.q0(message.arg2);
            }
            this.f21313a.L(message.arg2);
            c.d0(this.f21313a, 5, 1, null);
            return;
        }
        if (i8 == 2 && !this.f21313a.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((q0) message.obj).c();
            return;
        }
        int i9 = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i9);
        Log.wtf("GmsClient", sb.toString(), new Exception());
    }
}
