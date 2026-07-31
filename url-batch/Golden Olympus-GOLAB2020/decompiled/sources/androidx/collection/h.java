package androidx.collection;

import com.ironsource.cc;

/* loaded from: classes.dex */
public class h implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f11055f = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f11056b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f11057c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f11058d;

    /* renamed from: e, reason: collision with root package name */
    private int f11059e;

    public h() {
        this(10);
    }

    private void i() {
        int i4 = this.f11059e;
        int[] iArr = this.f11057c;
        Object[] objArr = this.f11058d;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f11055f) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f11056b = false;
        this.f11059e = i5;
    }

    public void a(int i4, Object obj) {
        int i5 = this.f11059e;
        if (i5 != 0 && i4 <= this.f11057c[i5 - 1]) {
            n(i4, obj);
            return;
        }
        if (this.f11056b && i5 >= this.f11057c.length) {
            i();
        }
        int i6 = this.f11059e;
        if (i6 >= this.f11057c.length) {
            int e4 = c.e(i6 + 1);
            int[] iArr = new int[e4];
            Object[] objArr = new Object[e4];
            int[] iArr2 = this.f11057c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f11058d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f11057c = iArr;
            this.f11058d = objArr;
        }
        this.f11057c[i6] = i4;
        this.f11058d[i6] = obj;
        this.f11059e = i6 + 1;
    }

    public void e() {
        int i4 = this.f11059e;
        Object[] objArr = this.f11058d;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f11059e = 0;
        this.f11056b = false;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f11057c = (int[]) this.f11057c.clone();
            hVar.f11058d = (Object[]) this.f11058d.clone();
            return hVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public Object j(int i4) {
        return k(i4, null);
    }

    public Object k(int i4, Object obj) {
        Object obj2;
        int a4 = c.a(this.f11057c, this.f11059e, i4);
        return (a4 < 0 || (obj2 = this.f11058d[a4]) == f11055f) ? obj : obj2;
    }

    public int l(Object obj) {
        if (this.f11056b) {
            i();
        }
        for (int i4 = 0; i4 < this.f11059e; i4++) {
            if (this.f11058d[i4] == obj) {
                return i4;
            }
        }
        return -1;
    }

    public int m(int i4) {
        if (this.f11056b) {
            i();
        }
        return this.f11057c[i4];
    }

    public void n(int i4, Object obj) {
        int a4 = c.a(this.f11057c, this.f11059e, i4);
        if (a4 >= 0) {
            this.f11058d[a4] = obj;
            return;
        }
        int i5 = ~a4;
        int i6 = this.f11059e;
        if (i5 < i6) {
            Object[] objArr = this.f11058d;
            if (objArr[i5] == f11055f) {
                this.f11057c[i5] = i4;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f11056b && i6 >= this.f11057c.length) {
            i();
            i5 = ~c.a(this.f11057c, this.f11059e, i4);
        }
        int i7 = this.f11059e;
        if (i7 >= this.f11057c.length) {
            int e4 = c.e(i7 + 1);
            int[] iArr = new int[e4];
            Object[] objArr2 = new Object[e4];
            int[] iArr2 = this.f11057c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f11058d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11057c = iArr;
            this.f11058d = objArr2;
        }
        int i8 = this.f11059e;
        if (i8 - i5 != 0) {
            int[] iArr3 = this.f11057c;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr4 = this.f11058d;
            System.arraycopy(objArr4, i5, objArr4, i9, this.f11059e - i5);
        }
        this.f11057c[i5] = i4;
        this.f11058d[i5] = obj;
        this.f11059e++;
    }

    public int o() {
        if (this.f11056b) {
            i();
        }
        return this.f11059e;
    }

    public Object p(int i4) {
        if (this.f11056b) {
            i();
        }
        return this.f11058d[i4];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11059e * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f11059e; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(m(i4));
            sb.append(cc.f15727T);
            Object p4 = p(i4);
            if (p4 != this) {
                sb.append(p4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i4) {
        this.f11056b = false;
        if (i4 == 0) {
            this.f11057c = c.f11025a;
            this.f11058d = c.f11027c;
        } else {
            int e4 = c.e(i4);
            this.f11057c = new int[e4];
            this.f11058d = new Object[e4];
        }
    }
}
