package B0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f131a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f132b;

    /* renamed from: c, reason: collision with root package name */
    public final int f133c;

    /* renamed from: d, reason: collision with root package name */
    public int f134d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f138j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f135e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f136f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f137g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f139k = null;

    public j(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f131a = charSequence;
        this.f132b = textPaint;
        this.f133c = i;
        this.f134d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f131a == null) {
            this.f131a = "";
        }
        int max = Math.max(0, this.f133c);
        CharSequence charSequence = this.f131a;
        int i = this.f136f;
        TextPaint textPaint = this.f132b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f139k);
        }
        int min = Math.min(charSequence.length(), this.f134d);
        this.f134d = min;
        if (this.f138j && this.f136f == 1) {
            this.f135e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f135e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f138j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f139k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f136f);
        float f2 = this.f137g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f136f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
