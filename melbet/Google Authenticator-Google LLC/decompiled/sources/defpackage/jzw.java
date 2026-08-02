package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jzw {
    public static final /* synthetic */ int d = 0;
    private static final BitSet e;
    public final String a;
    public final byte[] b;
    public final Object c;
    private final String f;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        e = bitSet;
    }

    public jzw(String str, boolean z, Object obj) {
        str.getClass();
        this.f = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        hoq.y(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            kaa.a.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            if (z && charAt == ':') {
                if (i == 0) {
                    i = 0;
                    i++;
                } else {
                    charAt = ':';
                }
            }
            if (!e.get(charAt)) {
                throw new IllegalArgumentException(hoq.w("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
            i++;
        }
        this.a = lowerCase;
        this.b = lowerCase.getBytes(StandardCharsets.US_ASCII);
        this.c = obj;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((jzw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Key{name='" + this.a + "'}";
    }
}
