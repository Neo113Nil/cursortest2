package j$.util.function;

import j$.time.format.s;
import java.util.function.Predicate;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new b(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new s(2, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new b(predicate, predicate2, 1);
    }
}
