package kotlin.random;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class XorWowRandom extends Random implements Serializable {
    private static final Companion Companion = new Companion(null);
    public int addend;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public XorWowRandom(int i, int i2) {
        int i3 = ~i;
        this.x = i;
        this.y = i2;
        this.z = 0;
        this.w = 0;
        this.v = i3;
        this.addend = (i << 10) ^ (i2 >>> 4);
        if ((i | i2 | i3) == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Initial state must have at least one non-zero element.");
            throw null;
        }
        for (int i4 = 0; i4 < 64; i4++) {
            nextInt();
        }
    }

    @Override // kotlin.random.Random
    public final int nextBits(int i) {
        return RandomKt.takeUpperBits(nextInt(), i);
    }

    @Override // kotlin.random.Random
    public final int nextInt() {
        int i = this.x;
        int i2 = i ^ (i >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i3 = this.v;
        this.w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }
}
