package com.yandex.div.internal.parser;

import W1.f;
import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.serialization.ParsingContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class JsonTopologicalSorting {

    @NotNull
    public static final JsonTopologicalSorting INSTANCE = new JsonTopologicalSorting();

    @NotNull
    private static final ValueValidator<String> TYPE_VALIDATOR = new ValueValidator() { // from class: G1.f
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean TYPE_VALIDATOR$lambda$0;
            TYPE_VALIDATOR$lambda$0 = JsonTopologicalSorting.TYPE_VALIDATOR$lambda$0((String) obj);
            return TYPE_VALIDATOR$lambda$0;
        }
    };

    private JsonTopologicalSorting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TYPE_VALIDATOR$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() > 0;
    }

    private final Map<String, List<String>> parseTypeDependencies(ParsingContext parsingContext, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jSONObject.get(key);
            if (obj instanceof JSONObject) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                ArrayList arrayList = new ArrayList();
                INSTANCE.readObjectDependencies(parsingContext, new TemplateParsingErrorLogger(parsingContext.getLogger(), key), (JSONObject) obj, true, arrayList);
                linkedHashMap.put(key, arrayList);
            }
        }
        return linkedHashMap;
    }

    private final void processType(String str, Map<String, List<String>> map, Set<String> set, Set<String> set2, LinkedHashMap<String, Set<String>> linkedHashMap) {
        ArrayList arrayList;
        Set<String> set3;
        LinkedHashMap<String, Set<String>> linkedHashMap2;
        if (set.contains(str)) {
            throwCyclicDependency(CollectionsKt.toList(set), str);
            throw new f();
        }
        if (set2.contains(str)) {
            return;
        }
        List<String> list = map.get(str);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (map.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            set3 = set2;
            linkedHashMap2 = linkedHashMap;
        } else {
            set.add(str);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                processType((String) obj2, map, set, set2, linkedHashMap);
            }
            set3 = set2;
            linkedHashMap2 = linkedHashMap;
            set.remove(str);
        }
        set3.add(str);
        Collection collection = arrayList;
        if (arrayList == null) {
            collection = CollectionsKt.emptyList();
        }
        linkedHashMap2.put(str, CollectionsKt.toSet(collection));
    }

    private final void readObjectDependencies(ParsingContext parsingContext, ParsingErrorLogger parsingErrorLogger, JSONObject jSONObject, boolean z4, List<String> list) {
        String readParent = z4 ? readParent(parsingContext, jSONObject) : readOptionalParent(parsingContext, jSONObject);
        List<String> list2 = list;
        if (readParent != null) {
            list2.add(readParent);
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jSONObject.get(key);
            if (obj instanceof JSONObject) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                INSTANCE.readObjectDependencies(parsingContext, parsingErrorLogger, (JSONObject) obj, false, list2);
            }
            list2 = list;
        }
        Iterator<String> keys2 = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys2, "keys");
        while (keys2.hasNext()) {
            String key2 = keys2.next();
            Object obj2 = jSONObject.get(key2);
            if (obj2 instanceof JSONArray) {
                Intrinsics.checkNotNullExpressionValue(key2, "key");
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    Object obj3 = jSONArray.get(i4);
                    if (obj3 instanceof JSONObject) {
                        INSTANCE.readObjectDependencies(parsingContext, parsingErrorLogger, (JSONObject) obj3, false, list);
                    }
                }
            }
        }
    }

    private final String readOptionalParent(ParsingContext parsingContext, JSONObject jSONObject) {
        return (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", TYPE_VALIDATOR);
    }

    private final String readParent(ParsingContext parsingContext, JSONObject jSONObject) {
        Object read = JsonPropertyParser.read(parsingContext, jSONObject, "type", TYPE_VALIDATOR);
        Intrinsics.checkNotNullExpressionValue(read, "read(context, json, \"type\", TYPE_VALIDATOR)");
        return (String) read;
    }

    private final Void throwCyclicDependency(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int indexOf = list.indexOf(str); indexOf < size; indexOf++) {
            sb.append(list.get(indexOf));
            sb.append(" -> ");
        }
        sb.append(str);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "output.toString()");
        throw new CyclicDependencyException(sb2);
    }

    @NotNull
    public final Map<String, Set<String>> sort(@NotNull ParsingContext context, @NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(json, "json");
        Map<String, List<String>> parseTypeDependencies = parseTypeDependencies(context, json);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap<String, Set<String>> linkedHashMap = new LinkedHashMap<>();
        Iterator<String> it = parseTypeDependencies.keySet().iterator();
        while (it.hasNext()) {
            processType(it.next(), parseTypeDependencies, linkedHashSet, linkedHashSet2, linkedHashMap);
        }
        return linkedHashMap;
    }
}
