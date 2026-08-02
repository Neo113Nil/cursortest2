package com.squareup.protos.rewardly.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.rewardly.ui.UiBoostAttribute;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UiBoostAttribute$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiBoostAttribute((UiBoostAttribute.Type) obj, (Icon) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = UiBoostAttribute.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiBoostAttribute uiBoostAttribute = (UiBoostAttribute) obj;
        reverseProtoWriter.getClass();
        uiBoostAttribute.getClass();
        reverseProtoWriter.writeBytes(uiBoostAttribute.unknownFields());
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uiBoostAttribute.arcade_icon);
        UiBoostAttribute.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiBoostAttribute.f1412type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiBoostAttribute uiBoostAttribute = (UiBoostAttribute) obj;
        uiBoostAttribute.getClass();
        return Icon.ADAPTER.encodedSizeWithTag(2, uiBoostAttribute.arcade_icon) + UiBoostAttribute.Type.ADAPTER.encodedSizeWithTag(1, uiBoostAttribute.f1412type) + uiBoostAttribute.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiBoostAttribute uiBoostAttribute = (UiBoostAttribute) obj;
        uiBoostAttribute.getClass();
        Icon icon = uiBoostAttribute.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        UiBoostAttribute.Type type2 = uiBoostAttribute.f1412type;
        byteString.getClass();
        return new UiBoostAttribute(type2, icon2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiBoostAttribute uiBoostAttribute = (UiBoostAttribute) obj;
        uiBoostAttribute.getClass();
        UiBoostAttribute.Type.ADAPTER.encodeWithTag(protoWriter, 1, uiBoostAttribute.f1412type);
        Icon.ADAPTER.encodeWithTag(protoWriter, 2, uiBoostAttribute.arcade_icon);
        protoWriter.writeBytes(uiBoostAttribute.unknownFields());
    }
}
