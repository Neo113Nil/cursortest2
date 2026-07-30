package x0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends V6.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f8306b;

    /* renamed from: c, reason: collision with root package name */
    public final h f8307c;

    /* renamed from: d, reason: collision with root package name */
    public final C0994a f8308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object value, h verificationMode, C0994a logger) {
        super(20);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("g", "tag");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f8306b = value;
        this.f8307c = verificationMode;
        this.f8308d = logger;
    }

    @Override // V6.b
    public final V6.b L(String message, Function1 condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Object obj = this.f8306b;
        return ((Boolean) condition.invoke(obj)).booleanValue() ? this : new f(obj, message, this.f8308d, this.f8307c);
    }

    @Override // V6.b
    public final Object b() {
        return this.f8306b;
    }
}
