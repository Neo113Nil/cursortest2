package q;

/* renamed from: q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585e implements Cloneable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f5716j = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f5717f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f5718g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f5719h;

    /* renamed from: i, reason: collision with root package name */
    public int f5720i;

    public final void a() {
        int i7 = this.f5720i;
        long[] jArr = this.f5718g;
        Object[] objArr = this.f5719h;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f5716j) {
                if (i9 != i8) {
                    jArr[i8] = jArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f5717f = false;
        this.f5720i = i8;
    }

    public final void b(long j4, Object obj) {
        int b7 = AbstractC0584d.b(this.f5718g, this.f5720i, j4);
        if (b7 >= 0) {
            this.f5719h[b7] = obj;
            return;
        }
        int i7 = ~b7;
        int i8 = this.f5720i;
        if (i7 < i8) {
            Object[] objArr = this.f5719h;
            if (objArr[i7] == f5716j) {
                this.f5718g[i7] = j4;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f5717f && i8 >= this.f5718g.length) {
            a();
            i7 = ~AbstractC0584d.b(this.f5718g, this.f5720i, j4);
        }
        int i9 = this.f5720i;
        if (i9 >= this.f5718g.length) {
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
            long[] jArr2 = this.f5718g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f5719h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5718g = jArr;
            this.f5719h = objArr2;
        }
        int i14 = this.f5720i - i7;
        if (i14 != 0) {
            long[] jArr3 = this.f5718g;
            int i15 = i7 + 1;
            System.arraycopy(jArr3, i7, jArr3, i15, i14);
            Object[] objArr4 = this.f5719h;
            System.arraycopy(objArr4, i7, objArr4, i15, this.f5720i - i7);
        }
        this.f5718g[i7] = j4;
        this.f5719h[i7] = obj;
        this.f5720i++;
    }

    public final Object clone() {
        try {
            C0585e c0585e = (C0585e) super.clone();
            c0585e.f5718g = (long[]) this.f5718g.clone();
            c0585e.f5719h = (Object[]) this.f5719h.clone();
            return c0585e;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final String toString() {
        if (this.f5717f) {
            a();
        }
        int i7 = this.f5720i;
        if (i7 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i7 * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f5720i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            if (this.f5717f) {
                a();
            }
            sb.append(this.f5718g[i8]);
            sb.append('=');
            if (this.f5717f) {
                a();
            }
            Object obj = this.f5719h[i8];
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
