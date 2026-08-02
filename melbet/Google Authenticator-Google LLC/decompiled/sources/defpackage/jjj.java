package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jjj extends jjk {
    final /* synthetic */ jjq a;
    private int b = 0;
    private final int c;

    public jjj(jjq jjqVar) {
        this.a = jjqVar;
        this.c = jjqVar.c();
    }

    @Override // defpackage.jjm
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.a.a(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
