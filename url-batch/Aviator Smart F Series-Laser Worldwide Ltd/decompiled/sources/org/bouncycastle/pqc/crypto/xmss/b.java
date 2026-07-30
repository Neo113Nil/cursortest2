package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class b implements u {
    private static final Map<String, b> oidLookupTable;
    private final int oid;
    private final String stringRepresentation;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 10), new b(1, "XMSS_SHA2_10_256"));
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 16), new b(2, "XMSS_SHA2_16_256"));
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 20), new b(3, "XMSS_SHA2_20_256"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 10), new b(4, "XMSS_SHA2_10_512"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 16), new b(5, "XMSS_SHA2_16_512"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 20), new b(6, "XMSS_SHA2_20_512"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 10), new b(7, "XMSS_SHAKE_10_256"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 16), new b(8, "XMSS_SHAKE_16_256"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 20), new b(9, "XMSS_SHAKE_20_256"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 10), new b(10, "XMSS_SHAKE_10_512"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 16), new b(11, "XMSS_SHAKE_16_512"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 20), new b(12, "XMSS_SHAKE_20_512"));
        oidLookupTable = Collections.unmodifiableMap(hashMap);
    }

    private b(int i8, String str) {
        this.oid = i8;
        this.stringRepresentation = str;
    }

    private static String createKey(String str, int i8, int i9, int i10, int i11) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i8 + "-" + i9 + "-" + i10 + "-" + i11;
    }

    public static b lookup(String str, int i8, int i9, int i10, int i11) {
        if (str != null) {
            return oidLookupTable.get(createKey(str, i8, i9, i10, i11));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.u
    public int getOid() {
        return this.oid;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.u
    public String toString() {
        return this.stringRepresentation;
    }
}
