package com.squareup.util.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.models.ResetTrigger;
import com.squareup.cash.clientsync.models.SyncRange;
import com.squareup.cash.clientsync.network.ClientSyncResponseContext;
import com.squareup.cash.clientsync.network.GatewayResponse;
import com.squareup.cash.clientsync.network.GatewayTopicError;
import com.squareup.cash.clientsync.network.GatewayTopicResponse;
import com.squareup.cash.clientsync.network.ResyncPolicy;
import com.squareup.cash.clientsync.network.ServerSyncResponse;
import com.squareup.cash.clientsync.network.SyncEntityAction;
import com.squareup.cash.clientsync.pipeline.DeleteAllRangesAndEntities;
import com.squareup.cash.clientsync.pipeline.DeleteEntity;
import com.squareup.cash.clientsync.pipeline.EntityStorageOperation;
import com.squareup.cash.clientsync.pipeline.ReplaceRanges;
import com.squareup.cash.clientsync.pipeline.StorageOperationBatch;
import com.squareup.cash.clientsync.pipeline.SyncResponseOperation;
import com.squareup.cash.clientsync.pipeline.TaskId;
import com.squareup.cash.clientsync.pipeline.UpdateEntity;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public abstract class ModifierKt {
    public static final Modifier clipOffscreen(Modifier modifier, Shape shape) {
        modifier.getClass();
        shape.getClass();
        return ColorKt.m687graphicsLayer_6ThJ44$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, shape, 452607);
    }

    public static final StorageOperationBatch createStorageOperationBatch(TaskId taskId, SyncResponseOperation.Origin origin, ServerSyncResponse serverSyncResponse) {
        List list;
        taskId.getClass();
        origin.getClass();
        serverSyncResponse.getClass();
        if (!(serverSyncResponse instanceof GatewayResponse)) {
            if (!(serverSyncResponse instanceof ClientSyncResponseContext)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ClientSyncResponseContext clientSyncResponseContext = (ClientSyncResponseContext) serverSyncResponse;
            ArrayList arrayList = new ArrayList();
            if (clientSyncResponseContext.resyncPolicy != ResyncPolicy.NONE) {
                arrayList.add(new DeleteAllRangesAndEntities(taskId, ResetTrigger.ImmediateForceResync));
            }
            ArrayList arrayList2 = clientSyncResponseContext.entityActions;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(toStorageOperation((SyncEntityAction) it.next(), taskId));
            }
            arrayList.addAll(arrayList3);
            return new StorageOperationBatch(arrayList);
        }
        GatewayResponse gatewayResponse = (GatewayResponse) serverSyncResponse;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = gatewayResponse.topicResponses;
        ArrayList arrayList6 = gatewayResponse.topicErrors;
        if (!arrayList5.isEmpty() || !arrayList6.isEmpty()) {
            if (!arrayList5.isEmpty()) {
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    if (((GatewayTopicResponse) it2.next()).resyncType != null) {
                        arrayList4.add(new DeleteAllRangesAndEntities(taskId, ResetTrigger.ImmediateForceResync));
                        break;
                    }
                }
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(((GatewayTopicResponse) it3.next()).entityActions, arrayList7);
            }
            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
            Iterator it4 = arrayList7.iterator();
            while (it4.hasNext()) {
                arrayList8.add(toStorageOperation((SyncEntityAction) it4.next(), taskId));
            }
            arrayList4.addAll(arrayList8);
            if (origin instanceof SyncResponseOperation.Origin.FromSyncRequest) {
                list = ((SyncResponseOperation.Origin.FromSyncRequest) origin).requestRanges;
            } else {
                if (!(origin instanceof SyncResponseOperation.Origin.FromResponseContext)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                list = EmptyList.INSTANCE;
            }
            ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                arrayList9.add(((GatewayTopicResponse) it5.next()).range);
            }
            ArrayList arrayList10 = new ArrayList();
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                SyncRange syncRange = ((GatewayTopicError) it6.next()).range;
                if (syncRange != null) {
                    arrayList10.add(syncRange);
                }
            }
            arrayList4.add(new ReplaceRanges(taskId, list, CollectionsKt.plus((Iterable) arrayList10, (Collection) arrayList9)));
        }
        return new StorageOperationBatch(arrayList4);
    }

    public static ViewEvent.PerformanceCls fromJsonObject(JsonObject jsonObject) {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        try {
            Number asNumber = jsonObject.get("score").getAsNumber();
            JsonElement jsonElement = jsonObject.get("timestamp");
            Long valueOf = jsonElement != null ? Long.valueOf(jsonElement.getAsLong()) : null;
            JsonElement jsonElement2 = jsonObject.get("target_selector");
            String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("previous_rect");
            ViewEvent.PreviousRect fromJsonObject = (jsonElement3 == null || (asJsonObject2 = jsonElement3.getAsJsonObject()) == null) ? null : MotionKt.fromJsonObject(asJsonObject2);
            JsonElement jsonElement4 = jsonObject.get("current_rect");
            ViewEvent.PreviousRect fromJsonObject2 = (jsonElement4 == null || (asJsonObject = jsonElement4.getAsJsonObject()) == null) ? null : MotionKt.fromJsonObject(asJsonObject);
            asNumber.getClass();
            return new ViewEvent.PerformanceCls(asNumber, valueOf, asString, fromJsonObject, fromJsonObject2);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type PerformanceCls", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type PerformanceCls", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type PerformanceCls", e3);
            return null;
        }
    }

    public static final EntityStorageOperation toStorageOperation(SyncEntityAction syncEntityAction, TaskId taskId) {
        if (syncEntityAction instanceof SyncEntityAction.Update) {
            return new UpdateEntity(taskId, ((SyncEntityAction.Update) syncEntityAction).entity);
        }
        if (syncEntityAction instanceof SyncEntityAction.Delete) {
            return new DeleteEntity(taskId, ((SyncEntityAction.Delete) syncEntityAction).entity);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
