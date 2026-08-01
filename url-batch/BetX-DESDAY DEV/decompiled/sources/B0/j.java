package B0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f130a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f131b;

    /* renamed from: c, reason: collision with root package name */
    public final int f132c;

    /* renamed from: d, reason: collision with root package name */
    public int f133d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f137j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f134e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f135f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f136g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f138k = null;

    public j(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f130a = charSequence;
        this.f131b = textPaint;
        this.f132c = i;
        this.f133d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f130a == null) {
            this.f130a = "";
        }
        int max = Math.max(0, this.f132c);
        CharSequence charSequence = this.f130a;
        int i = this.f135f;
        TextPaint textPaint = this.f131b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f138k);
        }
        int min = Math.min(charSequence.length(), this.f133d);
        this.f133d = min;
        if (this.f137j && this.f135f == 1) {
            this.f134e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f134e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f137j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f138k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f135f);
        float f2 = this.f136g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f135f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
