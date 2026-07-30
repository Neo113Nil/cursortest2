package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yf implements nb1 {
    public final /* synthetic */ int m;
    public int n;
    public Object o;
    public Object p;

    public yf(IntRange intRange, s03 s03Var) {
        this.m = 4;
        yf w = s03Var.w();
        int i = intRange.m;
        if (i < 0) {
            lh.g("negative nearestRange.first");
            throw null;
        }
        int min = Math.min(intRange.n, w.n - 1);
        if (min < i) {
            hn1 hn1Var = nt1.a;
            hn1Var.getClass();
            this.o = hn1Var;
            this.p = new Object[0];
            this.n = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.p = new Object[i2];
        this.n = i;
        hn1 hn1Var2 = new hn1(i2);
        tc tcVar = new tc(i, min, hn1Var2, this);
        eo1 eo1Var = (eo1) w.o;
        w.e(i);
        w.e(min);
        if (min < i) {
            throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')').toString());
        }
        int i3 = j8.i(i, eo1Var);
        int i4 = ((g41) eo1Var.m[i3]).a;
        while (i4 <= min) {
            g41 g41Var = (g41) eo1Var.m[i3];
            tcVar.invoke(g41Var);
            i4 += g41Var.b;
            i3++;
        }
        this.o = hn1Var2;
    }

    @Override // defpackage.nb1
    public int a(Object obj) {
        hn1 hn1Var = (hn1) this.o;
        int d = hn1Var.d(obj);
        if (d >= 0) {
            return hn1Var.c[d];
        }
        return -1;
    }

    public void b(int i, fb1 fb1Var) {
        if (i < 0) {
            lh.c(in1.k(i, "size should be >=0, but was "));
        } else {
            if (i == 0) {
                return;
            }
            g41 g41Var = new g41(this.n, i, fb1Var);
            this.n += i;
            ((eo1) this.o).b(g41Var);
        }
    }

    public void c() {
        e10 e10Var;
        ImageView imageView = (ImageView) this.o;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            he0.a(drawable);
        }
        if (drawable == null || (e10Var = (e10) this.p) == null) {
            return;
        }
        tf.d(drawable, e10Var, imageView.getDrawableState());
    }

    public n82 d() {
        l11 l11Var = (l11) this.p;
        if (l11Var != null) {
            throw l11Var.a();
        }
        n82 b = n82.b(this.n, (Object[]) this.o, this);
        l11 l11Var2 = (l11) this.p;
        if (l11Var2 == null) {
            return b;
        }
        throw l11Var2.a();
    }

    public void e(int i) {
        if (i < 0 || i >= this.n) {
            ey.d(this.n, in1.n(i, "Index ", ", size "));
        }
    }

    public g41 f(int i) {
        e(i);
        g41 g41Var = (g41) this.p;
        if (g41Var != null) {
            int i2 = g41Var.a;
            if (i < g41Var.b + i2 && i2 <= i) {
                return g41Var;
            }
        }
        eo1 eo1Var = (eo1) this.o;
        g41 g41Var2 = (g41) eo1Var.m[j8.i(i, eo1Var)];
        this.p = g41Var2;
        return g41Var2;
    }

    public Object g(int i) {
        Object[] objArr = (Object[]) this.p;
        int i2 = i - this.n;
        if (i2 < 0 || i2 > oi.s(objArr)) {
            return null;
        }
        return objArr[i2];
    }

    public void h(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        long[] jArr = (long[]) this.o;
        int i7 = this.n;
        int i8 = i7 + 3;
        this.n = i8;
        int length = jArr.length;
        if (length <= i8) {
            int max = Math.max(length * 2, i8);
            this.o = Arrays.copyOf(jArr, max);
            this.p = Arrays.copyOf((long[]) this.p, max);
        }
        long[] jArr2 = (long[]) this.o;
        jArr2[i7] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i7 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = ((z2 ? 1L : 0L) << 63) | ((z ? 1L : 0L) << 62) | 2305843009213693952L | (i9 << 26) | (i & 67108863);
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = (j & (-2301339409586323457L)) | (((i7 - i10) & 511) << 52);
                return;
            }
        }
    }

    public void i(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.o;
        Context context = imageView.getContext();
        int[] iArr = b62.f;
        mh z = mh.z(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) z.n;
        e53.h(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) z.n, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = j8.F(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                he0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(z.p(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(he0.b(typedArray.getInt(3, -1), null));
            }
            z.B();
        } catch (Throwable th) {
            z.B();
            throw th;
        }
    }

    public void j(Object obj, Object obj2) {
        int i = (this.n + 1) * 2;
        Object[] objArr = (Object[]) this.o;
        if (i > objArr.length) {
            this.o = Arrays.copyOf(objArr, iv1.x(objArr.length, i));
        }
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
        Object[] objArr2 = (Object[]) this.o;
        int i2 = this.n;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.n = i2 + 1;
    }

    public void k(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.n) * 2;
            Object[] objArr = (Object[]) this.o;
            if (size > objArr.length) {
                this.o = Arrays.copyOf(objArr, iv1.x(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j(entry.getKey(), entry.getValue());
        }
    }

    public void l(int i, yt0 yt0Var) {
        int i2 = i & 67108863;
        long[] jArr = (long[]) this.o;
        int i3 = this.n;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                yt0Var.b(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public String toString() {
        switch (this.m) {
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                StringBuilder sb = new StringBuilder();
                if (((s52) this.o) == s52.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.n);
                sb.append(' ');
                sb.append((String) this.p);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public yf(s52 s52Var, int i, String str) {
        this.m = 7;
        this.o = s52Var;
        this.n = i;
        this.p = str;
    }

    public yf(ImageView imageView) {
        this.m = 0;
        this.n = 0;
        this.o = imageView;
    }

    public /* synthetic */ yf(int i, byte b) {
        this.m = i;
    }

    public yf() {
        this.m = 3;
        this.o = new eo1(new g41[16]);
    }

    public yf(g53 g53Var) {
        this.m = 1;
        this.o = g53Var;
    }

    public yf(int i) {
        this.m = 2;
        this.o = new Object[i * 2];
        this.n = 0;
    }
}
