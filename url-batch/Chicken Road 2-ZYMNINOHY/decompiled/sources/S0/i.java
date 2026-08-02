package S0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f2423a;

    /* renamed from: b, reason: collision with root package name */
    public int f2424b;

    /* renamed from: c, reason: collision with root package name */
    public int f2425c;

    /* renamed from: d, reason: collision with root package name */
    public int f2426d;

    /* renamed from: e, reason: collision with root package name */
    public int f2427e;

    public boolean a() {
        int i4 = this.f2423a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f2426d;
            int i7 = this.f2424b;
            if (((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.f2426d;
            int i9 = this.f2425c;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.f2427e;
            int i11 = this.f2424b;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.f2427e;
            int i13 = this.f2425c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
