package T5;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2601a = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a7 = (Comparable) obj;
        Comparable b7 = (Comparable) obj2;
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        return b7.compareTo(a7);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return a.f2600a;
    }
}
