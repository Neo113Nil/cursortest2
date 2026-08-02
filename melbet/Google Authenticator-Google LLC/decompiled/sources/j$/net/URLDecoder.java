package j$.net;

import j$.util.Objects;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public class URLDecoder {
    static {
        BitSet bitSet = a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        if (r4 >= r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:
    
        if (r6 == '%') goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c2, code lost:
    
        throw new java.lang.IllegalArgumentException("URLDecoder: Incomplete trailing escape (%) pattern");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c3, code lost:
    
        r1.append(new java.lang.String(r3, 0, r5, r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str, Charset charset) {
        Objects.a(charset, "Charset");
        int length = str.length();
        StringBuilder sb = new StringBuilder(length > 500 ? length / 2 : length);
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        loop0: while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                if (bArr == null) {
                    try {
                        bArr = new byte[(length - i) / 3];
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - " + e.getMessage());
                    }
                }
                int i2 = 0;
                while (true) {
                    int i3 = i + 2;
                    if (i3 >= length || charAt != '%') {
                        break;
                    }
                    int i4 = i + 1;
                    if (!b(str.charAt(i4)) || !b(str.charAt(i3))) {
                        break loop0;
                    }
                    int i5 = i + 3;
                    int parseInt = Integer.parseInt(str.subSequence(i4, i5).toString(), 16);
                    if (parseInt < 0) {
                        throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - negative value : " + str.substring(i, i5));
                    }
                    int i6 = i2 + 1;
                    bArr[i2] = (byte) parseInt;
                    if (i5 < length) {
                        charAt = str.charAt(i5);
                    }
                    i2 = i6;
                    i = i5;
                }
                throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern : " + str.substring(i, i + 3));
            }
            if (charAt != '+') {
                sb.append(charAt);
                i++;
            } else {
                sb.append(' ');
                i++;
            }
            z = true;
        }
        return z ? sb.toString() : str;
    }

    public static boolean b(char c) {
        if ('0' <= c && c <= '9') {
            return true;
        }
        if ('a' > c || c > 'f') {
            return 'A' <= c && c <= 'F';
        }
        return true;
    }

    public static String decode(String str, String str2) {
        if (str2.isEmpty()) {
            throw new UnsupportedEncodingException("URLDecoder: empty string enc parameter");
        }
        try {
            return a(str, Charset.forName(str2));
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str2);
        }
    }
}
