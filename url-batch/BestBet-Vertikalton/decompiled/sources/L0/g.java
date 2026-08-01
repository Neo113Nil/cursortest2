package L0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f762a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f763b;

    /* renamed from: c, reason: collision with root package name */
    public final int f764c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f768j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f765e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f766f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f767g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f769k = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f762a = charSequence;
        this.f763b = textPaint;
        this.f764c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f762a == null) {
            this.f762a = "";
        }
        int max = Math.max(0, this.f764c);
        CharSequence charSequence = this.f762a;
        int i = this.f766f;
        TextPaint textPaint = this.f763b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f769k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f768j && this.f766f == 1) {
            this.f765e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f765e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f768j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f769k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f766f);
        float f2 = this.f767g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(RecyclerView.f1937A0, f2);
        }
        if (this.f766f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
