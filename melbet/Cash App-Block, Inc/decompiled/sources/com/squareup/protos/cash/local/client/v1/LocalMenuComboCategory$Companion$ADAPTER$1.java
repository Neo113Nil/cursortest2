package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuComboCategory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuComboCategory((String) obj, (String) obj2, m, (LocalImage) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuComboCategory localMenuComboCategory = (LocalMenuComboCategory) obj;
        reverseProtoWriter.getClass();
        localMenuComboCategory.getClass();
        reverseProtoWriter.writeBytes(localMenuComboCategory.unknownFields());
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localMenuComboCategory.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, localMenuComboCategory.item_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localMenuComboCategory.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMenuComboCategory.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuComboCategory localMenuComboCategory = (LocalMenuComboCategory) obj;
        localMenuComboCategory.getClass();
        int size$okio = localMenuComboCategory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalImage.ADAPTER.encodedSizeWithTag(4, localMenuComboCategory.image) + protoAdapter.asRepeated().encodedSizeWithTag(3, localMenuComboCategory.item_tokens) + protoAdapter.encodedSizeWithTag(2, localMenuComboCategory.name) + protoAdapter.encodedSizeWithTag(1, localMenuComboCategory.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuComboCategory localMenuComboCategory = (LocalMenuComboCategory) obj;
        localMenuComboCategory.getClass();
        LocalImage localImage = localMenuComboCategory.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localMenuComboCategory.token;
        String str2 = localMenuComboCategory.name;
        List list = localMenuComboCategory.item_tokens;
        list.getClass();
        byteString.getClass();
        return new LocalMenuComboCategory(str, str2, list, localImage2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuComboCategory localMenuComboCategory = (LocalMenuComboCategory) obj;
        localMenuComboCategory.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localMenuComboCategory.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localMenuComboCategory.name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, localMenuComboCategory.item_tokens);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 4, localMenuComboCategory.image);
        protoWriter.writeBytes(localMenuComboCategory.unknownFields());
    }
}
