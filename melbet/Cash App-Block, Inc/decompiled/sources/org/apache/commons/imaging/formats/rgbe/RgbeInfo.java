package org.apache.commons.imaging.formats.rgbe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.GenericImageMetadata;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;

/* loaded from: classes9.dex */
class RgbeInfo implements Closeable {
    private static final byte[] HEADER = {35, 63, 82, 65, 68, 73, 65, 78, 67, 69};
    private static final Pattern RESOLUTION_STRING = Pattern.compile("-Y (\\d+) \\+X (\\d+)");
    private static final byte[] TWO_TWO = {2, 2};
    private final InputStream in;
    private GenericImageMetadata metadata;
    private int width = -1;
    private int height = -1;

    public RgbeInfo(ByteSource byteSource) {
        this.in = byteSource.getInputStream();
    }

    private static void decompress(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int read = inputStream.read();
            if (read < 0) {
                f$$ExternalSyntheticLambda0.m("Error decompressing RGBE file");
                return;
            }
            if (read > 128) {
                int read2 = inputStream.read();
                int i2 = 0;
                while (i2 < (read & 127)) {
                    bArr[i] = (byte) read2;
                    i2++;
                    i++;
                }
            } else {
                int i3 = 0;
                while (i3 < read) {
                    bArr[i] = (byte) inputStream.read();
                    i3++;
                    i++;
                }
            }
        }
    }

    private void readDimensions() {
        getMetadata();
        String readNextLine = new InfoHeaderReader(this.in).readNextLine();
        Matcher matcher = RESOLUTION_STRING.matcher(readNextLine);
        if (!matcher.matches()) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid HDR resolution string. Only \"-Y N +X M\" is supported. Found \"", readNextLine, "\""));
        }
        this.height = Integer.parseInt(matcher.group(1));
        this.width = Integer.parseInt(matcher.group(2));
    }

    private void readMetadata() {
        BinaryFunctions.readAndVerifyBytes(this.in, HEADER, "Not a valid HDR: Incorrect Header");
        InfoHeaderReader infoHeaderReader = new InfoHeaderReader(this.in);
        if (infoHeaderReader.readNextLine().length() != 0) {
            f$$ExternalSyntheticLambda0.m("Not a valid HDR: Incorrect Header");
            return;
        }
        this.metadata = new GenericImageMetadata();
        for (String readNextLine = infoHeaderReader.readNextLine(); readNextLine.length() != 0; readNextLine = infoHeaderReader.readNextLine()) {
            int indexOf = readNextLine.indexOf(61);
            if (indexOf > 0) {
                String substring = readNextLine.substring(0, indexOf);
                String substring2 = readNextLine.substring(indexOf + 1);
                if (ImagingConstants.PARAM_KEY_FORMAT.equals(substring2) && !"32-bit_rle_rgbe".equals(substring2)) {
                    throw new ImageReadException("Only 32-bit_rle_rgbe images are supported, trying to read ".concat(substring2));
                }
                this.metadata.add(substring, substring2);
            } else {
                this.metadata.add("<command>", readNextLine);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.in.close();
    }

    public int getHeight() {
        if (-1 == this.height) {
            readDimensions();
        }
        return this.height;
    }

    public ImageMetadata getMetadata() {
        if (this.metadata == null) {
            readMetadata();
        }
        return this.metadata;
    }

    public float[][] getPixelData() {
        float[][] fArr;
        int i;
        int height = getHeight();
        int width = getWidth();
        if (width >= 32768) {
            f$$ExternalSyntheticLambda0.m("Scan lines must be less than 32768 bytes long");
            return null;
        }
        byte[] bytes = ByteConversions.toBytes((short) width, ByteOrder.BIG_ENDIAN);
        byte[] bArr = new byte[width * 4];
        int i2 = 0;
        int i3 = 3;
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, width * height);
        int i4 = 0;
        while (i4 < height) {
            BinaryFunctions.readAndVerifyBytes(this.in, TWO_TWO, "Scan line " + i4 + " expected to start with 0x2 0x2");
            BinaryFunctions.readAndVerifyBytes(this.in, bytes, "Scan line " + i4 + " length expected");
            decompress(this.in, bArr);
            int i5 = i2;
            while (i5 < i3) {
                int i6 = i5 * width;
                int i7 = width * 3;
                int i8 = i2;
                while (i8 < width) {
                    int i9 = (i4 * width) + i8;
                    if ((bArr[i8 + i7] & 255) == 0) {
                        fArr2[i5][i9] = 0.0f;
                        fArr = fArr2;
                        i = i4;
                    } else {
                        fArr = fArr2;
                        i = i4;
                        fArr[i5][i9] = ((bArr[i8 + i6] & 255) + 0.5f) * ((float) Math.pow(2.0d, r13 - 136));
                    }
                    i8++;
                    fArr2 = fArr;
                    i4 = i;
                }
                i5++;
                i2 = 0;
                i3 = 3;
            }
            i4++;
            i2 = 0;
            i3 = 3;
        }
        return fArr2;
    }

    public int getWidth() {
        if (-1 == this.width) {
            readDimensions();
        }
        return this.width;
    }
}
