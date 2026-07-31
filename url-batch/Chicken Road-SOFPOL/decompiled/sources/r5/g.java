package r5;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import b.q;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f6659a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f6660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6661c;

    /* renamed from: d, reason: collision with root package name */
    public int f6662d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6668k;

    /* renamed from: m, reason: collision with root package name */
    public q f6670m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f6663e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f6664f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f6665g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f6666h = 1.0f;
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6667j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f6669l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f6659a = charSequence;
        this.f6660b = textPaint;
        this.f6661c = i;
        this.f6662d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f6659a == null) {
            this.f6659a = "";
        }
        int max = Math.max(0, this.f6661c);
        CharSequence charSequence = this.f6659a;
        int i = this.f6664f;
        TextPaint textPaint = this.f6660b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f6669l);
        }
        int min = Math.min(charSequence.length(), this.f6662d);
        this.f6662d = min;
        if (this.f6668k && this.f6664f == 1) {
            this.f6663e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f6663e);
        obtain.setIncludePad(this.f6667j);
        obtain.setTextDirection(this.f6668k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f6669l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f6664f);
        float f6 = this.f6665g;
        if (f6 != 0.0f || this.f6666h != 1.0f) {
            obtain.setLineSpacing(f6, this.f6666h);
        }
        if (this.f6664f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        q qVar = this.f6670m;
        if (qVar != null) {
            obtain.setBreakStrategy(((TextInputLayout) qVar.f1015a).f2005x.getBreakStrategy());
        }
        return obtain.build();
    }
}
