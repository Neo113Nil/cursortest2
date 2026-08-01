package i2;

import a.g0;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2047a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f2048b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2049c;
    public int d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2054k;

    /* renamed from: m, reason: collision with root package name */
    public g0 f2056m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f2050e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f2051f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f2052g = 0.0f;
    public float h = 1.0f;
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2053j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f2055l = null;

    public k(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f2047a = charSequence;
        this.f2048b = textPaint;
        this.f2049c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f2047a == null) {
            this.f2047a = "";
        }
        int max = Math.max(0, this.f2049c);
        CharSequence charSequence = this.f2047a;
        int i = this.f2051f;
        TextPaint textPaint = this.f2048b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f2055l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f2054k && this.f2051f == 1) {
            this.f2050e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f2050e);
        obtain.setIncludePad(this.f2053j);
        obtain.setTextDirection(this.f2054k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f2055l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f2051f);
        float f5 = this.f2052g;
        if (f5 != 0.0f || this.h != 1.0f) {
            obtain.setLineSpacing(f5, this.h);
        }
        if (this.f2051f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        g0 g0Var = this.f2056m;
        if (g0Var != null) {
            obtain.setBreakStrategy(((TextInputLayout) g0Var.f25g).f1241z.getBreakStrategy());
        }
        return obtain.build();
    }
}
