package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.Arrays;
import l.x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public int f22a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f23b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24c;

    public b1(ImageView imageView) {
        this.f23b = imageView;
    }

    public void a() {
        x1 x1Var;
        ImageView imageView = (ImageView) this.f23b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            l.r0.a(drawable);
        }
        if (drawable == null || (x1Var = (x1) this.f24c) == null) {
            return;
        }
        l.s.d(drawable, x1Var, imageView.getDrawableState());
    }

    public j b(int i) {
        if (i < 0 || i >= this.f22a) {
            StringBuilder l3 = q.l("Index ", i, ", size ");
            l3.append(this.f22a);
            w.a.d(l3.toString());
        }
        j jVar = (j) this.f24c;
        if (jVar != null) {
            int i8 = jVar.f98a;
            if (i < jVar.f99b + i8 && i8 <= i) {
                return jVar;
            }
        }
        o0.e eVar = (o0.e) this.f23b;
        j jVar2 = (j) eVar.f5578d[g0.e(i, eVar)];
        this.f24c = jVar2;
        return jVar2;
    }

    public int c(Object obj) {
        o.d0 d0Var = (o.d0) this.f23b;
        int d8 = d0Var.d(obj);
        if (d8 >= 0) {
            return d0Var.f5436c[d8];
        }
        return -1;
    }

    public void d(int i, int i8, int i9, int i10, int i11, int i12, boolean z3, boolean z7) {
        long[] jArr = (long[]) this.f23b;
        int i13 = this.f22a;
        int i14 = i13 + 3;
        this.f22a = i14;
        int length = jArr.length;
        if (length <= i14) {
            int max = Math.max(length * 2, i14);
            long[] copyOf = Arrays.copyOf(jArr, max);
            q6.i.d(copyOf, "copyOf(...)");
            this.f23b = copyOf;
            long[] copyOf2 = Arrays.copyOf((long[]) this.f24c, max);
            q6.i.d(copyOf2, "copyOf(...)");
            this.f24c = copyOf2;
        }
        long[] jArr2 = (long[]) this.f23b;
        jArr2[i13] = (i8 << 32) | (i9 & 4294967295L);
        jArr2[i13 + 1] = (i10 << 32) | (i11 & 4294967295L);
        int i15 = i12 & 67108863;
        jArr2[i13 + 2] = ((z7 ? 1L : 0L) << 63) | ((z3 ? 1L : 0L) << 62) | (1 << 61) | (Math.min(0, 511) << 52) | (i15 << 26) | (i & 67108863);
        if (i12 < 0) {
            return;
        }
        for (int i16 = i13 - 3; i16 >= 0; i16 -= 3) {
            int i17 = i16 + 2;
            long j7 = jArr2[i17];
            if ((((int) j7) & 67108863) == i15) {
                jArr2[i17] = (j7 & (-2301339409586323457L)) | (Math.min(i13 - i16, 511) << 52);
                return;
            }
        }
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f23b;
        Context context = imageView.getContext();
        int[] iArr = h.a.f3053e;
        g1 E = g1.E(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) E.f85c;
        q3.k0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) E.f85c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = h0.a.D(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                l.r0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(E.p(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(l.r0.b(typedArray.getInt(3, -1), null));
            }
            E.G();
        } catch (Throwable th) {
            E.G();
            throw th;
        }
    }

    public void f(int i, p6.g gVar) {
        int i8 = i & 67108863;
        long[] jArr = (long[]) this.f23b;
        int i9 = this.f22a;
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
            if ((((int) jArr[i10 + 2]) & 67108863) == i8) {
                long j7 = jArr[i10];
                long j8 = jArr[i10 + 1];
                gVar.j(Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) j7), Integer.valueOf((int) (j8 >> 32)), Integer.valueOf((int) j8));
                return;
            }
        }
    }
}
