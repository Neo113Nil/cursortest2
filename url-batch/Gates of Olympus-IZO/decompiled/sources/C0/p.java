package C0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f454a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f455b;

    /* renamed from: c, reason: collision with root package name */
    public final int f456c;

    /* renamed from: d, reason: collision with root package name */
    public float f457d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f458e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f459f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f460g;

    public p(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f454a = charSequence;
        this.f455b = textPaint;
        this.f456c = i3;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f460g) {
            TextDirectionHeuristic a3 = D.a(this.f456c);
            int i3 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f454a;
            TextPaint textPaint = this.f455b;
            this.f459f = i3 >= 33 ? AbstractC0010b.b(charSequence, textPaint, a3) : AbstractC0011c.b(charSequence, textPaint, a3);
            this.f460g = true;
        }
        return this.f459f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (C0.x.b(r4, D0.e.class) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b() {
        if (!Float.isNaN(this.f457d)) {
            return this.f457d;
        }
        BoringLayout.Metrics a3 = a();
        float f3 = a3 != null ? a3.width : -1;
        TextPaint textPaint = this.f455b;
        CharSequence charSequence = this.f454a;
        if (f3 < 0.0f) {
            f3 = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint));
        }
        if (f3 != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!x.b(spanned, D0.f.class)) {
                }
                f3 += 0.5f;
            }
        }
        this.f457d = f3;
        return f3;
    }
}
