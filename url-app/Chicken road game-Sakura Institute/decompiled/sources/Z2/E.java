package Z2;

import W2.C0286h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E implements W2.L {

    /* renamed from: d, reason: collision with root package name */
    public final G f4613d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4614e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4615i;

    /* renamed from: j, reason: collision with root package name */
    public final C0286h f4616j;

    public E(G g4, long j4, Object obj, C0286h c0286h) {
        this.f4613d = g4;
        this.f4614e = j4;
        this.f4615i = obj;
        this.f4616j = c0286h;
    }

    @Override // W2.L
    public final void a() {
        G g4 = this.f4613d;
        synchronized (g4) {
            if (this.f4614e < g4.q()) {
                return;
            }
            Object[] objArr = g4.f4627n;
            Intrinsics.c(objArr);
            long j4 = this.f4614e;
            if (objArr[((int) j4) & (objArr.length - 1)] != this) {
                return;
            }
            H.e(objArr, j4, H.f4632a);
            g4.l();
            Unit unit = Unit.f7487a;
        }
    }
}
