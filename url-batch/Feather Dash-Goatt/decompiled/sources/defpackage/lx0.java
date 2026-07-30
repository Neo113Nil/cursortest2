package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lx0 extends k0 {
    @Override // defpackage.y01
    public final int c(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // defpackage.k0
    public final Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
