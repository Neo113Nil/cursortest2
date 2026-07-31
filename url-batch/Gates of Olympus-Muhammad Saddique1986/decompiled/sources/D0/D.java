package D0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f798a;

    /* renamed from: b, reason: collision with root package name */
    public final int f799b;

    /* renamed from: c, reason: collision with root package name */
    public final int f800c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f801d;

    /* renamed from: e, reason: collision with root package name */
    public final int f802e;

    /* renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f803f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f804g;

    /* renamed from: h, reason: collision with root package name */
    public final int f805h;

    /* renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f806i;

    /* renamed from: j, reason: collision with root package name */
    public final int f807j;

    /* renamed from: k, reason: collision with root package name */
    public final float f808k;

    /* renamed from: l, reason: collision with root package name */
    public final float f809l;

    /* renamed from: m, reason: collision with root package name */
    public final int f810m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f811n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f812o;

    /* renamed from: p, reason: collision with root package name */
    public final int f813p;

    /* renamed from: q, reason: collision with root package name */
    public final int f814q;

    /* renamed from: r, reason: collision with root package name */
    public final int f815r;

    /* renamed from: s, reason: collision with root package name */
    public final int f816s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f817t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f818u;

    public D(CharSequence charSequence, int i3, int i4, TextPaint textPaint, int i5, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i6, TextUtils.TruncateAt truncateAt, int i7, float f3, float f4, int i8, boolean z3, boolean z4, int i9, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        this.f798a = charSequence;
        this.f799b = i3;
        this.f800c = i4;
        this.f801d = textPaint;
        this.f802e = i5;
        this.f803f = textDirectionHeuristic;
        this.f804g = alignment;
        this.f805h = i6;
        this.f806i = truncateAt;
        this.f807j = i7;
        this.f808k = f3;
        this.f809l = f4;
        this.f810m = i8;
        this.f811n = z3;
        this.f812o = z4;
        this.f813p = i9;
        this.f814q = i10;
        this.f815r = i11;
        this.f816s = i12;
        this.f817t = iArr;
        this.f818u = iArr2;
        if (i3 < 0 || i3 > i4) {
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
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }
}
