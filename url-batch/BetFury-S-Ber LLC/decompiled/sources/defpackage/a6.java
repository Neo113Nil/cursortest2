package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class a6 extends bi {
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ WeakReference q;
    public final /* synthetic */ f6 r;

    public a6(f6 f6Var, int i, int i2, WeakReference weakReference) {
        this.r = f6Var;
        this.o = i;
        this.p = i2;
        this.q = weakReference;
    }

    @Override // defpackage.bi
    public final void O(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.o) != -1) {
            typeface = e6.a(typeface, i, (this.p & 2) != 0);
        }
        f6 f6Var = this.r;
        if (f6Var.m) {
            f6Var.l = typeface;
            TextView textView = (TextView) this.q.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = f6Var.j;
                if (isAttachedToWindow) {
                    textView.post(new b6(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.bi
    public final void N(int i) {
    }
}
