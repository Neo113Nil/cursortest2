package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CallToolResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CallToolResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallToolResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CallToolResponse((Boolean) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(UserContent.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CallToolResponse callToolResponse = (CallToolResponse) obj;
        reverseProtoWriter.getClass();
        callToolResponse.getClass();
        reverseProtoWriter.writeBytes(callToolResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, callToolResponse.structured_content_json);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, callToolResponse.is_error);
        UserContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, callToolResponse.content);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CallToolResponse callToolResponse = (CallToolResponse) obj;
        callToolResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, callToolResponse.structured_content_json) + ProtoAdapter.BOOL.encodedSizeWithTag(2, callToolResponse.is_error) + UserContent.ADAPTER.asRepeated().encodedSizeWithTag(1, callToolResponse.content) + callToolResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CallToolResponse callToolResponse = (CallToolResponse) obj;
        callToolResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(callToolResponse.content, UserContent.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = callToolResponse.is_error;
        String str = callToolResponse.structured_content_json;
        byteString.getClass();
        return new CallToolResponse(bool, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CallToolResponse callToolResponse = (CallToolResponse) obj;
        callToolResponse.getClass();
        UserContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, callToolResponse.content);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, callToolResponse.is_error);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, callToolResponse.structured_content_json);
        protoWriter.writeBytes(callToolResponse.unknownFields());
    }
}
