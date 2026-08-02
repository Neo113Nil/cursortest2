package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$CreditDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletEntrypoint.CreditDetails(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AfterpayAppletEntrypoint.CreditDetails.DetailLine.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletEntrypoint.CreditDetails creditDetails = (AfterpayAppletEntrypoint.CreditDetails) obj;
        reverseProtoWriter.getClass();
        creditDetails.getClass();
        reverseProtoWriter.writeBytes(creditDetails.unknownFields());
        AfterpayAppletEntrypoint.CreditDetails.DetailLine.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, creditDetails.detail_lines);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletEntrypoint.CreditDetails creditDetails = (AfterpayAppletEntrypoint.CreditDetails) obj;
        creditDetails.getClass();
        return AfterpayAppletEntrypoint.CreditDetails.DetailLine.ADAPTER.asRepeated().encodedSizeWithTag(1, creditDetails.detail_lines) + creditDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletEntrypoint.CreditDetails creditDetails = (AfterpayAppletEntrypoint.CreditDetails) obj;
        creditDetails.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(creditDetails.detail_lines, AfterpayAppletEntrypoint.CreditDetails.DetailLine.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletEntrypoint.CreditDetails(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletEntrypoint.CreditDetails creditDetails = (AfterpayAppletEntrypoint.CreditDetails) obj;
        creditDetails.getClass();
        AfterpayAppletEntrypoint.CreditDetails.DetailLine.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, creditDetails.detail_lines);
        protoWriter.writeBytes(creditDetails.unknownFields());
    }
}
