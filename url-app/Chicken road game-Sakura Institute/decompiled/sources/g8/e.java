package g8;

import f8.g0;
import f8.n;
import java.io.IOException;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: g, reason: collision with root package name */
    public final long f4545g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4546h;

    /* renamed from: i, reason: collision with root package name */
    public long f4547i;

    public e(g0 g0Var, long j8, boolean z8) {
        super(g0Var);
        this.f4545g = j8;
        this.f4546h = z8;
    }

    @Override // f8.g0
    public final long v(long j8, f8.f fVar) {
        k.f(fVar, "sink");
        long j9 = this.f4547i;
        long j10 = this.f4545g;
        if (j9 > j10) {
            j8 = 0;
        } else if (this.f4546h) {
            long j11 = j10 - j9;
            if (j11 == 0) {
                return -1L;
            }
            j8 = Math.min(j8, j11);
        }
        long v5 = this.f3626f.v(j8, fVar);
        if (v5 != -1) {
            this.f4547i += v5;
        }
        long j12 = this.f4547i;
        if ((j12 >= j10 || v5 != -1) && j12 <= j10) {
            return v5;
        }
        if (v5 > 0 && j12 > j10) {
            long j13 = fVar.f3598g - (j12 - j10);
            f8.f fVar2 = new f8.f();
            fVar2.N(fVar);
            fVar.f(j13, fVar2);
            fVar2.skip(fVar2.f3598g);
        }
        throw new IOException("expected " + j10 + " bytes but got " + this.f4547i);
    }
}
