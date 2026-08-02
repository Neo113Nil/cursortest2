package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class StaticLimitGroup$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StaticLimitGroup((CurrencyCode) obj, (SettingsGroup) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(SettingsGroup.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StaticLimitGroup staticLimitGroup = (StaticLimitGroup) obj;
        reverseProtoWriter.getClass();
        staticLimitGroup.getClass();
        reverseProtoWriter.writeBytes(staticLimitGroup.unknownFields());
        SettingsGroup.ADAPTER.encodeWithTag(reverseProtoWriter, 2, staticLimitGroup.balance_settings_group);
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 1, staticLimitGroup.currency);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StaticLimitGroup staticLimitGroup = (StaticLimitGroup) obj;
        staticLimitGroup.getClass();
        return SettingsGroup.ADAPTER.encodedSizeWithTag(2, staticLimitGroup.balance_settings_group) + CurrencyCode.ADAPTER.encodedSizeWithTag(1, staticLimitGroup.currency) + staticLimitGroup.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StaticLimitGroup staticLimitGroup = (StaticLimitGroup) obj;
        staticLimitGroup.getClass();
        SettingsGroup settingsGroup = staticLimitGroup.balance_settings_group;
        SettingsGroup settingsGroup2 = settingsGroup != null ? (SettingsGroup) SettingsGroup.ADAPTER.redact(settingsGroup) : null;
        ByteString byteString = ByteString.EMPTY;
        CurrencyCode currencyCode = staticLimitGroup.currency;
        byteString.getClass();
        return new StaticLimitGroup(currencyCode, settingsGroup2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StaticLimitGroup staticLimitGroup = (StaticLimitGroup) obj;
        staticLimitGroup.getClass();
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 1, staticLimitGroup.currency);
        SettingsGroup.ADAPTER.encodeWithTag(protoWriter, 2, staticLimitGroup.balance_settings_group);
        protoWriter.writeBytes(staticLimitGroup.unknownFields());
    }
}
