package xyz.block.genie.state;

import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import okio.ByteString;
import xyz.block.genie.state.GenieStateError;
import xyz.block.genie.state.GenieStateValue;
import xyz.block.protos.genie.Collection;
import xyz.block.protos.genie.CollectionItem;
import xyz.block.protos.genie.KeyValueMap;

/* loaded from: classes10.dex */
public final class GenieRootViewState implements GenieViewState {
    public final SnapshotStateMap storage = new SnapshotStateMap();

    public final class Companion {
        public static void checkTypeMatch(String str, GenieStateValue genieStateValue, GenieStateValue genieStateValue2) {
            if (genieStateValue.getClass() == genieStateValue2.getClass()) {
                return;
            }
            str.getClass();
            throw new GenieStateError.TypeMismatch("Type mismatch at segment '" + str + "': existing=" + genieStateValue + ", new=" + genieStateValue2);
        }

        public static void deepMerge$android_release(LinkedHashMap linkedHashMap, List list, GenieStateValue genieStateValue) {
            LinkedHashMap linkedHashMap2;
            list.getClass();
            genieStateValue.getClass();
            if (list.isEmpty()) {
                return;
            }
            if (list.size() == 1) {
                GenieStateValue genieStateValue2 = (GenieStateValue) linkedHashMap.get(list.get(0));
                if (genieStateValue2 != null) {
                    checkTypeMatch((String) list.get(0), genieStateValue2, genieStateValue);
                }
                linkedHashMap.put(list.get(0), genieStateValue);
                return;
            }
            String str = (String) list.get(0);
            GenieStateValue genieStateValue3 = (GenieStateValue) linkedHashMap.get(str);
            if (genieStateValue3 != null) {
                GenieStateValue.GroupValue groupValue = genieStateValue3 instanceof GenieStateValue.GroupValue ? (GenieStateValue.GroupValue) genieStateValue3 : null;
                if (groupValue == null) {
                    throw new GenieStateError.UnexpectedValueAtSegment(str, genieStateValue3);
                }
                linkedHashMap2 = MapsKt__MapsKt.toMutableMap(groupValue.value);
            } else {
                linkedHashMap2 = new LinkedHashMap();
            }
            deepMerge$android_release(linkedHashMap2, CollectionsKt.drop(list, 1), genieStateValue);
            linkedHashMap.put(str, new GenieStateValue.GroupValue(linkedHashMap2));
        }

        public static GenieStateValue stateValueFromEntry$android_release(KeyValueMap.Entry entry) {
            GenieStateValue stateValueFromEntry$android_release;
            String str = entry.string_value;
            KeyValueMap keyValueMap = entry.group;
            if (str != null) {
                return new GenieStateValue.StringValue(str);
            }
            Long l = entry.int_value;
            if (l != null) {
                return new GenieStateValue.IntValue(l.longValue());
            }
            Double d = entry.float_value;
            if (d != null) {
                return new GenieStateValue.FloatValue(d.doubleValue());
            }
            Boolean bool = entry.bool_value;
            if (bool != null) {
                return new GenieStateValue.BoolValue(bool.booleanValue());
            }
            ByteString byteString = entry.blob_value;
            if (byteString != null) {
                return new GenieStateValue.BlobValue(byteString);
            }
            if (keyValueMap != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (KeyValueMap.Entry entry2 : keyValueMap.entries) {
                    String str2 = entry2.key;
                    if (str2 != null && (stateValueFromEntry$android_release = stateValueFromEntry$android_release(entry2)) != null) {
                        linkedHashMap.put(str2, stateValueFromEntry$android_release);
                    }
                }
                return new GenieStateValue.GroupValue(linkedHashMap);
            }
            Collection collection = entry.collection;
            if (collection == null) {
                return null;
            }
            List list = collection.items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CameraCaptureCallbacks.fromProto((CollectionItem) it.next()));
            }
            return new GenieStateValue.CollectionValue(arrayList);
        }
    }

    public GenieRootViewState(KeyValueMap keyValueMap) {
        List<KeyValueMap.Entry> list;
        GenieStateValue stateValueFromEntry$android_release;
        if (keyValueMap == null || (list = keyValueMap.entries) == null) {
            return;
        }
        for (KeyValueMap.Entry entry : list) {
            String str = entry.key;
            if (str != null && (stateValueFromEntry$android_release = Companion.stateValueFromEntry$android_release(entry)) != null) {
                this.storage.put(str, stateValueFromEntry$android_release);
            }
        }
    }

    @Override // xyz.block.genie.state.GenieViewState
    public final void setValue(GenieStateValue genieStateValue, List list) {
        genieStateValue.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        SnapshotStateMap snapshotStateMap = this.storage;
        if (size == 1) {
            GenieStateValue genieStateValue2 = (GenieStateValue) snapshotStateMap.get(list.get(0));
            if (genieStateValue2 != null) {
                Companion.checkTypeMatch((String) list.get(0), genieStateValue2, genieStateValue);
            }
            snapshotStateMap.put(list.get(0), genieStateValue);
            return;
        }
        String str = (String) list.get(0);
        GenieStateValue genieStateValue3 = (GenieStateValue) snapshotStateMap.get(str);
        if (genieStateValue3 != null) {
            GenieStateValue.GroupValue groupValue = genieStateValue3 instanceof GenieStateValue.GroupValue ? (GenieStateValue.GroupValue) genieStateValue3 : null;
            if (groupValue == null) {
                throw new GenieStateError.UnexpectedValueAtSegment(str, genieStateValue3);
            }
            LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(groupValue.value);
            Companion.deepMerge$android_release(mutableMap, CollectionsKt.drop(list, 1), genieStateValue);
            snapshotStateMap.put(str, new GenieStateValue.GroupValue(mutableMap));
            return;
        }
        int size2 = list.size() - 1;
        while (size2 > 0) {
            GenieStateValue.GroupValue groupValue2 = new GenieStateValue.GroupValue(MapsKt__MapsJVMKt.mapOf(new Pair(list.get(size2), genieStateValue)));
            size2--;
            genieStateValue = groupValue2;
        }
        snapshotStateMap.put(str, genieStateValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    @Override // xyz.block.genie.state.GenieViewState
    public final GenieStateValue value(List list) {
        GenieStateValue genieStateValue;
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        int i = 0;
        GenieStateValue genieStateValue2 = null;
        while (it.hasNext()) {
            int i2 = i + 1;
            String str = (String) it.next();
            if (i == 0) {
                genieStateValue = this.storage.get(str);
            } else {
                if (genieStateValue2 == null) {
                    return null;
                }
                GenieStateValue.GroupValue groupValue = genieStateValue2 instanceof GenieStateValue.GroupValue ? (GenieStateValue.GroupValue) genieStateValue2 : null;
                if (groupValue == null) {
                    throw new GenieStateError.UnexpectedValueAtSegment((String) list.get(i - 1), genieStateValue2);
                }
                genieStateValue = groupValue.value.get(str);
            }
            genieStateValue2 = genieStateValue;
            i = i2;
        }
        return genieStateValue2;
    }
}
