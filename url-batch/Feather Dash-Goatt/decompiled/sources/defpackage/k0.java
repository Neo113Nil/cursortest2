package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class k0 extends y01 {
    @Override // defpackage.y01
    public final int a(int i) {
        return (d().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.y01
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();

    public final int e(int i) {
        return d().nextInt(i);
    }
}
