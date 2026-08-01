package e2;

import a.e0;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f1213a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f1214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1215c;
    public int d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1221k;

    /* renamed from: m, reason: collision with root package name */
    public e0 f1223m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f1216e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f1217f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f1218g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f1219h = 1.0f;
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1220j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f1222l = null;

    public h(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f1213a = charSequence;
        this.f1214b = textPaint;
        this.f1215c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f1213a == null) {
            this.f1213a = "";
        }
        int max = Math.max(0, this.f1215c);
        CharSequence charSequence = this.f1213a;
        int i = this.f1217f;
        TextPaint textPaint = this.f1214b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f1222l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f1221k && this.f1217f == 1) {
            this.f1216e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f1216e);
        obtain.setIncludePad(this.f1220j);
        obtain.setTextDirection(this.f1221k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f1222l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f1217f);
        float f2 = this.f1218g;
        if (f2 != 0.0f || this.f1219h != 1.0f) {
            obtain.setLineSpacing(f2, this.f1219h);
        }
        if (this.f1217f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        e0 e0Var = this.f1223m;
        if (e0Var != null) {
            obtain.setBreakStrategy(((TextInputLayout) e0Var.f18g).f1052z.getBreakStrategy());
        }
        return obtain.build();
    }
}
