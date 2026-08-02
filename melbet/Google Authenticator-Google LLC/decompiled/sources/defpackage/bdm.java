package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bdm implements Iterable {
    public final List a;

    public bdm(List list) {
        this.a = list;
    }

    final int a() {
        return this.a.size();
    }

    final bdm b() {
        return new bdm(new ArrayList(this.a));
    }

    final boolean c() {
        return this.a.isEmpty();
    }

    final boolean d(blg blgVar) {
        return this.a.contains(new bdl(blgVar, bma.b));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
