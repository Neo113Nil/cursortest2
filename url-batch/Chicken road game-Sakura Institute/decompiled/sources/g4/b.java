package g4;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements q6.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4252g;

    public /* synthetic */ b(int i7, Object obj) {
        this.f4251f = i7;
        this.f4252g = obj;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = this.f4251f;
        d6.z zVar = d6.z.f2639a;
        Object obj2 = this.f4252g;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t3.e0 e0Var = (t3.e0) obj;
                r6.k.f(e0Var, "$this$navigate");
                int i8 = t3.y.f8873s;
                e0Var.f8784d = t6.a.y(((t3.b0) obj2).f()).f8862k;
                n5.a aVar = new n5.a();
                aVar.f6555a = true;
                e0Var.f8785e = aVar.f6555a;
                e0Var.f8782b = true;
                e0Var.f8783c = true;
                return zVar;
            case 1:
                ((k7.c) obj2).e(null);
                return zVar;
            case 2:
                m7.f fVar = (m7.f) obj2;
                int intValue = ((Integer) obj).intValue();
                return fVar.f6454e[intValue] + ": " + fVar.f6455f[intValue].b();
            default:
                o7.p0 p0Var = (o7.p0) obj2;
                int intValue2 = ((Integer) obj).intValue();
                return p0Var.f6927e[intValue2] + ": " + p0Var.j(intValue2).b();
        }
    }

    public /* synthetic */ b(k7.c cVar, k7.b bVar) {
        this.f4251f = 1;
        this.f4252g = cVar;
    }
}
