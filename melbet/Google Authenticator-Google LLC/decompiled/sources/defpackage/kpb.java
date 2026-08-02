package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kpb extends kpa implements ListIterator {
    final /* synthetic */ kpd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpb(kpd kpdVar, int i) {
        super(kpdVar);
        this.c = kpdVar;
        ixc.U(i, kpdVar.a());
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a.h();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        kpd kpdVar = this.c;
        int i = this.a - 1;
        this.a = i;
        return kpdVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a.h();
    }
}
