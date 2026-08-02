package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpu extends kpw implements Iterator {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        kpy kpyVar = this.a;
        int i = this.b;
        if (i >= kpyVar.e) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        kpv kpvVar = new kpv(kpyVar, i);
        b();
        return kpvVar;
    }
}
