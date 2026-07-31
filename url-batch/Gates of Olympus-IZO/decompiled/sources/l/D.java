package l;

import m.C0590b0;
import m.m0;

/* loaded from: classes.dex */
public final class D extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E f5423f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(E e3, int i3) {
        super(1);
        this.f5422e = i3;
        this.f5423f = e3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f5422e) {
            case 0:
                m0 m0Var = (m0) obj;
                x xVar = x.f5514d;
                x xVar2 = x.f5515e;
                boolean a3 = m0Var.a(xVar, xVar2);
                C0590b0 c0590b0 = null;
                E e3 = this.f5423f;
                if (a3) {
                    F f3 = e3.f5425r;
                } else if (m0Var.a(xVar2, x.f5516f)) {
                    O o3 = e3.f5426s.f5435a;
                } else {
                    c0590b0 = AbstractC0555B.f5416d;
                }
                return c0590b0 == null ? AbstractC0555B.f5416d : c0590b0;
            default:
                m0 m0Var2 = (m0) obj;
                x xVar3 = x.f5514d;
                x xVar4 = x.f5515e;
                boolean a4 = m0Var2.a(xVar3, xVar4);
                E e4 = this.f5423f;
                if (a4) {
                    F f4 = e4.f5425r;
                    return AbstractC0555B.f5415c;
                }
                if (!m0Var2.a(xVar4, x.f5516f)) {
                    return AbstractC0555B.f5415c;
                }
                O o4 = e4.f5426s.f5435a;
                return AbstractC0555B.f5415c;
        }
    }
}
