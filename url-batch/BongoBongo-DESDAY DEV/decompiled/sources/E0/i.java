package E0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f206a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f207b;

    /* renamed from: c, reason: collision with root package name */
    public final int f208c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f213j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f209e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f210f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f211g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f212h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f214k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f206a = charSequence;
        this.f207b = textPaint;
        this.f208c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f206a == null) {
            this.f206a = "";
        }
        int max = Math.max(0, this.f208c);
        CharSequence charSequence = this.f206a;
        int i = this.f210f;
        TextPaint textPaint = this.f207b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f214k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f213j && this.f210f == 1) {
            this.f209e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f209e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f213j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f214k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f210f);
        float f2 = this.f211g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(RecyclerView.A0, f2);
        }
        if (this.f210f > 1) {
            obtain.setHyphenationFrequency(this.f212h);
        }
        return obtain.build();
    }
}
