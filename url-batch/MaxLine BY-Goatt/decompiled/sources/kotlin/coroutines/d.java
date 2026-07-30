package kotlin.coroutines;

import com.google.firebase.encoders.json.BuildConfig;
import defpackage.a82;
import defpackage.in1;
import defpackage.lh;
import defpackage.ss;
import defpackage.ww;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d implements CoroutineContext, Serializable {
    public final CoroutineContext m;
    public final CoroutineContext.Element n;

    public d(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        element.getClass();
        this.m = coroutineContext;
        this.n = element;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int a = a();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[a];
        a82 a82Var = new a82();
        y(Unit.a, new ss(1, coroutineContextArr, a82Var));
        if (a82Var.m == a) {
            return new c(coroutineContextArr);
        }
        lh.g("Check failed.");
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext H(g gVar) {
        gVar.getClass();
        CoroutineContext.Element element = this.n;
        CoroutineContext.Element m = element.m(gVar);
        CoroutineContext coroutineContext = this.m;
        if (m != null) {
            return coroutineContext;
        }
        CoroutineContext H = coroutineContext.H(gVar);
        return H == coroutineContext ? this : H == h.m ? element : new d(element, H);
    }

    public final int a() {
        int i = 2;
        while (true) {
            CoroutineContext coroutineContext = this.m;
            this = coroutineContext instanceof d ? (d) coroutineContext : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.a() == a()) {
                while (true) {
                    CoroutineContext.Element element = this.n;
                    if (!Intrinsics.b(dVar.m(element.getKey()), element)) {
                        z = false;
                        break;
                    }
                    CoroutineContext coroutineContext = this.m;
                    if (!(coroutineContext instanceof d)) {
                        coroutineContext.getClass();
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                        z = Intrinsics.b(dVar.m(element2.getKey()), element2);
                        break;
                    }
                    this = (d) coroutineContext;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() + this.m.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(g gVar) {
        gVar.getClass();
        while (true) {
            CoroutineContext.Element m = this.n.m(gVar);
            if (m != null) {
                return m;
            }
            CoroutineContext coroutineContext = this.m;
            if (!(coroutineContext instanceof d)) {
                return coroutineContext.m(gVar);
            }
            this = (d) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == h.m ? this : (CoroutineContext) coroutineContext.y(this, new ww(14));
    }

    public final String toString() {
        return in1.m(new StringBuilder("["), (String) y(BuildConfig.FLAVOR, new ww(0)), ']');
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object y(Object obj, Function2 function2) {
        return function2.invoke(this.m.y(obj, function2), this.n);
    }
}
