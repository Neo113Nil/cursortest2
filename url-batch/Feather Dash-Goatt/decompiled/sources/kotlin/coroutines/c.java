package kotlin.coroutines;

import defpackage.e9;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class c implements CoroutineContext, Serializable {
    public final CoroutineContext d;
    public final CoroutineContext.Element e;

    public c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        element.getClass();
        this.d = coroutineContext;
        this.e = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element d(f fVar) {
        fVar.getClass();
        while (true) {
            CoroutineContext.Element d = this.e.d(fVar);
            if (d != null) {
                return d;
            }
            CoroutineContext coroutineContext = this.d;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.d(fVar);
            }
            this = (c) coroutineContext;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.d;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.d;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    CoroutineContext.Element element = this.e;
                    if (!Intrinsics.a(cVar.d(element.getKey()), element)) {
                        z = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = this.d;
                    if (!(coroutineContext3 instanceof c)) {
                        coroutineContext3.getClass();
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        z = Intrinsics.a(cVar.d(element2.getKey()), element2);
                        break;
                    }
                    this = (c) coroutineContext3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + this.d.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext i(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == g.d ? this : (CoroutineContext) coroutineContext.p(this, new e9(5, (byte) 0));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object p(Object obj, Function2 function2) {
        return function2.b(this.d.p(obj, function2), this.e);
    }

    public final String toString() {
        return "[" + ((String) p("", new e9(2, (byte) 0))) + ']';
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(f fVar) {
        fVar.getClass();
        CoroutineContext.Element element = this.e;
        CoroutineContext.Element d = element.d(fVar);
        CoroutineContext coroutineContext = this.d;
        if (d != null) {
            return coroutineContext;
        }
        CoroutineContext w = coroutineContext.w(fVar);
        return w == coroutineContext ? this : w == g.d ? element : new c(element, w);
    }
}
