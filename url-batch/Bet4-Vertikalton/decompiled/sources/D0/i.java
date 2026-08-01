package D0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f200a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f201b;

    /* renamed from: c, reason: collision with root package name */
    public final int f202c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f206j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f203e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f204f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f205g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f207k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f200a = charSequence;
        this.f201b = textPaint;
        this.f202c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f200a == null) {
            this.f200a = "";
        }
        int max = Math.max(0, this.f202c);
        CharSequence charSequence = this.f200a;
        int i = this.f204f;
        TextPaint textPaint = this.f201b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f207k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f206j && this.f204f == 1) {
            this.f203e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f203e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f206j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f207k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f204f);
        float f2 = this.f205g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(RecyclerView.f1530C0, f2);
        }
        if (this.f204f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
