package d2;

import Z1.i;
import c2.AbstractC0317a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328a extends AbstractC0317a {
    @Override // c2.AbstractC0317a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.e(current, "current(...)");
        return current;
    }
}
