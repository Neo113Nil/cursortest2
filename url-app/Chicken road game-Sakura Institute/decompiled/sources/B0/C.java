package B0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f877b;

    /* renamed from: c, reason: collision with root package name */
    public final int f878c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f879d;

    /* renamed from: e, reason: collision with root package name */
    public final int f880e;

    /* renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f881f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f882g;

    /* renamed from: h, reason: collision with root package name */
    public final int f883h;

    /* renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f884i;

    /* renamed from: j, reason: collision with root package name */
    public final int f885j;

    /* renamed from: k, reason: collision with root package name */
    public final float f886k;

    /* renamed from: l, reason: collision with root package name */
    public final float f887l;

    /* renamed from: m, reason: collision with root package name */
    public final int f888m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f889n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f890o;

    /* renamed from: p, reason: collision with root package name */
    public final int f891p;

    /* renamed from: q, reason: collision with root package name */
    public final int f892q;

    /* renamed from: r, reason: collision with root package name */
    public final int f893r;

    /* renamed from: s, reason: collision with root package name */
    public final int f894s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f895t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f896u;

    public C(CharSequence charSequence, int i2, int i4, TextPaint textPaint, int i5, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i6, TextUtils.TruncateAt truncateAt, int i7, float f4, float f5, int i8, boolean z4, boolean z5, int i9, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        this.f876a = charSequence;
        this.f877b = i2;
        this.f878c = i4;
        this.f879d = textPaint;
        this.f880e = i5;
        this.f881f = textDirectionHeuristic;
        this.f882g = alignment;
        this.f883h = i6;
        this.f884i = truncateAt;
        this.f885j = i7;
        this.f886k = f4;
        this.f887l = f5;
        this.f888m = i8;
        this.f889n = z4;
        this.f890o = z5;
        this.f891p = i9;
        this.f892q = i10;
        this.f893r = i11;
        this.f894s = i12;
        this.f895t = iArr;
        this.f896u = iArr2;
        if (i2 < 0 || i2 > i4) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i4 < 0 || i4 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }
}
