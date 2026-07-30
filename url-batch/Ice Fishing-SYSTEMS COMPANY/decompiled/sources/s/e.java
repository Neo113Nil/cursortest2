package s;

/* loaded from: classes.dex */
public final class e implements Cloneable {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f40383x = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f40384n;

    /* renamed from: u, reason: collision with root package name */
    public long[] f40385u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f40386v;

    /* renamed from: w, reason: collision with root package name */
    public int f40387w;

    public e() {
        this(10);
    }

    public final Object clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f40385u = (long[]) this.f40385u.clone();
            eVar.f40386v = (Object[]) this.f40386v.clone();
            return eVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final void h() {
        int i = this.f40387w;
        Object[] objArr = this.f40386v;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        this.f40387w = 0;
        this.f40384n = false;
    }

    public final void i() {
        int i = this.f40387w;
        long[] jArr = this.f40385u;
        Object[] objArr = this.f40386v;
        int i4 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[i9];
            if (obj != f40383x) {
                if (i9 != i4) {
                    jArr[i4] = jArr[i9];
                    objArr[i4] = obj;
                    objArr[i9] = null;
                }
                i4++;
            }
        }
        this.f40384n = false;
        this.f40387w = i4;
    }

    public final Object j(long j9, Long l9) {
        Object obj;
        int b9 = d.b(this.f40385u, this.f40387w, j9);
        return (b9 < 0 || (obj = this.f40386v[b9]) == f40383x) ? l9 : obj;
    }

    public final void k(long j9, Object obj) {
        int b9 = d.b(this.f40385u, this.f40387w, j9);
        if (b9 >= 0) {
            this.f40386v[b9] = obj;
            return;
        }
        int i = ~b9;
        int i4 = this.f40387w;
        if (i < i4) {
            Object[] objArr = this.f40386v;
            if (objArr[i] == f40383x) {
                this.f40385u[i] = j9;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f40384n && i4 >= this.f40385u.length) {
            i();
            i = ~d.b(this.f40385u, this.f40387w, j9);
        }
        int i9 = this.f40387w;
        if (i9 >= this.f40385u.length) {
            int i10 = (i9 + 1) * 8;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 8;
            long[] jArr = new long[i13];
            Object[] objArr2 = new Object[i13];
            long[] jArr2 = this.f40385u;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f40386v;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f40385u = jArr;
            this.f40386v = objArr2;
        }
        int i14 = this.f40387w - i;
        if (i14 != 0) {
            long[] jArr3 = this.f40385u;
            int i15 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i15, i14);
            Object[] objArr4 = this.f40386v;
            System.arraycopy(objArr4, i, objArr4, i15, this.f40387w - i);
        }
        this.f40385u[i] = j9;
        this.f40386v[i] = obj;
        this.f40387w++;
    }

    public final int l() {
        if (this.f40384n) {
            i();
        }
        return this.f40387w;
    }

    public final Object m(int i) {
        if (this.f40384n) {
            i();
        }
        return this.f40386v[i];
    }

    public final String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40387w * 28);
        sb.append('{');
        for (int i = 0; i < this.f40387w; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f40384n) {
                i();
            }
            sb.append(this.f40385u[i]);
            sb.append('=');
            Object m8 = m(i);
            if (m8 != this) {
                sb.append(m8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public e(int i) {
        this.f40384n = false;
        if (i == 0) {
            this.f40385u = d.f40381b;
            this.f40386v = d.f40382c;
            return;
        }
        int i4 = i * 8;
        int i9 = 4;
        while (true) {
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (i4 <= i10) {
                i4 = i10;
                break;
            }
            i9++;
        }
        int i11 = i4 / 8;
        this.f40385u = new long[i11];
        this.f40386v = new Object[i11];
    }
}
