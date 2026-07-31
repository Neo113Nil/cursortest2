package n2;

import k2.InterfaceC0550w;
import m2.EnumC0626a;
import o2.AbstractC0753b;

/* renamed from: n2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717w extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0689N f6398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0700f f6399g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0753b f6400h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6401i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0717w(C0689N c0689n, InterfaceC0700f interfaceC0700f, InterfaceC0718x interfaceC0718x, Object obj, P1.d dVar) {
        super(2, dVar);
        this.f6398f = c0689n;
        this.f6399g = interfaceC0700f;
        this.f6400h = (AbstractC0753b) interfaceC0718x;
        this.f6401i = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [n2.x, o2.b] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0717w(this.f6398f, this.f6399g, this.f6400h, this.f6401i, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0717w) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v0, types: [n2.g, n2.x, o2.b] */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6397e;
        L1.z zVar = L1.z.f2729a;
        InterfaceC0700f interfaceC0700f = this.f6399g;
        ?? r6 = this.f6400h;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    I2.l.Q(obj);
                    this.f6397e = 3;
                    return interfaceC0700f.collect(r6, this) != aVar ? aVar : zVar;
                }
                if (i3 != 3 && i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            I2.l.Q(obj);
        }
        I2.l.Q(obj);
        C0686K c0686k = C0685J.f6302a;
        C0689N c0689n = this.f6398f;
        if (c0689n == c0686k) {
            this.f6397e = 1;
            if (interfaceC0700f.collect(r6, this) == aVar) {
                return aVar;
            }
        } else if (c0689n == C0685J.f6303b) {
            o2.y h3 = r6.h();
            C0715u c0715u = new C0715u(2, null);
            this.f6397e = 2;
            if (AbstractC0682G.j(h3, c0715u, this) == aVar) {
                return aVar;
            }
            this.f6397e = 3;
            if (interfaceC0700f.collect(r6, this) != aVar) {
            }
        } else {
            o2.y h4 = r6.h();
            C0687L c0687l = new C0687L(c0689n, null);
            int i4 = AbstractC0711q.f6376a;
            P1.j jVar = P1.j.f3073d;
            EnumC0626a enumC0626a = EnumC0626a.f5929d;
            InterfaceC0700f g3 = AbstractC0682G.g(AbstractC0682G.g(new G.d(new o2.n(c0687l, h4, jVar, -2, enumC0626a), 2, new C0688M(2, null))));
            C0716v c0716v = new C0716v(interfaceC0700f, r6, this.f6401i, null);
            this.f6397e = 4;
            Object collect = AbstractC0682G.e(new o2.n(new C0710p(c0716v, null), g3, jVar, -2, enumC0626a), 0).collect(o2.r.f6731d, this);
            if (collect != aVar) {
                collect = zVar;
            }
            if (collect != aVar) {
                collect = zVar;
            }
            if (collect == aVar) {
                return aVar;
            }
        }
    }
}
