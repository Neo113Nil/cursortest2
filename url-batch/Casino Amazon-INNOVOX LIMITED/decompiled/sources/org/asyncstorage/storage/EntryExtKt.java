package org.asyncstorage.storage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.asyncstorage.shared_storage.Entry;

/* compiled from: EntryExt.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0001H\u0002\u001a\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u0004H\u0000\u001a\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005*\u00020\u0004H\u0000\u001a\u0012\u0010\n\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\t0\u0005H\u0000¨\u0006\u000b"}, d2 = {"toRNResult", "Lcom/facebook/react/bridge/ReadableMap;", "Lorg/asyncstorage/shared_storage/Entry;", "toRNResults", "Lcom/facebook/react/bridge/ReadableArray;", "", "toEntry", "toEntryList", "toKeyList", "", "toRNKeys", "react-native-async-storage_async-storage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EntryExtKt {
    public static final ReadableMap toRNResult(Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        WritableMap createMap = Arguments.createMap();
        createMap.putString("key", entry.getKey());
        createMap.putString("value", entry.getValue());
        return createMap;
    }

    public static final ReadableArray toRNResults(List<Entry> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        WritableArray createArray = Arguments.createArray();
        Iterator<Entry> it = list.iterator();
        while (it.hasNext()) {
            createArray.pushMap(toRNResult(it.next()));
        }
        return createArray;
    }

    private static final Entry toEntry(ReadableMap readableMap) {
        String string = readableMap.getString("key");
        if (string == null) {
            throw new IllegalStateException("Missing key in map from RN".toString());
        }
        return new Entry(string, readableMap.getString("value"));
    }

    public static final List<Entry> toEntryList(ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            if (map == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            arrayList.add(toEntry(map));
        }
        return arrayList;
    }

    public static final List<String> toKeyList(ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(it.next()));
        }
        return arrayList2;
    }

    public static final ReadableArray toRNKeys(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            createArray.pushString(it.next());
        }
        return createArray;
    }
}
