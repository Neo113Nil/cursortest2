package H6;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1068a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q referent, Object obj) {
        super(referent);
        Intrinsics.checkNotNullParameter(referent, "referent");
        this.f1068a = obj;
    }
}
