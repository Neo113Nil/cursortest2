package Z2;

import W2.C0286h;
import a3.AbstractC0424b;
import a3.AbstractC0426d;

/* loaded from: classes.dex */
public final class I extends AbstractC0426d {

    /* renamed from: a, reason: collision with root package name */
    public long f4635a;

    /* renamed from: b, reason: collision with root package name */
    public C0286h f4636b;

    @Override // a3.AbstractC0426d
    public final boolean a(AbstractC0424b abstractC0424b) {
        G g4 = (G) abstractC0424b;
        if (this.f4635a >= 0) {
            return false;
        }
        long j4 = g4.f4628o;
        if (j4 < g4.f4629p) {
            g4.f4629p = j4;
        }
        this.f4635a = j4;
        return true;
    }

    @Override // a3.AbstractC0426d
    public final C2.a[] b(AbstractC0424b abstractC0424b) {
        long j4 = this.f4635a;
        this.f4635a = -1L;
        this.f4636b = null;
        return ((G) abstractC0424b).w(j4);
    }
}
