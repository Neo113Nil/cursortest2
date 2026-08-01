package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class T extends B.b {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2917j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y f2918k;

    public T(Y y2, int i, int i2, WeakReference weakReference) {
        this.f2918k = y2;
        this.h = i;
        this.i = i2;
        this.f2917j = weakReference;
    }

    @Override // B.b
    public final void g(int i) {
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.h) != -1) {
            typeface = X.a(typeface, i, (this.i & 2) != 0);
        }
        Y y2 = this.f2918k;
        if (y2.f2937m) {
            y2.f2936l = typeface;
            TextView textView = (TextView) this.f2917j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new U(textView, typeface, y2.f2934j));
                } else {
                    textView.setTypeface(typeface, y2.f2934j);
                }
            }
        }
    }
}
