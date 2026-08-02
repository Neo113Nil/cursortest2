package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalNumberedList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalNumberedList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalNumberedListItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalNumberedList localNumberedList = (LocalNumberedList) obj;
        reverseProtoWriter.getClass();
        localNumberedList.getClass();
        reverseProtoWriter.writeBytes(localNumberedList.unknownFields());
        LocalNumberedListItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, localNumberedList.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalNumberedList localNumberedList = (LocalNumberedList) obj;
        localNumberedList.getClass();
        return LocalNumberedListItem.ADAPTER.asRepeated().encodedSizeWithTag(1, localNumberedList.items) + localNumberedList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalNumberedList localNumberedList = (LocalNumberedList) obj;
        localNumberedList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localNumberedList.items, LocalNumberedListItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalNumberedList(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalNumberedList localNumberedList = (LocalNumberedList) obj;
        localNumberedList.getClass();
        LocalNumberedListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, localNumberedList.items);
        protoWriter.writeBytes(localNumberedList.unknownFields());
    }
}
