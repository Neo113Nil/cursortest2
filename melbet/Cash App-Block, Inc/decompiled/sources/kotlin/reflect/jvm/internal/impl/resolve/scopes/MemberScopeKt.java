package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public final class MemberScopeKt {
    public static final Set<Name> flatMapClassifierNamesOrNull(Iterable<? extends MemberScope> iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet();
        Iterator<? extends MemberScope> it = iterable.iterator();
        while (it.hasNext()) {
            Set<Name> classifierNames = it.next().getClassifierNames();
            if (classifierNames == null) {
                return null;
            }
            CollectionsKt__MutableCollectionsKt.addAll(classifierNames, hashSet);
        }
        return hashSet;
    }
}
