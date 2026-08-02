package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InfoSheet$NumberedList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InfoSheet.NumberedList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InfoSheet.NumberedListItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InfoSheet.NumberedList numberedList = (InfoSheet.NumberedList) obj;
        reverseProtoWriter.getClass();
        numberedList.getClass();
        reverseProtoWriter.writeBytes(numberedList.unknownFields());
        InfoSheet.NumberedListItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, numberedList.numbered_list_item);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InfoSheet.NumberedList numberedList = (InfoSheet.NumberedList) obj;
        numberedList.getClass();
        return InfoSheet.NumberedListItem.ADAPTER.asRepeated().encodedSizeWithTag(1, numberedList.numbered_list_item) + numberedList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InfoSheet.NumberedList numberedList = (InfoSheet.NumberedList) obj;
        numberedList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(numberedList.numbered_list_item, InfoSheet.NumberedListItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InfoSheet.NumberedList(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InfoSheet.NumberedList numberedList = (InfoSheet.NumberedList) obj;
        numberedList.getClass();
        InfoSheet.NumberedListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, numberedList.numbered_list_item);
        protoWriter.writeBytes(numberedList.unknownFields());
    }
}
