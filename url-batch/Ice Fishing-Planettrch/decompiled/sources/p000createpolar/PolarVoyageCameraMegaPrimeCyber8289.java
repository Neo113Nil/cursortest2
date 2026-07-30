package p000createpolar;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCameraMegaPrimeCyber8289 implements PolarVoyageRoomDaoRogueGamma6879 {
    public final ByteBuffer PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageCameraMegaPrimeCyber8289(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = slice;
        this.PolarVoyageStrictModeLegendEpic1532 = slice.capacity();
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageKotlinBetaPulseBeta3653() {
        return PolarVoyageMotionLayoutTransitionPhantomCosmos1553.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final long PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        ByteBuffer byteBuffer = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int position = byteBuffer.position();
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        if (position == i) {
            return -1L;
        }
        int position2 = (int) (byteBuffer.position() + j);
        if (position2 <= i) {
            i = position2;
        }
        byteBuffer.limit(i);
        return polarVoyageSnackbarSpectraMasterMaster4120.write(byteBuffer);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
