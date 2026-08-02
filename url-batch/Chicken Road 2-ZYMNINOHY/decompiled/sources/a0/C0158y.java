package a0;

import T.C0096n;
import T.C0097o;
import W.InterfaceC0118k;
import b0.C0255a;

/* renamed from: a0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0158y implements InterfaceC0118k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4253a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T.e0 f4254b;

    public /* synthetic */ C0158y(T.e0 e0Var) {
        this.f4254b = e0Var;
    }

    @Override // W.InterfaceC0118k
    public final void invoke(Object obj) {
        switch (this.f4253a) {
            case 0:
                ((T.L) obj).onVideoSizeChanged(this.f4254b);
                break;
            default:
                b0.h hVar = (b0.h) obj;
                L3.h hVar2 = hVar.f5309p;
                T.e0 e0Var = this.f4254b;
                if (hVar2 != null) {
                    C0097o c0097o = (C0097o) hVar2.f1682d;
                    if (c0097o.v == -1) {
                        C0096n a3 = c0097o.a();
                        a3.f2836t = e0Var.f2776a;
                        a3.f2837u = e0Var.f2777b;
                        hVar.f5309p = new L3.h(new C0097o(a3), hVar2.f1680b, (String) hVar2.f1681c, 1);
                    }
                }
                int i4 = e0Var.f2776a;
                break;
        }
    }

    public /* synthetic */ C0158y(C0255a c0255a, T.e0 e0Var) {
        this.f4254b = e0Var;
    }
}
