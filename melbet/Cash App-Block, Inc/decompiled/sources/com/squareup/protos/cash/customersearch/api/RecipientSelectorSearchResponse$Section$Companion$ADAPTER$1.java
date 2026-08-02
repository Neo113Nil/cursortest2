package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecipientSelectorSearchResponse$Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSelectorSearchResponse.Section((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(RecipientSelectorSearchResponse.ResultSource.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(RecipientSelectorCustomer.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecipientSelectorSearchResponse.Section section = (RecipientSelectorSearchResponse.Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        RecipientSelectorCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, section.full_results);
        RecipientSelectorSearchResponse.ResultSource.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, section.results);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, section.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientSelectorSearchResponse.Section section = (RecipientSelectorSearchResponse.Section) obj;
        section.getClass();
        return RecipientSelectorCustomer.ADAPTER.asRepeated().encodedSizeWithTag(3, section.full_results) + RecipientSelectorSearchResponse.ResultSource.ADAPTER.asRepeated().encodedSizeWithTag(2, section.results) + ProtoAdapter.STRING.encodedSizeWithTag(1, section.title) + section.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientSelectorSearchResponse.Section section = (RecipientSelectorSearchResponse.Section) obj;
        section.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(section.results, RecipientSelectorSearchResponse.ResultSource.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(section.full_results, RecipientSelectorCustomer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = section.title;
        byteString.getClass();
        return new RecipientSelectorSearchResponse.Section(str, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSelectorSearchResponse.Section section = (RecipientSelectorSearchResponse.Section) obj;
        section.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, section.title);
        RecipientSelectorSearchResponse.ResultSource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, section.results);
        RecipientSelectorCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, section.full_results);
        protoWriter.writeBytes(section.unknownFields());
    }
}
