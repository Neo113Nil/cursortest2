package W;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public int f3291a;

    /* renamed from: b, reason: collision with root package name */
    public int f3292b;

    /* renamed from: c, reason: collision with root package name */
    public int f3293c;

    /* renamed from: d, reason: collision with root package name */
    public int f3294d;

    /* renamed from: e, reason: collision with root package name */
    public int f3295e;

    public final boolean a() {
        int i2 = this.f3291a;
        int i3 = 2;
        if ((i2 & 7) != 0) {
            int i6 = this.f3294d;
            int i7 = this.f3292b;
            if (((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i8 = this.f3294d;
            int i9 = this.f3293c;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i10 = this.f3295e;
            int i11 = this.f3292b;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i12 = this.f3295e;
            int i13 = this.f3293c;
            if (i12 > i13) {
                i3 = 1;
            } else if (i12 != i13) {
                i3 = 4;
            }
            if ((i2 & (i3 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
