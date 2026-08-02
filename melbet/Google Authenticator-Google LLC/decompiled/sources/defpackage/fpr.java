package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpr extends fhq {
    public fpr() {
        super((byte[]) null);
    }

    private static float A(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    private static float B(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.fhq
    public final void v(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float B;
        float A;
        RectF u = u(tabLayout, view);
        RectF u2 = u(tabLayout, view2);
        if (u.left < u2.left) {
            B = A(f);
            A = B(f);
        } else {
            B = B(f);
            A = A(f);
        }
        drawable.setBounds(fes.b((int) u.left, (int) u2.left, B), drawable.getBounds().top, fes.b((int) u.right, (int) u2.right, A), drawable.getBounds().bottom);
    }
}
