package org.bouncycastle.crypto.params;

/* loaded from: classes5.dex */
public class e {
    private int counter;
    private byte[] seed;
    private int usageIndex;

    public e(byte[] bArr, int i8) {
        this(bArr, i8, -1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.counter != this.counter) {
            return false;
        }
        return org.bouncycastle.util.a.areEqual(this.seed, eVar.seed);
    }

    public int getCounter() {
        return this.counter;
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.a.clone(this.seed);
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public int hashCode() {
        return this.counter ^ org.bouncycastle.util.a.hashCode(this.seed);
    }

    public e(byte[] bArr, int i8, int i9) {
        this.seed = org.bouncycastle.util.a.clone(bArr);
        this.counter = i8;
        this.usageIndex = i9;
    }
}
