package com.squareup.cash.supportarticles.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListSupportArticlesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListSupportArticlesResponse((String) obj, m, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SupportArticle.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 3) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList2.add(SupportLink.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListSupportArticlesResponse listSupportArticlesResponse = (ListSupportArticlesResponse) obj;
        reverseProtoWriter.getClass();
        listSupportArticlesResponse.getClass();
        reverseProtoWriter.writeBytes(listSupportArticlesResponse.unknownFields());
        SupportLink.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, listSupportArticlesResponse.links);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, listSupportArticlesResponse.stylesheet_url);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, listSupportArticlesResponse.home_article_ids);
        SupportArticle.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, listSupportArticlesResponse.articles);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListSupportArticlesResponse listSupportArticlesResponse = (ListSupportArticlesResponse) obj;
        listSupportArticlesResponse.getClass();
        int encodedSizeWithTag = SupportArticle.ADAPTER.asRepeated().encodedSizeWithTag(1, listSupportArticlesResponse.articles) + listSupportArticlesResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SupportLink.ADAPTER.asRepeated().encodedSizeWithTag(4, listSupportArticlesResponse.links) + protoAdapter.encodedSizeWithTag(3, listSupportArticlesResponse.stylesheet_url) + protoAdapter.asRepeated().encodedSizeWithTag(2, listSupportArticlesResponse.home_article_ids) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListSupportArticlesResponse listSupportArticlesResponse = (ListSupportArticlesResponse) obj;
        listSupportArticlesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listSupportArticlesResponse.articles, SupportArticle.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(listSupportArticlesResponse.links, SupportLink.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        List list = listSupportArticlesResponse.home_article_ids;
        String str = listSupportArticlesResponse.stylesheet_url;
        list.getClass();
        byteString.getClass();
        return new ListSupportArticlesResponse(str, m1169redactElements, list, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListSupportArticlesResponse listSupportArticlesResponse = (ListSupportArticlesResponse) obj;
        listSupportArticlesResponse.getClass();
        SupportArticle.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listSupportArticlesResponse.articles);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, listSupportArticlesResponse.home_article_ids);
        protoAdapter.encodeWithTag(protoWriter, 3, listSupportArticlesResponse.stylesheet_url);
        SupportLink.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, listSupportArticlesResponse.links);
        protoWriter.writeBytes(listSupportArticlesResponse.unknownFields());
    }
}
