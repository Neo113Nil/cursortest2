package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yz extends ViewOutlineProvider {
    public final /* synthetic */ int PxuCJdSBwIXG;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.PxuCJdSBwIXG) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                if (!(view instanceof br2) || (outline2 = ((br2) view).x50lh2ztY7Y5) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
