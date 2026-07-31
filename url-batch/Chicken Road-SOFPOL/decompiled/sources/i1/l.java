package i1;

import a0.q;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3379a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f3379a) {
            case 0:
                if (!(view instanceof m) || (outline2 = ((m) view).f3385h) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                q6.i.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                q.q(view);
                throw null;
        }
    }
}
