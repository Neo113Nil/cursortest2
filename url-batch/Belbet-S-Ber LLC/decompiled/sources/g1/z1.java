package g1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1869a;

    /* renamed from: b, reason: collision with root package name */
    public int f1870b;

    /* renamed from: c, reason: collision with root package name */
    public int f1871c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1872e;

    public final boolean a() {
        int i = this.f1869a;
        int i4 = 2;
        if ((i & 7) != 0) {
            int i5 = this.d;
            int i6 = this.f1870b;
            if (((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i7 = this.d;
            int i8 = this.f1871c;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i9 = this.f1872e;
            int i10 = this.f1870b;
            if ((((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i11 = this.f1872e;
            int i12 = this.f1871c;
            if (i11 > i12) {
                i4 = 1;
            } else if (i11 != i12) {
                i4 = 4;
            }
            if ((i & (i4 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
