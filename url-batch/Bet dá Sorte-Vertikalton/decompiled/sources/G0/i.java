package G0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f244a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f245b;

    /* renamed from: c, reason: collision with root package name */
    public final int f246c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f250j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f247e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f248f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f249g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f251k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f244a = charSequence;
        this.f245b = textPaint;
        this.f246c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f244a == null) {
            this.f244a = "";
        }
        int max = Math.max(0, this.f246c);
        CharSequence charSequence = this.f244a;
        int i = this.f248f;
        TextPaint textPaint = this.f245b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f251k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f250j && this.f248f == 1) {
            this.f247e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f247e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f250j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f251k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f248f);
        float f2 = this.f249g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f248f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
