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
public final class LocalMenuItemModifierList$SelectFromList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItemModifierList.SelectFromList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalMenuItemModifierList.Modifier.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemModifierList.SelectFromList selectFromList = (LocalMenuItemModifierList.SelectFromList) obj;
        reverseProtoWriter.getClass();
        selectFromList.getClass();
        reverseProtoWriter.writeBytes(selectFromList.unknownFields());
        LocalMenuItemModifierList.Modifier.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, selectFromList.modifiers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItemModifierList.SelectFromList selectFromList = (LocalMenuItemModifierList.SelectFromList) obj;
        selectFromList.getClass();
        return LocalMenuItemModifierList.Modifier.ADAPTER.asRepeated().encodedSizeWithTag(1, selectFromList.modifiers) + selectFromList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemModifierList.SelectFromList selectFromList = (LocalMenuItemModifierList.SelectFromList) obj;
        selectFromList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(selectFromList.modifiers, LocalMenuItemModifierList.Modifier.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalMenuItemModifierList.SelectFromList(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemModifierList.SelectFromList selectFromList = (LocalMenuItemModifierList.SelectFromList) obj;
        selectFromList.getClass();
        LocalMenuItemModifierList.Modifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, selectFromList.modifiers);
        protoWriter.writeBytes(selectFromList.unknownFields());
    }
}
