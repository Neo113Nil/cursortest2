package org.apache.commons.imaging.formats.png.chunks;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
public class PngChunkScal extends PngChunk {
    public final int unitSpecifier;
    public final double unitsPerPixelXAxis;
    public final double unitsPerPixelYAxis;

    public PngChunkScal(int i, int i2, int i3, byte[] bArr) {
        super(i, i2, i3, bArr);
        byte b = bArr[0];
        this.unitSpecifier = b;
        if (b != 1 && b != 2) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(b, "PNG sCAL invalid unit specifier: "));
        }
        int findNull = BinaryFunctions.findNull(bArr);
        if (findNull < 0) {
            f$$ExternalSyntheticLambda0.m("PNG sCAL x and y axis value separator not found.");
            throw null;
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        this.unitsPerPixelXAxis = toDouble(new String(bArr, 1, findNull - 1, charset));
        int i4 = findNull + 1;
        if (i4 < i) {
            this.unitsPerPixelYAxis = toDouble(new String(bArr, i4, i - i4, charset));
        } else {
            f$$ExternalSyntheticLambda0.m("PNG sCAL chunk missing the y axis value.");
            throw null;
        }
    }

    private double toDouble(String str) {
        try {
            return Double.valueOf(str).doubleValue();
        } catch (NumberFormatException unused) {
            throw new ImageReadException(Recorder$$ExternalSyntheticOutline2.m("PNG sCAL error reading axis value - ", str));
        }
    }
}
