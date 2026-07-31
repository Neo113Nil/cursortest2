package R0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import u0.Q0;

/* loaded from: classes.dex */
public final class w extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4125a;

    public /* synthetic */ w(int i3) {
        this.f4125a = i3;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f4125a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                if ((view instanceof e0.o) && (outline2 = ((e0.o) view).f5804h) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            default:
                f2.j.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline b3 = ((Q0) view).f9254h.b();
                f2.j.c(b3);
                outline.set(b3);
                break;
        }
    }
}
