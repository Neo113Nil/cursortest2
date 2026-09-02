package g0;

import e0.h;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends f0.a {
    @Override // f0.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d(current, "current(...)");
        return current;
    }
}
