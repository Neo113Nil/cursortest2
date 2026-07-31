package W1;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class o implements h, Serializable {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f9611e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f9612f = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "c");

    /* renamed from: b, reason: collision with root package name */
    private volatile Function0 f9613b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f9614c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f9615d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f9613b = initializer;
        x xVar = x.f9637a;
        this.f9614c = xVar;
        this.f9615d = xVar;
    }

    public boolean c() {
        return this.f9614c != x.f9637a;
    }

    @Override // W1.h
    public Object getValue() {
        Object obj = this.f9614c;
        x xVar = x.f9637a;
        if (obj != xVar) {
            return obj;
        }
        Function0 function0 = this.f9613b;
        if (function0 != null) {
            Object invoke = function0.invoke();
            if (androidx.concurrent.futures.b.a(f9612f, this, xVar, invoke)) {
                this.f9613b = null;
                return invoke;
            }
        }
        return this.f9614c;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
