package a1;

import C3.u;
import X0.G;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class p extends S0.s {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f4335w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ S0.s f4336x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c1.b f4337y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, S0.s sVar, c1.b bVar) {
        super(13);
        this.f4335w = uVar;
        this.f4336x = sVar;
        this.f4337y = bVar;
    }

    @Override // S0.s
    public final Object g(u uVar) {
        float f6 = uVar.f474a;
        float f9 = uVar.f475b;
        String str = ((c1.b) uVar.f479f).f5657a;
        String str2 = ((c1.b) uVar.f480g).f5657a;
        float f10 = uVar.f476c;
        float f11 = uVar.f477d;
        float f12 = uVar.f478e;
        u uVar2 = this.f4335w;
        uVar2.f474a = f6;
        uVar2.f475b = f9;
        uVar2.f479f = str;
        uVar2.f480g = str2;
        uVar2.f476c = f10;
        uVar2.f477d = f11;
        uVar2.f478e = f12;
        String str3 = (String) ((G) this.f4336x.f2953v);
        c1.b bVar = (c1.b) (uVar.f477d == 1.0f ? uVar.f480g : uVar.f479f);
        String str4 = bVar.f5658b;
        float f13 = bVar.f5659c;
        int i = bVar.f5660d;
        int i4 = bVar.f5661e;
        float f14 = bVar.f5662f;
        float f15 = bVar.f5663g;
        int i9 = bVar.f5664h;
        int i10 = bVar.i;
        float f16 = bVar.f5665j;
        boolean z8 = bVar.f5666k;
        PointF pointF = bVar.f5667l;
        PointF pointF2 = bVar.f5668m;
        c1.b bVar2 = this.f4337y;
        bVar2.f5657a = str3;
        bVar2.f5658b = str4;
        bVar2.f5659c = f13;
        bVar2.f5660d = i;
        bVar2.f5661e = i4;
        bVar2.f5662f = f14;
        bVar2.f5663g = f15;
        bVar2.f5664h = i9;
        bVar2.i = i10;
        bVar2.f5665j = f16;
        bVar2.f5666k = z8;
        bVar2.f5667l = pointF;
        bVar2.f5668m = pointF2;
        return bVar2;
    }
}
