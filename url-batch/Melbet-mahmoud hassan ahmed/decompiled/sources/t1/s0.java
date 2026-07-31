package t1;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface s0 {

    public static class a implements s0 {

        /* renamed from: a, reason: collision with root package name */
        private final Random f22211a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f22212b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f22213c;

        public a(int i7) {
            this(i7, new Random());
        }

        private a(int i7, Random random) {
            this(i(i7, random), random);
        }

        public a(int[] iArr, long j7) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j7));
        }

        private a(int[] iArr, Random random) {
            this.f22212b = iArr;
            this.f22211a = random;
            this.f22213c = new int[iArr.length];
            for (int i7 = 0; i7 < iArr.length; i7++) {
                this.f22213c[iArr[i7]] = i7;
            }
        }

        private static int[] i(int i7, Random random) {
            int[] iArr = new int[i7];
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8 + 1;
                int nextInt = random.nextInt(i9);
                iArr[i8] = iArr[nextInt];
                iArr[nextInt] = i8;
                i8 = i9;
            }
            return iArr;
        }

        @Override // t1.s0
        public int a() {
            return this.f22212b.length;
        }

        @Override // t1.s0
        public s0 b(int i7, int i8) {
            int i9 = i8 - i7;
            int[] iArr = new int[this.f22212b.length - i9];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr2 = this.f22212b;
                if (i10 >= iArr2.length) {
                    return new a(iArr, new Random(this.f22211a.nextLong()));
                }
                if (iArr2[i10] < i7 || iArr2[i10] >= i8) {
                    iArr[i10 - i11] = iArr2[i10] >= i7 ? iArr2[i10] - i9 : iArr2[i10];
                } else {
                    i11++;
                }
                i10++;
            }
        }

        @Override // t1.s0
        public int c(int i7) {
            int i8 = this.f22213c[i7] + 1;
            int[] iArr = this.f22212b;
            if (i8 < iArr.length) {
                return iArr[i8];
            }
            return -1;
        }

        @Override // t1.s0
        public s0 d(int i7, int i8) {
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int i9 = 0;
            int i10 = 0;
            while (i10 < i8) {
                iArr[i10] = this.f22211a.nextInt(this.f22212b.length + 1);
                int i11 = i10 + 1;
                int nextInt = this.f22211a.nextInt(i11);
                iArr2[i10] = iArr2[nextInt];
                iArr2[nextInt] = i10 + i7;
                i10 = i11;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f22212b.length + i8];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f22212b;
                if (i9 >= iArr4.length + i8) {
                    return new a(iArr3, new Random(this.f22211a.nextLong()));
                }
                if (i12 >= i8 || i13 != iArr[i12]) {
                    int i14 = i13 + 1;
                    iArr3[i9] = iArr4[i13];
                    if (iArr3[i9] >= i7) {
                        iArr3[i9] = iArr3[i9] + i8;
                    }
                    i13 = i14;
                } else {
                    iArr3[i9] = iArr2[i12];
                    i12++;
                }
                i9++;
            }
        }

        @Override // t1.s0
        public int e() {
            int[] iArr = this.f22212b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // t1.s0
        public int f(int i7) {
            int i8 = this.f22213c[i7] - 1;
            if (i8 >= 0) {
                return this.f22212b[i8];
            }
            return -1;
        }

        @Override // t1.s0
        public int g() {
            int[] iArr = this.f22212b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // t1.s0
        public s0 h() {
            return new a(0, new Random(this.f22211a.nextLong()));
        }
    }

    int a();

    s0 b(int i7, int i8);

    int c(int i7);

    s0 d(int i7, int i8);

    int e();

    int f(int i7);

    int g();

    s0 h();
}
