package F;

import I.C0113p;
import r.C0797I;

/* loaded from: classes.dex */
public final class G extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J0 f936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f938g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Q.a f939h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.C f940i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y1.e f941j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y1.e f942k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f943l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0797I f944m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J0 j02, boolean z3, boolean z4, Q.a aVar, B0.C c3, Y1.e eVar, Y1.e eVar2, float f3, C0797I c0797i) {
        super(2);
        this.f936e = j02;
        this.f937f = z3;
        this.f938g = z4;
        this.f939h = aVar;
        this.f940i = c3;
        this.f941j = eVar;
        this.f942k = eVar2;
        this.f943l = f3;
        this.f944m = c0797i;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            J0 j02 = this.f936e;
            boolean z3 = this.f937f;
            boolean z4 = this.f938g;
            I.c(this.f939h, this.f940i, !z3 ? j02.f1022f : !z4 ? j02.f1018b : j02.f1027k, this.f941j, this.f942k, !z3 ? j02.f1023g : !z4 ? j02.f1019c : j02.f1028l, !z3 ? j02.f1024h : !z4 ? j02.f1020d : j02.f1029m, this.f943l, this.f944m, c0113p, 0);
        }
        return L1.z.f2729a;
    }
}
