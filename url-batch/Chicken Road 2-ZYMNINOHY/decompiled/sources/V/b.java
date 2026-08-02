package V;

import W.J;
import a.AbstractC0124a;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public static final String f3130A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f3131B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f3132C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f3133D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f3134E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f3135F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f3136G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f3137H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f3138I;

    /* renamed from: J, reason: collision with root package name */
    public static final String f3139J;

    /* renamed from: K, reason: collision with root package name */
    public static final String f3140K;
    public static final String L;

    /* renamed from: s, reason: collision with root package name */
    public static final String f3141s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f3142t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f3143u;
    public static final String v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f3144w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f3145x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f3146y;
    public static final String z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3147a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f3148b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f3149c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f3150d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3151e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3152f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3153g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3154h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3155i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3156j;

    /* renamed from: k, reason: collision with root package name */
    public final float f3157k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3158l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3159m;
    public final int n;
    public final float o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3160p;

    /* renamed from: q, reason: collision with root package name */
    public final float f3161q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3162r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = J.f3263a;
        f3141s = Integer.toString(0, 36);
        f3142t = Integer.toString(17, 36);
        f3143u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f3144w = Integer.toString(3, 36);
        f3145x = Integer.toString(18, 36);
        f3146y = Integer.toString(4, 36);
        z = Integer.toString(5, 36);
        f3130A = Integer.toString(6, 36);
        f3131B = Integer.toString(7, 36);
        f3132C = Integer.toString(8, 36);
        f3133D = Integer.toString(9, 36);
        f3134E = Integer.toString(10, 36);
        f3135F = Integer.toString(11, 36);
        f3136G = Integer.toString(12, 36);
        f3137H = Integer.toString(13, 36);
        f3138I = Integer.toString(14, 36);
        f3139J = Integer.toString(15, 36);
        f3140K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f4, int i4, int i5, float f5, int i6, int i7, float f6, float f7, float f8, boolean z4, int i8, int i9, float f9, int i10) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC0124a.h(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f3147a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f3147a = charSequence.toString();
        } else {
            this.f3147a = null;
        }
        this.f3148b = alignment;
        this.f3149c = alignment2;
        this.f3150d = bitmap;
        this.f3151e = f4;
        this.f3152f = i4;
        this.f3153g = i5;
        this.f3154h = f5;
        this.f3155i = i6;
        this.f3156j = f7;
        this.f3157k = f8;
        this.f3158l = z4;
        this.f3159m = i8;
        this.n = i7;
        this.o = f6;
        this.f3160p = i9;
        this.f3161q = f9;
        this.f3162r = i10;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.f3150d;
            if (TextUtils.equals(this.f3147a, bVar.f3147a) && this.f3148b == bVar.f3148b && this.f3149c == bVar.f3149c && ((bitmap = this.f3150d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f3151e == bVar.f3151e && this.f3152f == bVar.f3152f && this.f3153g == bVar.f3153g && this.f3154h == bVar.f3154h && this.f3155i == bVar.f3155i && this.f3156j == bVar.f3156j && this.f3157k == bVar.f3157k && this.f3158l == bVar.f3158l && this.f3159m == bVar.f3159m && this.n == bVar.n && this.o == bVar.o && this.f3160p == bVar.f3160p && this.f3161q == bVar.f3161q && this.f3162r == bVar.f3162r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3147a, this.f3148b, this.f3149c, this.f3150d, Float.valueOf(this.f3151e), Integer.valueOf(this.f3152f), Integer.valueOf(this.f3153g), Float.valueOf(this.f3154h), Integer.valueOf(this.f3155i), Float.valueOf(this.f3156j), Float.valueOf(this.f3157k), Boolean.valueOf(this.f3158l), Integer.valueOf(this.f3159m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.f3160p), Float.valueOf(this.f3161q), Integer.valueOf(this.f3162r));
    }
}
