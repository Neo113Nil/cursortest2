package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.ManagerbotAutomationAction;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManagerbotAutomationAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ManagerbotAutomationAction.Action action = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ManagerbotAutomationAction(action, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                action = new ManagerbotAutomationAction.Action.RunCustomPrompt((RunCustomPromptAction) RunCustomPromptAction.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                action = new ManagerbotAutomationAction.Action.SendReportingData((SendReportingDataAction) SendReportingDataAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ManagerbotAutomationAction managerbotAutomationAction = (ManagerbotAutomationAction) obj;
        reverseProtoWriter.getClass();
        managerbotAutomationAction.getClass();
        reverseProtoWriter.writeBytes(managerbotAutomationAction.unknownFields());
        ManagerbotAutomationAction.Action action = managerbotAutomationAction.action;
        if (action instanceof ManagerbotAutomationAction.Action.RunCustomPrompt) {
            RunCustomPromptAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ManagerbotAutomationAction.Action.RunCustomPrompt) action).getValue());
        } else if (action instanceof ManagerbotAutomationAction.Action.SendReportingData) {
            SendReportingDataAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ManagerbotAutomationAction.Action.SendReportingData) action).getValue());
        } else {
            if (action == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ManagerbotAutomationAction managerbotAutomationAction = (ManagerbotAutomationAction) obj;
        managerbotAutomationAction.getClass();
        int size$okio = managerbotAutomationAction.unknownFields().getSize$okio();
        ManagerbotAutomationAction.Action action = managerbotAutomationAction.action;
        if (action instanceof ManagerbotAutomationAction.Action.RunCustomPrompt) {
            encodedSizeWithTag = RunCustomPromptAction.ADAPTER.encodedSizeWithTag(1, ((ManagerbotAutomationAction.Action.RunCustomPrompt) action).getValue());
        } else {
            if (!(action instanceof ManagerbotAutomationAction.Action.SendReportingData)) {
                if (action == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SendReportingDataAction.ADAPTER.encodedSizeWithTag(2, ((ManagerbotAutomationAction.Action.SendReportingData) action).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ManagerbotAutomationAction managerbotAutomationAction = (ManagerbotAutomationAction) obj;
        managerbotAutomationAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        ManagerbotAutomationAction.Action action = managerbotAutomationAction.action;
        byteString.getClass();
        return new ManagerbotAutomationAction(action, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ManagerbotAutomationAction managerbotAutomationAction = (ManagerbotAutomationAction) obj;
        managerbotAutomationAction.getClass();
        ManagerbotAutomationAction.Action action = managerbotAutomationAction.action;
        if (action instanceof ManagerbotAutomationAction.Action.RunCustomPrompt) {
            RunCustomPromptAction.ADAPTER.encodeWithTag(protoWriter, 1, ((ManagerbotAutomationAction.Action.RunCustomPrompt) action).getValue());
        } else if (action instanceof ManagerbotAutomationAction.Action.SendReportingData) {
            SendReportingDataAction.ADAPTER.encodeWithTag(protoWriter, 2, ((ManagerbotAutomationAction.Action.SendReportingData) action).getValue());
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(managerbotAutomationAction.unknownFields());
    }
}
