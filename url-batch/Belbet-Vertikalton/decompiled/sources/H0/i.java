package H0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f524a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f525b;

    /* renamed from: c, reason: collision with root package name */
    public final int f526c;

    /* renamed from: d, reason: collision with root package name */
    public int f527d;
    public boolean j;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f528f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f529g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f530h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f531k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f524a = charSequence;
        this.f525b = textPaint;
        this.f526c = i;
        this.f527d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f524a == null) {
            this.f524a = "";
        }
        int max = Math.max(0, this.f526c);
        CharSequence charSequence = this.f524a;
        int i = this.f528f;
        TextPaint textPaint = this.f525b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f531k);
        }
        int min = Math.min(charSequence.length(), this.f527d);
        this.f527d = min;
        if (this.j && this.f528f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f531k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f528f);
        float f2 = this.f529g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f528f > 1) {
            obtain.setHyphenationFrequency(this.f530h);
        }
        return obtain.build();
    }
}
