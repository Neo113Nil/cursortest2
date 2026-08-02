package com.squareup.lending;

import androidx.room.TransactorKt;
import app.cash.local.presenters.internal.CashBannerKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$InfoRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData = null;
        CashBannerKt cashBannerKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCashCardAppletData.InfoRow((LocalizedString) obj, prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData, cashBannerKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData = new PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData((PrepurchaseCashCardAppletData.InfoViewData) PrepurchaseCashCardAppletData.InfoViewData.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                cashBannerKt = new PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText((LocalizedString) LocalizedString.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                cashBannerKt = new PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction((PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction) PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                cashBannerKt = new PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent((PrepurchaseCashCardAppletData.UnknownContent) PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData.InfoRow infoRow = (PrepurchaseCashCardAppletData.InfoRow) obj;
        reverseProtoWriter.getClass();
        infoRow.getClass();
        reverseProtoWriter.writeBytes(infoRow.unknownFields());
        CashBannerKt cashBannerKt = infoRow.trailing_content;
        if (cashBannerKt instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText) cashBannerKt).value);
        } else if (cashBannerKt instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) {
            PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) cashBannerKt).value);
        } else if (cashBannerKt instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent) {
            PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent) cashBannerKt).value);
        } else if (cashBannerKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData = infoRow.leading_text_action;
        if (prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData != null) {
            PrepurchaseCashCardAppletData.InfoViewData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData.value);
        } else if (prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, infoRow.leading_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PrepurchaseCashCardAppletData.InfoRow infoRow = (PrepurchaseCashCardAppletData.InfoRow) obj;
        infoRow.getClass();
        int size$okio = infoRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(1, infoRow.leading_text) + size$okio;
        PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData = infoRow.leading_text_action;
        if (prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData != null) {
            encodedSizeWithTag2 += PrepurchaseCashCardAppletData.InfoViewData.ADAPTER.encodedSizeWithTag(2, prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData.value);
        } else if (prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        CashBannerKt cashBannerKt = infoRow.trailing_content;
        if (cashBannerKt instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText) cashBannerKt).value);
        } else if (cashBannerKt instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) {
            encodedSizeWithTag = PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction.ADAPTER.encodedSizeWithTag(4, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) cashBannerKt).value);
        } else {
            if (!(cashBannerKt instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent)) {
                if (cashBannerKt == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodedSizeWithTag(5, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent) cashBannerKt).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletData.InfoRow infoRow = (PrepurchaseCashCardAppletData.InfoRow) obj;
        infoRow.getClass();
        LocalizedString localizedString = infoRow.leading_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData = infoRow.leading_text_action;
        CashBannerKt cashBannerKt = infoRow.trailing_content;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData.InfoRow(localizedString2, prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData, cashBannerKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData.InfoRow infoRow = (PrepurchaseCashCardAppletData.InfoRow) obj;
        infoRow.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, infoRow.leading_text);
        PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData = infoRow.leading_text_action;
        if (prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData != null) {
            PrepurchaseCashCardAppletData.InfoViewData.ADAPTER.encodeWithTag(protoWriter, 2, prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData.value);
        } else if (prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        CashBannerKt cashBannerKt = infoRow.trailing_content;
        if (cashBannerKt instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText) {
            protoAdapter.encodeWithTag(protoWriter, 3, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText) cashBannerKt).value);
        } else if (cashBannerKt instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) {
            PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction.ADAPTER.encodeWithTag(protoWriter, 4, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) cashBannerKt).value);
        } else if (cashBannerKt instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent) {
            PrepurchaseCashCardAppletData.UnknownContent.ADAPTER.encodeWithTag(protoWriter, 5, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent) cashBannerKt).value);
        } else if (cashBannerKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(infoRow.unknownFields());
    }
}
