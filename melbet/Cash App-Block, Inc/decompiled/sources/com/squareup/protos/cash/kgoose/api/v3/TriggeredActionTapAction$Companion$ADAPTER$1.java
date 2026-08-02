package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TriggeredActionTapAction$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionTapAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggeredActionTapAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TriggeredActionTapAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TriggeredActionTapAction triggeredActionTapAction = (TriggeredActionTapAction) obj;
        reverseProtoWriter.getClass();
        triggeredActionTapAction.getClass();
        reverseProtoWriter.writeBytes(triggeredActionTapAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, triggeredActionTapAction.client_route_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TriggeredActionTapAction triggeredActionTapAction = (TriggeredActionTapAction) obj;
        triggeredActionTapAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, triggeredActionTapAction.client_route_url) + triggeredActionTapAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TriggeredActionTapAction triggeredActionTapAction = (TriggeredActionTapAction) obj;
        triggeredActionTapAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = triggeredActionTapAction.client_route_url;
        byteString.getClass();
        return new TriggeredActionTapAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TriggeredActionTapAction triggeredActionTapAction = (TriggeredActionTapAction) obj;
        triggeredActionTapAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, triggeredActionTapAction.client_route_url);
        protoWriter.writeBytes(triggeredActionTapAction.unknownFields());
    }
}
