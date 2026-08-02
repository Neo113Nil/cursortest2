package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class MerchantBlockingElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MerchantBlockingElement((String) obj, (LocalizableString) obj2, (UiControl.Icon) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = UiControl.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MerchantBlockingElement merchantBlockingElement = (MerchantBlockingElement) obj;
        reverseProtoWriter.getClass();
        merchantBlockingElement.getClass();
        reverseProtoWriter.writeBytes(merchantBlockingElement.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, merchantBlockingElement.client_route);
        UiControl.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, merchantBlockingElement.icon);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, merchantBlockingElement.localizable_row_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, merchantBlockingElement.row_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MerchantBlockingElement merchantBlockingElement = (MerchantBlockingElement) obj;
        merchantBlockingElement.getClass();
        int size$okio = merchantBlockingElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, merchantBlockingElement.client_route) + UiControl.Icon.ADAPTER.encodedSizeWithTag(3, merchantBlockingElement.icon) + LocalizableString.ADAPTER.encodedSizeWithTag(2, merchantBlockingElement.localizable_row_title) + protoAdapter.encodedSizeWithTag(1, merchantBlockingElement.row_title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MerchantBlockingElement merchantBlockingElement = (MerchantBlockingElement) obj;
        merchantBlockingElement.getClass();
        LocalizableString localizableString = merchantBlockingElement.localizable_row_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = merchantBlockingElement.row_title;
        UiControl.Icon icon = merchantBlockingElement.icon;
        String str2 = merchantBlockingElement.client_route;
        byteString.getClass();
        return new MerchantBlockingElement(str, localizableString2, icon, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MerchantBlockingElement merchantBlockingElement = (MerchantBlockingElement) obj;
        merchantBlockingElement.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, merchantBlockingElement.row_title);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 2, merchantBlockingElement.localizable_row_title);
        UiControl.Icon.ADAPTER.encodeWithTag(protoWriter, 3, merchantBlockingElement.icon);
        protoAdapter.encodeWithTag(protoWriter, 4, merchantBlockingElement.client_route);
        protoWriter.writeBytes(merchantBlockingElement.unknownFields());
    }
}
