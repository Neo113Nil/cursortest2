package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SuggestedRecipientsData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SuggestedRecipientsData(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(UiCustomer.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    RecipientGroup.ADAPTER.tryDecode(protoReader, arrayList);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SuggestedRecipientsData suggestedRecipientsData = (SuggestedRecipientsData) obj;
        reverseProtoWriter.getClass();
        suggestedRecipientsData.getClass();
        reverseProtoWriter.writeBytes(suggestedRecipientsData.unknownFields());
        RecipientGroup.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, suggestedRecipientsData.groups);
        UiCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, suggestedRecipientsData.suggested_customers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SuggestedRecipientsData suggestedRecipientsData = (SuggestedRecipientsData) obj;
        suggestedRecipientsData.getClass();
        return RecipientGroup.ADAPTER.asRepeated().encodedSizeWithTag(2, suggestedRecipientsData.groups) + UiCustomer.ADAPTER.asRepeated().encodedSizeWithTag(1, suggestedRecipientsData.suggested_customers) + suggestedRecipientsData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SuggestedRecipientsData suggestedRecipientsData = (SuggestedRecipientsData) obj;
        suggestedRecipientsData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(suggestedRecipientsData.suggested_customers, UiCustomer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        List list = suggestedRecipientsData.groups;
        list.getClass();
        byteString.getClass();
        return new SuggestedRecipientsData(m1169redactElements, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SuggestedRecipientsData suggestedRecipientsData = (SuggestedRecipientsData) obj;
        suggestedRecipientsData.getClass();
        UiCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, suggestedRecipientsData.suggested_customers);
        RecipientGroup.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, suggestedRecipientsData.groups);
        protoWriter.writeBytes(suggestedRecipientsData.unknownFields());
    }
}
