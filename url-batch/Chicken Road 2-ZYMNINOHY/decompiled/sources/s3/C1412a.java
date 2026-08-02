package s3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.i;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1412a extends r3.a {
    @Override // r3.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current(...)");
        return current;
    }
}
