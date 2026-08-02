package U;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public int f1383a;

    /* renamed from: b, reason: collision with root package name */
    public int f1384b;

    /* renamed from: c, reason: collision with root package name */
    public int f1385c;

    /* renamed from: d, reason: collision with root package name */
    public int f1386d;

    /* renamed from: e, reason: collision with root package name */
    public int f1387e;

    public final boolean a() {
        int i3 = this.f1383a;
        int i4 = 2;
        if ((i3 & 7) != 0) {
            int i5 = this.f1386d;
            int i6 = this.f1384b;
            if (((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 112) != 0) {
            int i7 = this.f1386d;
            int i8 = this.f1385c;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 4) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 1792) != 0) {
            int i9 = this.f1387e;
            int i10 = this.f1384b;
            if ((((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 8) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 28672) != 0) {
            int i11 = this.f1387e;
            int i12 = this.f1385c;
            if (i11 > i12) {
                i4 = 1;
            } else if (i11 != i12) {
                i4 = 4;
            }
            if ((i3 & (i4 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
