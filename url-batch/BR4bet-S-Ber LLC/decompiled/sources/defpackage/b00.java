package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class b00 extends o {
    @Override // defpackage.o
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
