package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.Experiments;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Experiments$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Experiments((Experiments.BNPLAssistantExperiment) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Experiments.BNPLAssistantExperiment.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Experiments experiments = (Experiments) obj;
        reverseProtoWriter.getClass();
        experiments.getClass();
        reverseProtoWriter.writeBytes(experiments.unknownFields());
        Experiments.BNPLAssistantExperiment.ADAPTER.encodeWithTag(reverseProtoWriter, 1, experiments.bnpl_assistant_experiment);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Experiments experiments = (Experiments) obj;
        experiments.getClass();
        return Experiments.BNPLAssistantExperiment.ADAPTER.encodedSizeWithTag(1, experiments.bnpl_assistant_experiment) + experiments.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Experiments experiments = (Experiments) obj;
        experiments.getClass();
        Experiments.BNPLAssistantExperiment bNPLAssistantExperiment = experiments.bnpl_assistant_experiment;
        Experiments.BNPLAssistantExperiment bNPLAssistantExperiment2 = bNPLAssistantExperiment != null ? (Experiments.BNPLAssistantExperiment) Experiments.BNPLAssistantExperiment.ADAPTER.redact(bNPLAssistantExperiment) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Experiments(bNPLAssistantExperiment2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Experiments experiments = (Experiments) obj;
        experiments.getClass();
        Experiments.BNPLAssistantExperiment.ADAPTER.encodeWithTag(protoWriter, 1, experiments.bnpl_assistant_experiment);
        protoWriter.writeBytes(experiments.unknownFields());
    }
}
