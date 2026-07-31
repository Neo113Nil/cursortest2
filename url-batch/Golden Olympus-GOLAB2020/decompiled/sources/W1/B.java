package W1;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class B implements h, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private Function0 f9602b;

    /* renamed from: c, reason: collision with root package name */
    private Object f9603c;

    public B(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f9602b = initializer;
        this.f9603c = x.f9637a;
    }

    public boolean c() {
        return this.f9603c != x.f9637a;
    }

    @Override // W1.h
    public Object getValue() {
        if (this.f9603c == x.f9637a) {
            Function0 function0 = this.f9602b;
            Intrinsics.checkNotNull(function0);
            this.f9603c = function0.invoke();
            this.f9602b = null;
        }
        return this.f9603c;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
