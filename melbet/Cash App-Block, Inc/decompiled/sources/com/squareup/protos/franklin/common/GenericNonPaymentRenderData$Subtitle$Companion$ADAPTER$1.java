package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GenericNonPaymentRenderData$Subtitle$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GenericNonPaymentRenderData.Subtitle((String) obj, (PaymentHistoryData.Icon) obj2, (LocalizedString) obj3, (LocalizableString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = PaymentHistoryData.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericNonPaymentRenderData.Subtitle subtitle = (GenericNonPaymentRenderData.Subtitle) obj;
        reverseProtoWriter.getClass();
        subtitle.getClass();
        reverseProtoWriter.writeBytes(subtitle.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, subtitle.localizable_text);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, subtitle.localized_text);
        PaymentHistoryData.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, subtitle.icon);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, subtitle.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericNonPaymentRenderData.Subtitle subtitle = (GenericNonPaymentRenderData.Subtitle) obj;
        subtitle.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(4, subtitle.localizable_text) + LocalizedString.ADAPTER.encodedSizeWithTag(3, subtitle.localized_text) + PaymentHistoryData.Icon.ADAPTER.encodedSizeWithTag(2, subtitle.icon) + ProtoAdapter.STRING.encodedSizeWithTag(1, subtitle.text) + subtitle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericNonPaymentRenderData.Subtitle subtitle = (GenericNonPaymentRenderData.Subtitle) obj;
        subtitle.getClass();
        LocalizedString localizedString = subtitle.localized_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizableString localizableString = subtitle.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = subtitle.text;
        PaymentHistoryData.Icon icon = subtitle.icon;
        byteString.getClass();
        return new GenericNonPaymentRenderData.Subtitle(str, icon, localizedString2, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericNonPaymentRenderData.Subtitle subtitle = (GenericNonPaymentRenderData.Subtitle) obj;
        subtitle.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, subtitle.text);
        PaymentHistoryData.Icon.ADAPTER.encodeWithTag(protoWriter, 2, subtitle.icon);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, subtitle.localized_text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 4, subtitle.localizable_text);
        protoWriter.writeBytes(subtitle.unknownFields());
    }
}
