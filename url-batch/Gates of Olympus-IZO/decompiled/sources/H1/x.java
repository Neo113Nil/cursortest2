package H1;

import L1.z;
import java.util.Set;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class x extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f1915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f1916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f1917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, l lVar, P1.d dVar) {
        super(2, dVar);
        this.f1916f = yVar;
        this.f1917g = lVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new x(this.f1916f, this.f1917g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((x) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f1915e;
        if (i3 == 0) {
            I2.l.Q(obj);
            y yVar = this.f1916f;
            Set set = ((v) yVar.f1919c.getValue()).f1912c;
            String str = ((k) this.f1917g).f1878a;
            boolean contains = set.contains(str);
            this.f1915e = 1;
            if (yVar.f1918b.toggleSaved(str, contains, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return z.f2729a;
    }
}
