package s;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f8373d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int[] f8374e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f8375i;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f8376r;

    public s0(int i3) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f8374e = new int[i13];
        this.f8375i = new Object[i13];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s0 clone() {
        Object clone = super.clone();
        clone.getClass();
        s0 s0Var = (s0) clone;
        s0Var.f8374e = (int[]) this.f8374e.clone();
        s0Var.f8375i = (Object[]) this.f8375i.clone();
        return s0Var;
    }

    public final boolean b(int i3) {
        if (this.f8373d) {
            q.a(this);
        }
        return t.a.a(this.f8376r, i3, this.f8374e) >= 0;
    }

    public final Object c(int i3) {
        Object obj;
        int a9 = t.a.a(this.f8376r, i3, this.f8374e);
        if (a9 < 0 || (obj = this.f8375i[a9]) == q.f8359c) {
            return null;
        }
        return obj;
    }

    public final int d(int i3) {
        if (this.f8373d) {
            q.a(this);
        }
        return this.f8374e[i3];
    }

    public final void e(int i3, Object obj) {
        int a9 = t.a.a(this.f8376r, i3, this.f8374e);
        if (a9 >= 0) {
            this.f8375i[a9] = obj;
            return;
        }
        int i10 = ~a9;
        int i11 = this.f8376r;
        if (i10 < i11) {
            Object[] objArr = this.f8375i;
            if (objArr[i10] == q.f8359c) {
                this.f8374e[i10] = i3;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f8373d && i11 >= this.f8374e.length) {
            q.a(this);
            i10 = ~t.a.a(this.f8376r, i3, this.f8374e);
        }
        int i12 = this.f8376r;
        if (i12 >= this.f8374e.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            this.f8374e = Arrays.copyOf(this.f8374e, i16);
            this.f8375i = Arrays.copyOf(this.f8375i, i16);
        }
        int i17 = this.f8376r;
        if (i17 - i10 != 0) {
            int[] iArr = this.f8374e;
            int i18 = i10 + 1;
            kotlin.collections.v.c(i18, i10, i17, iArr, iArr);
            Object[] objArr2 = this.f8375i;
            kotlin.collections.v.d(i18, i10, this.f8376r, objArr2, objArr2);
        }
        this.f8374e[i10] = i3;
        this.f8375i[i10] = obj;
        this.f8376r++;
    }

    public final int f() {
        if (this.f8373d) {
            q.a(this);
        }
        return this.f8376r;
    }

    public final Object g(int i3) {
        if (this.f8373d) {
            q.a(this);
        }
        Object[] objArr = this.f8375i;
        if (i3 < objArr.length) {
            return objArr[i3];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8376r * 28);
        sb2.append('{');
        int i3 = this.f8376r;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i10));
            sb2.append('=');
            Object g = g(i10);
            if (g != this) {
                sb2.append(g);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
