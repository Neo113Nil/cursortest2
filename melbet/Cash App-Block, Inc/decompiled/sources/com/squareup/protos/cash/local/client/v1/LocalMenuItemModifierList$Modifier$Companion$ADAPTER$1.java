package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItemModifierList$Modifier$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItemModifierList.Modifier((String) obj, (String) obj2, (LocalMoney) obj3, (Boolean) obj4, (LocalMenuAvailability) obj5, (LocalImage) obj6, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj5 = LocalMenuAvailability.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    m.add(LocalMenuItemModifierList.NestedModifierList.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemModifierList.Modifier modifier = (LocalMenuItemModifierList.Modifier) obj;
        reverseProtoWriter.getClass();
        modifier.getClass();
        reverseProtoWriter.writeBytes(modifier.unknownFields());
        LocalMenuItemModifierList.NestedModifierList.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, modifier.nested_modifier_lists);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 6, modifier.image);
        LocalMenuAvailability.ADAPTER.encodeWithTag(reverseProtoWriter, 5, modifier.availability);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, modifier.selected_by_default);
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 3, modifier.price);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, modifier.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, modifier.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItemModifierList.Modifier modifier = (LocalMenuItemModifierList.Modifier) obj;
        modifier.getClass();
        int size$okio = modifier.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalMenuItemModifierList.NestedModifierList.ADAPTER.asRepeated().encodedSizeWithTag(7, modifier.nested_modifier_lists) + LocalImage.ADAPTER.encodedSizeWithTag(6, modifier.image) + LocalMenuAvailability.ADAPTER.encodedSizeWithTag(5, modifier.availability) + ProtoAdapter.BOOL.encodedSizeWithTag(4, modifier.selected_by_default) + LocalMoney.ADAPTER.encodedSizeWithTag(3, modifier.price) + protoAdapter.encodedSizeWithTag(2, modifier.name) + protoAdapter.encodedSizeWithTag(1, modifier.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemModifierList.Modifier modifier = (LocalMenuItemModifierList.Modifier) obj;
        modifier.getClass();
        LocalMoney localMoney = modifier.price;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        LocalImage localImage = modifier.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(modifier.nested_modifier_lists, LocalMenuItemModifierList.NestedModifierList.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = modifier.token;
        String str2 = modifier.name;
        Boolean bool = modifier.selected_by_default;
        LocalMenuAvailability localMenuAvailability = modifier.availability;
        byteString.getClass();
        return new LocalMenuItemModifierList.Modifier(str, str2, localMoney2, bool, localMenuAvailability, localImage2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemModifierList.Modifier modifier = (LocalMenuItemModifierList.Modifier) obj;
        modifier.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, modifier.token);
        protoAdapter.encodeWithTag(protoWriter, 2, modifier.name);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 3, modifier.price);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, modifier.selected_by_default);
        LocalMenuAvailability.ADAPTER.encodeWithTag(protoWriter, 5, modifier.availability);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 6, modifier.image);
        LocalMenuItemModifierList.NestedModifierList.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, modifier.nested_modifier_lists);
        protoWriter.writeBytes(modifier.unknownFields());
    }
}
