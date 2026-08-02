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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ListToolsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ListToolsResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListToolsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListToolsResponse((String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ToolConfig.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListToolsResponse listToolsResponse = (ListToolsResponse) obj;
        reverseProtoWriter.getClass();
        listToolsResponse.getClass();
        reverseProtoWriter.writeBytes(listToolsResponse.unknownFields());
        ToolConfig.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, listToolsResponse.tools);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, listToolsResponse.extension_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, listToolsResponse.extension_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListToolsResponse listToolsResponse = (ListToolsResponse) obj;
        listToolsResponse.getClass();
        int size$okio = listToolsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ToolConfig.ADAPTER.asRepeated().encodedSizeWithTag(3, listToolsResponse.tools) + protoAdapter.encodedSizeWithTag(2, listToolsResponse.extension_description) + protoAdapter.encodedSizeWithTag(1, listToolsResponse.extension_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListToolsResponse listToolsResponse = (ListToolsResponse) obj;
        listToolsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listToolsResponse.tools, ToolConfig.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = listToolsResponse.extension_name;
        String str2 = listToolsResponse.extension_description;
        byteString.getClass();
        return new ListToolsResponse(str, str2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListToolsResponse listToolsResponse = (ListToolsResponse) obj;
        listToolsResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, listToolsResponse.extension_name);
        protoAdapter.encodeWithTag(protoWriter, 2, listToolsResponse.extension_description);
        ToolConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, listToolsResponse.tools);
        protoWriter.writeBytes(listToolsResponse.unknownFields());
    }
}
