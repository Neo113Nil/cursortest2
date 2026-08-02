package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fbj implements Iterator {
    private long a = 10;

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long next() {
        long j = this.a;
        this.a = j >= 30000 ? 60000L : j + j;
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return true;
    }
}
