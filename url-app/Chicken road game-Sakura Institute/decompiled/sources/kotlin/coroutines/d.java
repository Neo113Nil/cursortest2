package kotlin.coroutines;

import A.AbstractC0017m;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements CoroutineContext, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f7494d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext.Element f7495e;

    public d(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f7494d = left;
        this.f7495e = element;
    }

    public final boolean equals(Object obj) {
        boolean z4;
        if (this != obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            dVar.getClass();
            int i2 = 2;
            d dVar2 = dVar;
            int i4 = 2;
            while (true) {
                CoroutineContext coroutineContext = dVar2.f7494d;
                dVar2 = coroutineContext instanceof d ? (d) coroutineContext : null;
                if (dVar2 == null) {
                    break;
                }
                i4++;
            }
            d dVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = dVar3.f7494d;
                dVar3 = coroutineContext2 instanceof d ? (d) coroutineContext2 : null;
                if (dVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i4 != i2) {
                return false;
            }
            d dVar4 = this;
            while (true) {
                CoroutineContext.Element element = dVar4.f7495e;
                if (!Intrinsics.a(dVar.k(element.getKey()), element)) {
                    z4 = false;
                    break;
                }
                CoroutineContext coroutineContext3 = dVar4.f7494d;
                if (!(coroutineContext3 instanceof d)) {
                    Intrinsics.d(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                    z4 = Intrinsics.a(dVar.k(element2.getKey()), element2);
                    break;
                }
                dVar4 = (d) coroutineContext3;
            }
            if (!z4) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f7495e.hashCode() + this.f7494d.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object i(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.h(this.f7494d.i(obj, operation), this.f7495e);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element k(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        d dVar = this;
        while (true) {
            CoroutineContext.Element k4 = dVar.f7495e.k(key);
            if (k4 != null) {
                return k4;
            }
            CoroutineContext coroutineContext = dVar.f7494d;
            if (!(coroutineContext instanceof d)) {
                return coroutineContext.k(key);
            }
            dVar = (d) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext s(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == i.f7498d ? this : (CoroutineContext) context.i(this, h.f7497d);
    }

    public final String toString() {
        return AbstractC0017m.m(new StringBuilder("["), (String) i("", c.f7493d), ']');
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f7495e;
        CoroutineContext.Element k4 = element.k(key);
        CoroutineContext coroutineContext = this.f7494d;
        if (k4 != null) {
            return coroutineContext;
        }
        CoroutineContext w4 = coroutineContext.w(key);
        return w4 == coroutineContext ? this : w4 == i.f7498d ? element : new d(w4, element);
    }
}
