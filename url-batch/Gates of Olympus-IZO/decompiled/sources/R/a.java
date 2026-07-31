package R;

import D1.C0014b;
import L1.z;

/* loaded from: classes.dex */
public final class a extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f3123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f3124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f3125g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3126h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3127i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object[] f3128j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, n nVar, k kVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f3123e = bVar;
        this.f3124f = nVar;
        this.f3125g = kVar;
        this.f3126h = str;
        this.f3127i = obj;
        this.f3128j = objArr;
    }

    @Override // Y1.a
    public final Object b() {
        boolean z3;
        b bVar = this.f3123e;
        k kVar = bVar.f3130e;
        k kVar2 = this.f3125g;
        boolean z4 = true;
        if (kVar != kVar2) {
            bVar.f3130e = kVar2;
            z3 = true;
        } else {
            z3 = false;
        }
        String str = bVar.f3131f;
        String str2 = this.f3126h;
        if (Z1.i.a(str, str2)) {
            z4 = z3;
        } else {
            bVar.f3131f = str2;
        }
        bVar.f3129d = this.f3124f;
        bVar.f3132g = this.f3127i;
        bVar.f3133h = this.f3128j;
        C0014b c0014b = bVar.f3134i;
        if (c0014b != null && z4) {
            c0014b.z();
            bVar.f3134i = null;
            bVar.d();
        }
        return z.f2729a;
    }
}
