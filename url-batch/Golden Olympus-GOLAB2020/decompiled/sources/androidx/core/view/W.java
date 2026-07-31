package androidx.core.view;

import i2.InterfaceC2471a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class W implements Iterator, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f11908b;

    /* renamed from: c, reason: collision with root package name */
    private final List f11909c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private Iterator f11910d;

    public W(Iterator it, Function1 function1) {
        this.f11908b = function1;
        this.f11910d = it;
    }

    private final void a(Object obj) {
        Iterator it = (Iterator) this.f11908b.invoke(obj);
        if (it != null && it.hasNext()) {
            this.f11909c.add(this.f11910d);
            this.f11910d = it;
        } else {
            while (!this.f11910d.hasNext() && !this.f11909c.isEmpty()) {
                this.f11910d = (Iterator) CollectionsKt.last(this.f11909c);
                CollectionsKt.removeLast(this.f11909c);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11910d.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f11910d.next();
        a(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
