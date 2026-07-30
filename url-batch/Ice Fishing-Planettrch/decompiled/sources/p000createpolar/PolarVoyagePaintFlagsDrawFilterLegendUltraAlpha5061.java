package p000createpolar;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePaintFlagsDrawFilterLegendUltraAlpha5061 extends PolarVoyageFragmentManagerLegendTurboPrime4319 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[ADDED_TO_REGION, LOOP:7: B:48:0x0113->B:49:0x0115, LOOP_START, PHI: r0
      0x0113: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0042, B:49:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000createpolar.PolarVoyageLiveDataQuantumSpeedNovaX2823
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageTextInputEditTextNebulaHero6651(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    if (i3 != 1879048192) {
                                        PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                                        return;
                                    }
                                    i2 /= 4;
                                }
                            }
                        }
                        ByteBuffer PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629(i2);
                        i = this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653;
                        if (i == 3) {
                            while (position < limit) {
                                PolarVoyageCameraPixelBlaze2629.put((byte) 0);
                                PolarVoyageCameraPixelBlaze2629.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                short PolarVoyageDiffUtilTurboStrike5735 = (short) (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageDiffUtilTurboStrike5735(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                PolarVoyageCameraPixelBlaze2629.put((byte) (PolarVoyageDiffUtilTurboStrike5735 & 255));
                                PolarVoyageCameraPixelBlaze2629.put((byte) ((PolarVoyageDiffUtilTurboStrike5735 >> 8) & 255));
                                position += 4;
                            }
                        } else if (i == 21) {
                            while (position < limit) {
                                PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(position + 1));
                                PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i == 22) {
                            while (position < limit) {
                                PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(position + 2));
                                PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i == 268435456) {
                            while (position < limit) {
                                PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(position + 1));
                                PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i == 1342177280) {
                            while (position < limit) {
                                PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(position + 1));
                                PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else if (i == 1610612736) {
                            while (position < limit) {
                                PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(position + 1));
                                PolarVoyageCameraPixelBlaze2629.put(byteBuffer.get(position));
                                position += 4;
                            }
                        } else {
                            if (i != 1879048192) {
                                PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                                return;
                            }
                            while (position < limit) {
                                short max = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position), 1.0d)) * 32767.0d);
                                PolarVoyageCameraPixelBlaze2629.put((byte) (max & 255));
                                PolarVoyageCameraPixelBlaze2629.put((byte) ((max >> 8) & 255));
                                position += 8;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        PolarVoyageCameraPixelBlaze2629.flip();
                    }
                }
                i2 /= 3;
            }
            i2 /= 2;
            ByteBuffer PolarVoyageCameraPixelBlaze26292 = PolarVoyageCameraPixelBlaze2629(i2);
            i = this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            PolarVoyageCameraPixelBlaze26292.flip();
        }
        i2 *= 2;
        ByteBuffer PolarVoyageCameraPixelBlaze262922 = PolarVoyageCameraPixelBlaze2629(i2);
        i = this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        PolarVoyageCameraPixelBlaze262922.flip();
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final PolarVoyageFocusMeteringActionCelestialStrikeMax1103 PolarVoyageZipVortexCelestial6185(PolarVoyageFocusMeteringActionCelestialStrikeMax1103 polarVoyageFocusMeteringActionCelestialStrikeMax1103) {
        int i = polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageKotlinBetaPulseBeta3653;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192) {
            return i != 2 ? new PolarVoyageFocusMeteringActionCelestialStrikeMax1103(polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageZipVortexCelestial6185, polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageMotionLayoutTransitionHeroVision4068, 2) : PolarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageBitmapVisionAuroraPixel4705;
        }
        throw new PolarVoyageOnAttachStateChangeListenerRoguePulse3137(polarVoyageFocusMeteringActionCelestialStrikeMax1103);
    }
}
