package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q0 extends e0.b {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2543j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v0 f2544k;

    public q0(v0 v0Var, int i, int i4, WeakReference weakReference) {
        this.f2544k = v0Var;
        this.h = i;
        this.i = i4;
        this.f2543j = weakReference;
    }

    @Override // e0.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.h) != -1) {
            typeface = u0.a(typeface, i, (this.i & 2) != 0);
        }
        v0 v0Var = this.f2544k;
        if (v0Var.f2596m) {
            v0Var.f2595l = typeface;
            TextView textView = (TextView) this.f2543j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new r0(textView, typeface, v0Var.f2593j));
                } else {
                    textView.setTypeface(typeface, v0Var.f2593j);
                }
            }
        }
    }

    @Override // e0.b
    public final void g(int i) {
    }
}
