package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class POSBrandOnboarding$HowItWorks$Row$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new POSBrandOnboarding.HowItWorks.Row((LocalImage) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        POSBrandOnboarding.HowItWorks.Row row = (POSBrandOnboarding.HowItWorks.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, row.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, row.title);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, row.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        POSBrandOnboarding.HowItWorks.Row row = (POSBrandOnboarding.HowItWorks.Row) obj;
        row.getClass();
        int encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(1, row.image) + row.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, row.body) + protoAdapter.encodedSizeWithTag(2, row.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        POSBrandOnboarding.HowItWorks.Row row = (POSBrandOnboarding.HowItWorks.Row) obj;
        row.getClass();
        LocalImage localImage = row.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = row.title;
        String str2 = row.body;
        byteString.getClass();
        return new POSBrandOnboarding.HowItWorks.Row(localImage2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        POSBrandOnboarding.HowItWorks.Row row = (POSBrandOnboarding.HowItWorks.Row) obj;
        row.getClass();
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 1, row.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, row.title);
        protoAdapter.encodeWithTag(protoWriter, 3, row.body);
        protoWriter.writeBytes(row.unknownFields());
    }
}
