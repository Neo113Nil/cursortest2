package z2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1399C extends C1398B {
    public static void i(List list, Comparator comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
