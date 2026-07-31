package kotlin.sequences;

import i2.InterfaceC2471a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class g implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f41216a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f41217b;

    public static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private Object f41218b;

        /* renamed from: c, reason: collision with root package name */
        private int f41219c = -2;

        a() {
        }

        private final void a() {
            Object invoke;
            if (this.f41219c == -2) {
                invoke = g.this.f41216a.invoke();
            } else {
                Function1 function1 = g.this.f41217b;
                Object obj = this.f41218b;
                Intrinsics.checkNotNull(obj);
                invoke = function1.invoke(obj);
            }
            this.f41218b = invoke;
            this.f41219c = invoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f41219c < 0) {
                a();
            }
            return this.f41219c == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f41219c < 0) {
                a();
            }
            if (this.f41219c == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f41218b;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f41219c = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(Function0 getInitialValue, Function1 getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f41216a = getInitialValue;
        this.f41217b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
