package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class hgj implements Iterator {
    public static final hgj a;
    private static final /* synthetic */ hgj[] b;

    static {
        hgj hgjVar = new hgj();
        a = hgjVar;
        b = new hgj[]{hgjVar};
    }

    private hgj() {
    }

    public static hgj[] values() {
        return (hgj[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        hoq.I(false, "no calls to next() since the last call to remove()");
    }
}
