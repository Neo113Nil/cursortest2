package p000createpolar;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRecyclerViewTurboQuantum2253 extends MediaDataSource {
    public long PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageDrawableCompatSpectraPhoenixStrike3679 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageRecyclerViewTurboQuantum2253(PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageDrawableCompatSpectraPhoenixStrike3679;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        PolarVoyageDrawableCompatSpectraPhoenixStrike3679 polarVoyageDrawableCompatSpectraPhoenixStrike3679 = this.PolarVoyageStrictModeLegendEpic1532;
        DataInputStream dataInputStream = polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        polarVoyageDrawableCompatSpectraPhoenixStrike3679.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j);
                        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = polarVoyageDrawableCompatSpectraPhoenixStrike3679.read(bArr, i, i2);
                if (read >= 0) {
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
