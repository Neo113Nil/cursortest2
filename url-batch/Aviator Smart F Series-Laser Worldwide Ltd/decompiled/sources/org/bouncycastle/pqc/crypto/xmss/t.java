package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.d;
import org.bouncycastle.pqc.crypto.xmss.f;
import org.bouncycastle.pqc.crypto.xmss.n;

/* loaded from: classes5.dex */
class t {
    t() {
    }

    static XMSSNode lTree(h hVar, l lVar, f fVar) {
        double d8;
        if (lVar == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (fVar == null) {
            throw new NullPointerException("address == null");
        }
        int len = hVar.getParams().getLen();
        byte[][] byteArray = lVar.toByteArray();
        XMSSNode[] xMSSNodeArr = new XMSSNode[byteArray.length];
        for (int i8 = 0; i8 < byteArray.length; i8++) {
            xMSSNodeArr[i8] = new XMSSNode(0, byteArray[i8]);
        }
        n.a withKeyAndMask = ((f.b) ((f.b) new f.b().withLayerAddress(fVar.getLayerAddress())).withTreeAddress(fVar.getTreeAddress())).withLTreeAddress(fVar.getLTreeAddress()).withTreeHeight(0).withTreeIndex(fVar.getTreeIndex()).withKeyAndMask(fVar.getKeyAndMask());
        while (true) {
            f fVar2 = (f) ((f.b) withKeyAndMask).build();
            if (len <= 1) {
                return xMSSNodeArr[0];
            }
            int i9 = 0;
            while (true) {
                d8 = len / 2;
                if (i9 >= ((int) Math.floor(d8))) {
                    break;
                }
                fVar2 = (f) ((f.b) ((f.b) ((f.b) new f.b().withLayerAddress(fVar2.getLayerAddress())).withTreeAddress(fVar2.getTreeAddress())).withLTreeAddress(fVar2.getLTreeAddress()).withTreeHeight(fVar2.getTreeHeight()).withTreeIndex(i9).withKeyAndMask(fVar2.getKeyAndMask())).build();
                int i10 = i9 * 2;
                xMSSNodeArr[i9] = randomizeHash(hVar, xMSSNodeArr[i10], xMSSNodeArr[i10 + 1], fVar2);
                i9++;
            }
            if (len % 2 == 1) {
                xMSSNodeArr[(int) Math.floor(d8)] = xMSSNodeArr[len - 1];
            }
            len = (int) Math.ceil(len / 2.0d);
            withKeyAndMask = ((f.b) ((f.b) new f.b().withLayerAddress(fVar2.getLayerAddress())).withTreeAddress(fVar2.getTreeAddress())).withLTreeAddress(fVar2.getLTreeAddress()).withTreeHeight(fVar2.getTreeHeight() + 1).withTreeIndex(fVar2.getTreeIndex()).withKeyAndMask(fVar2.getKeyAndMask());
        }
    }

    static XMSSNode randomizeHash(h hVar, XMSSNode xMSSNode, XMSSNode xMSSNode2, n nVar) {
        if (xMSSNode == null) {
            throw new NullPointerException("left == null");
        }
        if (xMSSNode2 == null) {
            throw new NullPointerException("right == null");
        }
        if (xMSSNode.getHeight() != xMSSNode2.getHeight()) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        if (nVar == null) {
            throw new NullPointerException("address == null");
        }
        byte[] publicSeed = hVar.getPublicSeed();
        if (nVar instanceof f) {
            f fVar = (f) nVar;
            nVar = (f) ((f.b) ((f.b) ((f.b) new f.b().withLayerAddress(fVar.getLayerAddress())).withTreeAddress(fVar.getTreeAddress())).withLTreeAddress(fVar.getLTreeAddress()).withTreeHeight(fVar.getTreeHeight()).withTreeIndex(fVar.getTreeIndex()).withKeyAndMask(0)).build();
        } else if (nVar instanceof d) {
            d dVar = (d) nVar;
            nVar = (d) ((d.b) ((d.b) ((d.b) new d.b().withLayerAddress(dVar.getLayerAddress())).withTreeAddress(dVar.getTreeAddress())).withTreeHeight(dVar.getTreeHeight()).withTreeIndex(dVar.getTreeIndex()).withKeyAndMask(0)).build();
        }
        byte[] PRF = hVar.getKhf().PRF(publicSeed, nVar.toByteArray());
        if (nVar instanceof f) {
            f fVar2 = (f) nVar;
            nVar = (f) ((f.b) ((f.b) ((f.b) new f.b().withLayerAddress(fVar2.getLayerAddress())).withTreeAddress(fVar2.getTreeAddress())).withLTreeAddress(fVar2.getLTreeAddress()).withTreeHeight(fVar2.getTreeHeight()).withTreeIndex(fVar2.getTreeIndex()).withKeyAndMask(1)).build();
        } else if (nVar instanceof d) {
            d dVar2 = (d) nVar;
            nVar = (d) ((d.b) ((d.b) ((d.b) new d.b().withLayerAddress(dVar2.getLayerAddress())).withTreeAddress(dVar2.getTreeAddress())).withTreeHeight(dVar2.getTreeHeight()).withTreeIndex(dVar2.getTreeIndex()).withKeyAndMask(1)).build();
        }
        byte[] PRF2 = hVar.getKhf().PRF(publicSeed, nVar.toByteArray());
        if (nVar instanceof f) {
            f fVar3 = (f) nVar;
            nVar = (f) ((f.b) ((f.b) ((f.b) new f.b().withLayerAddress(fVar3.getLayerAddress())).withTreeAddress(fVar3.getTreeAddress())).withLTreeAddress(fVar3.getLTreeAddress()).withTreeHeight(fVar3.getTreeHeight()).withTreeIndex(fVar3.getTreeIndex()).withKeyAndMask(2)).build();
        } else if (nVar instanceof d) {
            d dVar3 = (d) nVar;
            nVar = (d) ((d.b) ((d.b) ((d.b) new d.b().withLayerAddress(dVar3.getLayerAddress())).withTreeAddress(dVar3.getTreeAddress())).withTreeHeight(dVar3.getTreeHeight()).withTreeIndex(dVar3.getTreeIndex()).withKeyAndMask(2)).build();
        }
        byte[] PRF3 = hVar.getKhf().PRF(publicSeed, nVar.toByteArray());
        int treeDigestSize = hVar.getParams().getTreeDigestSize();
        byte[] bArr = new byte[treeDigestSize * 2];
        for (int i8 = 0; i8 < treeDigestSize; i8++) {
            bArr[i8] = (byte) (xMSSNode.getValue()[i8] ^ PRF2[i8]);
        }
        for (int i9 = 0; i9 < treeDigestSize; i9++) {
            bArr[i9 + treeDigestSize] = (byte) (xMSSNode2.getValue()[i9] ^ PRF3[i9]);
        }
        return new XMSSNode(xMSSNode.getHeight(), hVar.getKhf().H(PRF, bArr));
    }
}
