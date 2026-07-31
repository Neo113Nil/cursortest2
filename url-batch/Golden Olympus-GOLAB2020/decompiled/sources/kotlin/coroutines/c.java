package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements CoroutineContext, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final CoroutineContext f41108b;

    /* renamed from: c, reason: collision with root package name */
    private final CoroutineContext.Element f41109c;

    static final class a extends s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f41110i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String acc, @NotNull CoroutineContext.Element element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f41108b = left;
        this.f41109c = element;
    }

    private final boolean d(CoroutineContext.Element element) {
        return Intrinsics.areEqual(get(element.getKey()), element);
    }

    private final boolean e(c cVar) {
        while (d(cVar.f41109c)) {
            CoroutineContext coroutineContext = cVar.f41108b;
            if (!(coroutineContext instanceof c)) {
                Intrinsics.checkNotNull(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return d((CoroutineContext.Element) coroutineContext);
            }
            cVar = (c) coroutineContext;
        }
        return false;
    }

    private final int f() {
        int i4 = 2;
        c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.f41108b;
            cVar = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (cVar == null) {
                return i4;
            }
            i4++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f() == f() && cVar.e(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f41108b.fold(obj, operation), this.f41109c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element element = cVar.f41109c.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = cVar.f41108b;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public int hashCode() {
        return this.f41108b.hashCode() + this.f41109c.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f41109c.get(key) != null) {
            return this.f41108b;
        }
        CoroutineContext minusKey = this.f41108b.minusKey(key);
        return minusKey == this.f41108b ? this : minusKey == g.f41113b ? this.f41109c : new c(minusKey, this.f41109c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.a(this, coroutineContext);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f41110i)) + ']';
    }
}
