package x2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import u2.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends w2.a {
    @Override // w2.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        c.d(current, "current(...)");
        return current;
    }
}
