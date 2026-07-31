package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
final class v53 extends t53 implements ListIterator {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ w53 f13135i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v53(w53 w53Var) {
        super(w53Var);
        this.f13135i = w53Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v53(w53 w53Var, int i7) {
        super(w53Var, ((List) w53Var.f12645g).listIterator(i7));
        this.f13135i = w53Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i7;
        boolean isEmpty = this.f13135i.isEmpty();
        a();
        ((ListIterator) this.f12096f).add(obj);
        x53 x53Var = this.f13135i.f13723k;
        i7 = x53Var.f14043j;
        x53Var.f14043j = i7 + 1;
        if (isEmpty) {
            this.f13135i.i();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f12096f).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f12096f).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f12096f).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f12096f).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f12096f).set(obj);
    }
}
