package com.tapjoy.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class ju {

    /* renamed from: a, reason: collision with root package name */
    static final jx f8478a = new jx() { // from class: com.tapjoy.internal.ju.1
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Iterator f8479b = new Iterator() { // from class: com.tapjoy.internal.ju.2
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    };

    public static Object a(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
