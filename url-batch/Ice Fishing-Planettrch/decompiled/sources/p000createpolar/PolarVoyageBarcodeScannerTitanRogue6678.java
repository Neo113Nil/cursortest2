package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageBarcodeScannerTitanRogue6678 extends PolarVoyageImageCaptureBetaTitanium7525 implements PolarVoyageStateFlowNebulaMax1492 {
    public final /* synthetic */ int PolarVoyageSnackbarGammaEclipse2140;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PolarVoyageBarcodeScannerTitanRogue6678(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.PolarVoyageSnackbarGammaEclipse2140 = i4;
    }

    @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
    public final Object PolarVoyageZipVortexCelestial6185(Object obj) {
        int i;
        int i2 = this.PolarVoyageSnackbarGammaEclipse2140;
        PolarVoyageFilterGammaStrikeNova8373 polarVoyageFilterGammaStrikeNova8373 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
        Object obj2 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                PolarVoyageTranslateAnimationAlphaHyper3820 polarVoyageTranslateAnimationAlphaHyper3820 = (PolarVoyageTranslateAnimationAlphaHyper3820) obj2;
                PolarVoyageKeyframeTitanTurboCyber6086 polarVoyageKeyframeTitanTurboCyber6086 = polarVoyageTranslateAnimationAlphaHyper3820.PolarVoyageFCMCelestialCosmosPixel3711;
                if (!booleanValue) {
                    if (polarVoyageTranslateAnimationAlphaHyper3820.PolarVoyageAlertDialogCyberHeroQuantum3938 != null) {
                        Object[] objArr = polarVoyageKeyframeTitanTurboCyber6086.PolarVoyageKotlinBetaPulseBeta3653;
                        long[] jArr = polarVoyageKeyframeTitanTurboCyber6086.PolarVoyageZipVortexCelestial6185;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j) < 128) {
                                            i = i5;
                                            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDatabaseCosmosSpectraSolar3905(polarVoyageTranslateAnimationAlphaHyper3820.PolarVoyageCombineBlazeSparkInferno2844(), null, new PolarVoyageToastStrikePixel1863(polarVoyageTranslateAnimationAlphaHyper3820, (PolarVoyageToolbarNovaCosmos6002) objArr[(i4 << 3) + i7], null, i3), 3);
                                        } else {
                                            i = i5;
                                        }
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                    if (i6 != i5) {
                                    }
                                }
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                    }
                    polarVoyageKeyframeTitanTurboCyber6086.PolarVoyageZipVortexCelestial6185();
                    break;
                }
                break;
            default:
                ((PolarVoyageNotificationBetaStrike7088) obj2).PolarVoyageViewRogueMaster4778((Throwable) obj);
                break;
        }
        return polarVoyageFilterGammaStrikeNova8373;
    }
}
