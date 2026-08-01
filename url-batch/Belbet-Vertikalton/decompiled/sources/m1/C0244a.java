package m1;

import j1.h;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import l1.AbstractC0208a;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244a extends AbstractC0208a {
    @Override // l1.AbstractC0211d
    public final int b() {
        return ThreadLocalRandom.current().nextInt(120, 255);
    }

    @Override // l1.AbstractC0208a
    public final Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d(current, "current(...)");
        return current;
    }
}
