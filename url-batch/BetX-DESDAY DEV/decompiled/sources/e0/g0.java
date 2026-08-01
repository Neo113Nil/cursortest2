package e0;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2251a;

    /* renamed from: b, reason: collision with root package name */
    public int f2252b;

    /* renamed from: c, reason: collision with root package name */
    public int f2253c;

    /* renamed from: d, reason: collision with root package name */
    public int f2254d;

    /* renamed from: e, reason: collision with root package name */
    public int f2255e;

    public final boolean a() {
        int i = this.f2251a;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.f2254d;
            int i4 = this.f2252b;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.f2254d;
            int i6 = this.f2253c;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f2255e;
            int i8 = this.f2252b;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f2255e;
            int i10 = this.f2253c;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
