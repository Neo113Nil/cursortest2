package Z1;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class i implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final i f9748b = new i();

    private i() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a4, Comparable b4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return b4.compareTo(a4);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return h.f9747b;
    }
}
