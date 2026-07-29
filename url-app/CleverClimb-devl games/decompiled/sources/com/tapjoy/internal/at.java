package com.tapjoy.internal;

import java.util.AbstractQueue;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class at extends AbstractQueue implements ax {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new Iterator() { // from class: com.tapjoy.internal.at.1

            /* renamed from: b, reason: collision with root package name */
            private int f7835b = 0;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f7835b < at.this.size();
            }

            @Override // java.util.Iterator
            public final Object next() {
                at atVar = at.this;
                int i = this.f7835b;
                this.f7835b = i + 1;
                return atVar.a(i);
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (this.f7835b == 1) {
                    at.this.b(1);
                    this.f7835b = 0;
                    return;
                }
                throw new UnsupportedOperationException("For the first element only");
            }
        };
    }
}
