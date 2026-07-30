package p000createpolar;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageResourceBetaDragon8086 extends PolarVoyageAdMobDragonPhoenix1447 {
    public final PolarVoyageToastStormTitaniumUltra7487 PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageToastStormTitaniumUltra7487();
    public boolean PolarVoyageCameraPixelBlaze2629;
    public final int PolarVoyageContentProviderHyperSpark3838;
    public long PolarVoyageDrawableDeltaHyperion5742;
    public PolarVoyageDisplayMetricsSpectraNeoHero6356 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public ByteBuffer PolarVoyageSnackbarGammaEclipse2140;
    public ByteBuffer PolarVoyageViewRogueMaster4778;

    static {
        PolarVoyagePlaceholderOlympianVision8131.PolarVoyageZipVortexCelestial6185("media3.decoder");
    }

    public PolarVoyageResourceBetaDragon8086(int i) {
        this.PolarVoyageContentProviderHyperSpark3838 = i;
    }

    public void PolarVoyageDiffUtilTurboStrike5735() {
        this.PolarVoyageStrictModeLegendEpic1532 = 0;
        ByteBuffer byteBuffer = this.PolarVoyageViewRogueMaster4778;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.PolarVoyageSnackbarGammaEclipse2140;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.PolarVoyageCameraPixelBlaze2629 = false;
    }

    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        ByteBuffer byteBuffer = this.PolarVoyageViewRogueMaster4778;
        if (byteBuffer == null) {
            this.PolarVoyageViewRogueMaster4778 = PolarVoyageTextInputEditTextNebulaHero6651(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.PolarVoyageViewRogueMaster4778 = byteBuffer;
            return;
        }
        ByteBuffer PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageTextInputEditTextNebulaHero6651(i2);
        PolarVoyageTextInputEditTextNebulaHero6651.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            PolarVoyageTextInputEditTextNebulaHero6651.put(byteBuffer);
        }
        this.PolarVoyageViewRogueMaster4778 = PolarVoyageTextInputEditTextNebulaHero6651;
    }

    public final void PolarVoyageStrictModeLegendEpic1532() {
        ByteBuffer byteBuffer = this.PolarVoyageViewRogueMaster4778;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.PolarVoyageSnackbarGammaEclipse2140;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer PolarVoyageTextInputEditTextNebulaHero6651(int i) {
        int i2 = this.PolarVoyageContentProviderHyperSpark3838;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.PolarVoyageViewRogueMaster4778;
        throw new PolarVoyageTranslateAnimationAuroraHeroSolar6918("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }
}
