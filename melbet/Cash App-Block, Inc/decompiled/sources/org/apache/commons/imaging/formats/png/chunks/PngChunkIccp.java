package org.apache.commons.imaging.formats.png.chunks;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.InflaterInputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
public class PngChunkIccp extends PngChunk {
    private static final Logger LOGGER = Logger.getLogger(PngChunkIccp.class.getName());
    private final byte[] compressedProfile;
    public final int compressionMethod;
    public final String profileName;
    private final byte[] uncompressedProfile;

    public PngChunkIccp(int i, int i2, int i3, byte[] bArr) {
        super(i, i2, i3, bArr);
        int findNull = BinaryFunctions.findNull(bArr);
        if (findNull < 0) {
            f$$ExternalSyntheticLambda0.m("PngChunkIccp: No Profile Name");
            throw null;
        }
        byte[] bArr2 = new byte[findNull];
        System.arraycopy(bArr, 0, bArr2, 0, findNull);
        String str = new String(bArr2, StandardCharsets.ISO_8859_1);
        this.profileName = str;
        byte b = bArr[findNull + 1];
        this.compressionMethod = b;
        int i4 = findNull + 2;
        int length = bArr.length - i4;
        byte[] bArr3 = new byte[length];
        this.compressedProfile = bArr3;
        System.arraycopy(bArr, i4, bArr3, 0, length);
        Logger logger = LOGGER;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            logger.finest("ProfileName: " + str);
            logger.finest("ProfileName.length(): " + str.length());
            logger.finest("CompressionMethod: " + ((int) b));
            logger.finest("CompressedProfileLength: " + length);
            logger.finest("bytes.length: " + bArr.length);
        }
        this.uncompressedProfile = BinaryFunctions.getStreamBytes(new InflaterInputStream(new ByteArrayInputStream(bArr3)));
        if (logger.isLoggable(level)) {
            logger.finest("UncompressedProfile: " + bArr.length);
        }
    }

    public byte[] getUncompressedProfile() {
        return (byte[]) this.uncompressedProfile.clone();
    }
}
