package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gzx implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ gzz b;

    public gzx(gzz gzzVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = gzzVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.d(this.a);
    }

    public final String toString() {
        gzl gzlVar = new gzl(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        gzlVar.d(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
