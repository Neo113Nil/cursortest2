package p000createpolar;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePermissionThunderPrime8978 extends ViewOutlineProvider {
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                if (!(view instanceof PolarVoyageLifecycleCameraControllerOlympianCelestial4947) || (outline2 = ((PolarVoyageLifecycleCameraControllerOlympianCelestial4947) view).PolarVoyageViewRogueMaster4778) == null) {
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
