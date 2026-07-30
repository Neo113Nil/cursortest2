package p000createpolar;

import android.app.Activity;
import android.app.Notification;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import p000createpolar.PolarVoyageObjectAnimatorAuroraPhoenix1946;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageRoomDatabaseNebulaTurbo9943 {
    public static void PolarVoyageBarcodeScannerInfernoSolarSpark7767(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void PolarVoyageBitmapVisionAuroraPixel4705(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void PolarVoyageBottomSheetOmegaNeo1907(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void PolarVoyageDiffUtilTurboStrike5735(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static Insets PolarVoyageItemDecorationUltraDeltaEpic7485(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static ViewStructure PolarVoyageKotlinBetaPulseBeta3653(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static AutofillId PolarVoyageMotionLayoutTransitionHeroVision4068(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static void PolarVoyageRotateAnimationCyberCelestialDelta4768(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static final void PolarVoyageStrictModeLegendEpic1532(Activity activity, PolarVoyageObjectAnimatorAuroraPhoenix1946.PolarVoyageOnGlobalLayoutListenerVortexEpic7760 polarVoyageOnGlobalLayoutListenerVortexEpic7760) {
        activity.registerActivityLifecycleCallbacks(polarVoyageOnGlobalLayoutListenerVortexEpic7760);
    }

    public static void PolarVoyageTextInputEditTextNebulaHero6651(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static void PolarVoyageViewRogueMaster4778(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static ContentCaptureSession PolarVoyageZipVortexCelestial6185(View view) {
        return view.getContentCaptureSession();
    }
}
