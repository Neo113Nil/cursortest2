package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.Experiments;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Experiments$BNPLAssistantExperiment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Experiments.BNPLAssistantExperiment(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Experiments.BNPLAssistantExperiment.Message.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Experiments.BNPLAssistantExperiment bNPLAssistantExperiment = (Experiments.BNPLAssistantExperiment) obj;
        reverseProtoWriter.getClass();
        bNPLAssistantExperiment.getClass();
        reverseProtoWriter.writeBytes(bNPLAssistantExperiment.unknownFields());
        Experiments.BNPLAssistantExperiment.Message.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, bNPLAssistantExperiment.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Experiments.BNPLAssistantExperiment bNPLAssistantExperiment = (Experiments.BNPLAssistantExperiment) obj;
        bNPLAssistantExperiment.getClass();
        return Experiments.BNPLAssistantExperiment.Message.ADAPTER.asRepeated().encodedSizeWithTag(1, bNPLAssistantExperiment.messages) + bNPLAssistantExperiment.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Experiments.BNPLAssistantExperiment bNPLAssistantExperiment = (Experiments.BNPLAssistantExperiment) obj;
        bNPLAssistantExperiment.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(bNPLAssistantExperiment.messages, Experiments.BNPLAssistantExperiment.Message.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Experiments.BNPLAssistantExperiment(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Experiments.BNPLAssistantExperiment bNPLAssistantExperiment = (Experiments.BNPLAssistantExperiment) obj;
        bNPLAssistantExperiment.getClass();
        Experiments.BNPLAssistantExperiment.Message.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, bNPLAssistantExperiment.messages);
        protoWriter.writeBytes(bNPLAssistantExperiment.unknownFields());
    }
}
