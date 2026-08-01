package E0;

import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public float f219c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f220e;

    /* renamed from: f, reason: collision with root package name */
    public H0.d f221f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f217a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final j f218b = new j(0, this);
    public boolean d = true;

    public l(z0.e eVar) {
        this.f220e = new WeakReference(null);
        this.f220e = new WeakReference(eVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f219c;
        }
        TextPaint textPaint = this.f217a;
        this.f219c = str == null ? RecyclerView.A0 : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f219c;
    }
}
