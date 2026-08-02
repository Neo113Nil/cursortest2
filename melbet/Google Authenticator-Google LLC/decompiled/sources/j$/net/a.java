package j$.net;

import java.util.BitSet;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class a {
    public static final BitSet a = new BitSet(256);

    static {
        for (int i = 97; i <= 122; i++) {
            a.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            a.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            a.set(i3);
        }
        BitSet bitSet = a;
        bitSet.set(32);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        if (System.getSecurityManager() == null) {
            System.getProperty("file.encoding");
        }
    }
}
