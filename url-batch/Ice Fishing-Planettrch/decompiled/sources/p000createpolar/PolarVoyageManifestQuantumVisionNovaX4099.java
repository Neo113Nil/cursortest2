package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageManifestQuantumVisionNovaX4099 implements PolarVoyageObjectDetectionThunderHyperInferno3620 {
    public final /* synthetic */ PolarVoyageFragmentTransactionMaxMaxMega5005 PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
    public final /* synthetic */ PolarVoyageFragmentTransactionMaxMaxMega5005 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ PolarVoyageEventLegendDragon2659 PolarVoyageStrictModeLegendEpic1532;
    public final /* synthetic */ PolarVoyageFragmentTransactionMaxMaxMega5005 PolarVoyageViewRogueMaster4778;

    public /* synthetic */ PolarVoyageManifestQuantumVisionNovaX4099(PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659, PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega5005, PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega50052, PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega50053) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageEventLegendDragon2659;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageFragmentTransactionMaxMaxMega5005;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageFragmentTransactionMaxMaxMega50052;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageFragmentTransactionMaxMaxMega50053;
    }

    @Override // p000createpolar.PolarVoyageObjectDetectionThunderHyperInferno3620
    public final Object PolarVoyageDiffUtilTurboStrike5735(Object obj, Object obj2) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageFilterGammaStrikeNova8373 polarVoyageFilterGammaStrikeNova8373 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
        PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega5005 = this.PolarVoyageViewRogueMaster4778;
        PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega50052 = this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega50053 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 1) {
                    if (polarVoyageFragmentTransactionMaxMaxMega50053.PolarVoyageItemDecorationUltraDeltaEpic7485 != null) {
                        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        break;
                    } else if (longValue != 24) {
                        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        break;
                    } else {
                        polarVoyageFragmentTransactionMaxMaxMega50053.PolarVoyageItemDecorationUltraDeltaEpic7485 = Long.valueOf(polarVoyageEventLegendDragon2659.PolarVoyageDiffUtilTurboStrike5735());
                        polarVoyageFragmentTransactionMaxMaxMega50052.PolarVoyageItemDecorationUltraDeltaEpic7485 = Long.valueOf(polarVoyageEventLegendDragon2659.PolarVoyageDiffUtilTurboStrike5735());
                        polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485 = Long.valueOf(polarVoyageEventLegendDragon2659.PolarVoyageDiffUtilTurboStrike5735());
                        break;
                    }
                }
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 21589) {
                    if (longValue2 < 1) {
                        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("bad zip: extended timestamp extra too short");
                        break;
                    } else {
                        byte readByte = polarVoyageEventLegendDragon2659.readByte();
                        boolean z = (readByte & 1) == 1;
                        boolean z2 = (readByte & 2) == 2;
                        boolean z3 = (readByte & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue2 < j) {
                            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("bad zip: extended timestamp extra too short");
                            break;
                        } else {
                            if (z) {
                                polarVoyageFragmentTransactionMaxMaxMega50053.PolarVoyageItemDecorationUltraDeltaEpic7485 = Integer.valueOf(polarVoyageEventLegendDragon2659.PolarVoyageBitmapVisionAuroraPixel4705());
                            }
                            if (z2) {
                                polarVoyageFragmentTransactionMaxMaxMega50052.PolarVoyageItemDecorationUltraDeltaEpic7485 = Integer.valueOf(polarVoyageEventLegendDragon2659.PolarVoyageBitmapVisionAuroraPixel4705());
                            }
                            if (z3) {
                                polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485 = Integer.valueOf(polarVoyageEventLegendDragon2659.PolarVoyageBitmapVisionAuroraPixel4705());
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return polarVoyageFilterGammaStrikeNova8373;
    }

    public /* synthetic */ PolarVoyageManifestQuantumVisionNovaX4099(PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega5005, PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659, PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega50052, PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega50053) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageFragmentTransactionMaxMaxMega5005;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageEventLegendDragon2659;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageFragmentTransactionMaxMaxMega50052;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageFragmentTransactionMaxMaxMega50053;
    }
}
