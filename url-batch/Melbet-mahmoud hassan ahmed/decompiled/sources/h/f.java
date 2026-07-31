package h;

/* loaded from: classes.dex */
public class f<E> implements Cloneable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f16722j = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f16723f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f16724g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f16725h;

    /* renamed from: i, reason: collision with root package name */
    private int f16726i;

    public f() {
        this(10);
    }

    public f(int i7) {
        this.f16723f = false;
        if (i7 == 0) {
            this.f16724g = c.f16697a;
            this.f16725h = c.f16699c;
        } else {
            int d7 = c.d(i7);
            this.f16724g = new int[d7];
            this.f16725h = new Object[d7];
        }
    }

    private void e() {
        int i7 = this.f16726i;
        int[] iArr = this.f16724g;
        Object[] objArr = this.f16725h;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f16722j) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f16723f = false;
        this.f16726i = i8;
    }

    public void a() {
        int i7 = this.f16726i;
        Object[] objArr = this.f16725h;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f16726i = 0;
        this.f16723f = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f16724g = (int[]) this.f16724g.clone();
            fVar.f16725h = (Object[]) this.f16725h.clone();
            return fVar;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public E f(int i7) {
        return g(i7, null);
    }

    public E g(int i7, E e7) {
        int a7 = c.a(this.f16724g, this.f16726i, i7);
        if (a7 >= 0) {
            Object[] objArr = this.f16725h;
            if (objArr[a7] != f16722j) {
                return (E) objArr[a7];
            }
        }
        return e7;
    }

    public int h(int i7) {
        if (this.f16723f) {
            e();
        }
        return this.f16724g[i7];
    }

    public void i(int i7, E e7) {
        int a7 = c.a(this.f16724g, this.f16726i, i7);
        if (a7 >= 0) {
            this.f16725h[a7] = e7;
            return;
        }
        int i8 = a7 ^ (-1);
        int i9 = this.f16726i;
        if (i8 < i9) {
            Object[] objArr = this.f16725h;
            if (objArr[i8] == f16722j) {
                this.f16724g[i8] = i7;
                objArr[i8] = e7;
                return;
            }
        }
        if (this.f16723f && i9 >= this.f16724g.length) {
            e();
            i8 = c.a(this.f16724g, this.f16726i, i7) ^ (-1);
        }
        int i10 = this.f16726i;
        if (i10 >= this.f16724g.length) {
            int d7 = c.d(i10 + 1);
            int[] iArr = new int[d7];
            Object[] objArr2 = new Object[d7];
            int[] iArr2 = this.f16724g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f16725h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16724g = iArr;
            this.f16725h = objArr2;
        }
        int i11 = this.f16726i;
        if (i11 - i8 != 0) {
            int[] iArr3 = this.f16724g;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr4 = this.f16725h;
            System.arraycopy(objArr4, i8, objArr4, i12, this.f16726i - i8);
        }
        this.f16724g[i8] = i7;
        this.f16725h[i8] = e7;
        this.f16726i++;
    }

    public void j(int i7) {
        int a7 = c.a(this.f16724g, this.f16726i, i7);
        if (a7 >= 0) {
            Object[] objArr = this.f16725h;
            Object obj = objArr[a7];
            Object obj2 = f16722j;
            if (obj != obj2) {
                objArr[a7] = obj2;
                this.f16723f = true;
            }
        }
    }

    public int k() {
        if (this.f16723f) {
            e();
        }
        return this.f16726i;
    }

    public E l(int i7) {
        if (this.f16723f) {
            e();
        }
        return (E) this.f16725h[i7];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16726i * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f16726i; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(h(i7));
            sb.append('=');
            E l7 = l(i7);
            if (l7 != this) {
                sb.append(l7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
