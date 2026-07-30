package org.bouncycastle.pqc.crypto.xmss;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.g;

/* loaded from: classes5.dex */
final class h {
    private final e khf;
    private final j params;
    private byte[] publicSeed;
    private byte[] secretKeySeed;

    h(j jVar) {
        if (jVar == null) {
            throw new NullPointerException("params == null");
        }
        this.params = jVar;
        int treeDigestSize = jVar.getTreeDigestSize();
        this.khf = new e(jVar.getTreeDigest(), treeDigestSize);
        this.secretKeySeed = new byte[treeDigestSize];
        this.publicSeed = new byte[treeDigestSize];
    }

    private byte[] chain(byte[] bArr, int i8, int i9, g gVar) {
        int treeDigestSize = this.params.getTreeDigestSize();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        }
        if (bArr.length != treeDigestSize) {
            throw new IllegalArgumentException("startHash needs to be " + treeDigestSize + "bytes");
        }
        if (gVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (gVar.toByteArray() == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        int i10 = i8 + i9;
        if (i10 > this.params.getWinternitzParameter() - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i9 == 0) {
            return bArr;
        }
        byte[] chain = chain(bArr, i8, i9 - 1, gVar);
        g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).withOTSAddress(gVar.getOTSAddress()).withChainAddress(gVar.getChainAddress()).withHashAddress(i10 - 1).withKeyAndMask(0)).build();
        byte[] PRF = this.khf.PRF(this.publicSeed, gVar2.toByteArray());
        byte[] PRF2 = this.khf.PRF(this.publicSeed, ((g) ((g.b) ((g.b) ((g.b) new g.b().withLayerAddress(gVar2.getLayerAddress())).withTreeAddress(gVar2.getTreeAddress())).withOTSAddress(gVar2.getOTSAddress()).withChainAddress(gVar2.getChainAddress()).withHashAddress(gVar2.getHashAddress()).withKeyAndMask(1)).build()).toByteArray());
        byte[] bArr2 = new byte[treeDigestSize];
        for (int i11 = 0; i11 < treeDigestSize; i11++) {
            bArr2[i11] = (byte) (chain[i11] ^ PRF2[i11]);
        }
        return this.khf.F(PRF, bArr2);
    }

    private List<Integer> convertToBaseW(byte[] bArr, int i8, int i9) {
        if (bArr == null) {
            throw new NullPointerException("msg == null");
        }
        if (i8 != 4 && i8 != 16) {
            throw new IllegalArgumentException("w needs to be 4 or 16");
        }
        int log2 = z.log2(i8);
        if (i9 > (bArr.length * 8) / log2) {
            throw new IllegalArgumentException("outLength too big");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 : bArr) {
            for (int i11 = 8 - log2; i11 >= 0; i11 -= log2) {
                arrayList.add(Integer.valueOf((i10 >> i11) & (i8 - 1)));
                if (arrayList.size() == i9) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    private byte[] expandSecretKeySeed(int i8) {
        if (i8 < 0 || i8 >= this.params.getLen()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.khf.PRF(this.secretKeySeed, z.toBytesBigEndian(i8, 32));
    }

    protected e getKhf() {
        return this.khf;
    }

    protected j getParams() {
        return this.params;
    }

    protected k getPrivateKey() {
        int len = this.params.getLen();
        byte[][] bArr = new byte[len][];
        for (int i8 = 0; i8 < len; i8++) {
            bArr[i8] = expandSecretKeySeed(i8);
        }
        return new k(this.params, bArr);
    }

    l getPublicKey(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        byte[][] bArr = new byte[this.params.getLen()][];
        for (int i8 = 0; i8 < this.params.getLen(); i8++) {
            gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).withOTSAddress(gVar.getOTSAddress()).withChainAddress(i8).withHashAddress(gVar.getHashAddress()).withKeyAndMask(gVar.getKeyAndMask())).build();
            bArr[i8] = chain(expandSecretKeySeed(i8), 0, this.params.getWinternitzParameter() - 1, gVar);
        }
        return new l(this.params, bArr);
    }

    l getPublicKeyFromSignature(byte[] bArr, m mVar, g gVar) {
        if (bArr == null) {
            throw new NullPointerException("messageDigest == null");
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (mVar == null) {
            throw new NullPointerException("signature == null");
        }
        if (gVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        List<Integer> convertToBaseW = convertToBaseW(bArr, this.params.getWinternitzParameter(), this.params.getLen1());
        int i8 = 0;
        for (int i9 = 0; i9 < this.params.getLen1(); i9++) {
            i8 += (this.params.getWinternitzParameter() - 1) - convertToBaseW.get(i9).intValue();
        }
        convertToBaseW.addAll(convertToBaseW(z.toBytesBigEndian(i8 << (8 - ((this.params.getLen2() * z.log2(this.params.getWinternitzParameter())) % 8)), (int) Math.ceil((this.params.getLen2() * z.log2(this.params.getWinternitzParameter())) / 8.0d)), this.params.getWinternitzParameter(), this.params.getLen2()));
        byte[][] bArr2 = new byte[this.params.getLen()][];
        for (int i10 = 0; i10 < this.params.getLen(); i10++) {
            gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).withOTSAddress(gVar.getOTSAddress()).withChainAddress(i10).withHashAddress(gVar.getHashAddress()).withKeyAndMask(gVar.getKeyAndMask())).build();
            bArr2[i10] = chain(mVar.toByteArray()[i10], convertToBaseW.get(i10).intValue(), (this.params.getWinternitzParameter() - 1) - convertToBaseW.get(i10).intValue(), gVar);
        }
        return new l(this.params, bArr2);
    }

    protected byte[] getPublicSeed() {
        return org.bouncycastle.util.a.clone(this.publicSeed);
    }

    protected byte[] getSecretKeySeed() {
        return org.bouncycastle.util.a.clone(this.secretKeySeed);
    }

    protected byte[] getWOTSPlusSecretKey(byte[] bArr, g gVar) {
        return this.khf.PRF(bArr, ((g) ((g.b) ((g.b) new g.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).withOTSAddress(gVar.getOTSAddress()).build()).toByteArray());
    }

    void importKeys(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.secretKeySeed = bArr;
        this.publicSeed = bArr2;
    }

    m sign(byte[] bArr, g gVar) {
        if (bArr == null) {
            throw new NullPointerException("messageDigest == null");
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (gVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        List<Integer> convertToBaseW = convertToBaseW(bArr, this.params.getWinternitzParameter(), this.params.getLen1());
        int i8 = 0;
        for (int i9 = 0; i9 < this.params.getLen1(); i9++) {
            i8 += (this.params.getWinternitzParameter() - 1) - convertToBaseW.get(i9).intValue();
        }
        convertToBaseW.addAll(convertToBaseW(z.toBytesBigEndian(i8 << (8 - ((this.params.getLen2() * z.log2(this.params.getWinternitzParameter())) % 8)), (int) Math.ceil((this.params.getLen2() * z.log2(this.params.getWinternitzParameter())) / 8.0d)), this.params.getWinternitzParameter(), this.params.getLen2()));
        byte[][] bArr2 = new byte[this.params.getLen()][];
        for (int i10 = 0; i10 < this.params.getLen(); i10++) {
            gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).withOTSAddress(gVar.getOTSAddress()).withChainAddress(i10).withHashAddress(gVar.getHashAddress()).withKeyAndMask(gVar.getKeyAndMask())).build();
            bArr2[i10] = chain(expandSecretKeySeed(i10), 0, convertToBaseW.get(i10).intValue(), gVar);
        }
        return new m(this.params, bArr2);
    }
}
