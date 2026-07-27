package d2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final o f6089a = new o();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }
}
