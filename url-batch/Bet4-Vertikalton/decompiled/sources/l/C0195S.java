package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: l.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195S extends B.b {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2853j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X f2854k;

    public C0195S(X x2, int i, int i2, WeakReference weakReference) {
        this.f2854k = x2;
        this.h = i;
        this.i = i2;
        this.f2853j = weakReference;
    }

    @Override // B.b
    public final void g(int i) {
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.h) != -1) {
            typeface = W.a(typeface, i, (this.i & 2) != 0);
        }
        X x2 = this.f2854k;
        if (x2.f2874m) {
            x2.f2873l = typeface;
            TextView textView = (TextView) this.f2853j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new T(textView, typeface, x2.f2871j));
                } else {
                    textView.setTypeface(typeface, x2.f2871j);
                }
            }
        }
    }
}
