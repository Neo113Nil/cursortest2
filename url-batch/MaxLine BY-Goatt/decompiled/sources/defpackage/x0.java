package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class x0 extends c62 {
    @Override // defpackage.c62
    public final int a(int i) {
        return (f().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.c62
    public final double b() {
        return f().nextDouble();
    }

    @Override // defpackage.c62
    public final int c() {
        return f().nextInt();
    }

    @Override // defpackage.c62
    public final int d(int i) {
        return f().nextInt(i);
    }

    public abstract Random f();
}
