package Z1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class f extends e {
    public static Comparable i(Comparable a4, Comparable b4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return a4.compareTo(b4) >= 0 ? a4 : b4;
    }
}
