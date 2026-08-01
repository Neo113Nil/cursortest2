package a2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import j2.z;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f47a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f48b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public int f49d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f54k;

    /* renamed from: m, reason: collision with root package name */
    public z f56m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f50e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f51f = Integer.MAX_VALUE;
    public float g = 0.0f;
    public float h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f52i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f53j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f55l = null;

    public k(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.f47a = charSequence;
        this.f48b = textPaint;
        this.c = i4;
        this.f49d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f47a == null) {
            this.f47a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.f47a;
        int i4 = this.f51f;
        TextPaint textPaint = this.f48b;
        if (i4 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f55l);
        }
        int min = Math.min(charSequence.length(), this.f49d);
        this.f49d = min;
        if (this.f54k && this.f51f == 1) {
            this.f50e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f50e);
        obtain.setIncludePad(this.f53j);
        obtain.setTextDirection(this.f54k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f55l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f51f);
        float f4 = this.g;
        if (f4 != 0.0f || this.h != 1.0f) {
            obtain.setLineSpacing(f4, this.h);
        }
        if (this.f51f > 1) {
            obtain.setHyphenationFrequency(this.f52i);
        }
        z zVar = this.f56m;
        if (zVar != null) {
            obtain.setBreakStrategy(((TextInputLayout) zVar.f2399f).f1434z.getBreakStrategy());
        }
        return obtain.build();
    }
}
