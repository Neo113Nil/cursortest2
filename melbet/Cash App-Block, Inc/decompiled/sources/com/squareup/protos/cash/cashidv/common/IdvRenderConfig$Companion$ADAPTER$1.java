package com.squareup.protos.cash.cashidv.common;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class IdvRenderConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Boolean bool;
        Boolean bool2;
        String str;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Object obj = null;
        String str6 = null;
        String str7 = null;
        Object obj2 = null;
        Object obj3 = null;
        SsnCollectionBlockerTemplateName ssnCollectionBlockerTemplateName = null;
        EidvFailedBlockerTemplateName eidvFailedBlockerTemplateName = null;
        InReviewBlockerTemplateName inReviewBlockerTemplateName = null;
        NotVerifiedBlockerTemplateName notVerifiedBlockerTemplateName = null;
        EIdvIntroBlockerTemplateName eIdvIntroBlockerTemplateName = null;
        VerifiedBlockerTemplateName verifiedBlockerTemplateName = null;
        ProvideLegalBlockerTemplateName provideLegalBlockerTemplateName = null;
        Boolean bool5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new IdvRenderConfig(str2, bool3, bool4, str3, str4, str5, (IdvEndResultScreenConfig) obj, str6, str7, (SsnTooltipConfig) obj2, (SsnScreenRenderConfig) obj3, ssnCollectionBlockerTemplateName, eidvFailedBlockerTemplateName, inReviewBlockerTemplateName, notVerifiedBlockerTemplateName, eIdvIntroBlockerTemplateName, verifiedBlockerTemplateName, provideLegalBlockerTemplateName, bool5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 4:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str2;
                    break;
                case 6:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str2;
                    break;
                case 7:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 8:
                    obj = TransactorKt.decodeMessageOrMerge(IdvEndResultScreenConfig.ADAPTER, protoReader, obj);
                    decode = str2;
                    break;
                case 9:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 10:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 11:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 12:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 13:
                    obj2 = TransactorKt.decodeMessageOrMerge(SsnTooltipConfig.ADAPTER, protoReader, obj2);
                    decode = str2;
                    break;
                case 14:
                    obj3 = TransactorKt.decodeMessageOrMerge(SsnScreenRenderConfig.ADAPTER, protoReader, obj3);
                    decode = str2;
                    break;
                case 15:
                default:
                    protoReader.readUnknownField(nextTag);
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                    decode = str2;
                    bool3 = bool;
                    bool4 = bool2;
                    str3 = str;
                    break;
                case 16:
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                    try {
                        ssnCollectionBlockerTemplateName = SsnCollectionBlockerTemplateName.ADAPTER.decode(protoReader);
                        bool3 = bool;
                        bool4 = bool2;
                        str3 = str;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 17:
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                    try {
                        eidvFailedBlockerTemplateName = EidvFailedBlockerTemplateName.ADAPTER.decode(protoReader);
                        bool3 = bool;
                        bool4 = bool2;
                        str3 = str;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 18:
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                    try {
                        inReviewBlockerTemplateName = InReviewBlockerTemplateName.ADAPTER.decode(protoReader);
                        bool3 = bool;
                        bool4 = bool2;
                        str3 = str;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 19:
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                    try {
                        notVerifiedBlockerTemplateName = NotVerifiedBlockerTemplateName.ADAPTER.decode(protoReader);
                        bool3 = bool;
                        bool4 = bool2;
                        str3 = str;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 20:
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                    try {
                        eIdvIntroBlockerTemplateName = EIdvIntroBlockerTemplateName.ADAPTER.decode(protoReader);
                        bool3 = bool;
                        bool4 = bool2;
                        str3 = str;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                        break;
                    }
                case 21:
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                    try {
                        verifiedBlockerTemplateName = VerifiedBlockerTemplateName.ADAPTER.decode(protoReader);
                        bool3 = bool;
                        bool4 = bool2;
                        str3 = str;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                        break;
                    }
                case 22:
                    try {
                        provideLegalBlockerTemplateName = ProvideLegalBlockerTemplateName.ADAPTER.decode(protoReader);
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                        bool = bool3;
                        bool2 = bool4;
                        str = str3;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                        break;
                    }
                case 23:
                    bool5 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str2;
                    break;
            }
            str2 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IdvRenderConfig idvRenderConfig = (IdvRenderConfig) obj;
        reverseProtoWriter.getClass();
        idvRenderConfig.getClass();
        reverseProtoWriter.writeBytes(idvRenderConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 23, idvRenderConfig.skip_didv_ssn_denylist_intro);
        ProvideLegalBlockerTemplateName.ADAPTER.encodeWithTag(reverseProtoWriter, 22, idvRenderConfig.provide_legal_name_blocker_template);
        VerifiedBlockerTemplateName.ADAPTER.encodeWithTag(reverseProtoWriter, 21, idvRenderConfig.verified_blocker_template);
        EIdvIntroBlockerTemplateName.ADAPTER.encodeWithTag(reverseProtoWriter, 20, idvRenderConfig.eidv_intro_blocker_template);
        NotVerifiedBlockerTemplateName.ADAPTER.encodeWithTag(reverseProtoWriter, 19, idvRenderConfig.not_verified_blocker_template);
        InReviewBlockerTemplateName.ADAPTER.encodeWithTag(reverseProtoWriter, 18, idvRenderConfig.in_review_blocker_template);
        EidvFailedBlockerTemplateName.ADAPTER.encodeWithTag(reverseProtoWriter, 17, idvRenderConfig.eidv_failed_blocker_template);
        SsnCollectionBlockerTemplateName.ADAPTER.encodeWithTag(reverseProtoWriter, 16, idvRenderConfig.ssn_collection_blocker_template);
        SsnScreenRenderConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 14, idvRenderConfig.ssn_screen_render_config);
        SsnTooltipConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 13, idvRenderConfig.ssn_tooltip_config);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, idvRenderConfig.address_req_subtext);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, idvRenderConfig.address_req_main_text);
        IdvEndResultScreenConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 8, idvRenderConfig.idv_end_result_screen_config);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, idvRenderConfig.ssn_subtext_message);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, idvRenderConfig.ssn_main_text_compare_full_9);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, idvRenderConfig.ssn_main_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, idvRenderConfig.suppress_sponsored_account_error_message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, idvRenderConfig.suppress_underage_error_message);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, idvRenderConfig.birthdate_req_subtext);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IdvRenderConfig idvRenderConfig = (IdvRenderConfig) obj;
        idvRenderConfig.getClass();
        int size$okio = idvRenderConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, idvRenderConfig.birthdate_req_subtext) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(23, idvRenderConfig.skip_didv_ssn_denylist_intro) + ProvideLegalBlockerTemplateName.ADAPTER.encodedSizeWithTag(22, idvRenderConfig.provide_legal_name_blocker_template) + VerifiedBlockerTemplateName.ADAPTER.encodedSizeWithTag(21, idvRenderConfig.verified_blocker_template) + EIdvIntroBlockerTemplateName.ADAPTER.encodedSizeWithTag(20, idvRenderConfig.eidv_intro_blocker_template) + NotVerifiedBlockerTemplateName.ADAPTER.encodedSizeWithTag(19, idvRenderConfig.not_verified_blocker_template) + InReviewBlockerTemplateName.ADAPTER.encodedSizeWithTag(18, idvRenderConfig.in_review_blocker_template) + EidvFailedBlockerTemplateName.ADAPTER.encodedSizeWithTag(17, idvRenderConfig.eidv_failed_blocker_template) + SsnCollectionBlockerTemplateName.ADAPTER.encodedSizeWithTag(16, idvRenderConfig.ssn_collection_blocker_template) + SsnScreenRenderConfig.ADAPTER.encodedSizeWithTag(14, idvRenderConfig.ssn_screen_render_config) + SsnTooltipConfig.ADAPTER.encodedSizeWithTag(13, idvRenderConfig.ssn_tooltip_config) + protoAdapter.encodedSizeWithTag(12, idvRenderConfig.address_req_subtext) + protoAdapter.encodedSizeWithTag(11, idvRenderConfig.address_req_main_text) + IdvEndResultScreenConfig.ADAPTER.encodedSizeWithTag(8, idvRenderConfig.idv_end_result_screen_config) + protoAdapter.encodedSizeWithTag(7, idvRenderConfig.ssn_subtext_message) + protoAdapter.encodedSizeWithTag(10, idvRenderConfig.ssn_main_text_compare_full_9) + protoAdapter.encodedSizeWithTag(9, idvRenderConfig.ssn_main_text) + protoAdapter2.encodedSizeWithTag(6, idvRenderConfig.suppress_sponsored_account_error_message) + protoAdapter2.encodedSizeWithTag(5, idvRenderConfig.suppress_underage_error_message) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IdvRenderConfig idvRenderConfig = (IdvRenderConfig) obj;
        idvRenderConfig.getClass();
        IdvEndResultScreenConfig idvEndResultScreenConfig = idvRenderConfig.idv_end_result_screen_config;
        IdvEndResultScreenConfig idvEndResultScreenConfig2 = idvEndResultScreenConfig != null ? (IdvEndResultScreenConfig) IdvEndResultScreenConfig.ADAPTER.redact(idvEndResultScreenConfig) : null;
        SsnTooltipConfig ssnTooltipConfig = idvRenderConfig.ssn_tooltip_config;
        SsnTooltipConfig ssnTooltipConfig2 = ssnTooltipConfig != null ? (SsnTooltipConfig) SsnTooltipConfig.ADAPTER.redact(ssnTooltipConfig) : null;
        SsnScreenRenderConfig ssnScreenRenderConfig = idvRenderConfig.ssn_screen_render_config;
        SsnScreenRenderConfig ssnScreenRenderConfig2 = ssnScreenRenderConfig != null ? (SsnScreenRenderConfig) SsnScreenRenderConfig.ADAPTER.redact(ssnScreenRenderConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = idvRenderConfig.birthdate_req_subtext;
        Boolean bool = idvRenderConfig.suppress_underage_error_message;
        Boolean bool2 = idvRenderConfig.suppress_sponsored_account_error_message;
        String str2 = idvRenderConfig.ssn_main_text;
        String str3 = idvRenderConfig.ssn_main_text_compare_full_9;
        String str4 = idvRenderConfig.ssn_subtext_message;
        String str5 = idvRenderConfig.address_req_main_text;
        String str6 = idvRenderConfig.address_req_subtext;
        SsnCollectionBlockerTemplateName ssnCollectionBlockerTemplateName = idvRenderConfig.ssn_collection_blocker_template;
        EidvFailedBlockerTemplateName eidvFailedBlockerTemplateName = idvRenderConfig.eidv_failed_blocker_template;
        InReviewBlockerTemplateName inReviewBlockerTemplateName = idvRenderConfig.in_review_blocker_template;
        NotVerifiedBlockerTemplateName notVerifiedBlockerTemplateName = idvRenderConfig.not_verified_blocker_template;
        EIdvIntroBlockerTemplateName eIdvIntroBlockerTemplateName = idvRenderConfig.eidv_intro_blocker_template;
        VerifiedBlockerTemplateName verifiedBlockerTemplateName = idvRenderConfig.verified_blocker_template;
        ProvideLegalBlockerTemplateName provideLegalBlockerTemplateName = idvRenderConfig.provide_legal_name_blocker_template;
        Boolean bool3 = idvRenderConfig.skip_didv_ssn_denylist_intro;
        byteString.getClass();
        return new IdvRenderConfig(str, bool, bool2, str2, str3, str4, idvEndResultScreenConfig2, str5, str6, ssnTooltipConfig2, ssnScreenRenderConfig2, ssnCollectionBlockerTemplateName, eidvFailedBlockerTemplateName, inReviewBlockerTemplateName, notVerifiedBlockerTemplateName, eIdvIntroBlockerTemplateName, verifiedBlockerTemplateName, provideLegalBlockerTemplateName, bool3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IdvRenderConfig idvRenderConfig = (IdvRenderConfig) obj;
        idvRenderConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, idvRenderConfig.birthdate_req_subtext);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, idvRenderConfig.suppress_underage_error_message);
        protoAdapter2.encodeWithTag(protoWriter, 6, idvRenderConfig.suppress_sponsored_account_error_message);
        protoAdapter.encodeWithTag(protoWriter, 9, idvRenderConfig.ssn_main_text);
        protoAdapter.encodeWithTag(protoWriter, 10, idvRenderConfig.ssn_main_text_compare_full_9);
        protoAdapter.encodeWithTag(protoWriter, 7, idvRenderConfig.ssn_subtext_message);
        IdvEndResultScreenConfig.ADAPTER.encodeWithTag(protoWriter, 8, idvRenderConfig.idv_end_result_screen_config);
        protoAdapter.encodeWithTag(protoWriter, 11, idvRenderConfig.address_req_main_text);
        protoAdapter.encodeWithTag(protoWriter, 12, idvRenderConfig.address_req_subtext);
        SsnTooltipConfig.ADAPTER.encodeWithTag(protoWriter, 13, idvRenderConfig.ssn_tooltip_config);
        SsnScreenRenderConfig.ADAPTER.encodeWithTag(protoWriter, 14, idvRenderConfig.ssn_screen_render_config);
        SsnCollectionBlockerTemplateName.ADAPTER.encodeWithTag(protoWriter, 16, idvRenderConfig.ssn_collection_blocker_template);
        EidvFailedBlockerTemplateName.ADAPTER.encodeWithTag(protoWriter, 17, idvRenderConfig.eidv_failed_blocker_template);
        InReviewBlockerTemplateName.ADAPTER.encodeWithTag(protoWriter, 18, idvRenderConfig.in_review_blocker_template);
        NotVerifiedBlockerTemplateName.ADAPTER.encodeWithTag(protoWriter, 19, idvRenderConfig.not_verified_blocker_template);
        EIdvIntroBlockerTemplateName.ADAPTER.encodeWithTag(protoWriter, 20, idvRenderConfig.eidv_intro_blocker_template);
        VerifiedBlockerTemplateName.ADAPTER.encodeWithTag(protoWriter, 21, idvRenderConfig.verified_blocker_template);
        ProvideLegalBlockerTemplateName.ADAPTER.encodeWithTag(protoWriter, 22, idvRenderConfig.provide_legal_name_blocker_template);
        protoAdapter2.encodeWithTag(protoWriter, 23, idvRenderConfig.skip_didv_ssn_denylist_intro);
        protoWriter.writeBytes(idvRenderConfig.unknownFields());
    }
}
