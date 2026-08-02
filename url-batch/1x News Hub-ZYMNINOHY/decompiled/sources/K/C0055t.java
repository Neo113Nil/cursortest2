package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f0.C0322a;
import t2.AbstractC1212w;

/* renamed from: K.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055t extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public C0039c f812e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f813g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N f814h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055t(N n3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f814h = n3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        C0055t c0055t = new C0055t(this.f814h, interfaceC0300c);
        c0055t.f813g = obj;
        return c0055t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r4.a(r12, r11) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if ((r1 instanceof K.Z) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    @Override // f2.AbstractC0324a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        w2.e eVar;
        i0 i0Var;
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f;
        C0195i c0195i = C0195i.f2555a;
        N n3 = this.f814h;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            w2.e eVar2 = (w2.e) this.f813g;
            this.f813g = eVar2;
            this.f = 1;
            Object o = AbstractC1212w.o(n3.f697c.e(), new H(n3, null), this);
            if (o != enumC0317a) {
                eVar = eVar2;
                obj = o;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.a.T(obj);
                return c0195i;
            }
            i0Var = this.f812e;
            eVar = (w2.e) this.f813g;
            android.support.v4.media.session.a.T(obj);
            w2.i iVar = new w2.i(new C0.e(7, new C0322a(new C0322a(new C0322a(new C0050n(n3, null), 17, (w2.p) n3.f701h.f2532b), 19, new C0051o(2, null)), 18, new C0052p(i0Var, null))), new C0053q(n3, (InterfaceC0300c) null));
            this.f813g = null;
            this.f812e = null;
            this.f = 3;
            if (!(eVar instanceof w2.s)) {
                throw ((w2.s) eVar).f10691a;
            }
            Object n4 = iVar.n(eVar, this);
            if (n4 != enumC0317a) {
                n4 = c0195i;
            }
            return n4 == enumC0317a ? enumC0317a : c0195i;
        }
        w2.e eVar3 = (w2.e) this.f813g;
        android.support.v4.media.session.a.T(obj);
        eVar = eVar3;
        i0Var = (i0) obj;
        if (i0Var instanceof C0039c) {
            Object obj2 = ((C0039c) i0Var).f744b;
            this.f813g = eVar;
            this.f812e = (C0039c) i0Var;
            this.f = 2;
        } else {
            if (i0Var instanceof j0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (i0Var instanceof b0) {
                throw ((b0) i0Var).f743b;
            }
        }
        w2.i iVar2 = new w2.i(new C0.e(7, new C0322a(new C0322a(new C0322a(new C0050n(n3, null), 17, (w2.p) n3.f701h.f2532b), 19, new C0051o(2, null)), 18, new C0052p(i0Var, null))), new C0053q(n3, (InterfaceC0300c) null));
        this.f813g = null;
        this.f812e = null;
        this.f = 3;
        if (!(eVar instanceof w2.s)) {
        }
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0055t) b((InterfaceC0300c) obj2, (w2.e) obj)).g(C0195i.f2555a);
    }
}
