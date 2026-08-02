package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class POSBrandOnboarding$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        ?? r5 = 0;
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        String str4 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        String str5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            String str6 = r5;
            if (nextTag == -1) {
                return new POSBrandOnboarding((POSBrandOnboarding.LocalCashDetails) obj, (POSBrandOnboarding.BrandCard) obj2, str6, str, str2, l, str3, str4, (POSBrandOnboarding.HowItWorks) obj3, (POSBrandOnboarding.LegalConsent) obj4, (ShortlinkAction) obj5, str5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(POSBrandOnboarding.LocalCashDetails.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(POSBrandOnboarding.BrandCard.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    r5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj3 = TransactorKt.decodeMessageOrMerge(POSBrandOnboarding.HowItWorks.ADAPTER, protoReader, obj3);
                    break;
                case 10:
                    obj4 = TransactorKt.decodeMessageOrMerge(POSBrandOnboarding.LegalConsent.ADAPTER, protoReader, obj4);
                    break;
                case 11:
                    obj5 = TransactorKt.decodeMessageOrMerge(ShortlinkAction.ADAPTER, protoReader, obj5);
                    break;
                case 12:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r5 = str6;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        POSBrandOnboarding pOSBrandOnboarding = (POSBrandOnboarding) obj;
        reverseProtoWriter.getClass();
        pOSBrandOnboarding.getClass();
        reverseProtoWriter.writeBytes(pOSBrandOnboarding.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, pOSBrandOnboarding.continue_button_title);
        ShortlinkAction.ADAPTER.encodeWithTag(reverseProtoWriter, 11, pOSBrandOnboarding.complete_onboarding_shortlink);
        POSBrandOnboarding.LegalConsent.ADAPTER.encodeWithTag(reverseProtoWriter, 10, pOSBrandOnboarding.legal_consent);
        POSBrandOnboarding.HowItWorks.ADAPTER.encodeWithTag(reverseProtoWriter, 9, pOSBrandOnboarding.how_it_works);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, pOSBrandOnboarding.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, pOSBrandOnboarding.title);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, pOSBrandOnboarding.brand_card_slide_in_delay);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, pOSBrandOnboarding.loading_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, pOSBrandOnboarding.close_button_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, pOSBrandOnboarding.fine_print);
        POSBrandOnboarding.BrandCard.ADAPTER.encodeWithTag(reverseProtoWriter, 2, pOSBrandOnboarding.brand_card);
        POSBrandOnboarding.LocalCashDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, pOSBrandOnboarding.local_cash_card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        POSBrandOnboarding pOSBrandOnboarding = (POSBrandOnboarding) obj;
        pOSBrandOnboarding.getClass();
        int encodedSizeWithTag = POSBrandOnboarding.BrandCard.ADAPTER.encodedSizeWithTag(2, pOSBrandOnboarding.brand_card) + POSBrandOnboarding.LocalCashDetails.ADAPTER.encodedSizeWithTag(1, pOSBrandOnboarding.local_cash_card) + pOSBrandOnboarding.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(12, pOSBrandOnboarding.continue_button_title) + ShortlinkAction.ADAPTER.encodedSizeWithTag(11, pOSBrandOnboarding.complete_onboarding_shortlink) + POSBrandOnboarding.LegalConsent.ADAPTER.encodedSizeWithTag(10, pOSBrandOnboarding.legal_consent) + POSBrandOnboarding.HowItWorks.ADAPTER.encodedSizeWithTag(9, pOSBrandOnboarding.how_it_works) + protoAdapter.encodedSizeWithTag(8, pOSBrandOnboarding.body) + protoAdapter.encodedSizeWithTag(7, pOSBrandOnboarding.title) + ProtoAdapter.INT64.encodedSizeWithTag(6, pOSBrandOnboarding.brand_card_slide_in_delay) + protoAdapter.encodedSizeWithTag(5, pOSBrandOnboarding.loading_text) + protoAdapter.encodedSizeWithTag(4, pOSBrandOnboarding.close_button_client_route) + protoAdapter.encodedSizeWithTag(3, pOSBrandOnboarding.fine_print) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        POSBrandOnboarding pOSBrandOnboarding = (POSBrandOnboarding) obj;
        pOSBrandOnboarding.getClass();
        POSBrandOnboarding.LocalCashDetails localCashDetails = pOSBrandOnboarding.local_cash_card;
        POSBrandOnboarding.LocalCashDetails localCashDetails2 = localCashDetails != null ? (POSBrandOnboarding.LocalCashDetails) POSBrandOnboarding.LocalCashDetails.ADAPTER.redact(localCashDetails) : null;
        POSBrandOnboarding.BrandCard brandCard = pOSBrandOnboarding.brand_card;
        POSBrandOnboarding.BrandCard brandCard2 = brandCard != null ? (POSBrandOnboarding.BrandCard) POSBrandOnboarding.BrandCard.ADAPTER.redact(brandCard) : null;
        POSBrandOnboarding.HowItWorks howItWorks = pOSBrandOnboarding.how_it_works;
        POSBrandOnboarding.HowItWorks howItWorks2 = howItWorks != null ? (POSBrandOnboarding.HowItWorks) POSBrandOnboarding.HowItWorks.ADAPTER.redact(howItWorks) : null;
        POSBrandOnboarding.LegalConsent legalConsent = pOSBrandOnboarding.legal_consent;
        POSBrandOnboarding.LegalConsent legalConsent2 = legalConsent != null ? (POSBrandOnboarding.LegalConsent) POSBrandOnboarding.LegalConsent.ADAPTER.redact(legalConsent) : null;
        ShortlinkAction shortlinkAction = pOSBrandOnboarding.complete_onboarding_shortlink;
        ShortlinkAction shortlinkAction2 = shortlinkAction != null ? (ShortlinkAction) ShortlinkAction.ADAPTER.redact(shortlinkAction) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = pOSBrandOnboarding.fine_print;
        String str2 = pOSBrandOnboarding.close_button_client_route;
        String str3 = pOSBrandOnboarding.loading_text;
        Long l = pOSBrandOnboarding.brand_card_slide_in_delay;
        String str4 = pOSBrandOnboarding.title;
        String str5 = pOSBrandOnboarding.body;
        String str6 = pOSBrandOnboarding.continue_button_title;
        byteString.getClass();
        return new POSBrandOnboarding(localCashDetails2, brandCard2, str, str2, str3, l, str4, str5, howItWorks2, legalConsent2, shortlinkAction2, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        POSBrandOnboarding pOSBrandOnboarding = (POSBrandOnboarding) obj;
        pOSBrandOnboarding.getClass();
        POSBrandOnboarding.LocalCashDetails.ADAPTER.encodeWithTag(protoWriter, 1, pOSBrandOnboarding.local_cash_card);
        POSBrandOnboarding.BrandCard.ADAPTER.encodeWithTag(protoWriter, 2, pOSBrandOnboarding.brand_card);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, pOSBrandOnboarding.fine_print);
        protoAdapter.encodeWithTag(protoWriter, 4, pOSBrandOnboarding.close_button_client_route);
        protoAdapter.encodeWithTag(protoWriter, 5, pOSBrandOnboarding.loading_text);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, pOSBrandOnboarding.brand_card_slide_in_delay);
        protoAdapter.encodeWithTag(protoWriter, 7, pOSBrandOnboarding.title);
        protoAdapter.encodeWithTag(protoWriter, 8, pOSBrandOnboarding.body);
        POSBrandOnboarding.HowItWorks.ADAPTER.encodeWithTag(protoWriter, 9, pOSBrandOnboarding.how_it_works);
        POSBrandOnboarding.LegalConsent.ADAPTER.encodeWithTag(protoWriter, 10, pOSBrandOnboarding.legal_consent);
        ShortlinkAction.ADAPTER.encodeWithTag(protoWriter, 11, pOSBrandOnboarding.complete_onboarding_shortlink);
        protoAdapter.encodeWithTag(protoWriter, 12, pOSBrandOnboarding.continue_button_title);
        protoWriter.writeBytes(pOSBrandOnboarding.unknownFields());
    }
}
