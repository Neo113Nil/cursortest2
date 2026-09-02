package f1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1408a;

    /* renamed from: b, reason: collision with root package name */
    public int f1409b;

    /* renamed from: c, reason: collision with root package name */
    public int f1410c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1411e;

    public final boolean a() {
        int i = this.f1408a;
        int i4 = 2;
        if ((i & 7) != 0) {
            int i5 = this.d;
            int i6 = this.f1409b;
            if (((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i7 = this.d;
            int i8 = this.f1410c;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i9 = this.f1411e;
            int i10 = this.f1409b;
            if ((((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i11 = this.f1411e;
            int i12 = this.f1410c;
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
