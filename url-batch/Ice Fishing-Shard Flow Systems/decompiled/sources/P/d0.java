package P;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.C0781n;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final X5.j f2068a;

    /* renamed from: b, reason: collision with root package name */
    public final C0781n f2069b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f2070c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f2071d;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(Function2 transform, C0781n ack, m0 m0Var, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.f2068a = (X5.j) transform;
        this.f2069b = ack;
        this.f2070c = m0Var;
        this.f2071d = callerContext;
    }
}
