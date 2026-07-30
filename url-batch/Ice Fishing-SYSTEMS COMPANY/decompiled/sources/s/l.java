package s;

/* loaded from: classes.dex */
public final class l implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f40410w = new Object();

    /* renamed from: n, reason: collision with root package name */
    public int[] f40411n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f40412u;

    /* renamed from: v, reason: collision with root package name */
    public int f40413v;

    public l() {
        int i;
        int i4 = 4;
        while (true) {
            i = 40;
            if (i4 >= 32) {
                break;
            }
            int i9 = (1 << i4) - 12;
            if (40 <= i9) {
                i = i9;
                break;
            }
            i4++;
        }
        int i10 = i / 4;
        this.f40411n = new int[i10];
        this.f40412u = new Object[i10];
    }

    public final void a(int i, Object obj) {
        int i4 = this.f40413v;
        if (i4 != 0 && i <= this.f40411n[i4 - 1]) {
            c(i, obj);
            return;
        }
        if (i4 >= this.f40411n.length) {
            int i9 = (i4 + 1) * 4;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 4;
            int[] iArr = new int[i12];
            Object[] objArr = new Object[i12];
            int[] iArr2 = this.f40411n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f40412u;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f40411n = iArr;
            this.f40412u = objArr;
        }
        this.f40411n[i4] = i;
        this.f40412u[i4] = obj;
        this.f40413v = i4 + 1;
    }

    public final Object b(int i, Integer num) {
        Object obj;
        int a9 = d.a(this.f40413v, i, this.f40411n);
        return (a9 < 0 || (obj = this.f40412u[a9]) == f40410w) ? num : obj;
    }

    public final void c(int i, Object obj) {
        int a9 = d.a(this.f40413v, i, this.f40411n);
        if (a9 >= 0) {
            this.f40412u[a9] = obj;
            return;
        }
        int i4 = ~a9;
        int i9 = this.f40413v;
        if (i4 < i9) {
            Object[] objArr = this.f40412u;
            if (objArr[i4] == f40410w) {
                this.f40411n[i4] = i;
                objArr[i4] = obj;
                return;
            }
        }
        if (i9 >= this.f40411n.length) {
            int i10 = (i9 + 1) * 4;
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
            int i13 = i10 / 4;
            int[] iArr = new int[i13];
            Object[] objArr2 = new Object[i13];
            int[] iArr2 = this.f40411n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f40412u;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f40411n = iArr;
            this.f40412u = objArr2;
        }
        int i14 = this.f40413v - i4;
        if (i14 != 0) {
            int[] iArr3 = this.f40411n;
            int i15 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i15, i14);
            Object[] objArr4 = this.f40412u;
            System.arraycopy(objArr4, i4, objArr4, i15, this.f40413v - i4);
        }
        this.f40411n[i4] = i;
        this.f40412u[i4] = obj;
        this.f40413v++;
    }

    public final Object clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f40411n = (int[]) this.f40411n.clone();
            lVar.f40412u = (Object[]) this.f40412u.clone();
            return lVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final String toString() {
        int i = this.f40413v;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f40413v; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f40411n[i4]);
            sb.append('=');
            Object obj = this.f40412u[i4];
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
