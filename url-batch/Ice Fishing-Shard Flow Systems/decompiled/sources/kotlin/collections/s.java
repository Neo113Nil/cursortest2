package kotlin.collections;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class s extends r {
    public static int g(Iterable iterable, int i2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
