package C0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f463a;

    /* renamed from: b, reason: collision with root package name */
    public final int f464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f465c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f466d;

    /* renamed from: e, reason: collision with root package name */
    public final int f467e;

    /* renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f468f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f469g;

    /* renamed from: h, reason: collision with root package name */
    public final int f470h;

    /* renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f471i;

    /* renamed from: j, reason: collision with root package name */
    public final int f472j;

    /* renamed from: k, reason: collision with root package name */
    public final float f473k;

    /* renamed from: l, reason: collision with root package name */
    public final float f474l;

    /* renamed from: m, reason: collision with root package name */
    public final int f475m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f476n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f477o;
    public final int p;

    /* renamed from: q, reason: collision with root package name */
    public final int f478q;

    /* renamed from: r, reason: collision with root package name */
    public final int f479r;

    /* renamed from: s, reason: collision with root package name */
    public final int f480s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f481t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f482u;

    public z(CharSequence charSequence, int i3, int i4, TextPaint textPaint, int i5, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i6, TextUtils.TruncateAt truncateAt, int i7, float f3, float f4, int i8, boolean z3, boolean z4, int i9, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        this.f463a = charSequence;
        this.f464b = i3;
        this.f465c = i4;
        this.f466d = textPaint;
        this.f467e = i5;
        this.f468f = textDirectionHeuristic;
        this.f469g = alignment;
        this.f470h = i6;
        this.f471i = truncateAt;
        this.f472j = i7;
        this.f473k = f3;
        this.f474l = f4;
        this.f475m = i8;
        this.f476n = z3;
        this.f477o = z4;
        this.p = i9;
        this.f478q = i10;
        this.f479r = i11;
        this.f480s = i12;
        this.f481t = iArr;
        this.f482u = iArr2;
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
