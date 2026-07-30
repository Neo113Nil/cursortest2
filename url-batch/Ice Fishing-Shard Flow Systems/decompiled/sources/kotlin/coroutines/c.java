package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements CoroutineContext, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f6143d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext.Element f6144e;

    public c(CoroutineContext.Element element, CoroutineContext left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f6143d = left;
        this.f6144e = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext B(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f6144e;
        CoroutineContext.Element g7 = element.g(key);
        CoroutineContext coroutineContext = this.f6143d;
        if (g7 != null) {
            return coroutineContext;
        }
        CoroutineContext B7 = coroutineContext.B(key);
        return B7 == coroutineContext ? this : B7 == g.f6146d ? element : new c(element, B7);
    }

    public final boolean equals(Object obj) {
        boolean z7;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i2 = 2;
            c cVar2 = cVar;
            int i5 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.f6143d;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i5++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.f6143d;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i5 == i2) {
                c cVar4 = this;
                while (true) {
                    CoroutineContext.Element element = cVar4.f6144e;
                    if (!Intrinsics.a(cVar.g(element.getKey()), element)) {
                        z7 = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = cVar4.f6143d;
                    if (!(coroutineContext3 instanceof c)) {
                        Intrinsics.c(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        z7 = Intrinsics.a(cVar.g(element2.getKey()), element2);
                        break;
                    }
                    cVar4 = (c) coroutineContext3;
                }
                if (z7) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element g7 = cVar.f6144e.g(key);
            if (g7 != null) {
                return g7;
            }
            CoroutineContext coroutineContext = cVar.f6143d;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.g(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.f6144e.hashCode() + this.f6143d.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext j(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.f6146d ? this : (CoroutineContext) context.t(this, new V5.a(1));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object t(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f6143d.t(obj, operation), this.f6144e);
    }

    public final String toString() {
        return "[" + ((String) t("", new V5.a(0))) + ']';
    }
}
