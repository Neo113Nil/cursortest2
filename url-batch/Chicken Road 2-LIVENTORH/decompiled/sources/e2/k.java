package e2;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public float f1228c;
    public float d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f1230f;

    /* renamed from: g, reason: collision with root package name */
    public i2.d f1231g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f1226a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final i f1227b = new i(0, this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f1229e = true;

    public k(j jVar) {
        this.f1230f = new WeakReference(null);
        this.f1230f = new WeakReference(jVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f1226a;
        this.f1228c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f1229e = false;
    }

    public final void b(i2.d dVar, Context context) {
        if (this.f1231g != dVar) {
            this.f1231g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f1226a;
                i iVar = this.f1227b;
                dVar.e(context, textPaint, iVar);
                j jVar = (j) this.f1230f.get();
                if (jVar != null) {
                    textPaint.drawableState = jVar.getState();
                }
                dVar.d(context, textPaint, iVar);
                this.f1229e = true;
            }
            j jVar2 = (j) this.f1230f.get();
            if (jVar2 != null) {
                jVar2.a();
                jVar2.onStateChange(jVar2.getState());
            }
        }
    }
}
