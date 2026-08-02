package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzik;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InputSpecification$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzik zzikVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InputSpecification((Boolean) obj, zzikVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzikVar = new InputSpecification$Specification$TextInput((TextInputSpec) TextInputSpec.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzikVar = new InputSpecification$Specification$AppointmentSlot((AppointmentSlotSpec) AppointmentSlotSpec.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzikVar = new InputSpecification$Specification$AddressInput((AddressInputSpec) AddressInputSpec.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                zzikVar = new InputSpecification$Specification$OptionPicker((OptionPickerSpec) OptionPickerSpec.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InputSpecification inputSpecification = (InputSpecification) obj;
        reverseProtoWriter.getClass();
        inputSpecification.getClass();
        reverseProtoWriter.writeBytes(inputSpecification.unknownFields());
        zzik zzikVar = inputSpecification.specification;
        if (zzikVar instanceof InputSpecification$Specification$TextInput) {
            TextInputSpec.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((InputSpecification$Specification$TextInput) zzikVar).value);
        } else if (zzikVar instanceof InputSpecification$Specification$AppointmentSlot) {
            AppointmentSlotSpec.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((InputSpecification$Specification$AppointmentSlot) zzikVar).value);
        } else if (zzikVar instanceof InputSpecification$Specification$AddressInput) {
            AddressInputSpec.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((InputSpecification$Specification$AddressInput) zzikVar).value);
        } else if (zzikVar instanceof InputSpecification$Specification$OptionPicker) {
            OptionPickerSpec.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((InputSpecification$Specification$OptionPicker) zzikVar).value);
        } else if (zzikVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, inputSpecification.optional);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InputSpecification inputSpecification = (InputSpecification) obj;
        inputSpecification.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(5, inputSpecification.optional) + inputSpecification.unknownFields().getSize$okio();
        zzik zzikVar = inputSpecification.specification;
        if (zzikVar instanceof InputSpecification$Specification$TextInput) {
            return TextInputSpec.ADAPTER.encodedSizeWithTag(1, ((InputSpecification$Specification$TextInput) zzikVar).value) + encodedSizeWithTag;
        }
        if (zzikVar instanceof InputSpecification$Specification$AppointmentSlot) {
            return AppointmentSlotSpec.ADAPTER.encodedSizeWithTag(2, ((InputSpecification$Specification$AppointmentSlot) zzikVar).value) + encodedSizeWithTag;
        }
        if (zzikVar instanceof InputSpecification$Specification$AddressInput) {
            return AddressInputSpec.ADAPTER.encodedSizeWithTag(3, ((InputSpecification$Specification$AddressInput) zzikVar).value) + encodedSizeWithTag;
        }
        if (zzikVar instanceof InputSpecification$Specification$OptionPicker) {
            return OptionPickerSpec.ADAPTER.encodedSizeWithTag(4, ((InputSpecification$Specification$OptionPicker) zzikVar).value) + encodedSizeWithTag;
        }
        if (zzikVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InputSpecification inputSpecification = (InputSpecification) obj;
        inputSpecification.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = inputSpecification.optional;
        zzik zzikVar = inputSpecification.specification;
        byteString.getClass();
        return new InputSpecification(bool, zzikVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InputSpecification inputSpecification = (InputSpecification) obj;
        inputSpecification.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, inputSpecification.optional);
        zzik zzikVar = inputSpecification.specification;
        if (zzikVar instanceof InputSpecification$Specification$TextInput) {
            TextInputSpec.ADAPTER.encodeWithTag(protoWriter, 1, ((InputSpecification$Specification$TextInput) zzikVar).value);
        } else if (zzikVar instanceof InputSpecification$Specification$AppointmentSlot) {
            AppointmentSlotSpec.ADAPTER.encodeWithTag(protoWriter, 2, ((InputSpecification$Specification$AppointmentSlot) zzikVar).value);
        } else if (zzikVar instanceof InputSpecification$Specification$AddressInput) {
            AddressInputSpec.ADAPTER.encodeWithTag(protoWriter, 3, ((InputSpecification$Specification$AddressInput) zzikVar).value);
        } else if (zzikVar instanceof InputSpecification$Specification$OptionPicker) {
            OptionPickerSpec.ADAPTER.encodeWithTag(protoWriter, 4, ((InputSpecification$Specification$OptionPicker) zzikVar).value);
        } else if (zzikVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(inputSpecification.unknownFields());
    }
}
