package p000createpolar;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGradlePluginGammaHero9871 extends FilterInputStream {
    public long PolarVoyageItemDecorationUltraDeltaEpic7485;
    public long PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageGradlePluginGammaHero9871(InputStream inputStream) {
        super(inputStream);
        this.PolarVoyageStrictModeLegendEpic1532 = -1L;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.PolarVoyageStrictModeLegendEpic1532 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.PolarVoyageStrictModeLegendEpic1532 == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.PolarVoyageItemDecorationUltraDeltaEpic7485));
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485--;
        }
        return read;
    }
}
