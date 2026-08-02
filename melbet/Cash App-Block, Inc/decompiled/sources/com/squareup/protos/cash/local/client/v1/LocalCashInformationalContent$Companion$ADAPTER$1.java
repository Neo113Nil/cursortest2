package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class LocalCashInformationalContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalCashInformationalContent((LocalNumberedList) obj, (String) obj2, (String) obj3, (LocalImage) obj4, (LocalButton) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalNumberedList.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalButton.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCashInformationalContent localCashInformationalContent = (LocalCashInformationalContent) obj;
        reverseProtoWriter.getClass();
        localCashInformationalContent.getClass();
        reverseProtoWriter.writeBytes(localCashInformationalContent.unknownFields());
        LocalButton.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localCashInformationalContent.button);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localCashInformationalContent.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localCashInformationalContent.header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localCashInformationalContent.legal_text);
        LocalNumberedList.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localCashInformationalContent.list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCashInformationalContent localCashInformationalContent = (LocalCashInformationalContent) obj;
        localCashInformationalContent.getClass();
        int encodedSizeWithTag = LocalNumberedList.ADAPTER.encodedSizeWithTag(1, localCashInformationalContent.list) + localCashInformationalContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalButton.ADAPTER.encodedSizeWithTag(5, localCashInformationalContent.button) + LocalImage.ADAPTER.encodedSizeWithTag(4, localCashInformationalContent.image) + protoAdapter.encodedSizeWithTag(3, localCashInformationalContent.header) + protoAdapter.encodedSizeWithTag(2, localCashInformationalContent.legal_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCashInformationalContent localCashInformationalContent = (LocalCashInformationalContent) obj;
        localCashInformationalContent.getClass();
        LocalNumberedList localNumberedList = localCashInformationalContent.list;
        LocalNumberedList localNumberedList2 = localNumberedList != null ? (LocalNumberedList) LocalNumberedList.ADAPTER.redact(localNumberedList) : null;
        LocalImage localImage = localCashInformationalContent.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalButton localButton = localCashInformationalContent.button;
        LocalButton localButton2 = localButton != null ? (LocalButton) LocalButton.ADAPTER.redact(localButton) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localCashInformationalContent.legal_text;
        String str2 = localCashInformationalContent.header;
        byteString.getClass();
        return new LocalCashInformationalContent(localNumberedList2, str, str2, localImage2, localButton2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCashInformationalContent localCashInformationalContent = (LocalCashInformationalContent) obj;
        localCashInformationalContent.getClass();
        LocalNumberedList.ADAPTER.encodeWithTag(protoWriter, 1, localCashInformationalContent.list);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, localCashInformationalContent.legal_text);
        protoAdapter.encodeWithTag(protoWriter, 3, localCashInformationalContent.header);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 4, localCashInformationalContent.image);
        LocalButton.ADAPTER.encodeWithTag(protoWriter, 5, localCashInformationalContent.button);
        protoWriter.writeBytes(localCashInformationalContent.unknownFields());
    }
}
