package q3;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9386a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g referent, Object obj) {
        super(referent);
        Intrinsics.checkNotNullParameter(referent, "referent");
        this.f9386a = obj;
    }
}
