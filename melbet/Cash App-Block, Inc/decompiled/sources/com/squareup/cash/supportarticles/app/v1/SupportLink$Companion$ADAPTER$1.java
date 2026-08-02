package com.squareup.cash.supportarticles.app.v1;

import androidx.media3.muxer.AnnexBUtils;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SupportLink$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        AnnexBUtils annexBUtils = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportLink((String) obj, (String) obj2, annexBUtils, m, (String) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    annexBUtils = new SupportLink$Target$ArticleToken((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 4:
                    annexBUtils = new SupportLink$Target$Url((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 5:
                    annexBUtils = new SupportLink$Target$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 6:
                    annexBUtils = new SupportLink$Target$ClientScenario((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 7:
                    m.add(AnalyticsTag.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportLink supportLink = (SupportLink) obj;
        reverseProtoWriter.getClass();
        supportLink.getClass();
        reverseProtoWriter.writeBytes(supportLink.unknownFields());
        AnnexBUtils annexBUtils = supportLink.target;
        if (annexBUtils instanceof SupportLink$Target$ArticleToken) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((SupportLink$Target$ArticleToken) annexBUtils).value);
        } else if (annexBUtils instanceof SupportLink$Target$Url) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((SupportLink$Target$Url) annexBUtils).value);
        } else if (annexBUtils instanceof SupportLink$Target$ClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, ((SupportLink$Target$ClientRoute) annexBUtils).value);
        } else if (annexBUtils instanceof SupportLink$Target$ClientScenario) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, ((SupportLink$Target$ClientScenario) annexBUtils).value);
        } else if (annexBUtils != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, supportLink.include_in_recently_viewed);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, supportLink.link_token);
        AnalyticsTag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, supportLink.analytics_tags);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, supportLink.preview_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, supportLink.title_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SupportLink supportLink = (SupportLink) obj;
        supportLink.getClass();
        int size$okio = supportLink.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, supportLink.preview_text) + protoAdapter.encodedSizeWithTag(1, supportLink.title_text) + size$okio;
        AnnexBUtils annexBUtils = supportLink.target;
        if (annexBUtils instanceof SupportLink$Target$ArticleToken) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, ((SupportLink$Target$ArticleToken) annexBUtils).value);
        } else if (annexBUtils instanceof SupportLink$Target$Url) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, ((SupportLink$Target$Url) annexBUtils).value);
        } else if (annexBUtils instanceof SupportLink$Target$ClientRoute) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, ((SupportLink$Target$ClientRoute) annexBUtils).value);
        } else {
            if (!(annexBUtils instanceof SupportLink$Target$ClientScenario)) {
                if (annexBUtils != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BOOL.encodedSizeWithTag(9, supportLink.include_in_recently_viewed) + protoAdapter.encodedSizeWithTag(8, supportLink.link_token) + AnalyticsTag.ADAPTER.asRepeated().encodedSizeWithTag(7, supportLink.analytics_tags) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(6, ((SupportLink$Target$ClientScenario) annexBUtils).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.BOOL.encodedSizeWithTag(9, supportLink.include_in_recently_viewed) + protoAdapter.encodedSizeWithTag(8, supportLink.link_token) + AnalyticsTag.ADAPTER.asRepeated().encodedSizeWithTag(7, supportLink.analytics_tags) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportLink supportLink = (SupportLink) obj;
        supportLink.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(supportLink.analytics_tags, AnalyticsTag.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = supportLink.title_text;
        String str2 = supportLink.preview_text;
        AnnexBUtils annexBUtils = supportLink.target;
        String str3 = supportLink.link_token;
        Boolean bool = supportLink.include_in_recently_viewed;
        byteString.getClass();
        return new SupportLink(str, str2, annexBUtils, m1169redactElements, str3, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportLink supportLink = (SupportLink) obj;
        supportLink.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, supportLink.title_text);
        protoAdapter.encodeWithTag(protoWriter, 2, supportLink.preview_text);
        AnalyticsTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, supportLink.analytics_tags);
        protoAdapter.encodeWithTag(protoWriter, 8, supportLink.link_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, supportLink.include_in_recently_viewed);
        AnnexBUtils annexBUtils = supportLink.target;
        if (annexBUtils instanceof SupportLink$Target$ArticleToken) {
            protoAdapter.encodeWithTag(protoWriter, 3, ((SupportLink$Target$ArticleToken) annexBUtils).value);
        } else if (annexBUtils instanceof SupportLink$Target$Url) {
            protoAdapter.encodeWithTag(protoWriter, 4, ((SupportLink$Target$Url) annexBUtils).value);
        } else if (annexBUtils instanceof SupportLink$Target$ClientRoute) {
            protoAdapter.encodeWithTag(protoWriter, 5, ((SupportLink$Target$ClientRoute) annexBUtils).value);
        } else if (annexBUtils instanceof SupportLink$Target$ClientScenario) {
            protoAdapter.encodeWithTag(protoWriter, 6, ((SupportLink$Target$ClientScenario) annexBUtils).value);
        } else if (annexBUtils != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(supportLink.unknownFields());
    }
}
