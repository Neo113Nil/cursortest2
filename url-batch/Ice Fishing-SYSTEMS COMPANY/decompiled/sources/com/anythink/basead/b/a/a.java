package com.anythink.basead.b.a;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a<R, E> implements e<R, E> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f5856a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f5857b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<Integer> f5858c = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private d<R, E> f5859d;

    @Override // com.anythink.basead.b.a.e
    public final void a(int i) {
        if (this.f5856a.get() || this.f5858c.contains(Integer.valueOf(i))) {
            return;
        }
        this.f5858c.add(Integer.valueOf(i));
        if (this.f5857b.decrementAndGet() == 0) {
            this.f5856a.set(true);
            d<R, E> dVar = this.f5859d;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    @Override // com.anythink.basead.b.a.e
    public final void b(int i) {
        this.f5857b.set(i);
    }

    @Override // com.anythink.basead.b.a.e
    public final void a(E e6) {
        if (this.f5856a.get()) {
            return;
        }
        this.f5856a.set(true);
        d<R, E> dVar = this.f5859d;
        if (dVar != null) {
            dVar.a(e6);
        }
    }

    @Override // com.anythink.basead.b.a.e
    public final void a(d<R, E> dVar) {
        this.f5859d = dVar;
    }
}
