package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Fragment fragment, boolean z4) {
        super(fragment, "Attempting to set user visible hint to " + z4 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f9676c = z4;
    }
}
