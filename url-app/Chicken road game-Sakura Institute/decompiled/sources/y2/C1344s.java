package y2;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* renamed from: y2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1344s<T> implements InterfaceC1335j, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final a f11675i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11676j = AtomicReferenceFieldUpdater.newUpdater(C1344s.class, Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public volatile Function0 f11677d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f11678e;

    @Metadata
    /* renamed from: y2.s$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // y2.InterfaceC1335j
    public final boolean a() {
        return this.f11678e != C1321A.f11654a;
    }

    @Override // y2.InterfaceC1335j
    public final Object getValue() {
        Object obj = this.f11678e;
        C1321A c1321a = C1321A.f11654a;
        if (obj != c1321a) {
            return obj;
        }
        Function0 function0 = this.f11677d;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11676j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1321a, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c1321a) {
                }
            }
            this.f11677d = null;
            return invoke;
        }
        return this.f11678e;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
