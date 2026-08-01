package m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class T extends C.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2995h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2996j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y f2997k;

    public T(Y y2, int i, int i2, WeakReference weakReference) {
        this.f2997k = y2;
        this.f2995h = i;
        this.i = i2;
        this.f2996j = weakReference;
    }

    @Override // C.b
    public final void g(int i) {
    }

    @Override // C.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f2995h) != -1) {
            typeface = X.a(typeface, i, (this.i & 2) != 0);
        }
        Y y2 = this.f2997k;
        if (y2.f3060m) {
            y2.f3059l = typeface;
            TextView textView = (TextView) this.f2996j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new U(textView, typeface, y2.f3057j));
                } else {
                    textView.setTypeface(typeface, y2.f3057j);
                }
            }
        }
    }
}
