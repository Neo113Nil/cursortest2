package l6;

import f6.InterfaceC0406a;
import h6.AbstractC0498d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements Iterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public Object f6317d;

    /* renamed from: e, reason: collision with root package name */
    public int f6318e = -2;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c6.n f6319i;

    public g(c6.n nVar) {
        this.f6319i = nVar;
    }

    public final void a() {
        Object invoke;
        if (this.f6318e == -2) {
            invoke = Integer.valueOf(AbstractC0498d.f5285d.a() + 65536);
        } else {
            c2.i iVar = (c2.i) this.f6319i.f4280b;
            Object obj = this.f6317d;
            Intrinsics.b(obj);
            invoke = iVar.invoke(obj);
        }
        this.f6317d = invoke;
        this.f6318e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6318e < 0) {
            a();
        }
        return this.f6318e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6318e < 0) {
            a();
        }
        if (this.f6318e == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f6317d;
        Intrinsics.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f6318e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
