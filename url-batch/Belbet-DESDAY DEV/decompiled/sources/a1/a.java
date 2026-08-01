package a1;

import X0.d;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends Z0.a {
    @Override // Z0.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        d.d(current, "current(...)");
        return current;
    }
}
