package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i5 extends jw {
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ WeakReference q;
    public final /* synthetic */ n5 r;

    public i5(n5 n5Var, int i, int i2, WeakReference weakReference) {
        this.r = n5Var;
        this.o = i;
        this.p = i2;
        this.q = weakReference;
    }

    @Override // defpackage.jw
    public final void N(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.o) != -1) {
            typeface = m5.a(typeface, i, (this.p & 2) != 0);
        }
        n5 n5Var = this.r;
        if (n5Var.m) {
            n5Var.l = typeface;
            TextView textView = (TextView) this.q.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = n5Var.j;
                if (isAttachedToWindow) {
                    textView.post(new j5(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.jw
    public final void M(int i) {
    }
}
