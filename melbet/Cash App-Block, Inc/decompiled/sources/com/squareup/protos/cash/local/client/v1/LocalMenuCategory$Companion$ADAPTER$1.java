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
public final class LocalMenuCategory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuCategory((String) obj, (String) obj2, (LocalImage) obj3, m, (String) obj4, (LocalMenuHours) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 6) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalMenuHours.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuCategory localMenuCategory = (LocalMenuCategory) obj;
        reverseProtoWriter.getClass();
        localMenuCategory.getClass();
        reverseProtoWriter.writeBytes(localMenuCategory.unknownFields());
        LocalMenuHours.ADAPTER.encodeWithTag(reverseProtoWriter, 7, localMenuCategory.menu_hours);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, localMenuCategory.category_collection_token);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, localMenuCategory.item_tokens);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localMenuCategory.image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localMenuCategory.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMenuCategory.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuCategory localMenuCategory = (LocalMenuCategory) obj;
        localMenuCategory.getClass();
        int size$okio = localMenuCategory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalMenuHours.ADAPTER.encodedSizeWithTag(7, localMenuCategory.menu_hours) + protoAdapter.encodedSizeWithTag(6, localMenuCategory.category_collection_token) + protoAdapter.asRepeated().encodedSizeWithTag(4, localMenuCategory.item_tokens) + LocalImage.ADAPTER.encodedSizeWithTag(3, localMenuCategory.image) + protoAdapter.encodedSizeWithTag(2, localMenuCategory.name) + protoAdapter.encodedSizeWithTag(1, localMenuCategory.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuCategory localMenuCategory = (LocalMenuCategory) obj;
        localMenuCategory.getClass();
        LocalImage localImage = localMenuCategory.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalMenuHours localMenuHours = localMenuCategory.menu_hours;
        LocalMenuHours localMenuHours2 = localMenuHours != null ? (LocalMenuHours) LocalMenuHours.ADAPTER.redact(localMenuHours) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localMenuCategory.token;
        String str2 = localMenuCategory.name;
        List list = localMenuCategory.item_tokens;
        String str3 = localMenuCategory.category_collection_token;
        list.getClass();
        byteString.getClass();
        return new LocalMenuCategory(str, str2, localImage2, list, str3, localMenuHours2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuCategory localMenuCategory = (LocalMenuCategory) obj;
        localMenuCategory.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localMenuCategory.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localMenuCategory.name);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 3, localMenuCategory.image);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, localMenuCategory.item_tokens);
        protoAdapter.encodeWithTag(protoWriter, 6, localMenuCategory.category_collection_token);
        LocalMenuHours.ADAPTER.encodeWithTag(protoWriter, 7, localMenuCategory.menu_hours);
        protoWriter.writeBytes(localMenuCategory.unknownFields());
    }
}
