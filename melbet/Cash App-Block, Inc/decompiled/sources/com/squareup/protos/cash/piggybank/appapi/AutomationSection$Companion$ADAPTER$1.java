package com.squareup.protos.cash.piggybank.appapi;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.savings.SavingsExternalElements;
import squareup.cash.savings.SavingsExternalElementsReference;

/* loaded from: classes7.dex */
public final class AutomationSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AutomationSection((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(SavingsExternalElementsReference.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(SavingsExternalElements.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AutomationSection automationSection = (AutomationSection) obj;
        reverseProtoWriter.getClass();
        automationSection.getClass();
        reverseProtoWriter.writeBytes(automationSection.unknownFields());
        SavingsExternalElements.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, automationSection.ui_specification);
        SavingsExternalElementsReference.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, automationSection.references);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, automationSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AutomationSection automationSection = (AutomationSection) obj;
        automationSection.getClass();
        return SavingsExternalElements.ADAPTER.asRepeated().encodedSizeWithTag(3, automationSection.ui_specification) + SavingsExternalElementsReference.ADAPTER.asRepeated().encodedSizeWithTag(2, automationSection.references) + ProtoAdapter.STRING.encodedSizeWithTag(1, automationSection.title) + automationSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AutomationSection automationSection = (AutomationSection) obj;
        automationSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(automationSection.references, SavingsExternalElementsReference.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(automationSection.ui_specification, SavingsExternalElements.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = automationSection.title;
        byteString.getClass();
        return new AutomationSection(str, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AutomationSection automationSection = (AutomationSection) obj;
        automationSection.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, automationSection.title);
        SavingsExternalElementsReference.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, automationSection.references);
        SavingsExternalElements.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, automationSection.ui_specification);
        protoWriter.writeBytes(automationSection.unknownFields());
    }
}
