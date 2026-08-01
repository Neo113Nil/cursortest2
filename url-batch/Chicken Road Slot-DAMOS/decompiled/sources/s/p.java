package s;

import java.util.Arrays;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f8352d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ long[] f8353e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f8354i;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f8355r;

    public p(int i3) {
        if (i3 == 0) {
            this.f8353e = t.a.f9194b;
            this.f8354i = t.a.f9195c;
            return;
        }
        int i10 = i3 * 8;
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
        this.f8353e = new long[i13];
        this.f8354i = new Object[i13];
    }

    public final void a() {
        int i3 = this.f8355r;
        Object[] objArr = this.f8354i;
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = null;
        }
        this.f8355r = 0;
        this.f8352d = false;
    }

    public final Object b(long j) {
        Object obj;
        int b10 = t.a.b(this.f8353e, this.f8355r, j);
        if (b10 < 0 || (obj = this.f8354i[b10]) == q.f8357a) {
            return null;
        }
        return obj;
    }

    public final long c(int i3) {
        int i10;
        if (i3 < 0 || i3 >= (i10 = this.f8355r)) {
            a1.e(v4.a.j(i3, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.f8352d) {
            long[] jArr = this.f8353e;
            Object[] objArr = this.f8354i;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != q.f8357a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f8352d = false;
            this.f8355r = i11;
        }
        return this.f8353e[i3];
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        p pVar = (p) clone;
        pVar.f8353e = (long[]) this.f8353e.clone();
        pVar.f8354i = (Object[]) this.f8354i.clone();
        return pVar;
    }

    public final void d(long j, Object obj) {
        Object obj2 = q.f8357a;
        int b10 = t.a.b(this.f8353e, this.f8355r, j);
        if (b10 >= 0) {
            this.f8354i[b10] = obj;
            return;
        }
        int i3 = ~b10;
        int i10 = this.f8355r;
        if (i3 < i10) {
            Object[] objArr = this.f8354i;
            if (objArr[i3] == obj2) {
                this.f8353e[i3] = j;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f8352d) {
            long[] jArr = this.f8353e;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f8354i;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f8352d = false;
                this.f8355r = i11;
                i3 = ~t.a.b(this.f8353e, i11, j);
            }
        }
        int i13 = this.f8355r;
        if (i13 >= this.f8353e.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            this.f8353e = Arrays.copyOf(this.f8353e, i17);
            this.f8354i = Arrays.copyOf(this.f8354i, i17);
        }
        int i18 = this.f8355r;
        if (i18 - i3 != 0) {
            long[] jArr2 = this.f8353e;
            int i19 = i3 + 1;
            kotlin.collections.v.e(jArr2, jArr2, i19, i3, i18);
            Object[] objArr3 = this.f8354i;
            kotlin.collections.v.d(i19, i3, this.f8355r, objArr3, objArr3);
        }
        this.f8353e[i3] = j;
        this.f8354i[i3] = obj;
        this.f8355r++;
    }

    public final void e(long j) {
        int b10 = t.a.b(this.f8353e, this.f8355r, j);
        if (b10 >= 0) {
            Object[] objArr = this.f8354i;
            Object obj = objArr[b10];
            Object obj2 = q.f8357a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f8352d = true;
            }
        }
    }

    public final int f() {
        if (this.f8352d) {
            int i3 = this.f8355r;
            long[] jArr = this.f8353e;
            Object[] objArr = this.f8354i;
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                Object obj = objArr[i11];
                if (obj != q.f8357a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f8352d = false;
            this.f8355r = i10;
        }
        return this.f8355r;
    }

    public final Object g(int i3) {
        int i10;
        if (i3 < 0 || i3 >= (i10 = this.f8355r)) {
            a1.e(v4.a.j(i3, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.f8352d) {
            long[] jArr = this.f8353e;
            Object[] objArr = this.f8354i;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != q.f8357a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f8352d = false;
            this.f8355r = i11;
        }
        return this.f8354i[i3];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8355r * 28);
        sb2.append('{');
        int i3 = this.f8355r;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(c(i10));
            sb2.append('=');
            Object g = g(i10);
            if (g != sb2) {
                sb2.append(g);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ p(Object obj) {
        this(10);
    }
}
