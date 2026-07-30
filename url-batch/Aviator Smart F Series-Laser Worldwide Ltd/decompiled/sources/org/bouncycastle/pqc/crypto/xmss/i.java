package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
final class i implements u {
    private static final Map<String, i> oidLookupTable;
    private final int oid;
    private final String stringRepresentation;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(createKey(o.SHA_256, 32, 16, 67), new i(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131), new i(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67), new i(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131), new i(67108868, "WOTSP_SHAKE256_W16"));
        oidLookupTable = Collections.unmodifiableMap(hashMap);
    }

    private i(int i8, String str) {
        this.oid = i8;
        this.stringRepresentation = str;
    }

    private static String createKey(String str, int i8, int i9, int i10) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i8 + "-" + i9 + "-" + i10;
    }

    protected static i lookup(String str, int i8, int i9, int i10) {
        if (str != null) {
            return oidLookupTable.get(createKey(str, i8, i9, i10));
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
