package c1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.installreferrer.api.InstallReferrerClient;
import s1.n2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1617a;

    public /* synthetic */ o(int i7) {
        this.f1617a = i7;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f1617a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if ((view instanceof p) && (outline2 = ((p) view).f1623j) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            default:
                r6.k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline b9 = ((n2) view).f8321j.b();
                r6.k.c(b9);
                outline.set(b9);
                break;
        }
    }
}
