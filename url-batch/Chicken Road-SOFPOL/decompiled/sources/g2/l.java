package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f2971a;

    /* renamed from: b, reason: collision with root package name */
    public int f2972b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2973c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2974d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2975e;

    public int a(long j7) {
        int i = this.f2971a + 1;
        long[] jArr = (long[]) this.f2973c;
        int length = jArr.length;
        if (i > length) {
            int i8 = length * 2;
            long[] jArr2 = new long[i8];
            int[] iArr = new int[i8];
            d6.l.G(jArr, jArr2, 0, 0, jArr.length);
            d6.l.I(0, 0, 14, (int[]) this.f2974d, iArr);
            this.f2973c = jArr2;
            this.f2974d = iArr;
        }
        int i9 = this.f2971a;
        this.f2971a = i9 + 1;
        int length2 = ((int[]) this.f2975e).length;
        if (this.f2972b >= length2) {
            int i10 = length2 * 2;
            int[] iArr2 = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr2[i11] = i12;
                i11 = i12;
            }
            d6.l.I(0, 0, 14, (int[]) this.f2975e, iArr2);
            this.f2975e = iArr2;
        }
        int i13 = this.f2972b;
        int[] iArr3 = (int[]) this.f2975e;
        this.f2972b = iArr3[i13];
        long[] jArr3 = (long[]) this.f2973c;
        jArr3[i9] = j7;
        ((int[]) this.f2974d)[i9] = i13;
        iArr3[i13] = i9;
        while (i9 > 0) {
            int i14 = ((i9 + 1) >> 1) - 1;
            if (q6.i.g(jArr3[i14], j7) <= 0) {
                break;
            }
            c(i14, i9);
            i9 = i14;
        }
        return i13;
    }

    public void b(int i) {
        int i8 = this.f2972b;
        boolean z3 = false;
        if (i >= 0 && i < i8) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        l2.a.a("lineIndex(" + i + ") is out of bounds [0, " + i8 + ')');
    }

    public void c(int i, int i8) {
        long[] jArr = (long[]) this.f2973c;
        int[] iArr = (int[]) this.f2974d;
        int[] iArr2 = (int[]) this.f2975e;
        long j7 = jArr[i];
        jArr[i] = jArr[i8];
        jArr[i8] = j7;
        int i9 = iArr[i];
        int i10 = iArr[i8];
        iArr[i] = i10;
        iArr[i8] = i9;
        iArr2[i10] = i;
        iArr2[i9] = i8;
    }
}
