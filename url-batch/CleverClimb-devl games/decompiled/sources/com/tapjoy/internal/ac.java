package com.tapjoy.internal;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ac {
    public static Iterable a(ViewGroup viewGroup) {
        final a aVar = new a(viewGroup);
        return new Iterable() { // from class: com.tapjoy.internal.ac.1
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return aVar;
            }
        };
    }

    static class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f7800a;

        /* renamed from: b, reason: collision with root package name */
        private int f7801b;

        /* renamed from: c, reason: collision with root package name */
        private int f7802c = 0;

        public a(ViewGroup viewGroup) {
            this.f7800a = viewGroup;
            this.f7801b = viewGroup.getChildCount();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f7802c < this.f7801b;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f7800a.removeViewAt(this.f7802c - 1);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            ViewGroup viewGroup = this.f7800a;
            int i = this.f7802c;
            this.f7802c = i + 1;
            return viewGroup.getChildAt(i);
        }
    }
}
