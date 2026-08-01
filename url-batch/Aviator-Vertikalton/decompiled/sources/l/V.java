package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class V extends B.b {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f3308j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0249a0 f3309k;

    public V(C0249a0 c0249a0, int i, int i2, WeakReference weakReference) {
        this.f3309k = c0249a0;
        this.h = i;
        this.i = i2;
        this.f3308j = weakReference;
    }

    @Override // B.b
    public final void g(int i) {
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.h) != -1) {
            typeface = Z.a(typeface, i, (this.i & 2) != 0);
        }
        C0249a0 c0249a0 = this.f3309k;
        if (c0249a0.f3333m) {
            c0249a0.f3332l = typeface;
            TextView textView = (TextView) this.f3308j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new W(textView, typeface, c0249a0.f3330j));
                } else {
                    textView.setTypeface(typeface, c0249a0.f3330j);
                }
            }
        }
    }
}
