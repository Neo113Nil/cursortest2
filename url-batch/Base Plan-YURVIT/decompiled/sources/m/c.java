package m;

/* loaded from: classes.dex */
public final class c implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f2821i = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f2822e = false;

    /* renamed from: f, reason: collision with root package name */
    public long[] f2823f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f2824g;

    /* renamed from: h, reason: collision with root package name */
    public int f2825h;

    public c() {
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
        this.f2823f = new long[i5];
        this.f2824g = new Object[i5];
    }

    public final void a() {
        int i2 = this.f2825h;
        long[] jArr = this.f2823f;
        Object[] objArr = this.f2824g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2821i) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2822e = false;
        this.f2825h = i3;
    }

    public final void b(long j2, Object obj) {
        int b2 = b.b(this.f2823f, this.f2825h, j2);
        if (b2 >= 0) {
            this.f2824g[b2] = obj;
            return;
        }
        int i2 = ~b2;
        int i3 = this.f2825h;
        if (i2 < i3) {
            Object[] objArr = this.f2824g;
            if (objArr[i2] == f2821i) {
                this.f2823f[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f2822e && i3 >= this.f2823f.length) {
            a();
            i2 = ~b.b(this.f2823f, this.f2825h, j2);
        }
        int i4 = this.f2825h;
        if (i4 >= this.f2823f.length) {
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
            long[] jArr2 = this.f2823f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2824g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2823f = jArr;
            this.f2824g = objArr2;
        }
        int i9 = this.f2825h - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f2823f;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f2824g;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f2825h - i2);
        }
        this.f2823f[i2] = j2;
        this.f2824g[i2] = obj;
        this.f2825h++;
    }

    public final Object clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f2823f = (long[]) this.f2823f.clone();
            cVar.f2824g = (Object[]) this.f2824g.clone();
            return cVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        if (this.f2822e) {
            a();
        }
        int i2 = this.f2825h;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f2825h; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (this.f2822e) {
                a();
            }
            sb.append(this.f2823f[i3]);
            sb.append('=');
            if (this.f2822e) {
                a();
            }
            Object obj = this.f2824g[i3];
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
