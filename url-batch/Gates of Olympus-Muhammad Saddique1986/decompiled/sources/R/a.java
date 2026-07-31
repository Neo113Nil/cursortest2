package R;

import R1.y;
import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class a extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f3996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f3997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f3998g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3999h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4000i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object[] f4001j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, n nVar, k kVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f3996e = bVar;
        this.f3997f = nVar;
        this.f3998g = kVar;
        this.f3999h = str;
        this.f4000i = obj;
        this.f4001j = objArr;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        boolean z3;
        b bVar = this.f3996e;
        k kVar = bVar.f4003e;
        k kVar2 = this.f3998g;
        boolean z4 = true;
        if (kVar != kVar2) {
            bVar.f4003e = kVar2;
            z3 = true;
        } else {
            z3 = false;
        }
        String str = bVar.f4004f;
        String str2 = this.f3999h;
        if (f2.j.a(str, str2)) {
            z4 = z3;
        } else {
            bVar.f4004f = str2;
        }
        bVar.f4002d = this.f3997f;
        bVar.f4005g = this.f4000i;
        bVar.f4006h = this.f4001j;
        G1.m mVar = bVar.f4007i;
        if (mVar != null && z4) {
            mVar.A();
            bVar.f4007i = null;
            bVar.d();
        }
        return y.f4171a;
    }
}
