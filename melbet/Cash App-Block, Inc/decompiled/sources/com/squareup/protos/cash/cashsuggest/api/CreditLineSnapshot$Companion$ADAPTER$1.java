package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreditLineSnapshot$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditLineSnapshot(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CreditLineData.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLineSnapshot creditLineSnapshot = (CreditLineSnapshot) obj;
        reverseProtoWriter.getClass();
        creditLineSnapshot.getClass();
        reverseProtoWriter.writeBytes(creditLineSnapshot.unknownFields());
        CreditLineData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, creditLineSnapshot.credit_lines);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditLineSnapshot creditLineSnapshot = (CreditLineSnapshot) obj;
        creditLineSnapshot.getClass();
        return CreditLineData.ADAPTER.asRepeated().encodedSizeWithTag(1, creditLineSnapshot.credit_lines) + creditLineSnapshot.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLineSnapshot creditLineSnapshot = (CreditLineSnapshot) obj;
        creditLineSnapshot.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(creditLineSnapshot.credit_lines, CreditLineData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreditLineSnapshot(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLineSnapshot creditLineSnapshot = (CreditLineSnapshot) obj;
        creditLineSnapshot.getClass();
        CreditLineData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, creditLineSnapshot.credit_lines);
        protoWriter.writeBytes(creditLineSnapshot.unknownFields());
    }
}
