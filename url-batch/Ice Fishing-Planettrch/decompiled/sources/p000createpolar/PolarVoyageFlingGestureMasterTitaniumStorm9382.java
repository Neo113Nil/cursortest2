package p000createpolar;

import com.adjust.sdk.GooglePlayInstallReferrerDetails;
import com.adjust.sdk.OnGooglePlayInstallReferrerReadListener;
import java.io.IOException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlingGestureMasterTitaniumStorm9382 implements OnGooglePlayInstallReferrerReadListener, PolarVoyageTabLayoutNeoNeo7623 {
    public final PolarVoyageDebugStrikeEclipseQuantum3290 PolarVoyageItemDecorationUltraDeltaEpic7485;

    public /* synthetic */ PolarVoyageFlingGestureMasterTitaniumStorm9382(PolarVoyageDebugStrikeEclipseQuantum3290 polarVoyageDebugStrikeEclipseQuantum3290) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageDebugStrikeEclipseQuantum3290;
    }

    @Override // p000createpolar.PolarVoyageTabLayoutNeoNeo7623
    public void PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax4846, PolarVoyageResourcesBlazeDragon3291 polarVoyageResourcesBlazeDragon3291) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageResourcesBlazeDragon3291, PolarVoyageRotateDrawableEliteHyper7392.PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // p000createpolar.PolarVoyageTabLayoutNeoNeo7623
    public void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax4846, IOException iOException) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageViewRogueMaster4778(new PolarVoyageTraceThunderMaster6506(iOException));
    }

    @Override // com.adjust.sdk.OnGooglePlayInstallReferrerReadListener
    public void onFail(String str) {
        if (str == null) {
            str = "";
        }
        if (PolarVoyageDebugTitaniumInferno5712.PolarVoyageDiffUtilDragonSpeedEclipse6225(str)) {
            str = "Google Play install referrer request failed";
        }
        IllegalStateException illegalStateException = new IllegalStateException(str);
        PolarVoyageDebugStrikeEclipseQuantum3290 polarVoyageDebugStrikeEclipseQuantum3290 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageAlertDialogCyberHeroQuantum3938()) {
            polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageViewRogueMaster4778(new PolarVoyageTraceThunderMaster6506(illegalStateException));
        }
    }

    @Override // com.adjust.sdk.OnGooglePlayInstallReferrerReadListener
    public void onInstallReferrerRead(GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails) {
        String str = googlePlayInstallReferrerDetails != null ? googlePlayInstallReferrerDetails.installReferrer : null;
        if (str == null) {
            str = "";
        }
        PolarVoyageDebugStrikeEclipseQuantum3290 polarVoyageDebugStrikeEclipseQuantum3290 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageAlertDialogCyberHeroQuantum3938()) {
            polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageViewRogueMaster4778(str);
        }
    }

    public PolarVoyageFlingGestureMasterTitaniumStorm9382(PolarVoyageOnLongClickListenerOlympianPhantomAlpha1069 polarVoyageOnLongClickListenerOlympianPhantomAlpha1069, PolarVoyageDebugStrikeEclipseQuantum3290 polarVoyageDebugStrikeEclipseQuantum3290) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageDebugStrikeEclipseQuantum3290;
    }
}
