package n;

import java.io.Serializable;
import k2.AbstractC0552y;
import k2.EnumC0551x;
import k2.InterfaceC0550w;
import n2.InterfaceC0701g;
import q.C0769d;
import q.C0770e;
import q.C0771f;
import t0.AbstractC0898f;

/* renamed from: n.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670z implements InterfaceC0701g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f6189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6191g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6192h;

    public /* synthetic */ C0670z(Serializable serializable, Object obj, Object obj2, Object obj3, int i3) {
        this.f6188d = i3;
        this.f6189e = serializable;
        this.f6190f = obj;
        this.f6191g = obj2;
        this.f6192h = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // n2.InterfaceC0701g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, P1.d dVar) {
        o2.l lVar;
        int i3;
        C0670z c0670z;
        switch (this.f6188d) {
            case 0:
                q.h hVar = (q.h) obj;
                boolean z3 = hVar instanceof q.l;
                Z1.r rVar = (Z1.r) this.f6191g;
                Z1.r rVar2 = (Z1.r) this.f6190f;
                Z1.r rVar3 = (Z1.r) this.f6189e;
                boolean z4 = true;
                if (z3) {
                    rVar3.f3478d++;
                } else if (hVar instanceof q.m) {
                    rVar3.f3478d--;
                } else if (hVar instanceof q.k) {
                    rVar3.f3478d--;
                } else if (hVar instanceof C0771f) {
                    rVar2.f3478d++;
                } else if (hVar instanceof q.g) {
                    rVar2.f3478d--;
                } else if (hVar instanceof C0769d) {
                    rVar.f3478d++;
                } else if (hVar instanceof C0770e) {
                    rVar.f3478d--;
                }
                boolean z5 = false;
                boolean z6 = rVar3.f3478d > 0;
                boolean z7 = rVar2.f3478d > 0;
                boolean z8 = rVar.f3478d > 0;
                C0631B c0631b = (C0631B) this.f6192h;
                if (c0631b.f5982r != z6) {
                    c0631b.f5982r = z6;
                    z5 = true;
                }
                if (c0631b.f5983s != z7) {
                    c0631b.f5983s = z7;
                    z5 = true;
                }
                if (c0631b.f5984t != z8) {
                    c0631b.f5984t = z8;
                } else {
                    z4 = z5;
                }
                if (z4) {
                    AbstractC0898f.m(c0631b);
                }
                return L1.z.f2729a;
            default:
                if (dVar instanceof o2.l) {
                    lVar = (o2.l) dVar;
                    int i4 = lVar.f6722h;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        lVar.f6722h = i4 - Integer.MIN_VALUE;
                        Object obj2 = lVar.f6720f;
                        Q1.a aVar = Q1.a.f3113d;
                        i3 = lVar.f6722h;
                        if (i3 != 0) {
                            I2.l.Q(obj2);
                            k2.X x3 = (k2.X) ((Z1.t) this.f6189e).f3480d;
                            if (x3 != null) {
                                x3.a(new I.W("Child of the scoped flow was cancelled", 5));
                                lVar.f6718d = this;
                                lVar.f6719e = obj;
                                lVar.f6722h = 1;
                                if (x3.h(lVar) == aVar) {
                                    return aVar;
                                }
                            }
                            c0670z = this;
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = lVar.f6719e;
                            c0670z = lVar.f6718d;
                            I2.l.Q(obj2);
                        }
                        ((Z1.t) c0670z.f6189e).f3480d = AbstractC0552y.q((InterfaceC0550w) c0670z.f6190f, null, EnumC0551x.f5398g, new o2.k((o2.n) c0670z.f6191g, (InterfaceC0701g) c0670z.f6192h, obj, null), 1);
                        return L1.z.f2729a;
                    }
                }
                lVar = new o2.l(this, dVar);
                Object obj22 = lVar.f6720f;
                Q1.a aVar2 = Q1.a.f3113d;
                i3 = lVar.f6722h;
                if (i3 != 0) {
                }
                ((Z1.t) c0670z.f6189e).f3480d = AbstractC0552y.q((InterfaceC0550w) c0670z.f6190f, null, EnumC0551x.f5398g, new o2.k((o2.n) c0670z.f6191g, (InterfaceC0701g) c0670z.f6192h, obj, null), 1);
                return L1.z.f2729a;
        }
    }
}
