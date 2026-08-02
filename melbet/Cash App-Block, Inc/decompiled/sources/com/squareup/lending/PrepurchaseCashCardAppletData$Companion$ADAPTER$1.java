package com.squareup.lending;

import androidx.room.TransactorKt;
import app.cash.local.presenters.internal.LocalBrandBannersKt;
import app.cash.local.presenters.internal.LocalMenuItemsKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zztc;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        zztc zztcVar = null;
        Object obj3 = null;
        Object obj4 = null;
        LocalBrandBannersKt localBrandBannersKt = null;
        LocalMenuItemsKt localMenuItemsKt = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCashCardAppletData((PrepurchaseCashCardAppletData.Locale) obj, (LocalizedString) obj2, zztcVar, (LocalizedString) obj3, m, (LocalizedString) obj4, localBrandBannersKt, localMenuItemsKt, (PrepurchaseCashCardAppletData.PaymentPlansData) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 2:
                    zztcVar = new PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle((LocalizedString) LocalizedString.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    m.add(PrepurchaseCashCardAppletData.InfoRow.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    localBrandBannersKt = new PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent((PrepurchaseCashCardAppletData.FooterButtonContent) PrepurchaseCashCardAppletData.FooterButtonContent.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    localBrandBannersKt = new PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent((PrepurchaseCashCardAppletData.UnknownContent) PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    localMenuItemsKt = new PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent((PrepurchaseCashCardAppletData.FooterButtonContent) PrepurchaseCashCardAppletData.FooterButtonContent.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    localMenuItemsKt = new PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent((PrepurchaseCashCardAppletData.UnknownContent) PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    obj5 = TransactorKt.decodeMessageOrMerge(PrepurchaseCashCardAppletData.PaymentPlansData.ADAPTER, protoReader, obj5);
                    break;
                case 10:
                    zztcVar = new PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent((PrepurchaseCashCardAppletData.UnknownContent) PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    obj = TransactorKt.decodeMessageOrMerge(PrepurchaseCashCardAppletData.Locale.ADAPTER, protoReader, obj);
                    break;
                case 12:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = (PrepurchaseCashCardAppletData) obj;
        reverseProtoWriter.getClass();
        prepurchaseCashCardAppletData.getClass();
        reverseProtoWriter.writeBytes(prepurchaseCashCardAppletData.unknownFields());
        LocalMenuItemsKt localMenuItemsKt = prepurchaseCashCardAppletData.secondary_footer_button_state;
        if (localMenuItemsKt instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) {
            PrepurchaseCashCardAppletData.FooterButtonContent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) localMenuItemsKt).value);
        } else if (localMenuItemsKt instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent) {
            PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent) localMenuItemsKt).value);
        } else if (localMenuItemsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalBrandBannersKt localBrandBannersKt = prepurchaseCashCardAppletData.primary_footer_button_state;
        if (localBrandBannersKt instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent) {
            PrepurchaseCashCardAppletData.FooterButtonContent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent) localBrandBannersKt).value);
        } else if (localBrandBannersKt instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent) {
            PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent) localBrandBannersKt).value);
        } else if (localBrandBannersKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zztc zztcVar = prepurchaseCashCardAppletData.loadable_subtitle;
        if (zztcVar instanceof PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle) zztcVar).value);
        } else if (zztcVar instanceof PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent) {
            PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent) zztcVar).value);
        } else if (zztcVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        PrepurchaseCashCardAppletData.PaymentPlansData.ADAPTER.encodeWithTag(reverseProtoWriter, 9, prepurchaseCashCardAppletData.payment_plans_data);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, prepurchaseCashCardAppletData.footer_text);
        PrepurchaseCashCardAppletData.InfoRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, prepurchaseCashCardAppletData.info_rows);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, prepurchaseCashCardAppletData.info_rows_header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, prepurchaseCashCardAppletData.title);
        PrepurchaseCashCardAppletData.Locale.ADAPTER.encodeWithTag(reverseProtoWriter, 11, prepurchaseCashCardAppletData.locale);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006c  */
    @Override // com.squareup.wire.ProtoAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LocalBrandBannersKt localBrandBannersKt;
        int encodedSizeWithTag2;
        LocalMenuItemsKt localMenuItemsKt;
        int encodedSizeWithTag3;
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = (PrepurchaseCashCardAppletData) obj;
        prepurchaseCashCardAppletData.getClass();
        int encodedSizeWithTag4 = PrepurchaseCashCardAppletData.Locale.ADAPTER.encodedSizeWithTag(11, prepurchaseCashCardAppletData.locale) + prepurchaseCashCardAppletData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag5 = protoAdapter.encodedSizeWithTag(1, prepurchaseCashCardAppletData.title) + encodedSizeWithTag4;
        zztc zztcVar = prepurchaseCashCardAppletData.loadable_subtitle;
        if (zztcVar instanceof PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, ((PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle) zztcVar).value);
        } else {
            if (!(zztcVar instanceof PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent)) {
                if (zztcVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag6 = protoAdapter.encodedSizeWithTag(4, prepurchaseCashCardAppletData.footer_text) + PrepurchaseCashCardAppletData.InfoRow.ADAPTER.asRepeated().encodedSizeWithTag(3, prepurchaseCashCardAppletData.info_rows) + protoAdapter.encodedSizeWithTag(12, prepurchaseCashCardAppletData.info_rows_header) + encodedSizeWithTag5;
                localBrandBannersKt = prepurchaseCashCardAppletData.primary_footer_button_state;
                if (!(localBrandBannersKt instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent)) {
                    encodedSizeWithTag2 = PrepurchaseCashCardAppletData.FooterButtonContent.ADAPTER.encodedSizeWithTag(5, ((PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent) localBrandBannersKt).value);
                } else {
                    if (!(localBrandBannersKt instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent)) {
                        if (localBrandBannersKt != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        localMenuItemsKt = prepurchaseCashCardAppletData.secondary_footer_button_state;
                        if (localMenuItemsKt instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) {
                            encodedSizeWithTag3 = PrepurchaseCashCardAppletData.FooterButtonContent.ADAPTER.encodedSizeWithTag(7, ((PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) localMenuItemsKt).value);
                        } else {
                            if (!(localMenuItemsKt instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent)) {
                                if (localMenuItemsKt != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return 0;
                                }
                                return PrepurchaseCashCardAppletData.PaymentPlansData.ADAPTER.encodedSizeWithTag(9, prepurchaseCashCardAppletData.payment_plans_data) + encodedSizeWithTag6;
                            }
                            encodedSizeWithTag3 = PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodedSizeWithTag(8, ((PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent) localMenuItemsKt).value);
                        }
                        encodedSizeWithTag6 += encodedSizeWithTag3;
                        return PrepurchaseCashCardAppletData.PaymentPlansData.ADAPTER.encodedSizeWithTag(9, prepurchaseCashCardAppletData.payment_plans_data) + encodedSizeWithTag6;
                    }
                    encodedSizeWithTag2 = PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodedSizeWithTag(6, ((PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent) localBrandBannersKt).value);
                }
                encodedSizeWithTag6 += encodedSizeWithTag2;
                localMenuItemsKt = prepurchaseCashCardAppletData.secondary_footer_button_state;
                if (localMenuItemsKt instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) {
                }
                encodedSizeWithTag6 += encodedSizeWithTag3;
                return PrepurchaseCashCardAppletData.PaymentPlansData.ADAPTER.encodedSizeWithTag(9, prepurchaseCashCardAppletData.payment_plans_data) + encodedSizeWithTag6;
            }
            encodedSizeWithTag = PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodedSizeWithTag(10, ((PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent) zztcVar).value);
        }
        encodedSizeWithTag5 += encodedSizeWithTag;
        int encodedSizeWithTag62 = protoAdapter.encodedSizeWithTag(4, prepurchaseCashCardAppletData.footer_text) + PrepurchaseCashCardAppletData.InfoRow.ADAPTER.asRepeated().encodedSizeWithTag(3, prepurchaseCashCardAppletData.info_rows) + protoAdapter.encodedSizeWithTag(12, prepurchaseCashCardAppletData.info_rows_header) + encodedSizeWithTag5;
        localBrandBannersKt = prepurchaseCashCardAppletData.primary_footer_button_state;
        if (!(localBrandBannersKt instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent)) {
        }
        encodedSizeWithTag62 += encodedSizeWithTag2;
        localMenuItemsKt = prepurchaseCashCardAppletData.secondary_footer_button_state;
        if (localMenuItemsKt instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) {
        }
        encodedSizeWithTag62 += encodedSizeWithTag3;
        return PrepurchaseCashCardAppletData.PaymentPlansData.ADAPTER.encodedSizeWithTag(9, prepurchaseCashCardAppletData.payment_plans_data) + encodedSizeWithTag62;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = (PrepurchaseCashCardAppletData) obj;
        prepurchaseCashCardAppletData.getClass();
        PrepurchaseCashCardAppletData.Locale locale = prepurchaseCashCardAppletData.locale;
        PrepurchaseCashCardAppletData.Locale locale2 = locale != null ? (PrepurchaseCashCardAppletData.Locale) PrepurchaseCashCardAppletData.Locale.ADAPTER.redact(locale) : null;
        LocalizedString localizedString = prepurchaseCashCardAppletData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = prepurchaseCashCardAppletData.info_rows_header;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(prepurchaseCashCardAppletData.info_rows, PrepurchaseCashCardAppletData.InfoRow.ADAPTER);
        LocalizedString localizedString5 = prepurchaseCashCardAppletData.footer_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData = prepurchaseCashCardAppletData.payment_plans_data;
        PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData2 = paymentPlansData != null ? (PrepurchaseCashCardAppletData.PaymentPlansData) PrepurchaseCashCardAppletData.PaymentPlansData.ADAPTER.redact(paymentPlansData) : null;
        ByteString byteString = ByteString.EMPTY;
        zztc zztcVar = prepurchaseCashCardAppletData.loadable_subtitle;
        LocalBrandBannersKt localBrandBannersKt = prepurchaseCashCardAppletData.primary_footer_button_state;
        LocalMenuItemsKt localMenuItemsKt = prepurchaseCashCardAppletData.secondary_footer_button_state;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData(locale2, localizedString2, zztcVar, localizedString4, m1169redactElements, localizedString6, localBrandBannersKt, localMenuItemsKt, paymentPlansData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = (PrepurchaseCashCardAppletData) obj;
        prepurchaseCashCardAppletData.getClass();
        PrepurchaseCashCardAppletData.Locale.ADAPTER.encodeWithTag(protoWriter, 11, prepurchaseCashCardAppletData.locale);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, prepurchaseCashCardAppletData.title);
        protoAdapter.encodeWithTag(protoWriter, 12, prepurchaseCashCardAppletData.info_rows_header);
        PrepurchaseCashCardAppletData.InfoRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, prepurchaseCashCardAppletData.info_rows);
        protoAdapter.encodeWithTag(protoWriter, 4, prepurchaseCashCardAppletData.footer_text);
        PrepurchaseCashCardAppletData.PaymentPlansData.ADAPTER.encodeWithTag(protoWriter, 9, prepurchaseCashCardAppletData.payment_plans_data);
        zztc zztcVar = prepurchaseCashCardAppletData.loadable_subtitle;
        if (zztcVar instanceof PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle) {
            protoAdapter.encodeWithTag(protoWriter, 2, ((PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle) zztcVar).value);
        } else if (zztcVar instanceof PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent) {
            PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodeWithTag(protoWriter, 10, ((PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent) zztcVar).value);
        } else if (zztcVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalBrandBannersKt localBrandBannersKt = prepurchaseCashCardAppletData.primary_footer_button_state;
        if (localBrandBannersKt instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent) {
            PrepurchaseCashCardAppletData.FooterButtonContent.ADAPTER.encodeWithTag(protoWriter, 5, ((PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent) localBrandBannersKt).value);
        } else if (localBrandBannersKt instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent) {
            PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodeWithTag(protoWriter, 6, ((PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent) localBrandBannersKt).value);
        } else if (localBrandBannersKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalMenuItemsKt localMenuItemsKt = prepurchaseCashCardAppletData.secondary_footer_button_state;
        if (localMenuItemsKt instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) {
            PrepurchaseCashCardAppletData.FooterButtonContent.ADAPTER.encodeWithTag(protoWriter, 7, ((PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) localMenuItemsKt).value);
        } else if (localMenuItemsKt instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent) {
            PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodeWithTag(protoWriter, 8, ((PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent) localMenuItemsKt).value);
        } else if (localMenuItemsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(prepurchaseCashCardAppletData.unknownFields());
    }
}
