package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes9.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(DeserializedMemberScope.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0), new PropertyReference1Impl(DeserializedMemberScope.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};
    public final DeserializationContext c;
    public final NotNullLazyValue classNames$delegate;
    public final NullableLazyValue classifierNamesLazy$delegate;
    public final Implementation impl;

    public interface Implementation {
        void addFunctionsAndPropertiesTo(ArrayList arrayList, DescriptorKindFilter descriptorKindFilter, Function1 function1, LookupLocation lookupLocation);

        Collection getContributedFunctions(Name name, LookupLocation lookupLocation);

        Collection getContributedVariables(Name name, LookupLocation lookupLocation);

        Set getFunctionNames();

        TypeAliasDescriptor getTypeAliasByName(Name name);

        Set getTypeAliasNames();

        Set getVariableNames();
    }

    public final class NoReorderImplementation implements Implementation {
        public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(NoReorderImplementation.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0), new PropertyReference1Impl(NoReorderImplementation.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0), new PropertyReference1Impl(NoReorderImplementation.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0), new PropertyReference1Impl(NoReorderImplementation.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0), new PropertyReference1Impl(NoReorderImplementation.class, "allProperties", "getAllProperties()Ljava/util/List;", 0), new PropertyReference1Impl(NoReorderImplementation.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0), new PropertyReference1Impl(NoReorderImplementation.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0), new PropertyReference1Impl(NoReorderImplementation.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0), new PropertyReference1Impl(NoReorderImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new PropertyReference1Impl(NoReorderImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};
        public final NotNullLazyValue allFunctions$delegate;
        public final NotNullLazyValue allProperties$delegate;
        public final NotNullLazyValue allTypeAliases$delegate;
        public final NotNullLazyValue declaredFunctions$delegate;
        public final NotNullLazyValue declaredProperties$delegate;
        public final List functionList;
        public final NotNullLazyValue functionNames$delegate;
        public final NotNullLazyValue functionsByName$delegate;
        public final NotNullLazyValue propertiesByName$delegate;
        public final List propertyList;
        public final /* synthetic */ DeserializedMemberScope this$0;
        public final List typeAliasList;
        public final NotNullLazyValue typeAliasesByName$delegate;
        public final NotNullLazyValue variableNames$delegate;

        public NoReorderImplementation(final DeserializedMemberScope deserializedMemberScope, List list, List list2, List list3) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.this$0 = deserializedMemberScope;
            this.functionList = list;
            this.propertyList = list2;
            this.typeAliasList = deserializedMemberScope.getC().getComponents().getConfiguration().getTypeAliasesAllowed() ? list3 : EmptyList.INSTANCE;
            final int i = 0;
            this.declaredFunctions$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$0
                public final DeserializedMemberScope.NoReorderImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.arg$0;
                    switch (i2) {
                        case 0:
                            List list4 = noReorderImplementation.functionList;
                            DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                SimpleFunctionDescriptor loadFunction = deserializedMemberScope2.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                                if (!deserializedMemberScope2.isDeclaredFunctionAvailable(loadFunction)) {
                                    loadFunction = null;
                                }
                                if (loadFunction != null) {
                                    arrayList.add(loadFunction);
                                }
                            }
                            return arrayList;
                        case 1:
                            List list5 = noReorderImplementation.propertyList;
                            DeserializedMemberScope deserializedMemberScope3 = noReorderImplementation.this$0;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(deserializedMemberScope3.getC().getMemberDeserializer(), (ProtoBuf.Property) ((MessageLite) it2.next()), false, 2, null);
                                if (loadProperty$default != null) {
                                    arrayList2.add(loadProperty$default);
                                }
                            }
                            return arrayList2;
                        case 2:
                            List list6 = noReorderImplementation.typeAliasList;
                            DeserializedMemberScope deserializedMemberScope4 = noReorderImplementation.this$0;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = list6.iterator();
                            while (it3.hasNext()) {
                                TypeAliasDescriptor loadTypeAlias = deserializedMemberScope4.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it3.next()));
                                if (loadTypeAlias != null) {
                                    arrayList3.add(loadTypeAlias);
                                }
                            }
                            return arrayList3;
                        case 3:
                            NotNullLazyValue notNullLazyValue = noReorderImplementation.declaredFunctions$delegate;
                            List list7 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                            DeserializedMemberScope deserializedMemberScope5 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredFunctionNames = deserializedMemberScope5.getNonDeclaredFunctionNames();
                            ArrayList arrayList4 = new ArrayList();
                            for (Name name : nonDeclaredFunctionNames) {
                                List list8 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj : list8) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                                        arrayList5.add(obj);
                                    }
                                }
                                int size = arrayList5.size();
                                deserializedMemberScope5.computeNonDeclaredFunctions(name, arrayList5);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList5.subList(size, arrayList5.size()), arrayList4);
                            }
                            return CollectionsKt.plus((Iterable) arrayList4, (Collection) list7);
                        case 4:
                            NotNullLazyValue notNullLazyValue2 = noReorderImplementation.declaredProperties$delegate;
                            List list9 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                            DeserializedMemberScope deserializedMemberScope6 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredVariableNames = deserializedMemberScope6.getNonDeclaredVariableNames();
                            ArrayList arrayList6 = new ArrayList();
                            for (Name name2 : nonDeclaredVariableNames) {
                                List list10 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj2 : list10) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj2).getName(), name2)) {
                                        arrayList7.add(obj2);
                                    }
                                }
                                int size2 = arrayList7.size();
                                deserializedMemberScope6.computeNonDeclaredProperties$1(name2, arrayList7);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList7.subList(size2, arrayList7.size()), arrayList6);
                            }
                            return CollectionsKt.plus((Iterable) arrayList6, (Collection) list9);
                        case 5:
                            List list11 = (List) StorageKt.getValue(noReorderImplementation.allTypeAliases$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[2]);
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj3 : list11) {
                                Name name3 = ((TypeAliasDescriptor) obj3).getName();
                                name3.getClass();
                                linkedHashMap.put(name3, obj3);
                            }
                            return linkedHashMap;
                        case 6:
                            List list12 = (List) StorageKt.getValue(noReorderImplementation.allFunctions$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[3]);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj4 : list12) {
                                Name name4 = ((SimpleFunctionDescriptor) obj4).getName();
                                name4.getClass();
                                Object obj5 = linkedHashMap2.get(name4);
                                if (obj5 == null) {
                                    obj5 = new ArrayList();
                                    linkedHashMap2.put(name4, obj5);
                                }
                                ((List) obj5).add(obj4);
                            }
                            return linkedHashMap2;
                        default:
                            List list13 = (List) StorageKt.getValue(noReorderImplementation.allProperties$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[4]);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj6 : list13) {
                                Name name5 = ((PropertyDescriptor) obj6).getName();
                                name5.getClass();
                                Object obj7 = linkedHashMap3.get(name5);
                                if (obj7 == null) {
                                    obj7 = new ArrayList();
                                    linkedHashMap3.put(name5, obj7);
                                }
                                ((List) obj7).add(obj6);
                            }
                            return linkedHashMap3;
                    }
                }
            });
            final int i2 = 1;
            this.declaredProperties$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$0
                public final DeserializedMemberScope.NoReorderImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.arg$0;
                    switch (i22) {
                        case 0:
                            List list4 = noReorderImplementation.functionList;
                            DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                SimpleFunctionDescriptor loadFunction = deserializedMemberScope2.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                                if (!deserializedMemberScope2.isDeclaredFunctionAvailable(loadFunction)) {
                                    loadFunction = null;
                                }
                                if (loadFunction != null) {
                                    arrayList.add(loadFunction);
                                }
                            }
                            return arrayList;
                        case 1:
                            List list5 = noReorderImplementation.propertyList;
                            DeserializedMemberScope deserializedMemberScope3 = noReorderImplementation.this$0;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(deserializedMemberScope3.getC().getMemberDeserializer(), (ProtoBuf.Property) ((MessageLite) it2.next()), false, 2, null);
                                if (loadProperty$default != null) {
                                    arrayList2.add(loadProperty$default);
                                }
                            }
                            return arrayList2;
                        case 2:
                            List list6 = noReorderImplementation.typeAliasList;
                            DeserializedMemberScope deserializedMemberScope4 = noReorderImplementation.this$0;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = list6.iterator();
                            while (it3.hasNext()) {
                                TypeAliasDescriptor loadTypeAlias = deserializedMemberScope4.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it3.next()));
                                if (loadTypeAlias != null) {
                                    arrayList3.add(loadTypeAlias);
                                }
                            }
                            return arrayList3;
                        case 3:
                            NotNullLazyValue notNullLazyValue = noReorderImplementation.declaredFunctions$delegate;
                            List list7 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                            DeserializedMemberScope deserializedMemberScope5 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredFunctionNames = deserializedMemberScope5.getNonDeclaredFunctionNames();
                            ArrayList arrayList4 = new ArrayList();
                            for (Name name : nonDeclaredFunctionNames) {
                                List list8 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj : list8) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                                        arrayList5.add(obj);
                                    }
                                }
                                int size = arrayList5.size();
                                deserializedMemberScope5.computeNonDeclaredFunctions(name, arrayList5);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList5.subList(size, arrayList5.size()), arrayList4);
                            }
                            return CollectionsKt.plus((Iterable) arrayList4, (Collection) list7);
                        case 4:
                            NotNullLazyValue notNullLazyValue2 = noReorderImplementation.declaredProperties$delegate;
                            List list9 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                            DeserializedMemberScope deserializedMemberScope6 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredVariableNames = deserializedMemberScope6.getNonDeclaredVariableNames();
                            ArrayList arrayList6 = new ArrayList();
                            for (Name name2 : nonDeclaredVariableNames) {
                                List list10 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj2 : list10) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj2).getName(), name2)) {
                                        arrayList7.add(obj2);
                                    }
                                }
                                int size2 = arrayList7.size();
                                deserializedMemberScope6.computeNonDeclaredProperties$1(name2, arrayList7);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList7.subList(size2, arrayList7.size()), arrayList6);
                            }
                            return CollectionsKt.plus((Iterable) arrayList6, (Collection) list9);
                        case 5:
                            List list11 = (List) StorageKt.getValue(noReorderImplementation.allTypeAliases$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[2]);
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj3 : list11) {
                                Name name3 = ((TypeAliasDescriptor) obj3).getName();
                                name3.getClass();
                                linkedHashMap.put(name3, obj3);
                            }
                            return linkedHashMap;
                        case 6:
                            List list12 = (List) StorageKt.getValue(noReorderImplementation.allFunctions$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[3]);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj4 : list12) {
                                Name name4 = ((SimpleFunctionDescriptor) obj4).getName();
                                name4.getClass();
                                Object obj5 = linkedHashMap2.get(name4);
                                if (obj5 == null) {
                                    obj5 = new ArrayList();
                                    linkedHashMap2.put(name4, obj5);
                                }
                                ((List) obj5).add(obj4);
                            }
                            return linkedHashMap2;
                        default:
                            List list13 = (List) StorageKt.getValue(noReorderImplementation.allProperties$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[4]);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj6 : list13) {
                                Name name5 = ((PropertyDescriptor) obj6).getName();
                                name5.getClass();
                                Object obj7 = linkedHashMap3.get(name5);
                                if (obj7 == null) {
                                    obj7 = new ArrayList();
                                    linkedHashMap3.put(name5, obj7);
                                }
                                ((List) obj7).add(obj6);
                            }
                            return linkedHashMap3;
                    }
                }
            });
            final int i3 = 2;
            this.allTypeAliases$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$0
                public final DeserializedMemberScope.NoReorderImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i3;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.arg$0;
                    switch (i22) {
                        case 0:
                            List list4 = noReorderImplementation.functionList;
                            DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                SimpleFunctionDescriptor loadFunction = deserializedMemberScope2.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                                if (!deserializedMemberScope2.isDeclaredFunctionAvailable(loadFunction)) {
                                    loadFunction = null;
                                }
                                if (loadFunction != null) {
                                    arrayList.add(loadFunction);
                                }
                            }
                            return arrayList;
                        case 1:
                            List list5 = noReorderImplementation.propertyList;
                            DeserializedMemberScope deserializedMemberScope3 = noReorderImplementation.this$0;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(deserializedMemberScope3.getC().getMemberDeserializer(), (ProtoBuf.Property) ((MessageLite) it2.next()), false, 2, null);
                                if (loadProperty$default != null) {
                                    arrayList2.add(loadProperty$default);
                                }
                            }
                            return arrayList2;
                        case 2:
                            List list6 = noReorderImplementation.typeAliasList;
                            DeserializedMemberScope deserializedMemberScope4 = noReorderImplementation.this$0;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = list6.iterator();
                            while (it3.hasNext()) {
                                TypeAliasDescriptor loadTypeAlias = deserializedMemberScope4.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it3.next()));
                                if (loadTypeAlias != null) {
                                    arrayList3.add(loadTypeAlias);
                                }
                            }
                            return arrayList3;
                        case 3:
                            NotNullLazyValue notNullLazyValue = noReorderImplementation.declaredFunctions$delegate;
                            List list7 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                            DeserializedMemberScope deserializedMemberScope5 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredFunctionNames = deserializedMemberScope5.getNonDeclaredFunctionNames();
                            ArrayList arrayList4 = new ArrayList();
                            for (Name name : nonDeclaredFunctionNames) {
                                List list8 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj : list8) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                                        arrayList5.add(obj);
                                    }
                                }
                                int size = arrayList5.size();
                                deserializedMemberScope5.computeNonDeclaredFunctions(name, arrayList5);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList5.subList(size, arrayList5.size()), arrayList4);
                            }
                            return CollectionsKt.plus((Iterable) arrayList4, (Collection) list7);
                        case 4:
                            NotNullLazyValue notNullLazyValue2 = noReorderImplementation.declaredProperties$delegate;
                            List list9 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                            DeserializedMemberScope deserializedMemberScope6 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredVariableNames = deserializedMemberScope6.getNonDeclaredVariableNames();
                            ArrayList arrayList6 = new ArrayList();
                            for (Name name2 : nonDeclaredVariableNames) {
                                List list10 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj2 : list10) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj2).getName(), name2)) {
                                        arrayList7.add(obj2);
                                    }
                                }
                                int size2 = arrayList7.size();
                                deserializedMemberScope6.computeNonDeclaredProperties$1(name2, arrayList7);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList7.subList(size2, arrayList7.size()), arrayList6);
                            }
                            return CollectionsKt.plus((Iterable) arrayList6, (Collection) list9);
                        case 5:
                            List list11 = (List) StorageKt.getValue(noReorderImplementation.allTypeAliases$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[2]);
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj3 : list11) {
                                Name name3 = ((TypeAliasDescriptor) obj3).getName();
                                name3.getClass();
                                linkedHashMap.put(name3, obj3);
                            }
                            return linkedHashMap;
                        case 6:
                            List list12 = (List) StorageKt.getValue(noReorderImplementation.allFunctions$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[3]);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj4 : list12) {
                                Name name4 = ((SimpleFunctionDescriptor) obj4).getName();
                                name4.getClass();
                                Object obj5 = linkedHashMap2.get(name4);
                                if (obj5 == null) {
                                    obj5 = new ArrayList();
                                    linkedHashMap2.put(name4, obj5);
                                }
                                ((List) obj5).add(obj4);
                            }
                            return linkedHashMap2;
                        default:
                            List list13 = (List) StorageKt.getValue(noReorderImplementation.allProperties$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[4]);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj6 : list13) {
                                Name name5 = ((PropertyDescriptor) obj6).getName();
                                name5.getClass();
                                Object obj7 = linkedHashMap3.get(name5);
                                if (obj7 == null) {
                                    obj7 = new ArrayList();
                                    linkedHashMap3.put(name5, obj7);
                                }
                                ((List) obj7).add(obj6);
                            }
                            return linkedHashMap3;
                    }
                }
            });
            final int i4 = 3;
            this.allFunctions$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$0
                public final DeserializedMemberScope.NoReorderImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i4;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.arg$0;
                    switch (i22) {
                        case 0:
                            List list4 = noReorderImplementation.functionList;
                            DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                SimpleFunctionDescriptor loadFunction = deserializedMemberScope2.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                                if (!deserializedMemberScope2.isDeclaredFunctionAvailable(loadFunction)) {
                                    loadFunction = null;
                                }
                                if (loadFunction != null) {
                                    arrayList.add(loadFunction);
                                }
                            }
                            return arrayList;
                        case 1:
                            List list5 = noReorderImplementation.propertyList;
                            DeserializedMemberScope deserializedMemberScope3 = noReorderImplementation.this$0;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(deserializedMemberScope3.getC().getMemberDeserializer(), (ProtoBuf.Property) ((MessageLite) it2.next()), false, 2, null);
                                if (loadProperty$default != null) {
                                    arrayList2.add(loadProperty$default);
                                }
                            }
                            return arrayList2;
                        case 2:
                            List list6 = noReorderImplementation.typeAliasList;
                            DeserializedMemberScope deserializedMemberScope4 = noReorderImplementation.this$0;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = list6.iterator();
                            while (it3.hasNext()) {
                                TypeAliasDescriptor loadTypeAlias = deserializedMemberScope4.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it3.next()));
                                if (loadTypeAlias != null) {
                                    arrayList3.add(loadTypeAlias);
                                }
                            }
                            return arrayList3;
                        case 3:
                            NotNullLazyValue notNullLazyValue = noReorderImplementation.declaredFunctions$delegate;
                            List list7 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                            DeserializedMemberScope deserializedMemberScope5 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredFunctionNames = deserializedMemberScope5.getNonDeclaredFunctionNames();
                            ArrayList arrayList4 = new ArrayList();
                            for (Name name : nonDeclaredFunctionNames) {
                                List list8 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj : list8) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                                        arrayList5.add(obj);
                                    }
                                }
                                int size = arrayList5.size();
                                deserializedMemberScope5.computeNonDeclaredFunctions(name, arrayList5);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList5.subList(size, arrayList5.size()), arrayList4);
                            }
                            return CollectionsKt.plus((Iterable) arrayList4, (Collection) list7);
                        case 4:
                            NotNullLazyValue notNullLazyValue2 = noReorderImplementation.declaredProperties$delegate;
                            List list9 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                            DeserializedMemberScope deserializedMemberScope6 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredVariableNames = deserializedMemberScope6.getNonDeclaredVariableNames();
                            ArrayList arrayList6 = new ArrayList();
                            for (Name name2 : nonDeclaredVariableNames) {
                                List list10 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj2 : list10) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj2).getName(), name2)) {
                                        arrayList7.add(obj2);
                                    }
                                }
                                int size2 = arrayList7.size();
                                deserializedMemberScope6.computeNonDeclaredProperties$1(name2, arrayList7);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList7.subList(size2, arrayList7.size()), arrayList6);
                            }
                            return CollectionsKt.plus((Iterable) arrayList6, (Collection) list9);
                        case 5:
                            List list11 = (List) StorageKt.getValue(noReorderImplementation.allTypeAliases$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[2]);
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj3 : list11) {
                                Name name3 = ((TypeAliasDescriptor) obj3).getName();
                                name3.getClass();
                                linkedHashMap.put(name3, obj3);
                            }
                            return linkedHashMap;
                        case 6:
                            List list12 = (List) StorageKt.getValue(noReorderImplementation.allFunctions$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[3]);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj4 : list12) {
                                Name name4 = ((SimpleFunctionDescriptor) obj4).getName();
                                name4.getClass();
                                Object obj5 = linkedHashMap2.get(name4);
                                if (obj5 == null) {
                                    obj5 = new ArrayList();
                                    linkedHashMap2.put(name4, obj5);
                                }
                                ((List) obj5).add(obj4);
                            }
                            return linkedHashMap2;
                        default:
                            List list13 = (List) StorageKt.getValue(noReorderImplementation.allProperties$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[4]);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj6 : list13) {
                                Name name5 = ((PropertyDescriptor) obj6).getName();
                                name5.getClass();
                                Object obj7 = linkedHashMap3.get(name5);
                                if (obj7 == null) {
                                    obj7 = new ArrayList();
                                    linkedHashMap3.put(name5, obj7);
                                }
                                ((List) obj7).add(obj6);
                            }
                            return linkedHashMap3;
                    }
                }
            });
            final int i5 = 4;
            this.allProperties$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$0
                public final DeserializedMemberScope.NoReorderImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i5;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.arg$0;
                    switch (i22) {
                        case 0:
                            List list4 = noReorderImplementation.functionList;
                            DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                SimpleFunctionDescriptor loadFunction = deserializedMemberScope2.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                                if (!deserializedMemberScope2.isDeclaredFunctionAvailable(loadFunction)) {
                                    loadFunction = null;
                                }
                                if (loadFunction != null) {
                                    arrayList.add(loadFunction);
                                }
                            }
                            return arrayList;
                        case 1:
                            List list5 = noReorderImplementation.propertyList;
                            DeserializedMemberScope deserializedMemberScope3 = noReorderImplementation.this$0;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(deserializedMemberScope3.getC().getMemberDeserializer(), (ProtoBuf.Property) ((MessageLite) it2.next()), false, 2, null);
                                if (loadProperty$default != null) {
                                    arrayList2.add(loadProperty$default);
                                }
                            }
                            return arrayList2;
                        case 2:
                            List list6 = noReorderImplementation.typeAliasList;
                            DeserializedMemberScope deserializedMemberScope4 = noReorderImplementation.this$0;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = list6.iterator();
                            while (it3.hasNext()) {
                                TypeAliasDescriptor loadTypeAlias = deserializedMemberScope4.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it3.next()));
                                if (loadTypeAlias != null) {
                                    arrayList3.add(loadTypeAlias);
                                }
                            }
                            return arrayList3;
                        case 3:
                            NotNullLazyValue notNullLazyValue = noReorderImplementation.declaredFunctions$delegate;
                            List list7 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                            DeserializedMemberScope deserializedMemberScope5 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredFunctionNames = deserializedMemberScope5.getNonDeclaredFunctionNames();
                            ArrayList arrayList4 = new ArrayList();
                            for (Name name : nonDeclaredFunctionNames) {
                                List list8 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj : list8) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                                        arrayList5.add(obj);
                                    }
                                }
                                int size = arrayList5.size();
                                deserializedMemberScope5.computeNonDeclaredFunctions(name, arrayList5);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList5.subList(size, arrayList5.size()), arrayList4);
                            }
                            return CollectionsKt.plus((Iterable) arrayList4, (Collection) list7);
                        case 4:
                            NotNullLazyValue notNullLazyValue2 = noReorderImplementation.declaredProperties$delegate;
                            List list9 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                            DeserializedMemberScope deserializedMemberScope6 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredVariableNames = deserializedMemberScope6.getNonDeclaredVariableNames();
                            ArrayList arrayList6 = new ArrayList();
                            for (Name name2 : nonDeclaredVariableNames) {
                                List list10 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj2 : list10) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj2).getName(), name2)) {
                                        arrayList7.add(obj2);
                                    }
                                }
                                int size2 = arrayList7.size();
                                deserializedMemberScope6.computeNonDeclaredProperties$1(name2, arrayList7);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList7.subList(size2, arrayList7.size()), arrayList6);
                            }
                            return CollectionsKt.plus((Iterable) arrayList6, (Collection) list9);
                        case 5:
                            List list11 = (List) StorageKt.getValue(noReorderImplementation.allTypeAliases$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[2]);
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj3 : list11) {
                                Name name3 = ((TypeAliasDescriptor) obj3).getName();
                                name3.getClass();
                                linkedHashMap.put(name3, obj3);
                            }
                            return linkedHashMap;
                        case 6:
                            List list12 = (List) StorageKt.getValue(noReorderImplementation.allFunctions$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[3]);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj4 : list12) {
                                Name name4 = ((SimpleFunctionDescriptor) obj4).getName();
                                name4.getClass();
                                Object obj5 = linkedHashMap2.get(name4);
                                if (obj5 == null) {
                                    obj5 = new ArrayList();
                                    linkedHashMap2.put(name4, obj5);
                                }
                                ((List) obj5).add(obj4);
                            }
                            return linkedHashMap2;
                        default:
                            List list13 = (List) StorageKt.getValue(noReorderImplementation.allProperties$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[4]);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj6 : list13) {
                                Name name5 = ((PropertyDescriptor) obj6).getName();
                                name5.getClass();
                                Object obj7 = linkedHashMap3.get(name5);
                                if (obj7 == null) {
                                    obj7 = new ArrayList();
                                    linkedHashMap3.put(name5, obj7);
                                }
                                ((List) obj7).add(obj6);
                            }
                            return linkedHashMap3;
                    }
                }
            });
            final int i6 = 5;
            this.typeAliasesByName$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$0
                public final DeserializedMemberScope.NoReorderImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i6;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.arg$0;
                    switch (i22) {
                        case 0:
                            List list4 = noReorderImplementation.functionList;
                            DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                SimpleFunctionDescriptor loadFunction = deserializedMemberScope2.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                                if (!deserializedMemberScope2.isDeclaredFunctionAvailable(loadFunction)) {
                                    loadFunction = null;
                                }
                                if (loadFunction != null) {
                                    arrayList.add(loadFunction);
                                }
                            }
                            return arrayList;
                        case 1:
                            List list5 = noReorderImplementation.propertyList;
                            DeserializedMemberScope deserializedMemberScope3 = noReorderImplementation.this$0;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(deserializedMemberScope3.getC().getMemberDeserializer(), (ProtoBuf.Property) ((MessageLite) it2.next()), false, 2, null);
                                if (loadProperty$default != null) {
                                    arrayList2.add(loadProperty$default);
                                }
                            }
                            return arrayList2;
                        case 2:
                            List list6 = noReorderImplementation.typeAliasList;
                            DeserializedMemberScope deserializedMemberScope4 = noReorderImplementation.this$0;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = list6.iterator();
                            while (it3.hasNext()) {
                                TypeAliasDescriptor loadTypeAlias = deserializedMemberScope4.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it3.next()));
                                if (loadTypeAlias != null) {
                                    arrayList3.add(loadTypeAlias);
                                }
                            }
                            return arrayList3;
                        case 3:
                            NotNullLazyValue notNullLazyValue = noReorderImplementation.declaredFunctions$delegate;
                            List list7 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                            DeserializedMemberScope deserializedMemberScope5 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredFunctionNames = deserializedMemberScope5.getNonDeclaredFunctionNames();
                            ArrayList arrayList4 = new ArrayList();
                            for (Name name : nonDeclaredFunctionNames) {
                                List list8 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj : list8) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                                        arrayList5.add(obj);
                                    }
                                }
                                int size = arrayList5.size();
                                deserializedMemberScope5.computeNonDeclaredFunctions(name, arrayList5);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList5.subList(size, arrayList5.size()), arrayList4);
                            }
                            return CollectionsKt.plus((Iterable) arrayList4, (Collection) list7);
                        case 4:
                            NotNullLazyValue notNullLazyValue2 = noReorderImplementation.declaredProperties$delegate;
                            List list9 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                            DeserializedMemberScope deserializedMemberScope6 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredVariableNames = deserializedMemberScope6.getNonDeclaredVariableNames();
                            ArrayList arrayList6 = new ArrayList();
                            for (Name name2 : nonDeclaredVariableNames) {
                                List list10 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj2 : list10) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj2).getName(), name2)) {
                                        arrayList7.add(obj2);
                                    }
                                }
                                int size2 = arrayList7.size();
                                deserializedMemberScope6.computeNonDeclaredProperties$1(name2, arrayList7);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList7.subList(size2, arrayList7.size()), arrayList6);
                            }
                            return CollectionsKt.plus((Iterable) arrayList6, (Collection) list9);
                        case 5:
                            List list11 = (List) StorageKt.getValue(noReorderImplementation.allTypeAliases$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[2]);
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj3 : list11) {
                                Name name3 = ((TypeAliasDescriptor) obj3).getName();
                                name3.getClass();
                                linkedHashMap.put(name3, obj3);
                            }
                            return linkedHashMap;
                        case 6:
                            List list12 = (List) StorageKt.getValue(noReorderImplementation.allFunctions$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[3]);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj4 : list12) {
                                Name name4 = ((SimpleFunctionDescriptor) obj4).getName();
                                name4.getClass();
                                Object obj5 = linkedHashMap2.get(name4);
                                if (obj5 == null) {
                                    obj5 = new ArrayList();
                                    linkedHashMap2.put(name4, obj5);
                                }
                                ((List) obj5).add(obj4);
                            }
                            return linkedHashMap2;
                        default:
                            List list13 = (List) StorageKt.getValue(noReorderImplementation.allProperties$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[4]);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj6 : list13) {
                                Name name5 = ((PropertyDescriptor) obj6).getName();
                                name5.getClass();
                                Object obj7 = linkedHashMap3.get(name5);
                                if (obj7 == null) {
                                    obj7 = new ArrayList();
                                    linkedHashMap3.put(name5, obj7);
                                }
                                ((List) obj7).add(obj6);
                            }
                            return linkedHashMap3;
                    }
                }
            });
            final int i7 = 6;
            this.functionsByName$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$0
                public final DeserializedMemberScope.NoReorderImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i7;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.arg$0;
                    switch (i22) {
                        case 0:
                            List list4 = noReorderImplementation.functionList;
                            DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                SimpleFunctionDescriptor loadFunction = deserializedMemberScope2.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                                if (!deserializedMemberScope2.isDeclaredFunctionAvailable(loadFunction)) {
                                    loadFunction = null;
                                }
                                if (loadFunction != null) {
                                    arrayList.add(loadFunction);
                                }
                            }
                            return arrayList;
                        case 1:
                            List list5 = noReorderImplementation.propertyList;
                            DeserializedMemberScope deserializedMemberScope3 = noReorderImplementation.this$0;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(deserializedMemberScope3.getC().getMemberDeserializer(), (ProtoBuf.Property) ((MessageLite) it2.next()), false, 2, null);
                                if (loadProperty$default != null) {
                                    arrayList2.add(loadProperty$default);
                                }
                            }
                            return arrayList2;
                        case 2:
                            List list6 = noReorderImplementation.typeAliasList;
                            DeserializedMemberScope deserializedMemberScope4 = noReorderImplementation.this$0;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = list6.iterator();
                            while (it3.hasNext()) {
                                TypeAliasDescriptor loadTypeAlias = deserializedMemberScope4.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it3.next()));
                                if (loadTypeAlias != null) {
                                    arrayList3.add(loadTypeAlias);
                                }
                            }
                            return arrayList3;
                        case 3:
                            NotNullLazyValue notNullLazyValue = noReorderImplementation.declaredFunctions$delegate;
                            List list7 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                            DeserializedMemberScope deserializedMemberScope5 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredFunctionNames = deserializedMemberScope5.getNonDeclaredFunctionNames();
                            ArrayList arrayList4 = new ArrayList();
                            for (Name name : nonDeclaredFunctionNames) {
                                List list8 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj : list8) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                                        arrayList5.add(obj);
                                    }
                                }
                                int size = arrayList5.size();
                                deserializedMemberScope5.computeNonDeclaredFunctions(name, arrayList5);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList5.subList(size, arrayList5.size()), arrayList4);
                            }
                            return CollectionsKt.plus((Iterable) arrayList4, (Collection) list7);
                        case 4:
                            NotNullLazyValue notNullLazyValue2 = noReorderImplementation.declaredProperties$delegate;
                            List list9 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                            DeserializedMemberScope deserializedMemberScope6 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredVariableNames = deserializedMemberScope6.getNonDeclaredVariableNames();
                            ArrayList arrayList6 = new ArrayList();
                            for (Name name2 : nonDeclaredVariableNames) {
                                List list10 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj2 : list10) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj2).getName(), name2)) {
                                        arrayList7.add(obj2);
                                    }
                                }
                                int size2 = arrayList7.size();
                                deserializedMemberScope6.computeNonDeclaredProperties$1(name2, arrayList7);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList7.subList(size2, arrayList7.size()), arrayList6);
                            }
                            return CollectionsKt.plus((Iterable) arrayList6, (Collection) list9);
                        case 5:
                            List list11 = (List) StorageKt.getValue(noReorderImplementation.allTypeAliases$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[2]);
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj3 : list11) {
                                Name name3 = ((TypeAliasDescriptor) obj3).getName();
                                name3.getClass();
                                linkedHashMap.put(name3, obj3);
                            }
                            return linkedHashMap;
                        case 6:
                            List list12 = (List) StorageKt.getValue(noReorderImplementation.allFunctions$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[3]);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj4 : list12) {
                                Name name4 = ((SimpleFunctionDescriptor) obj4).getName();
                                name4.getClass();
                                Object obj5 = linkedHashMap2.get(name4);
                                if (obj5 == null) {
                                    obj5 = new ArrayList();
                                    linkedHashMap2.put(name4, obj5);
                                }
                                ((List) obj5).add(obj4);
                            }
                            return linkedHashMap2;
                        default:
                            List list13 = (List) StorageKt.getValue(noReorderImplementation.allProperties$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[4]);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj6 : list13) {
                                Name name5 = ((PropertyDescriptor) obj6).getName();
                                name5.getClass();
                                Object obj7 = linkedHashMap3.get(name5);
                                if (obj7 == null) {
                                    obj7 = new ArrayList();
                                    linkedHashMap3.put(name5, obj7);
                                }
                                ((List) obj7).add(obj6);
                            }
                            return linkedHashMap3;
                    }
                }
            });
            final int i8 = 7;
            this.propertiesByName$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$0
                public final DeserializedMemberScope.NoReorderImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i8;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.arg$0;
                    switch (i22) {
                        case 0:
                            List list4 = noReorderImplementation.functionList;
                            DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                SimpleFunctionDescriptor loadFunction = deserializedMemberScope2.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                                if (!deserializedMemberScope2.isDeclaredFunctionAvailable(loadFunction)) {
                                    loadFunction = null;
                                }
                                if (loadFunction != null) {
                                    arrayList.add(loadFunction);
                                }
                            }
                            return arrayList;
                        case 1:
                            List list5 = noReorderImplementation.propertyList;
                            DeserializedMemberScope deserializedMemberScope3 = noReorderImplementation.this$0;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(deserializedMemberScope3.getC().getMemberDeserializer(), (ProtoBuf.Property) ((MessageLite) it2.next()), false, 2, null);
                                if (loadProperty$default != null) {
                                    arrayList2.add(loadProperty$default);
                                }
                            }
                            return arrayList2;
                        case 2:
                            List list6 = noReorderImplementation.typeAliasList;
                            DeserializedMemberScope deserializedMemberScope4 = noReorderImplementation.this$0;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = list6.iterator();
                            while (it3.hasNext()) {
                                TypeAliasDescriptor loadTypeAlias = deserializedMemberScope4.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it3.next()));
                                if (loadTypeAlias != null) {
                                    arrayList3.add(loadTypeAlias);
                                }
                            }
                            return arrayList3;
                        case 3:
                            NotNullLazyValue notNullLazyValue = noReorderImplementation.declaredFunctions$delegate;
                            List list7 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                            DeserializedMemberScope deserializedMemberScope5 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredFunctionNames = deserializedMemberScope5.getNonDeclaredFunctionNames();
                            ArrayList arrayList4 = new ArrayList();
                            for (Name name : nonDeclaredFunctionNames) {
                                List list8 = (List) StorageKt.getValue(notNullLazyValue, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[0]);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj : list8) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                                        arrayList5.add(obj);
                                    }
                                }
                                int size = arrayList5.size();
                                deserializedMemberScope5.computeNonDeclaredFunctions(name, arrayList5);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList5.subList(size, arrayList5.size()), arrayList4);
                            }
                            return CollectionsKt.plus((Iterable) arrayList4, (Collection) list7);
                        case 4:
                            NotNullLazyValue notNullLazyValue2 = noReorderImplementation.declaredProperties$delegate;
                            List list9 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                            DeserializedMemberScope deserializedMemberScope6 = noReorderImplementation.this$0;
                            Set<Name> nonDeclaredVariableNames = deserializedMemberScope6.getNonDeclaredVariableNames();
                            ArrayList arrayList6 = new ArrayList();
                            for (Name name2 : nonDeclaredVariableNames) {
                                List list10 = (List) StorageKt.getValue(notNullLazyValue2, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[1]);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj2 : list10) {
                                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj2).getName(), name2)) {
                                        arrayList7.add(obj2);
                                    }
                                }
                                int size2 = arrayList7.size();
                                deserializedMemberScope6.computeNonDeclaredProperties$1(name2, arrayList7);
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList7.subList(size2, arrayList7.size()), arrayList6);
                            }
                            return CollectionsKt.plus((Iterable) arrayList6, (Collection) list9);
                        case 5:
                            List list11 = (List) StorageKt.getValue(noReorderImplementation.allTypeAliases$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[2]);
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj3 : list11) {
                                Name name3 = ((TypeAliasDescriptor) obj3).getName();
                                name3.getClass();
                                linkedHashMap.put(name3, obj3);
                            }
                            return linkedHashMap;
                        case 6:
                            List list12 = (List) StorageKt.getValue(noReorderImplementation.allFunctions$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[3]);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj4 : list12) {
                                Name name4 = ((SimpleFunctionDescriptor) obj4).getName();
                                name4.getClass();
                                Object obj5 = linkedHashMap2.get(name4);
                                if (obj5 == null) {
                                    obj5 = new ArrayList();
                                    linkedHashMap2.put(name4, obj5);
                                }
                                ((List) obj5).add(obj4);
                            }
                            return linkedHashMap2;
                        default:
                            List list13 = (List) StorageKt.getValue(noReorderImplementation.allProperties$delegate, noReorderImplementation, DeserializedMemberScope.NoReorderImplementation.$$delegatedProperties[4]);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj6 : list13) {
                                Name name5 = ((PropertyDescriptor) obj6).getName();
                                name5.getClass();
                                Object obj7 = linkedHashMap3.get(name5);
                                if (obj7 == null) {
                                    obj7 = new ArrayList();
                                    linkedHashMap3.put(name5, obj7);
                                }
                                ((List) obj7).add(obj6);
                            }
                            return linkedHashMap3;
                    }
                }
            });
            this.functionNames$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this, deserializedMemberScope, i) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$8
                public final /* synthetic */ int $r8$classId;
                public final DeserializedMemberScope.NoReorderImplementation arg$0;
                public final DeserializedMemberScope arg$1;

                {
                    this.$r8$classId = i;
                    this.arg$0 = this;
                    this.arg$1 = deserializedMemberScope;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i9 = this.$r8$classId;
                    DeserializedMemberScope deserializedMemberScope2 = this.arg$1;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.arg$0;
                    switch (i9) {
                        case 0:
                            List list4 = noReorderImplementation.functionList;
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            DeserializedMemberScope deserializedMemberScope3 = noReorderImplementation.this$0;
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope3.getC().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) it.next())).getName()));
                            }
                            return SetsKt___SetsKt.plus((Set) linkedHashSet, (Iterable) deserializedMemberScope2.getNonDeclaredFunctionNames());
                        default:
                            List list5 = noReorderImplementation.propertyList;
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            DeserializedMemberScope deserializedMemberScope4 = noReorderImplementation.this$0;
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet2.add(NameResolverUtilKt.getName(deserializedMemberScope4.getC().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) it2.next())).getName()));
                            }
                            return SetsKt___SetsKt.plus((Set) linkedHashSet2, (Iterable) deserializedMemberScope2.getNonDeclaredVariableNames());
                    }
                }
            });
            this.variableNames$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this, deserializedMemberScope, i2) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$8
                public final /* synthetic */ int $r8$classId;
                public final DeserializedMemberScope.NoReorderImplementation arg$0;
                public final DeserializedMemberScope arg$1;

                {
                    this.$r8$classId = i2;
                    this.arg$0 = this;
                    this.arg$1 = deserializedMemberScope;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i9 = this.$r8$classId;
                    DeserializedMemberScope deserializedMemberScope2 = this.arg$1;
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.arg$0;
                    switch (i9) {
                        case 0:
                            List list4 = noReorderImplementation.functionList;
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            DeserializedMemberScope deserializedMemberScope3 = noReorderImplementation.this$0;
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope3.getC().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) it.next())).getName()));
                            }
                            return SetsKt___SetsKt.plus((Set) linkedHashSet, (Iterable) deserializedMemberScope2.getNonDeclaredFunctionNames());
                        default:
                            List list5 = noReorderImplementation.propertyList;
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            DeserializedMemberScope deserializedMemberScope4 = noReorderImplementation.this$0;
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet2.add(NameResolverUtilKt.getName(deserializedMemberScope4.getC().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) it2.next())).getName()));
                            }
                            return SetsKt___SetsKt.plus((Set) linkedHashSet2, (Iterable) deserializedMemberScope2.getNonDeclaredVariableNames());
                    }
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final void addFunctionsAndPropertiesTo(ArrayList arrayList, DescriptorKindFilter descriptorKindFilter, Function1 function1, LookupLocation lookupLocation) {
            descriptorKindFilter.getClass();
            function1.getClass();
            lookupLocation.getClass();
            boolean acceptsKinds = descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK());
            KProperty[] kPropertyArr = $$delegatedProperties;
            if (acceptsKinds) {
                for (Object obj : (List) StorageKt.getValue(this.allProperties$delegate, this, kPropertyArr[4])) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    name.getClass();
                    if (((Boolean) function1.invoke(name)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
            }
            if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                for (Object obj2 : (List) StorageKt.getValue(this.allFunctions$delegate, this, kPropertyArr[3])) {
                    Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                    name2.getClass();
                    if (((Boolean) function1.invoke(name2)).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection getContributedFunctions(Name name, LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            if (!getFunctionNames().contains(name)) {
                return EmptyList.INSTANCE;
            }
            Collection collection = (Collection) ((Map) StorageKt.getValue(this.functionsByName$delegate, this, $$delegatedProperties[6])).get(name);
            return collection == null ? EmptyList.INSTANCE : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection getContributedVariables(Name name, LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            if (!getVariableNames().contains(name)) {
                return EmptyList.INSTANCE;
            }
            Collection collection = (Collection) ((Map) StorageKt.getValue(this.propertiesByName$delegate, this, $$delegatedProperties[7])).get(name);
            return collection == null ? EmptyList.INSTANCE : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set getFunctionNames() {
            return (Set) StorageKt.getValue(this.functionNames$delegate, this, $$delegatedProperties[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final TypeAliasDescriptor getTypeAliasByName(Name name) {
            name.getClass();
            return (TypeAliasDescriptor) ((Map) StorageKt.getValue(this.typeAliasesByName$delegate, this, $$delegatedProperties[5])).get(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set getTypeAliasNames() {
            List list = this.typeAliasList;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.getName(this.this$0.getC().getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) it.next())).getName()));
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set getVariableNames() {
            return (Set) StorageKt.getValue(this.variableNames$delegate, this, $$delegatedProperties[9]);
        }
    }

    public final class OptimizedImplementation implements Implementation {
        public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(OptimizedImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new PropertyReference1Impl(OptimizedImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};
        public final NotNullLazyValue functionNames$delegate;
        public final LinkedHashMap functionProtosBytes;
        public final MemoizedFunctionToNotNull functions;
        public final MemoizedFunctionToNotNull properties;
        public final LinkedHashMap propertyProtosBytes;
        public final /* synthetic */ DeserializedMemberScope this$0;
        public final MemoizedFunctionToNullable typeAliasByName;
        public final Map typeAliasBytes;
        public final NotNullLazyValue variableNames$delegate;

        public OptimizedImplementation(DeserializedMemberScope deserializedMemberScope, List list, List list2, List list3) {
            Map map;
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.this$0 = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                Name name = NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) obj)).getName());
                Object obj2 = linkedHashMap.get(name);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(name, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.functionProtosBytes = packToByteArray(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.this$0;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Name name2 = NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) obj3)).getName());
                Object obj4 = linkedHashMap2.get(name2);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(name2, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.propertyProtosBytes = packToByteArray(linkedHashMap2);
            if (this.this$0.getC().getComponents().getConfiguration().getTypeAliasesAllowed()) {
                DeserializedMemberScope deserializedMemberScope3 = this.this$0;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : list3) {
                    Name name3 = NameResolverUtilKt.getName(deserializedMemberScope3.getC().getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) obj5)).getName());
                    Object obj6 = linkedHashMap3.get(name3);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(name3, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                map = packToByteArray(linkedHashMap3);
            } else {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
            this.typeAliasBytes = map;
            final int i = 0;
            this.functions = this.this$0.getC().getStorageManager().createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$0
                public final DeserializedMemberScope.OptimizedImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj7) {
                    Collection<ProtoBuf.Function> collection;
                    Collection<ProtoBuf.Property> collection2;
                    ProtoBuf.TypeAlias parseDelimitedFrom;
                    int i2 = i;
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.arg$0;
                    Name name4 = (Name) obj7;
                    switch (i2) {
                        case 0:
                            name4.getClass();
                            LinkedHashMap linkedHashMap4 = optimizedImplementation.functionProtosBytes;
                            final Parser<ProtoBuf.Function> parser = ProtoBuf.Function.PARSER;
                            parser.getClass();
                            final DeserializedMemberScope deserializedMemberScope4 = optimizedImplementation.this$0;
                            byte[] bArr = (byte[]) linkedHashMap4.get(name4);
                            if (bArr != null) {
                                final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                List list4 = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final MessageLite invoke() {
                                        return (MessageLite) Parser.this.parseDelimitedFrom(byteArrayInputStream, deserializedMemberScope4.getC().getComponents().getExtensionRegistryLite());
                                    }
                                }));
                                if (list4 != null) {
                                    collection = list4;
                                    ArrayList arrayList = new ArrayList(collection.size());
                                    for (ProtoBuf.Function function : collection) {
                                        MemberDeserializer memberDeserializer = deserializedMemberScope4.getC().getMemberDeserializer();
                                        function.getClass();
                                        SimpleFunctionDescriptor loadFunction = memberDeserializer.loadFunction(function);
                                        if (!deserializedMemberScope4.isDeclaredFunctionAvailable(loadFunction)) {
                                            loadFunction = null;
                                        }
                                        if (loadFunction != null) {
                                            arrayList.add(loadFunction);
                                        }
                                    }
                                    deserializedMemberScope4.computeNonDeclaredFunctions(name4, arrayList);
                                    return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
                                }
                            }
                            collection = EmptyList.INSTANCE;
                            ArrayList arrayList2 = new ArrayList(collection.size());
                            while (r0.hasNext()) {
                            }
                            deserializedMemberScope4.computeNonDeclaredFunctions(name4, arrayList2);
                            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList2);
                        case 1:
                            name4.getClass();
                            LinkedHashMap linkedHashMap5 = optimizedImplementation.propertyProtosBytes;
                            final Parser<ProtoBuf.Property> parser2 = ProtoBuf.Property.PARSER;
                            parser2.getClass();
                            final DeserializedMemberScope deserializedMemberScope5 = optimizedImplementation.this$0;
                            byte[] bArr2 = (byte[]) linkedHashMap5.get(name4);
                            if (bArr2 != null) {
                                final ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2);
                                List list5 = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final MessageLite invoke() {
                                        return (MessageLite) Parser.this.parseDelimitedFrom(byteArrayInputStream2, deserializedMemberScope5.getC().getComponents().getExtensionRegistryLite());
                                    }
                                }));
                                if (list5 != null) {
                                    collection2 = list5;
                                    ArrayList arrayList3 = new ArrayList(collection2.size());
                                    for (ProtoBuf.Property property : collection2) {
                                        MemberDeserializer memberDeserializer2 = deserializedMemberScope5.getC().getMemberDeserializer();
                                        property.getClass();
                                        PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(memberDeserializer2, property, false, 2, null);
                                        if (loadProperty$default != null) {
                                            arrayList3.add(loadProperty$default);
                                        }
                                    }
                                    deserializedMemberScope5.computeNonDeclaredProperties$1(name4, arrayList3);
                                    return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList3);
                                }
                            }
                            collection2 = EmptyList.INSTANCE;
                            ArrayList arrayList32 = new ArrayList(collection2.size());
                            while (r0.hasNext()) {
                            }
                            deserializedMemberScope5.computeNonDeclaredProperties$1(name4, arrayList32);
                            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList32);
                        default:
                            name4.getClass();
                            DeserializedMemberScope deserializedMemberScope6 = optimizedImplementation.this$0;
                            byte[] bArr3 = (byte[]) optimizedImplementation.typeAliasBytes.get(name4);
                            if (bArr3 == null || (parseDelimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr3), deserializedMemberScope6.getC().getComponents().getExtensionRegistryLite())) == null) {
                                return null;
                            }
                            return deserializedMemberScope6.getC().getMemberDeserializer().loadTypeAlias(parseDelimitedFrom);
                    }
                }
            });
            final int i2 = 1;
            this.properties = this.this$0.getC().getStorageManager().createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$0
                public final DeserializedMemberScope.OptimizedImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj7) {
                    Collection<ProtoBuf.Function> collection;
                    Collection<ProtoBuf.Property> collection2;
                    ProtoBuf.TypeAlias parseDelimitedFrom;
                    int i22 = i2;
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.arg$0;
                    Name name4 = (Name) obj7;
                    switch (i22) {
                        case 0:
                            name4.getClass();
                            LinkedHashMap linkedHashMap4 = optimizedImplementation.functionProtosBytes;
                            final Parser parser = ProtoBuf.Function.PARSER;
                            parser.getClass();
                            final DeserializedMemberScope deserializedMemberScope4 = optimizedImplementation.this$0;
                            byte[] bArr = (byte[]) linkedHashMap4.get(name4);
                            if (bArr != null) {
                                final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                List list4 = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final MessageLite invoke() {
                                        return (MessageLite) Parser.this.parseDelimitedFrom(byteArrayInputStream, deserializedMemberScope4.getC().getComponents().getExtensionRegistryLite());
                                    }
                                }));
                                if (list4 != null) {
                                    collection = list4;
                                    ArrayList arrayList2 = new ArrayList(collection.size());
                                    for (ProtoBuf.Function function : collection) {
                                        MemberDeserializer memberDeserializer = deserializedMemberScope4.getC().getMemberDeserializer();
                                        function.getClass();
                                        SimpleFunctionDescriptor loadFunction = memberDeserializer.loadFunction(function);
                                        if (!deserializedMemberScope4.isDeclaredFunctionAvailable(loadFunction)) {
                                            loadFunction = null;
                                        }
                                        if (loadFunction != null) {
                                            arrayList2.add(loadFunction);
                                        }
                                    }
                                    deserializedMemberScope4.computeNonDeclaredFunctions(name4, arrayList2);
                                    return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList2);
                                }
                            }
                            collection = EmptyList.INSTANCE;
                            ArrayList arrayList22 = new ArrayList(collection.size());
                            while (r0.hasNext()) {
                            }
                            deserializedMemberScope4.computeNonDeclaredFunctions(name4, arrayList22);
                            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList22);
                        case 1:
                            name4.getClass();
                            LinkedHashMap linkedHashMap5 = optimizedImplementation.propertyProtosBytes;
                            final Parser parser2 = ProtoBuf.Property.PARSER;
                            parser2.getClass();
                            final DeserializedMemberScope deserializedMemberScope5 = optimizedImplementation.this$0;
                            byte[] bArr2 = (byte[]) linkedHashMap5.get(name4);
                            if (bArr2 != null) {
                                final ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2);
                                List list5 = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final MessageLite invoke() {
                                        return (MessageLite) Parser.this.parseDelimitedFrom(byteArrayInputStream2, deserializedMemberScope5.getC().getComponents().getExtensionRegistryLite());
                                    }
                                }));
                                if (list5 != null) {
                                    collection2 = list5;
                                    ArrayList arrayList32 = new ArrayList(collection2.size());
                                    for (ProtoBuf.Property property : collection2) {
                                        MemberDeserializer memberDeserializer2 = deserializedMemberScope5.getC().getMemberDeserializer();
                                        property.getClass();
                                        PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(memberDeserializer2, property, false, 2, null);
                                        if (loadProperty$default != null) {
                                            arrayList32.add(loadProperty$default);
                                        }
                                    }
                                    deserializedMemberScope5.computeNonDeclaredProperties$1(name4, arrayList32);
                                    return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList32);
                                }
                            }
                            collection2 = EmptyList.INSTANCE;
                            ArrayList arrayList322 = new ArrayList(collection2.size());
                            while (r0.hasNext()) {
                            }
                            deserializedMemberScope5.computeNonDeclaredProperties$1(name4, arrayList322);
                            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList322);
                        default:
                            name4.getClass();
                            DeserializedMemberScope deserializedMemberScope6 = optimizedImplementation.this$0;
                            byte[] bArr3 = (byte[]) optimizedImplementation.typeAliasBytes.get(name4);
                            if (bArr3 == null || (parseDelimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr3), deserializedMemberScope6.getC().getComponents().getExtensionRegistryLite())) == null) {
                                return null;
                            }
                            return deserializedMemberScope6.getC().getMemberDeserializer().loadTypeAlias(parseDelimitedFrom);
                    }
                }
            });
            final int i3 = 2;
            this.typeAliasByName = this.this$0.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$0
                public final DeserializedMemberScope.OptimizedImplementation arg$0;

                {
                    this.arg$0 = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj7) {
                    Collection<ProtoBuf.Function> collection;
                    Collection<ProtoBuf.Property> collection2;
                    ProtoBuf.TypeAlias parseDelimitedFrom;
                    int i22 = i3;
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.arg$0;
                    Name name4 = (Name) obj7;
                    switch (i22) {
                        case 0:
                            name4.getClass();
                            LinkedHashMap linkedHashMap4 = optimizedImplementation.functionProtosBytes;
                            final Parser parser = ProtoBuf.Function.PARSER;
                            parser.getClass();
                            final DeserializedMemberScope deserializedMemberScope4 = optimizedImplementation.this$0;
                            byte[] bArr = (byte[]) linkedHashMap4.get(name4);
                            if (bArr != null) {
                                final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                List list4 = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final MessageLite invoke() {
                                        return (MessageLite) Parser.this.parseDelimitedFrom(byteArrayInputStream, deserializedMemberScope4.getC().getComponents().getExtensionRegistryLite());
                                    }
                                }));
                                if (list4 != null) {
                                    collection = list4;
                                    ArrayList arrayList22 = new ArrayList(collection.size());
                                    for (ProtoBuf.Function function : collection) {
                                        MemberDeserializer memberDeserializer = deserializedMemberScope4.getC().getMemberDeserializer();
                                        function.getClass();
                                        SimpleFunctionDescriptor loadFunction = memberDeserializer.loadFunction(function);
                                        if (!deserializedMemberScope4.isDeclaredFunctionAvailable(loadFunction)) {
                                            loadFunction = null;
                                        }
                                        if (loadFunction != null) {
                                            arrayList22.add(loadFunction);
                                        }
                                    }
                                    deserializedMemberScope4.computeNonDeclaredFunctions(name4, arrayList22);
                                    return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList22);
                                }
                            }
                            collection = EmptyList.INSTANCE;
                            ArrayList arrayList222 = new ArrayList(collection.size());
                            while (r0.hasNext()) {
                            }
                            deserializedMemberScope4.computeNonDeclaredFunctions(name4, arrayList222);
                            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList222);
                        case 1:
                            name4.getClass();
                            LinkedHashMap linkedHashMap5 = optimizedImplementation.propertyProtosBytes;
                            final Parser parser2 = ProtoBuf.Property.PARSER;
                            parser2.getClass();
                            final DeserializedMemberScope deserializedMemberScope5 = optimizedImplementation.this$0;
                            byte[] bArr2 = (byte[]) linkedHashMap5.get(name4);
                            if (bArr2 != null) {
                                final ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2);
                                List list5 = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final MessageLite invoke() {
                                        return (MessageLite) Parser.this.parseDelimitedFrom(byteArrayInputStream2, deserializedMemberScope5.getC().getComponents().getExtensionRegistryLite());
                                    }
                                }));
                                if (list5 != null) {
                                    collection2 = list5;
                                    ArrayList arrayList322 = new ArrayList(collection2.size());
                                    for (ProtoBuf.Property property : collection2) {
                                        MemberDeserializer memberDeserializer2 = deserializedMemberScope5.getC().getMemberDeserializer();
                                        property.getClass();
                                        PropertyDescriptor loadProperty$default = MemberDeserializer.loadProperty$default(memberDeserializer2, property, false, 2, null);
                                        if (loadProperty$default != null) {
                                            arrayList322.add(loadProperty$default);
                                        }
                                    }
                                    deserializedMemberScope5.computeNonDeclaredProperties$1(name4, arrayList322);
                                    return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList322);
                                }
                            }
                            collection2 = EmptyList.INSTANCE;
                            ArrayList arrayList3222 = new ArrayList(collection2.size());
                            while (r0.hasNext()) {
                            }
                            deserializedMemberScope5.computeNonDeclaredProperties$1(name4, arrayList3222);
                            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList3222);
                        default:
                            name4.getClass();
                            DeserializedMemberScope deserializedMemberScope6 = optimizedImplementation.this$0;
                            byte[] bArr3 = (byte[]) optimizedImplementation.typeAliasBytes.get(name4);
                            if (bArr3 == null || (parseDelimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr3), deserializedMemberScope6.getC().getComponents().getExtensionRegistryLite())) == null) {
                                return null;
                            }
                            return deserializedMemberScope6.getC().getMemberDeserializer().loadTypeAlias(parseDelimitedFrom);
                    }
                }
            });
            StorageManager storageManager = this.this$0.getC().getStorageManager();
            final DeserializedMemberScope deserializedMemberScope4 = this.this$0;
            this.functionNames$delegate = storageManager.createLazyValue(new Function0(this, deserializedMemberScope4, i) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$3
                public final /* synthetic */ int $r8$classId;
                public final DeserializedMemberScope.OptimizedImplementation arg$0;
                public final DeserializedMemberScope arg$1;

                {
                    this.$r8$classId = i;
                    this.arg$0 = this;
                    this.arg$1 = deserializedMemberScope4;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = this.$r8$classId;
                    DeserializedMemberScope deserializedMemberScope5 = this.arg$1;
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.arg$0;
                    switch (i4) {
                        case 0:
                            return SetsKt___SetsKt.plus(optimizedImplementation.functionProtosBytes.keySet(), (Iterable) deserializedMemberScope5.getNonDeclaredFunctionNames());
                        default:
                            return SetsKt___SetsKt.plus(optimizedImplementation.propertyProtosBytes.keySet(), (Iterable) deserializedMemberScope5.getNonDeclaredVariableNames());
                    }
                }
            });
            StorageManager storageManager2 = this.this$0.getC().getStorageManager();
            final DeserializedMemberScope deserializedMemberScope5 = this.this$0;
            this.variableNames$delegate = storageManager2.createLazyValue(new Function0(this, deserializedMemberScope5, i2) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$3
                public final /* synthetic */ int $r8$classId;
                public final DeserializedMemberScope.OptimizedImplementation arg$0;
                public final DeserializedMemberScope arg$1;

                {
                    this.$r8$classId = i2;
                    this.arg$0 = this;
                    this.arg$1 = deserializedMemberScope5;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = this.$r8$classId;
                    DeserializedMemberScope deserializedMemberScope52 = this.arg$1;
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.arg$0;
                    switch (i4) {
                        case 0:
                            return SetsKt___SetsKt.plus(optimizedImplementation.functionProtosBytes.keySet(), (Iterable) deserializedMemberScope52.getNonDeclaredFunctionNames());
                        default:
                            return SetsKt___SetsKt.plus(optimizedImplementation.propertyProtosBytes.keySet(), (Iterable) deserializedMemberScope52.getNonDeclaredVariableNames());
                    }
                }
            });
        }

        public static LinkedHashMap packToByteArray(LinkedHashMap linkedHashMap) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((AbstractMessageLite) it.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(Unit.INSTANCE);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final void addFunctionsAndPropertiesTo(ArrayList arrayList, DescriptorKindFilter descriptorKindFilter, Function1 function1, LookupLocation lookupLocation) {
            descriptorKindFilter.getClass();
            function1.getClass();
            lookupLocation.getClass();
            if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                Set<Name> variableNames = getVariableNames();
                ArrayList arrayList2 = new ArrayList();
                for (Name name : variableNames) {
                    if (((Boolean) function1.invoke(name)).booleanValue()) {
                        arrayList2.addAll(getContributedVariables(name, lookupLocation));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                nameAndTypeMemberComparator.getClass();
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, nameAndTypeMemberComparator);
                arrayList.addAll(arrayList2);
            }
            if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                Set<Name> functionNames = getFunctionNames();
                ArrayList arrayList3 = new ArrayList();
                for (Name name2 : functionNames) {
                    if (((Boolean) function1.invoke(name2)).booleanValue()) {
                        arrayList3.addAll(getContributedFunctions(name2, lookupLocation));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator2 = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                nameAndTypeMemberComparator2.getClass();
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList3, nameAndTypeMemberComparator2);
                arrayList.addAll(arrayList3);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection getContributedFunctions(Name name, LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            return !getFunctionNames().contains(name) ? EmptyList.INSTANCE : (Collection) this.functions.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection getContributedVariables(Name name, LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            return !getVariableNames().contains(name) ? EmptyList.INSTANCE : (Collection) this.properties.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set getFunctionNames() {
            return (Set) StorageKt.getValue(this.functionNames$delegate, this, $$delegatedProperties[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final TypeAliasDescriptor getTypeAliasByName(Name name) {
            name.getClass();
            return (TypeAliasDescriptor) this.typeAliasByName.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set getTypeAliasNames() {
            return this.typeAliasBytes.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set getVariableNames() {
            return (Set) StorageKt.getValue(this.variableNames$delegate, this, $$delegatedProperties[1]);
        }
    }

    public DeserializedMemberScope(DeserializationContext deserializationContext, List list, List list2, List list3, Function0 function0) {
        deserializationContext.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        function0.getClass();
        this.c = deserializationContext;
        this.impl = deserializationContext.getComponents().getConfiguration().getPreserveDeclarationsOrdering() ? new NoReorderImplementation(this, list, list2, list3) : new OptimizedImplementation(this, list, list2, list3);
        this.classNames$delegate = deserializationContext.getStorageManager().createLazyValue(new LazyScopeAdapter$$Lambda$0(1, function0));
        this.classifierNamesLazy$delegate = deserializationContext.getStorageManager().createNullableLazyValue(new KotlinKPropertyN$$Lambda$0(this, 25));
    }

    public abstract void addEnumEntryDescriptors(ArrayList arrayList, Function1 function1);

    public final Collection computeDescriptors(DescriptorKindFilter descriptorKindFilter, Function1 function1, NoLookupLocation noLookupLocation) {
        descriptorKindFilter.getClass();
        function1.getClass();
        noLookupLocation.getClass();
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (descriptorKindFilter.acceptsKinds(companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, function1);
        }
        Implementation implementation = this.impl;
        implementation.addFunctionsAndPropertiesTo(arrayList, descriptorKindFilter, function1, noLookupLocation);
        if (descriptorKindFilter.acceptsKinds(companion.getCLASSIFIERS_MASK())) {
            for (Name name : getClassNames$deserialization()) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, this.c.getComponents().deserializeClass(createClassId(name)));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK())) {
            for (Name name2 : implementation.getTypeAliasNames()) {
                if (((Boolean) function1.invoke(name2)).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, implementation.getTypeAliasByName(name2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
    }

    public void computeNonDeclaredFunctions(Name name, ArrayList arrayList) {
        name.getClass();
    }

    public void computeNonDeclaredProperties$1(Name name, ArrayList arrayList) {
        name.getClass();
    }

    public abstract ClassId createClassId(Name name);

    public final DeserializationContext getC() {
        return this.c;
    }

    public final Set<Name> getClassNames$deserialization() {
        return (Set) StorageKt.getValue(this.classNames$delegate, this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return (Set) StorageKt.getValue(this.classifierNamesLazy$delegate, this, $$delegatedProperties[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        if (hasClass(name)) {
            return this.c.getComponents().deserializeClass(createClassId(name));
        }
        Implementation implementation = this.impl;
        if (implementation.getTypeAliasNames().contains(name)) {
            return implementation.getTypeAliasByName(name);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return this.impl.getContributedFunctions(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return this.impl.getContributedVariables(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return this.impl.getFunctionNames();
    }

    public abstract Set getNonDeclaredClassifierNames();

    public abstract Set getNonDeclaredFunctionNames();

    public abstract Set getNonDeclaredVariableNames();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return this.impl.getVariableNames();
    }

    public boolean hasClass(Name name) {
        name.getClass();
        return getClassNames$deserialization().contains(name);
    }

    public boolean isDeclaredFunctionAvailable(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return true;
    }
}
