package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ?? r3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Long l = r3;
            if (nextTag == -1) {
                return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive(l, str, str2, str3, str4, str5, (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent) obj, (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding) obj2, (LocalImage) obj3, str6, str7, str8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    r3 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 2:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj = TransactorKt.decodeMessageOrMerge(GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent.ADAPTER, protoReader, obj);
                    break;
                case 8:
                    obj2 = TransactorKt.decodeMessageOrMerge(GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.ADAPTER, protoReader, obj2);
                    break;
                case 9:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj3);
                    break;
                case 10:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 12:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r3 = l;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive enrollmentIncentive = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive) obj;
        reverseProtoWriter.getClass();
        enrollmentIncentive.getClass();
        reverseProtoWriter.writeBytes(enrollmentIncentive.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, enrollmentIncentive.accept_cta_button_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, enrollmentIncentive.accept_cta_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, enrollmentIncentive.headline);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 9, enrollmentIncentive.hero_image);
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.ADAPTER.encodeWithTag(reverseProtoWriter, 8, enrollmentIncentive.onboarding);
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, enrollmentIncentive.legal_consent_content);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, enrollmentIncentive.legal_consent_button_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, enrollmentIncentive.caption_arcade_icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, enrollmentIncentive.caption);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, enrollmentIncentive.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, enrollmentIncentive.title);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, enrollmentIncentive.local_cash_incentive_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive enrollmentIncentive = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive) obj;
        enrollmentIncentive.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, enrollmentIncentive.local_cash_incentive_amount) + enrollmentIncentive.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(12, enrollmentIncentive.accept_cta_button_label) + protoAdapter.encodedSizeWithTag(11, enrollmentIncentive.accept_cta_client_route) + protoAdapter.encodedSizeWithTag(10, enrollmentIncentive.headline) + LocalImage.ADAPTER.encodedSizeWithTag(9, enrollmentIncentive.hero_image) + GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.ADAPTER.encodedSizeWithTag(8, enrollmentIncentive.onboarding) + GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent.ADAPTER.encodedSizeWithTag(7, enrollmentIncentive.legal_consent_content) + protoAdapter.encodedSizeWithTag(6, enrollmentIncentive.legal_consent_button_label) + protoAdapter.encodedSizeWithTag(5, enrollmentIncentive.caption_arcade_icon) + protoAdapter.encodedSizeWithTag(4, enrollmentIncentive.caption) + protoAdapter.encodedSizeWithTag(3, enrollmentIncentive.body) + protoAdapter.encodedSizeWithTag(2, enrollmentIncentive.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive enrollmentIncentive = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive) obj;
        enrollmentIncentive.getClass();
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent legalConsentContent = enrollmentIncentive.legal_consent_content;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent legalConsentContent2 = legalConsentContent != null ? (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent) GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent.ADAPTER.redact(legalConsentContent) : null;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding onboarding = enrollmentIncentive.onboarding;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding onboarding2 = onboarding != null ? (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding) GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.ADAPTER.redact(onboarding) : null;
        LocalImage localImage = enrollmentIncentive.hero_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = enrollmentIncentive.local_cash_incentive_amount;
        String str = enrollmentIncentive.title;
        String str2 = enrollmentIncentive.body;
        String str3 = enrollmentIncentive.caption;
        String str4 = enrollmentIncentive.caption_arcade_icon;
        String str5 = enrollmentIncentive.legal_consent_button_label;
        String str6 = enrollmentIncentive.headline;
        String str7 = enrollmentIncentive.accept_cta_client_route;
        String str8 = enrollmentIncentive.accept_cta_button_label;
        byteString.getClass();
        return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive(l, str, str2, str3, str4, str5, legalConsentContent2, onboarding2, localImage2, str6, str7, str8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive enrollmentIncentive = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive) obj;
        enrollmentIncentive.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, enrollmentIncentive.local_cash_incentive_amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, enrollmentIncentive.title);
        protoAdapter.encodeWithTag(protoWriter, 3, enrollmentIncentive.body);
        protoAdapter.encodeWithTag(protoWriter, 4, enrollmentIncentive.caption);
        protoAdapter.encodeWithTag(protoWriter, 5, enrollmentIncentive.caption_arcade_icon);
        protoAdapter.encodeWithTag(protoWriter, 6, enrollmentIncentive.legal_consent_button_label);
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent.ADAPTER.encodeWithTag(protoWriter, 7, enrollmentIncentive.legal_consent_content);
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.ADAPTER.encodeWithTag(protoWriter, 8, enrollmentIncentive.onboarding);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 9, enrollmentIncentive.hero_image);
        protoAdapter.encodeWithTag(protoWriter, 10, enrollmentIncentive.headline);
        protoAdapter.encodeWithTag(protoWriter, 11, enrollmentIncentive.accept_cta_client_route);
        protoAdapter.encodeWithTag(protoWriter, 12, enrollmentIncentive.accept_cta_button_label);
        protoWriter.writeBytes(enrollmentIncentive.unknownFields());
    }
}
