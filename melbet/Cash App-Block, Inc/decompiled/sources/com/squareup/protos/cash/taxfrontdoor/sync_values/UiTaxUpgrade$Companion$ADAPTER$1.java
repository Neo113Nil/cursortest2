package com.squareup.protos.cash.taxfrontdoor.sync_values;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiTaxUpgrade$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiTaxUpgrade((String) obj, (UpgradeStatus) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = UpgradeStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiTaxUpgrade uiTaxUpgrade = (UiTaxUpgrade) obj;
        reverseProtoWriter.getClass();
        uiTaxUpgrade.getClass();
        reverseProtoWriter.writeBytes(uiTaxUpgrade.unknownFields());
        UpgradeStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uiTaxUpgrade.upgrade_status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, uiTaxUpgrade.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiTaxUpgrade uiTaxUpgrade = (UiTaxUpgrade) obj;
        uiTaxUpgrade.getClass();
        return UpgradeStatus.ADAPTER.encodedSizeWithTag(2, uiTaxUpgrade.upgrade_status) + ProtoAdapter.STRING.encodedSizeWithTag(1, uiTaxUpgrade.customer_token) + uiTaxUpgrade.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiTaxUpgrade uiTaxUpgrade = (UiTaxUpgrade) obj;
        uiTaxUpgrade.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = uiTaxUpgrade.customer_token;
        UpgradeStatus upgradeStatus = uiTaxUpgrade.upgrade_status;
        byteString.getClass();
        return new UiTaxUpgrade(str, upgradeStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiTaxUpgrade uiTaxUpgrade = (UiTaxUpgrade) obj;
        uiTaxUpgrade.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uiTaxUpgrade.customer_token);
        UpgradeStatus.ADAPTER.encodeWithTag(protoWriter, 2, uiTaxUpgrade.upgrade_status);
        protoWriter.writeBytes(uiTaxUpgrade.unknownFields());
    }
}
