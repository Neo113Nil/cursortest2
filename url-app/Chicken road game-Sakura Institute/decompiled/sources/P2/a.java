package P2;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class a extends c {
    @Override // P2.c
    public final int a(int i2) {
        return ((-i2) >> 31) & (e().nextInt() >>> (32 - i2));
    }

    @Override // P2.c
    public final int b() {
        return e().nextInt();
    }

    @Override // P2.c
    public final int c() {
        return e().nextInt(2147418112);
    }

    public abstract Random e();
}
