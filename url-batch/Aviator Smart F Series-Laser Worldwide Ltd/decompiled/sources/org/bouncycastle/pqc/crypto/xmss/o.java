package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes5.dex */
public class o extends org.bouncycastle.crypto.params.a {
    public static final String SHAKE128 = "SHAKE128";
    public static final String SHAKE256 = "SHAKE256";
    public static final String SHA_256 = "SHA-256";
    public static final String SHA_512 = "SHA-512";
    private final String treeDigest;

    public o(boolean z7, String str) {
        super(z7);
        this.treeDigest = str;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}
