package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletSearchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletSearchResponse((String) obj, m, (FilterGroupSection) obj2, (Long) obj3, arrayList, (SearchSection) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    m.add(SearchSection.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(FilterGroupSection.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    arrayList.add(EngagedItemToken.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(SearchSection.ADAPTER, protoReader, obj4);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletSearchResponse afterpayAppletSearchResponse = (AfterpayAppletSearchResponse) obj;
        reverseProtoWriter.getClass();
        afterpayAppletSearchResponse.getClass();
        reverseProtoWriter.writeBytes(afterpayAppletSearchResponse.unknownFields());
        ProtoAdapter protoAdapter = SearchSection.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, afterpayAppletSearchResponse.home_preview_section);
        EngagedItemToken.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, afterpayAppletSearchResponse.invalid_recently_viewed_engaged_tokens);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, afterpayAppletSearchResponse.expire_at_ms);
        FilterGroupSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, afterpayAppletSearchResponse.filter_group_sections);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, afterpayAppletSearchResponse.sections);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, afterpayAppletSearchResponse.screen_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletSearchResponse afterpayAppletSearchResponse = (AfterpayAppletSearchResponse) obj;
        afterpayAppletSearchResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, afterpayAppletSearchResponse.screen_title) + afterpayAppletSearchResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = SearchSection.ADAPTER;
        return protoAdapter.encodedSizeWithTag(6, afterpayAppletSearchResponse.home_preview_section) + EngagedItemToken.ADAPTER.asRepeated().encodedSizeWithTag(5, afterpayAppletSearchResponse.invalid_recently_viewed_engaged_tokens) + ProtoAdapter.INT64.encodedSizeWithTag(4, afterpayAppletSearchResponse.expire_at_ms) + FilterGroupSection.ADAPTER.encodedSizeWithTag(3, afterpayAppletSearchResponse.filter_group_sections) + protoAdapter.asRepeated().encodedSizeWithTag(2, afterpayAppletSearchResponse.sections) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletSearchResponse afterpayAppletSearchResponse = (AfterpayAppletSearchResponse) obj;
        afterpayAppletSearchResponse.getClass();
        List list = afterpayAppletSearchResponse.sections;
        ProtoAdapter protoAdapter = SearchSection.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        FilterGroupSection filterGroupSection = afterpayAppletSearchResponse.filter_group_sections;
        FilterGroupSection filterGroupSection2 = filterGroupSection != null ? (FilterGroupSection) FilterGroupSection.ADAPTER.redact(filterGroupSection) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(afterpayAppletSearchResponse.invalid_recently_viewed_engaged_tokens, EngagedItemToken.ADAPTER);
        SearchSection searchSection = afterpayAppletSearchResponse.home_preview_section;
        return AfterpayAppletSearchResponse.copy$default(afterpayAppletSearchResponse, m1169redactElements, filterGroupSection2, m1169redactElements2, searchSection != null ? (SearchSection) protoAdapter.redact(searchSection) : null, ByteString.EMPTY, 9);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletSearchResponse afterpayAppletSearchResponse = (AfterpayAppletSearchResponse) obj;
        afterpayAppletSearchResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, afterpayAppletSearchResponse.screen_title);
        ProtoAdapter protoAdapter = SearchSection.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, afterpayAppletSearchResponse.sections);
        FilterGroupSection.ADAPTER.encodeWithTag(protoWriter, 3, afterpayAppletSearchResponse.filter_group_sections);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, afterpayAppletSearchResponse.expire_at_ms);
        EngagedItemToken.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, afterpayAppletSearchResponse.invalid_recently_viewed_engaged_tokens);
        protoAdapter.encodeWithTag(protoWriter, 6, afterpayAppletSearchResponse.home_preview_section);
        protoWriter.writeBytes(afterpayAppletSearchResponse.unknownFields());
    }
}
