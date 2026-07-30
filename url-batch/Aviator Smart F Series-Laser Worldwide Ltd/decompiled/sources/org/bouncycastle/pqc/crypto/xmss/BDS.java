package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.bouncycastle.pqc.crypto.xmss.d;
import org.bouncycastle.pqc.crypto.xmss.f;
import org.bouncycastle.pqc.crypto.xmss.g;

/* loaded from: classes5.dex */
public final class BDS implements Serializable {
    private static final long serialVersionUID = 1;
    private List<XMSSNode> authenticationPath;
    private int index;

    /* renamed from: k, reason: collision with root package name */
    private int f17209k;
    private Map<Integer, XMSSNode> keep;
    private transient int maxIndex;
    private Map<Integer, LinkedList<XMSSNode>> retain;
    private XMSSNode root;
    private Stack<XMSSNode> stack;
    private final List<BDSTreeHash> treeHashInstances;
    private final int treeHeight;
    private boolean used;
    private transient h wotsPlus;

    BDS(BDS bds) {
        this.wotsPlus = new h(bds.wotsPlus.getParams());
        this.treeHeight = bds.treeHeight;
        this.f17209k = bds.f17209k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer num : bds.retain.keySet()) {
            this.retain.put(num, (LinkedList) bds.retain.get(num).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.stack = stack;
        stack.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        Iterator<BDSTreeHash> it = bds.treeHashInstances.iterator();
        while (it.hasNext()) {
            this.treeHashInstances.add(it.next().clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.maxIndex = bds.maxIndex;
        this.used = bds.used;
    }

    private BDSTreeHash getBDSTreeHashInstanceForUpdate() {
        BDSTreeHash bDSTreeHash = null;
        for (BDSTreeHash bDSTreeHash2 : this.treeHashInstances) {
            if (!bDSTreeHash2.isFinished() && bDSTreeHash2.isInitialized() && (bDSTreeHash == null || bDSTreeHash2.getHeight() < bDSTreeHash.getHeight() || (bDSTreeHash2.getHeight() == bDSTreeHash.getHeight() && bDSTreeHash2.getIndexLeaf() < bDSTreeHash.getIndexLeaf()))) {
                bDSTreeHash = bDSTreeHash2;
            }
        }
        return bDSTreeHash;
    }

    private void initialize(byte[] bArr, byte[] bArr2, g gVar) {
        if (gVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        f fVar = (f) ((f.b) ((f.b) new f.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).build();
        d dVar = (d) ((d.b) ((d.b) new d.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).build();
        for (int i8 = 0; i8 < (1 << this.treeHeight); i8++) {
            gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).withOTSAddress(i8).withChainAddress(gVar.getChainAddress()).withHashAddress(gVar.getHashAddress()).withKeyAndMask(gVar.getKeyAndMask())).build();
            h hVar = this.wotsPlus;
            hVar.importKeys(hVar.getWOTSPlusSecretKey(bArr2, gVar), bArr);
            l publicKey = this.wotsPlus.getPublicKey(gVar);
            fVar = (f) ((f.b) ((f.b) ((f.b) new f.b().withLayerAddress(fVar.getLayerAddress())).withTreeAddress(fVar.getTreeAddress())).withLTreeAddress(i8).withTreeHeight(fVar.getTreeHeight()).withTreeIndex(fVar.getTreeIndex()).withKeyAndMask(fVar.getKeyAndMask())).build();
            XMSSNode lTree = t.lTree(this.wotsPlus, publicKey, fVar);
            dVar = (d) ((d.b) ((d.b) ((d.b) new d.b().withLayerAddress(dVar.getLayerAddress())).withTreeAddress(dVar.getTreeAddress())).withTreeIndex(i8).withKeyAndMask(dVar.getKeyAndMask())).build();
            while (!this.stack.isEmpty() && this.stack.peek().getHeight() == lTree.getHeight()) {
                int height = i8 / (1 << lTree.getHeight());
                if (height == 1) {
                    this.authenticationPath.add(lTree);
                }
                if (height == 3 && lTree.getHeight() < this.treeHeight - this.f17209k) {
                    this.treeHashInstances.get(lTree.getHeight()).setNode(lTree);
                }
                if (height >= 3 && (height & 1) == 1 && lTree.getHeight() >= this.treeHeight - this.f17209k && lTree.getHeight() <= this.treeHeight - 2) {
                    if (this.retain.get(Integer.valueOf(lTree.getHeight())) == null) {
                        LinkedList<XMSSNode> linkedList = new LinkedList<>();
                        linkedList.add(lTree);
                        this.retain.put(Integer.valueOf(lTree.getHeight()), linkedList);
                    } else {
                        this.retain.get(Integer.valueOf(lTree.getHeight())).add(lTree);
                    }
                }
                d dVar2 = (d) ((d.b) ((d.b) ((d.b) new d.b().withLayerAddress(dVar.getLayerAddress())).withTreeAddress(dVar.getTreeAddress())).withTreeHeight(dVar.getTreeHeight()).withTreeIndex((dVar.getTreeIndex() - 1) / 2).withKeyAndMask(dVar.getKeyAndMask())).build();
                XMSSNode randomizeHash = t.randomizeHash(this.wotsPlus, this.stack.pop(), lTree, dVar2);
                XMSSNode xMSSNode = new XMSSNode(randomizeHash.getHeight() + 1, randomizeHash.getValue());
                dVar = (d) ((d.b) ((d.b) ((d.b) new d.b().withLayerAddress(dVar2.getLayerAddress())).withTreeAddress(dVar2.getTreeAddress())).withTreeHeight(dVar2.getTreeHeight() + 1).withTreeIndex(dVar2.getTreeIndex()).withKeyAndMask(dVar2.getKeyAndMask())).build();
                lTree = xMSSNode;
            }
            this.stack.push(lTree);
        }
        this.root = this.stack.pop();
    }

    private void nextAuthenticationPath(byte[] bArr, byte[] bArr2, g gVar) {
        List<XMSSNode> list;
        XMSSNode removeFirst;
        if (gVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.used) {
            throw new IllegalStateException("index already used");
        }
        int i8 = this.index;
        if (i8 > this.maxIndex - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int calculateTau = z.calculateTau(i8, this.treeHeight);
        if (((this.index >> (calculateTau + 1)) & 1) == 0 && calculateTau < this.treeHeight - 1) {
            this.keep.put(Integer.valueOf(calculateTau), this.authenticationPath.get(calculateTau));
        }
        f fVar = (f) ((f.b) ((f.b) new f.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).build();
        d dVar = (d) ((d.b) ((d.b) new d.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).build();
        if (calculateTau == 0) {
            gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().withLayerAddress(gVar.getLayerAddress())).withTreeAddress(gVar.getTreeAddress())).withOTSAddress(this.index).withChainAddress(gVar.getChainAddress()).withHashAddress(gVar.getHashAddress()).withKeyAndMask(gVar.getKeyAndMask())).build();
            h hVar = this.wotsPlus;
            hVar.importKeys(hVar.getWOTSPlusSecretKey(bArr2, gVar), bArr);
            this.authenticationPath.set(0, t.lTree(this.wotsPlus, this.wotsPlus.getPublicKey(gVar), (f) ((f.b) ((f.b) ((f.b) new f.b().withLayerAddress(fVar.getLayerAddress())).withTreeAddress(fVar.getTreeAddress())).withLTreeAddress(this.index).withTreeHeight(fVar.getTreeHeight()).withTreeIndex(fVar.getTreeIndex()).withKeyAndMask(fVar.getKeyAndMask())).build()));
        } else {
            int i9 = calculateTau - 1;
            d dVar2 = (d) ((d.b) ((d.b) ((d.b) new d.b().withLayerAddress(dVar.getLayerAddress())).withTreeAddress(dVar.getTreeAddress())).withTreeHeight(i9).withTreeIndex(this.index >> calculateTau).withKeyAndMask(dVar.getKeyAndMask())).build();
            h hVar2 = this.wotsPlus;
            hVar2.importKeys(hVar2.getWOTSPlusSecretKey(bArr2, gVar), bArr);
            XMSSNode randomizeHash = t.randomizeHash(this.wotsPlus, this.authenticationPath.get(i9), this.keep.get(Integer.valueOf(i9)), dVar2);
            this.authenticationPath.set(calculateTau, new XMSSNode(randomizeHash.getHeight() + 1, randomizeHash.getValue()));
            this.keep.remove(Integer.valueOf(i9));
            for (int i10 = 0; i10 < calculateTau; i10++) {
                if (i10 < this.treeHeight - this.f17209k) {
                    list = this.authenticationPath;
                    removeFirst = this.treeHashInstances.get(i10).getTailNode();
                } else {
                    list = this.authenticationPath;
                    removeFirst = this.retain.get(Integer.valueOf(i10)).removeFirst();
                }
                list.set(i10, removeFirst);
            }
            int min = Math.min(calculateTau, this.treeHeight - this.f17209k);
            for (int i11 = 0; i11 < min; i11++) {
                int i12 = this.index + 1 + ((1 << i11) * 3);
                if (i12 < (1 << this.treeHeight)) {
                    this.treeHashInstances.get(i11).initialize(i12);
                }
            }
        }
        for (int i13 = 0; i13 < ((this.treeHeight - this.f17209k) >> 1); i13++) {
            BDSTreeHash bDSTreeHashInstanceForUpdate = getBDSTreeHashInstanceForUpdate();
            if (bDSTreeHashInstanceForUpdate != null) {
                bDSTreeHashInstanceForUpdate.update(this.stack, this.wotsPlus, bArr, bArr2, gVar);
            }
        }
        this.index++;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.maxIndex = objectInputStream.available() != 0 ? objectInputStream.readInt() : (1 << this.treeHeight) - 1;
        int i8 = this.maxIndex;
        if (i8 > (1 << this.treeHeight) - 1 || this.index > i8 + 1 || objectInputStream.available() != 0) {
            throw new IOException("inconsistent BDS data detected");
        }
    }

    private void validate() {
        if (this.authenticationPath == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.retain == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.stack == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.treeHashInstances == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.keep == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!z.isIndexValid(this.treeHeight, this.index)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.maxIndex);
    }

    protected List<XMSSNode> getAuthenticationPath() {
        ArrayList arrayList = new ArrayList();
        Iterator<XMSSNode> it = this.authenticationPath.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    protected int getIndex() {
        return this.index;
    }

    public int getMaxIndex() {
        return this.maxIndex;
    }

    public BDS getNextState(byte[] bArr, byte[] bArr2, g gVar) {
        return new BDS(this, bArr, bArr2, gVar);
    }

    protected XMSSNode getRoot() {
        return this.root;
    }

    protected int getTreeHeight() {
        return this.treeHeight;
    }

    boolean isUsed() {
        return this.used;
    }

    void markUsed() {
        this.used = true;
    }

    public BDS withMaxIndex(int i8, org.bouncycastle.asn1.o oVar) {
        return new BDS(this, i8, oVar);
    }

    public BDS withWOTSDigest(org.bouncycastle.asn1.o oVar) {
        return new BDS(this, oVar);
    }

    private BDS(BDS bds, int i8, org.bouncycastle.asn1.o oVar) {
        this.wotsPlus = new h(new j(oVar));
        this.treeHeight = bds.treeHeight;
        this.f17209k = bds.f17209k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer num : bds.retain.keySet()) {
            this.retain.put(num, (LinkedList) bds.retain.get(num).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.stack = stack;
        stack.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        Iterator<BDSTreeHash> it = bds.treeHashInstances.iterator();
        while (it.hasNext()) {
            this.treeHashInstances.add(it.next().clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.maxIndex = i8;
        this.used = bds.used;
        validate();
    }

    private BDS(BDS bds, org.bouncycastle.asn1.o oVar) {
        this.wotsPlus = new h(new j(oVar));
        this.treeHeight = bds.treeHeight;
        this.f17209k = bds.f17209k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer num : bds.retain.keySet()) {
            this.retain.put(num, (LinkedList) bds.retain.get(num).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.stack = stack;
        stack.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        Iterator<BDSTreeHash> it = bds.treeHashInstances.iterator();
        while (it.hasNext()) {
            this.treeHashInstances.add(it.next().clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.maxIndex = bds.maxIndex;
        this.used = bds.used;
        validate();
    }

    private BDS(BDS bds, byte[] bArr, byte[] bArr2, g gVar) {
        this.wotsPlus = new h(bds.wotsPlus.getParams());
        this.treeHeight = bds.treeHeight;
        this.f17209k = bds.f17209k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer num : bds.retain.keySet()) {
            this.retain.put(num, (LinkedList) bds.retain.get(num).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.stack = stack;
        stack.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        Iterator<BDSTreeHash> it = bds.treeHashInstances.iterator();
        while (it.hasNext()) {
            this.treeHashInstances.add(it.next().clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.maxIndex = bds.maxIndex;
        this.used = false;
        nextAuthenticationPath(bArr, bArr2, gVar);
    }

    private BDS(h hVar, int i8, int i9, int i10) {
        this.wotsPlus = hVar;
        this.treeHeight = i8;
        this.maxIndex = i10;
        this.f17209k = i9;
        if (i9 <= i8 && i9 >= 2) {
            int i11 = i8 - i9;
            if (i11 % 2 == 0) {
                this.authenticationPath = new ArrayList();
                this.retain = new TreeMap();
                this.stack = new Stack<>();
                this.treeHashInstances = new ArrayList();
                for (int i12 = 0; i12 < i11; i12++) {
                    this.treeHashInstances.add(new BDSTreeHash(i12));
                }
                this.keep = new TreeMap();
                this.index = 0;
                this.used = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    BDS(v vVar, int i8, int i9) {
        this(vVar.getWOTSPlus(), vVar.getHeight(), vVar.getK(), i9);
        this.maxIndex = i8;
        this.index = i9;
        this.used = true;
    }

    BDS(v vVar, byte[] bArr, byte[] bArr2, g gVar) {
        this(vVar.getWOTSPlus(), vVar.getHeight(), vVar.getK(), (1 << vVar.getHeight()) - 1);
        initialize(bArr, bArr2, gVar);
    }

    BDS(v vVar, byte[] bArr, byte[] bArr2, g gVar, int i8) {
        this(vVar.getWOTSPlus(), vVar.getHeight(), vVar.getK(), (1 << vVar.getHeight()) - 1);
        initialize(bArr, bArr2, gVar);
        while (this.index < i8) {
            nextAuthenticationPath(bArr, bArr2, gVar);
            this.used = false;
        }
    }
}
