package org.bouncycastle.pqc.crypto.xmss;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.pqc.crypto.xmss.g;

/* loaded from: classes5.dex */
public class BDSStateMap implements Serializable {
    private static final long serialVersionUID = -3464451825208522308L;
    private final Map<Integer, BDS> bdsState = new TreeMap();
    private transient long maxIndex;

    BDSStateMap(long j8) {
        this.maxIndex = j8;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.maxIndex = objectInputStream.available() != 0 ? objectInputStream.readLong() : 0L;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.maxIndex);
    }

    BDS get(int i8) {
        return this.bdsState.get(org.bouncycastle.util.e.valueOf(i8));
    }

    public long getMaxIndex() {
        return this.maxIndex;
    }

    public boolean isEmpty() {
        return this.bdsState.isEmpty();
    }

    void put(int i8, BDS bds) {
        this.bdsState.put(org.bouncycastle.util.e.valueOf(i8), bds);
    }

    BDS update(int i8, byte[] bArr, byte[] bArr2, g gVar) {
        return this.bdsState.put(org.bouncycastle.util.e.valueOf(i8), this.bdsState.get(org.bouncycastle.util.e.valueOf(i8)).getNextState(bArr, bArr2, gVar));
    }

    void updateState(q qVar, long j8, byte[] bArr, byte[] bArr2) {
        v xMSSParameters = qVar.getXMSSParameters();
        int height = xMSSParameters.getHeight();
        long treeIndex = z.getTreeIndex(j8, height);
        int leafIndex = z.getLeafIndex(j8, height);
        g gVar = (g) ((g.b) new g.b().withTreeAddress(treeIndex)).withOTSAddress(leafIndex).build();
        int i8 = (1 << height) - 1;
        if (leafIndex < i8) {
            if (get(0) == null || leafIndex == 0) {
                put(0, new BDS(xMSSParameters, bArr, bArr2, gVar));
            }
            update(0, bArr, bArr2, gVar);
        }
        for (int i9 = 1; i9 < qVar.getLayers(); i9++) {
            int leafIndex2 = z.getLeafIndex(treeIndex, height);
            treeIndex = z.getTreeIndex(treeIndex, height);
            g gVar2 = (g) ((g.b) ((g.b) new g.b().withLayerAddress(i9)).withTreeAddress(treeIndex)).withOTSAddress(leafIndex2).build();
            if (this.bdsState.get(Integer.valueOf(i9)) == null || z.isNewBDSInitNeeded(j8, height, i9)) {
                this.bdsState.put(Integer.valueOf(i9), new BDS(xMSSParameters, bArr, bArr2, gVar2));
            }
            if (leafIndex2 < i8 && z.isNewAuthenticationPathNeeded(j8, height, i9)) {
                update(i9, bArr, bArr2, gVar2);
            }
        }
    }

    public BDSStateMap withWOTSDigest(org.bouncycastle.asn1.o oVar) {
        BDSStateMap bDSStateMap = new BDSStateMap(this.maxIndex);
        for (Integer num : this.bdsState.keySet()) {
            bDSStateMap.bdsState.put(num, this.bdsState.get(num).withWOTSDigest(oVar));
        }
        return bDSStateMap;
    }

    BDSStateMap(BDSStateMap bDSStateMap, long j8) {
        for (Integer num : bDSStateMap.bdsState.keySet()) {
            this.bdsState.put(num, new BDS(bDSStateMap.bdsState.get(num)));
        }
        this.maxIndex = j8;
    }

    BDSStateMap(q qVar, long j8, byte[] bArr, byte[] bArr2) {
        this.maxIndex = (1 << qVar.getHeight()) - 1;
        for (long j9 = 0; j9 < j8; j9++) {
            updateState(qVar, j9, bArr, bArr2);
        }
    }
}
