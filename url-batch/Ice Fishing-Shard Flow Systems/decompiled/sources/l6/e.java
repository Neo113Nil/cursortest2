package l6;

import f6.InterfaceC0406a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f6310d;

    /* renamed from: e, reason: collision with root package name */
    public int f6311e = -1;

    /* renamed from: i, reason: collision with root package name */
    public Object f6312i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f6313l;

    public e(f fVar) {
        this.f6313l = fVar;
        this.f6310d = fVar.f6314a.iterator();
    }

    public final void a() {
        Object next;
        f fVar;
        do {
            Iterator it = this.f6310d;
            if (!it.hasNext()) {
                this.f6311e = 0;
                return;
            } else {
                next = it.next();
                fVar = this.f6313l;
            }
        } while (((Boolean) fVar.f6316c.invoke(next)).booleanValue() != fVar.f6315b);
        this.f6312i = next;
        this.f6311e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6311e == -1) {
            a();
        }
        return this.f6311e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6311e == -1) {
            a();
        }
        if (this.f6311e == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f6312i;
        this.f6312i = null;
        this.f6311e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
