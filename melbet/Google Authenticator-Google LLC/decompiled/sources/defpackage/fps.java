package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fps extends fhq {
    public fps() {
        super((byte[]) null);
    }

    @Override // defpackage.fhq
    public final void v(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF u = u(tabLayout, view);
        float a = f < 0.5f ? fes.a(1.0f, 0.0f, 0.0f, 0.5f, f) : fes.a(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) u.left, drawable.getBounds().top, (int) u.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (a * 255.0f));
    }
}
