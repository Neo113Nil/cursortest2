package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import y5.f;
import y5.t;

/* loaded from: classes3.dex */
final class SynchronizedLazyImpl<T> implements f, Serializable {
    private volatile Object _value;
    private f6.a initializer;
    private final Object lock;

    public SynchronizedLazyImpl(f6.a initializer, Object obj) {
        s.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        this._value = t.INSTANCE;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // y5.f
    public T getValue() {
        T t7;
        T t8 = (T) this._value;
        t tVar = t.INSTANCE;
        if (t8 != tVar) {
            return t8;
        }
        synchronized (this.lock) {
            t7 = (T) this._value;
            if (t7 == tVar) {
                f6.a aVar = this.initializer;
                s.checkNotNull(aVar);
                t7 = (T) aVar.invoke();
                this._value = t7;
                this.initializer = null;
            }
        }
        return t7;
    }

    @Override // y5.f
    public boolean isInitialized() {
        return this._value != t.INSTANCE;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(f6.a aVar, Object obj, int i8, o oVar) {
        this(aVar, (i8 & 2) != 0 ? null : obj);
    }
}
