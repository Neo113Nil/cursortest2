package org.bouncycastle.pqc.crypto.lms;

import com.realsil.sdk.dfu.DfuException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class LMOtsParameters {
    public static final int reserved = 0;
    public static final LMOtsParameters sha256_n32_w1;
    public static final LMOtsParameters sha256_n32_w2;
    public static final LMOtsParameters sha256_n32_w4;
    public static final LMOtsParameters sha256_n32_w8;
    private static final Map<Object, LMOtsParameters> suppliers;
    private final org.bouncycastle.asn1.o digestOID;
    private final int ls;

    /* renamed from: n, reason: collision with root package name */
    private final int f17194n;

    /* renamed from: p, reason: collision with root package name */
    private final int f17195p;
    private final int sigLen;
    private final int type;

    /* renamed from: w, reason: collision with root package name */
    private final int f17196w;

    static {
        org.bouncycastle.asn1.o oVar = org.bouncycastle.asn1.nist.b.id_sha256;
        sha256_n32_w1 = new LMOtsParameters(1, 32, 1, DfuException.ERROR_CANNOT_FIND_DEVICE, 7, 8516, oVar);
        sha256_n32_w2 = new LMOtsParameters(2, 32, 2, 133, 6, 4292, oVar);
        sha256_n32_w4 = new LMOtsParameters(3, 32, 4, 67, 4, 2180, oVar);
        sha256_n32_w8 = new LMOtsParameters(4, 32, 8, 34, 0, 1124, oVar);
        suppliers = new HashMap<Object, LMOtsParameters>() { // from class: org.bouncycastle.pqc.crypto.lms.LMOtsParameters.1
            {
                LMOtsParameters lMOtsParameters = LMOtsParameters.sha256_n32_w1;
                put(Integer.valueOf(lMOtsParameters.type), lMOtsParameters);
                LMOtsParameters lMOtsParameters2 = LMOtsParameters.sha256_n32_w2;
                put(Integer.valueOf(lMOtsParameters2.type), lMOtsParameters2);
                LMOtsParameters lMOtsParameters3 = LMOtsParameters.sha256_n32_w4;
                put(Integer.valueOf(lMOtsParameters3.type), lMOtsParameters3);
                LMOtsParameters lMOtsParameters4 = LMOtsParameters.sha256_n32_w8;
                put(Integer.valueOf(lMOtsParameters4.type), lMOtsParameters4);
            }
        };
    }

    protected LMOtsParameters(int i8, int i9, int i10, int i11, int i12, int i13, org.bouncycastle.asn1.o oVar) {
        this.type = i8;
        this.f17194n = i9;
        this.f17196w = i10;
        this.f17195p = i11;
        this.ls = i12;
        this.sigLen = i13;
        this.digestOID = oVar;
    }

    public static LMOtsParameters getParametersForType(int i8) {
        return suppliers.get(Integer.valueOf(i8));
    }

    public org.bouncycastle.asn1.o getDigestOID() {
        return this.digestOID;
    }

    public int getLs() {
        return this.ls;
    }

    public int getN() {
        return this.f17194n;
    }

    public int getP() {
        return this.f17195p;
    }

    public int getSigLen() {
        return this.sigLen;
    }

    public int getType() {
        return this.type;
    }

    public int getW() {
        return this.f17196w;
    }
}
