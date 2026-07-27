package B2;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
final class d implements Comparator<Comparable<? super Object>> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1038a = new d();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> a4 = comparable;
        Comparable<? super Object> b4 = comparable2;
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return b4.compareTo(a4);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return c.f1037a;
    }
}
