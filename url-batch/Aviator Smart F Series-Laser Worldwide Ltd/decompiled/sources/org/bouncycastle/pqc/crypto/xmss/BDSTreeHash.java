package org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;
import java.util.Stack;
import org.bouncycastle.pqc.crypto.xmss.d;
import org.bouncycastle.pqc.crypto.xmss.f;
import org.bouncycastle.pqc.crypto.xmss.g;

/* loaded from: classes5.dex */
class BDSTreeHash implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    private int height;
    private final int initialHeight;
    private int nextIndex;
    private XMSSNode tailNode;
    private boolean initialized = false;
    private boolean finished = false;

    BDSTreeHash(int i8) {
        this.initialHeight = i8;
    }

    int getHeight() {
        if (!this.initialized || this.finished) {
            return Integer.MAX_VALUE;
        }
        return this.height;
    }

    int getIndexLeaf() {
        return this.nextIndex;
    }

    public XMSSNode getTailNode() {
        return this.tailNode;
    }

    void initialize(int i8) {
        this.tailNode = null;
        this.height = this.initialHeight;
        this.nextIndex = i8;
        this.initialized = true;
        this.finished = false;
    }

    boolean isFinished() {
        return this.finished;
    }

    boolean isInitialized() {
        return this.initialized;
    }

    void setNode(XMSSNode xMSSNode) {
        this.tailNode = xMSSNode;
        int height = xMSSNode.getHeight();
        this.height = height;
        if (height == this.initialHeight) {
            this.finished = true;
        }
    }

    void update(Stack<XMSSNode> stack, h hVar, byte[] bArr, byte[] bArr2, g gVar) {
        if (gVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.finished || !this.initialized) {
            throw new IllegalStateException("finished or not initialized");
        }
        g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).withOTSAddress(this.nextIndex).withChainAddress(gVar.getChainAddress()).withHashAddress(gVar.getHashAddress()).withKeyAndMask(gVar.getKeyAndMask())).build();
        f fVar = (f) ((f.b) ((f.b) new f.b().withLayerAddress(gVar2.getLayerAddress())).withTreeAddress(gVar2.getTreeAddress())).withLTreeAddress(this.nextIndex).build();
        d dVar = (d) ((d.b) ((d.b) new d.b().withLayerAddress(gVar2.getLayerAddress())).withTreeAddress(gVar2.getTreeAddress())).withTreeIndex(this.nextIndex).build();
        hVar.importKeys(hVar.getWOTSPlusSecretKey(bArr2, gVar2), bArr);
        XMSSNode lTree = t.lTree(hVar, hVar.getPublicKey(gVar2), fVar);
        while (!stack.isEmpty() && stack.peek().getHeight() == lTree.getHeight() && stack.peek().getHeight() != this.initialHeight) {
            d dVar2 = (d) ((d.b) ((d.b) ((d.b) new d.b().withLayerAddress(dVar.getLayerAddress())).withTreeAddress(dVar.getTreeAddress())).withTreeHeight(dVar.getTreeHeight()).withTreeIndex((dVar.getTreeIndex() - 1) / 2).withKeyAndMask(dVar.getKeyAndMask())).build();
            XMSSNode randomizeHash = t.randomizeHash(hVar, stack.pop(), lTree, dVar2);
            XMSSNode xMSSNode = new XMSSNode(randomizeHash.getHeight() + 1, randomizeHash.getValue());
            dVar = (d) ((d.b) ((d.b) ((d.b) new d.b().withLayerAddress(dVar2.getLayerAddress())).withTreeAddress(dVar2.getTreeAddress())).withTreeHeight(dVar2.getTreeHeight() + 1).withTreeIndex(dVar2.getTreeIndex()).withKeyAndMask(dVar2.getKeyAndMask())).build();
            lTree = xMSSNode;
        }
        XMSSNode xMSSNode2 = this.tailNode;
        if (xMSSNode2 == null) {
            this.tailNode = lTree;
        } else if (xMSSNode2.getHeight() == lTree.getHeight()) {
            d dVar3 = (d) ((d.b) ((d.b) ((d.b) new d.b().withLayerAddress(dVar.getLayerAddress())).withTreeAddress(dVar.getTreeAddress())).withTreeHeight(dVar.getTreeHeight()).withTreeIndex((dVar.getTreeIndex() - 1) / 2).withKeyAndMask(dVar.getKeyAndMask())).build();
            lTree = new XMSSNode(this.tailNode.getHeight() + 1, t.randomizeHash(hVar, this.tailNode, lTree, dVar3).getValue());
            this.tailNode = lTree;
        } else {
            stack.push(lTree);
        }
        if (this.tailNode.getHeight() == this.initialHeight) {
            this.finished = true;
        } else {
            this.height = lTree.getHeight();
            this.nextIndex++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BDSTreeHash clone() {
        BDSTreeHash bDSTreeHash = new BDSTreeHash(this.initialHeight);
        bDSTreeHash.tailNode = this.tailNode;
        bDSTreeHash.height = this.height;
        bDSTreeHash.nextIndex = this.nextIndex;
        bDSTreeHash.initialized = this.initialized;
        bDSTreeHash.finished = this.finished;
        return bDSTreeHash;
    }
}
