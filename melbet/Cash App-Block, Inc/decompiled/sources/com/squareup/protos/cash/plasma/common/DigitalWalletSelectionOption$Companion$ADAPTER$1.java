package com.squareup.protos.cash.plasma.common;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.squareup.protos.cash.plasma.common.DigitalWalletSelectionOption;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DigitalWalletSelectionOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzkh zzkhVar = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DigitalWalletSelectionOption((DigitalWalletSelectionOption.Type) obj, zzkhVar, (DigitalWalletSelectionOption.InstrumentLink) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DigitalWalletSelectionOption.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                zzkhVar = new DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload((DigitalWalletSelectionOption.ApplePayPayload) DigitalWalletSelectionOption.ApplePayPayload.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(DigitalWalletSelectionOption.InstrumentLink.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzkhVar = new DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload((DigitalWalletSelectionOption.GooglePayPayload) DigitalWalletSelectionOption.GooglePayPayload.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DigitalWalletSelectionOption digitalWalletSelectionOption = (DigitalWalletSelectionOption) obj;
        reverseProtoWriter.getClass();
        digitalWalletSelectionOption.getClass();
        reverseProtoWriter.writeBytes(digitalWalletSelectionOption.unknownFields());
        zzkh zzkhVar = digitalWalletSelectionOption.additional_params;
        if (zzkhVar instanceof DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload) {
            DigitalWalletSelectionOption.ApplePayPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload) zzkhVar).value);
        } else if (zzkhVar instanceof DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload) {
            DigitalWalletSelectionOption.GooglePayPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload) zzkhVar).value);
        } else if (zzkhVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        DigitalWalletSelectionOption.InstrumentLink.ADAPTER.encodeWithTag(reverseProtoWriter, 3, digitalWalletSelectionOption.instrument_link);
        DigitalWalletSelectionOption.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, digitalWalletSelectionOption.f1326type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        DigitalWalletSelectionOption digitalWalletSelectionOption = (DigitalWalletSelectionOption) obj;
        digitalWalletSelectionOption.getClass();
        int encodedSizeWithTag2 = DigitalWalletSelectionOption.Type.ADAPTER.encodedSizeWithTag(1, digitalWalletSelectionOption.f1326type) + digitalWalletSelectionOption.unknownFields().getSize$okio();
        zzkh zzkhVar = digitalWalletSelectionOption.additional_params;
        if (zzkhVar instanceof DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload) {
            encodedSizeWithTag = DigitalWalletSelectionOption.ApplePayPayload.ADAPTER.encodedSizeWithTag(2, ((DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload) zzkhVar).value);
        } else {
            if (!(zzkhVar instanceof DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload)) {
                if (zzkhVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return DigitalWalletSelectionOption.InstrumentLink.ADAPTER.encodedSizeWithTag(3, digitalWalletSelectionOption.instrument_link) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = DigitalWalletSelectionOption.GooglePayPayload.ADAPTER.encodedSizeWithTag(4, ((DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload) zzkhVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return DigitalWalletSelectionOption.InstrumentLink.ADAPTER.encodedSizeWithTag(3, digitalWalletSelectionOption.instrument_link) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DigitalWalletSelectionOption digitalWalletSelectionOption = (DigitalWalletSelectionOption) obj;
        digitalWalletSelectionOption.getClass();
        DigitalWalletSelectionOption.InstrumentLink instrumentLink = digitalWalletSelectionOption.instrument_link;
        DigitalWalletSelectionOption.InstrumentLink instrumentLink2 = instrumentLink != null ? (DigitalWalletSelectionOption.InstrumentLink) DigitalWalletSelectionOption.InstrumentLink.ADAPTER.redact(instrumentLink) : null;
        ByteString byteString = ByteString.EMPTY;
        DigitalWalletSelectionOption.Type type2 = digitalWalletSelectionOption.f1326type;
        zzkh zzkhVar = digitalWalletSelectionOption.additional_params;
        byteString.getClass();
        return new DigitalWalletSelectionOption(type2, zzkhVar, instrumentLink2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DigitalWalletSelectionOption digitalWalletSelectionOption = (DigitalWalletSelectionOption) obj;
        digitalWalletSelectionOption.getClass();
        DigitalWalletSelectionOption.Type.ADAPTER.encodeWithTag(protoWriter, 1, digitalWalletSelectionOption.f1326type);
        DigitalWalletSelectionOption.InstrumentLink.ADAPTER.encodeWithTag(protoWriter, 3, digitalWalletSelectionOption.instrument_link);
        zzkh zzkhVar = digitalWalletSelectionOption.additional_params;
        if (zzkhVar instanceof DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload) {
            DigitalWalletSelectionOption.ApplePayPayload.ADAPTER.encodeWithTag(protoWriter, 2, ((DigitalWalletSelectionOption$AdditionalParams$ApplePayPayload) zzkhVar).value);
        } else if (zzkhVar instanceof DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload) {
            DigitalWalletSelectionOption.GooglePayPayload.ADAPTER.encodeWithTag(protoWriter, 4, ((DigitalWalletSelectionOption$AdditionalParams$GooglePayPayload) zzkhVar).value);
        } else if (zzkhVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(digitalWalletSelectionOption.unknownFields());
    }
}
