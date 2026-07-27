package W;

import Z.A;
import c0.C0531b;
import i.w;
import n.AbstractC0864b;
import z2.C1436t;

/* loaded from: classes.dex */
public final class i implements A {

    /* renamed from: a, reason: collision with root package name */
    public w f4205a;

    /* renamed from: b, reason: collision with root package name */
    public A f4206b;

    @Override // Z.A
    public final void a(C0531b c0531b) {
        A a4 = this.f4206b;
        if (a4 != null) {
            a4.a(c0531b);
        }
    }

    @Override // Z.A
    public final C0531b b() {
        A a4 = this.f4206b;
        if (a4 == null) {
            AbstractC0864b.D("GraphicsContext not provided");
            throw null;
        }
        C0531b b4 = a4.b();
        w wVar = this.f4205a;
        if (wVar == null) {
            w wVar2 = new w(1);
            wVar2.a(b4);
            this.f4205a = wVar2;
        } else {
            wVar.a(b4);
        }
        return b4;
    }

    public final void c() {
        w wVar = this.f4205a;
        if (wVar != null) {
            Object[] objArr = wVar.f6974a;
            int i2 = wVar.f6975b;
            for (int i4 = 0; i4 < i2; i4++) {
                a((C0531b) objArr[i4]);
            }
            C1436t.k(wVar.f6974a, 0, wVar.f6975b);
            wVar.f6975b = 0;
        }
    }
}
