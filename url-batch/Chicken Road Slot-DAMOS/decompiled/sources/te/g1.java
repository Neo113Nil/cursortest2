package te;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g1 extends q {

    /* renamed from: b, reason: collision with root package name */
    public final f1 f9380b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(pe.a aVar) {
        super(aVar);
        aVar.getClass();
        this.f9380b = new f1(aVar.d());
    }

    @Override // te.q, pe.a
    public final void a(e3.o oVar, Object obj) {
        int h10 = h(obj);
        this.f9380b.getClass();
        o(oVar, obj, h10);
    }

    @Override // te.a, pe.a
    public final Object b(y6.l lVar) {
        return i(lVar);
    }

    @Override // pe.a
    public final re.e d() {
        return this.f9380b;
    }

    @Override // te.a
    public final Object e() {
        return (e1) k(n());
    }

    @Override // te.a
    public final int f(Object obj) {
        e1 e1Var = (e1) obj;
        e1Var.getClass();
        return e1Var.d();
    }

    @Override // te.a
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // te.a
    public final Object l(Object obj) {
        e1 e1Var = (e1) obj;
        e1Var.getClass();
        return e1Var.a();
    }

    @Override // te.q
    public final void m(int i3, Object obj, Object obj2) {
        ((e1) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(e3.o oVar, Object obj, int i3);
}
