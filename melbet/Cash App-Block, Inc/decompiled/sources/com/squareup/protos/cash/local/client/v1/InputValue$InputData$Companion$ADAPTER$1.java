package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzil;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InputValue$InputData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzil zzilVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InputValue.InputData(zzilVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzilVar = new InputValue$InputData$Data$TextValue((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 2) {
                zzilVar = new InputValue$InputData$Data$AppointmentSlotValue((InputValue.AppointmentSlotValue) InputValue.AppointmentSlotValue.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzilVar = new InputValue$InputData$Data$AddressValue((LocalAddress) LocalAddress.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzilVar = new InputValue$InputData$Data$SelectedOptionId((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InputValue.InputData inputData = (InputValue.InputData) obj;
        reverseProtoWriter.getClass();
        inputData.getClass();
        reverseProtoWriter.writeBytes(inputData.unknownFields());
        zzil zzilVar = inputData.data;
        if (zzilVar instanceof InputValue$InputData$Data$TextValue) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, ((InputValue$InputData$Data$TextValue) zzilVar).value);
            return;
        }
        if (zzilVar instanceof InputValue$InputData$Data$AppointmentSlotValue) {
            InputValue.AppointmentSlotValue.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((InputValue$InputData$Data$AppointmentSlotValue) zzilVar).value);
            return;
        }
        if (zzilVar instanceof InputValue$InputData$Data$AddressValue) {
            LocalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((InputValue$InputData$Data$AddressValue) zzilVar).value);
        } else if (zzilVar instanceof InputValue$InputData$Data$SelectedOptionId) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((InputValue$InputData$Data$SelectedOptionId) zzilVar).value);
        } else {
            if (zzilVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        InputValue.InputData inputData = (InputValue.InputData) obj;
        inputData.getClass();
        int size$okio = inputData.unknownFields().getSize$okio();
        zzil zzilVar = inputData.data;
        if (zzilVar instanceof InputValue$InputData$Data$TextValue) {
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, ((InputValue$InputData$Data$TextValue) zzilVar).value);
        } else if (zzilVar instanceof InputValue$InputData$Data$AppointmentSlotValue) {
            encodedSizeWithTag = InputValue.AppointmentSlotValue.ADAPTER.encodedSizeWithTag(2, ((InputValue$InputData$Data$AppointmentSlotValue) zzilVar).value);
        } else if (zzilVar instanceof InputValue$InputData$Data$AddressValue) {
            encodedSizeWithTag = LocalAddress.ADAPTER.encodedSizeWithTag(3, ((InputValue$InputData$Data$AddressValue) zzilVar).value);
        } else {
            if (!(zzilVar instanceof InputValue$InputData$Data$SelectedOptionId)) {
                if (zzilVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(4, ((InputValue$InputData$Data$SelectedOptionId) zzilVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InputValue.InputData inputData = (InputValue.InputData) obj;
        inputData.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzil zzilVar = inputData.data;
        byteString.getClass();
        return new InputValue.InputData(zzilVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InputValue.InputData inputData = (InputValue.InputData) obj;
        inputData.getClass();
        zzil zzilVar = inputData.data;
        if (zzilVar instanceof InputValue$InputData$Data$TextValue) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ((InputValue$InputData$Data$TextValue) zzilVar).value);
        } else if (zzilVar instanceof InputValue$InputData$Data$AppointmentSlotValue) {
            InputValue.AppointmentSlotValue.ADAPTER.encodeWithTag(protoWriter, 2, ((InputValue$InputData$Data$AppointmentSlotValue) zzilVar).value);
        } else if (zzilVar instanceof InputValue$InputData$Data$AddressValue) {
            LocalAddress.ADAPTER.encodeWithTag(protoWriter, 3, ((InputValue$InputData$Data$AddressValue) zzilVar).value);
        } else if (zzilVar instanceof InputValue$InputData$Data$SelectedOptionId) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ((InputValue$InputData$Data$SelectedOptionId) zzilVar).value);
        } else if (zzilVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(inputData.unknownFields());
    }
}
