package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements CoroutineContext, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f5589d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext.Element f5590e;

    public c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        element.getClass();
        this.f5589d = coroutineContext;
        this.f5590e = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext F(f fVar) {
        fVar.getClass();
        CoroutineContext.Element element = this.f5590e;
        CoroutineContext.Element m10 = element.m(fVar);
        CoroutineContext coroutineContext = this.f5589d;
        if (m10 != null) {
            return coroutineContext;
        }
        CoroutineContext F = coroutineContext.F(fVar);
        return F == coroutineContext ? this : F == g.f5592d ? element : new c(element, F);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i3 = 2;
            c cVar2 = cVar;
            int i10 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.f5589d;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i10++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.f5589d;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i3++;
            }
            if (i10 == i3) {
                c cVar4 = this;
                while (true) {
                    CoroutineContext.Element element = cVar4.f5590e;
                    if (!Intrinsics.a(cVar.m(element.getKey()), element)) {
                        z10 = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = cVar4.f5589d;
                    if (!(coroutineContext3 instanceof c)) {
                        coroutineContext3.getClass();
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        z10 = Intrinsics.a(cVar.m(element2.getKey()), element2);
                        break;
                    }
                    cVar4 = (c) coroutineContext3;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5590e.hashCode() + this.f5589d.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(f fVar) {
        fVar.getClass();
        c cVar = this;
        while (true) {
            CoroutineContext.Element m10 = cVar.f5590e.m(fVar);
            if (m10 != null) {
                return m10;
            }
            CoroutineContext coroutineContext = cVar.f5589d;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.m(fVar);
            }
            cVar = (c) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == g.f5592d ? this : (CoroutineContext) coroutineContext.z(this, new a1.e(14, (byte) 0));
    }

    public final String toString() {
        return l.h(new StringBuilder("["), (String) z("", new a1.e(13, (byte) 0)), ']');
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(this.f5589d.z(obj, function2), this.f5590e);
    }
}
