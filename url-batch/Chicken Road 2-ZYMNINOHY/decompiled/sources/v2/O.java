package v2;

import a.AbstractC0124a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class O implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final O f15583a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ O[] f15584b;

    static {
        O o = new O("INSTANCE", 0);
        f15583a = o;
        f15584b = new O[]{o};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f15584b.clone();
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
        AbstractC0124a.s("no calls to next() since the last call to remove()", false);
    }
}
