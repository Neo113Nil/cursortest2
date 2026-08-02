package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.Activity;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Activity$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Activity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Activity.ActivityType activityType = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Activity(activityType, (String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                activityType = new Activity.ActivityType.TileCreation((TileCreationActivity) TileCreationActivity.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                activityType = new Activity.ActivityType.PlasmaFlowCompletion((PlasmaFlowCompletionActivity) PlasmaFlowCompletionActivity.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                activityType = new Activity.ActivityType.ClientCardUpdate((ClientCardUpdateActivity) ClientCardUpdateActivity.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                activityType = new Activity.ActivityType.ClientRenderingUpdate((ClientRenderingUpdateActivity) ClientRenderingUpdateActivity.ADAPTER.decode(protoReader));
            } else if (nextTag == 5) {
                activityType = new Activity.ActivityType.MemoryUpdate((MemoryUpdateActivity) MemoryUpdateActivity.ADAPTER.decode(protoReader));
            } else if (nextTag == 101) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 102) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Activity activity = (Activity) obj;
        reverseProtoWriter.getClass();
        activity.getClass();
        reverseProtoWriter.writeBytes(activity.unknownFields());
        Activity.ActivityType activityType = activity.activity_type;
        if (activityType instanceof Activity.ActivityType.TileCreation) {
            TileCreationActivity.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((Activity.ActivityType.TileCreation) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.PlasmaFlowCompletion) {
            PlasmaFlowCompletionActivity.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Activity.ActivityType.PlasmaFlowCompletion) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.ClientCardUpdate) {
            ClientCardUpdateActivity.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Activity.ActivityType.ClientCardUpdate) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.ClientRenderingUpdate) {
            ClientRenderingUpdateActivity.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((Activity.ActivityType.ClientRenderingUpdate) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.MemoryUpdate) {
            MemoryUpdateActivity.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((Activity.ActivityType.MemoryUpdate) activityType).getValue());
        } else if (activityType != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 102, activity.created);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 101, activity.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Activity activity = (Activity) obj;
        activity.getClass();
        int size$okio = activity.unknownFields().getSize$okio();
        Activity.ActivityType activityType = activity.activity_type;
        if (activityType instanceof Activity.ActivityType.TileCreation) {
            encodedSizeWithTag = TileCreationActivity.ADAPTER.encodedSizeWithTag(1, ((Activity.ActivityType.TileCreation) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.PlasmaFlowCompletion) {
            encodedSizeWithTag = PlasmaFlowCompletionActivity.ADAPTER.encodedSizeWithTag(2, ((Activity.ActivityType.PlasmaFlowCompletion) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.ClientCardUpdate) {
            encodedSizeWithTag = ClientCardUpdateActivity.ADAPTER.encodedSizeWithTag(3, ((Activity.ActivityType.ClientCardUpdate) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.ClientRenderingUpdate) {
            encodedSizeWithTag = ClientRenderingUpdateActivity.ADAPTER.encodedSizeWithTag(4, ((Activity.ActivityType.ClientRenderingUpdate) activityType).getValue());
        } else {
            if (!(activityType instanceof Activity.ActivityType.MemoryUpdate)) {
                if (activityType != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.INT64.encodedSizeWithTag(102, activity.created) + ProtoAdapter.STRING.encodedSizeWithTag(101, activity.id) + size$okio;
            }
            encodedSizeWithTag = MemoryUpdateActivity.ADAPTER.encodedSizeWithTag(5, ((Activity.ActivityType.MemoryUpdate) activityType).getValue());
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.INT64.encodedSizeWithTag(102, activity.created) + ProtoAdapter.STRING.encodedSizeWithTag(101, activity.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Activity activity = (Activity) obj;
        activity.getClass();
        ByteString byteString = ByteString.EMPTY;
        Activity.ActivityType activityType = activity.activity_type;
        String str = activity.id;
        Long l = activity.created;
        byteString.getClass();
        return new Activity(activityType, str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Activity activity = (Activity) obj;
        activity.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 101, activity.id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 102, activity.created);
        Activity.ActivityType activityType = activity.activity_type;
        if (activityType instanceof Activity.ActivityType.TileCreation) {
            TileCreationActivity.ADAPTER.encodeWithTag(protoWriter, 1, ((Activity.ActivityType.TileCreation) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.PlasmaFlowCompletion) {
            PlasmaFlowCompletionActivity.ADAPTER.encodeWithTag(protoWriter, 2, ((Activity.ActivityType.PlasmaFlowCompletion) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.ClientCardUpdate) {
            ClientCardUpdateActivity.ADAPTER.encodeWithTag(protoWriter, 3, ((Activity.ActivityType.ClientCardUpdate) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.ClientRenderingUpdate) {
            ClientRenderingUpdateActivity.ADAPTER.encodeWithTag(protoWriter, 4, ((Activity.ActivityType.ClientRenderingUpdate) activityType).getValue());
        } else if (activityType instanceof Activity.ActivityType.MemoryUpdate) {
            MemoryUpdateActivity.ADAPTER.encodeWithTag(protoWriter, 5, ((Activity.ActivityType.MemoryUpdate) activityType).getValue());
        } else if (activityType != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(activity.unknownFields());
    }
}
