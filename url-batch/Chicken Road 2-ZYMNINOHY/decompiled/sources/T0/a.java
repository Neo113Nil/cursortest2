package T0;

import W.J;
import java.math.BigInteger;
import y0.x;
import y0.y;
import y0.z;

/* loaded from: classes.dex */
public final class a implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f2905a;

    public a(b bVar) {
        this.f2905a = bVar;
    }

    @Override // y0.y
    public final boolean c() {
        return true;
    }

    @Override // y0.y
    public final x e(long j4) {
        b bVar = this.f2905a;
        long j5 = bVar.f2907b;
        BigInteger valueOf = BigInteger.valueOf((bVar.f2909d.f2942i * j4) / 1000000);
        long j6 = bVar.f2908c;
        z zVar = new z(j4, J.k((valueOf.multiply(BigInteger.valueOf(j6 - j5)).divide(BigInteger.valueOf(bVar.f2911f)).longValue() + j5) - 30000, bVar.f2907b, j6 - 1));
        return new x(zVar, zVar);
    }

    @Override // y0.y
    public final long g() {
        return (this.f2905a.f2911f * 1000000) / r0.f2909d.f2942i;
    }
}
