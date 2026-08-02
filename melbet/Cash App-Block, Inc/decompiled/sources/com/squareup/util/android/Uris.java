package com.squareup.util.android;

import android.content.Context;
import android.net.Uri;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncRange;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.network.ClientSyncResponseContext;
import com.squareup.cash.clientsync.network.GatewayRequest;
import com.squareup.cash.clientsync.network.GatewayResponse;
import com.squareup.cash.clientsync.network.GatewayTopicError;
import com.squareup.cash.clientsync.network.GatewayTopicRequest;
import com.squareup.cash.clientsync.network.GatewayTopicResponse;
import com.squareup.cash.clientsync.network.ResyncPolicy;
import com.squareup.cash.clientsync.network.SyncEntityAction;
import com.squareup.protos.cash.syncentitygateway.api.BatchSyncTopicEntitiesClientRequest;
import com.squareup.protos.cash.syncentitygateway.api.BatchSyncTopicEntitiesClientResponse;
import com.squareup.protos.cash.syncentitygateway.api.SyncTopicEntitiesClientError;
import com.squareup.protos.cash.syncentitygateway.api.SyncTopicEntitiesClientRequest;
import com.squareup.protos.cash.syncentitygateway.api.SyncTopicEntitiesClientResponse;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.Trigger;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes8.dex */
public abstract class Uris {
    public static ViewEvent.FlutterBuildTime fromJsonObject(JsonObject jsonObject) {
        try {
            Number asNumber = jsonObject.get("min").getAsNumber();
            Number asNumber2 = jsonObject.get("max").getAsNumber();
            Number asNumber3 = jsonObject.get("average").getAsNumber();
            JsonElement jsonElement = jsonObject.get("metric_max");
            Number asNumber4 = jsonElement != null ? jsonElement.getAsNumber() : null;
            asNumber.getClass();
            asNumber2.getClass();
            asNumber3.getClass();
            return new ViewEvent.FlutterBuildTime(asNumber, asNumber2, asNumber3, asNumber4);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type FlutterBuildTime", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type FlutterBuildTime", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type FlutterBuildTime", e3);
            return null;
        }
    }

    public static final Uri getUriForResource(Context context, int i) {
        context.getClass();
        return Uri.parse("android.resource://" + context.getPackageName() + "/" + i);
    }

    public static final GatewayResponse toMultiplatform(BatchSyncTopicEntitiesClientResponse batchSyncTopicEntitiesClientResponse) {
        SyncTrigger syncTrigger;
        batchSyncTopicEntitiesClientResponse.getClass();
        List list = batchSyncTopicEntitiesClientResponse.successful_responses;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (true) {
            ResyncPolicy resyncPolicy = null;
            if (!it.hasNext()) {
                break;
            }
            SyncTopicEntitiesClientResponse syncTopicEntitiesClientResponse = (SyncTopicEntitiesClientResponse) it.next();
            syncTopicEntitiesClientResponse.getClass();
            Integer num = syncTopicEntitiesClientResponse.topic;
            num.getClass();
            SyncTopic syncTopic = new SyncTopic(num.intValue());
            List list2 = syncTopicEntitiesClientResponse.entities;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                SyncEntity multiplatform = ShareModule$Companion.toMultiplatform((com.squareup.protos.franklin.common.SyncEntity) it2.next(), syncTopic);
                arrayList2.add(!Intrinsics.areEqual(((com.squareup.protos.franklin.common.SyncEntity) multiplatform.entityProto).deleted, Boolean.TRUE) ? new SyncEntityAction.Update(multiplatform) : new SyncEntityAction.Delete(multiplatform));
            }
            Boolean bool = syncTopicEntitiesClientResponse.has_more;
            bool.getClass();
            boolean booleanValue = bool.booleanValue();
            ByteString byteString = syncTopicEntitiesClientResponse.sync_range;
            byteString.getClass();
            SyncRange syncRange = new SyncRange(syncTopic, byteString.toByteArray());
            SyncEntitiesResponse.RefreshAllEntitiesType refreshAllEntitiesType = syncTopicEntitiesClientResponse.refresh_all_entities;
            if (refreshAllEntitiesType != null) {
                resyncPolicy = toMultiplatform(refreshAllEntitiesType);
            }
            arrayList.add(new GatewayTopicResponse(syncTopic, syncRange, arrayList2, booleanValue, resyncPolicy));
        }
        List<SyncTopicEntitiesClientError> list3 = batchSyncTopicEntitiesClientResponse.failed_requests;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (SyncTopicEntitiesClientError syncTopicEntitiesClientError : list3) {
            syncTopicEntitiesClientError.getClass();
            SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest = syncTopicEntitiesClientError.request;
            syncTopicEntitiesClientRequest.getClass();
            Integer num2 = syncTopicEntitiesClientRequest.topic;
            num2.getClass();
            SyncTopic syncTopic2 = new SyncTopic(num2.intValue());
            ByteString byteString2 = syncTopicEntitiesClientRequest.sync_range;
            SyncRange syncRange2 = byteString2 != null ? new SyncRange(syncTopic2, byteString2.toByteArray()) : null;
            Trigger trigger = syncTopicEntitiesClientRequest.trigger;
            trigger.getClass();
            switch (trigger) {
                case DO_NOT_USE_TRIGGER:
                    a$$ExternalSyntheticBUOutline0.m$1("Unsupported trigger");
                    return null;
                case APP_LAUNCH:
                    syncTrigger = SyncTrigger.APP_LAUNCH;
                    break;
                case PUSH_NOTIFICATION:
                    syncTrigger = SyncTrigger.PUSH_NOTIFICATION;
                    break;
                case IMMEDIATE_NEXT_CALL:
                    syncTrigger = SyncTrigger.IMMEDIATE_NEXT_CALL;
                    break;
                case DELAYED_NEXT_CALL:
                    syncTrigger = SyncTrigger.DELAYED_NEXT_CALL;
                    break;
                case SERVER_PUSH:
                    syncTrigger = SyncTrigger.SERVER_PUSH;
                    break;
                case POLLING:
                    syncTrigger = SyncTrigger.POLLING;
                    break;
                case USER_ACTION:
                    syncTrigger = SyncTrigger.USER_ACTION;
                    break;
                case WIDGET:
                    syncTrigger = SyncTrigger.WIDGET;
                    break;
                case DEBUG:
                    syncTrigger = SyncTrigger.DEBUG;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
            arrayList3.add(new GatewayTopicError(new GatewayTopicRequest(syncTopic2, syncRange2, syncTrigger), syncRange2, syncTopicEntitiesClientError.error_code, syncTopicEntitiesClientError.error_message, syncTopicEntitiesClientError.retry_after_secs));
        }
        return new GatewayResponse(arrayList, arrayList3);
    }

    public static final BatchSyncTopicEntitiesClientRequest toProto(GatewayRequest gatewayRequest) {
        ByteString byteString;
        Trigger trigger;
        gatewayRequest.getClass();
        List<GatewayTopicRequest> list = gatewayRequest.topicRequests;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (GatewayTopicRequest gatewayTopicRequest : list) {
            gatewayTopicRequest.getClass();
            Integer valueOf = Integer.valueOf(gatewayTopicRequest.topic.value);
            SyncRange syncRange = gatewayTopicRequest.range;
            if (syncRange != null) {
                ByteString.Companion companion = ByteString.Companion;
                byteString = ByteString.Companion.of$default(syncRange.bytes);
            } else {
                byteString = null;
            }
            switch (gatewayTopicRequest.trigger.ordinal()) {
                case 0:
                    trigger = Trigger.APP_LAUNCH;
                    break;
                case 1:
                    trigger = Trigger.PUSH_NOTIFICATION;
                    break;
                case 2:
                    trigger = Trigger.IMMEDIATE_NEXT_CALL;
                    break;
                case 3:
                    trigger = Trigger.DELAYED_NEXT_CALL;
                    break;
                case 4:
                    trigger = Trigger.SERVER_PUSH;
                    break;
                case 5:
                    trigger = Trigger.POLLING;
                    break;
                case 6:
                    trigger = Trigger.USER_ACTION;
                    break;
                case 7:
                    trigger = Trigger.WIDGET;
                    break;
                case 8:
                    trigger = Trigger.USER_ACTION;
                    break;
                case 9:
                    trigger = Trigger.DEBUG;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
            arrayList.add(new SyncTopicEntitiesClientRequest(valueOf, byteString, trigger, ByteString.EMPTY));
        }
        List list2 = gatewayRequest.legacyRanges;
        list2.getClass();
        List<SyncRange> list3 = list2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (SyncRange syncRange2 : list3) {
            syncRange2.getClass();
            ByteString.Companion companion2 = ByteString.Companion;
            arrayList2.add(ByteString.Companion.of$default(syncRange2.bytes));
        }
        return new BatchSyncTopicEntitiesClientRequest(arrayList, arrayList2, ByteString.EMPTY);
    }

    public static final ClientSyncResponseContext toMultiplatform(SyncEntitiesResponse syncEntitiesResponse) {
        SyncEntityAction delete;
        List list = syncEntitiesResponse.entities;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SyncEntity multiplatform = ShareModule$Companion.toMultiplatform((com.squareup.protos.franklin.common.SyncEntity) it.next(), SyncTopic.UNKNOWN);
            if (!Intrinsics.areEqual(((com.squareup.protos.franklin.common.SyncEntity) multiplatform.entityProto).deleted, Boolean.TRUE)) {
                delete = new SyncEntityAction.Update(multiplatform);
            } else {
                delete = new SyncEntityAction.Delete(multiplatform);
            }
            arrayList.add(delete);
        }
        SyncEntitiesResponse.RefreshAllEntitiesType refreshAllEntitiesType = syncEntitiesResponse.refresh_all_entities_type;
        return new ClientSyncResponseContext(arrayList, refreshAllEntitiesType != null ? toMultiplatform(refreshAllEntitiesType) : ResyncPolicy.NONE);
    }

    public static final ResyncPolicy toMultiplatform(SyncEntitiesResponse.RefreshAllEntitiesType refreshAllEntitiesType) {
        refreshAllEntitiesType.getClass();
        int ordinal = refreshAllEntitiesType.ordinal();
        if (ordinal == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Unsupported resync policy");
            return null;
        }
        if (ordinal == 1) {
            return ResyncPolicy.IMMEDIATE;
        }
        if (ordinal == 2) {
            return ResyncPolicy.GRADUAL;
        }
        if (ordinal == 3) {
            return ResyncPolicy.NONE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
