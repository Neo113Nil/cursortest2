package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class z5 extends l70 {
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ WeakReference q;
    public final /* synthetic */ e6 r;

    public z5(e6 e6Var, int i, int i2, WeakReference weakReference) {
        this.r = e6Var;
        this.o = i;
        this.p = i2;
        this.q = weakReference;
    }

    @Override // defpackage.l70
    public final void D(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.o) != -1) {
            typeface = d6.a(typeface, i, (this.p & 2) != 0);
        }
        e6 e6Var = this.r;
        if (e6Var.m) {
            e6Var.l = typeface;
            TextView textView = (TextView) this.q.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = e6Var.j;
                if (isAttachedToWindow) {
                    textView.post(new a6(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.l70
    public final void C(int i) {
    }
}
