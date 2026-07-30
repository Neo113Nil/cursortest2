package i6;

import h6.AbstractC0495a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554a extends AbstractC0495a {
    @Override // h6.AbstractC0495a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current(...)");
        return current;
    }
}
