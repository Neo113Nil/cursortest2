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
public class PngChunkItxt extends PngTextChunk {
    public final String keyword;
    public final String languageTag;
    public final String text;
    public final String translatedKeyword;

    public PngChunkItxt(int i, int i2, int i3, byte[] bArr) {
        super(i, i2, i3, bArr);
        int findNull = BinaryFunctions.findNull(bArr);
        if (findNull < 0) {
            f$$ExternalSyntheticLambda0.m("PNG iTXt chunk keyword is not terminated.");
            throw null;
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        this.keyword = new String(bArr, 0, findNull, charset);
        int i4 = findNull + 2;
        byte b = bArr[findNull + 1];
        if (b != 0 && b != 1) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(b, "PNG iTXt chunk has invalid compression flag: "));
        }
        boolean z = b == 1;
        int i5 = findNull + 3;
        byte b2 = bArr[i4];
        if (z && b2 != 0) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(b2, "PNG iTXt chunk has unexpected compression method: "));
        }
        int findNull2 = BinaryFunctions.findNull(bArr, i5);
        if (findNull2 < 0) {
            f$$ExternalSyntheticLambda0.m("PNG iTXt chunk language tag is not terminated.");
            throw null;
        }
        this.languageTag = new String(bArr, i5, findNull2 - i5, charset);
        int i6 = findNull2 + 1;
        int findNull3 = BinaryFunctions.findNull(bArr, i6);
        if (findNull3 < 0) {
            f$$ExternalSyntheticLambda0.m("PNG iTXt chunk translated keyword is not terminated.");
            throw null;
        }
        Charset charset2 = StandardCharsets.UTF_8;
        this.translatedKeyword = new String(bArr, i6, findNull3 - i6, charset2);
        int i7 = findNull3 + 1;
        if (!z) {
            this.text = new String(bArr, i7, bArr.length - i7, charset2);
            return;
        }
        int length = bArr.length - i7;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i7, bArr2, 0, length);
        this.text = new String(BinaryFunctions.getStreamBytes(new InflaterInputStream(new ByteArrayInputStream(bArr2))), charset2);
    }

    @Override // org.apache.commons.imaging.formats.png.chunks.PngTextChunk
    public PngText getContents() {
        return new PngText.Itxt(this.keyword, this.text, this.languageTag, this.translatedKeyword);
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
