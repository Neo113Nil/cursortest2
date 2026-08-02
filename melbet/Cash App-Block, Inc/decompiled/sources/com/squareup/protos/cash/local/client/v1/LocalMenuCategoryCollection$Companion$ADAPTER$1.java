package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalMenuCategoryCollection;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuCategoryCollection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuCategoryCollection((String) obj, (String) obj2, m, (LocalMenuHours) obj3, (LocalMenuCategoryCollection.Type) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalMenuHours.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = LocalMenuCategoryCollection.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuCategoryCollection localMenuCategoryCollection = (LocalMenuCategoryCollection) obj;
        reverseProtoWriter.getClass();
        localMenuCategoryCollection.getClass();
        reverseProtoWriter.writeBytes(localMenuCategoryCollection.unknownFields());
        LocalMenuCategoryCollection.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localMenuCategoryCollection.f1312type);
        LocalMenuHours.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localMenuCategoryCollection.menu_hours);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, localMenuCategoryCollection.category_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localMenuCategoryCollection.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMenuCategoryCollection.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuCategoryCollection localMenuCategoryCollection = (LocalMenuCategoryCollection) obj;
        localMenuCategoryCollection.getClass();
        int size$okio = localMenuCategoryCollection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalMenuCategoryCollection.Type.ADAPTER.encodedSizeWithTag(5, localMenuCategoryCollection.f1312type) + LocalMenuHours.ADAPTER.encodedSizeWithTag(4, localMenuCategoryCollection.menu_hours) + protoAdapter.asRepeated().encodedSizeWithTag(3, localMenuCategoryCollection.category_tokens) + protoAdapter.encodedSizeWithTag(2, localMenuCategoryCollection.name) + protoAdapter.encodedSizeWithTag(1, localMenuCategoryCollection.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuCategoryCollection localMenuCategoryCollection = (LocalMenuCategoryCollection) obj;
        localMenuCategoryCollection.getClass();
        LocalMenuHours localMenuHours = localMenuCategoryCollection.menu_hours;
        LocalMenuHours localMenuHours2 = localMenuHours != null ? (LocalMenuHours) LocalMenuHours.ADAPTER.redact(localMenuHours) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localMenuCategoryCollection.token;
        String str2 = localMenuCategoryCollection.name;
        List list = localMenuCategoryCollection.category_tokens;
        LocalMenuCategoryCollection.Type type2 = localMenuCategoryCollection.f1312type;
        list.getClass();
        byteString.getClass();
        return new LocalMenuCategoryCollection(str, str2, list, localMenuHours2, type2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuCategoryCollection localMenuCategoryCollection = (LocalMenuCategoryCollection) obj;
        localMenuCategoryCollection.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localMenuCategoryCollection.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localMenuCategoryCollection.name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, localMenuCategoryCollection.category_tokens);
        LocalMenuHours.ADAPTER.encodeWithTag(protoWriter, 4, localMenuCategoryCollection.menu_hours);
        LocalMenuCategoryCollection.Type.ADAPTER.encodeWithTag(protoWriter, 5, localMenuCategoryCollection.f1312type);
        protoWriter.writeBytes(localMenuCategoryCollection.unknownFields());
    }
}
