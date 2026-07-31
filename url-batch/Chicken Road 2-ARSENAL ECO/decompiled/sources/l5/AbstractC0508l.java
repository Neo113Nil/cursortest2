package l5;

import java.util.Collection;

/* renamed from: l5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0508l extends AbstractC0507k {
    public static int C(Iterable iterable, int i7) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
