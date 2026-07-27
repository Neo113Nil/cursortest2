package Q2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends P2.a {
    @Override // P2.c
    public final int d() {
        return ThreadLocalRandom.current().nextInt(0, 2147418112);
    }

    @Override // P2.a
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current(...)");
        return current;
    }
}
