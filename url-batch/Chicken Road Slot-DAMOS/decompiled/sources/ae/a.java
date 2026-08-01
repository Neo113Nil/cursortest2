package ae;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends zd.a {
    @Override // zd.d
    public final int c(int i3) {
        return ThreadLocalRandom.current().nextInt(0, i3);
    }

    @Override // zd.a
    public final Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
