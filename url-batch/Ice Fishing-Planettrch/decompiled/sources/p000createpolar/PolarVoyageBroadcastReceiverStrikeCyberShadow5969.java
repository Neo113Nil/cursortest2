package p000createpolar;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBroadcastReceiverStrikeCyberShadow5969 extends PolarVoyageFragmentManagerLegendTurboPrime4319 {
    public static final int PolarVoyageStrictModeLegendEpic1532 = Float.floatToIntBits(Float.NaN);

    public static void PolarVoyageDrawableDeltaHyperion5742(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == PolarVoyageStrictModeLegendEpic1532) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // p000createpolar.PolarVoyageLiveDataQuantumSpeedNovaX2823
    public final void PolarVoyageTextInputEditTextNebulaHero6651(ByteBuffer byteBuffer) {
        ByteBuffer PolarVoyageCameraPixelBlaze2629;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653;
        if (i2 == 2) {
            PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629(i * 2);
            while (position < limit) {
                PolarVoyageDrawableDeltaHyperion5742(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), PolarVoyageCameraPixelBlaze2629);
                position += 2;
            }
        } else if (i2 == 1342177280) {
            PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629((i / 3) * 4);
            while (position < limit) {
                PolarVoyageDrawableDeltaHyperion5742(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), PolarVoyageCameraPixelBlaze2629);
                position += 3;
            }
        } else if (i2 == 1610612736) {
            PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629(i);
            while (position < limit) {
                PolarVoyageDrawableDeltaHyperion5742((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), PolarVoyageCameraPixelBlaze2629);
                position += 4;
            }
        } else if (i2 == 1879048192) {
            PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629(i / 2);
            while (position < limit) {
                PolarVoyageCameraPixelBlaze2629.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i2 == 21) {
            PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629((i / 3) * 4);
            while (position < limit) {
                PolarVoyageDrawableDeltaHyperion5742(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), PolarVoyageCameraPixelBlaze2629);
                position += 3;
            }
        } else {
            if (i2 != 22) {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                return;
            }
            PolarVoyageCameraPixelBlaze2629 = PolarVoyageCameraPixelBlaze2629(i);
            while (position < limit) {
                PolarVoyageDrawableDeltaHyperion5742((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), PolarVoyageCameraPixelBlaze2629);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        PolarVoyageCameraPixelBlaze2629.flip();
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerLegendTurboPrime4319
    public final PolarVoyageFocusMeteringActionCelestialStrikeMax1103 PolarVoyageZipVortexCelestial6185(PolarVoyageFocusMeteringActionCelestialStrikeMax1103 polarVoyageFocusMeteringActionCelestialStrikeMax1103) {
        int i = polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageKotlinBetaPulseBeta3653;
        if (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageAlertDialogCyberHeroQuantum3938(i) || i == 2) {
            return i != 4 ? new PolarVoyageFocusMeteringActionCelestialStrikeMax1103(polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageZipVortexCelestial6185, polarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageMotionLayoutTransitionHeroVision4068, 4) : PolarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageBitmapVisionAuroraPixel4705;
        }
        throw new PolarVoyageOnAttachStateChangeListenerRoguePulse3137(polarVoyageFocusMeteringActionCelestialStrikeMax1103);
    }
}
