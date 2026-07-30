package b2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1243a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1244b;

    /* renamed from: c, reason: collision with root package name */
    public final TextPaint f1245c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1246d;

    /* renamed from: e, reason: collision with root package name */
    public final TextDirectionHeuristic f1247e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout.Alignment f1248f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1249g;

    /* renamed from: h, reason: collision with root package name */
    public final TextUtils.TruncateAt f1250h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1251i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1252j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1253k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1254l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1255m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1256n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1257o;

    public a0(CharSequence charSequence, int i7, TextPaint textPaint, int i8, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i9, TextUtils.TruncateAt truncateAt, int i10, int i11, boolean z8, int i12, int i13, int i14, int i15) {
        this.f1243a = charSequence;
        this.f1244b = i7;
        this.f1245c = textPaint;
        this.f1246d = i8;
        this.f1247e = textDirectionHeuristic;
        this.f1248f = alignment;
        this.f1249g = i9;
        this.f1250h = truncateAt;
        this.f1251i = i10;
        this.f1252j = i11;
        this.f1253k = z8;
        this.f1254l = i12;
        this.f1255m = i13;
        this.f1256n = i14;
        this.f1257o = i15;
        if (i7 < 0) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i7 < 0 || i7 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
    }
}
