package n;

import I.C0143d;
import I.C0167p;
import b0.C0344m;
import e2.InterfaceC0426e;
import g0.AbstractC0437b;
import r0.C0888J;

/* loaded from: classes.dex */
public final class S extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0437b f7068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.q f7069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.d f7070g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0888J f7071h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f7072i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0344m f7073j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7074k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(float f3, int i3, U.d dVar, U.q qVar, C0344m c0344m, AbstractC0437b abstractC0437b, C0888J c0888j) {
        super(2);
        this.f7068e = abstractC0437b;
        this.f7069f = qVar;
        this.f7070g = dVar;
        this.f7071h = c0888j;
        this.f7072i = f3;
        this.f7073j = c0344m;
        this.f7074k = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f7074k | 1);
        U.d dVar = this.f7070g;
        C0888J c0888j = this.f7071h;
        T.a(this.f7068e, this.f7069f, dVar, c0888j, this.f7072i, this.f7073j, (C0167p) obj, U3);
        return R1.y.f4171a;
    }
}
