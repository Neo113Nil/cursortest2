package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemGlobalId;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityItemGlobalId$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ActivityItemGlobalId.ActivityId activityId = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityItemGlobalId(activityId, (ActivityToken) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                activityId = new ActivityItemGlobalId.ActivityId.ActivityItemId((ActivityItemId) ActivityItemId.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(ActivityToken.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                activityId = new ActivityItemGlobalId.ActivityId.ActivityRowId((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityItemGlobalId activityItemGlobalId = (ActivityItemGlobalId) obj;
        reverseProtoWriter.getClass();
        activityItemGlobalId.getClass();
        reverseProtoWriter.writeBytes(activityItemGlobalId.unknownFields());
        ActivityItemGlobalId.ActivityId activityId = activityItemGlobalId.activity_id;
        if (activityId instanceof ActivityItemGlobalId.ActivityId.ActivityItemId) {
            ActivityItemId.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ActivityItemGlobalId.ActivityId.ActivityItemId) activityId).getValue());
        } else if (activityId instanceof ActivityItemGlobalId.ActivityId.ActivityRowId) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((ActivityItemGlobalId.ActivityId.ActivityRowId) activityId).getValue());
        } else if (activityId != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ActivityToken.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activityItemGlobalId.primary_activity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ActivityItemGlobalId activityItemGlobalId = (ActivityItemGlobalId) obj;
        activityItemGlobalId.getClass();
        int size$okio = activityItemGlobalId.unknownFields().getSize$okio();
        ActivityItemGlobalId.ActivityId activityId = activityItemGlobalId.activity_id;
        if (activityId instanceof ActivityItemGlobalId.ActivityId.ActivityItemId) {
            encodedSizeWithTag = ActivityItemId.ADAPTER.encodedSizeWithTag(1, ((ActivityItemGlobalId.ActivityId.ActivityItemId) activityId).getValue());
        } else {
            if (!(activityId instanceof ActivityItemGlobalId.ActivityId.ActivityRowId)) {
                if (activityId != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ActivityToken.ADAPTER.encodedSizeWithTag(2, activityItemGlobalId.primary_activity_token) + size$okio;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, ((ActivityItemGlobalId.ActivityId.ActivityRowId) activityId).getValue());
        }
        size$okio += encodedSizeWithTag;
        return ActivityToken.ADAPTER.encodedSizeWithTag(2, activityItemGlobalId.primary_activity_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityItemGlobalId activityItemGlobalId = (ActivityItemGlobalId) obj;
        activityItemGlobalId.getClass();
        ActivityToken activityToken = activityItemGlobalId.primary_activity_token;
        return ActivityItemGlobalId.copy$default(activityItemGlobalId, activityToken != null ? (ActivityToken) ActivityToken.ADAPTER.redact(activityToken) : null, ByteString.EMPTY, 1);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityItemGlobalId activityItemGlobalId = (ActivityItemGlobalId) obj;
        activityItemGlobalId.getClass();
        ActivityToken.ADAPTER.encodeWithTag(protoWriter, 2, activityItemGlobalId.primary_activity_token);
        ActivityItemGlobalId.ActivityId activityId = activityItemGlobalId.activity_id;
        if (activityId instanceof ActivityItemGlobalId.ActivityId.ActivityItemId) {
            ActivityItemId.ADAPTER.encodeWithTag(protoWriter, 1, ((ActivityItemGlobalId.ActivityId.ActivityItemId) activityId).getValue());
        } else if (activityId instanceof ActivityItemGlobalId.ActivityId.ActivityRowId) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ((ActivityItemGlobalId.ActivityId.ActivityRowId) activityId).getValue());
        } else if (activityId != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(activityItemGlobalId.unknownFields());
    }
}
