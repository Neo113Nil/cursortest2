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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/UpdateInChatPromptResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateInChatPromptResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateInChatPromptResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateInChatPromptResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InChatPrompt.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateInChatPromptResponse updateInChatPromptResponse = (UpdateInChatPromptResponse) obj;
        reverseProtoWriter.getClass();
        updateInChatPromptResponse.getClass();
        reverseProtoWriter.writeBytes(updateInChatPromptResponse.unknownFields());
        InChatPrompt.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, updateInChatPromptResponse.prompts);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateInChatPromptResponse updateInChatPromptResponse = (UpdateInChatPromptResponse) obj;
        updateInChatPromptResponse.getClass();
        return InChatPrompt.ADAPTER.asRepeated().encodedSizeWithTag(1, updateInChatPromptResponse.prompts) + updateInChatPromptResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateInChatPromptResponse updateInChatPromptResponse = (UpdateInChatPromptResponse) obj;
        updateInChatPromptResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(updateInChatPromptResponse.prompts, InChatPrompt.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateInChatPromptResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateInChatPromptResponse updateInChatPromptResponse = (UpdateInChatPromptResponse) obj;
        updateInChatPromptResponse.getClass();
        InChatPrompt.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateInChatPromptResponse.prompts);
        protoWriter.writeBytes(updateInChatPromptResponse.unknownFields());
    }
}
