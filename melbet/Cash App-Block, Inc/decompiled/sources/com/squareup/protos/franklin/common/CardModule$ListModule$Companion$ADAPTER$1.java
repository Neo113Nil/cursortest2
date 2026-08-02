package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardModule$ListModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.ListModule(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CardModuleElement.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.ListModule listModule = (CardModule.ListModule) obj;
        reverseProtoWriter.getClass();
        listModule.getClass();
        reverseProtoWriter.writeBytes(listModule.unknownFields());
        CardModuleElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, listModule.elements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.ListModule listModule = (CardModule.ListModule) obj;
        listModule.getClass();
        return CardModuleElement.ADAPTER.asRepeated().encodedSizeWithTag(1, listModule.elements) + listModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.ListModule listModule = (CardModule.ListModule) obj;
        listModule.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listModule.elements, CardModuleElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.ListModule(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.ListModule listModule = (CardModule.ListModule) obj;
        listModule.getClass();
        CardModuleElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listModule.elements);
        protoWriter.writeBytes(listModule.unknownFields());
    }
}
