package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageDatabaseVisionMega1683 implements Runnable, Comparable, PolarVoyagePagingDataStormPhantomEclipse5825 {
    public long PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageStrictModeLegendEpic1532 = -1;
    private volatile Object _heap;

    public PolarVoyageDatabaseVisionMega1683(long j) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = j;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageAccelerometerGammaSolar6718 polarVoyageAccelerometerGammaSolar6718) {
        if (this._heap != PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageKotlinBetaPulseBeta3653) {
            this._heap = polarVoyageAccelerometerGammaSolar6718;
        } else {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Failed requirement.");
        }
    }

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068(long j, PolarVoyageAccelerometerGammaSolar6718 polarVoyageAccelerometerGammaSolar6718, PolarVoyagePlaceholderSpeedBetaPhantom4939 polarVoyagePlaceholderSpeedBetaPhantom4939) {
        synchronized (this) {
            if (this._heap == PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageKotlinBetaPulseBeta3653) {
                return 2;
            }
            synchronized (polarVoyageAccelerometerGammaSolar6718) {
                try {
                    PolarVoyageDatabaseVisionMega1683[] polarVoyageDatabaseVisionMega1683Arr = polarVoyageAccelerometerGammaSolar6718.PolarVoyageZipVortexCelestial6185;
                    PolarVoyageDatabaseVisionMega1683 polarVoyageDatabaseVisionMega1683 = polarVoyageDatabaseVisionMega1683Arr != null ? polarVoyageDatabaseVisionMega1683Arr[0] : null;
                    if (PolarVoyagePlaceholderSpeedBetaPhantom4939.PolarVoyageContentProviderHyperSpark3838.get(polarVoyagePlaceholderSpeedBetaPhantom4939) == 1) {
                        return 1;
                    }
                    if (polarVoyageDatabaseVisionMega1683 == null) {
                        polarVoyageAccelerometerGammaSolar6718.PolarVoyageKotlinBetaPulseBeta3653 = j;
                    } else {
                        long j2 = polarVoyageDatabaseVisionMega1683.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - polarVoyageAccelerometerGammaSolar6718.PolarVoyageKotlinBetaPulseBeta3653 > 0) {
                            polarVoyageAccelerometerGammaSolar6718.PolarVoyageKotlinBetaPulseBeta3653 = j;
                        }
                    }
                    long j3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    long j4 = polarVoyageAccelerometerGammaSolar6718.PolarVoyageKotlinBetaPulseBeta3653;
                    if (j3 - j4 < 0) {
                        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = j4;
                    }
                    polarVoyageAccelerometerGammaSolar6718.PolarVoyageZipVortexCelestial6185(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000createpolar.PolarVoyagePagingDataStormPhantomEclipse5825
    public final void PolarVoyageZipVortexCelestial6185() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageKotlinBetaPulseBeta3653;
                if (obj == polarVoyageAssetManagerEclipseHyperInferno7091) {
                    return;
                }
                PolarVoyageAccelerometerGammaSolar6718 polarVoyageAccelerometerGammaSolar6718 = obj instanceof PolarVoyageAccelerometerGammaSolar6718 ? (PolarVoyageAccelerometerGammaSolar6718) obj : null;
                if (polarVoyageAccelerometerGammaSolar6718 != null) {
                    synchronized (polarVoyageAccelerometerGammaSolar6718) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof PolarVoyageR8TitaniumPrimeForce7299 ? (PolarVoyageR8TitaniumPrimeForce7299) obj2 : null) != null) {
                            polarVoyageAccelerometerGammaSolar6718.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageStrictModeLegendEpic1532);
                        }
                    }
                }
                this._heap = polarVoyageAssetManagerEclipseHyperInferno7091;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.PolarVoyageItemDecorationUltraDeltaEpic7485 - ((PolarVoyageDatabaseVisionMega1683) obj).PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.PolarVoyageItemDecorationUltraDeltaEpic7485 + ']';
    }
}
