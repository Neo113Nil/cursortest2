package p000createpolar;

import java.io.OutputStream;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageActivityInfoPixelAlpha2209 extends OutputStream {
    public long PolarVoyageItemDecorationUltraDeltaEpic7485;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 += i2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485++;
    }
}
