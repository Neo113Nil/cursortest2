package D0;

import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public float f174c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f175e;

    /* renamed from: f, reason: collision with root package name */
    public G0.d f176f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f172a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final j f173b = new j(0, this);
    public boolean d = true;

    public l(y0.e eVar) {
        this.f175e = new WeakReference(null);
        this.f175e = new WeakReference(eVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f174c;
        }
        TextPaint textPaint = this.f172a;
        this.f174c = str == null ? RecyclerView.f1559A0 : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f174c;
    }
}
