package p000createpolar;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMLKitNovaXVortexCyber2858 extends PolarVoyageLayoutOmegaVortex4134 {
    public static final Pattern PolarVoyageKotlinBetaPulseBeta3653 = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder PolarVoyageZipVortexCelestial6185 = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder PolarVoyageMotionLayoutTransitionHeroVision4068 = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // p000createpolar.PolarVoyageLayoutOmegaVortex4134
    public final PolarVoyageAsyncCelestialNebulaSpeed1878 PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageContentObserverPhoenixEclipseThunder9626 polarVoyageContentObserverPhoenixEclipseThunder9626, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        CharsetDecoder charsetDecoder2 = this.PolarVoyageZipVortexCelestial6185;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new PolarVoyageAsyncCelestialNebulaSpeed1878(new PolarVoyageTextureViewOlympianDragon4919(null, null, bArr));
        }
        Matcher matcher = PolarVoyageKotlinBetaPulseBeta3653.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(group);
                PolarVoyageFlingGestureEclipsePrimeMax1376.getClass();
                if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("streamurl")) {
                    str3 = group2;
                } else if (PolarVoyageFlingGestureEclipsePrimeMax1376.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new PolarVoyageAsyncCelestialNebulaSpeed1878(new PolarVoyageTextureViewOlympianDragon4919(str2, str3, bArr));
    }
}
