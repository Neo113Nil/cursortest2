package o0;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3272c {

    /* renamed from: a, reason: collision with root package name */
    private int f41487a;

    /* renamed from: b, reason: collision with root package name */
    private long f41488b;

    C3272c(long j4, int i4) {
        this.f41488b = j4;
        this.f41487a = i4;
    }

    static C3272c b(String str, int i4, int i5) {
        long j4;
        int i6;
        if (i4 >= i5) {
            return null;
        }
        long j5 = 0;
        int i7 = i4;
        while (i7 < i5) {
            char charAt = str.charAt(i7);
            if (charAt < '0' || charAt > '9') {
                if (charAt >= 'A' && charAt <= 'F') {
                    j4 = j5 * 16;
                    i6 = charAt - 'A';
                } else {
                    if (charAt < 'a' || charAt > 'f') {
                        break;
                    }
                    j4 = j5 * 16;
                    i6 = charAt - 'a';
                }
                j5 = j4 + i6 + 10;
            } else {
                j5 = (j5 * 16) + (charAt - '0');
            }
            if (j5 > 4294967295L) {
                return null;
            }
            i7++;
        }
        if (i7 == i4) {
            return null;
        }
        return new C3272c(j5, i7);
    }

    static C3272c c(String str, int i4, int i5, boolean z4) {
        if (i4 >= i5) {
            return null;
        }
        if (z4) {
            char charAt = str.charAt(i4);
            if (charAt != '+') {
                r1 = charAt == '-';
            }
            i4++;
        }
        long j4 = 0;
        int i6 = i4;
        while (i6 < i5) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            if (r1) {
                j4 = (j4 * 10) - (charAt2 - '0');
                if (j4 < -2147483648L) {
                    return null;
                }
            } else {
                j4 = (j4 * 10) + (charAt2 - '0');
                if (j4 > 2147483647L) {
                    return null;
                }
            }
            i6++;
        }
        if (i6 == i4) {
            return null;
        }
        return new C3272c(j4, i6);
    }

    int a() {
        return this.f41487a;
    }

    public int d() {
        return (int) this.f41488b;
    }
}
