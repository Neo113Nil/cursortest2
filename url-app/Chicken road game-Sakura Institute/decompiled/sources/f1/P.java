package f1;

import W2.C0292n;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final E2.j f6531a;

    /* renamed from: b, reason: collision with root package name */
    public final C0292n f6532b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f6533c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f6534d;

    /* JADX WARN: Multi-variable type inference failed */
    public P(Function2 transform, C0292n ack, Y y4, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.f6531a = (E2.j) transform;
        this.f6532b = ack;
        this.f6533c = y4;
        this.f6534d = callerContext;
    }
}
