package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$TrustElements$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.TrustElements(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GenericProfileElement.TrustElement.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.TrustElements trustElements = (GenericProfileElement.TrustElements) obj;
        reverseProtoWriter.getClass();
        trustElements.getClass();
        reverseProtoWriter.writeBytes(trustElements.unknownFields());
        GenericProfileElement.TrustElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, trustElements.subelements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.TrustElements trustElements = (GenericProfileElement.TrustElements) obj;
        trustElements.getClass();
        return GenericProfileElement.TrustElement.ADAPTER.asRepeated().encodedSizeWithTag(1, trustElements.subelements) + trustElements.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.TrustElements trustElements = (GenericProfileElement.TrustElements) obj;
        trustElements.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(trustElements.subelements, GenericProfileElement.TrustElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GenericProfileElement.TrustElements(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.TrustElements trustElements = (GenericProfileElement.TrustElements) obj;
        trustElements.getClass();
        GenericProfileElement.TrustElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, trustElements.subelements);
        protoWriter.writeBytes(trustElements.unknownFields());
    }
}
