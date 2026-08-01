package n1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import k1.e;
import m1.AbstractC0287a;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293a extends AbstractC0287a {
    @Override // m1.AbstractC0287a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        e.d(current, "current(...)");
        return current;
    }
}
