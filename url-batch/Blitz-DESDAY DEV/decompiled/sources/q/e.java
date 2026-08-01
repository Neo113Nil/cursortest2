package q;

/* loaded from: classes.dex */
public final class e implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f3349e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3350a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f3351b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f3352c;
    public int d;

    public e() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f3351b = new long[i4];
        this.f3352c = new Object[i4];
    }

    public final void a() {
        int i = this.d;
        Object[] objArr = this.f3352c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.f3350a = false;
    }

    public final void b() {
        int i = this.d;
        long[] jArr = this.f3351b;
        Object[] objArr = this.f3352c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3349e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3350a = false;
        this.d = i2;
    }

    public final Object c(long j2, Long l2) {
        Object obj;
        int b2 = d.b(this.f3351b, this.d, j2);
        return (b2 < 0 || (obj = this.f3352c[b2]) == f3349e) ? l2 : obj;
    }

    public final Object clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f3351b = (long[]) this.f3351b.clone();
            eVar.f3352c = (Object[]) this.f3352c.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void d(long j2, Object obj) {
        int b2 = d.b(this.f3351b, this.d, j2);
        if (b2 >= 0) {
            this.f3352c[b2] = obj;
            return;
        }
        int i = ~b2;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.f3352c;
            if (objArr[i] == f3349e) {
                this.f3351b[i] = j2;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f3350a && i2 >= this.f3351b.length) {
            b();
            i = ~d.b(this.f3351b, this.d, j2);
        }
        int i3 = this.d;
        if (i3 >= this.f3351b.length) {
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
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f3351b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3352c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3351b = jArr;
            this.f3352c = objArr2;
        }
        int i8 = this.d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f3351b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f3352c;
            System.arraycopy(objArr4, i, objArr4, i9, this.d - i);
        }
        this.f3351b[i] = j2;
        this.f3352c[i] = obj;
        this.d++;
    }

    public final int e() {
        if (this.f3350a) {
            b();
        }
        return this.d;
    }

    public final Object f(int i) {
        if (this.f3350a) {
            b();
        }
        return this.f3352c[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f3350a) {
                b();
            }
            sb.append(this.f3351b[i]);
            sb.append('=');
            Object f2 = f(i);
            if (f2 != this) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
