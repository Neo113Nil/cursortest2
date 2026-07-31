package k;

import H1.RunnableC0139m;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f5086c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0461u f5087d;

    public C0459s(C0461u c0461u, int i7, int i8, WeakReference weakReference) {
        this.f5087d = c0461u;
        this.f5084a = i7;
        this.f5085b = i8;
        this.f5086c = weakReference;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0139m(16, this));
    }

    public final void b(Typeface typeface) {
        int i7;
        if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f5084a) != -1) {
            typeface = Typeface.create(typeface, i7, (this.f5085b & 2) != 0);
        }
        C0461u c0461u = this.f5087d;
        if (c0461u.f5119m) {
            c0461u.f5118l = typeface;
            TextView textView = (TextView) this.f5086c.get();
            if (textView != null) {
                Field field = D.D.f240a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0460t(textView, typeface, c0461u.f5116j, 0));
                } else {
                    textView.setTypeface(typeface, c0461u.f5116j);
                }
            }
        }
    }
}
