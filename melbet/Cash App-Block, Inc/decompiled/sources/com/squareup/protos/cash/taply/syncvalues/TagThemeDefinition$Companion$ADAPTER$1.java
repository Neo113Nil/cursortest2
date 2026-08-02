package com.squareup.protos.cash.taply.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TagThemeDefinition$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TagThemeDefinition((String) obj, (LocalizedString) obj2, (TagThemeDefinition.TagFormFactor) obj3, (TagThemeDefinition.TagVariant) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = TagThemeDefinition.TagFormFactor.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = TagThemeDefinition.TagVariant.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TagThemeDefinition tagThemeDefinition = (TagThemeDefinition) obj;
        reverseProtoWriter.getClass();
        tagThemeDefinition.getClass();
        reverseProtoWriter.writeBytes(tagThemeDefinition.unknownFields());
        TagThemeDefinition.TagVariant.ADAPTER.encodeWithTag(reverseProtoWriter, 4, tagThemeDefinition.variant);
        TagThemeDefinition.TagFormFactor.ADAPTER.encodeWithTag(reverseProtoWriter, 3, tagThemeDefinition.form_factor);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tagThemeDefinition.name);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, tagThemeDefinition.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TagThemeDefinition tagThemeDefinition = (TagThemeDefinition) obj;
        tagThemeDefinition.getClass();
        return TagThemeDefinition.TagVariant.ADAPTER.encodedSizeWithTag(4, tagThemeDefinition.variant) + TagThemeDefinition.TagFormFactor.ADAPTER.encodedSizeWithTag(3, tagThemeDefinition.form_factor) + LocalizedString.ADAPTER.encodedSizeWithTag(2, tagThemeDefinition.name) + ProtoAdapter.STRING.encodedSizeWithTag(1, tagThemeDefinition.token) + tagThemeDefinition.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TagThemeDefinition tagThemeDefinition = (TagThemeDefinition) obj;
        tagThemeDefinition.getClass();
        LocalizedString localizedString = tagThemeDefinition.name;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = tagThemeDefinition.token;
        TagThemeDefinition.TagFormFactor tagFormFactor = tagThemeDefinition.form_factor;
        TagThemeDefinition.TagVariant tagVariant = tagThemeDefinition.variant;
        byteString.getClass();
        return new TagThemeDefinition(str, localizedString2, tagFormFactor, tagVariant, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TagThemeDefinition tagThemeDefinition = (TagThemeDefinition) obj;
        tagThemeDefinition.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tagThemeDefinition.token);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, tagThemeDefinition.name);
        TagThemeDefinition.TagFormFactor.ADAPTER.encodeWithTag(protoWriter, 3, tagThemeDefinition.form_factor);
        TagThemeDefinition.TagVariant.ADAPTER.encodeWithTag(protoWriter, 4, tagThemeDefinition.variant);
        protoWriter.writeBytes(tagThemeDefinition.unknownFields());
    }
}
