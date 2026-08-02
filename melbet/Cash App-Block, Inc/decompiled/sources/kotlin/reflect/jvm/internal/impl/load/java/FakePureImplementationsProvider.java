package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

/* loaded from: classes9.dex */
public final class FakePureImplementationsProvider {
    public static final FakePureImplementationsProvider INSTANCE = new FakePureImplementationsProvider();
    public static final LinkedHashMap pureImplementationsClassIds;
    public static final Map pureImplementationsFqNames;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        pureImplementationsClassIds = linkedHashMap;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        implementedWith(standardClassIds.getMutableList(), fqNameListOf("java.util.ArrayList", "java.util.LinkedList"));
        implementedWith(standardClassIds.getMutableSet(), fqNameListOf("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        implementedWith(standardClassIds.getMutableMap(), fqNameListOf("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ClassId.Companion companion = ClassId.Companion;
        implementedWith(companion.topLevel(new FqName("java.util.function.Function")), fqNameListOf("java.util.function.UnaryOperator"));
        implementedWith(companion.topLevel(new FqName("java.util.function.BiFunction")), fqNameListOf("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((ClassId) entry.getKey()).asSingleFqName(), ((ClassId) entry.getValue()).asSingleFqName()));
        }
        pureImplementationsFqNames = MapsKt__MapsKt.toMap(arrayList);
    }

    public static ArrayList fqNameListOf(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.Companion.topLevel(new FqName(str)));
        }
        return arrayList;
    }

    public static void implementedWith(ClassId classId, ArrayList arrayList) {
        for (Object obj : arrayList) {
            pureImplementationsClassIds.put(obj, classId);
        }
    }

    public final FqName getPurelyImplementedInterface(FqName fqName) {
        fqName.getClass();
        return (FqName) pureImplementationsFqNames.get(fqName);
    }
}
