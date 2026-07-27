package B2;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
final class c implements Comparator<Comparable<? super Object>> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1037a = new c();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> a4 = comparable;
        Comparable<? super Object> b4 = comparable2;
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return a4.compareTo(b4);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return d.f1038a;
    }
}
