package k;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q0 extends b0.b {
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2631i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2632j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v0 f2633k;

    public q0(v0 v0Var, int i4, int i5, WeakReference weakReference) {
        this.f2633k = v0Var;
        this.h = i4;
        this.f2631i = i5;
        this.f2632j = weakReference;
    }

    @Override // b0.b
    public final void h(Typeface typeface) {
        int i4;
        if (Build.VERSION.SDK_INT >= 28 && (i4 = this.h) != -1) {
            typeface = u0.a(typeface, i4, (this.f2631i & 2) != 0);
        }
        v0 v0Var = this.f2633k;
        if (v0Var.f2680m) {
            v0Var.f2679l = typeface;
            TextView textView = (TextView) this.f2632j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new r0(textView, typeface, v0Var.f2677j));
                } else {
                    textView.setTypeface(typeface, v0Var.f2677j);
                }
            }
        }
    }

    @Override // b0.b
    public final void g(int i4) {
    }
}
