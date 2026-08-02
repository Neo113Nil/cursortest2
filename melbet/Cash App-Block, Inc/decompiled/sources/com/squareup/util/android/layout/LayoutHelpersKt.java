package com.squareup.util.android.layout;

import android.view.View;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.db2.entities.Sync_entity;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class LayoutHelpersKt {
    public static final SyncEntity access$toMultiplatform(Sync_entity sync_entity) {
        SyncTopic syncTopic = new SyncTopic(sync_entity.topic);
        String str = sync_entity.entity_id;
        SyncEntityType syncEntityType = new SyncEntityType(sync_entity.f1124type);
        Object decode = com.squareup.protos.franklin.common.SyncEntity.ADAPTER.decode(sync_entity.entity);
        Long l = sync_entity.sync_entity_version;
        Integer num = sync_entity.sync_value_type;
        return new SyncEntity(syncTopic, str, syncEntityType, decode, l, num != null ? new SyncValueType(num.intValue()) : null);
    }

    public static ViewEvent.Inp fromJsonObject(JsonObject jsonObject) {
        try {
            long asLong = jsonObject.get("duration").getAsLong();
            JsonElement jsonElement = jsonObject.get("timestamp");
            Long valueOf = jsonElement != null ? Long.valueOf(jsonElement.getAsLong()) : null;
            JsonElement jsonElement2 = jsonObject.get("target_selector");
            return new ViewEvent.Inp(asLong, valueOf, jsonElement2 != null ? jsonElement2.getAsString() : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Inp", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Inp", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Inp", e3);
            return null;
        }
    }

    public static final void layoutBy(View view, Anchor anchor, int i, int i2) {
        view.getClass();
        int ordinal = anchor.ordinal();
        if (ordinal == 0) {
            view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
            return;
        }
        if (ordinal == 1) {
            view.layout(i - view.getMeasuredWidth(), i2, i, view.getMeasuredHeight() + i2);
            return;
        }
        if (ordinal == 2) {
            view.layout(i, i2 - view.getMeasuredHeight(), view.getMeasuredWidth() + i, i2);
        } else {
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            int measuredWidth = i - (view.getMeasuredWidth() / 2);
            int measuredHeight = i2 - (view.getMeasuredHeight() / 2);
            view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
        }
    }
}
