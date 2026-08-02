package xyz.block.genie.state;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import xyz.block.genie.state.GenieRootViewState;
import xyz.block.genie.state.GenieStateValue;

/* loaded from: classes10.dex */
public final class GenieScopedViewState implements GenieViewState {
    public final GenieCollectionItem item;
    public final String itemVariable;
    public final GenieViewState parent;
    public final List sourceCollectionPath;

    public GenieScopedViewState(GenieViewState genieViewState, String str, GenieCollectionItem genieCollectionItem, List list) {
        genieViewState.getClass();
        str.getClass();
        this.parent = genieViewState;
        this.itemVariable = str;
        this.item = genieCollectionItem;
        this.sourceCollectionPath = list;
    }

    public static GenieStateValue resolveInGroup(List list, Map map) {
        GenieStateValue genieStateValue;
        if (!list.isEmpty() && (genieStateValue = (GenieStateValue) map.get(list.get(0))) != null) {
            if (list.size() == 1) {
                return genieStateValue;
            }
            GenieStateValue.GroupValue groupValue = genieStateValue instanceof GenieStateValue.GroupValue ? (GenieStateValue.GroupValue) genieStateValue : null;
            if (groupValue != null) {
                return resolveInGroup(CollectionsKt.drop(list, 1), groupValue.value);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Map] */
    @Override // xyz.block.genie.state.GenieViewState
    public final void setValue(GenieStateValue genieStateValue, List list) {
        genieStateValue.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        Object obj = list.get(0);
        String str = this.itemVariable;
        boolean areEqual = Intrinsics.areEqual(obj, str);
        GenieViewState genieViewState = this.parent;
        if (!areEqual) {
            genieViewState.setValue(genieStateValue, list);
            return;
        }
        List list2 = this.sourceCollectionPath;
        if (list2 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot write back through derived collection for item variable \"", str, "\": no source collection specified. Set the `source` field on ForEach to the key path of the backing source collection.");
            return;
        }
        GenieStateValue value = genieViewState.value(list2);
        GenieStateValue.CollectionValue collectionValue = value instanceof GenieStateValue.CollectionValue ? (GenieStateValue.CollectionValue) value : null;
        if (collectionValue == null) {
            return;
        }
        List drop = CollectionsKt.drop(list, 1);
        if (drop.isEmpty()) {
            return;
        }
        String identityValue = this.item.getIdentityValue();
        ArrayList<GenieCollectionItem> arrayList = collectionValue.items;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (GenieCollectionItem genieCollectionItem : arrayList) {
            if (genieCollectionItem.getIdentityValue().equals(identityValue)) {
                LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(genieCollectionItem.fields);
                GenieRootViewState.Companion.deepMerge$android_release(mutableMap, drop, genieStateValue);
                LinkedHashMap linkedHashMap = mutableMap;
                if ((2 & 1) != 0) {
                    linkedHashMap = genieCollectionItem.fields;
                }
                GenieIdValue genieIdValue = (2 & 2) != 0 ? genieCollectionItem.identity : null;
                genieCollectionItem.getClass();
                linkedHashMap.getClass();
                genieCollectionItem = new GenieCollectionItem(linkedHashMap, genieIdValue);
            }
            arrayList2.add(genieCollectionItem);
        }
        genieViewState.setValue(new GenieStateValue.CollectionValue(arrayList2), list2);
    }

    @Override // xyz.block.genie.state.GenieViewState
    public final GenieStateValue value(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            if (!Intrinsics.areEqual(list.get(0), this.itemVariable)) {
                return this.parent.value(list);
            }
            List drop = CollectionsKt.drop(list, 1);
            boolean isEmpty = drop.isEmpty();
            GenieCollectionItem genieCollectionItem = this.item;
            if (isEmpty) {
                return new GenieStateValue.StringValue(genieCollectionItem.getIdentityValue());
            }
            GenieStateValue genieStateValue = (GenieStateValue) genieCollectionItem.fields.get(drop.get(0));
            if (genieStateValue != null) {
                if (drop.size() == 1) {
                    return genieStateValue;
                }
                GenieStateValue.GroupValue groupValue = genieStateValue instanceof GenieStateValue.GroupValue ? (GenieStateValue.GroupValue) genieStateValue : null;
                if (groupValue != null) {
                    return resolveInGroup(CollectionsKt.drop(drop, 1), groupValue.value);
                }
            }
        }
        return null;
    }
}
