package p000createpolar;

import java.io.InputStream;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBroadcastReceiverInfernoBlazeOmega2980 extends InputStream {
    public final InputStream PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageStrictModeLegendEpic1532 = 1073741824;

    public PolarVoyageBroadcastReceiverInfernoBlazeOmega2980(InputStream inputStream) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.PolarVoyageItemDecorationUltraDeltaEpic7485.read();
        if (read == -1) {
            this.PolarVoyageStrictModeLegendEpic1532 = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.PolarVoyageItemDecorationUltraDeltaEpic7485.read(bArr);
        if (read == -1) {
            this.PolarVoyageStrictModeLegendEpic1532 = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.PolarVoyageItemDecorationUltraDeltaEpic7485.read(bArr, i, i2);
        if (read == -1) {
            this.PolarVoyageStrictModeLegendEpic1532 = 0;
        }
        return read;
    }
}
