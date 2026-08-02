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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ToolResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToolResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ToolResponse((String) obj, (String) obj2, (String) obj3, (String) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(UserContent.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ToolResponse toolResponse = (ToolResponse) obj;
        reverseProtoWriter.getClass();
        toolResponse.getClass();
        reverseProtoWriter.writeBytes(toolResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, toolResponse.extension_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, toolResponse.error);
        UserContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, toolResponse.results);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, toolResponse.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, toolResponse.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ToolResponse toolResponse = (ToolResponse) obj;
        toolResponse.getClass();
        int size$okio = toolResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, toolResponse.extension_name) + protoAdapter.encodedSizeWithTag(4, toolResponse.error) + UserContent.ADAPTER.asRepeated().encodedSizeWithTag(3, toolResponse.results) + protoAdapter.encodedSizeWithTag(2, toolResponse.status) + protoAdapter.encodedSizeWithTag(1, toolResponse.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ToolResponse toolResponse = (ToolResponse) obj;
        toolResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(toolResponse.results, UserContent.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = toolResponse.id;
        String str2 = toolResponse.status;
        String str3 = toolResponse.error;
        String str4 = toolResponse.extension_name;
        byteString.getClass();
        return new ToolResponse(str, str2, str3, str4, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ToolResponse toolResponse = (ToolResponse) obj;
        toolResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, toolResponse.id);
        protoAdapter.encodeWithTag(protoWriter, 2, toolResponse.status);
        UserContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, toolResponse.results);
        protoAdapter.encodeWithTag(protoWriter, 4, toolResponse.error);
        protoAdapter.encodeWithTag(protoWriter, 5, toolResponse.extension_name);
        protoWriter.writeBytes(toolResponse.unknownFields());
    }
}
