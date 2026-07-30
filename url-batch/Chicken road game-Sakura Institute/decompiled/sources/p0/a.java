package p0;

import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f6980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f6981h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f6982i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f6983j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6984k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object[] f6985l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, l lVar, i iVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f6980g = bVar;
        this.f6981h = lVar;
        this.f6982i = iVar;
        this.f6983j = str;
        this.f6984k = obj;
        this.f6985l = objArr;
    }

    @Override // q6.a
    public final Object a() {
        boolean z8;
        b bVar = this.f6980g;
        i iVar = bVar.f6987g;
        i iVar2 = this.f6982i;
        boolean z9 = true;
        if (iVar != iVar2) {
            bVar.f6987g = iVar2;
            z8 = true;
        } else {
            z8 = false;
        }
        String str = bVar.f6988h;
        String str2 = this.f6983j;
        if (r6.k.a(str, str2)) {
            z9 = z8;
        } else {
            bVar.f6988h = str2;
        }
        bVar.f6986f = this.f6981h;
        bVar.f6989i = this.f6984k;
        bVar.f6990j = this.f6985l;
        b1.b bVar2 = bVar.f6991k;
        if (bVar2 != null && z9) {
            bVar2.E();
            bVar.f6991k = null;
            bVar.d();
        }
        return z.f2639a;
    }
}
