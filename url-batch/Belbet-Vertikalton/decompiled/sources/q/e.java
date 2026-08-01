package q;

/* loaded from: classes.dex */
public final class e implements Cloneable {
    public static final Object e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3901a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f3902b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f3903c;

    /* renamed from: d, reason: collision with root package name */
    public int f3904d;

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
        this.f3902b = new long[i4];
        this.f3903c = new Object[i4];
    }

    public final void a() {
        int i = this.f3904d;
        Object[] objArr = this.f3903c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3904d = 0;
        this.f3901a = false;
    }

    public final void b() {
        int i = this.f3904d;
        long[] jArr = this.f3902b;
        Object[] objArr = this.f3903c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3901a = false;
        this.f3904d = i2;
    }

    public final Object c(long j, Long l2) {
        Object obj;
        int b2 = d.b(this.f3902b, this.f3904d, j);
        return (b2 < 0 || (obj = this.f3903c[b2]) == e) ? l2 : obj;
    }

    public final Object clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f3902b = (long[]) this.f3902b.clone();
            eVar.f3903c = (Object[]) this.f3903c.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void d(long j, Object obj) {
        int b2 = d.b(this.f3902b, this.f3904d, j);
        if (b2 >= 0) {
            this.f3903c[b2] = obj;
            return;
        }
        int i = ~b2;
        int i2 = this.f3904d;
        if (i < i2) {
            Object[] objArr = this.f3903c;
            if (objArr[i] == e) {
                this.f3902b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f3901a && i2 >= this.f3902b.length) {
            b();
            i = ~d.b(this.f3902b, this.f3904d, j);
        }
        int i3 = this.f3904d;
        if (i3 >= this.f3902b.length) {
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
            long[] jArr2 = this.f3902b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3903c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3902b = jArr;
            this.f3903c = objArr2;
        }
        int i8 = this.f3904d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f3902b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f3903c;
            System.arraycopy(objArr4, i, objArr4, i9, this.f3904d - i);
        }
        this.f3902b[i] = j;
        this.f3903c[i] = obj;
        this.f3904d++;
    }

    public final int e() {
        if (this.f3901a) {
            b();
        }
        return this.f3904d;
    }

    public final Object f(int i) {
        if (this.f3901a) {
            b();
        }
        return this.f3903c[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3904d * 28);
        sb.append('{');
        for (int i = 0; i < this.f3904d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f3901a) {
                b();
            }
            sb.append(this.f3902b[i]);
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
