package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashAppTagRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppTagRenderData((String) obj2, (String) obj3, (LocalizableString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppTagRenderData cashAppTagRenderData = (CashAppTagRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppTagRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppTagRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashAppTagRenderData.device_display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppTagRenderData.payment_method_display_name);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashAppTagRenderData.localizable_payment_method_display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppTagRenderData cashAppTagRenderData = (CashAppTagRenderData) obj;
        cashAppTagRenderData.getClass();
        int encodedSizeWithTag = LocalizableString.ADAPTER.encodedSizeWithTag(1, cashAppTagRenderData.localizable_payment_method_display_name) + cashAppTagRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, cashAppTagRenderData.device_display_name) + protoAdapter.encodedSizeWithTag(2, cashAppTagRenderData.payment_method_display_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppTagRenderData cashAppTagRenderData = (CashAppTagRenderData) obj;
        cashAppTagRenderData.getClass();
        LocalizableString localizableString = cashAppTagRenderData.localizable_payment_method_display_name;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppTagRenderData.payment_method_display_name;
        String str2 = cashAppTagRenderData.device_display_name;
        byteString.getClass();
        return new CashAppTagRenderData(str, str2, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppTagRenderData cashAppTagRenderData = (CashAppTagRenderData) obj;
        cashAppTagRenderData.getClass();
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 1, cashAppTagRenderData.localizable_payment_method_display_name);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppTagRenderData.payment_method_display_name);
        protoAdapter.encodeWithTag(protoWriter, 3, cashAppTagRenderData.device_display_name);
        protoWriter.writeBytes(cashAppTagRenderData.unknownFields());
    }
}
