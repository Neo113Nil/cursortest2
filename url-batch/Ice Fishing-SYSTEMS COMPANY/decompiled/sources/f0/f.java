package f0;

import androidx.fragment.app.AbstractComponentCallbacksC0485s;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class f extends RuntimeException {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractComponentCallbacksC0485s f37551n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AbstractComponentCallbacksC0485s fragment, String str) {
        super(str);
        h.e(fragment, "fragment");
        this.f37551n = fragment;
    }
}
