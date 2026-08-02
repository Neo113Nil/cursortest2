package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateUserIntentResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateUserIntentResponse.Success((LocalUserIntent) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalUserIntent.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateUserIntentResponse.Success success = (UpdateUserIntentResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        LocalUserIntent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, success.user_intent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateUserIntentResponse.Success success = (UpdateUserIntentResponse.Success) obj;
        success.getClass();
        return LocalUserIntent.ADAPTER.encodedSizeWithTag(1, success.user_intent) + success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateUserIntentResponse.Success success = (UpdateUserIntentResponse.Success) obj;
        success.getClass();
        LocalUserIntent localUserIntent = success.user_intent;
        LocalUserIntent localUserIntent2 = localUserIntent != null ? (LocalUserIntent) LocalUserIntent.ADAPTER.redact(localUserIntent) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateUserIntentResponse.Success(localUserIntent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateUserIntentResponse.Success success = (UpdateUserIntentResponse.Success) obj;
        success.getClass();
        LocalUserIntent.ADAPTER.encodeWithTag(protoWriter, 1, success.user_intent);
        protoWriter.writeBytes(success.unknownFields());
    }
}
