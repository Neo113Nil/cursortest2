package m;

import I.C0143d;
import I.C0156j0;
import e2.InterfaceC0424c;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619d {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f6757a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6758b;

    /* renamed from: c, reason: collision with root package name */
    public final C0628m f6759c;

    /* renamed from: d, reason: collision with root package name */
    public final C0156j0 f6760d;

    /* renamed from: e, reason: collision with root package name */
    public final C0156j0 f6761e;

    /* renamed from: f, reason: collision with root package name */
    public final C0613I f6762f;

    /* renamed from: g, reason: collision with root package name */
    public final r f6763g;

    /* renamed from: h, reason: collision with root package name */
    public final r f6764h;

    /* renamed from: i, reason: collision with root package name */
    public final r f6765i;

    /* renamed from: j, reason: collision with root package name */
    public final r f6766j;

    public C0619d(Object obj, u0 u0Var, Object obj2) {
        this.f6757a = u0Var;
        this.f6758b = obj2;
        C0628m c0628m = new C0628m(u0Var, obj, null, 60);
        this.f6759c = c0628m;
        Boolean bool = Boolean.FALSE;
        I.W w2 = I.W.f2783i;
        this.f6760d = C0143d.K(bool, w2);
        this.f6761e = C0143d.K(obj, w2);
        this.f6762f = new C0613I();
        new W(obj2);
        r rVar = c0628m.f6850f;
        boolean z3 = rVar instanceof C0629n;
        r rVar2 = z3 ? AbstractC0620e.f6780e : rVar instanceof C0630o ? AbstractC0620e.f6781f : rVar instanceof C0631p ? AbstractC0620e.f6782g : AbstractC0620e.f6783h;
        this.f6763g = rVar2;
        r rVar3 = z3 ? AbstractC0620e.f6776a : rVar instanceof C0630o ? AbstractC0620e.f6777b : rVar instanceof C0631p ? AbstractC0620e.f6778c : AbstractC0620e.f6779d;
        this.f6764h = rVar3;
        this.f6765i = rVar2;
        this.f6766j = rVar3;
    }

    public static final Object a(C0619d c0619d, Object obj) {
        r rVar = c0619d.f6763g;
        r rVar2 = c0619d.f6765i;
        boolean a3 = f2.j.a(rVar2, rVar);
        r rVar3 = c0619d.f6766j;
        if (a3 && f2.j.a(rVar3, c0619d.f6764h)) {
            return obj;
        }
        u0 u0Var = c0619d.f6757a;
        r rVar4 = (r) u0Var.f6889a.n(obj);
        int b3 = rVar4.b();
        boolean z3 = false;
        for (int i3 = 0; i3 < b3; i3++) {
            if (rVar4.a(i3) < rVar2.a(i3) || rVar4.a(i3) > rVar3.a(i3)) {
                rVar4.e(O2.d.x(rVar4.a(i3), rVar2.a(i3), rVar3.a(i3)), i3);
                z3 = true;
            }
        }
        return z3 ? u0Var.f6890b.n(rVar4) : obj;
    }

    public static final void b(C0619d c0619d) {
        C0628m c0628m = c0619d.f6759c;
        c0628m.f6850f.d();
        c0628m.f6851g = Long.MIN_VALUE;
        c0619d.f6760d.setValue(Boolean.FALSE);
    }

    public static Object c(C0619d c0619d, Object obj, InterfaceC0627l interfaceC0627l, InterfaceC0424c interfaceC0424c, V1.d dVar, int i3) {
        Object n3 = c0619d.f6757a.f6890b.n(c0619d.f6759c.f6850f);
        InterfaceC0424c interfaceC0424c2 = (i3 & 8) != 0 ? null : interfaceC0424c;
        Object d3 = c0619d.d();
        u0 u0Var = c0619d.f6757a;
        return C0613I.a(c0619d.f6762f, new C0617b(c0619d, n3, new d0(interfaceC0627l, u0Var, d3, obj, (r) u0Var.f6889a.n(n3)), c0619d.f6759c.f6851g, interfaceC0424c2, null), dVar);
    }

    public final Object d() {
        return this.f6759c.f6849e.getValue();
    }

    public final Object e(V1.d dVar, Object obj) {
        Object a3 = C0613I.a(this.f6762f, new C0618c(this, obj, null), dVar);
        return a3 == W1.a.f4608d ? a3 : R1.y.f4171a;
    }

    public /* synthetic */ C0619d(Object obj, u0 u0Var, Object obj2, int i3) {
        this(obj, u0Var, (i3 & 4) != 0 ? null : obj2);
    }
}
