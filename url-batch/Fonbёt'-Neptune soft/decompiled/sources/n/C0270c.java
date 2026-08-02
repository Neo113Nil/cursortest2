package n;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270c implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f3229i = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3230e = false;

    /* renamed from: f, reason: collision with root package name */
    public long[] f3231f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f3232g;

    /* renamed from: h, reason: collision with root package name */
    public int f3233h;

    public C0270c() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f3231f = new long[i5];
        this.f3232g = new Object[i5];
    }

    public final void a(long j2, Long l2) {
        int i2 = this.f3233h;
        if (i2 != 0 && j2 <= this.f3231f[i2 - 1]) {
            e(j2, l2);
            return;
        }
        if (this.f3230e && i2 >= this.f3231f.length) {
            c();
        }
        int i3 = this.f3233h;
        if (i3 >= this.f3231f.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr = new Object[i7];
            long[] jArr2 = this.f3231f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f3232g;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f3231f = jArr;
            this.f3232g = objArr;
        }
        this.f3231f[i3] = j2;
        this.f3232g[i3] = l2;
        this.f3233h = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0270c clone() {
        try {
            C0270c c0270c = (C0270c) super.clone();
            c0270c.f3231f = (long[]) this.f3231f.clone();
            c0270c.f3232g = (Object[]) this.f3232g.clone();
            return c0270c;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i2 = this.f3233h;
        long[] jArr = this.f3231f;
        Object[] objArr = this.f3232g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f3229i) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f3230e = false;
        this.f3233h = i3;
    }

    public final Object d(long j2, Long l2) {
        Object obj;
        int b2 = AbstractC0269b.b(this.f3231f, this.f3233h, j2);
        return (b2 < 0 || (obj = this.f3232g[b2]) == f3229i) ? l2 : obj;
    }

    public final void e(long j2, Object obj) {
        int b2 = AbstractC0269b.b(this.f3231f, this.f3233h, j2);
        if (b2 >= 0) {
            this.f3232g[b2] = obj;
            return;
        }
        int i2 = ~b2;
        int i3 = this.f3233h;
        if (i2 < i3) {
            Object[] objArr = this.f3232g;
            if (objArr[i2] == f3229i) {
                this.f3231f[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f3230e && i3 >= this.f3231f.length) {
            c();
            i2 = ~AbstractC0269b.b(this.f3231f, this.f3233h, j2);
        }
        int i4 = this.f3233h;
        if (i4 >= this.f3231f.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.f3231f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3232g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3231f = jArr;
            this.f3232g = objArr2;
        }
        int i9 = this.f3233h - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f3231f;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f3232g;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f3233h - i2);
        }
        this.f3231f[i2] = j2;
        this.f3232g[i2] = obj;
        this.f3233h++;
    }

    public final String toString() {
        if (this.f3230e) {
            c();
        }
        int i2 = this.f3233h;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f3233h; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (this.f3230e) {
                c();
            }
            sb.append(this.f3231f[i3]);
            sb.append('=');
            if (this.f3230e) {
                c();
            }
            Object obj = this.f3232g[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
