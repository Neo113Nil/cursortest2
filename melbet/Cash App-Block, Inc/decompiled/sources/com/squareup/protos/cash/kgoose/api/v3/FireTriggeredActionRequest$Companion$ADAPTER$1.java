package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/FireTriggeredActionRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/FireTriggeredActionRequest;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FireTriggeredActionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FireTriggeredActionRequest((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (Long) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FireTriggeredActionRequest fireTriggeredActionRequest = (FireTriggeredActionRequest) obj;
        reverseProtoWriter.getClass();
        fireTriggeredActionRequest.getClass();
        reverseProtoWriter.writeBytes(fireTriggeredActionRequest.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, fireTriggeredActionRequest.run_after);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, fireTriggeredActionRequest.event_payload_json);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, fireTriggeredActionRequest.trigger_reason);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, fireTriggeredActionRequest.event_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, fireTriggeredActionRequest.event_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fireTriggeredActionRequest.creator);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, fireTriggeredActionRequest.triggered_action_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FireTriggeredActionRequest fireTriggeredActionRequest = (FireTriggeredActionRequest) obj;
        fireTriggeredActionRequest.getClass();
        int size$okio = fireTriggeredActionRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(7, fireTriggeredActionRequest.run_after) + protoAdapter.encodedSizeWithTag(6, fireTriggeredActionRequest.event_payload_json) + protoAdapter.encodedSizeWithTag(5, fireTriggeredActionRequest.trigger_reason) + protoAdapter.encodedSizeWithTag(4, fireTriggeredActionRequest.event_id) + protoAdapter.encodedSizeWithTag(3, fireTriggeredActionRequest.event_type) + protoAdapter.encodedSizeWithTag(2, fireTriggeredActionRequest.creator) + protoAdapter.encodedSizeWithTag(1, fireTriggeredActionRequest.triggered_action_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FireTriggeredActionRequest fireTriggeredActionRequest = (FireTriggeredActionRequest) obj;
        fireTriggeredActionRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = fireTriggeredActionRequest.triggered_action_id;
        String str2 = fireTriggeredActionRequest.creator;
        String str3 = fireTriggeredActionRequest.event_type;
        String str4 = fireTriggeredActionRequest.event_id;
        String str5 = fireTriggeredActionRequest.trigger_reason;
        String str6 = fireTriggeredActionRequest.event_payload_json;
        Long l = fireTriggeredActionRequest.run_after;
        byteString.getClass();
        return new FireTriggeredActionRequest(str, str2, str3, str4, str5, str6, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FireTriggeredActionRequest fireTriggeredActionRequest = (FireTriggeredActionRequest) obj;
        fireTriggeredActionRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, fireTriggeredActionRequest.triggered_action_id);
        protoAdapter.encodeWithTag(protoWriter, 2, fireTriggeredActionRequest.creator);
        protoAdapter.encodeWithTag(protoWriter, 3, fireTriggeredActionRequest.event_type);
        protoAdapter.encodeWithTag(protoWriter, 4, fireTriggeredActionRequest.event_id);
        protoAdapter.encodeWithTag(protoWriter, 5, fireTriggeredActionRequest.trigger_reason);
        protoAdapter.encodeWithTag(protoWriter, 6, fireTriggeredActionRequest.event_payload_json);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, fireTriggeredActionRequest.run_after);
        protoWriter.writeBytes(fireTriggeredActionRequest.unknownFields());
    }
}
