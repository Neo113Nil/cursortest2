package kotlin.reflect.jvm.internal.impl.load.java;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public final class BuiltinSpecialProperties {
    public static final LinkedHashMap GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP;
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();
    public static final Map PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    public static final Set SPECIAL_FQ_NAMES;
    public static final Set SPECIAL_SHORT_NAMES;

    static {
        FqName m;
        FqName m2;
        FqName m3;
        FqName m4;
        FqName m5;
        FqName m6;
        FqName m7;
        FqName m8;
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        Pair pair = new Pair(BuiltinSpecialPropertiesKt.access$childSafe(fqNameUnsafe, "name"), StandardNames.NAME);
        Pair pair2 = new Pair(BuiltinSpecialPropertiesKt.access$childSafe(fqNameUnsafe, "ordinal"), Name.identifier("ordinal"));
        m = BalanceFeedKt$$ExternalSyntheticOutline0.m("size", StandardNames.FqNames.collection);
        Pair pair3 = new Pair(m, Name.identifier("size"));
        FqName fqName = StandardNames.FqNames.map;
        m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m("size", fqName);
        Pair pair4 = new Pair(m2, Name.identifier("size"));
        Pair pair5 = new Pair(BuiltinSpecialPropertiesKt.access$childSafe(StandardNames.FqNames.charSequence, "length"), Name.identifier("length"));
        m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m("keys", fqName);
        Pair pair6 = new Pair(m3, Name.identifier("keySet"));
        m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m("values", fqName);
        Pair pair7 = new Pair(m4, Name.identifier("values"));
        m5 = BalanceFeedKt$$ExternalSyntheticOutline0.m("entries", fqName);
        Pair pair8 = new Pair(m5, Name.identifier("entrySet"));
        m6 = BalanceFeedKt$$ExternalSyntheticOutline0.m("size", StandardNames.FqNames.atomicIntArray);
        Pair pair9 = new Pair(m6, Name.identifier("length"));
        m7 = BalanceFeedKt$$ExternalSyntheticOutline0.m("size", StandardNames.FqNames.atomicLongArray);
        Pair pair10 = new Pair(m7, Name.identifier("length"));
        m8 = BalanceFeedKt$$ExternalSyntheticOutline0.m("size", StandardNames.FqNames.atomicArray);
        Map mapOf = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair(m8, Name.identifier("length")));
        PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP = mapOf;
        Set<Map.Entry> entrySet = mapOf.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair11 = (Pair) it.next();
            Name name = (Name) pair11.second;
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add((Name) pair11.first);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.distinct((Iterable) entry2.getValue()));
        }
        GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP = linkedHashMap2;
        Map map = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            ClassId mapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(((FqName) entry3.getKey()).parent().toUnsafe());
            mapKotlinToJava.getClass();
            linkedHashSet.add(mapKotlinToJava.asSingleFqName().child((Name) entry3.getValue()));
        }
        Set keySet = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.keySet();
        SPECIAL_FQ_NAMES = keySet;
        Set set = keySet;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FqName) it2.next()).shortName());
        }
        SPECIAL_SHORT_NAMES = CollectionsKt.toSet(arrayList2);
    }

    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    }

    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(Name name) {
        name.getClass();
        List<Name> list = (List) GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP.get(name);
        return list == null ? EmptyList.INSTANCE : list;
    }

    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return SPECIAL_FQ_NAMES;
    }

    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return SPECIAL_SHORT_NAMES;
    }
}
