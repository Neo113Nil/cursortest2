package Z;

import androidx.fragment.app.ComponentCallbacksC0228t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final ComponentCallbacksC0228t f2935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ComponentCallbacksC0228t fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f2935d = fragment;
    }
}
