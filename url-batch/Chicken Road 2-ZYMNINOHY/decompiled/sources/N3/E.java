package N3;

import java.io.IOException;

/* loaded from: classes.dex */
public final class E extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0078b f1819a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(EnumC0078b errorCode) {
        super(kotlin.jvm.internal.i.h(errorCode, "stream was reset: "));
        kotlin.jvm.internal.i.e(errorCode, "errorCode");
        this.f1819a = errorCode;
    }
}
