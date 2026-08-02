package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManagerbotAutomationDefinition$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ManagerbotAutomationDefinition((ManagerbotAutomationTrigger) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ManagerbotAutomationTrigger.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ManagerbotAutomationAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ManagerbotAutomationDefinition managerbotAutomationDefinition = (ManagerbotAutomationDefinition) obj;
        reverseProtoWriter.getClass();
        managerbotAutomationDefinition.getClass();
        reverseProtoWriter.writeBytes(managerbotAutomationDefinition.unknownFields());
        ManagerbotAutomationAction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, managerbotAutomationDefinition.actions);
        ManagerbotAutomationTrigger.ADAPTER.encodeWithTag(reverseProtoWriter, 1, managerbotAutomationDefinition.trigger);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ManagerbotAutomationDefinition managerbotAutomationDefinition = (ManagerbotAutomationDefinition) obj;
        managerbotAutomationDefinition.getClass();
        return ManagerbotAutomationAction.ADAPTER.asRepeated().encodedSizeWithTag(2, managerbotAutomationDefinition.actions) + ManagerbotAutomationTrigger.ADAPTER.encodedSizeWithTag(1, managerbotAutomationDefinition.trigger) + managerbotAutomationDefinition.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ManagerbotAutomationDefinition managerbotAutomationDefinition = (ManagerbotAutomationDefinition) obj;
        managerbotAutomationDefinition.getClass();
        ManagerbotAutomationTrigger managerbotAutomationTrigger = managerbotAutomationDefinition.trigger;
        ManagerbotAutomationTrigger managerbotAutomationTrigger2 = managerbotAutomationTrigger != null ? (ManagerbotAutomationTrigger) ManagerbotAutomationTrigger.ADAPTER.redact(managerbotAutomationTrigger) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(managerbotAutomationDefinition.actions, ManagerbotAutomationAction.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ManagerbotAutomationDefinition(managerbotAutomationTrigger2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ManagerbotAutomationDefinition managerbotAutomationDefinition = (ManagerbotAutomationDefinition) obj;
        managerbotAutomationDefinition.getClass();
        ManagerbotAutomationTrigger.ADAPTER.encodeWithTag(protoWriter, 1, managerbotAutomationDefinition.trigger);
        ManagerbotAutomationAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, managerbotAutomationDefinition.actions);
        protoWriter.writeBytes(managerbotAutomationDefinition.unknownFields());
    }
}
