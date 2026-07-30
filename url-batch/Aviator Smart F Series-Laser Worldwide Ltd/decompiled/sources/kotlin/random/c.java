package kotlin.random;

import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class c {
    public static final java.util.Random asJavaRandom(Random random) {
        java.util.Random impl;
        s.checkNotNullParameter(random, "<this>");
        a aVar = random instanceof a ? (a) random : null;
        return (aVar == null || (impl = aVar.getImpl()) == null) ? new KotlinRandom(random) : impl;
    }

    public static final Random asKotlinRandom(java.util.Random random) {
        Random impl;
        s.checkNotNullParameter(random, "<this>");
        KotlinRandom kotlinRandom = random instanceof KotlinRandom ? (KotlinRandom) random : null;
        return (kotlinRandom == null || (impl = kotlinRandom.getImpl()) == null) ? new PlatformRandom(random) : impl;
    }

    private static final Random defaultPlatformRandom() {
        return b6.b.IMPLEMENTATIONS.defaultPlatformRandom();
    }

    public static final double doubleFromParts(int i8, int i9) {
        return ((i8 << 27) + i9) / 9.007199254740992E15d;
    }
}
