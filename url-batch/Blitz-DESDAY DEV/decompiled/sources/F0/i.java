package F0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f303a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f305c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f309j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f306e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f307f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f308g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f310k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f303a = charSequence;
        this.f304b = textPaint;
        this.f305c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f303a == null) {
            this.f303a = "";
        }
        int max = Math.max(0, this.f305c);
        CharSequence charSequence = this.f303a;
        int i = this.f307f;
        TextPaint textPaint = this.f304b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f310k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f309j && this.f307f == 1) {
            this.f306e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f306e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f309j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f310k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f307f);
        float f2 = this.f308g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f307f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
