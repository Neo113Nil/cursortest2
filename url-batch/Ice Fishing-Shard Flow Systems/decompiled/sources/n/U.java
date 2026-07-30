package n;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f6717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f6718d;

    public U(Z z7, int i2, int i5, WeakReference weakReference) {
        this.f6718d = z7;
        this.f6715a = i2;
        this.f6716b = i5;
        this.f6717c = weakReference;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new A.k(0, this));
    }

    public final void b(Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f6715a) != -1) {
            typeface = Y.a(typeface, i2, (this.f6716b & 2) != 0);
        }
        Z z7 = this.f6718d;
        if (z7.f6736m) {
            z7.f6735l = typeface;
            TextView textView = (TextView) this.f6717c.get();
            if (textView != null) {
                WeakHashMap weakHashMap = I.T.f1153a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new J0.i(z7.j, 2, textView, typeface));
                } else {
                    textView.setTypeface(typeface, z7.j);
                }
            }
        }
    }
}
