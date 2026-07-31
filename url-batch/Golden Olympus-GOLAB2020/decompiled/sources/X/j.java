package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f9674c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Fragment fragment, Fragment targetFragment, int i4) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i4 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        this.f9674c = targetFragment;
        this.f9675d = i4;
    }
}
