package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import x3.AbstractC1562w;

/* renamed from: K.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069s extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public C0054c f1409a;

    /* renamed from: b, reason: collision with root package name */
    public int f1410b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1411c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f1412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0069s(M m4, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1412d = m4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        C0069s c0069s = new C0069s(this.f1412d, interfaceC0425c);
        c0069s.f1411c = obj;
        return c0069s;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0069s) create((A3.e) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r3.emit(r12, r11) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if ((r1 instanceof K.X) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    @Override // h3.AbstractC0448a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        A3.e eVar;
        h0 h0Var;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1410b;
        C0297i c0297i = C0297i.f5732a;
        M m4 = this.f1412d;
        if (i4 == 0) {
            O3.l.w(obj);
            A3.e eVar2 = (A3.e) this.f1411c;
            this.f1411c = eVar2;
            this.f1410b = 1;
            Object n = AbstractC1562w.n(m4.f1275c.g(), new F(m4, null), this);
            if (n != enumC0441a) {
                eVar = eVar2;
                obj = n;
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O3.l.w(obj);
                return c0297i;
            }
            h0Var = this.f1409a;
            eVar = (A3.e) this.f1411c;
            O3.l.w(obj);
            A3.i iVar = new A3.i(new A3.t(new A3.k(new A3.k(new A3.k(new C0065n(m4, null), 0, (A3.v) m4.f1280h.f15398b), 2, new C0066o(2, null)), 1, new C0067p(h0Var, null))), new C0068q(m4, (h3.c) null));
            this.f1411c = null;
            this.f1409a = null;
            this.f1410b = 3;
            if (!(eVar instanceof A3.y)) {
                throw ((A3.y) eVar).f144a;
            }
            Object collect = iVar.collect(eVar, this);
            if (collect != enumC0441a) {
                collect = c0297i;
            }
            return collect == enumC0441a ? enumC0441a : c0297i;
        }
        A3.e eVar3 = (A3.e) this.f1411c;
        O3.l.w(obj);
        eVar = eVar3;
        h0Var = (h0) obj;
        if (h0Var instanceof C0054c) {
            Object obj2 = ((C0054c) h0Var).f1333b;
            this.f1411c = eVar;
            this.f1409a = (C0054c) h0Var;
            this.f1410b = 2;
        } else {
            if (h0Var instanceof i0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (h0Var instanceof Z) {
                throw ((Z) h0Var).f1325b;
            }
        }
        A3.i iVar2 = new A3.i(new A3.t(new A3.k(new A3.k(new A3.k(new C0065n(m4, null), 0, (A3.v) m4.f1280h.f15398b), 2, new C0066o(2, null)), 1, new C0067p(h0Var, null))), new C0068q(m4, (h3.c) null));
        this.f1411c = null;
        this.f1409a = null;
        this.f1410b = 3;
        if (!(eVar instanceof A3.y)) {
        }
    }
}
