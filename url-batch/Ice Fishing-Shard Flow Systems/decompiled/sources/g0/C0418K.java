package g0;

/* renamed from: g0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418K {

    /* renamed from: a, reason: collision with root package name */
    public int f4888a;

    /* renamed from: b, reason: collision with root package name */
    public int f4889b;

    /* renamed from: c, reason: collision with root package name */
    public int f4890c;

    /* renamed from: d, reason: collision with root package name */
    public int f4891d;

    /* renamed from: e, reason: collision with root package name */
    public int f4892e;

    public final boolean a() {
        int i2 = this.f4888a;
        int i5 = 2;
        if ((i2 & 7) != 0) {
            int i7 = this.f4891d;
            int i8 = this.f4889b;
            if (((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i9 = this.f4891d;
            int i10 = this.f4890c;
            if ((((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i11 = this.f4892e;
            int i12 = this.f4889b;
            if ((((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i13 = this.f4892e;
            int i14 = this.f4890c;
            if (i13 > i14) {
                i5 = 1;
            } else if (i13 != i14) {
                i5 = 4;
            }
            if ((i2 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
