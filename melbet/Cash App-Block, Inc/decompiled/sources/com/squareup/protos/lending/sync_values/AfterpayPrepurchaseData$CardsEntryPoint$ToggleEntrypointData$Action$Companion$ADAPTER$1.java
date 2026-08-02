package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjf;
import com.squareup.protos.lending.OpaqueRoute;
import com.squareup.protos.lending.Toggle;
import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjf zzjfVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action(zzjfVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzjfVar = new AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction((Toggle) Toggle.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjfVar = new AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction((OpaqueRoute) OpaqueRoute.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action action = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        zzjf zzjfVar = action.action;
        if (zzjfVar instanceof AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction) {
            Toggle.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction) zzjfVar).value);
        } else if (zzjfVar instanceof AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction) {
            OpaqueRoute.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction) zzjfVar).value);
        } else {
            if (zzjfVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action action = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action) obj;
        action.getClass();
        int size$okio = action.unknownFields().getSize$okio();
        zzjf zzjfVar = action.action;
        if (zzjfVar instanceof AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction) {
            encodedSizeWithTag = Toggle.ADAPTER.encodedSizeWithTag(1, ((AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction) zzjfVar).value);
        } else {
            if (!(zzjfVar instanceof AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction)) {
                if (zzjfVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = OpaqueRoute.ADAPTER.encodedSizeWithTag(2, ((AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction) zzjfVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action action = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action) obj;
        action.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzjf zzjfVar = action.action;
        byteString.getClass();
        return new AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action(zzjfVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action action = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action) obj;
        action.getClass();
        zzjf zzjfVar = action.action;
        if (zzjfVar instanceof AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction) {
            Toggle.ADAPTER.encodeWithTag(protoWriter, 1, ((AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$ToggleAction) zzjfVar).value);
        } else if (zzjfVar instanceof AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction) {
            OpaqueRoute.ADAPTER.encodeWithTag(protoWriter, 2, ((AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction) zzjfVar).value);
        } else if (zzjfVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(action.unknownFields());
    }
}
