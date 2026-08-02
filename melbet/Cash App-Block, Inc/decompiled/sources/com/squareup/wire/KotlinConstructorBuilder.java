package com.squareup.wire;

import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class KotlinConstructorBuilder extends Message.Builder {
    public final LinkedHashMap fieldValueMap;
    public final LinkedHashMap mapFieldKeyValueMap;
    public final Class messageType;
    public final LinkedHashMap repeatedFieldValueMap;
    public final LinkedHashMap sealedOneofValues;

    public KotlinConstructorBuilder(Class cls) {
        cls.getClass();
        this.messageType = cls;
        this.sealedOneofValues = new LinkedHashMap();
        int length = cls.getDeclaredFields().length;
        this.fieldValueMap = new LinkedHashMap(length);
        this.repeatedFieldValueMap = new LinkedHashMap(length);
        this.mapFieldKeyValueMap = new LinkedHashMap(length);
    }

    @Override // com.squareup.wire.Message.Builder
    public final Message build() {
        KotlinConstructorBuilder$build$ConstructorParam kotlinConstructorBuilder$build$ConstructorParam;
        Class cls = this.messageType;
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                Class<?> type2 = field.getType();
                type2.getClass();
                kotlinConstructorBuilder$build$ConstructorParam = new KotlinConstructorBuilder$build$ConstructorParam(type2, wireField.schemaIndex(), new ListsKt$$ExternalSyntheticLambda0(24, this, wireField));
            } else {
                WireSealedOneof wireSealedOneof = (WireSealedOneof) field.getAnnotation(WireSealedOneof.class);
                if (wireSealedOneof != null) {
                    String name = field.getName();
                    Class<?> type3 = field.getType();
                    type3.getClass();
                    kotlinConstructorBuilder$build$ConstructorParam = new KotlinConstructorBuilder$build$ConstructorParam(type3, wireSealedOneof.schemaIndex(), new ListsKt$$ExternalSyntheticLambda0(25, this, name));
                } else {
                    kotlinConstructorBuilder$build$ConstructorParam = null;
                }
            }
            if (kotlinConstructorBuilder$build$ConstructorParam != null) {
                arrayList.add(kotlinConstructorBuilder$build$ConstructorParam);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList, new LinkedHashTreeMap.AnonymousClass1(18));
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
        Iterator it = sortedWith.iterator();
        while (it.hasNext()) {
            arrayList2.add(((KotlinConstructorBuilder$build$ConstructorParam) it.next()).f1417type);
        }
        Class[] clsArr = (Class[]) CollectionsKt.plus((Collection) arrayList2, (Object) ByteString.class).toArray(new Class[0]);
        Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
        Iterator it2 = sortedWith.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((KotlinConstructorBuilder$build$ConstructorParam) it2.next()).value.invoke());
        }
        Object[] array2 = CollectionsKt.plus((Collection) arrayList3, (Object) buildUnknownFields()).toArray(new Object[0]);
        Object newInstance = declaredConstructor.newInstance(Arrays.copyOf(array2, array2.length));
        newInstance.getClass();
        return (Message) newInstance;
    }

    public final Object get(WireField wireField) {
        List list;
        Map map;
        if (wireField.keyAdapter().length() > 0) {
            Pair pair = (Pair) this.mapFieldKeyValueMap.get(Integer.valueOf(wireField.tag()));
            if (pair != null && (map = (Map) pair.second) != null) {
                return map;
            }
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        if (wireField.label().isRepeated()) {
            Pair pair2 = (Pair) this.repeatedFieldValueMap.get(Integer.valueOf(wireField.tag()));
            return (pair2 == null || (list = (List) pair2.second) == null) ? EmptyList.INSTANCE : list;
        }
        Pair pair3 = (Pair) this.fieldValueMap.get(Integer.valueOf(wireField.tag()));
        Object obj = pair3 != null ? pair3.second : null;
        if (obj != null || wireField.label() != WireField.Label.OMIT_IDENTITY) {
            return obj;
        }
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        String adapter = wireField.adapter();
        companion.getClass();
        adapter.getClass();
        return ProtoAdapter.Companion.get(adapter, ProtoAdapter.class.getClassLoader()).getIdentity();
    }
}
