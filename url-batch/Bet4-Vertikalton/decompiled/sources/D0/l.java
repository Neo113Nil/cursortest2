package D0;

import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public float f212c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f213e;

    /* renamed from: f, reason: collision with root package name */
    public G0.d f214f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f210a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final j f211b = new j(0, this);
    public boolean d = true;

    public l(y0.e eVar) {
        this.f213e = new WeakReference(null);
        this.f213e = new WeakReference(eVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f212c;
        }
        TextPaint textPaint = this.f210a;
        this.f212c = str == null ? RecyclerView.f1530C0 : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f212c;
    }
}
