package i3;

import f3.d;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends h3.a {
    @Override // h3.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        d.d(current, "current(...)");
        return current;
    }
}
