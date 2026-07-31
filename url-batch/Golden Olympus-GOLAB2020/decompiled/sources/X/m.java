package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private final Fragment f9677b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Fragment fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f9677b = fragment;
    }

    public final Fragment c() {
        return this.f9677b;
    }
}
