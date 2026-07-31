package q;

/* renamed from: q.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592l implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f5745i = new Object();

    /* renamed from: f, reason: collision with root package name */
    public int[] f5746f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f5747g;

    /* renamed from: h, reason: collision with root package name */
    public int f5748h;

    public final void a(int i7, Object obj) {
        int i8 = this.f5748h;
        if (i8 == 0 || i7 > this.f5746f[i8 - 1]) {
            if (i8 >= this.f5746f.length) {
                int i9 = (i8 + 1) * 4;
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
                int[] iArr2 = this.f5746f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f5747g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f5746f = iArr;
                this.f5747g = objArr;
            }
            this.f5746f[i8] = i7;
            this.f5747g[i8] = obj;
            this.f5748h = i8 + 1;
            return;
        }
        int a7 = AbstractC0584d.a(this.f5748h, i7, this.f5746f);
        if (a7 >= 0) {
            this.f5747g[a7] = obj;
            return;
        }
        int i13 = ~a7;
        int i14 = this.f5748h;
        if (i13 < i14) {
            Object[] objArr3 = this.f5747g;
            if (objArr3[i13] == f5745i) {
                this.f5746f[i13] = i7;
                objArr3[i13] = obj;
                return;
            }
        }
        if (i14 >= this.f5746f.length) {
            int i15 = (i14 + 1) * 4;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 4;
            int[] iArr3 = new int[i18];
            Object[] objArr4 = new Object[i18];
            int[] iArr4 = this.f5746f;
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            Object[] objArr5 = this.f5747g;
            System.arraycopy(objArr5, 0, objArr4, 0, objArr5.length);
            this.f5746f = iArr3;
            this.f5747g = objArr4;
        }
        int i19 = this.f5748h - i13;
        if (i19 != 0) {
            int[] iArr5 = this.f5746f;
            int i20 = i13 + 1;
            System.arraycopy(iArr5, i13, iArr5, i20, i19);
            Object[] objArr6 = this.f5747g;
            System.arraycopy(objArr6, i13, objArr6, i20, this.f5748h - i13);
        }
        this.f5746f[i13] = i7;
        this.f5747g[i13] = obj;
        this.f5748h++;
    }

    public final Object clone() {
        try {
            C0592l c0592l = (C0592l) super.clone();
            c0592l.f5746f = (int[]) this.f5746f.clone();
            c0592l.f5747g = (Object[]) this.f5747g.clone();
            return c0592l;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final String toString() {
        int i7 = this.f5748h;
        if (i7 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i7 * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f5748h; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(this.f5746f[i8]);
            sb.append('=');
            Object obj = this.f5747g[i8];
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
