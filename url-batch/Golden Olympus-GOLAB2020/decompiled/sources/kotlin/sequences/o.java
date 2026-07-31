package kotlin.sequences;

import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class o extends n {
    public static SortedSet k(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (SortedSet) p.C(sequence, new TreeSet());
    }
}
