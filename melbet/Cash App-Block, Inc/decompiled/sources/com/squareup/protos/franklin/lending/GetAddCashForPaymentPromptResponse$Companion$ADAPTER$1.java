package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetAddCashForPaymentPromptResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAddCashForPaymentPromptResponse((ResponseContext) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAddCashForPaymentPromptResponse getAddCashForPaymentPromptResponse = (GetAddCashForPaymentPromptResponse) obj;
        reverseProtoWriter.getClass();
        getAddCashForPaymentPromptResponse.getClass();
        reverseProtoWriter.writeBytes(getAddCashForPaymentPromptResponse.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getAddCashForPaymentPromptResponse.prompt);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getAddCashForPaymentPromptResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAddCashForPaymentPromptResponse getAddCashForPaymentPromptResponse = (GetAddCashForPaymentPromptResponse) obj;
        getAddCashForPaymentPromptResponse.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, getAddCashForPaymentPromptResponse.prompt) + ResponseContext.ADAPTER.encodedSizeWithTag(1, getAddCashForPaymentPromptResponse.response_context) + getAddCashForPaymentPromptResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAddCashForPaymentPromptResponse getAddCashForPaymentPromptResponse = (GetAddCashForPaymentPromptResponse) obj;
        getAddCashForPaymentPromptResponse.getClass();
        ResponseContext responseContext = getAddCashForPaymentPromptResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        LocalizedString localizedString = getAddCashForPaymentPromptResponse.prompt;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAddCashForPaymentPromptResponse(responseContext2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAddCashForPaymentPromptResponse getAddCashForPaymentPromptResponse = (GetAddCashForPaymentPromptResponse) obj;
        getAddCashForPaymentPromptResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, getAddCashForPaymentPromptResponse.response_context);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, getAddCashForPaymentPromptResponse.prompt);
        protoWriter.writeBytes(getAddCashForPaymentPromptResponse.unknownFields());
    }
}
