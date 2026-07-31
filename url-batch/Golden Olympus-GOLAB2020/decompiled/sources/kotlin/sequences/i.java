package kotlin.sequences;

import a2.AbstractC1241b;
import i2.InterfaceC2471a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class i extends j implements Iterator, kotlin.coroutines.d, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private int f41227b;

    /* renamed from: c, reason: collision with root package name */
    private Object f41228c;

    /* renamed from: d, reason: collision with root package name */
    private Iterator f41229d;

    /* renamed from: e, reason: collision with root package name */
    private kotlin.coroutines.d f41230e;

    private final Throwable d() {
        int i4 = this.f41227b;
        if (i4 == 4) {
            return new NoSuchElementException();
        }
        if (i4 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f41227b);
    }

    private final Object e() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.j
    public Object a(Object obj, kotlin.coroutines.d dVar) {
        this.f41228c = obj;
        this.f41227b = 3;
        this.f41230e = dVar;
        Object f4 = AbstractC1241b.f();
        if (f4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return f4 == AbstractC1241b.f() ? f4 : Unit.f41027a;
    }

    @Override // kotlin.sequences.j
    public Object b(Iterator it, kotlin.coroutines.d dVar) {
        if (!it.hasNext()) {
            return Unit.f41027a;
        }
        this.f41229d = it;
        this.f41227b = 2;
        this.f41230e = dVar;
        Object f4 = AbstractC1241b.f();
        if (f4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return f4 == AbstractC1241b.f() ? f4 : Unit.f41027a;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return kotlin.coroutines.g.f41113b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i4 = this.f41227b;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2 || i4 == 3) {
                        return true;
                    }
                    if (i4 == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator it = this.f41229d;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.f41227b = 2;
                    return true;
                }
                this.f41229d = null;
            }
            this.f41227b = 5;
            kotlin.coroutines.d dVar = this.f41230e;
            Intrinsics.checkNotNull(dVar);
            this.f41230e = null;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m243constructorimpl(Unit.f41027a));
        }
    }

    public final void l(kotlin.coroutines.d dVar) {
        this.f41230e = dVar;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i4 = this.f41227b;
        if (i4 == 0 || i4 == 1) {
            return e();
        }
        if (i4 == 2) {
            this.f41227b = 1;
            Iterator it = this.f41229d;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i4 != 3) {
            throw d();
        }
        this.f41227b = 0;
        Object obj = this.f41228c;
        this.f41228c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        ResultKt.a(obj);
        this.f41227b = 4;
    }
}
