package io.ktor.client.plugins.kotlinx.serializer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: KotlinxSerializer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\b"}, d2 = {"buildSerializer", "Lkotlinx/serialization/KSerializer;", "", "value", "module", "Lkotlinx/serialization/modules/SerializersModule;", "elementSerializer", "", "ktor-client-serialization"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KotlinxSerializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer<Object> buildSerializer(Object obj, SerializersModule serializersModule) {
        KSerializer<Object> serializer;
        if (obj instanceof JsonElement) {
            serializer = JsonElement.INSTANCE.serializer();
        } else if (obj instanceof List) {
            serializer = BuiltinSerializersKt.ListSerializer(elementSerializer((Collection) obj, serializersModule));
        } else if (obj instanceof Object[]) {
            Object firstOrNull = ArraysKt.firstOrNull((Object[]) obj);
            if (firstOrNull == null || (serializer = buildSerializer(firstOrNull, serializersModule)) == null) {
                serializer = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
            }
        } else if (obj instanceof Set) {
            serializer = BuiltinSerializersKt.SetSerializer(elementSerializer((Collection) obj, serializersModule));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            serializer = BuiltinSerializersKt.MapSerializer(elementSerializer(map.keySet(), serializersModule), elementSerializer(map.values(), serializersModule));
        } else {
            KSerializer<Object> contextual$default = SerializersModule.getContextual$default(serializersModule, Reflection.getOrCreateKotlinClass(obj.getClass()), null, 2, null);
            serializer = contextual$default == null ? SerializersKt.serializer(Reflection.getOrCreateKotlinClass(obj.getClass())) : contextual$default;
        }
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return serializer;
    }

    private static final KSerializer<?> elementSerializer(Collection<?> collection, SerializersModule serializersModule) {
        Collection<?> collection2 = collection;
        List filterNotNull = CollectionsKt.filterNotNull(collection2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterNotNull, 10));
        Iterator it = filterNotNull.iterator();
        while (it.hasNext()) {
            arrayList.add(buildSerializer(it.next(), serializersModule));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((KSerializer) obj).getDescriptor().getSerialName())) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        boolean z = true;
        if (arrayList3.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((KSerializer) it2.next()).getDescriptor().getSerialName());
            }
            throw new IllegalStateException(sb.append(arrayList5).toString().toString());
        }
        KSerializer<String> kSerializer = (KSerializer) CollectionsKt.singleOrNull((List) arrayList3);
        if (kSerializer == null) {
            kSerializer = BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE);
        }
        if (kSerializer.getDescriptor().isNullable()) {
            return kSerializer;
        }
        Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it3 = collection2.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                    break;
                }
            }
        }
        z = false;
        return z ? BuiltinSerializersKt.getNullable(kSerializer) : kSerializer;
    }
}
