package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$AccessData$Button$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingInfo.AccessData.Button((String) obj, (LendingInfo.AccessData.Button.Icon) obj2, (Boolean) obj3, (String) obj4, (LocalizableString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = LendingInfo.AccessData.Button.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.AccessData.Button button = (LendingInfo.AccessData.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, button.localizable_text);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, button.action_flow_type);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, button.enabled);
        LendingInfo.AccessData.Button.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, button.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.AccessData.Button button = (LendingInfo.AccessData.Button) obj;
        button.getClass();
        int size$okio = button.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(5, button.localizable_text) + protoAdapter.encodedSizeWithTag(4, button.action_flow_type) + ProtoAdapter.BOOL.encodedSizeWithTag(3, button.enabled) + LendingInfo.AccessData.Button.Icon.ADAPTER.encodedSizeWithTag(2, button.icon) + protoAdapter.encodedSizeWithTag(1, button.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.AccessData.Button button = (LendingInfo.AccessData.Button) obj;
        button.getClass();
        LocalizableString localizableString = button.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = button.text;
        LendingInfo.AccessData.Button.Icon icon = button.icon;
        Boolean bool = button.enabled;
        String str2 = button.action_flow_type;
        byteString.getClass();
        return new LendingInfo.AccessData.Button(str, icon, bool, str2, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.AccessData.Button button = (LendingInfo.AccessData.Button) obj;
        button.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, button.text);
        LendingInfo.AccessData.Button.Icon.ADAPTER.encodeWithTag(protoWriter, 2, button.icon);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, button.enabled);
        protoAdapter.encodeWithTag(protoWriter, 4, button.action_flow_type);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 5, button.localizable_text);
        protoWriter.writeBytes(button.unknownFields());
    }
}
