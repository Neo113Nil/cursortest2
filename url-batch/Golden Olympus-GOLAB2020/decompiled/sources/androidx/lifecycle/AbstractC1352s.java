package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o2.R0;

/* renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1352s {
    public static final AbstractC1347m a(AbstractC1346l abstractC1346l) {
        C1348n c1348n;
        Intrinsics.checkNotNullParameter(abstractC1346l, "<this>");
        do {
            C1348n c1348n2 = (C1348n) abstractC1346l.getInternalScopeRef().get();
            if (c1348n2 != null) {
                return c1348n2;
            }
            c1348n = new C1348n(abstractC1346l, R0.b(null, 1, null).plus(o2.Z.c().p()));
        } while (!r.a(abstractC1346l.getInternalScopeRef(), null, c1348n));
        c1348n.b();
        return c1348n;
    }
}
