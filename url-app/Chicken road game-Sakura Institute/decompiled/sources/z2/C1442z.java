package z2;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1442z extends C1441y {
    public static int h(Iterable iterable, int i2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
