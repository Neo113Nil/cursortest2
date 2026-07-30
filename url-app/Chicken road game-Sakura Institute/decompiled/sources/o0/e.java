package o0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f6823a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f6824b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f6825c;

    public e(int i7, long[] jArr, Object[] objArr) {
        this.f6823a = i7;
        this.f6824b = jArr;
        this.f6825c = objArr;
    }

    public final int a(long j8) {
        int i7 = this.f6823a - 1;
        if (i7 != -1) {
            long[] jArr = this.f6824b;
            int i8 = 0;
            if (i7 != 0) {
                while (i8 <= i7) {
                    int i9 = (i8 + i7) >>> 1;
                    long j9 = jArr[i9] - j8;
                    if (j9 < 0) {
                        i8 = i9 + 1;
                    } else {
                        if (j9 <= 0) {
                            return i9;
                        }
                        i7 = i9 - 1;
                    }
                }
                return -(i8 + 1);
            }
            long j10 = jArr[0];
            if (j10 == j8) {
                return 0;
            }
            if (j10 > j8) {
                return -2;
            }
        }
        return -1;
    }

    public final e b(long j8, Object obj) {
        long[] jArr;
        int i7;
        Object[] objArr = this.f6825c;
        int i8 = 0;
        int i9 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i9++;
            }
        }
        int i10 = i9 + 1;
        long[] jArr2 = new long[i10];
        Object[] objArr2 = new Object[i10];
        if (i10 > 1) {
            int i11 = 0;
            while (true) {
                jArr = this.f6824b;
                i7 = this.f6823a;
                if (i8 >= i10 || i11 >= i7) {
                    break;
                }
                long j9 = jArr[i11];
                Object obj3 = objArr[i11];
                if (j9 > j8) {
                    jArr2[i8] = j8;
                    objArr2[i8] = obj;
                    i8++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i8] = j9;
                    objArr2[i8] = obj3;
                    i8++;
                }
                i11++;
            }
            if (i11 == i7) {
                jArr2[i9] = j8;
                objArr2[i9] = obj;
            } else {
                while (i8 < i10) {
                    long j10 = jArr[i11];
                    Object obj4 = objArr[i11];
                    if (obj4 != null) {
                        jArr2[i8] = j10;
                        objArr2[i8] = obj4;
                        i8++;
                    }
                    i11++;
                }
            }
        } else {
            jArr2[0] = j8;
            objArr2[0] = obj;
        }
        return new e(i10, jArr2, objArr2);
    }
}
