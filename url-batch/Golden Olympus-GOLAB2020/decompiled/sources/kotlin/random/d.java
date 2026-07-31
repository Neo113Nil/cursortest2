package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d {
    public static final Random a(e eVar) {
        Random n4;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        a aVar = eVar instanceof a ? (a) eVar : null;
        return (aVar == null || (n4 = aVar.n()) == null) ? new c(eVar) : n4;
    }

    public static final double b(int i4, int i5) {
        return ((i4 << 27) + i5) / 9.007199254740992E15d;
    }
}
