package p000createpolar;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageWindowManagerOmegaPhoenix2394 {
    public static final byte PolarVoyageZipVortexCelestial6185 = Byte.parseByte("01110000", 2);
    public static final byte PolarVoyageMotionLayoutTransitionHeroVision4068 = Byte.parseByte("00001111", 2);

    public static String PolarVoyageZipVortexCelestial6185() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b = array[0];
        array[16] = b;
        array[0] = (byte) ((b & PolarVoyageMotionLayoutTransitionHeroVision4068) | PolarVoyageZipVortexCelestial6185);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
