package n;

/* renamed from: n.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277j implements Cloneable {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f3258h = new Object();

    /* renamed from: e, reason: collision with root package name */
    public int[] f3259e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f3260f;

    /* renamed from: g, reason: collision with root package name */
    public int f3261g;

    public C0277j() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f3259e = new int[i5];
        this.f3260f = new Object[i5];
    }

    public final void a(int i2, Object obj) {
        int i3 = this.f3261g;
        if (i3 != 0 && i2 <= this.f3259e[i3 - 1]) {
            d(i2, obj);
            return;
        }
        if (i3 >= this.f3259e.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.f3259e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f3260f;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f3259e = iArr;
            this.f3260f = objArr;
        }
        this.f3259e[i3] = i2;
        this.f3260f[i3] = obj;
        this.f3261g = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0277j clone() {
        try {
            C0277j c0277j = (C0277j) super.clone();
            c0277j.f3259e = (int[]) this.f3259e.clone();
            c0277j.f3260f = (Object[]) this.f3260f.clone();
            return c0277j;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final Object c(int i2, Integer num) {
        Object obj;
        int a2 = AbstractC0269b.a(this.f3261g, i2, this.f3259e);
        return (a2 < 0 || (obj = this.f3260f[a2]) == f3258h) ? num : obj;
    }

    public final void d(int i2, Object obj) {
        int a2 = AbstractC0269b.a(this.f3261g, i2, this.f3259e);
        if (a2 >= 0) {
            this.f3260f[a2] = obj;
            return;
        }
        int i3 = ~a2;
        int i4 = this.f3261g;
        if (i3 < i4) {
            Object[] objArr = this.f3260f;
            if (objArr[i3] == f3258h) {
                this.f3259e[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f3259e.length) {
            int i5 = (i4 + 1) * 4;
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
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f3259e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3260f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3259e = iArr;
            this.f3260f = objArr2;
        }
        int i9 = this.f3261g - i3;
        if (i9 != 0) {
            int[] iArr3 = this.f3259e;
            int i10 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i10, i9);
            Object[] objArr4 = this.f3260f;
            System.arraycopy(objArr4, i3, objArr4, i10, this.f3261g - i3);
        }
        this.f3259e[i3] = i2;
        this.f3260f[i3] = obj;
        this.f3261g++;
    }

    public final String toString() {
        int i2 = this.f3261g;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f3261g; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f3259e[i3]);
            sb.append('=');
            Object obj = this.f3260f[i3];
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
