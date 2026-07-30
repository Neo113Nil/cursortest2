package kotlinx.coroutines.internal;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class o {
    private final Object holder;

    private /* synthetic */ o(Object obj) {
        this.holder = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ o m1282boximpl(Object obj) {
        return new o(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <E> Object m1283constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Object m1284constructorimpl$default(Object obj, int i8, kotlin.jvm.internal.o oVar) {
        if ((i8 & 1) != 0) {
            obj = null;
        }
        return m1283constructorimpl(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1285equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof o) && kotlin.jvm.internal.s.areEqual(obj, ((o) obj2).m1291unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1286equalsimpl0(Object obj, Object obj2) {
        return kotlin.jvm.internal.s.areEqual(obj, obj2);
    }

    /* renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m1287forEachReversedimpl(Object obj, f6.l lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.invoke(obj);
            return;
        }
        kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                lVar.invoke(arrayList.get(size));
            }
        }
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1288hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m1289plusFjFbRPM(Object obj, Object obj2) {
        if (obj == null) {
            return m1283constructorimpl(obj2);
        }
        if (obj instanceof ArrayList) {
            kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return m1283constructorimpl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m1283constructorimpl(arrayList);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1290toStringimpl(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m1285equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m1288hashCodeimpl(this.holder);
    }

    public String toString() {
        return m1290toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m1291unboximpl() {
        return this.holder;
    }
}
