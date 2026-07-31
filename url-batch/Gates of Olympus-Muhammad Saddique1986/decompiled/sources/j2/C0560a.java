package j2;

import f2.j;
import i2.AbstractC0517a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560a extends AbstractC0517a {
    @Override // i2.AbstractC0517a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.e(current, "current(...)");
        return current;
    }
}
