package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.PickerFieldConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PickerFieldConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        PickerFieldConfig.Source source = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PickerFieldConfig((String) obj, source, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                source = new PickerFieldConfig.Source.StaticSource((StaticPickerSource) StaticPickerSource.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                source = new PickerFieldConfig.Source.SavingsTransferOptionPicker((SavingsTransferOptionPicker) SavingsTransferOptionPicker.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PickerFieldConfig pickerFieldConfig = (PickerFieldConfig) obj;
        reverseProtoWriter.getClass();
        pickerFieldConfig.getClass();
        reverseProtoWriter.writeBytes(pickerFieldConfig.unknownFields());
        PickerFieldConfig.Source source = pickerFieldConfig.source;
        if (source instanceof PickerFieldConfig.Source.StaticSource) {
            StaticPickerSource.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((PickerFieldConfig.Source.StaticSource) source).getValue());
        } else if (source instanceof PickerFieldConfig.Source.SavingsTransferOptionPicker) {
            SavingsTransferOptionPicker.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((PickerFieldConfig.Source.SavingsTransferOptionPicker) source).getValue());
        } else if (source != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, pickerFieldConfig.prefilled_value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PickerFieldConfig pickerFieldConfig = (PickerFieldConfig) obj;
        pickerFieldConfig.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, pickerFieldConfig.prefilled_value) + pickerFieldConfig.unknownFields().getSize$okio();
        PickerFieldConfig.Source source = pickerFieldConfig.source;
        if (source instanceof PickerFieldConfig.Source.StaticSource) {
            return StaticPickerSource.ADAPTER.encodedSizeWithTag(1, ((PickerFieldConfig.Source.StaticSource) source).getValue()) + encodedSizeWithTag;
        }
        if (source instanceof PickerFieldConfig.Source.SavingsTransferOptionPicker) {
            return SavingsTransferOptionPicker.ADAPTER.encodedSizeWithTag(3, ((PickerFieldConfig.Source.SavingsTransferOptionPicker) source).getValue()) + encodedSizeWithTag;
        }
        if (source == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PickerFieldConfig pickerFieldConfig = (PickerFieldConfig) obj;
        pickerFieldConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = pickerFieldConfig.prefilled_value;
        PickerFieldConfig.Source source = pickerFieldConfig.source;
        byteString.getClass();
        return new PickerFieldConfig(str, source, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PickerFieldConfig pickerFieldConfig = (PickerFieldConfig) obj;
        pickerFieldConfig.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pickerFieldConfig.prefilled_value);
        PickerFieldConfig.Source source = pickerFieldConfig.source;
        if (source instanceof PickerFieldConfig.Source.StaticSource) {
            StaticPickerSource.ADAPTER.encodeWithTag(protoWriter, 1, ((PickerFieldConfig.Source.StaticSource) source).getValue());
        } else if (source instanceof PickerFieldConfig.Source.SavingsTransferOptionPicker) {
            SavingsTransferOptionPicker.ADAPTER.encodeWithTag(protoWriter, 3, ((PickerFieldConfig.Source.SavingsTransferOptionPicker) source).getValue());
        } else if (source != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(pickerFieldConfig.unknownFields());
    }
}
