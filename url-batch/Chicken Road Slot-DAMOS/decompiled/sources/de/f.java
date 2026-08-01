package de;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends g implements Iterator, ld.a, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public int f3716d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3717e;

    /* renamed from: i, reason: collision with root package name */
    public ld.a f3718i;

    @Override // de.g
    public final void a(Object obj, nd.h hVar) {
        this.f3717e = obj;
        this.f3716d = 3;
        this.f3718i = hVar;
        md.a aVar = md.a.f6622d;
    }

    public final RuntimeException b() {
        int i3 = this.f3716d;
        if (i3 == 4) {
            return new NoSuchElementException();
        }
        if (i3 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3716d);
    }

    @Override // ld.a
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f5592d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        while (true) {
            i3 = this.f3716d;
            if (i3 != 0) {
                break;
            }
            this.f3716d = 5;
            ld.a aVar = this.f3718i;
            aVar.getClass();
            this.f3718i = null;
            Unit unit = Unit.f5554a;
            hd.l lVar = hd.n.f4511e;
            aVar.resumeWith(unit);
        }
        if (i3 == 1) {
            throw null;
        }
        if (i3 == 2 || i3 == 3) {
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f3716d;
        if (i3 == 0 || i3 == 1) {
            if (hasNext()) {
                return next();
            }
            i0.c();
            return null;
        }
        if (i3 == 2) {
            this.f3716d = 1;
            throw null;
        }
        if (i3 != 3) {
            throw b();
        }
        this.f3716d = 0;
        Object obj = this.f3717e;
        this.f3717e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // ld.a
    public final void resumeWith(Object obj) {
        cf.c.M(obj);
        this.f3716d = 4;
    }
}
