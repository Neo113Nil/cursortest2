package x0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f10237a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f10238b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f10239c;

    public j(int i3, long[] jArr, Object[] objArr) {
        this.f10237a = i3;
        this.f10238b = jArr;
        this.f10239c = objArr;
    }

    public final int a(long j) {
        int i3 = this.f10237a - 1;
        if (i3 != -1) {
            long[] jArr = this.f10238b;
            int i10 = 0;
            if (i3 != 0) {
                while (i10 <= i3) {
                    int i11 = (i10 + i3) >>> 1;
                    long j3 = jArr[i11] - j;
                    if (j3 < 0) {
                        i10 = i11 + 1;
                    } else {
                        if (j3 <= 0) {
                            return i11;
                        }
                        i3 = i11 - 1;
                    }
                }
                return -(i10 + 1);
            }
            long j10 = jArr[0];
            if (j10 == j) {
                return 0;
            }
            if (j10 > j) {
                return -2;
            }
        }
        return -1;
    }

    public final j b(long j, Object obj) {
        long[] jArr;
        int i3;
        Object[] objArr = this.f10239c;
        int i10 = 0;
        int i11 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i11++;
            }
        }
        int i12 = i11 + 1;
        long[] jArr2 = new long[i12];
        Object[] objArr2 = new Object[i12];
        if (i12 > 1) {
            int i13 = 0;
            while (true) {
                jArr = this.f10238b;
                i3 = this.f10237a;
                if (i10 >= i12 || i13 >= i3) {
                    break;
                }
                long j3 = jArr[i13];
                Object obj3 = objArr[i13];
                if (j3 > j) {
                    jArr2[i10] = j;
                    objArr2[i10] = obj;
                    i10++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i10] = j3;
                    objArr2[i10] = obj3;
                    i10++;
                }
                i13++;
            }
            if (i13 == i3) {
                jArr2[i11] = j;
                objArr2[i11] = obj;
            } else {
                while (i10 < i12) {
                    long j10 = jArr[i13];
                    Object obj4 = objArr[i13];
                    if (obj4 != null) {
                        jArr2[i10] = j10;
                        objArr2[i10] = obj4;
                        i10++;
                    }
                    i13++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new j(i12, jArr2, objArr2);
    }
}
