package P0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import u0.F0;

/* loaded from: classes.dex */
public final class p extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3057a;

    public /* synthetic */ p(int i3) {
        this.f3057a = i3;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f3057a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 1:
                if ((view instanceof e0.o) && (outline2 = ((e0.o) view).f4578h) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            default:
                Z1.i.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline b2 = ((F0) view).f8167h.b();
                Z1.i.c(b2);
                outline.set(b2);
                break;
        }
    }
}
