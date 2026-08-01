package L0;

import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public float f772c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f773e;

    /* renamed from: f, reason: collision with root package name */
    public O0.d f774f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f770a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final G0.b f771b = new G0.b(1, this);
    public boolean d = true;

    public i(G0.f fVar) {
        this.f773e = new WeakReference(null);
        this.f773e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f772c;
        }
        TextPaint textPaint = this.f770a;
        this.f772c = str == null ? RecyclerView.f1937A0 : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f772c;
    }
}
