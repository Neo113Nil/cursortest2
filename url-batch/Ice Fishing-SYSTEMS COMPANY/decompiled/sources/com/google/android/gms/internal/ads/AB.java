package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class AB extends C3835rB implements ListIterator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BB f23839x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AB(BB bb) {
        super(bb);
        this.f23839x = bb;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        BB bb = this.f23839x;
        boolean isEmpty = bb.isEmpty();
        a();
        ((ListIterator) this.f33983u).add(obj);
        bb.f24007y.f32552x++;
        if (isEmpty) {
            bb.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f33983u).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f33983u).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f33983u).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f33983u).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f33983u).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AB(BB bb, int i) {
        super(bb, ((List) bb.f24003u).listIterator(i));
        this.f23839x = bb;
    }
}
