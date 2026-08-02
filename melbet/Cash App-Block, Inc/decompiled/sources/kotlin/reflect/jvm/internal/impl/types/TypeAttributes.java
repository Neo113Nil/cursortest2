package kotlin.reflect.jvm.internal.impl.types;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap;
import kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes9.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>> {
    public static final Companion Companion = new Companion(null);
    public static final TypeAttributes Empty = new TypeAttributes(EmptyList.INSTANCE);

    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final Collection access$getIndices(Companion companion) {
            Collection values = companion.idPerType.values();
            values.getClass();
            return values;
        }

        public final TypeAttributes create(List<? extends TypeAttribute<?>> list) {
            list.getClass();
            return list.isEmpty() ? getEmpty() : new TypeAttributes(list, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int customComputeIfAbsent(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, Function1<? super String, Integer> function1) {
            int intValue;
            concurrentHashMap.getClass();
            str.getClass();
            function1.getClass();
            Integer num = concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(str);
                    if (num2 != null) {
                        intValue = num2.intValue();
                    } else {
                        Object invoke = function1.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) invoke).intValue()));
                        intValue = ((Number) invoke).intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return intValue;
        }

        public final TypeAttributes getEmpty() {
            return TypeAttributes.Empty;
        }
    }

    public TypeAttributes(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TypeAttribute typeAttribute = (TypeAttribute) it.next();
            KClass key = typeAttribute.getKey();
            key.getClass();
            String qualifiedName = key.getQualifiedName();
            qualifiedName.getClass();
            int id = getTypeRegistry().getId(qualifiedName);
            int size = this.arrayMap.getSize();
            if (size != 0) {
                if (size == 1) {
                    ArrayMap arrayMap = this.arrayMap;
                    try {
                        arrayMap.getClass();
                        OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap;
                        if (oneElementArrayMap.getIndex() == id) {
                            this.arrayMap = new OneElementArrayMap(typeAttribute, id);
                        } else {
                            ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                            arrayMapImpl.set(oneElementArrayMap.getIndex(), oneElementArrayMap.getValue());
                            this.arrayMap = arrayMapImpl;
                        }
                    } catch (ClassCastException e) {
                        a$$ExternalSyntheticBUOutline0.m(buildDiagnosticMessage(arrayMap, 1, "OneElementArrayMap"), e);
                        throw null;
                    }
                }
                this.arrayMap.set(id, typeAttribute);
            } else {
                ArrayMap arrayMap2 = this.arrayMap;
                if (!(arrayMap2 instanceof EmptyArrayMap)) {
                    a$$ExternalSyntheticBUOutline0.m$1(buildDiagnosticMessage(arrayMap2, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.arrayMap = new OneElementArrayMap(typeAttribute, id);
            }
        }
    }

    public final TypeAttributes add(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        if (isEmpty() && typeAttributes.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.access$getIndices(Companion).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            TypeAttribute typeAttribute = (TypeAttribute) this.arrayMap.get(intValue);
            TypeAttribute typeAttribute2 = (TypeAttribute) typeAttributes.arrayMap.get(intValue);
            CollectionsKt.addIfNotNull(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.add(typeAttribute) : null : typeAttribute.add(typeAttribute2));
        }
        return Companion.create(arrayList);
    }

    public final boolean contains(TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        return this.arrayMap.get(Companion.getId(typeAttribute.getKey())) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final Companion getTypeRegistry() {
        return Companion;
    }

    public final TypeAttributes intersect(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        if (isEmpty() && typeAttributes.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.access$getIndices(Companion).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            TypeAttribute typeAttribute = (TypeAttribute) this.arrayMap.get(intValue);
            TypeAttribute typeAttribute2 = (TypeAttribute) typeAttributes.arrayMap.get(intValue);
            CollectionsKt.addIfNotNull(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.intersect(typeAttribute) : null : typeAttribute.intersect(typeAttribute2));
        }
        return Companion.create(arrayList);
    }

    public final TypeAttributes plus(TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        if (contains(typeAttribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(CollectionsKt__CollectionsJVMKt.listOf(typeAttribute));
        }
        return Companion.create(kotlin.collections.CollectionsKt.plus((Collection) kotlin.collections.CollectionsKt.toList(this), (Object) typeAttribute));
    }

    public final TypeAttributes remove(TypeAttribute<?> typeAttribute) {
        typeAttribute.getClass();
        if (!isEmpty()) {
            ArrayMap arrayMap = this.arrayMap;
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayMap) {
                if (!Intrinsics.areEqual((TypeAttribute) obj, typeAttribute)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != this.arrayMap.getSize()) {
                return Companion.create(arrayList);
            }
        }
        return this;
    }

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
