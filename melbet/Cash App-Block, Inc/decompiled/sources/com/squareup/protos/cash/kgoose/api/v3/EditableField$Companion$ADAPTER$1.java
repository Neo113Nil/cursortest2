package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.EditableField;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/EditableField$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EditableField$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        EditableField.FieldConfig fieldConfig = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EditableField((LocalizedString) obj, (LocalizedString) obj2, fieldConfig, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 5) {
                fieldConfig = new EditableField.FieldConfig.AmountConfig((AmountFieldConfig) AmountFieldConfig.ADAPTER.decode(protoReader));
            } else if (nextTag == 6) {
                fieldConfig = new EditableField.FieldConfig.TextConfig((TextFieldConfig) TextFieldConfig.ADAPTER.decode(protoReader));
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                fieldConfig = new EditableField.FieldConfig.PickerConfig((PickerFieldConfig) PickerFieldConfig.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EditableField editableField = (EditableField) obj;
        reverseProtoWriter.getClass();
        editableField.getClass();
        reverseProtoWriter.writeBytes(editableField.unknownFields());
        EditableField.FieldConfig fieldConfig = editableField.field_config;
        if (fieldConfig instanceof EditableField.FieldConfig.AmountConfig) {
            AmountFieldConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((EditableField.FieldConfig.AmountConfig) fieldConfig).getValue());
        } else if (fieldConfig instanceof EditableField.FieldConfig.TextConfig) {
            TextFieldConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((EditableField.FieldConfig.TextConfig) fieldConfig).getValue());
        } else if (fieldConfig instanceof EditableField.FieldConfig.PickerConfig) {
            PickerFieldConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((EditableField.FieldConfig.PickerConfig) fieldConfig).getValue());
        } else if (fieldConfig != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, editableField.accessibility_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, editableField.display_format);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        EditableField editableField = (EditableField) obj;
        editableField.getClass();
        int size$okio = editableField.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, editableField.accessibility_label) + protoAdapter.encodedSizeWithTag(1, editableField.display_format) + size$okio;
        EditableField.FieldConfig fieldConfig = editableField.field_config;
        if (fieldConfig instanceof EditableField.FieldConfig.AmountConfig) {
            encodedSizeWithTag = AmountFieldConfig.ADAPTER.encodedSizeWithTag(5, ((EditableField.FieldConfig.AmountConfig) fieldConfig).getValue());
        } else if (fieldConfig instanceof EditableField.FieldConfig.TextConfig) {
            encodedSizeWithTag = TextFieldConfig.ADAPTER.encodedSizeWithTag(6, ((EditableField.FieldConfig.TextConfig) fieldConfig).getValue());
        } else {
            if (!(fieldConfig instanceof EditableField.FieldConfig.PickerConfig)) {
                if (fieldConfig == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = PickerFieldConfig.ADAPTER.encodedSizeWithTag(7, ((EditableField.FieldConfig.PickerConfig) fieldConfig).getValue());
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EditableField editableField = (EditableField) obj;
        editableField.getClass();
        LocalizedString localizedString = editableField.display_format;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = editableField.accessibility_label;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        EditableField.FieldConfig fieldConfig = editableField.field_config;
        byteString.getClass();
        return new EditableField(localizedString2, localizedString4, fieldConfig, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EditableField editableField = (EditableField) obj;
        editableField.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, editableField.display_format);
        protoAdapter.encodeWithTag(protoWriter, 2, editableField.accessibility_label);
        EditableField.FieldConfig fieldConfig = editableField.field_config;
        if (fieldConfig instanceof EditableField.FieldConfig.AmountConfig) {
            AmountFieldConfig.ADAPTER.encodeWithTag(protoWriter, 5, ((EditableField.FieldConfig.AmountConfig) fieldConfig).getValue());
        } else if (fieldConfig instanceof EditableField.FieldConfig.TextConfig) {
            TextFieldConfig.ADAPTER.encodeWithTag(protoWriter, 6, ((EditableField.FieldConfig.TextConfig) fieldConfig).getValue());
        } else if (fieldConfig instanceof EditableField.FieldConfig.PickerConfig) {
            PickerFieldConfig.ADAPTER.encodeWithTag(protoWriter, 7, ((EditableField.FieldConfig.PickerConfig) fieldConfig).getValue());
        } else if (fieldConfig != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(editableField.unknownFields());
    }
}
