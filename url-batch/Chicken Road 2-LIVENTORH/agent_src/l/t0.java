package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class t0 extends e0.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2459h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2460j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y0 f2461k;

    public t0(y0 y0Var, int i, int i4, WeakReference weakReference) {
        this.f2461k = y0Var;
        this.f2459h = i;
        this.i = i4;
        this.f2460j = weakReference;
    }

    @Override // e0.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f2459h) != -1) {
            typeface = x0.a(typeface, i, (this.i & 2) != 0);
        }
        y0 y0Var = this.f2461k;
        if (y0Var.f2519m) {
            y0Var.f2518l = typeface;
            TextView textView = (TextView) this.f2460j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new u0(textView, typeface, y0Var.f2516j));
                } else {
                    textView.setTypeface(typeface, y0Var.f2516j);
                }
            }
        }
    }

    @Override // e0.b
    public final void g(int i) {
    }
}
