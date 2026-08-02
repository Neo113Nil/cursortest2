package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {
    public final LinkedHashMap components;
    public final LinkedHashMap fields;
    public final JavaClass jClass;
    public final Function1 memberFilter;
    public final TasksKt$awaitImpl$2$2 methodFilter;
    public final LinkedHashMap methods;

    public ClassDeclaredMemberIndex(JavaClass javaClass, Function1<? super JavaMember, Boolean> function1) {
        javaClass.getClass();
        function1.getClass();
        this.jClass = javaClass;
        this.memberFilter = function1;
        TasksKt$awaitImpl$2$2 tasksKt$awaitImpl$2$2 = new TasksKt$awaitImpl$2$2(this, 10);
        this.methodFilter = tasksKt$awaitImpl$2$2;
        FilteringSequence filter = SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(javaClass.getMethods()), tasksKt$awaitImpl$2$2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(filter);
        while (filteringSequence$iterator$1.hasNext()) {
            Object next = filteringSequence$iterator$1.next();
            Name name = ((JavaMethod) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.methods = linkedHashMap;
        FilteringSequence filter2 = SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(this.jClass.getFields()), this.memberFilter);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        FilteringSequence$iterator$1 filteringSequence$iterator$12 = new FilteringSequence$iterator$1(filter2);
        while (filteringSequence$iterator$12.hasNext()) {
            Object next2 = filteringSequence$iterator$12.next();
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.fields = linkedHashMap2;
        Collection<JavaRecordComponent> recordComponents = this.jClass.getRecordComponents();
        Function1 function12 = this.memberFilter;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : recordComponents) {
            if (((Boolean) function12.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            linkedHashMap3.put(((JavaRecordComponent) next3).getName(), next3);
        }
        this.components = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaField findFieldByName(Name name) {
        name.getClass();
        return (JavaField) this.fields.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Collection<JavaMethod> findMethodsByName(Name name) {
        name.getClass();
        List list = (List) this.methods.get(name);
        return list != null ? list : EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaRecordComponent findRecordComponentByName(Name name) {
        name.getClass();
        return (JavaRecordComponent) this.components.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getFieldNames() {
        FilteringSequence filter = SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(this.jClass.getFields()), this.memberFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(filter);
        while (filteringSequence$iterator$1.hasNext()) {
            linkedHashSet.add(((JavaField) filteringSequence$iterator$1.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getMethodNames() {
        FilteringSequence filter = SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(this.jClass.getMethods()), this.methodFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(filter);
        while (filteringSequence$iterator$1.hasNext()) {
            linkedHashSet.add(((JavaMethod) filteringSequence$iterator$1.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getRecordComponentNames() {
        return this.components.keySet();
    }
}
