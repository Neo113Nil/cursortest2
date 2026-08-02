package xyz.block.genie.expressions;

import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.room.TransactorKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import squareup.cash.savings.GoalFolder;
import xyz.block.genie.expressions.EvaluatedValue;
import xyz.block.genie.expressions.ExpressionError;
import xyz.block.genie.state.GenieCollectionItem;
import xyz.block.genie.state.GenieIdValue;
import xyz.block.genie.state.GenieStateValue;
import xyz.block.protos.genie.Collection;
import xyz.block.protos.genie.CollectionItem;
import xyz.block.protos.genie.IdValue;
import xyz.block.protos.genie.KeyPath;
import xyz.block.protos.genie.KeyValueMap;
import xyz.block.protos.genie.UnaryOp;

/* loaded from: classes10.dex */
public abstract class ValueConversionsKt {
    public static final EvaluatedValue toEvaluatedValue(GenieStateValue genieStateValue) {
        genieStateValue.getClass();
        if (genieStateValue instanceof GenieStateValue.StringValue) {
            return new EvaluatedValue.StringValue(((GenieStateValue.StringValue) genieStateValue).value);
        }
        if (genieStateValue instanceof GenieStateValue.IntValue) {
            return new EvaluatedValue.IntValue(((GenieStateValue.IntValue) genieStateValue).value);
        }
        if (genieStateValue instanceof GenieStateValue.FloatValue) {
            return new EvaluatedValue.FloatValue(((GenieStateValue.FloatValue) genieStateValue).value);
        }
        if (genieStateValue instanceof GenieStateValue.BoolValue) {
            return new EvaluatedValue.BoolValue(((GenieStateValue.BoolValue) genieStateValue).value);
        }
        if (genieStateValue instanceof GenieStateValue.BlobValue) {
            return new EvaluatedValue.BlobValue(((GenieStateValue.BlobValue) genieStateValue).value);
        }
        if (genieStateValue instanceof GenieStateValue.GroupValue) {
            Map map = ((GenieStateValue.GroupValue) genieStateValue).value;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), toEvaluatedValue((GenieStateValue) entry.getValue()));
            }
            return new EvaluatedValue.GroupValue(linkedHashMap);
        }
        if (!(genieStateValue instanceof GenieStateValue.CollectionValue)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        ArrayList arrayList = ((GenieStateValue.CollectionValue) genieStateValue).items;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toProtoCollectionItem((GenieCollectionItem) it.next()));
        }
        return new EvaluatedValue.CollectionValue(arrayList2);
    }

    public static final GenieStateValue toGenieStateValue(EvaluatedValue evaluatedValue) {
        evaluatedValue.getClass();
        if (evaluatedValue instanceof EvaluatedValue.StringValue) {
            return new GenieStateValue.StringValue(((EvaluatedValue.StringValue) evaluatedValue).value);
        }
        if (evaluatedValue instanceof EvaluatedValue.IntValue) {
            return new GenieStateValue.IntValue(((EvaluatedValue.IntValue) evaluatedValue).value);
        }
        if (evaluatedValue instanceof EvaluatedValue.FloatValue) {
            return new GenieStateValue.FloatValue(((EvaluatedValue.FloatValue) evaluatedValue).value);
        }
        if (evaluatedValue instanceof EvaluatedValue.BoolValue) {
            return new GenieStateValue.BoolValue(((EvaluatedValue.BoolValue) evaluatedValue).value);
        }
        if (evaluatedValue instanceof EvaluatedValue.BlobValue) {
            return new GenieStateValue.BlobValue(((EvaluatedValue.BlobValue) evaluatedValue).value);
        }
        if (evaluatedValue instanceof EvaluatedValue.GroupValue) {
            LinkedHashMap linkedHashMap = ((EvaluatedValue.GroupValue) evaluatedValue).fields;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), toGenieStateValue((EvaluatedValue) entry.getValue()));
            }
            return new GenieStateValue.GroupValue(linkedHashMap2);
        }
        if (!(evaluatedValue instanceof EvaluatedValue.CollectionValue)) {
            if (evaluatedValue instanceof EvaluatedValue.Unresolved) {
                throw new ExpressionError.UnresolvedKeyPath(EmptyList.INSTANCE);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        ArrayList arrayList = ((EvaluatedValue.CollectionValue) evaluatedValue).items;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(CameraCaptureCallbacks.fromProto((CollectionItem) it.next()));
        }
        return new GenieStateValue.CollectionValue(arrayList2);
    }

    public static final KeyValueMap.Entry toKeyValueEntry(String str, GenieStateValue genieStateValue) {
        GoalFolder.Builder builder = new GoalFolder.Builder(13);
        builder.token = str;
        if (genieStateValue instanceof GenieStateValue.StringValue) {
            builder.icon_unicode = ((GenieStateValue.StringValue) genieStateValue).value;
            builder.completion_token = null;
            builder.label = null;
            builder.met_goal = null;
            builder.goal_flow_parameters = null;
            builder.goal_amount = null;
            builder.goal_progress_percentage = null;
            return builder.build();
        }
        if (genieStateValue instanceof GenieStateValue.IntValue) {
            builder.completion_token = Long.valueOf(((GenieStateValue.IntValue) genieStateValue).value);
            builder.icon_unicode = null;
            builder.label = null;
            builder.met_goal = null;
            builder.goal_flow_parameters = null;
            builder.goal_amount = null;
            builder.goal_progress_percentage = null;
            return builder.build();
        }
        if (genieStateValue instanceof GenieStateValue.FloatValue) {
            builder.label = Double.valueOf(((GenieStateValue.FloatValue) genieStateValue).value);
            builder.icon_unicode = null;
            builder.completion_token = null;
            builder.met_goal = null;
            builder.goal_flow_parameters = null;
            builder.goal_amount = null;
            builder.goal_progress_percentage = null;
            return builder.build();
        }
        if (genieStateValue instanceof GenieStateValue.BoolValue) {
            builder.met_goal = Boolean.valueOf(((GenieStateValue.BoolValue) genieStateValue).value);
            builder.icon_unicode = null;
            builder.completion_token = null;
            builder.label = null;
            builder.goal_flow_parameters = null;
            builder.goal_amount = null;
            builder.goal_progress_percentage = null;
            return builder.build();
        }
        if (genieStateValue instanceof GenieStateValue.BlobValue) {
            builder.goal_flow_parameters = ((GenieStateValue.BlobValue) genieStateValue).value;
            builder.icon_unicode = null;
            builder.completion_token = null;
            builder.label = null;
            builder.met_goal = null;
            builder.goal_amount = null;
            builder.goal_progress_percentage = null;
            return builder.build();
        }
        if (genieStateValue instanceof GenieStateValue.GroupValue) {
            KeyPath.Builder builder2 = new KeyPath.Builder();
            Map map = ((GenieStateValue.GroupValue) genieStateValue).value;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(toKeyValueEntry((String) entry.getKey(), (GenieStateValue) entry.getValue()));
            }
            TransactorKt.checkElementsNotNull(arrayList);
            builder2.segments = arrayList;
            builder.goal_amount = builder2.build();
            builder.icon_unicode = null;
            builder.completion_token = null;
            builder.label = null;
            builder.met_goal = null;
            builder.goal_flow_parameters = null;
            builder.goal_progress_percentage = null;
            return builder.build();
        }
        if (!(genieStateValue instanceof GenieStateValue.CollectionValue)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        Collection.Builder builder3 = new Collection.Builder(0);
        ArrayList arrayList2 = ((GenieStateValue.CollectionValue) genieStateValue).items;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(toProtoCollectionItem((GenieCollectionItem) it.next()));
        }
        TransactorKt.checkElementsNotNull(arrayList3);
        builder3.items = arrayList3;
        builder.goal_progress_percentage = new Collection(builder3.items, builder3.buildUnknownFields());
        builder.icon_unicode = null;
        builder.completion_token = null;
        builder.label = null;
        builder.met_goal = null;
        builder.goal_flow_parameters = null;
        builder.goal_amount = null;
        return builder.build();
    }

    public static final CollectionItem toProtoCollectionItem(GenieCollectionItem genieCollectionItem) {
        Map map = genieCollectionItem.fields;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(toKeyValueEntry((String) entry.getKey(), (GenieStateValue) entry.getValue()));
        }
        UnaryOp.Builder builder = new UnaryOp.Builder(1);
        KeyPath.Builder builder2 = new KeyPath.Builder();
        TransactorKt.checkElementsNotNull(arrayList);
        builder2.segments = arrayList;
        builder.operator_ = builder2.build();
        GenieIdValue genieIdValue = genieCollectionItem.identity;
        if (genieIdValue != null) {
            IdValue.Builder builder3 = new IdValue.Builder(0);
            String str = genieIdValue.server;
            if (str != null) {
                builder3.server = str;
                builder3.local = null;
            }
            String str2 = genieIdValue.local;
            if (str2 != null) {
                builder3.local = str2;
                builder3.server = null;
            }
            builder.operand = builder3.build();
        }
        return builder.build();
    }
}
