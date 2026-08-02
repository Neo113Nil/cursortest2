package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class anw extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public anw(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.j;
        int abs = swipeRefreshLayout.g - Math.abs(swipeRefreshLayout.f);
        swipeRefreshLayout.j((swipeRefreshLayout.e + ((int) ((abs - r0) * f))) - swipeRefreshLayout.d.getTop());
        swipeRefreshLayout.h.c(1.0f - f);
    }
}
