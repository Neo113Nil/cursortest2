package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class e extends o implements m {
    private long index;
    private final long indexLimit;
    private final boolean isShard;
    private List<q> keys;

    /* renamed from: l, reason: collision with root package name */
    private final int f17199l;
    private f publicKey;
    private List<s> sig;

    public e(int i8, List<q> list, List<s> list2, long j8, long j9) {
        super(true);
        this.index = 0L;
        this.f17199l = i8;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j8;
        this.indexLimit = j9;
        this.isShard = false;
        resetKeyToIndex();
    }

    public static e getInstance(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int readInt = dataInputStream.readInt();
            long readLong = dataInputStream.readLong();
            long readLong2 = dataInputStream.readLong();
            boolean readBoolean = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i8 = 0; i8 < readInt; i8++) {
                arrayList.add(q.getInstance(obj));
            }
            for (int i9 = 0; i9 < readInt - 1; i9++) {
                arrayList2.add(s.getInstance(obj));
            }
            return new e(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(j7.a.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                e eVar = getInstance(dataInputStream3);
                dataInputStream3.close();
                return eVar;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static e makeCopy(e eVar) {
        try {
            return getInstance(eVar.getEncoded());
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    protected Object clone() {
        return makeCopy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f17199l == eVar.f17199l && this.isShard == eVar.isShard && this.indexLimit == eVar.indexLimit && this.index == eVar.index && this.keys.equals(eVar.keys)) {
            return this.sig.equals(eVar.sig);
        }
        return false;
    }

    public e extractKeyShard(int i8) {
        e makeCopy;
        synchronized (this) {
            try {
                long j8 = i8;
                if (getUsagesRemaining() < j8) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining in current leaf");
                }
                long j9 = this.index;
                this.index = j8 + j9;
                makeCopy = makeCopy(new e(this.f17199l, new ArrayList(getKeys()), new ArrayList(getSig()), j9, j9 + j8, true));
                resetKeyToIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        return makeCopy;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.m
    public l generateLMSContext() {
        q qVar;
        t[] tVarArr;
        int l8 = getL();
        synchronized (this) {
            try {
                c.rangeTestKeys(this);
                List<q> keys = getKeys();
                List<s> sig = getSig();
                int i8 = l8 - 1;
                qVar = getKeys().get(i8);
                tVarArr = new t[i8];
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = i9 + 1;
                    tVarArr[i9] = new t(sig.get(i9), keys.get(i10).getPublicKey());
                    i9 = i10;
                }
                incIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar.generateLMSContext().withSignedPublicKeys(tVarArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.m
    public byte[] generateSignature(l lVar) {
        try {
            return c.generateSignature(getL(), lVar).getEncoded();
        } catch (IOException e8) {
            throw new IllegalStateException("unable to encode signature: " + e8.getMessage(), e8);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.o, org.bouncycastle.util.c
    public synchronized byte[] getEncoded() {
        a bool;
        try {
            bool = a.compose().u32str(0).u32str(this.f17199l).u64str(this.index).u64str(this.indexLimit).bool(this.isShard);
            Iterator<q> it = this.keys.iterator();
            while (it.hasNext()) {
                bool.bytes(it.next());
            }
            Iterator<s> it2 = this.sig.iterator();
            while (it2.hasNext()) {
                bool.bytes(it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return bool.build();
    }

    public synchronized long getIndex() {
        return this.index;
    }

    long getIndexLimit() {
        return this.indexLimit;
    }

    synchronized List<q> getKeys() {
        return this.keys;
    }

    public int getL() {
        return this.f17199l;
    }

    public synchronized p[] getLMSParameters() {
        p[] pVarArr;
        int size = this.keys.size();
        pVarArr = new p[size];
        for (int i8 = 0; i8 < size; i8++) {
            q qVar = this.keys.get(i8);
            pVarArr[i8] = new p(qVar.getSigParameters(), qVar.getOtsParameters());
        }
        return pVarArr;
    }

    public synchronized f getPublicKey() {
        return new f(this.f17199l, getRootKey().getPublicKey());
    }

    q getRootKey() {
        return this.keys.get(0);
    }

    synchronized List<s> getSig() {
        return this.sig;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.m
    public long getUsagesRemaining() {
        return this.indexLimit - this.index;
    }

    public int hashCode() {
        int hashCode = ((((((this.f17199l * 31) + (this.isShard ? 1 : 0)) * 31) + this.keys.hashCode()) * 31) + this.sig.hashCode()) * 31;
        long j8 = this.indexLimit;
        int i8 = (hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.index;
        return i8 + ((int) (j9 ^ (j9 >>> 32)));
    }

    synchronized void incIndex() {
        this.index++;
    }

    boolean isShard() {
        return this.isShard;
    }

    void replaceConsumedKey(int i8) {
        int i9 = i8 - 1;
        w derivationFunction = this.keys.get(i9).getCurrentOTSKey().getDerivationFunction();
        derivationFunction.setJ(-2);
        byte[] bArr = new byte[32];
        derivationFunction.deriveSeed(bArr, true);
        byte[] bArr2 = new byte[32];
        derivationFunction.deriveSeed(bArr2, false);
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        ArrayList arrayList = new ArrayList(this.keys);
        q qVar = this.keys.get(i8);
        arrayList.set(i8, k.generateKeys(qVar.getSigParameters(), qVar.getOtsParameters(), 0, bArr3, bArr));
        ArrayList arrayList2 = new ArrayList(this.sig);
        arrayList2.set(i9, k.generateSign((q) arrayList.get(i9), ((q) arrayList.get(i8)).getPublicKey().toByteArray()));
        this.keys = Collections.unmodifiableList(arrayList);
        this.sig = Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d1, code lost:
    
        if (r3[r9] == (r4[r9].getIndex() - 1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void resetKeyToIndex() {
        boolean z7;
        List<q> keys = getKeys();
        int size = keys.size();
        long[] jArr = new long[size];
        long index = getIndex();
        for (int size2 = keys.size() - 1; size2 >= 0; size2--) {
            LMSigParameters sigParameters = keys.get(size2).getSigParameters();
            jArr[size2] = ((1 << sigParameters.getH()) - 1) & index;
            index >>>= sigParameters.getH();
        }
        q[] qVarArr = (q[]) keys.toArray(new q[keys.size()]);
        List<s> list = this.sig;
        s[] sVarArr = (s[]) list.toArray(new s[list.size()]);
        q rootKey = getRootKey();
        if (qVarArr[0].getIndex() - 1 != jArr[0]) {
            qVarArr[0] = k.generateKeys(rootKey.getSigParameters(), rootKey.getOtsParameters(), (int) jArr[0], rootKey.getI(), rootKey.getMasterSecret());
            z7 = true;
        } else {
            z7 = false;
        }
        int i8 = 1;
        while (i8 < size) {
            int i9 = i8 - 1;
            q qVar = qVarArr[i9];
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[32];
            w wVar = new w(qVar.getI(), qVar.getMasterSecret(), b.getDigest(qVar.getOtsParameters().getDigestOID()));
            wVar.setQ((int) jArr[i9]);
            wVar.setJ(-2);
            wVar.deriveSeed(bArr2, true);
            byte[] bArr3 = new byte[32];
            boolean z8 = false;
            wVar.deriveSeed(bArr3, false);
            System.arraycopy(bArr3, 0, bArr, 0, 16);
            if (i8 >= size - 1) {
                if (jArr[i8] != qVarArr[i8].getIndex()) {
                    z8 = false;
                    if (org.bouncycastle.util.a.areEqual(bArr, qVarArr[i8].getI()) || !org.bouncycastle.util.a.areEqual(bArr2, qVarArr[i8].getMasterSecret())) {
                        q generateKeys = k.generateKeys(keys.get(i8).getSigParameters(), keys.get(i8).getOtsParameters(), (int) jArr[i8], bArr, bArr2);
                        qVarArr[i8] = generateKeys;
                        sVarArr[i9] = k.generateSign(qVarArr[i9], generateKeys.getPublicKey().toByteArray());
                    } else if (z8) {
                        i8++;
                    } else {
                        qVarArr[i8] = k.generateKeys(keys.get(i8).getSigParameters(), keys.get(i8).getOtsParameters(), (int) jArr[i8], bArr, bArr2);
                    }
                    z7 = true;
                    i8++;
                }
                z8 = true;
                if (org.bouncycastle.util.a.areEqual(bArr, qVarArr[i8].getI())) {
                }
                q generateKeys2 = k.generateKeys(keys.get(i8).getSigParameters(), keys.get(i8).getOtsParameters(), (int) jArr[i8], bArr, bArr2);
                qVarArr[i8] = generateKeys2;
                sVarArr[i9] = k.generateSign(qVarArr[i9], generateKeys2.getPublicKey().toByteArray());
                z7 = true;
                i8++;
            }
        }
        if (z7) {
            updateHierarchy(qVarArr, sVarArr);
        }
    }

    protected void updateHierarchy(q[] qVarArr, s[] sVarArr) {
        synchronized (this) {
            this.keys = Collections.unmodifiableList(Arrays.asList(qVarArr));
            this.sig = Collections.unmodifiableList(Arrays.asList(sVarArr));
        }
    }

    private e(int i8, List<q> list, List<s> list2, long j8, long j9, boolean z7) {
        super(true);
        this.index = 0L;
        this.f17199l = i8;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j8;
        this.indexLimit = j9;
        this.isShard = z7;
    }

    public static e getInstance(byte[] bArr, byte[] bArr2) {
        e eVar = getInstance(bArr);
        eVar.publicKey = f.getInstance(bArr2);
        return eVar;
    }
}
