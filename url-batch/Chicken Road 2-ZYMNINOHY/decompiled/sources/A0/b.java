package A0;

import W.J;
import d2.C0389g;
import y0.r;
import y0.x;
import y0.y;
import y0.z;

/* loaded from: classes.dex */
public class b implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8c;

    public /* synthetic */ b(Object obj, long j4, int i4) {
        this.f6a = i4;
        this.f8c = obj;
        this.f7b = j4;
    }

    @Override // y0.y
    public final boolean c() {
        switch (this.f6a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // y0.y
    public final x e(long j4) {
        switch (this.f6a) {
            case 0:
                d dVar = (d) this.f8c;
                x b4 = dVar.f20i[0].b(j4);
                int i4 = 1;
                while (true) {
                    g[] gVarArr = dVar.f20i;
                    if (i4 >= gVarArr.length) {
                        return b4;
                    }
                    x b5 = gVarArr[i4].b(j4);
                    if (b5.f16222a.f16226b < b4.f16222a.f16226b) {
                        b4 = b5;
                    }
                    i4++;
                }
            case 1:
                r rVar = (r) this.f8c;
                rVar.f16193k.getClass();
                C0389g c0389g = rVar.f16193k;
                long[] jArr = (long[]) c0389g.f8264b;
                long[] jArr2 = (long[]) c0389g.f8265c;
                int f4 = J.f(jArr, J.k((rVar.f16187e * j4) / 1000000, 0L, rVar.f16192j - 1), false);
                long j5 = f4 == -1 ? 0L : jArr[f4];
                long j6 = f4 != -1 ? jArr2[f4] : 0L;
                int i5 = rVar.f16187e;
                long j7 = (j5 * 1000000) / i5;
                long j8 = this.f7b;
                z zVar = new z(j7, j6 + j8);
                if (j7 == j4 || f4 == jArr.length - 1) {
                    return new x(zVar, zVar);
                }
                int i6 = f4 + 1;
                return new x(zVar, new z((jArr[i6] * 1000000) / i5, j8 + jArr2[i6]));
            default:
                return (x) this.f8c;
        }
    }

    @Override // y0.y
    public final long g() {
        switch (this.f6a) {
            case 0:
                return this.f7b;
            case 1:
                return ((r) this.f8c).b();
            default:
                return this.f7b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(long j4) {
        this(j4, 0L);
        this.f6a = 2;
    }

    public b(long j4, long j5) {
        this.f6a = 2;
        this.f7b = j4;
        z zVar = j5 == 0 ? z.f16224c : new z(0L, j5);
        this.f8c = new x(zVar, zVar);
    }
}
