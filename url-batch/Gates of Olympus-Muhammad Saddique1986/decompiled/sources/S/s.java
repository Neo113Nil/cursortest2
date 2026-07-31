package S;

import e2.InterfaceC0424c;
import java.util.Collection;
import java.util.List;
import s.C0932a;
import s.C0951t;
import t.AbstractC0972B;
import t.C0971A;
import t.J;

/* loaded from: classes.dex */
public final class s extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4256g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i3, int i4, Object obj) {
        super(1);
        this.f4254e = i4;
        this.f4256g = obj;
        this.f4255f = i3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f4254e) {
            case 0:
                return Boolean.valueOf(((List) obj).addAll(this.f4255f, (Collection) this.f4256g));
            case 1:
                Boolean C = Z.d.C((Z.t) obj, this.f4255f);
                ((f2.u) this.f4256g).f5832d = C;
                return Boolean.valueOf(C != null ? C.booleanValue() : false);
            default:
                t.y yVar = (t.y) obj;
                C0932a c0932a = ((C0951t) this.f4256g).f8317a;
                i c2 = u.c();
                u.f(c2, u.d(c2), c2 != null ? c2.f() : null);
                for (int i3 = 0; i3 < c0932a.f8209a; i3++) {
                    int i4 = this.f4255f + i3;
                    yVar.getClass();
                    long j3 = AbstractC0972B.f8422a;
                    C0971A c0971a = yVar.f8525b;
                    G1.m mVar = c0971a.f8421c;
                    if (mVar != null) {
                        yVar.f8524a.add(new J(mVar, i4, j3, c0971a.f8420b));
                    }
                }
                return R1.y.f4171a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i3, Collection collection) {
        super(1);
        this.f4254e = 0;
        this.f4255f = i3;
        this.f4256g = collection;
    }
}
