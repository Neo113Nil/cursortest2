package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItemModifierList$NestedModifierList$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItemModifierList.NestedModifierList((String) obj, (String) obj2, (Integer) obj3, (Integer) obj4, (Boolean) obj5, m, (Integer) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    m.add(LocalMenuItemModifierList.Modifier.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj6 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 8:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemModifierList.NestedModifierList nestedModifierList = (LocalMenuItemModifierList.NestedModifierList) obj;
        reverseProtoWriter.getClass();
        nestedModifierList.getClass();
        reverseProtoWriter.writeBytes(nestedModifierList.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, nestedModifierList.require_non_empty_string);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, nestedModifierList.max_length);
        LocalMenuItemModifierList.Modifier.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, nestedModifierList.modifiers);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, nestedModifierList.allow_quantities);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, nestedModifierList.max_selections);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, nestedModifierList.min_selections);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, nestedModifierList.name);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, nestedModifierList.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItemModifierList.NestedModifierList nestedModifierList = (LocalMenuItemModifierList.NestedModifierList) obj;
        nestedModifierList.getClass();
        int size$okio = nestedModifierList.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, nestedModifierList.name) + protoAdapter.encodedSizeWithTag(1, nestedModifierList.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, nestedModifierList.max_selections) + protoAdapter2.encodedSizeWithTag(3, nestedModifierList.min_selections) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return protoAdapter3.encodedSizeWithTag(8, nestedModifierList.require_non_empty_string) + protoAdapter2.encodedSizeWithTag(7, nestedModifierList.max_length) + LocalMenuItemModifierList.Modifier.ADAPTER.asRepeated().encodedSizeWithTag(6, nestedModifierList.modifiers) + protoAdapter3.encodedSizeWithTag(5, nestedModifierList.allow_quantities) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemModifierList.NestedModifierList nestedModifierList = (LocalMenuItemModifierList.NestedModifierList) obj;
        nestedModifierList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(nestedModifierList.modifiers, LocalMenuItemModifierList.Modifier.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = nestedModifierList.token;
        String str2 = nestedModifierList.name;
        Integer num = nestedModifierList.min_selections;
        Integer num2 = nestedModifierList.max_selections;
        Boolean bool = nestedModifierList.allow_quantities;
        Integer num3 = nestedModifierList.max_length;
        Boolean bool2 = nestedModifierList.require_non_empty_string;
        byteString.getClass();
        return new LocalMenuItemModifierList.NestedModifierList(str, str2, num, num2, bool, m1169redactElements, num3, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemModifierList.NestedModifierList nestedModifierList = (LocalMenuItemModifierList.NestedModifierList) obj;
        nestedModifierList.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, nestedModifierList.token);
        protoAdapter.encodeWithTag(protoWriter, 2, nestedModifierList.name);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, nestedModifierList.min_selections);
        protoAdapter2.encodeWithTag(protoWriter, 4, nestedModifierList.max_selections);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 5, nestedModifierList.allow_quantities);
        LocalMenuItemModifierList.Modifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, nestedModifierList.modifiers);
        protoAdapter2.encodeWithTag(protoWriter, 7, nestedModifierList.max_length);
        protoAdapter3.encodeWithTag(protoWriter, 8, nestedModifierList.require_non_empty_string);
        protoWriter.writeBytes(nestedModifierList.unknownFields());
    }
}
