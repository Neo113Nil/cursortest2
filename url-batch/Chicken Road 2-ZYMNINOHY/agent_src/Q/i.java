package Q;

import androidx.fragment.app.F;

/* loaded from: classes.dex */
public abstract class i extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final F f2122a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(F fragment, String str) {
        super(str);
        kotlin.jvm.internal.i.e(fragment, "fragment");
        this.f2122a = fragment;
    }
}
