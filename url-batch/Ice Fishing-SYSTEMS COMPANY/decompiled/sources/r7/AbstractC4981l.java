package r7;

import java.util.Collection;

/* renamed from: r7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4981l extends AbstractC4980k {
    public static int E(Iterable iterable, int i) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
