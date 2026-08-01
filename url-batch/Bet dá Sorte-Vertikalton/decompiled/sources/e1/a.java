package e1;

import b1.d;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends d1.a {
    @Override // d1.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        d.d(current, "current(...)");
        return current;
    }
}
