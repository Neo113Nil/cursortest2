package p000createpolar;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageZipStrikeStrike1055 extends InputStream implements DataInput {
    public byte[] PolarVoyageBottomSheetOmegaNeo1907;
    public final DataInputStream PolarVoyageItemDecorationUltraDeltaEpic7485;
    public ByteOrder PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public final int PolarVoyageViewRogueMaster4778;

    public PolarVoyageZipStrikeStrike1055(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = dataInputStream;
        dataInputStream.mark(0);
        this.PolarVoyageStrictModeLegendEpic1532 = 0;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = byteOrder;
        this.PolarVoyageViewRogueMaster4778 = inputStream instanceof PolarVoyageZipStrikeStrike1055 ? ((PolarVoyageZipStrikeStrike1055) inputStream).PolarVoyageViewRogueMaster4778 : -1;
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.PolarVoyageBottomSheetOmegaNeo1907 == null) {
                    this.PolarVoyageBottomSheetOmegaNeo1907 = new byte[8192];
                }
                skip = dataInputStream.read(this.PolarVoyageBottomSheetOmegaNeo1907, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i2 += skip;
        }
        this.PolarVoyageStrictModeLegendEpic1532 += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.PolarVoyageStrictModeLegendEpic1532++;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.PolarVoyageStrictModeLegendEpic1532++;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.PolarVoyageStrictModeLegendEpic1532++;
        int read = this.PolarVoyageItemDecorationUltraDeltaEpic7485.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.PolarVoyageStrictModeLegendEpic1532 += 2;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.PolarVoyageStrictModeLegendEpic1532 += bArr.length;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.PolarVoyageStrictModeLegendEpic1532 += 4;
        DataInputStream dataInputStream = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageSnackbarGammaEclipse2140(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.PolarVoyageStrictModeLegendEpic1532 += 8;
        DataInputStream dataInputStream = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageSnackbarGammaEclipse2140(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.PolarVoyageStrictModeLegendEpic1532 += 2;
        DataInputStream dataInputStream = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageSnackbarGammaEclipse2140(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.PolarVoyageStrictModeLegendEpic1532 += 2;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.PolarVoyageStrictModeLegendEpic1532++;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.PolarVoyageStrictModeLegendEpic1532 += 2;
        DataInputStream dataInputStream = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageSnackbarGammaEclipse2140(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.PolarVoyageStrictModeLegendEpic1532 += i2;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.PolarVoyageItemDecorationUltraDeltaEpic7485.read(bArr, i, i2);
        this.PolarVoyageStrictModeLegendEpic1532 += read;
        return read;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolarVoyageZipStrikeStrike1055(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageZipStrikeStrike1055(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.PolarVoyageViewRogueMaster4778 = bArr.length;
    }
}
