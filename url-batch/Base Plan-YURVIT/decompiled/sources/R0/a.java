package R0;

import P0.h;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends Q0.a {
    @Override // Q0.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d(current, "current(...)");
        return current;
    }
}
