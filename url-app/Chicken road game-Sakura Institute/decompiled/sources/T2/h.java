package T2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class h extends i implements Iterator, C2.a, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f4048d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4049e;

    /* renamed from: i, reason: collision with root package name */
    public C2.a f4050i;

    @Override // T2.i
    public final void b(Object obj, E2.i frame) {
        this.f4049e = obj;
        this.f4048d = 3;
        this.f4050i = frame;
        D2.a aVar = D2.a.f2163d;
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    public final RuntimeException d() {
        int i2 = this.f4048d;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f4048d);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        while (true) {
            i2 = this.f4048d;
            if (i2 != 0) {
                break;
            }
            this.f4048d = 5;
            C2.a aVar = this.f4050i;
            Intrinsics.c(aVar);
            this.f4050i = null;
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            aVar.u(Unit.f7487a);
        }
        if (i2 == 1) {
            Intrinsics.c(null);
            throw null;
        }
        if (i2 == 2 || i2 == 3) {
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        throw d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f4048d;
        if (i2 == 0 || i2 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i2 == 2) {
            this.f4048d = 1;
            Intrinsics.c(null);
            throw null;
        }
        if (i2 != 3) {
            throw d();
        }
        this.f4048d = 0;
        Object obj = this.f4049e;
        this.f4049e = null;
        return obj;
    }

    @Override // C2.a
    public final CoroutineContext p() {
        return kotlin.coroutines.i.f7498d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // C2.a
    public final void u(Object obj) {
        AbstractC1343r.b(obj);
        this.f4048d = 4;
    }
}
