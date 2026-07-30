package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class a implements u {
    private static final Map<String, a> oidLookupTable;
    private final int oid;
    private final String stringRepresentation;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 20, 2), new a(1, "XMSSMT_SHA2_20/2_256"));
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 20, 4), new a(2, "XMSSMT_SHA2_20/4_256"));
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 40, 2), new a(3, "XMSSMT_SHA2_40/2_256"));
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 40, 2), new a(4, "XMSSMT_SHA2_40/4_256"));
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 40, 4), new a(5, "XMSSMT_SHA2_40/8_256"));
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 60, 8), new a(6, "XMSSMT_SHA2_60/3_256"));
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 60, 6), new a(7, "XMSSMT_SHA2_60/6_256"));
        hashMap.put(createKey(o.SHA_256, 32, 16, 67, 60, 12), new a(8, "XMSSMT_SHA2_60/12_256"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 20, 2), new a(9, "XMSSMT_SHA2_20/2_512"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 20, 4), new a(10, "XMSSMT_SHA2_20/4_512"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 40, 2), new a(11, "XMSSMT_SHA2_40/2_512"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 40, 4), new a(12, "XMSSMT_SHA2_40/4_512"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 40, 8), new a(13, "XMSSMT_SHA2_40/8_512"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 60, 3), new a(14, "XMSSMT_SHA2_60/3_512"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 60, 6), new a(15, "XMSSMT_SHA2_60/6_512"));
        hashMap.put(createKey(o.SHA_512, 64, 16, 131, 60, 12), new a(16, "XMSSMT_SHA2_60/12_512"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 20, 2), new a(17, "XMSSMT_SHAKE_20/2_256"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 20, 4), new a(18, "XMSSMT_SHAKE_20/4_256"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 40, 2), new a(19, "XMSSMT_SHAKE_40/2_256"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 40, 4), new a(20, "XMSSMT_SHAKE_40/4_256"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 40, 8), new a(21, "XMSSMT_SHAKE_40/8_256"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 60, 3), new a(22, "XMSSMT_SHAKE_60/3_256"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 60, 6), new a(23, "XMSSMT_SHAKE_60/6_256"));
        hashMap.put(createKey(o.SHAKE128, 32, 16, 67, 60, 12), new a(24, "XMSSMT_SHAKE_60/12_256"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 20, 2), new a(25, "XMSSMT_SHAKE_20/2_512"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 20, 4), new a(26, "XMSSMT_SHAKE_20/4_512"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 40, 2), new a(27, "XMSSMT_SHAKE_40/2_512"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 40, 4), new a(28, "XMSSMT_SHAKE_40/4_512"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 40, 8), new a(29, "XMSSMT_SHAKE_40/8_512"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 60, 3), new a(30, "XMSSMT_SHAKE_60/3_512"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 60, 6), new a(31, "XMSSMT_SHAKE_60/6_512"));
        hashMap.put(createKey(o.SHAKE256, 64, 16, 131, 60, 12), new a(32, "XMSSMT_SHAKE_60/12_512"));
        oidLookupTable = Collections.unmodifiableMap(hashMap);
    }

    private a(int i8, String str) {
        this.oid = i8;
        this.stringRepresentation = str;
    }

    private static String createKey(String str, int i8, int i9, int i10, int i11, int i12) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i8 + "-" + i9 + "-" + i10 + "-" + i11 + "-" + i12;
    }

    public static a lookup(String str, int i8, int i9, int i10, int i11, int i12) {
        if (str != null) {
            return oidLookupTable.get(createKey(str, i8, i9, i10, i11, i12));
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
