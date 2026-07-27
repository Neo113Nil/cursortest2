package z2;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: z2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1431o<E> extends AbstractC1418b implements Set<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final a f11951d = new a(null);

    @Metadata
    /* renamed from: z2.o$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set other = (Set) obj;
        f11951d.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Intrinsics.checkNotNullParameter(other, "other");
        if (size() != other.size()) {
            return false;
        }
        return containsAll(other);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        f11951d.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Iterator<E> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            E next = it.next();
            i2 += next != null ? next.hashCode() : 0;
        }
        return i2;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
