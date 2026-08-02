package org.apache.commons.imaging.formats.png.chunks;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.png.PngText;

/* loaded from: classes9.dex */
public class PngChunkText extends PngTextChunk {
    private static final Logger LOGGER = Logger.getLogger(PngChunkText.class.getName());
    public final String keyword;
    public final String text;

    public PngChunkText(int i, int i2, int i3, byte[] bArr) {
        super(i, i2, i3, bArr);
        int findNull = BinaryFunctions.findNull(bArr);
        if (findNull < 0) {
            f$$ExternalSyntheticLambda0.m("PNG tEXt chunk keyword is not terminated.");
            throw null;
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        String str = new String(bArr, 0, findNull, charset);
        this.keyword = str;
        int i4 = findNull + 1;
        String str2 = new String(bArr, i4, bArr.length - i4, charset);
        this.text = str2;
        Logger logger = LOGGER;
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("Keyword: " + str);
            logger.finest("Text: " + str2);
        }
    }

    @Override // org.apache.commons.imaging.formats.png.chunks.PngTextChunk
    public PngText getContents() {
        return new PngText.Text(this.keyword, this.text);
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
