package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$UpsellModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.UpsellModule(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CardModule.UpsellElement.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.UpsellModule upsellModule = (CardModule.UpsellModule) obj;
        reverseProtoWriter.getClass();
        upsellModule.getClass();
        reverseProtoWriter.writeBytes(upsellModule.unknownFields());
        CardModule.UpsellElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, upsellModule.elements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.UpsellModule upsellModule = (CardModule.UpsellModule) obj;
        upsellModule.getClass();
        return CardModule.UpsellElement.ADAPTER.asRepeated().encodedSizeWithTag(1, upsellModule.elements) + upsellModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.UpsellModule upsellModule = (CardModule.UpsellModule) obj;
        upsellModule.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(upsellModule.elements, CardModule.UpsellElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.UpsellModule(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.UpsellModule upsellModule = (CardModule.UpsellModule) obj;
        upsellModule.getClass();
        CardModule.UpsellElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, upsellModule.elements);
        protoWriter.writeBytes(upsellModule.unknownFields());
    }
}
