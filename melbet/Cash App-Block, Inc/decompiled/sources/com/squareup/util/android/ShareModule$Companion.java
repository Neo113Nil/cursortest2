package com.squareup.util.android;

import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.protos.franklin.common.SyncEntityType;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes8.dex */
public abstract class ShareModule$Companion {
    public static ViewEvent.Fbc fromJsonObject(JsonObject jsonObject) {
        try {
            return new ViewEvent.Fbc(jsonObject.get("timestamp").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Fbc", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Fbc", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Fbc", e3);
            return null;
        }
    }

    public static SharedFlowImpl provideShareResults(RealShareResultsReceiver realShareResultsReceiver) {
        return realShareResultsReceiver.shareResults;
    }

    public static final SyncEntity toMultiplatform(com.squareup.protos.franklin.common.SyncEntity syncEntity, SyncTopic syncTopic) {
        syncEntity.getClass();
        syncTopic.getClass();
        String str = syncEntity.entity_id;
        str.getClass();
        SyncEntityType syncEntityType = syncEntity.f1388type;
        syncEntityType.getClass();
        com.squareup.cash.clientsync.models.SyncEntityType syncEntityType2 = new com.squareup.cash.clientsync.models.SyncEntityType(syncEntityType.value);
        Long l = syncEntity.version;
        Integer syncValueTypeAsInt = StrictModes.getSyncValueTypeAsInt(syncEntity);
        return new SyncEntity(syncTopic, str, syncEntityType2, syncEntity, l, syncValueTypeAsInt != null ? new SyncValueType(syncValueTypeAsInt.intValue()) : null);
    }
}
