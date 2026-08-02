package org.bouncycastle.pqc.crypto.xmss;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes10.dex */
final class WOTSPlusSignature {
    private byte[][] signature;

    public WOTSPlusSignature(WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("params == null");
            throw null;
        }
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("signature == null");
            throw null;
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            a$$ExternalSyntheticBUOutline0.m$2("signature byte array == null");
            throw null;
        }
        if (bArr.length != wOTSPlusParameters.getLen()) {
            a$$ExternalSyntheticBUOutline0.m$3("wrong signature size");
            throw null;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getTreeDigestSize()) {
                a$$ExternalSyntheticBUOutline0.m$3("wrong signature format");
                throw null;
            }
        }
        this.signature = XMSSUtil.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return XMSSUtil.cloneArray(this.signature);
    }
}
