package j1;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class a extends e {
    @Override // j1.e
    public final int a(int i) {
        return ((-i) >> 31) & (d().nextInt() >>> (32 - i));
    }

    @Override // j1.e
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();

    public final int e(int i) {
        return d().nextInt(i);
    }
}
