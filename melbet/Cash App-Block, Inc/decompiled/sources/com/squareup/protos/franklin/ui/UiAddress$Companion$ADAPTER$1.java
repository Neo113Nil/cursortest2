package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiAddress$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiAddress((GlobalAddress) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiAddress uiAddress = (UiAddress) obj;
        reverseProtoWriter.getClass();
        uiAddress.getClass();
        reverseProtoWriter.writeBytes(uiAddress.unknownFields());
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiAddress.postal_address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiAddress uiAddress = (UiAddress) obj;
        uiAddress.getClass();
        return GlobalAddress.ADAPTER.encodedSizeWithTag(1, uiAddress.postal_address) + uiAddress.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiAddress uiAddress = (UiAddress) obj;
        uiAddress.getClass();
        GlobalAddress globalAddress = uiAddress.postal_address;
        GlobalAddress globalAddress2 = globalAddress != null ? (GlobalAddress) GlobalAddress.ADAPTER.redact(globalAddress) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiAddress(globalAddress2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiAddress uiAddress = (UiAddress) obj;
        uiAddress.getClass();
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 1, uiAddress.postal_address);
        protoWriter.writeBytes(uiAddress.unknownFields());
    }
}
