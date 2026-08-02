package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.SearchCommonAvatarSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchCommonAvatarSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchCommonAvatarSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SearchCommonAvatarSection.SearchCommonAvatarItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchCommonAvatarSection searchCommonAvatarSection = (SearchCommonAvatarSection) obj;
        reverseProtoWriter.getClass();
        searchCommonAvatarSection.getClass();
        reverseProtoWriter.writeBytes(searchCommonAvatarSection.unknownFields());
        SearchCommonAvatarSection.SearchCommonAvatarItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, searchCommonAvatarSection.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchCommonAvatarSection searchCommonAvatarSection = (SearchCommonAvatarSection) obj;
        searchCommonAvatarSection.getClass();
        return SearchCommonAvatarSection.SearchCommonAvatarItem.ADAPTER.asRepeated().encodedSizeWithTag(1, searchCommonAvatarSection.items) + searchCommonAvatarSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchCommonAvatarSection searchCommonAvatarSection = (SearchCommonAvatarSection) obj;
        searchCommonAvatarSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(searchCommonAvatarSection.items, SearchCommonAvatarSection.SearchCommonAvatarItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SearchCommonAvatarSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchCommonAvatarSection searchCommonAvatarSection = (SearchCommonAvatarSection) obj;
        searchCommonAvatarSection.getClass();
        SearchCommonAvatarSection.SearchCommonAvatarItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchCommonAvatarSection.items);
        protoWriter.writeBytes(searchCommonAvatarSection.unknownFields());
    }
}
