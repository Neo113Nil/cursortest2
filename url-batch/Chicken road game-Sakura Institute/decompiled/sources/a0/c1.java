package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c1 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f30g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.a f31h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(q6.a aVar, int i7) {
        super(1);
        this.f30g = i7;
        this.f31h = aVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = this.f30g;
        q6.a aVar = this.f31h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new y0.c(((y0.c) aVar.a()).f9778a);
            default:
                y1.e eVar = new y1.e(((Number) aVar.a()).floatValue(), new w6.a(0.0f, 1.0f));
                x6.e[] eVarArr = y1.r.f9886a;
                y1.s sVar = y1.p.f9861c;
                x6.e eVar2 = y1.r.f9886a[1];
                sVar.a((y1.i) obj, eVar);
                return d6.z.f2639a;
        }
    }
}
