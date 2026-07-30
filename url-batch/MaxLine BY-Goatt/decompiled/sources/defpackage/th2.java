package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class th2 {
    public th2() {
        new ConcurrentHashMap();
    }

    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            i21.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = jw2.c;
        return j;
    }

    public static final long b(long j, int i) {
        int i2 = jw2.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : a(i4, i);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            i21.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            i21.a("invalid end value");
        }
        if (i3 < 0) {
            i21.a("invalid maxLines value");
        }
        if (i < 0) {
            i21.a("invalid width value");
        }
        if (i4 < 0) {
            i21.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            k31.B(obtain, i5);
        }
        if (i10 >= 28) {
            km.w(obtain);
        }
        if (i10 >= 33) {
            d2.l(obtain, i7, i8);
        }
        if (i10 >= 35) {
            sf0.a(obtain);
        }
        return obtain.build();
    }

    public static final boolean h(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return Intrinsics.b(up2.K(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static mq0 i(mq0[] mq0VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        mq0 mq0Var = null;
        int i3 = Integer.MAX_VALUE;
        for (mq0 mq0Var2 : mq0VarArr) {
            int abs = (Math.abs(mq0Var2.c - i2) * 2) + (mq0Var2.d == z ? 0 : 1);
            if (mq0Var == null || i3 > abs) {
                mq0Var = mq0Var2;
                i3 = abs;
            }
        }
        return mq0Var;
    }

    public static final String j(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? np2.b(zv.A(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static mm k(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new mm(k31.l(view));
        }
        return null;
    }

    public static final Object l(sh2 sh2Var, ji2 ji2Var) {
        Object g = sh2Var.m.g(ji2Var);
        if (g == null) {
            return null;
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List m(zl2 zl2Var, int i, zl2 zl2Var2, boolean z, boolean z2, boolean z3) {
        ah0 ah0Var;
        boolean z4;
        int i2;
        int i3;
        int t = zl2Var.t(i);
        int i4 = i + t;
        int f = zl2Var.f(i);
        int f2 = zl2Var.f(i4);
        int i5 = f2 - f;
        boolean z5 = i >= 0 && (zl2Var.b[(zl2Var.r(i) * 5) + 1] & 201326592) != 0;
        zl2Var2.v(t);
        zl2Var2.w(i5, zl2Var2.t);
        if (zl2Var.g < i4) {
            zl2Var.A(i4);
        }
        if (zl2Var.k < f2) {
            zl2Var.B(f2, i4);
        }
        int[] iArr = zl2Var2.b;
        int i6 = zl2Var2.t;
        int i7 = i6 * 5;
        ni.d(i7, i * 5, i4 * 5, zl2Var.b, iArr);
        Object[] objArr = zl2Var2.c;
        int i8 = zl2Var2.i;
        System.arraycopy(zl2Var.c, f, objArr, i8, i5);
        int i9 = zl2Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + t;
        int g = i8 - zl2Var2.g(iArr, i6);
        int i12 = zl2Var2.m;
        int i13 = zl2Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int g2 = zl2Var2.g(iArr, i15) + g;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = zl2Var2.k;
            }
            iArr2[(i15 * 5) + 4] = zl2.i(g2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        zl2Var2.m = i14;
        int a = yl2.a(zl2Var.d, i, zl2Var.p());
        int a2 = yl2.a(zl2Var.d, i4, zl2Var.p());
        if (a < a2) {
            ArrayList arrayList = zl2Var.d;
            ArrayList arrayList2 = new ArrayList(a2 - a);
            for (int i17 = a; i17 < a2; i17++) {
                m6 m6Var = (m6) arrayList.get(i17);
                m6Var.a += i10;
                arrayList2.add(m6Var);
            }
            zl2Var2.d.addAll(yl2.a(zl2Var2.d, zl2Var2.t, zl2Var2.p()), arrayList2);
            arrayList.subList(a, a2).clear();
            ah0Var = arrayList2;
        } else {
            ah0Var = ah0.m;
        }
        if (!ah0Var.isEmpty()) {
            HashMap hashMap = zl2Var.e;
            HashMap hashMap2 = zl2Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = ah0Var.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = zl2Var2.v;
        zl2Var2.N(i9);
        int D = zl2Var.D(zl2Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = D >= 0;
            if (z7) {
                zl2Var.O();
                zl2Var.a(D - zl2Var.t);
                zl2Var.O();
            }
            zl2Var.a(i - zl2Var.t);
            boolean G = zl2Var.G();
            if (z7) {
                zl2Var.L();
                zl2Var.j();
                zl2Var.L();
                zl2Var.j();
            }
            z4 = G;
        } else {
            boolean H = zl2Var.H(i, t);
            zl2Var.I(f, i5, i - 1);
            z4 = H;
        }
        if (z4) {
            b00.c("Unexpectedly removed anchors");
        }
        int i20 = zl2Var2.o;
        int i21 = iArr3[i7 + 1];
        zl2Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            zl2Var2.t = i11;
            zl2Var2.i = i8 + i5;
        }
        if (z6) {
            zl2Var2.S(i9);
        }
        return ah0Var;
    }

    public static final Object n(r30 r30Var) {
        Object obj;
        CoroutineContext context = r30Var.getContext();
        l41.C(context);
        o30 b = q41.b(r30Var);
        pb0 pb0Var = b instanceof pb0 ? (pb0) b : null;
        if (pb0Var == null) {
            obj = Unit.a;
        } else {
            t40 t40Var = pb0Var.p;
            if (t40Var.P(context)) {
                pb0Var.r = Unit.a;
                pb0Var.o = 1;
                t40Var.O(context, pb0Var);
            } else {
                n93 n93Var = new n93(n93.o);
                CoroutineContext p = context.p(n93Var);
                Unit unit = Unit.a;
                pb0Var.r = unit;
                pb0Var.o = 1;
                t40Var.O(p, pb0Var);
                if (n93Var.n) {
                    pi0 a = bx2.a();
                    bi biVar = a.q;
                    if (!(biVar != null ? biVar.isEmpty() : true)) {
                        if (a.o >= 4294967296L) {
                            pb0Var.r = unit;
                            pb0Var.o = 1;
                            a.S(pb0Var);
                            obj = b50.m;
                        } else {
                            a.T(true);
                            try {
                                pb0Var.run();
                                do {
                                } while (a.V());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.a;
                }
            }
            obj = b50.m;
        }
        return obj == b50.m ? obj : Unit.a;
    }

    public static String o(Context context, String str) {
        ll3.v(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = gk2.h(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String p(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public abstract Typeface d(Context context, zp0 zp0Var, Resources resources, int i);

    public abstract Typeface e(Context context, mq0[] mq0VarArr, int i);

    public Typeface f(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface g(Context context, Resources resources, int i, String str, int i2) {
        File k = yh2.k(context);
        if (k == null) {
            return null;
        }
        try {
            if (yh2.g(k, resources, i)) {
                return Typeface.createFromFile(k.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            k.delete();
        }
    }
}
