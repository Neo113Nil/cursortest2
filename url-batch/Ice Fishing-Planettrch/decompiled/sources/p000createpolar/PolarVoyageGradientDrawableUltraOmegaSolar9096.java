package p000createpolar;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGradientDrawableUltraOmegaSolar9096 implements Closeable {
    public static final Logger PolarVoyageCameraPixelBlaze2629 = Logger.getLogger(PolarVoyageDrawerLayoutBlazeOmegaUltra4339.class.getName());
    public boolean PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyagePaintFlagsDrawFilterCelestialVortex5562 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageSnackbarSpectraMasterMaster4120 PolarVoyageStrictModeLegendEpic1532;
    public final PolarVoyageRoomEntityEpicPrime2103 PolarVoyageViewRogueMaster4778;

    public PolarVoyageGradientDrawableUltraOmegaSolar9096(PolarVoyageFragmentTurboMax6129 polarVoyageFragmentTurboMax6129) {
        polarVoyageFragmentTurboMax6129.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageFragmentTurboMax6129;
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = new PolarVoyageSnackbarSpectraMasterMaster4120();
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageSnackbarSpectraMasterMaster4120;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 16384;
        this.PolarVoyageViewRogueMaster4778 = new PolarVoyageRoomEntityEpicPrime2103(polarVoyageSnackbarSpectraMasterMaster4120);
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(boolean z, int i, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120, int i2) {
        synchronized (this) {
            if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                throw new IOException("closed");
            }
            PolarVoyageBitmapVisionAuroraPixel4705(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                PolarVoyagePaintFlagsDrawFilterCelestialVortex5562 polarVoyagePaintFlagsDrawFilterCelestialVortex5562 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                polarVoyageSnackbarSpectraMasterMaster4120.getClass();
                polarVoyagePaintFlagsDrawFilterCelestialVortex5562.PolarVoyageViewRogueMaster4778(i2, polarVoyageSnackbarSpectraMasterMaster4120);
            }
        }
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = PolarVoyageCameraPixelBlaze2629;
            if (logger.isLoggable(level)) {
                logger.fine(PolarVoyageDrawerLayoutBlazeOmegaUltra4339.PolarVoyageMotionLayoutTransitionHeroVision4068(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("reserved bit set: ", i));
            return;
        }
        byte[] bArr = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185;
        PolarVoyagePaintFlagsDrawFilterCelestialVortex5562 polarVoyagePaintFlagsDrawFilterCelestialVortex5562 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyagePaintFlagsDrawFilterCelestialVortex5562.getClass();
        polarVoyagePaintFlagsDrawFilterCelestialVortex5562.writeByte((i2 >>> 16) & 255);
        polarVoyagePaintFlagsDrawFilterCelestialVortex5562.writeByte((i2 >>> 8) & 255);
        polarVoyagePaintFlagsDrawFilterCelestialVortex5562.writeByte(i2 & 255);
        polarVoyagePaintFlagsDrawFilterCelestialVortex5562.writeByte(i3 & 255);
        polarVoyagePaintFlagsDrawFilterCelestialVortex5562.writeByte(i4 & 255);
        polarVoyagePaintFlagsDrawFilterCelestialVortex5562.writeInt(i & Integer.MAX_VALUE);
    }

    public final void PolarVoyageCameraPixelBlaze2629(int i, PolarVoyageServiceInfoSolarMax5413 polarVoyageServiceInfoSolarMax5413) {
        synchronized (this) {
            if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                throw new IOException("closed");
            }
            if (polarVoyageServiceInfoSolarMax5413.PolarVoyageItemDecorationUltraDeltaEpic7485 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            PolarVoyageBitmapVisionAuroraPixel4705(i, 4, 3, 0);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.writeInt(polarVoyageServiceInfoSolarMax5413.PolarVoyageItemDecorationUltraDeltaEpic7485);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.flush();
        }
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(int i, PolarVoyageServiceInfoSolarMax5413 polarVoyageServiceInfoSolarMax5413, byte[] bArr) {
        synchronized (this) {
            if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                throw new IOException("closed");
            }
            if (polarVoyageServiceInfoSolarMax5413.PolarVoyageItemDecorationUltraDeltaEpic7485 == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            PolarVoyageBitmapVisionAuroraPixel4705(0, bArr.length + 8, 7, 0);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.writeInt(i);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.writeInt(polarVoyageServiceInfoSolarMax5413.PolarVoyageItemDecorationUltraDeltaEpic7485);
            if (bArr.length != 0) {
                this.PolarVoyageItemDecorationUltraDeltaEpic7485.write(bArr);
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.flush();
        }
    }

    public final void PolarVoyageDrawableDeltaHyperion5742(int i, long j) {
        synchronized (this) {
            try {
                if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = PolarVoyageCameraPixelBlaze2629;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(PolarVoyageDrawerLayoutBlazeOmegaUltra4339.PolarVoyageKotlinBetaPulseBeta3653(i, 4, j, false));
                }
                PolarVoyageBitmapVisionAuroraPixel4705(i, 4, 8, 0);
                this.PolarVoyageItemDecorationUltraDeltaEpic7485.writeInt((int) j);
                this.PolarVoyageItemDecorationUltraDeltaEpic7485.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageGuidelineThunderSolarAurora9069 polarVoyageGuidelineThunderSolarAurora9069) {
        polarVoyageGuidelineThunderSolarAurora9069.getClass();
        synchronized (this) {
            try {
                if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                    throw new IOException("closed");
                }
                int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                int i2 = polarVoyageGuidelineThunderSolarAurora9069.PolarVoyageZipVortexCelestial6185;
                if ((i2 & 32) != 0) {
                    i = polarVoyageGuidelineThunderSolarAurora9069.PolarVoyageMotionLayoutTransitionHeroVision4068[5];
                }
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
                if (((i2 & 2) != 0 ? polarVoyageGuidelineThunderSolarAurora9069.PolarVoyageMotionLayoutTransitionHeroVision4068[1] : -1) != -1) {
                    PolarVoyageRoomEntityEpicPrime2103 polarVoyageRoomEntityEpicPrime2103 = this.PolarVoyageViewRogueMaster4778;
                    int i3 = (i2 & 2) != 0 ? polarVoyageGuidelineThunderSolarAurora9069.PolarVoyageMotionLayoutTransitionHeroVision4068[1] : -1;
                    polarVoyageRoomEntityEpicPrime2103.getClass();
                    int min = Math.min(i3, 16384);
                    int i4 = polarVoyageRoomEntityEpicPrime2103.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    if (i4 != min) {
                        if (min < i4) {
                            polarVoyageRoomEntityEpicPrime2103.PolarVoyageMotionLayoutTransitionHeroVision4068 = Math.min(polarVoyageRoomEntityEpicPrime2103.PolarVoyageMotionLayoutTransitionHeroVision4068, min);
                        }
                        polarVoyageRoomEntityEpicPrime2103.PolarVoyageKotlinBetaPulseBeta3653 = true;
                        polarVoyageRoomEntityEpicPrime2103.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = min;
                        int i5 = polarVoyageRoomEntityEpicPrime2103.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        if (min < i5) {
                            if (min == 0) {
                                PolarVoyageZipNeoFusionAurora5444[] polarVoyageZipNeoFusionAurora5444Arr = polarVoyageRoomEntityEpicPrime2103.PolarVoyageBitmapVisionAuroraPixel4705;
                                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(polarVoyageZipNeoFusionAurora5444Arr, 0, polarVoyageZipNeoFusionAurora5444Arr.length);
                                polarVoyageRoomEntityEpicPrime2103.PolarVoyageDiffUtilTurboStrike5735 = polarVoyageRoomEntityEpicPrime2103.PolarVoyageBitmapVisionAuroraPixel4705.length - 1;
                                polarVoyageRoomEntityEpicPrime2103.PolarVoyageTextInputEditTextNebulaHero6651 = 0;
                                polarVoyageRoomEntityEpicPrime2103.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
                            } else {
                                polarVoyageRoomEntityEpicPrime2103.PolarVoyageZipVortexCelestial6185(i5 - min);
                            }
                        }
                    }
                }
                PolarVoyageBitmapVisionAuroraPixel4705(0, 0, 4, 1);
                this.PolarVoyageItemDecorationUltraDeltaEpic7485.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                throw new IOException("closed");
            }
            PolarVoyageBitmapVisionAuroraPixel4705(0, 8, 6, z ? 1 : 0);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.writeInt(i);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.writeInt(i2);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.flush();
        }
    }

    public final void PolarVoyageStrictModeLegendEpic1532(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                throw new IOException("closed");
            }
            this.PolarVoyageViewRogueMaster4778.PolarVoyageBarcodeScannerInfernoSolarSpark7767(arrayList);
            long j = this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532;
            long min = Math.min(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, j);
            int i2 = j == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            PolarVoyageBitmapVisionAuroraPixel4705(i, (int) min, 1, i2);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageViewRogueMaster4778(min, this.PolarVoyageStrictModeLegendEpic1532);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, j2);
                    j2 -= min2;
                    PolarVoyageBitmapVisionAuroraPixel4705(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageViewRogueMaster4778(min2, this.PolarVoyageStrictModeLegendEpic1532);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = true;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                throw new IOException("closed");
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.flush();
        }
    }
}
