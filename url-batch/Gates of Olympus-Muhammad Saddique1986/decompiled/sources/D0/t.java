package D0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f858a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f859b;

    /* renamed from: c, reason: collision with root package name */
    public final int f860c;

    /* renamed from: d, reason: collision with root package name */
    public float f861d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f862e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f863f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f864g;

    public t(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f858a = charSequence;
        this.f859b = textPaint;
        this.f860c = i3;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f864g) {
            TextDirectionHeuristic a3 = H.a(this.f860c);
            int i3 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f858a;
            TextPaint textPaint = this.f859b;
            this.f863f = i3 >= 33 ? AbstractC0067e.b(charSequence, textPaint, a3) : AbstractC0068f.b(charSequence, textPaint, a3);
            this.f864g = true;
        }
        return this.f863f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (D0.B.e(r4, F0.e.class) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b() {
        if (!Float.isNaN(this.f861d)) {
            return this.f861d;
        }
        BoringLayout.Metrics a3 = a();
        float f3 = a3 != null ? a3.width : -1;
        TextPaint textPaint = this.f859b;
        CharSequence charSequence = this.f858a;
        if (f3 < 0.0f) {
            f3 = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint));
        }
        if (f3 != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!B.e(spanned, F0.f.class)) {
                }
                f3 += 0.5f;
            }
        }
        this.f861d = f3;
        return f3;
    }
}
