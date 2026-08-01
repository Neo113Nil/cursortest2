package C0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f144a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f146c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f150j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f147e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f148f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f149g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f151k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f144a = charSequence;
        this.f145b = textPaint;
        this.f146c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f144a == null) {
            this.f144a = "";
        }
        int max = Math.max(0, this.f146c);
        CharSequence charSequence = this.f144a;
        int i = this.f148f;
        TextPaint textPaint = this.f145b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f151k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f150j && this.f148f == 1) {
            this.f147e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f147e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f150j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f151k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f148f);
        float f2 = this.f149g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f148f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
