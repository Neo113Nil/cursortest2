package androidx.collection;

import com.ironsource.cc;

/* loaded from: classes.dex */
public class d implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f11028f = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f11029b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f11030c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f11031d;

    /* renamed from: e, reason: collision with root package name */
    private int f11032e;

    public d() {
        this(10);
    }

    private void h() {
        int i4 = this.f11032e;
        long[] jArr = this.f11030c;
        Object[] objArr = this.f11031d;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f11028f) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f11029b = false;
        this.f11032e = i5;
    }

    public void a() {
        int i4 = this.f11032e;
        Object[] objArr = this.f11031d;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f11032e = 0;
        this.f11029b = false;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f11030c = (long[]) this.f11030c.clone();
            dVar.f11031d = (Object[]) this.f11031d.clone();
            return dVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public Object i(long j4) {
        return j(j4, null);
    }

    public Object j(long j4, Object obj) {
        Object obj2;
        int b4 = c.b(this.f11030c, this.f11032e, j4);
        return (b4 < 0 || (obj2 = this.f11031d[b4]) == f11028f) ? obj : obj2;
    }

    public int k(long j4) {
        if (this.f11029b) {
            h();
        }
        return c.b(this.f11030c, this.f11032e, j4);
    }

    public long l(int i4) {
        if (this.f11029b) {
            h();
        }
        return this.f11030c[i4];
    }

    public void m(long j4, Object obj) {
        int b4 = c.b(this.f11030c, this.f11032e, j4);
        if (b4 >= 0) {
            this.f11031d[b4] = obj;
            return;
        }
        int i4 = ~b4;
        int i5 = this.f11032e;
        if (i4 < i5) {
            Object[] objArr = this.f11031d;
            if (objArr[i4] == f11028f) {
                this.f11030c[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f11029b && i5 >= this.f11030c.length) {
            h();
            i4 = ~c.b(this.f11030c, this.f11032e, j4);
        }
        int i6 = this.f11032e;
        if (i6 >= this.f11030c.length) {
            int f4 = c.f(i6 + 1);
            long[] jArr = new long[f4];
            Object[] objArr2 = new Object[f4];
            long[] jArr2 = this.f11030c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f11031d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11030c = jArr;
            this.f11031d = objArr2;
        }
        int i7 = this.f11032e;
        if (i7 - i4 != 0) {
            long[] jArr3 = this.f11030c;
            int i8 = i4 + 1;
            System.arraycopy(jArr3, i4, jArr3, i8, i7 - i4);
            Object[] objArr4 = this.f11031d;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f11032e - i4);
        }
        this.f11030c[i4] = j4;
        this.f11031d[i4] = obj;
        this.f11032e++;
    }

    public void n(long j4) {
        int b4 = c.b(this.f11030c, this.f11032e, j4);
        if (b4 >= 0) {
            Object[] objArr = this.f11031d;
            Object obj = objArr[b4];
            Object obj2 = f11028f;
            if (obj != obj2) {
                objArr[b4] = obj2;
                this.f11029b = true;
            }
        }
    }

    public void o(int i4) {
        Object[] objArr = this.f11031d;
        Object obj = objArr[i4];
        Object obj2 = f11028f;
        if (obj != obj2) {
            objArr[i4] = obj2;
            this.f11029b = true;
        }
    }

    public int p() {
        if (this.f11029b) {
            h();
        }
        return this.f11032e;
    }

    public Object q(int i4) {
        if (this.f11029b) {
            h();
        }
        return this.f11031d[i4];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11032e * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f11032e; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(l(i4));
            sb.append(cc.f15727T);
            Object q4 = q(i4);
            if (q4 != this) {
                sb.append(q4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public d(int i4) {
        this.f11029b = false;
        if (i4 == 0) {
            this.f11030c = c.f11026b;
            this.f11031d = c.f11027c;
        } else {
            int f4 = c.f(i4);
            this.f11030c = new long[f4];
            this.f11031d = new Object[f4];
        }
    }
}
