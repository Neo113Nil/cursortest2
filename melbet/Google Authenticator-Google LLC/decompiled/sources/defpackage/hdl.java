package defpackage;

import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hdl extends hdc implements Queue {
    protected hdl() {
    }

    @Override // defpackage.hdc
    protected /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    protected abstract Queue b();

    @Override // java.util.Queue
    public final Object element() {
        return b().element();
    }

    public boolean offer(Object obj) {
        return b().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return b().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return b().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return b().remove();
    }
}
