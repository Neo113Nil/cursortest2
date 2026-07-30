package d0;

import android.graphics.Matrix;
import android.graphics.Path;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t1 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2399h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2400i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2401j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(int i7, p1.n0 n0Var, int i8) {
        super(1);
        this.f2398g = 0;
        this.f2400i = i7;
        this.f2399h = n0Var;
        this.f2401j = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f2398g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1.m0.d((p1.m0) obj, (p1.n0) this.f2399h, t6.a.O((this.f2400i - r0.f7063f) / 2.0f), t6.a.O((this.f2401j - r0.f7064g) / 2.0f));
                return d6.z.f2639a;
            case 1:
                p1.m0.d((p1.m0) obj, (p1.n0) this.f2399h, this.f2400i, this.f2401j);
                return d6.z.f2639a;
            case 2:
                p1.m0.d((p1.m0) obj, (p1.n0) this.f2399h, -this.f2400i, -this.f2401j);
                return d6.z.f2639a;
            default:
                a2.r rVar = (a2.r) obj;
                z0.j jVar = (z0.j) this.f2399h;
                a2.b bVar = rVar.f440a;
                int b9 = rVar.b(this.f2400i);
                int b10 = rVar.b(this.f2401j);
                CharSequence charSequence = bVar.f315e;
                if (b9 < 0 || b9 > b10 || b10 > charSequence.length()) {
                    throw new IllegalArgumentException(("start(" + b9 + ") or end(" + b10 + ") is out of range [0.." + charSequence.length() + "], or start > end!").toString());
                }
                Path path = new Path();
                b2.d0 d0Var = bVar.f314d;
                d0Var.f1267e.getSelectionPath(b9, b10, path);
                int i7 = d0Var.f1269g;
                if (i7 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i7);
                }
                long a3 = u3.r.a(0.0f, rVar.f445f);
                Matrix matrix = new Matrix();
                matrix.setTranslate(y0.c.d(a3), y0.c.e(a3));
                path.transform(matrix);
                jVar.f10002a.addPath(path, y0.c.d(0L), y0.c.e(0L));
                return d6.z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(Object obj, int i7, int i8, int i9) {
        super(1);
        this.f2398g = i9;
        this.f2399h = obj;
        this.f2400i = i7;
        this.f2401j = i8;
    }
}
