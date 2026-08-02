package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzv implements Iterable {
    public final jzw a;
    public final int b;
    final /* synthetic */ kaa c;

    public jzv(kaa kaaVar, jzw jzwVar, int i) {
        this.c = kaaVar;
        this.a = jzwVar;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jzu(this);
    }
}
