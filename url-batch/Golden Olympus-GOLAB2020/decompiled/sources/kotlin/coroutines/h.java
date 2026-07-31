package kotlin.coroutines;

import a2.AbstractC1241b;
import a2.EnumC1240a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h implements d, kotlin.coroutines.jvm.internal.e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f41114c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f41115d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "result");

    /* renamed from: b, reason: collision with root package name */
    private final d f41116b;

    @Nullable
    private volatile Object result;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(d delegate, Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f41116b = delegate;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        EnumC1240a enumC1240a = EnumC1240a.f9759c;
        if (obj == enumC1240a) {
            if (androidx.concurrent.futures.b.a(f41115d, this, enumC1240a, AbstractC1241b.f())) {
                return AbstractC1241b.f();
            }
            obj = this.result;
        }
        if (obj == EnumC1240a.f9760d) {
            return AbstractC1241b.f();
        }
        if (obj instanceof Result.a) {
            throw ((Result.a) obj).f41026b;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d dVar = this.f41116b;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return this.f41116b.getContext();
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC1240a enumC1240a = EnumC1240a.f9759c;
            if (obj2 == enumC1240a) {
                if (androidx.concurrent.futures.b.a(f41115d, this, enumC1240a, obj)) {
                    return;
                }
            } else {
                if (obj2 != AbstractC1241b.f()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f41115d, this, AbstractC1241b.f(), EnumC1240a.f9760d)) {
                    this.f41116b.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f41116b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(d delegate) {
        this(delegate, EnumC1240a.f9759c);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
