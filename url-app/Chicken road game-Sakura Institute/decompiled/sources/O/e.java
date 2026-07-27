package O;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f3627a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3628b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f3629c;

    public e(int i2, long[] jArr, Object[] objArr) {
        this.f3627a = i2;
        this.f3628b = jArr;
        this.f3629c = objArr;
    }

    public final int a(long j4) {
        int i2 = this.f3627a - 1;
        if (i2 == -1) {
            return -1;
        }
        long[] jArr = this.f3628b;
        int i4 = 0;
        if (i2 == 0) {
            long j5 = jArr[0];
            if (j5 == j4) {
                return 0;
            }
            return j5 > j4 ? -2 : -1;
        }
        while (i4 <= i2) {
            int i5 = (i4 + i2) >>> 1;
            long j6 = jArr[i5] - j4;
            if (j6 < 0) {
                i4 = i5 + 1;
            } else {
                if (j6 <= 0) {
                    return i5;
                }
                i2 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public final e b(long j4, Object obj) {
        long[] jArr;
        int i2;
        Object[] objArr = this.f3629c;
        int i4 = 0;
        int i5 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i5++;
            }
        }
        int i6 = i5 + 1;
        long[] jArr2 = new long[i6];
        Object[] objArr2 = new Object[i6];
        if (i6 > 1) {
            int i7 = 0;
            while (true) {
                jArr = this.f3628b;
                i2 = this.f3627a;
                if (i4 >= i6 || i7 >= i2) {
                    break;
                }
                long j5 = jArr[i7];
                Object obj3 = objArr[i7];
                if (j5 > j4) {
                    jArr2[i4] = j4;
                    objArr2[i4] = obj;
                    i4++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i4] = j5;
                    objArr2[i4] = obj3;
                    i4++;
                }
                i7++;
            }
            if (i7 == i2) {
                jArr2[i5] = j4;
                objArr2[i5] = obj;
            } else {
                while (i4 < i6) {
                    long j6 = jArr[i7];
                    Object obj4 = objArr[i7];
                    if (obj4 != null) {
                        jArr2[i4] = j6;
                        objArr2[i4] = obj4;
                        i4++;
                    }
                    i7++;
                }
            }
        } else {
            jArr2[0] = j4;
            objArr2[0] = obj;
        }
        return new e(i6, jArr2, objArr2);
    }
}
