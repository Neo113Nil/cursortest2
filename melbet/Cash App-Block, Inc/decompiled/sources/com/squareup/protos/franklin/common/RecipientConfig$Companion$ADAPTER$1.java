package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RecipientConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientConfig((SuggestedRecipientsData) obj, (SuggestedRecipientsData) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SuggestedRecipientsData.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(SuggestedRecipientsData.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecipientConfig recipientConfig = (RecipientConfig) obj;
        reverseProtoWriter.getClass();
        recipientConfig.getClass();
        reverseProtoWriter.writeBytes(recipientConfig.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, recipientConfig.confirm_cashtag_recipients);
        ProtoAdapter protoAdapter = SuggestedRecipientsData.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recipientConfig.request_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, recipientConfig.pay_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientConfig recipientConfig = (RecipientConfig) obj;
        recipientConfig.getClass();
        int size$okio = recipientConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = SuggestedRecipientsData.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, recipientConfig.confirm_cashtag_recipients) + protoAdapter.encodedSizeWithTag(2, recipientConfig.request_data) + protoAdapter.encodedSizeWithTag(1, recipientConfig.pay_data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientConfig recipientConfig = (RecipientConfig) obj;
        recipientConfig.getClass();
        SuggestedRecipientsData suggestedRecipientsData = recipientConfig.pay_data;
        SuggestedRecipientsData suggestedRecipientsData2 = suggestedRecipientsData != null ? (SuggestedRecipientsData) SuggestedRecipientsData.ADAPTER.redact(suggestedRecipientsData) : null;
        SuggestedRecipientsData suggestedRecipientsData3 = recipientConfig.request_data;
        SuggestedRecipientsData suggestedRecipientsData4 = suggestedRecipientsData3 != null ? (SuggestedRecipientsData) SuggestedRecipientsData.ADAPTER.redact(suggestedRecipientsData3) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = recipientConfig.confirm_cashtag_recipients;
        byteString.getClass();
        return new RecipientConfig(suggestedRecipientsData2, suggestedRecipientsData4, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientConfig recipientConfig = (RecipientConfig) obj;
        recipientConfig.getClass();
        ProtoAdapter protoAdapter = SuggestedRecipientsData.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, recipientConfig.pay_data);
        protoAdapter.encodeWithTag(protoWriter, 2, recipientConfig.request_data);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, recipientConfig.confirm_cashtag_recipients);
        protoWriter.writeBytes(recipientConfig.unknownFields());
    }
}
