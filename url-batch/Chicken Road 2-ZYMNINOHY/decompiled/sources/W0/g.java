package W0;

import V0.i;

/* loaded from: classes.dex */
public final class g extends i implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public long f3453k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (g(4) != gVar.g(4)) {
            return g(4) ? 1 : -1;
        }
        long j4 = this.f3783g - gVar.f3783g;
        if (j4 == 0) {
            j4 = this.f3453k - gVar.f3453k;
            if (j4 == 0) {
                return 0;
            }
        }
        return j4 > 0 ? 1 : -1;
    }
}
