package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.api.GetP2pProfileDetailsResponse;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetP2pProfileDetailsResponse$TrustElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetP2pProfileDetailsResponse.TrustElement((Icon) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetP2pProfileDetailsResponse.TrustElement trustElement = (GetP2pProfileDetailsResponse.TrustElement) obj;
        reverseProtoWriter.getClass();
        trustElement.getClass();
        reverseProtoWriter.writeBytes(trustElement.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, trustElement.text);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, trustElement.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetP2pProfileDetailsResponse.TrustElement trustElement = (GetP2pProfileDetailsResponse.TrustElement) obj;
        trustElement.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, trustElement.text) + Icon.ADAPTER.encodedSizeWithTag(1, trustElement.icon) + trustElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetP2pProfileDetailsResponse.TrustElement trustElement = (GetP2pProfileDetailsResponse.TrustElement) obj;
        trustElement.getClass();
        Icon icon = trustElement.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetP2pProfileDetailsResponse.TrustElement(icon2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetP2pProfileDetailsResponse.TrustElement trustElement = (GetP2pProfileDetailsResponse.TrustElement) obj;
        trustElement.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, trustElement.icon);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, trustElement.text);
        protoWriter.writeBytes(trustElement.unknownFields());
    }
}
