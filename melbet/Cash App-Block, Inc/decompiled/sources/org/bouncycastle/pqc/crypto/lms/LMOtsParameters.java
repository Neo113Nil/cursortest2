package org.bouncycastle.pqc.crypto.lms;

import com.plaid.internal.EnumC0170g;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* loaded from: classes10.dex */
public class LMOtsParameters {
    public static final int reserved = 0;
    public static final LMOtsParameters sha256_n24_w1;
    public static final LMOtsParameters sha256_n24_w2;
    public static final LMOtsParameters sha256_n24_w4;
    public static final LMOtsParameters sha256_n24_w8;
    public static final LMOtsParameters sha256_n32_w1;
    public static final LMOtsParameters sha256_n32_w2;
    public static final LMOtsParameters sha256_n32_w4;
    public static final LMOtsParameters sha256_n32_w8;
    public static final LMOtsParameters shake256_n24_w1;
    public static final LMOtsParameters shake256_n24_w2;
    public static final LMOtsParameters shake256_n24_w4;
    public static final LMOtsParameters shake256_n24_w8;
    public static final LMOtsParameters shake256_n32_w1;
    public static final LMOtsParameters shake256_n32_w2;
    public static final LMOtsParameters shake256_n32_w4;
    public static final LMOtsParameters shake256_n32_w8;
    private static final Map<Object, LMOtsParameters> suppliers;
    private final ASN1ObjectIdentifier digestOID;
    private final int ls;
    private final int n;
    private final int p;
    private final int sigLen;

    /* renamed from: type, reason: collision with root package name */
    private final int f1614type;
    private final int w;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        sha256_n32_w1 = new LMOtsParameters(1, 32, 1, EnumC0170g.SDK_ASSET_HEADER_SHIELD_VALUE, 7, 8516, aSN1ObjectIdentifier);
        sha256_n32_w2 = new LMOtsParameters(2, 32, 2, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 6, 4292, aSN1ObjectIdentifier);
        sha256_n32_w4 = new LMOtsParameters(3, 32, 4, 67, 4, 2180, aSN1ObjectIdentifier);
        sha256_n32_w8 = new LMOtsParameters(4, 32, 8, 34, 0, 1124, aSN1ObjectIdentifier);
        sha256_n24_w1 = new LMOtsParameters(5, 24, 1, 200, 8, 5436, aSN1ObjectIdentifier);
        sha256_n24_w2 = new LMOtsParameters(6, 24, 2, 101, 6, 2940, aSN1ObjectIdentifier);
        sha256_n24_w4 = new LMOtsParameters(7, 24, 4, 51, 4, 1500, aSN1ObjectIdentifier);
        sha256_n24_w8 = new LMOtsParameters(8, 24, 8, 26, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1, aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_shake256_len;
        shake256_n32_w1 = new LMOtsParameters(9, 32, 1, EnumC0170g.SDK_ASSET_HEADER_SHIELD_VALUE, 7, 8516, aSN1ObjectIdentifier2);
        shake256_n32_w2 = new LMOtsParameters(10, 32, 2, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 6, 4292, aSN1ObjectIdentifier2);
        shake256_n32_w4 = new LMOtsParameters(11, 32, 4, 67, 4, 2180, aSN1ObjectIdentifier2);
        shake256_n32_w8 = new LMOtsParameters(12, 32, 8, 34, 0, 1124, aSN1ObjectIdentifier2);
        shake256_n24_w1 = new LMOtsParameters(13, 24, 1, 200, 8, 5436, aSN1ObjectIdentifier2);
        shake256_n24_w2 = new LMOtsParameters(14, 24, 2, 101, 6, 2940, aSN1ObjectIdentifier2);
        shake256_n24_w4 = new LMOtsParameters(15, 24, 4, 51, 4, 1500, aSN1ObjectIdentifier2);
        shake256_n24_w8 = new LMOtsParameters(16, 24, 8, 26, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1, aSN1ObjectIdentifier2);
        suppliers = new HashMap<Object, LMOtsParameters>() { // from class: org.bouncycastle.pqc.crypto.lms.LMOtsParameters.1
            {
                LMOtsParameters lMOtsParameters = LMOtsParameters.sha256_n32_w1;
                put(Integer.valueOf(lMOtsParameters.f1614type), lMOtsParameters);
                LMOtsParameters lMOtsParameters2 = LMOtsParameters.sha256_n32_w2;
                put(Integer.valueOf(lMOtsParameters2.f1614type), lMOtsParameters2);
                LMOtsParameters lMOtsParameters3 = LMOtsParameters.sha256_n32_w4;
                put(Integer.valueOf(lMOtsParameters3.f1614type), lMOtsParameters3);
                LMOtsParameters lMOtsParameters4 = LMOtsParameters.sha256_n32_w8;
                put(Integer.valueOf(lMOtsParameters4.f1614type), lMOtsParameters4);
                LMOtsParameters lMOtsParameters5 = LMOtsParameters.sha256_n24_w1;
                put(Integer.valueOf(lMOtsParameters5.f1614type), lMOtsParameters5);
                LMOtsParameters lMOtsParameters6 = LMOtsParameters.sha256_n24_w2;
                put(Integer.valueOf(lMOtsParameters6.f1614type), lMOtsParameters6);
                LMOtsParameters lMOtsParameters7 = LMOtsParameters.sha256_n24_w4;
                put(Integer.valueOf(lMOtsParameters7.f1614type), lMOtsParameters7);
                LMOtsParameters lMOtsParameters8 = LMOtsParameters.sha256_n24_w8;
                put(Integer.valueOf(lMOtsParameters8.f1614type), lMOtsParameters8);
                LMOtsParameters lMOtsParameters9 = LMOtsParameters.shake256_n32_w1;
                put(Integer.valueOf(lMOtsParameters9.f1614type), lMOtsParameters9);
                LMOtsParameters lMOtsParameters10 = LMOtsParameters.shake256_n32_w2;
                put(Integer.valueOf(lMOtsParameters10.f1614type), lMOtsParameters10);
                LMOtsParameters lMOtsParameters11 = LMOtsParameters.shake256_n32_w4;
                put(Integer.valueOf(lMOtsParameters11.f1614type), lMOtsParameters11);
                LMOtsParameters lMOtsParameters12 = LMOtsParameters.shake256_n32_w8;
                put(Integer.valueOf(lMOtsParameters12.f1614type), lMOtsParameters12);
                LMOtsParameters lMOtsParameters13 = LMOtsParameters.shake256_n24_w1;
                put(Integer.valueOf(lMOtsParameters13.f1614type), lMOtsParameters13);
                LMOtsParameters lMOtsParameters14 = LMOtsParameters.shake256_n24_w2;
                put(Integer.valueOf(lMOtsParameters14.f1614type), lMOtsParameters14);
                LMOtsParameters lMOtsParameters15 = LMOtsParameters.shake256_n24_w4;
                put(Integer.valueOf(lMOtsParameters15.f1614type), lMOtsParameters15);
                LMOtsParameters lMOtsParameters16 = LMOtsParameters.shake256_n24_w8;
                put(Integer.valueOf(lMOtsParameters16.f1614type), lMOtsParameters16);
            }
        };
    }

    public LMOtsParameters(int i, int i2, int i3, int i4, int i5, int i6, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f1614type = i;
        this.n = i2;
        this.w = i3;
        this.p = i4;
        this.ls = i5;
        this.sigLen = i6;
        this.digestOID = aSN1ObjectIdentifier;
    }

    public static LMOtsParameters getParametersForType(int i) {
        return suppliers.get(Integer.valueOf(i));
    }

    public ASN1ObjectIdentifier getDigestOID() {
        return this.digestOID;
    }

    public int getLs() {
        return this.ls;
    }

    public int getN() {
        return this.n;
    }

    public int getP() {
        return this.p;
    }

    public int getSigLen() {
        return this.sigLen;
    }

    public int getType() {
        return this.f1614type;
    }

    public int getW() {
        return this.w;
    }
}
