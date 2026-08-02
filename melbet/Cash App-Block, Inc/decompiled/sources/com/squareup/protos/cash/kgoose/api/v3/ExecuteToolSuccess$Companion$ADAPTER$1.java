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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ExecuteToolSuccess$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolSuccess;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExecuteToolSuccess$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExecuteToolSuccess((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(UserContent.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExecuteToolSuccess executeToolSuccess = (ExecuteToolSuccess) obj;
        reverseProtoWriter.getClass();
        executeToolSuccess.getClass();
        reverseProtoWriter.writeBytes(executeToolSuccess.unknownFields());
        UserContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, executeToolSuccess.content);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, executeToolSuccess.client_route_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExecuteToolSuccess executeToolSuccess = (ExecuteToolSuccess) obj;
        executeToolSuccess.getClass();
        return UserContent.ADAPTER.asRepeated().encodedSizeWithTag(2, executeToolSuccess.content) + ProtoAdapter.STRING.encodedSizeWithTag(1, executeToolSuccess.client_route_url) + executeToolSuccess.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExecuteToolSuccess executeToolSuccess = (ExecuteToolSuccess) obj;
        executeToolSuccess.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(executeToolSuccess.content, UserContent.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = executeToolSuccess.client_route_url;
        byteString.getClass();
        return new ExecuteToolSuccess(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExecuteToolSuccess executeToolSuccess = (ExecuteToolSuccess) obj;
        executeToolSuccess.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, executeToolSuccess.client_route_url);
        UserContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, executeToolSuccess.content);
        protoWriter.writeBytes(executeToolSuccess.unknownFields());
    }
}
