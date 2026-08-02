package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jmc implements Iterator {
    final /* synthetic */ jme a;
    private int b = -1;

    public jmc(jme jmeVar) {
        this.a = jmeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        jme jmeVar = this.a;
        jmeVar.c();
        return this.b + 1 < jmeVar.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        jme jmeVar = this.a;
        jmeVar.c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = jmeVar.a;
        int i = this.b + 1;
        this.b = i;
        return (jmb) objArr[i];
    }
}
