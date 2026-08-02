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
public final class GenericNonPaymentRenderData$ThreadedView$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericNonPaymentRenderData.ThreadedView((String) obj, (String) obj2, (PaymentHistoryData.Icon) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (LocalizableString) obj6, (LocalizableString) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    try {
                        obj3 = PaymentHistoryData.Icon.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericNonPaymentRenderData.ThreadedView threadedView = (GenericNonPaymentRenderData.ThreadedView) obj;
        reverseProtoWriter.getClass();
        threadedView.getClass();
        reverseProtoWriter.writeBytes(threadedView.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, threadedView.localizable_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, threadedView.localizable_title);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, threadedView.localized_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, threadedView.localized_title);
        PaymentHistoryData.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, threadedView.subtitle_icon);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, threadedView.subtitle);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, threadedView.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericNonPaymentRenderData.ThreadedView threadedView = (GenericNonPaymentRenderData.ThreadedView) obj;
        threadedView.getClass();
        int size$okio = threadedView.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = PaymentHistoryData.Icon.ADAPTER.encodedSizeWithTag(3, threadedView.subtitle_icon) + protoAdapter.encodedSizeWithTag(2, threadedView.subtitle) + protoAdapter.encodedSizeWithTag(1, threadedView.title) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, threadedView.localized_subtitle) + protoAdapter2.encodedSizeWithTag(4, threadedView.localized_title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
        return protoAdapter3.encodedSizeWithTag(7, threadedView.localizable_subtitle) + protoAdapter3.encodedSizeWithTag(6, threadedView.localizable_title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericNonPaymentRenderData.ThreadedView threadedView = (GenericNonPaymentRenderData.ThreadedView) obj;
        threadedView.getClass();
        LocalizedString localizedString = threadedView.localized_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = threadedView.localized_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizableString localizableString = threadedView.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = threadedView.localizable_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = threadedView.title;
        String str2 = threadedView.subtitle;
        PaymentHistoryData.Icon icon = threadedView.subtitle_icon;
        byteString.getClass();
        return new GenericNonPaymentRenderData.ThreadedView(str, str2, icon, localizedString2, localizedString4, localizableString2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericNonPaymentRenderData.ThreadedView threadedView = (GenericNonPaymentRenderData.ThreadedView) obj;
        threadedView.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, threadedView.title);
        protoAdapter.encodeWithTag(protoWriter, 2, threadedView.subtitle);
        PaymentHistoryData.Icon.ADAPTER.encodeWithTag(protoWriter, 3, threadedView.subtitle_icon);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, threadedView.localized_title);
        protoAdapter2.encodeWithTag(protoWriter, 5, threadedView.localized_subtitle);
        ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 6, threadedView.localizable_title);
        protoAdapter3.encodeWithTag(protoWriter, 7, threadedView.localizable_subtitle);
        protoWriter.writeBytes(threadedView.unknownFields());
    }
}
