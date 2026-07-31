package r;

import java.util.List;

/* renamed from: r.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820q extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0.H[] f7085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f7086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t0.O f7087g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z1.r f7088h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z1.r f7089i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f7090j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0820q(r0.H[] hArr, List list, t0.O o3, Z1.r rVar, Z1.r rVar2, r rVar3) {
        super(1);
        this.f7085e = hArr;
        this.f7086f = list;
        this.f7087g = o3;
        this.f7088h = rVar;
        this.f7089i = rVar2;
        this.f7090j = rVar3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        r0.G g3 = (r0.G) obj;
        r0.H[] hArr = this.f7085e;
        int length = hArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            r0.H h3 = hArr[i4];
            Z1.i.d(h3, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            AbstractC0818o.b(g3, h3, (r0.z) this.f7086f.get(i3), this.f7087g.getLayoutDirection(), this.f7088h.f3478d, this.f7089i.f3478d, this.f7090j.f7091a);
            i4++;
            i3++;
        }
        return L1.z.f2729a;
    }
}
