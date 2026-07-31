package F;

import e2.InterfaceC0424c;
import r0.AbstractC0892N;
import r0.AbstractC0893O;

/* loaded from: classes.dex */
public final class M0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1266g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1267h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1268i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1269j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1270k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1271l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1272m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(AbstractC0893O abstractC0893O, AbstractC0893O abstractC0893O2, int i3, int i4, AbstractC0893O abstractC0893O3, int i5, int i6, int i7, int i8) {
        super(1);
        this.f1264e = abstractC0893O;
        this.f1265f = abstractC0893O2;
        this.f1266g = i3;
        this.f1267h = i4;
        this.f1268i = abstractC0893O3;
        this.f1269j = i5;
        this.f1270k = i6;
        this.f1271l = i7;
        this.f1272m = i8;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
        AbstractC0893O abstractC0893O = this.f1264e;
        if (abstractC0893O != null) {
            AbstractC0892N.f(abstractC0892N, abstractC0893O, (this.f1271l - abstractC0893O.f8126d) / 2, (this.f1272m - abstractC0893O.f8127e) / 2);
        }
        AbstractC0892N.f(abstractC0892N, this.f1265f, this.f1266g, this.f1267h);
        AbstractC0892N.f(abstractC0892N, this.f1268i, this.f1269j, this.f1270k);
        return R1.y.f4171a;
    }
}
