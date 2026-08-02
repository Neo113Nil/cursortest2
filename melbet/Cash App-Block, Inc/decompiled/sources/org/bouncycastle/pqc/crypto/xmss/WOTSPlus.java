package org.bouncycastle.pqc.crypto.xmss;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
final class WOTSPlus {
    private final KeyedHashFunctions khf;
    private final WOTSPlusParameters params;
    private byte[] publicSeed;
    private byte[] secretKeySeed;

    public WOTSPlus(WOTSPlusParameters wOTSPlusParameters) {
        if (wOTSPlusParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("params == null");
            throw null;
        }
        this.params = wOTSPlusParameters;
        int treeDigestSize = wOTSPlusParameters.getTreeDigestSize();
        this.khf = new KeyedHashFunctions(wOTSPlusParameters.getTreeDigest(), treeDigestSize);
        this.secretKeySeed = new byte[treeDigestSize];
        this.publicSeed = new byte[treeDigestSize];
    }

    private byte[] chain(byte[] bArr, int i, int i2, OTSHashAddress oTSHashAddress) {
        int treeDigestSize = this.params.getTreeDigestSize();
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("startHash == null");
            return null;
        }
        if (bArr.length != treeDigestSize) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(treeDigestSize, "startHash needs to be ", "bytes"));
            return null;
        }
        if (oTSHashAddress == null) {
            a$$ExternalSyntheticBUOutline0.m$2("otsHashAddress == null");
            return null;
        }
        if (oTSHashAddress.toByteArray() == null) {
            a$$ExternalSyntheticBUOutline0.m$2("otsHashAddress byte array == null");
            return null;
        }
        int i3 = i + i2;
        if (i3 > this.params.getWinternitzParameter() - 1) {
            a$$ExternalSyntheticBUOutline0.m$3("max chain length must not be greater than w");
            return null;
        }
        if (i2 == 0) {
            return bArr;
        }
        byte[] chain = chain(bArr, i, i2 - 1, oTSHashAddress);
        OTSHashAddress oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(oTSHashAddress.getChainAddress()).withHashAddress(i3 - 1).withKeyAndMask(0).build();
        byte[] PRF = this.khf.PRF(this.publicSeed, oTSHashAddress2.toByteArray());
        byte[] PRF2 = this.khf.PRF(this.publicSeed, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withOTSAddress(oTSHashAddress2.getOTSAddress()).withChainAddress(oTSHashAddress2.getChainAddress()).withHashAddress(oTSHashAddress2.getHashAddress()).withKeyAndMask(1).build()).toByteArray());
        byte[] bArr2 = new byte[treeDigestSize];
        for (int i4 = 0; i4 < treeDigestSize; i4++) {
            bArr2[i4] = (byte) (chain[i4] ^ PRF2[i4]);
        }
        return this.khf.F(PRF, bArr2);
    }

    private List<Integer> convertToBaseW(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("msg == null");
            return null;
        }
        if (i != 4 && i != 16) {
            a$$ExternalSyntheticBUOutline0.m$3("w needs to be 4 or 16");
            return null;
        }
        int log2 = XMSSUtil.log2(i);
        if (i2 > (bArr.length * 8) / log2) {
            a$$ExternalSyntheticBUOutline0.m$3("outLength too big");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        loop0: for (int i3 : bArr) {
            for (int i4 = 8 - log2; i4 >= 0; i4 -= log2) {
                arrayList.add(Integer.valueOf((i3 >> i4) & (i - 1)));
                if (arrayList.size() == i2) {
                    break loop0;
                }
            }
        }
        return arrayList;
    }

    private byte[] expandSecretKeySeed(int i) {
        if (i >= 0 && i < this.params.getLen()) {
            return this.khf.PRF(this.secretKeySeed, XMSSUtil.toBytesBigEndian(i, 32));
        }
        a$$ExternalSyntheticBUOutline0.m$3("index out of bounds");
        return null;
    }

    public KeyedHashFunctions getKhf() {
        return this.khf;
    }

    public WOTSPlusParameters getParams() {
        return this.params;
    }

    public WOTSPlusPrivateKeyParameters getPrivateKey() {
        int len = this.params.getLen();
        byte[][] bArr = new byte[len][];
        for (int i = 0; i < len; i++) {
            bArr[i] = expandSecretKeySeed(i);
        }
        return new WOTSPlusPrivateKeyParameters(this.params, bArr);
    }

    public WOTSPlusPublicKeyParameters getPublicKey(OTSHashAddress oTSHashAddress) {
        if (oTSHashAddress == null) {
            a$$ExternalSyntheticBUOutline0.m$2("otsHashAddress == null");
            return null;
        }
        byte[][] bArr = new byte[this.params.getLen()][];
        for (int i = 0; i < this.params.getLen(); i++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr[i] = chain(expandSecretKeySeed(i), 0, this.params.getWinternitzParameter() - 1, oTSHashAddress);
        }
        return new WOTSPlusPublicKeyParameters(this.params, bArr);
    }

    public WOTSPlusPublicKeyParameters getPublicKeyFromSignature(byte[] bArr, WOTSPlusSignature wOTSPlusSignature, OTSHashAddress oTSHashAddress) {
        WOTSPlusParameters wOTSPlusParameters;
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("messageDigest == null");
            return null;
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("size of messageDigest needs to be equal to size of digest");
            return null;
        }
        if (wOTSPlusSignature == null) {
            a$$ExternalSyntheticBUOutline0.m$2("signature == null");
            return null;
        }
        if (oTSHashAddress == null) {
            a$$ExternalSyntheticBUOutline0.m$2("otsHashAddress == null");
            return null;
        }
        List<Integer> convertToBaseW = convertToBaseW(bArr, this.params.getWinternitzParameter(), this.params.getLen1());
        int i = 0;
        int i2 = 0;
        while (true) {
            int len1 = this.params.getLen1();
            wOTSPlusParameters = this.params;
            if (i >= len1) {
                break;
            }
            i2 += (wOTSPlusParameters.getWinternitzParameter() - 1) - convertToBaseW.get(i).intValue();
            i++;
        }
        convertToBaseW.addAll(convertToBaseW(XMSSUtil.toBytesBigEndian(i2 << (8 - ((XMSSUtil.log2(this.params.getWinternitzParameter()) * wOTSPlusParameters.getLen2()) % 8)), (int) Math.ceil((XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2()) / 8.0d)), this.params.getWinternitzParameter(), this.params.getLen2()));
        byte[][] bArr2 = new byte[this.params.getLen()][];
        for (int i3 = 0; i3 < this.params.getLen(); i3++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i3).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i3] = chain(wOTSPlusSignature.toByteArray()[i3], convertToBaseW.get(i3).intValue(), (this.params.getWinternitzParameter() - 1) - convertToBaseW.get(i3).intValue(), oTSHashAddress);
        }
        return new WOTSPlusPublicKeyParameters(this.params, bArr2);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.publicSeed);
    }

    public byte[] getSecretKeySeed() {
        return Arrays.clone(this.secretKeySeed);
    }

    public byte[] getWOTSPlusSecretKey(byte[] bArr, OTSHashAddress oTSHashAddress) {
        return this.khf.PRF(bArr, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).build()).toByteArray());
    }

    public void importKeys(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("secretKeySeed == null");
            return;
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("size of secretKeySeed needs to be equal to size of digest");
            return;
        }
        if (bArr2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("publicSeed == null");
        } else if (bArr2.length != this.params.getTreeDigestSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("size of publicSeed needs to be equal to size of digest");
        } else {
            this.secretKeySeed = bArr;
            this.publicSeed = bArr2;
        }
    }

    public WOTSPlusSignature sign(byte[] bArr, OTSHashAddress oTSHashAddress) {
        WOTSPlusParameters wOTSPlusParameters;
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("messageDigest == null");
            return null;
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("size of messageDigest needs to be equal to size of digest");
            return null;
        }
        if (oTSHashAddress == null) {
            a$$ExternalSyntheticBUOutline0.m$2("otsHashAddress == null");
            return null;
        }
        List<Integer> convertToBaseW = convertToBaseW(bArr, this.params.getWinternitzParameter(), this.params.getLen1());
        int i = 0;
        int i2 = 0;
        while (true) {
            int len1 = this.params.getLen1();
            wOTSPlusParameters = this.params;
            if (i >= len1) {
                break;
            }
            i2 += (wOTSPlusParameters.getWinternitzParameter() - 1) - convertToBaseW.get(i).intValue();
            i++;
        }
        convertToBaseW.addAll(convertToBaseW(XMSSUtil.toBytesBigEndian(i2 << (8 - ((XMSSUtil.log2(this.params.getWinternitzParameter()) * wOTSPlusParameters.getLen2()) % 8)), (int) Math.ceil((XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2()) / 8.0d)), this.params.getWinternitzParameter(), this.params.getLen2()));
        byte[][] bArr2 = new byte[this.params.getLen()][];
        for (int i3 = 0; i3 < this.params.getLen(); i3++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i3).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i3] = chain(expandSecretKeySeed(i3), 0, convertToBaseW.get(i3).intValue(), oTSHashAddress);
        }
        return new WOTSPlusSignature(this.params, bArr2);
    }
}
