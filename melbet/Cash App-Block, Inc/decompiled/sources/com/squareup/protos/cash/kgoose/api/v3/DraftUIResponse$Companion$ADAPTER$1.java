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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/DraftUIResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/DraftUIResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DraftUIResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DraftUIResponse(m, (Boolean) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(ClientRenderable.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DraftUIResponse draftUIResponse = (DraftUIResponse) obj;
        reverseProtoWriter.getClass();
        draftUIResponse.getClass();
        reverseProtoWriter.writeBytes(draftUIResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, draftUIResponse.structured_output_json);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, draftUIResponse.final_code_output_json);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, draftUIResponse.final_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, draftUIResponse.code_mode_result_json);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, draftUIResponse.error_msg);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, draftUIResponse.success);
        ClientRenderable.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, draftUIResponse.client_renderables);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DraftUIResponse draftUIResponse = (DraftUIResponse) obj;
        draftUIResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(2, draftUIResponse.success) + ClientRenderable.ADAPTER.asRepeated().encodedSizeWithTag(1, draftUIResponse.client_renderables) + draftUIResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, draftUIResponse.structured_output_json) + protoAdapter.encodedSizeWithTag(6, draftUIResponse.final_code_output_json) + protoAdapter.encodedSizeWithTag(5, draftUIResponse.final_code) + protoAdapter.encodedSizeWithTag(4, draftUIResponse.code_mode_result_json) + protoAdapter.encodedSizeWithTag(3, draftUIResponse.error_msg) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DraftUIResponse draftUIResponse = (DraftUIResponse) obj;
        draftUIResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(draftUIResponse.client_renderables, ClientRenderable.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = draftUIResponse.success;
        String str = draftUIResponse.error_msg;
        String str2 = draftUIResponse.code_mode_result_json;
        String str3 = draftUIResponse.final_code;
        String str4 = draftUIResponse.final_code_output_json;
        String str5 = draftUIResponse.structured_output_json;
        byteString.getClass();
        return new DraftUIResponse(m1169redactElements, bool, str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DraftUIResponse draftUIResponse = (DraftUIResponse) obj;
        draftUIResponse.getClass();
        ClientRenderable.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, draftUIResponse.client_renderables);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, draftUIResponse.success);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, draftUIResponse.error_msg);
        protoAdapter.encodeWithTag(protoWriter, 4, draftUIResponse.code_mode_result_json);
        protoAdapter.encodeWithTag(protoWriter, 5, draftUIResponse.final_code);
        protoAdapter.encodeWithTag(protoWriter, 6, draftUIResponse.final_code_output_json);
        protoAdapter.encodeWithTag(protoWriter, 7, draftUIResponse.structured_output_json);
        protoWriter.writeBytes(draftUIResponse.unknownFields());
    }
}
