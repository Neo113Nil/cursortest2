package p000createpolar;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRealtimeDatabaseNovaTurboNovaX2459 {
    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final long PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageRealtimeDatabaseNovaTurboNovaX2459(int i, int i2, long j, long j2) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = j;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j2;
    }

    public static PolarVoyageRealtimeDatabaseNovaTurboNovaX2459 PolarVoyageZipVortexCelestial6185(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            PolarVoyageRealtimeDatabaseNovaTurboNovaX2459 polarVoyageRealtimeDatabaseNovaTurboNovaX2459 = new PolarVoyageRealtimeDatabaseNovaTurboNovaX2459(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return polarVoyageRealtimeDatabaseNovaTurboNovaX2459;
        } finally {
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.PolarVoyageZipVortexCelestial6185);
            dataOutputStream.writeInt(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
            dataOutputStream.writeLong(this.PolarVoyageKotlinBetaPulseBeta3653);
            dataOutputStream.writeLong(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof PolarVoyageRealtimeDatabaseNovaTurboNovaX2459)) {
            PolarVoyageRealtimeDatabaseNovaTurboNovaX2459 polarVoyageRealtimeDatabaseNovaTurboNovaX2459 = (PolarVoyageRealtimeDatabaseNovaTurboNovaX2459) obj;
            if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageRealtimeDatabaseNovaTurboNovaX2459.PolarVoyageMotionLayoutTransitionHeroVision4068 && this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageRealtimeDatabaseNovaTurboNovaX2459.PolarVoyageKotlinBetaPulseBeta3653 && this.PolarVoyageZipVortexCelestial6185 == polarVoyageRealtimeDatabaseNovaTurboNovaX2459.PolarVoyageZipVortexCelestial6185 && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == polarVoyageRealtimeDatabaseNovaTurboNovaX2459.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.PolarVoyageMotionLayoutTransitionHeroVision4068), Long.valueOf(this.PolarVoyageKotlinBetaPulseBeta3653), Integer.valueOf(this.PolarVoyageZipVortexCelestial6185), Long.valueOf(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767));
    }
}
