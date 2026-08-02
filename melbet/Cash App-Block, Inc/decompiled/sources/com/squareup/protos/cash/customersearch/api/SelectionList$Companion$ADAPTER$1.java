package com.squareup.protos.cash.customersearch.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SelectionList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectionList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectionList selectionList = (SelectionList) obj;
        reverseProtoWriter.getClass();
        selectionList.getClass();
        reverseProtoWriter.writeBytes(selectionList.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, selectionList.names);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectionList selectionList = (SelectionList) obj;
        selectionList.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, selectionList.names) + selectionList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectionList selectionList = (SelectionList) obj;
        selectionList.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = selectionList.names;
        list.getClass();
        byteString.getClass();
        return new SelectionList(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectionList selectionList = (SelectionList) obj;
        selectionList.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, selectionList.names);
        protoWriter.writeBytes(selectionList.unknownFields());
    }
}
