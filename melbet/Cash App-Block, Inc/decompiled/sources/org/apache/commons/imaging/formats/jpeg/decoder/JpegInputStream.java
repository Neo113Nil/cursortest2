package org.apache.commons.imaging.formats.jpeg.decoder;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageReadException;

/* loaded from: classes9.dex */
class JpegInputStream {
    private int b;
    private int cnt;
    private final int[] interval;
    private int nextPos = 0;

    public JpegInputStream(int[] iArr) {
        this.interval = Arrays.copyOf(iArr, iArr.length);
    }

    public boolean hasNext() {
        return this.nextPos < this.interval.length;
    }

    public int nextBit() {
        if (this.cnt == 0) {
            int read = read();
            this.b = read;
            if (read < 0) {
                f$$ExternalSyntheticLambda0.m("Premature End of File");
                return 0;
            }
            this.cnt = 8;
            if (read == 255) {
                int read2 = read();
                if (read2 < 0) {
                    f$$ExternalSyntheticLambda0.m("Premature End of File");
                    return 0;
                }
                if (read2 != 0) {
                    if (read2 != 220) {
                        throw new ImageReadException(Recorder$$ExternalSyntheticOutline1.m(read2, new StringBuilder("Invalid marker found in entropy data: 0xFF ")));
                    }
                    f$$ExternalSyntheticLambda0.m("DNL not yet supported");
                    return 0;
                }
            }
        }
        int i = this.b;
        int i2 = (i >> 7) & 1;
        this.cnt--;
        this.b = i << 1;
        return i2;
    }

    public int read() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m$1("This stream hasn't any other value, all values were already read.");
            return 0;
        }
        int[] iArr = this.interval;
        int i = this.nextPos;
        int i2 = iArr[i];
        this.nextPos = i + 1;
        return i2;
    }
}
