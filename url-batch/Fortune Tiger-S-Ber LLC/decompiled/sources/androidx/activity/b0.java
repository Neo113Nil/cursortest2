package androidx.activity;

import java.util.ListIterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b0 extends u2.d implements t2.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f86f;
    public final /* synthetic */ h0 g;

    public /* synthetic */ b0(h0 h0Var, int i4) {
        this.f86f = i4;
        this.g = h0Var;
    }

    @Override // t2.l
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f86f) {
            case 0:
                u2.c.e((b) obj, "backEvent");
                h0 h0Var = this.g;
                n2.e eVar = h0Var.f108b;
                ListIterator listIterator = eVar.listIterator(eVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((androidx.fragment.app.c0) obj2).f410a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                androidx.fragment.app.c0 c0Var = (androidx.fragment.app.c0) obj2;
                if (h0Var.c != null) {
                    h0Var.b();
                }
                h0Var.c = c0Var;
                break;
            default:
                u2.c.e((b) obj, "backEvent");
                h0 h0Var2 = this.g;
                if (h0Var2.c == null) {
                    n2.e eVar2 = h0Var2.f108b;
                    ListIterator listIterator2 = eVar2.listIterator(eVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((androidx.fragment.app.c0) obj3).f410a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return m2.c.c;
    }
}
