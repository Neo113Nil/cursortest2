package okhttp3.internal.idn;

import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class Punycode {
    public static final ByteString PREFIX;

    static {
        ByteString.Companion companion = ByteString.Companion;
        PREFIX = ByteString.Companion.encodeUtf8("xn--");
    }

    public static int adapt(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int getPunycodeDigit(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        Path$$ExternalSyntheticBUOutline0.m$1(i, "unexpected digit: ");
        return 0;
    }
}
