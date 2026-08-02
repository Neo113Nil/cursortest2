package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityItemId$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemId;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityItemId$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityItemId((String) obj, (ActivityItemType) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ActivityItemType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityItemId activityItemId = (ActivityItemId) obj;
        reverseProtoWriter.getClass();
        activityItemId.getClass();
        reverseProtoWriter.writeBytes(activityItemId.unknownFields());
        ActivityItemType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activityItemId.type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, activityItemId.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityItemId activityItemId = (ActivityItemId) obj;
        activityItemId.getClass();
        return ActivityItemType.ADAPTER.encodedSizeWithTag(2, activityItemId.type) + ProtoAdapter.STRING.encodedSizeWithTag(1, activityItemId.id) + activityItemId.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityItemId activityItemId = (ActivityItemId) obj;
        activityItemId.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = activityItemId.id;
        ActivityItemType activityItemType = activityItemId.type;
        byteString.getClass();
        return new ActivityItemId(str, activityItemType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityItemId activityItemId = (ActivityItemId) obj;
        activityItemId.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, activityItemId.id);
        ActivityItemType.ADAPTER.encodeWithTag(protoWriter, 2, activityItemId.type);
        protoWriter.writeBytes(activityItemId.unknownFields());
    }
}
