package b1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import m.q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f953a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f954b;

    /* renamed from: c, reason: collision with root package name */
    public Object f955c;

    public c0(int i3) {
        this.f954b = new Object[i3 * 2];
    }

    public void a() {
        q1 q1Var;
        ImageView imageView = (ImageView) this.f954b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m.k0.a(drawable);
        }
        if (drawable == null || (q1Var = (q1) this.f955c) == null) {
            return;
        }
        m.o.c(drawable, q1Var, imageView.getDrawableState());
    }

    public b8.x b(boolean z10) {
        b8.h hVar;
        b8.h hVar2;
        if (z10 && (hVar2 = (b8.h) this.f955c) != null) {
            throw hVar2.a();
        }
        b8.x a9 = b8.x.a(this.f953a, (Object[]) this.f954b, this);
        if (!z10 || (hVar = (b8.h) this.f955c) == null) {
            return a9;
        }
        throw hVar.a();
    }

    public MotionEvent c() {
        w7.m mVar = (w7.m) this.f955c;
        if (mVar != null) {
            return (MotionEvent) ((c6.c) mVar.f10131c).f1810i;
        }
        return null;
    }

    public void d(int i3, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, boolean z12, int i15) {
        long[] jArr = (long[]) this.f954b;
        int i16 = this.f953a;
        int i17 = i16 + 3;
        this.f953a = i17;
        int length = jArr.length;
        if (length <= i17) {
            int max = Math.max(length * 2, i17);
            this.f954b = Arrays.copyOf(jArr, max);
            this.f955c = Arrays.copyOf((long[]) this.f955c, max);
        }
        long[] jArr2 = (long[]) this.f954b;
        jArr2[i16] = (i10 << 32) | (i11 & 4294967295L);
        jArr2[i16 + 1] = (i12 << 32) | (i13 & 4294967295L);
        int i18 = i14 & 33554431;
        jArr2[i16 + 2] = ((z12 ? 1L : 0L) << 63) | ((z11 ? 1L : 0L) << 62) | ((z10 ? 1L : 0L) << 61) | (1 << 60) | (Math.min(0, 1023) << 50) | (i18 << 25) | (i3 & 33554431);
        if (i14 < 0) {
            return;
        }
        for (int i19 = i15 != -1 ? i15 : i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j = jArr2[i20];
            if ((((int) j) & 33554431) == i18) {
                jArr2[i20] = (j & k2.a.f5358a) | (Math.min((i16 - i19) / 3, 1023) << 50);
                return;
            }
        }
    }

    public void f(int i3) {
        int resourceId;
        ImageView imageView = (ImageView) this.f954b;
        Context context = imageView.getContext();
        int[] iArr = i.a.f4544e;
        a1.n z10 = a1.n.z(context, null, iArr, i3);
        TypedArray typedArray = (TypedArray) z10.f40e;
        o3.c0.c(imageView, imageView.getContext(), iArr, null, (TypedArray) z10.f40e, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = z4.w.v(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m.k0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(z10.q(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(m.k0.b(typedArray.getInt(3, -1), null));
            }
            z10.D();
        } catch (Throwable th) {
            z10.D();
            throw th;
        }
    }

    public void g(Object obj, Object obj2) {
        int i3 = (this.f953a + 1) * 2;
        Object[] objArr = (Object[]) this.f954b;
        if (i3 > objArr.length) {
            this.f954b = Arrays.copyOf(objArr, b8.a.b(objArr.length, i3));
        }
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(valueOf);
            throw new NullPointerException(sb2.toString());
        }
        if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 26);
            sb3.append("null value in entry: ");
            sb3.append(valueOf2);
            sb3.append("=null");
            throw new NullPointerException(sb3.toString());
        }
        Object[] objArr2 = (Object[]) this.f954b;
        int i10 = this.f953a;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f953a = i10 + 1;
    }

    public void h(b8.x xVar) {
        Set entrySet = xVar.entrySet();
        int size = (entrySet.size() + this.f953a) * 2;
        Object[] objArr = (Object[]) this.f954b;
        if (size > objArr.length) {
            this.f954b = Arrays.copyOf(objArr, b8.a.b(objArr.length, size));
        }
        b8.b0 it = ((b8.u) entrySet).iterator();
        while (true) {
            b8.d dVar = (b8.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) dVar.next();
            g(entry.getKey(), entry.getValue());
        }
    }

    public void i(int i3, int i10, long j) {
        int i11;
        char c10;
        char c11;
        long[] jArr = (long[]) this.f954b;
        long[] jArr2 = (long[]) this.f955c;
        jArr2[0] = j;
        int i12 = 1;
        while (i12 > 0) {
            i12--;
            long j3 = jArr2[i12];
            int i13 = 33554431;
            int i14 = ((int) j3) & 33554431;
            char c12 = 25;
            int i15 = ((int) (j3 >> 25)) & 33554431;
            char c13 = '2';
            int i16 = ((int) (j3 >> 50)) & 1023;
            int i17 = i16 == 1023 ? this.f953a : (i16 * 3) + i15;
            if (i15 < 0) {
                return;
            }
            while (i15 < jArr.length - 2 && i15 < i17) {
                int i18 = i15 + 2;
                long j10 = jArr[i18];
                if ((((int) (j10 >> c12)) & i13) == i14) {
                    long j11 = jArr[i15];
                    int i19 = i15 + 1;
                    i11 = i13;
                    c10 = c12;
                    long j12 = jArr[i19];
                    c11 = c13;
                    jArr[i15] = ((((int) j11) + i10) & 4294967295L) | ((((int) (j11 >> 32)) + i3) << 32);
                    jArr[i19] = ((((int) j12) + i10) & 4294967295L) | ((((int) (j12 >> 32)) + i3) << 32);
                    jArr[i18] = (((j10 >> 63) & 1) << 60) | j10;
                    if ((((int) (j10 >> c11)) & 1023) > 0) {
                        jArr2[i12] = (k2.a.f5359b & j10) | (((i15 + 3) & i11) << c10);
                        i12++;
                    }
                } else {
                    i11 = i13;
                    c10 = c12;
                    c11 = c13;
                }
                i15 += 3;
                i13 = i11;
                c12 = c10;
                c13 = c11;
            }
        }
    }

    public void j(int i3, vd.o oVar) {
        int i10 = i3 & 33554431;
        long[] jArr = (long[]) this.f954b;
        int i11 = this.f953a;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if ((((int) jArr[i12 + 2]) & 33554431) == i10) {
                long j = jArr[i12];
                long j3 = jArr[i12 + 1];
                oVar.c(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3));
                return;
            }
        }
    }

    public c0(ImageView imageView) {
        this.f954b = imageView;
    }
}
