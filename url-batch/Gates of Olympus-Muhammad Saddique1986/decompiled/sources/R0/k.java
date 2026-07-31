package R0;

import android.os.Handler;
import android.os.Looper;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import r0.InterfaceC0919p;

/* loaded from: classes.dex */
public final class k extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A f4098f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(A a3, int i3) {
        super(1);
        this.f4097e = i3;
        this.f4098f = a3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f4097e) {
            case 0:
                InterfaceC0919p v3 = ((InterfaceC0919p) obj).v();
                f2.j.c(v3);
                this.f4098f.k(v3);
                break;
            case 1:
                O0.j jVar = new O0.j(((O0.j) obj).f3740a);
                A a3 = this.f4098f;
                a3.m1setPopupContentSizefhxjrPA(jVar);
                a3.l();
                break;
            default:
                InterfaceC0422a interfaceC0422a = (InterfaceC0422a) obj;
                A a4 = this.f4098f;
                Handler handler = a4.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC0422a.b();
                } else {
                    Handler handler2 = a4.getHandler();
                    if (handler2 != null) {
                        handler2.post(new y(interfaceC0422a, 0));
                    }
                }
                break;
        }
        return R1.y.f4171a;
    }
}
