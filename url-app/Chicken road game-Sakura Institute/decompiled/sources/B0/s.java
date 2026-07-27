package B0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f936a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f937b;

    /* renamed from: c, reason: collision with root package name */
    public final int f938c;

    /* renamed from: d, reason: collision with root package name */
    public float f939d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f940e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f941f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f942g;

    public s(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f936a = charSequence;
        this.f937b = textPaint;
        this.f938c = i2;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f942g) {
            TextDirectionHeuristic a4 = G.a(this.f938c);
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f936a;
            TextPaint textPaint = this.f937b;
            this.f941f = i2 >= 33 ? AbstractC0091e.b(charSequence, textPaint, a4) : AbstractC0092f.b(charSequence, textPaint, a4);
            this.f942g = true;
        }
        return this.f941f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (B0.A.e(r4, D0.e.class) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b() {
        if (!Float.isNaN(this.f939d)) {
            return this.f939d;
        }
        BoringLayout.Metrics a4 = a();
        float f4 = a4 != null ? a4.width : -1;
        TextPaint textPaint = this.f937b;
        CharSequence charSequence = this.f936a;
        if (f4 < 0.0f) {
            f4 = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint));
        }
        if (f4 != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!A.e(spanned, D0.f.class)) {
                }
                f4 += 0.5f;
            }
        }
        this.f939d = f4;
        return f4;
    }
}
