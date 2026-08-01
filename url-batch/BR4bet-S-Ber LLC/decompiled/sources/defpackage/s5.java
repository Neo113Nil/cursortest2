package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class s5 extends b9 {
    public final /* synthetic */ x5 A;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ WeakReference z;

    public s5(x5 x5Var, int i, int i2, WeakReference weakReference) {
        this.A = x5Var;
        this.x = i;
        this.y = i2;
        this.z = weakReference;
    }

    @Override // defpackage.b9
    public final void A(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.x) != -1) {
            typeface = w5.a(typeface, i, (this.y & 2) != 0);
        }
        x5 x5Var = this.A;
        if (x5Var.m) {
            x5Var.l = typeface;
            TextView textView = (TextView) this.z.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = x5Var.j;
                if (isAttachedToWindow) {
                    textView.post(new t5(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.b9
    public final void z(int i) {
    }
}
