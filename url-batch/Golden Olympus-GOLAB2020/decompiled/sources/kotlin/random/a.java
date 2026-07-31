package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a extends e {
    @Override // kotlin.random.e
    public int d(int i4) {
        return f.d(n().nextInt(), i4);
    }

    @Override // kotlin.random.e
    public boolean e() {
        return n().nextBoolean();
    }

    @Override // kotlin.random.e
    public byte[] f(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        n().nextBytes(array);
        return array;
    }

    @Override // kotlin.random.e
    public double h() {
        return n().nextDouble();
    }

    @Override // kotlin.random.e
    public float i() {
        return n().nextFloat();
    }

    @Override // kotlin.random.e
    public int j() {
        return n().nextInt();
    }

    @Override // kotlin.random.e
    public int k(int i4) {
        return n().nextInt(i4);
    }

    @Override // kotlin.random.e
    public long m() {
        return n().nextLong();
    }

    public abstract Random n();
}
