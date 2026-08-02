package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hhl extends hhk {
    final /* synthetic */ hhm a;

    public hhl(hhm hhmVar) {
        this.a = hhmVar;
    }

    @Override // defpackage.hhk
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.a();
    }
}
