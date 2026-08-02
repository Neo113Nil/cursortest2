package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseAfterpayAppletData.AppletRow.UnorderedList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.UnorderedList unorderedList = (PrepurchaseAfterpayAppletData.AppletRow.UnorderedList) obj;
        reverseProtoWriter.getClass();
        unorderedList.getClass();
        reverseProtoWriter.writeBytes(unorderedList.unknownFields());
        PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, unorderedList.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.UnorderedList unorderedList = (PrepurchaseAfterpayAppletData.AppletRow.UnorderedList) obj;
        unorderedList.getClass();
        return PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem.ADAPTER.asRepeated().encodedSizeWithTag(1, unorderedList.items) + unorderedList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.UnorderedList unorderedList = (PrepurchaseAfterpayAppletData.AppletRow.UnorderedList) obj;
        unorderedList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(unorderedList.items, PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PrepurchaseAfterpayAppletData.AppletRow.UnorderedList(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.UnorderedList unorderedList = (PrepurchaseAfterpayAppletData.AppletRow.UnorderedList) obj;
        unorderedList.getClass();
        PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, unorderedList.items);
        protoWriter.writeBytes(unorderedList.unknownFields());
    }
}
