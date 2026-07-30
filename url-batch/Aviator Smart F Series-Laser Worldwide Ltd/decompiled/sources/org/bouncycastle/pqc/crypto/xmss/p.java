package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes5.dex */
public class p extends org.bouncycastle.crypto.params.a {
    private final String treeDigest;

    public p(boolean z7, String str) {
        super(z7);
        this.treeDigest = str;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}
