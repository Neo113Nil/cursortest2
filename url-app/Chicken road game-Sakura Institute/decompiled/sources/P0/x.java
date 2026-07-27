package P0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;
import s0.R0;

/* loaded from: classes.dex */
public final class x extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3771a;

    public /* synthetic */ x(int i2) {
        this.f3771a = i2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f3771a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                if ((view instanceof c0.n) && (outline2 = ((c0.n) view).f5830k) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            default:
                Intrinsics.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline b4 = ((R0) view).f10121k.b();
                Intrinsics.c(b4);
                outline.set(b4);
                break;
        }
    }
}
