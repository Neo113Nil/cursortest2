package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k22 extends x0 {
    @Override // defpackage.c62
    public final int e(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // defpackage.x0
    public final Random f() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
