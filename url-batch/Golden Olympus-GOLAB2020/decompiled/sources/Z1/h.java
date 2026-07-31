package Z1;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class h implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h f9747b = new h();

    private h() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a4, Comparable b4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return a4.compareTo(b4);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return i.f9748b;
    }
}
