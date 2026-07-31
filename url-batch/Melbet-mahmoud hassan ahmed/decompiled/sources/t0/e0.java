package t0;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f21720a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f21721b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f21722c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f21723d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f21724e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f21725f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f21726g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f21727a;

        /* renamed from: b, reason: collision with root package name */
        public String f21728b;

        /* renamed from: c, reason: collision with root package name */
        public int f21729c;

        /* renamed from: d, reason: collision with root package name */
        public int f21730d;

        /* renamed from: e, reason: collision with root package name */
        public int f21731e;

        /* renamed from: f, reason: collision with root package name */
        public int f21732f;

        /* renamed from: g, reason: collision with root package name */
        public int f21733g;

        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(int i7) {
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            if (!e0.l(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
                return false;
            }
            this.f21727a = i8;
            this.f21728b = e0.f21720a[3 - i9];
            int i14 = e0.f21721b[i11];
            this.f21730d = i14;
            if (i8 != 2) {
                if (i8 == 0) {
                    i12 = i14 / 4;
                }
                int i15 = (i7 >>> 9) & 1;
                this.f21733g = e0.k(i8, i9);
                if (i9 != 3) {
                    int i16 = i8 == 3 ? e0.f21722c[i10 - 1] : e0.f21723d[i10 - 1];
                    this.f21732f = i16;
                    i13 = (((i16 * 12) / this.f21730d) + i15) * 4;
                } else {
                    if (i8 != 3) {
                        int i17 = e0.f21726g[i10 - 1];
                        this.f21732f = i17;
                        this.f21729c = (((i9 == 1 ? 72 : 144) * i17) / this.f21730d) + i15;
                        this.f21731e = ((i7 >> 6) & 3) == 3 ? 1 : 2;
                        return true;
                    }
                    int i18 = i9 == 2 ? e0.f21724e[i10 - 1] : e0.f21725f[i10 - 1];
                    this.f21732f = i18;
                    i13 = ((i18 * 144) / this.f21730d) + i15;
                }
                this.f21729c = i13;
                this.f21731e = ((i7 >> 6) & 3) == 3 ? 1 : 2;
                return true;
            }
            i12 = i14 / 2;
            this.f21730d = i12;
            int i152 = (i7 >>> 9) & 1;
            this.f21733g = e0.k(i8, i9);
            if (i9 != 3) {
            }
            this.f21729c = i13;
            this.f21731e = ((i7 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!l(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = f21721b[i11];
        if (i8 == 2) {
            i12 /= 2;
        } else if (i8 == 0) {
            i12 /= 4;
        }
        int i13 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            return ((((i8 == 3 ? f21722c[i10 - 1] : f21723d[i10 - 1]) * 12) / i12) + i13) * 4;
        }
        int i14 = i8 == 3 ? i9 == 2 ? f21724e[i10 - 1] : f21725f[i10 - 1] : f21726g[i10 - 1];
        if (i8 == 3) {
            return ((i14 * 144) / i12) + i13;
        }
        return (((i9 == 1 ? 72 : 144) * i14) / i12) + i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i7, int i8) {
        if (i8 == 1) {
            return i7 == 3 ? 1152 : 576;
        }
        if (i8 == 2) {
            return 1152;
        }
        if (i8 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i7) {
        return (i7 & (-2097152)) == -2097152;
    }

    public static int m(int i7) {
        int i8;
        int i9;
        if (!l(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = (i7 >>> 12) & 15;
        int i11 = (i7 >>> 10) & 3;
        if (i10 == 0 || i10 == 15 || i11 == 3) {
            return -1;
        }
        return k(i8, i9);
    }
}
