package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class anu extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ SwipeRefreshLayout c;

    public anu(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.b;
        this.c.h.setAlpha((int) (this.a + ((i - r0) * f)));
    }
}
