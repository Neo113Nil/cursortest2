package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAppMessageByTemplateTokenResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAppMessageByTemplateTokenResponse((AppMessage) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AppMessage.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAppMessageByTemplateTokenResponse getAppMessageByTemplateTokenResponse = (GetAppMessageByTemplateTokenResponse) obj;
        reverseProtoWriter.getClass();
        getAppMessageByTemplateTokenResponse.getClass();
        reverseProtoWriter.writeBytes(getAppMessageByTemplateTokenResponse.unknownFields());
        AppMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getAppMessageByTemplateTokenResponse.message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAppMessageByTemplateTokenResponse getAppMessageByTemplateTokenResponse = (GetAppMessageByTemplateTokenResponse) obj;
        getAppMessageByTemplateTokenResponse.getClass();
        return AppMessage.ADAPTER.encodedSizeWithTag(1, getAppMessageByTemplateTokenResponse.message) + getAppMessageByTemplateTokenResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAppMessageByTemplateTokenResponse getAppMessageByTemplateTokenResponse = (GetAppMessageByTemplateTokenResponse) obj;
        getAppMessageByTemplateTokenResponse.getClass();
        AppMessage appMessage = getAppMessageByTemplateTokenResponse.message;
        AppMessage appMessage2 = appMessage != null ? (AppMessage) AppMessage.ADAPTER.redact(appMessage) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAppMessageByTemplateTokenResponse(appMessage2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAppMessageByTemplateTokenResponse getAppMessageByTemplateTokenResponse = (GetAppMessageByTemplateTokenResponse) obj;
        getAppMessageByTemplateTokenResponse.getClass();
        AppMessage.ADAPTER.encodeWithTag(protoWriter, 1, getAppMessageByTemplateTokenResponse.message);
        protoWriter.writeBytes(getAppMessageByTemplateTokenResponse.unknownFields());
    }
}
