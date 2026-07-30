package org.bouncycastle.crypto.params;

/* loaded from: classes5.dex */
public class c {
    private int counter;
    private byte[] seed;

    public c(byte[] bArr, int i8) {
        this.seed = org.bouncycastle.util.a.clone(bArr);
        this.counter = i8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.counter != this.counter) {
            return false;
        }
        return org.bouncycastle.util.a.areEqual(this.seed, cVar.seed);
    }

    public int getCounter() {
        return this.counter;
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.a.clone(this.seed);
    }

    public int hashCode() {
        return this.counter ^ org.bouncycastle.util.a.hashCode(this.seed);
    }
}
