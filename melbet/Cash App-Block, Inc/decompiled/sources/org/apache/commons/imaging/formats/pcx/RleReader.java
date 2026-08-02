package org.apache.commons.imaging.formats.pcx;

import java.io.InputStream;
import java.util.Arrays;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
class RleReader {
    private int count;
    private final boolean isCompressed;
    private byte sample;

    public RleReader(boolean z) {
        this.isCompressed = z;
    }

    public void read(InputStream inputStream, byte[] bArr) {
        int i = 0;
        if (!this.isCompressed) {
            while (i < bArr.length) {
                int read = inputStream.read(bArr, i, bArr.length - i);
                if (read < 0) {
                    f$$ExternalSyntheticLambda0.m("Premature end of file reading image data");
                    return;
                }
                i += read;
            }
            return;
        }
        int min = Math.min(this.count, bArr.length);
        Arrays.fill(bArr, 0, min, this.sample);
        this.count -= min;
        while (min < bArr.length) {
            byte readByte = BinaryFunctions.readByte("RleByte", inputStream, "Error reading image data");
            if ((readByte & 192) == 192) {
                this.count = readByte & 63;
                this.sample = BinaryFunctions.readByte("RleValue", inputStream, "Error reading image data");
            } else {
                this.count = 1;
                this.sample = readByte;
            }
            int min2 = Math.min(this.count, bArr.length - min);
            int i2 = min + min2;
            Arrays.fill(bArr, min, i2, this.sample);
            this.count -= min2;
            min = i2;
        }
    }
}
