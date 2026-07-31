package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 extends h3.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f4206g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0 f4207h;

    public b0(f0 f0Var, int i, int i8, WeakReference weakReference) {
        this.f4207h = f0Var;
        this.f4204e = i;
        this.f4205f = i8;
        this.f4206g = weakReference;
    }

    @Override // h3.b
    public final void e(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f4204e) != -1) {
            typeface = e0.a(typeface, i, (this.f4205f & 2) != 0);
        }
        f0 f0Var = this.f4207h;
        if (f0Var.f4243m) {
            f0Var.f4242l = typeface;
            TextView textView = (TextView) this.f4206g.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new k5.a(textView, typeface, f0Var.f4240j));
                } else {
                    textView.setTypeface(typeface, f0Var.f4240j);
                }
            }
        }
    }

    @Override // h3.b
    public final void d(int i) {
    }
}
