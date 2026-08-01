package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class U extends B.b {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2934j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z f2935k;

    public U(Z z2, int i, int i2, WeakReference weakReference) {
        this.f2935k = z2;
        this.h = i;
        this.i = i2;
        this.f2934j = weakReference;
    }

    @Override // B.b
    public final void g(int i) {
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.h) != -1) {
            typeface = Y.a(typeface, i, (this.i & 2) != 0);
        }
        Z z2 = this.f2935k;
        if (z2.f2954m) {
            z2.f2953l = typeface;
            TextView textView = (TextView) this.f2934j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new V(textView, typeface, z2.f2951j));
                } else {
                    textView.setTypeface(typeface, z2.f2951j);
                }
            }
        }
    }
}
