package W0;

import a.AbstractC0124a;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public static final boolean[] f3418A;

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f3419B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f3420C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f3421D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f3422E;
    public static final int v = c(2, 2, 2, 0);

    /* renamed from: w, reason: collision with root package name */
    public static final int f3423w;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3424x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3425y;
    public static final int[] z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3426a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f3427b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3428c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3429d;

    /* renamed from: e, reason: collision with root package name */
    public int f3430e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3431f;

    /* renamed from: g, reason: collision with root package name */
    public int f3432g;

    /* renamed from: h, reason: collision with root package name */
    public int f3433h;

    /* renamed from: i, reason: collision with root package name */
    public int f3434i;

    /* renamed from: j, reason: collision with root package name */
    public int f3435j;

    /* renamed from: k, reason: collision with root package name */
    public int f3436k;

    /* renamed from: l, reason: collision with root package name */
    public int f3437l;

    /* renamed from: m, reason: collision with root package name */
    public int f3438m;
    public int n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f3439p;

    /* renamed from: q, reason: collision with root package name */
    public int f3440q;

    /* renamed from: r, reason: collision with root package name */
    public int f3441r;

    /* renamed from: s, reason: collision with root package name */
    public int f3442s;

    /* renamed from: t, reason: collision with root package name */
    public int f3443t;

    /* renamed from: u, reason: collision with root package name */
    public int f3444u;

    static {
        int c4 = c(0, 0, 0, 0);
        f3423w = c4;
        int c5 = c(0, 0, 0, 3);
        f3424x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f3425y = new int[]{0, 0, 0, 0, 0, 0, 2};
        z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f3418A = new boolean[]{false, false, false, true, true, true, false};
        f3419B = new int[]{c4, c5, c4, c4, c5, c4, c4};
        f3420C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f3421D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f3422E = new int[]{c4, c4, c4, c4, c4, c5, c5};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i4, int i5, int i6, int i7) {
        int i8;
        AbstractC0124a.m(i4, 4);
        AbstractC0124a.m(i5, 4);
        AbstractC0124a.m(i6, 4);
        AbstractC0124a.m(i7, 4);
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                i8 = 127;
            } else if (i7 == 3) {
                i8 = 0;
            }
            return Color.argb(i8, i4 <= 1 ? 255 : 0, i5 <= 1 ? 255 : 0, i6 > 1 ? 255 : 0);
        }
        i8 = 255;
        return Color.argb(i8, i4 <= 1 ? 255 : 0, i5 <= 1 ? 255 : 0, i6 > 1 ? 255 : 0);
    }

    public final void a(char c4) {
        SpannableStringBuilder spannableStringBuilder = this.f3427b;
        if (c4 != '\n') {
            spannableStringBuilder.append(c4);
            return;
        }
        SpannableString b4 = b();
        ArrayList arrayList = this.f3426a;
        arrayList.add(b4);
        spannableStringBuilder.clear();
        if (this.o != -1) {
            this.o = 0;
        }
        if (this.f3439p != -1) {
            this.f3439p = 0;
        }
        if (this.f3440q != -1) {
            this.f3440q = 0;
        }
        if (this.f3442s != -1) {
            this.f3442s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f3435j && arrayList.size() < 15) {
                this.f3444u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f3427b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
            }
            if (this.f3439p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f3439p, length, 33);
            }
            if (this.f3440q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f3441r), this.f3440q, length, 33);
            }
            if (this.f3442s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f3443t), this.f3442s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f3426a.clear();
        this.f3427b.clear();
        this.o = -1;
        this.f3439p = -1;
        this.f3440q = -1;
        this.f3442s = -1;
        this.f3444u = 0;
        this.f3428c = false;
        this.f3429d = false;
        this.f3430e = 4;
        this.f3431f = false;
        this.f3432g = 0;
        this.f3433h = 0;
        this.f3434i = 0;
        this.f3435j = 15;
        this.f3436k = 0;
        this.f3437l = 0;
        this.f3438m = 0;
        int i4 = f3423w;
        this.n = i4;
        this.f3441r = v;
        this.f3443t = i4;
    }

    public final void e(boolean z4, boolean z5) {
        int i4 = this.o;
        SpannableStringBuilder spannableStringBuilder = this.f3427b;
        if (i4 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.o, spannableStringBuilder.length(), 33);
                this.o = -1;
            }
        } else if (z4) {
            this.o = spannableStringBuilder.length();
        }
        if (this.f3439p == -1) {
            if (z5) {
                this.f3439p = spannableStringBuilder.length();
            }
        } else {
            if (z5) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f3439p, spannableStringBuilder.length(), 33);
            this.f3439p = -1;
        }
    }

    public final void f(int i4, int i5) {
        int i6 = this.f3440q;
        SpannableStringBuilder spannableStringBuilder = this.f3427b;
        if (i6 != -1 && this.f3441r != i4) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f3441r), this.f3440q, spannableStringBuilder.length(), 33);
        }
        if (i4 != v) {
            this.f3440q = spannableStringBuilder.length();
            this.f3441r = i4;
        }
        if (this.f3442s != -1 && this.f3443t != i5) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f3443t), this.f3442s, spannableStringBuilder.length(), 33);
        }
        if (i5 != f3423w) {
            this.f3442s = spannableStringBuilder.length();
            this.f3443t = i5;
        }
    }
}
