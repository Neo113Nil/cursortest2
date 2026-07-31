package androidx.lifecycle;

import k2.C0536h;
import k2.InterfaceC0550w;
import m1.C0622b;

/* loaded from: classes.dex */
public final class G extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Z1.t f3961e;

    /* renamed from: f, reason: collision with root package name */
    public Z1.t f3962f;

    /* renamed from: g, reason: collision with root package name */
    public int f3963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0238x f3964h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ EnumC0230o f3965i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0550w f3966j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0622b f3967k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0238x c0238x, EnumC0230o enumC0230o, InterfaceC0550w interfaceC0550w, C0622b c0622b, P1.d dVar) {
        super(2, dVar);
        this.f3964h = c0238x;
        this.f3965i = enumC0230o;
        this.f3966j = interfaceC0550w;
        this.f3967k = c0622b;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new G(this.f3964h, this.f3965i, this.f3966j, this.f3967k, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((G) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Z1.t tVar;
        Z1.t tVar2;
        EnumC0229n enumC0229n;
        EnumC0229n enumC0229n2;
        k2.X x3;
        InterfaceC0234t interfaceC0234t;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f3963g;
        L1.z zVar = L1.z.f2729a;
        C0238x c0238x = this.f3964h;
        if (i3 == 0) {
            I2.l.Q(obj);
            if (c0238x.f4041d == EnumC0230o.f4025d) {
                return zVar;
            }
            Z1.t tVar3 = new Z1.t();
            Z1.t tVar4 = new Z1.t();
            try {
                EnumC0230o enumC0230o = this.f3965i;
                InterfaceC0550w interfaceC0550w = this.f3966j;
                C0622b c0622b = this.f3967k;
                this.f3961e = tVar3;
                this.f3962f = tVar4;
                this.f3963g = 1;
                C0536h c0536h = new C0536h(1, M1.B.G(this));
                c0536h.q();
                EnumC0229n.Companion.getClass();
                Z1.i.f(enumC0230o, "state");
                int ordinal = enumC0230o.ordinal();
                if (ordinal == 2) {
                    enumC0229n = EnumC0229n.ON_CREATE;
                } else if (ordinal == 3) {
                    enumC0229n = EnumC0229n.ON_START;
                } else if (ordinal != 4) {
                    enumC0229n2 = null;
                    F f3 = new F(enumC0229n2, tVar3, interfaceC0550w, C0227l.a(enumC0230o), c0536h, s2.d.a(), c0622b);
                    tVar4.f3480d = f3;
                    c0238x.a(f3);
                    if (c0536h.p() != aVar) {
                        return aVar;
                    }
                    tVar = tVar3;
                    tVar2 = tVar4;
                } else {
                    enumC0229n = EnumC0229n.ON_RESUME;
                }
                enumC0229n2 = enumC0229n;
                F f32 = new F(enumC0229n2, tVar3, interfaceC0550w, C0227l.a(enumC0230o), c0536h, s2.d.a(), c0622b);
                tVar4.f3480d = f32;
                c0238x.a(f32);
                if (c0536h.p() != aVar) {
                }
            } catch (Throwable th) {
                th = th;
                tVar = tVar3;
                tVar2 = tVar4;
                x3 = (k2.X) tVar.f3480d;
                if (x3 != null) {
                    x3.a(null);
                }
                interfaceC0234t = (InterfaceC0234t) tVar2.f3480d;
                if (interfaceC0234t != null) {
                    c0238x.f(interfaceC0234t);
                }
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar2 = this.f3962f;
            tVar = this.f3961e;
            try {
                I2.l.Q(obj);
            } catch (Throwable th2) {
                th = th2;
                x3 = (k2.X) tVar.f3480d;
                if (x3 != null) {
                }
                interfaceC0234t = (InterfaceC0234t) tVar2.f3480d;
                if (interfaceC0234t != null) {
                }
                throw th;
            }
        }
        k2.X x4 = (k2.X) tVar.f3480d;
        if (x4 != null) {
            x4.a(null);
        }
        InterfaceC0234t interfaceC0234t2 = (InterfaceC0234t) tVar2.f3480d;
        if (interfaceC0234t2 != null) {
            c0238x.f(interfaceC0234t2);
        }
        return zVar;
    }
}
