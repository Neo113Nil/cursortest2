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
public final class GenericNonPaymentRenderData$MoreInfoSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericNonPaymentRenderData.MoreInfoSheet((PaymentHistoryData.MoreInfoSheetHeaderIcon) obj4, (PaymentHistoryData.UiStatusTreatment) obj5, (String) obj6, (String) obj7, (LocalizedString) obj8, (LocalizedString) obj9, (LocalizedString) obj10, (LocalizableString) obj11, (LocalizableString) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj4;
                    obj2 = obj5;
                    try {
                        obj4 = PaymentHistoryData.MoreInfoSheetHeaderIcon.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj5 = obj2;
                    break;
                case 2:
                    try {
                        obj5 = PaymentHistoryData.UiStatusTreatment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj8);
                    break;
                case 6:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj9);
                    break;
                case 7:
                    obj10 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj10);
                    break;
                case 8:
                    obj11 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj11);
                    break;
                case 9:
                    obj12 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj12);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericNonPaymentRenderData.MoreInfoSheet moreInfoSheet = (GenericNonPaymentRenderData.MoreInfoSheet) obj;
        reverseProtoWriter.getClass();
        moreInfoSheet.getClass();
        reverseProtoWriter.writeBytes(moreInfoSheet.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, moreInfoSheet.localizable_status_subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, moreInfoSheet.localizable_status_text);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, moreInfoSheet.localized_status_subtext);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, moreInfoSheet.localized_subtext);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, moreInfoSheet.localized_status_text);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, moreInfoSheet.status_subtext);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, moreInfoSheet.status_text);
        PaymentHistoryData.UiStatusTreatment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, moreInfoSheet.header_icon_treatment);
        PaymentHistoryData.MoreInfoSheetHeaderIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, moreInfoSheet.header_icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericNonPaymentRenderData.MoreInfoSheet moreInfoSheet = (GenericNonPaymentRenderData.MoreInfoSheet) obj;
        moreInfoSheet.getClass();
        int encodedSizeWithTag = PaymentHistoryData.UiStatusTreatment.ADAPTER.encodedSizeWithTag(2, moreInfoSheet.header_icon_treatment) + PaymentHistoryData.MoreInfoSheetHeaderIcon.ADAPTER.encodedSizeWithTag(1, moreInfoSheet.header_icon) + moreInfoSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, moreInfoSheet.status_subtext) + protoAdapter.encodedSizeWithTag(3, moreInfoSheet.status_text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(7, moreInfoSheet.localized_status_subtext) + protoAdapter2.encodedSizeWithTag(6, moreInfoSheet.localized_subtext) + protoAdapter2.encodedSizeWithTag(5, moreInfoSheet.localized_status_text) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
        return protoAdapter3.encodedSizeWithTag(9, moreInfoSheet.localizable_status_subtext) + protoAdapter3.encodedSizeWithTag(8, moreInfoSheet.localizable_status_text) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericNonPaymentRenderData.MoreInfoSheet moreInfoSheet = (GenericNonPaymentRenderData.MoreInfoSheet) obj;
        moreInfoSheet.getClass();
        LocalizedString localizedString = moreInfoSheet.localized_status_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = moreInfoSheet.localized_subtext;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = moreInfoSheet.localized_status_subtext;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizableString localizableString = moreInfoSheet.localizable_status_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = moreInfoSheet.localizable_status_subtext;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        PaymentHistoryData.MoreInfoSheetHeaderIcon moreInfoSheetHeaderIcon = moreInfoSheet.header_icon;
        PaymentHistoryData.UiStatusTreatment uiStatusTreatment = moreInfoSheet.header_icon_treatment;
        String str = moreInfoSheet.status_text;
        String str2 = moreInfoSheet.status_subtext;
        byteString.getClass();
        return new GenericNonPaymentRenderData.MoreInfoSheet(moreInfoSheetHeaderIcon, uiStatusTreatment, str, str2, localizedString2, localizedString4, localizedString6, localizableString2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericNonPaymentRenderData.MoreInfoSheet moreInfoSheet = (GenericNonPaymentRenderData.MoreInfoSheet) obj;
        moreInfoSheet.getClass();
        PaymentHistoryData.MoreInfoSheetHeaderIcon.ADAPTER.encodeWithTag(protoWriter, 1, moreInfoSheet.header_icon);
        PaymentHistoryData.UiStatusTreatment.ADAPTER.encodeWithTag(protoWriter, 2, moreInfoSheet.header_icon_treatment);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, moreInfoSheet.status_text);
        protoAdapter.encodeWithTag(protoWriter, 4, moreInfoSheet.status_subtext);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, moreInfoSheet.localized_status_text);
        protoAdapter2.encodeWithTag(protoWriter, 6, moreInfoSheet.localized_subtext);
        protoAdapter2.encodeWithTag(protoWriter, 7, moreInfoSheet.localized_status_subtext);
        ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 8, moreInfoSheet.localizable_status_text);
        protoAdapter3.encodeWithTag(protoWriter, 9, moreInfoSheet.localizable_status_subtext);
        protoWriter.writeBytes(moreInfoSheet.unknownFields());
    }
}
