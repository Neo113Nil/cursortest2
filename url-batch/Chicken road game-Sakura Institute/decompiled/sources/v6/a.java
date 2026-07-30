package v6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends u6.a {
    @Override // u6.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        k.e(current, "current(...)");
        return current;
    }
}
