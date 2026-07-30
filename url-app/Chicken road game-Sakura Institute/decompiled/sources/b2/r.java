package b2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1296a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f1297b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1298c;

    /* renamed from: d, reason: collision with root package name */
    public float f1299d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f1300e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f1301f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1302g;

    public r(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f1296a = charSequence;
        this.f1297b = textPaint;
        this.f1298c = i7;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f1302g) {
            TextDirectionHeuristic a3 = e0.a(this.f1298c);
            int i7 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f1296a;
            TextPaint textPaint = this.f1297b;
            this.f1301f = i7 >= 33 ? d.b(charSequence, textPaint, a3) : e.b(charSequence, textPaint, a3);
            this.f1302g = true;
        }
        return this.f1301f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r5.nextSpanTransition(-1, r5.length(), d2.e.class) != r5.length()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r4.getLetterSpacing() == 0.0f) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b() {
        if (!Float.isNaN(this.f1299d)) {
            return this.f1299d;
        }
        BoringLayout.Metrics a3 = a();
        float f9 = a3 != null ? a3.width : -1;
        TextPaint textPaint = this.f1297b;
        CharSequence charSequence = this.f1296a;
        if (f9 < 0.0f) {
            f9 = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint));
        }
        if (f9 != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (spanned.nextSpanTransition(-1, spanned.length(), d2.f.class) == spanned.length()) {
                }
                f9 += 0.5f;
            }
        }
        this.f1299d = f9;
        return f9;
    }
}
