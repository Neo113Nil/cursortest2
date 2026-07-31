package u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f7164a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f7165b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f7166c;

    public j(int i, long[] jArr, Object[] objArr) {
        this.f7164a = i;
        this.f7165b = jArr;
        this.f7166c = objArr;
    }

    public final int a(long j7) {
        int i = this.f7164a - 1;
        if (i != -1) {
            long[] jArr = this.f7165b;
            int i8 = 0;
            if (i != 0) {
                while (i8 <= i) {
                    int i9 = (i8 + i) >>> 1;
                    long j8 = jArr[i9] - j7;
                    if (j8 < 0) {
                        i8 = i9 + 1;
                    } else {
                        if (j8 <= 0) {
                            return i9;
                        }
                        i = i9 - 1;
                    }
                }
                return -(i8 + 1);
            }
            long j9 = jArr[0];
            if (j9 == j7) {
                return 0;
            }
            if (j9 > j7) {
                return -2;
            }
        }
        return -1;
    }

    public final j b(long j7, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.f7166c;
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
                jArr = this.f7165b;
                i = this.f7164a;
                if (i8 >= i10 || i11 >= i) {
                    break;
                }
                long j8 = jArr[i11];
                Object obj3 = objArr[i11];
                if (j8 > j7) {
                    jArr2[i8] = j7;
                    objArr2[i8] = obj;
                    i8++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i8] = j8;
                    objArr2[i8] = obj3;
                    i8++;
                }
                i11++;
            }
            if (i11 == i) {
                jArr2[i9] = j7;
                objArr2[i9] = obj;
            } else {
                while (i8 < i10) {
                    long j9 = jArr[i11];
                    Object obj4 = objArr[i11];
                    if (obj4 != null) {
                        jArr2[i8] = j9;
                        objArr2[i8] = obj4;
                        i8++;
                    }
                    i11++;
                }
            }
        } else {
            jArr2[0] = j7;
            objArr2[0] = obj;
        }
        return new j(i10, jArr2, objArr2);
    }
}
