package T5;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2600a = new a();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a7 = (Comparable) obj;
        Comparable b7 = (Comparable) obj2;
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        return a7.compareTo(b7);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return b.f2601a;
    }
}
