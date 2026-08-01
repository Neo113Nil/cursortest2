package C0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f143a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f144b;

    /* renamed from: c, reason: collision with root package name */
    public final int f145c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f149j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f146e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f147f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f148g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f150k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f143a = charSequence;
        this.f144b = textPaint;
        this.f145c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f143a == null) {
            this.f143a = "";
        }
        int max = Math.max(0, this.f145c);
        CharSequence charSequence = this.f143a;
        int i = this.f147f;
        TextPaint textPaint = this.f144b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f150k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f149j && this.f147f == 1) {
            this.f146e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f146e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f149j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f150k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f147f);
        float f2 = this.f148g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f147f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
