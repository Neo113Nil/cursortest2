package l;

import G.C0192d;
import G.C0205j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778d {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f7698a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7699b;

    /* renamed from: c, reason: collision with root package name */
    public final C0788n f7700c;

    /* renamed from: d, reason: collision with root package name */
    public final C0205j0 f7701d;

    /* renamed from: e, reason: collision with root package name */
    public final C0205j0 f7702e;

    /* renamed from: f, reason: collision with root package name */
    public final C0764I f7703f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0792s f7704g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0792s f7705h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0792s f7706i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0792s f7707j;

    public C0778d(Object obj, v0 v0Var, Object obj2) {
        this.f7698a = v0Var;
        this.f7699b = obj2;
        C0788n c0788n = new C0788n(v0Var, obj, null, 60);
        this.f7700c = c0788n;
        Boolean bool = Boolean.FALSE;
        G.W w4 = G.W.f2779l;
        this.f7701d = C0192d.K(bool, w4);
        this.f7702e = C0192d.K(obj, w4);
        this.f7703f = new C0764I();
        new X(obj2);
        AbstractC0792s abstractC0792s = c0788n.f7814i;
        boolean z4 = abstractC0792s instanceof C0789o;
        AbstractC0792s abstractC0792s2 = z4 ? AbstractC0779e.f7733e : abstractC0792s instanceof C0790p ? AbstractC0779e.f7734f : abstractC0792s instanceof C0791q ? AbstractC0779e.f7735g : AbstractC0779e.f7736h;
        this.f7704g = abstractC0792s2;
        AbstractC0792s abstractC0792s3 = z4 ? AbstractC0779e.f7729a : abstractC0792s instanceof C0790p ? AbstractC0779e.f7730b : abstractC0792s instanceof C0791q ? AbstractC0779e.f7731c : AbstractC0779e.f7732d;
        this.f7705h = abstractC0792s3;
        this.f7706i = abstractC0792s2;
        this.f7707j = abstractC0792s3;
    }

    public static final Object a(C0778d c0778d, Object obj) {
        AbstractC0792s abstractC0792s = c0778d.f7704g;
        AbstractC0792s abstractC0792s2 = c0778d.f7706i;
        boolean a4 = Intrinsics.a(abstractC0792s2, abstractC0792s);
        AbstractC0792s abstractC0792s3 = c0778d.f7707j;
        if (a4 && Intrinsics.a(abstractC0792s3, c0778d.f7705h)) {
            return obj;
        }
        v0 v0Var = c0778d.f7698a;
        AbstractC0792s abstractC0792s4 = (AbstractC0792s) v0Var.f7853a.invoke(obj);
        int b4 = abstractC0792s4.b();
        boolean z4 = false;
        for (int i2 = 0; i2 < b4; i2++) {
            if (abstractC0792s4.a(i2) < abstractC0792s2.a(i2) || abstractC0792s4.a(i2) > abstractC0792s3.a(i2)) {
                abstractC0792s4.e(kotlin.ranges.b.d(abstractC0792s4.a(i2), abstractC0792s2.a(i2), abstractC0792s3.a(i2)), i2);
                z4 = true;
            }
        }
        return z4 ? v0Var.f7854b.invoke(abstractC0792s4) : obj;
    }

    public static final void b(C0778d c0778d) {
        C0788n c0788n = c0778d.f7700c;
        c0788n.f7814i.d();
        c0788n.f7815j = Long.MIN_VALUE;
        c0778d.f7701d.setValue(Boolean.FALSE);
    }

    public static Object c(C0778d c0778d, Object obj, InterfaceC0787m interfaceC0787m, Function1 function1, C2.a aVar, int i2) {
        Object invoke = c0778d.f7698a.f7854b.invoke(c0778d.f7700c.f7814i);
        Function1 function12 = (i2 & 8) != 0 ? null : function1;
        Object d4 = c0778d.d();
        v0 v0Var = c0778d.f7698a;
        return C0764I.a(c0778d.f7703f, new C0774b(c0778d, invoke, new e0(interfaceC0787m, v0Var, d4, obj, (AbstractC0792s) v0Var.f7853a.invoke(invoke)), c0778d.f7700c.f7815j, function12, null), aVar);
    }

    public final Object d() {
        return this.f7700c.f7813e.getValue();
    }

    public final Object e(C2.a aVar, Object obj) {
        Object a4 = C0764I.a(this.f7703f, new C0776c(this, obj, null), aVar);
        return a4 == D2.a.f2163d ? a4 : Unit.f7487a;
    }

    public /* synthetic */ C0778d(Object obj, v0 v0Var, Object obj2, int i2) {
        this(obj, v0Var, (i2 & 4) != 0 ? null : obj2);
    }
}
