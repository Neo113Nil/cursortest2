package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes3.dex */
public final class CompanionObjectMapping {
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();
    public static final LinkedHashSet classIds;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StandardNames.getPrimitiveFqName((PrimitiveType) it.next()));
        }
        ArrayList plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList, (Object) StandardNames.FqNames.f1525string.toSafe()), (Object) StandardNames.FqNames._boolean.toSafe()), (Object) StandardNames.FqNames._enum.toSafe());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it2 = plus.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(companion.topLevel((FqName) it2.next()));
        }
        classIds = linkedHashSet;
    }

    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        return classIds;
    }

    public final Set<ClassId> getClassIds() {
        return classIds;
    }
}
