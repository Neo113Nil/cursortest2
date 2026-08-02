package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InitialBlockerData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitialBlockerData(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ScenarioPlanEntry.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitialBlockerData initialBlockerData = (InitialBlockerData) obj;
        reverseProtoWriter.getClass();
        initialBlockerData.getClass();
        reverseProtoWriter.writeBytes(initialBlockerData.unknownFields());
        ScenarioPlanEntry.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, initialBlockerData.scenario_plan_entries);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitialBlockerData initialBlockerData = (InitialBlockerData) obj;
        initialBlockerData.getClass();
        return ScenarioPlanEntry.ADAPTER.asRepeated().encodedSizeWithTag(1, initialBlockerData.scenario_plan_entries) + initialBlockerData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitialBlockerData initialBlockerData = (InitialBlockerData) obj;
        initialBlockerData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(initialBlockerData.scenario_plan_entries, ScenarioPlanEntry.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InitialBlockerData(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitialBlockerData initialBlockerData = (InitialBlockerData) obj;
        initialBlockerData.getClass();
        ScenarioPlanEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, initialBlockerData.scenario_plan_entries);
        protoWriter.writeBytes(initialBlockerData.unknownFields());
    }
}
