package m;

import I.C0089d;
import I.C0102j0;
import e2.AbstractC0381e;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593d {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f5702a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5703b;

    /* renamed from: c, reason: collision with root package name */
    public final C0603m f5704c;

    /* renamed from: d, reason: collision with root package name */
    public final C0102j0 f5705d;

    /* renamed from: e, reason: collision with root package name */
    public final C0102j0 f5706e;

    /* renamed from: f, reason: collision with root package name */
    public final M f5707f;

    /* renamed from: g, reason: collision with root package name */
    public final r f5708g;

    /* renamed from: h, reason: collision with root package name */
    public final r f5709h;

    /* renamed from: i, reason: collision with root package name */
    public final r f5710i;

    /* renamed from: j, reason: collision with root package name */
    public final r f5711j;

    public C0593d(Object obj, y0 y0Var, Object obj2) {
        this.f5702a = y0Var;
        this.f5703b = obj2;
        C0603m c0603m = new C0603m(y0Var, obj, null, 60);
        this.f5704c = c0603m;
        Boolean bool = Boolean.FALSE;
        I.X x3 = I.X.f2228i;
        this.f5705d = C0089d.J(bool, x3);
        this.f5706e = C0089d.J(obj, x3);
        this.f5707f = new M();
        new C0590b0(1.0f, 1500.0f, obj2);
        r rVar = c0603m.f5804f;
        boolean z3 = rVar instanceof C0604n;
        r rVar2 = z3 ? AbstractC0595e.f5718e : rVar instanceof C0605o ? AbstractC0595e.f5719f : rVar instanceof C0606p ? AbstractC0595e.f5720g : AbstractC0595e.f5721h;
        this.f5708g = rVar2;
        r rVar3 = z3 ? AbstractC0595e.f5714a : rVar instanceof C0605o ? AbstractC0595e.f5715b : rVar instanceof C0606p ? AbstractC0595e.f5716c : AbstractC0595e.f5717d;
        this.f5709h = rVar3;
        this.f5710i = rVar2;
        this.f5711j = rVar3;
    }

    public static final Object a(C0593d c0593d, Object obj) {
        r rVar = c0593d.f5708g;
        r rVar2 = c0593d.f5710i;
        boolean a3 = Z1.i.a(rVar2, rVar);
        r rVar3 = c0593d.f5711j;
        if (a3 && Z1.i.a(rVar3, c0593d.f5709h)) {
            return obj;
        }
        y0 y0Var = c0593d.f5702a;
        r rVar4 = (r) y0Var.f5883a.j(obj);
        int b2 = rVar4.b();
        boolean z3 = false;
        for (int i3 = 0; i3 < b2; i3++) {
            if (rVar4.a(i3) < rVar2.a(i3) || rVar4.a(i3) > rVar3.a(i3)) {
                rVar4.e(AbstractC0381e.q(rVar4.a(i3), rVar2.a(i3), rVar3.a(i3)), i3);
                z3 = true;
            }
        }
        return z3 ? y0Var.f5884b.j(rVar4) : obj;
    }

    public static final void b(C0593d c0593d) {
        C0603m c0603m = c0593d.f5704c;
        c0603m.f5804f.d();
        c0603m.f5805g = Long.MIN_VALUE;
        c0593d.f5705d.setValue(Boolean.FALSE);
    }

    public static Object c(C0593d c0593d, Object obj, InterfaceC0602l interfaceC0602l, R1.i iVar) {
        Object j3 = c0593d.f5702a.f5884b.j(c0593d.f5704c.f5804f);
        Object d3 = c0593d.d();
        y0 y0Var = c0593d.f5702a;
        return M.a(c0593d.f5707f, new C0589b(c0593d, j3, new j0(interfaceC0602l, y0Var, d3, obj, (r) y0Var.f5883a.j(j3)), c0593d.f5704c.f5805g, null, null), iVar);
    }

    public final Object d() {
        return this.f5704c.f5803e.getValue();
    }

    public final Object e(Object obj, R1.i iVar) {
        Object a3 = M.a(this.f5707f, new C0591c(this, obj, null), iVar);
        return a3 == Q1.a.f3113d ? a3 : L1.z.f2729a;
    }

    public /* synthetic */ C0593d(Object obj, y0 y0Var, Float f3, int i3) {
        this(obj, y0Var, (i3 & 4) != 0 ? null : f3);
    }
}
