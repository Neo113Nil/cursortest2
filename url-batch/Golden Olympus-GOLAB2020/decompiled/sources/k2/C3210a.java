package k2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3210a extends kotlin.random.a {
    @Override // kotlin.random.e
    public int l(int i4, int i5) {
        return ThreadLocalRandom.current().nextInt(i4, i5);
    }

    @Override // kotlin.random.a
    public Random n() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current(...)");
        return current;
    }
}
