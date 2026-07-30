package org.bouncycastle.pqc.crypto.lms;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class LMSigParameters {
    public static final LMSigParameters lms_sha256_n32_h10;
    public static final LMSigParameters lms_sha256_n32_h15;
    public static final LMSigParameters lms_sha256_n32_h20;
    public static final LMSigParameters lms_sha256_n32_h25;
    public static final LMSigParameters lms_sha256_n32_h5;
    private static Map<Object, LMSigParameters> paramBuilders;
    private final org.bouncycastle.asn1.o digestOid;

    /* renamed from: h, reason: collision with root package name */
    private final int f17197h;

    /* renamed from: m, reason: collision with root package name */
    private final int f17198m;
    private final int type;

    static {
        org.bouncycastle.asn1.o oVar = org.bouncycastle.asn1.nist.b.id_sha256;
        lms_sha256_n32_h5 = new LMSigParameters(5, 32, 5, oVar);
        lms_sha256_n32_h10 = new LMSigParameters(6, 32, 10, oVar);
        lms_sha256_n32_h15 = new LMSigParameters(7, 32, 15, oVar);
        lms_sha256_n32_h20 = new LMSigParameters(8, 32, 20, oVar);
        lms_sha256_n32_h25 = new LMSigParameters(9, 32, 25, oVar);
        paramBuilders = new HashMap<Object, LMSigParameters>() { // from class: org.bouncycastle.pqc.crypto.lms.LMSigParameters.1
            {
                LMSigParameters lMSigParameters = LMSigParameters.lms_sha256_n32_h5;
                put(Integer.valueOf(lMSigParameters.type), lMSigParameters);
                LMSigParameters lMSigParameters2 = LMSigParameters.lms_sha256_n32_h10;
                put(Integer.valueOf(lMSigParameters2.type), lMSigParameters2);
                LMSigParameters lMSigParameters3 = LMSigParameters.lms_sha256_n32_h15;
                put(Integer.valueOf(lMSigParameters3.type), lMSigParameters3);
                LMSigParameters lMSigParameters4 = LMSigParameters.lms_sha256_n32_h20;
                put(Integer.valueOf(lMSigParameters4.type), lMSigParameters4);
                LMSigParameters lMSigParameters5 = LMSigParameters.lms_sha256_n32_h25;
                put(Integer.valueOf(lMSigParameters5.type), lMSigParameters5);
            }
        };
    }

    protected LMSigParameters(int i8, int i9, int i10, org.bouncycastle.asn1.o oVar) {
        this.type = i8;
        this.f17198m = i9;
        this.f17197h = i10;
        this.digestOid = oVar;
    }

    static LMSigParameters getParametersForType(int i8) {
        return paramBuilders.get(Integer.valueOf(i8));
    }

    public org.bouncycastle.asn1.o getDigestOID() {
        return this.digestOid;
    }

    public int getH() {
        return this.f17197h;
    }

    public int getM() {
        return this.f17198m;
    }

    public int getType() {
        return this.type;
    }
}
