package com.squareup.cash.supportarticles.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.supportarticles.app.v1.SupportArticle;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SupportArticle$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        String str;
        String str2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        Object obj2 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Object obj3 = null;
        String str6 = null;
        SupportArticle.Appearance appearance = null;
        Boolean bool3 = null;
        String str7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportArticle(str3, str7, str4, str5, m, arrayList, bool, bool2, (Icon) obj3, arrayList2, str6, appearance, bool3, (SupportLink) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 3:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 4:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 5:
                    obj = obj2;
                    str = str4;
                    str2 = str5;
                    m.add(SupportLink.ADAPTER.decode(protoReader));
                    decode = str3;
                    obj2 = obj;
                    str4 = str;
                    str5 = str2;
                    break;
                case 6:
                    obj = obj2;
                    str = str4;
                    str2 = str5;
                    arrayList.add(SupportArticle.ContactOption.ADAPTER.decode(protoReader));
                    decode = str3;
                    obj2 = obj;
                    str4 = str;
                    str5 = str2;
                    break;
                case 7:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 8:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj3);
                    decode = str3;
                    break;
                case 10:
                    obj = obj2;
                    str = str4;
                    str2 = str5;
                    arrayList2.add(AnalyticsTag.ADAPTER.decode(protoReader));
                    decode = str3;
                    obj2 = obj;
                    str4 = str;
                    str5 = str2;
                    break;
                case 11:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 12:
                    try {
                        appearance = SupportArticle.Appearance.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj2;
                        str = str4;
                        str2 = str5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 13:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 14:
                    obj2 = TransactorKt.decodeMessageOrMerge(SupportLink.ADAPTER, protoReader, obj2);
                    decode = str3;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    str = str4;
                    str2 = str5;
                    decode = str3;
                    obj2 = obj;
                    str4 = str;
                    str5 = str2;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportArticle supportArticle = (SupportArticle) obj;
        reverseProtoWriter.getClass();
        supportArticle.getClass();
        reverseProtoWriter.writeBytes(supportArticle.unknownFields());
        ProtoAdapter protoAdapter = SupportLink.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, supportArticle.call_to_action);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, supportArticle.include_issue_description);
        SupportArticle.Appearance.ADAPTER.encodeWithTag(reverseProtoWriter, 12, supportArticle.appearance);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 11, supportArticle.body_language);
        AnalyticsTag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 10, supportArticle.analytics_tags);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 9, supportArticle.icon);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, supportArticle.include_in_recently_viewed);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, supportArticle.select_payment_for_case_creation);
        SupportArticle.ContactOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, supportArticle.contact_options);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, supportArticle.links);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, supportArticle.body_html);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, supportArticle.preview_text);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, supportArticle.title_text);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, supportArticle.article_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupportArticle supportArticle = (SupportArticle) obj;
        supportArticle.getClass();
        int size$okio = supportArticle.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, supportArticle.body_html) + protoAdapter.encodedSizeWithTag(3, supportArticle.preview_text) + protoAdapter.encodedSizeWithTag(2, supportArticle.title_text) + protoAdapter.encodedSizeWithTag(1, supportArticle.article_token) + size$okio;
        ProtoAdapter protoAdapter2 = SupportLink.ADAPTER;
        int encodedSizeWithTag2 = SupportArticle.ContactOption.ADAPTER.asRepeated().encodedSizeWithTag(6, supportArticle.contact_options) + protoAdapter2.asRepeated().encodedSizeWithTag(5, supportArticle.links) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(14, supportArticle.call_to_action) + protoAdapter3.encodedSizeWithTag(13, supportArticle.include_issue_description) + SupportArticle.Appearance.ADAPTER.encodedSizeWithTag(12, supportArticle.appearance) + protoAdapter.encodedSizeWithTag(11, supportArticle.body_language) + AnalyticsTag.ADAPTER.asRepeated().encodedSizeWithTag(10, supportArticle.analytics_tags) + Icon.ADAPTER.encodedSizeWithTag(9, supportArticle.icon) + protoAdapter3.encodedSizeWithTag(8, supportArticle.include_in_recently_viewed) + protoAdapter3.encodedSizeWithTag(7, supportArticle.select_payment_for_case_creation) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportArticle supportArticle = (SupportArticle) obj;
        supportArticle.getClass();
        List list = supportArticle.links;
        ProtoAdapter protoAdapter = SupportLink.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(supportArticle.contact_options, SupportArticle.ContactOption.ADAPTER);
        Icon icon = supportArticle.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(supportArticle.analytics_tags, AnalyticsTag.ADAPTER);
        SupportLink supportLink = supportArticle.call_to_action;
        SupportLink supportLink2 = supportLink != null ? (SupportLink) protoAdapter.redact(supportLink) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = supportArticle.article_token;
        String str2 = supportArticle.title_text;
        String str3 = supportArticle.preview_text;
        String str4 = supportArticle.body_html;
        Boolean bool = supportArticle.select_payment_for_case_creation;
        Boolean bool2 = supportArticle.include_in_recently_viewed;
        String str5 = supportArticle.body_language;
        SupportArticle.Appearance appearance = supportArticle.appearance;
        Boolean bool3 = supportArticle.include_issue_description;
        byteString.getClass();
        return new SupportArticle(str, str2, str3, str4, m1169redactElements, m1169redactElements2, bool, bool2, icon2, m1169redactElements3, str5, appearance, bool3, supportLink2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportArticle supportArticle = (SupportArticle) obj;
        supportArticle.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, supportArticle.article_token);
        protoAdapter.encodeWithTag(protoWriter, 2, supportArticle.title_text);
        protoAdapter.encodeWithTag(protoWriter, 3, supportArticle.preview_text);
        protoAdapter.encodeWithTag(protoWriter, 4, supportArticle.body_html);
        ProtoAdapter protoAdapter2 = SupportLink.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, supportArticle.links);
        SupportArticle.ContactOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, supportArticle.contact_options);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 7, supportArticle.select_payment_for_case_creation);
        protoAdapter3.encodeWithTag(protoWriter, 8, supportArticle.include_in_recently_viewed);
        Icon.ADAPTER.encodeWithTag(protoWriter, 9, supportArticle.icon);
        AnalyticsTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, supportArticle.analytics_tags);
        protoAdapter.encodeWithTag(protoWriter, 11, supportArticle.body_language);
        SupportArticle.Appearance.ADAPTER.encodeWithTag(protoWriter, 12, supportArticle.appearance);
        protoAdapter3.encodeWithTag(protoWriter, 13, supportArticle.include_issue_description);
        protoAdapter2.encodeWithTag(protoWriter, 14, supportArticle.call_to_action);
        protoWriter.writeBytes(supportArticle.unknownFields());
    }
}
