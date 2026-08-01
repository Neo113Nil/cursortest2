package n;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class T extends D.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3524h;
    public final /* synthetic */ int i;
    public final /* synthetic */ WeakReference j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y f3525k;

    public T(Y y2, int i, int i2, WeakReference weakReference) {
        this.f3525k = y2;
        this.f3524h = i;
        this.i = i2;
        this.j = weakReference;
    }

    @Override // D.b
    public final void g(int i) {
    }

    @Override // D.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f3524h) != -1) {
            typeface = X.a(typeface, i, (this.i & 2) != 0);
        }
        Y y2 = this.f3525k;
        if (y2.f3588m) {
            y2.f3587l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new U(textView, typeface, y2.j));
                } else {
                    textView.setTypeface(typeface, y2.j);
                }
            }
        }
    }
}
