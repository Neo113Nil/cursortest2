package h6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a extends g6.a {
    @Override // g6.a
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.c(current, "ThreadLocalRandom.current()");
        return current;
    }
}
