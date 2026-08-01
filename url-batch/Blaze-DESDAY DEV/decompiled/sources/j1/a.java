package j1;

import g1.d;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends i1.a {
    @Override // i1.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        d.d(current, "current(...)");
        return current;
    }
}
