package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShopBrowseResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShopBrowseResponse(m, (Integer) obj, (String) obj2, (String) obj3, (Button) obj4, (SearchBar) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(Section.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(SearchBar.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShopBrowseResponse shopBrowseResponse = (ShopBrowseResponse) obj;
        reverseProtoWriter.getClass();
        shopBrowseResponse.getClass();
        reverseProtoWriter.writeBytes(shopBrowseResponse.unknownFields());
        SearchBar.ADAPTER.encodeWithTag(reverseProtoWriter, 6, shopBrowseResponse.search_bar);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 5, shopBrowseResponse.toolbar_button);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, shopBrowseResponse.screen_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, shopBrowseResponse.screen_title);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, shopBrowseResponse.ttl_in_sec);
        Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, shopBrowseResponse.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShopBrowseResponse shopBrowseResponse = (ShopBrowseResponse) obj;
        shopBrowseResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, shopBrowseResponse.ttl_in_sec) + Section.ADAPTER.asRepeated().encodedSizeWithTag(1, shopBrowseResponse.sections) + shopBrowseResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SearchBar.ADAPTER.encodedSizeWithTag(6, shopBrowseResponse.search_bar) + Button.ADAPTER.encodedSizeWithTag(5, shopBrowseResponse.toolbar_button) + protoAdapter.encodedSizeWithTag(4, shopBrowseResponse.screen_subtitle) + protoAdapter.encodedSizeWithTag(3, shopBrowseResponse.screen_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShopBrowseResponse shopBrowseResponse = (ShopBrowseResponse) obj;
        shopBrowseResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(shopBrowseResponse.sections, Section.ADAPTER);
        Button button = shopBrowseResponse.toolbar_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        SearchBar searchBar = shopBrowseResponse.search_bar;
        SearchBar searchBar2 = searchBar != null ? (SearchBar) SearchBar.ADAPTER.redact(searchBar) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = shopBrowseResponse.ttl_in_sec;
        String str = shopBrowseResponse.screen_title;
        String str2 = shopBrowseResponse.screen_subtitle;
        byteString.getClass();
        return new ShopBrowseResponse(m1169redactElements, num, str, str2, button2, searchBar2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopBrowseResponse shopBrowseResponse = (ShopBrowseResponse) obj;
        shopBrowseResponse.getClass();
        Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, shopBrowseResponse.sections);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, shopBrowseResponse.ttl_in_sec);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, shopBrowseResponse.screen_title);
        protoAdapter.encodeWithTag(protoWriter, 4, shopBrowseResponse.screen_subtitle);
        Button.ADAPTER.encodeWithTag(protoWriter, 5, shopBrowseResponse.toolbar_button);
        SearchBar.ADAPTER.encodeWithTag(protoWriter, 6, shopBrowseResponse.search_bar);
        protoWriter.writeBytes(shopBrowseResponse.unknownFields());
    }
}
