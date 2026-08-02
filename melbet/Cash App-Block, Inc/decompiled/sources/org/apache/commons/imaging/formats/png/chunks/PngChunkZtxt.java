package org.apache.commons.imaging.formats.png.chunks;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.zip.InflaterInputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.png.PngText;

/* loaded from: classes9.dex */
public class PngChunkZtxt extends PngTextChunk {
    public final String keyword;
    public final String text;

    public PngChunkZtxt(int i, int i2, int i3, byte[] bArr) {
        super(i, i2, i3, bArr);
        int findNull = BinaryFunctions.findNull(bArr);
        if (findNull < 0) {
            f$$ExternalSyntheticLambda0.m("PNG zTXt chunk keyword is unterminated.");
            throw null;
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        this.keyword = new String(bArr, 0, findNull, charset);
        int i4 = findNull + 1;
        int i5 = findNull + 2;
        byte b = bArr[i4];
        if (b != 0) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(b, "PNG zTXt chunk has unexpected compression method: "));
        }
        int length = bArr.length - i5;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i5, bArr2, 0, length);
        this.text = new String(BinaryFunctions.getStreamBytes(new InflaterInputStream(new ByteArrayInputStream(bArr2))), charset);
    }

    @Override // org.apache.commons.imaging.formats.png.chunks.PngTextChunk
    public PngText getContents() {
        return new PngText.Ztxt(this.keyword, this.text);
    }

    @Override // org.apache.commons.imaging.formats.png.chunks.PngTextChunk
    public String getKeyword() {
        return this.keyword;
    }

    @Override // org.apache.commons.imaging.formats.png.chunks.PngTextChunk
    public String getText() {
        return this.text;
    }
}
