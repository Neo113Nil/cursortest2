package q0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f7407a;

    /* renamed from: b, reason: collision with root package name */
    public int f7408b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7409c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7410d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7411e;

    public int a(int i7) {
        int i8 = this.f7407a + 1;
        int[] iArr = (int[]) this.f7409c;
        int length = iArr.length;
        if (i8 > length) {
            int i9 = length * 2;
            int[] iArr2 = new int[i9];
            int[] iArr3 = new int[i9];
            e6.k.Y(iArr, iArr2, 0, 0, 14);
            e6.k.Y((int[]) this.f7410d, iArr3, 0, 0, 14);
            this.f7409c = iArr2;
            this.f7410d = iArr3;
        }
        int i10 = this.f7407a;
        this.f7407a = i10 + 1;
        int length2 = ((int[]) this.f7411e).length;
        if (this.f7408b >= length2) {
            int i11 = length2 * 2;
            int[] iArr4 = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                iArr4[i12] = i13;
                i12 = i13;
            }
            e6.k.Y((int[]) this.f7411e, iArr4, 0, 0, 14);
            this.f7411e = iArr4;
        }
        int i14 = this.f7408b;
        int[] iArr5 = (int[]) this.f7411e;
        this.f7408b = iArr5[i14];
        int[] iArr6 = (int[]) this.f7409c;
        iArr6[i10] = i7;
        ((int[]) this.f7410d)[i10] = i14;
        iArr5[i14] = i10;
        int i15 = iArr6[i10];
        while (i10 > 0) {
            int i16 = ((i10 + 1) >> 1) - 1;
            if (iArr6[i16] <= i15) {
                break;
            }
            b(i16, i10);
            i10 = i16;
        }
        return i14;
    }

    public void b(int i7, int i8) {
        int[] iArr = (int[]) this.f7409c;
        int[] iArr2 = (int[]) this.f7410d;
        int[] iArr3 = (int[]) this.f7411e;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
        int i10 = iArr2[i7];
        iArr2[i7] = iArr2[i8];
        iArr2[i8] = i10;
        iArr3[iArr2[i7]] = i7;
        iArr3[iArr2[i8]] = i8;
    }
}
