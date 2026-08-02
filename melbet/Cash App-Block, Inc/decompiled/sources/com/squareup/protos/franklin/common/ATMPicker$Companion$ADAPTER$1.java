package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ATMPicker$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ATMPicker(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Money.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ATMPicker aTMPicker = (ATMPicker) obj;
        reverseProtoWriter.getClass();
        aTMPicker.getClass();
        reverseProtoWriter.writeBytes(aTMPicker.unknownFields());
        Money.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, aTMPicker.options);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ATMPicker aTMPicker = (ATMPicker) obj;
        aTMPicker.getClass();
        return Money.ADAPTER.asRepeated().encodedSizeWithTag(1, aTMPicker.options) + aTMPicker.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ATMPicker aTMPicker = (ATMPicker) obj;
        aTMPicker.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(aTMPicker.options, Money.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ATMPicker(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ATMPicker aTMPicker = (ATMPicker) obj;
        aTMPicker.getClass();
        Money.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, aTMPicker.options);
        protoWriter.writeBytes(aTMPicker.unknownFields());
    }
}
