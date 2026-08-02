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
public final class ShopCategoryBrowseResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ShopCategoryBrowseResponse(m, arrayList, (Integer) obj, (String) obj2, (String) obj3, (Button) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    arrayList.add(ToggleScreen.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShopCategoryBrowseResponse shopCategoryBrowseResponse = (ShopCategoryBrowseResponse) obj;
        reverseProtoWriter.getClass();
        shopCategoryBrowseResponse.getClass();
        reverseProtoWriter.writeBytes(shopCategoryBrowseResponse.unknownFields());
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 5, shopCategoryBrowseResponse.toolbar_button);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, shopCategoryBrowseResponse.screen_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, shopCategoryBrowseResponse.screen_title);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, shopCategoryBrowseResponse.ttl_in_sec);
        ToggleScreen.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, shopCategoryBrowseResponse.toggle_screens);
        Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, shopCategoryBrowseResponse.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShopCategoryBrowseResponse shopCategoryBrowseResponse = (ShopCategoryBrowseResponse) obj;
        shopCategoryBrowseResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, shopCategoryBrowseResponse.ttl_in_sec) + ToggleScreen.ADAPTER.asRepeated().encodedSizeWithTag(6, shopCategoryBrowseResponse.toggle_screens) + Section.ADAPTER.asRepeated().encodedSizeWithTag(1, shopCategoryBrowseResponse.sections) + shopCategoryBrowseResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Button.ADAPTER.encodedSizeWithTag(5, shopCategoryBrowseResponse.toolbar_button) + protoAdapter.encodedSizeWithTag(4, shopCategoryBrowseResponse.screen_subtitle) + protoAdapter.encodedSizeWithTag(3, shopCategoryBrowseResponse.screen_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShopCategoryBrowseResponse shopCategoryBrowseResponse = (ShopCategoryBrowseResponse) obj;
        shopCategoryBrowseResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(shopCategoryBrowseResponse.sections, Section.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(shopCategoryBrowseResponse.toggle_screens, ToggleScreen.ADAPTER);
        Button button = shopCategoryBrowseResponse.toolbar_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = shopCategoryBrowseResponse.ttl_in_sec;
        String str = shopCategoryBrowseResponse.screen_title;
        String str2 = shopCategoryBrowseResponse.screen_subtitle;
        byteString.getClass();
        return new ShopCategoryBrowseResponse(m1169redactElements, m1169redactElements2, num, str, str2, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopCategoryBrowseResponse shopCategoryBrowseResponse = (ShopCategoryBrowseResponse) obj;
        shopCategoryBrowseResponse.getClass();
        Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, shopCategoryBrowseResponse.sections);
        ToggleScreen.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, shopCategoryBrowseResponse.toggle_screens);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, shopCategoryBrowseResponse.ttl_in_sec);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, shopCategoryBrowseResponse.screen_title);
        protoAdapter.encodeWithTag(protoWriter, 4, shopCategoryBrowseResponse.screen_subtitle);
        Button.ADAPTER.encodeWithTag(protoWriter, 5, shopCategoryBrowseResponse.toolbar_button);
        protoWriter.writeBytes(shopCategoryBrowseResponse.unknownFields());
    }
}
