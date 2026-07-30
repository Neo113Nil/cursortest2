package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class g2 {
    private int index = 0;
    private String oid;

    public g2(String str) {
        this.oid = str;
    }

    public boolean hasMoreTokens() {
        return this.index != -1;
    }

    public String nextToken() {
        int i8 = this.index;
        if (i8 == -1) {
            return null;
        }
        int indexOf = this.oid.indexOf(46, i8);
        if (indexOf == -1) {
            String substring = this.oid.substring(this.index);
            this.index = -1;
            return substring;
        }
        String substring2 = this.oid.substring(this.index, indexOf);
        this.index = indexOf + 1;
        return substring2;
    }
}
