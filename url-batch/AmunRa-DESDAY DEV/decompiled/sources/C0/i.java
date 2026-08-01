package C0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f141a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f142b;

    /* renamed from: c, reason: collision with root package name */
    public final int f143c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f147j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f144e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f145f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f146g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f148k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f141a = charSequence;
        this.f142b = textPaint;
        this.f143c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f141a == null) {
            this.f141a = "";
        }
        int max = Math.max(0, this.f143c);
        CharSequence charSequence = this.f141a;
        int i = this.f145f;
        TextPaint textPaint = this.f142b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f148k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f147j && this.f145f == 1) {
            this.f144e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f144e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f147j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f148k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f145f);
        float f2 = this.f146g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f145f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
