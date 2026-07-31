package N;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public int f690a;

    /* renamed from: b, reason: collision with root package name */
    public int f691b;

    /* renamed from: c, reason: collision with root package name */
    public int f692c;

    /* renamed from: d, reason: collision with root package name */
    public int f693d;

    /* renamed from: e, reason: collision with root package name */
    public int f694e;

    public final boolean a() {
        int i2 = this.f690a;
        int i3 = 2;
        if ((i2 & 7) != 0) {
            int i4 = this.f693d;
            int i5 = this.f691b;
            if (((i4 > i5 ? 1 : i4 == i5 ? 2 : 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i6 = this.f693d;
            int i7 = this.f692c;
            if ((((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i8 = this.f694e;
            int i9 = this.f691b;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i10 = this.f694e;
            int i11 = this.f692c;
            if (i10 > i11) {
                i3 = 1;
            } else if (i10 != i11) {
                i3 = 4;
            }
            if ((i2 & (i3 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
