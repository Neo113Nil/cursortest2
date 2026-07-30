package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import y5.f;
import y5.t;

/* loaded from: classes3.dex */
final class SafePublicationLazyImpl<T> implements f, Serializable {
    public static final a Companion = new a(null);
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> valueUpdater = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final, reason: not valid java name */
    private final Object f4final;
    private volatile f6.a initializer;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public SafePublicationLazyImpl(f6.a initializer) {
        s.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        t tVar = t.INSTANCE;
        this._value = tVar;
        this.f4final = tVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // y5.f
    public T getValue() {
        T t7 = (T) this._value;
        t tVar = t.INSTANCE;
        if (t7 != tVar) {
            return t7;
        }
        f6.a aVar = this.initializer;
        if (aVar != null) {
            T t8 = (T) aVar.invoke();
            if (androidx.concurrent.futures.a.a(valueUpdater, this, tVar, t8)) {
                this.initializer = null;
                return t8;
            }
        }
        return (T) this._value;
    }

    @Override // y5.f
    public boolean isInitialized() {
        return this._value != t.INSTANCE;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
