package org.bouncycastle.pqc.crypto.xmss;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes10.dex */
final class WOTSPlusPrivateKeyParameters {
    private final byte[][] privateKey;

    public WOTSPlusPrivateKeyParameters(WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("params == null");
            throw null;
        }
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("privateKey == null");
            throw null;
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            a$$ExternalSyntheticBUOutline0.m$2("privateKey byte array == null");
            throw null;
        }
        if (bArr.length != wOTSPlusParameters.getLen()) {
            a$$ExternalSyntheticBUOutline0.m$3("wrong privateKey format");
            throw null;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getTreeDigestSize()) {
                a$$ExternalSyntheticBUOutline0.m$3("wrong privateKey format");
                throw null;
            }
        }
        this.privateKey = XMSSUtil.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return XMSSUtil.cloneArray(this.privateKey);
    }
}
