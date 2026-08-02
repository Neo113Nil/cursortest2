package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hbd extends hbb implements ListIterator {
    final /* synthetic */ hbe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbd(hbe hbeVar, int i) {
        super(hbeVar, hbeVar.d().listIterator(i));
        this.d = hbeVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        hbe hbeVar = this.d;
        boolean isEmpty = hbeVar.isEmpty();
        b().add(obj);
        hbeVar.f.b++;
        if (isEmpty) {
            hbeVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbd(hbe hbeVar) {
        super(hbeVar);
        this.d = hbeVar;
    }
}
