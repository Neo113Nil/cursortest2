package com.squareup.protos.cash.bankinfo.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.bankinfo.api.Bank$DisplaySettings;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Bank$DisplaySettings$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Bank$DisplaySettings((Bank$DisplaySettings.Theme) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Bank$DisplaySettings.Theme.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Bank$DisplaySettings bank$DisplaySettings = (Bank$DisplaySettings) obj;
        reverseProtoWriter.getClass();
        bank$DisplaySettings.getClass();
        reverseProtoWriter.writeBytes(bank$DisplaySettings.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, bank$DisplaySettings.banner_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, bank$DisplaySettings.tab_selection_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, bank$DisplaySettings.selection_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, bank$DisplaySettings.tab_detail_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, bank$DisplaySettings.detail_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, bank$DisplaySettings.tab_card_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, bank$DisplaySettings.color_card_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bank$DisplaySettings.monochrome_card_icon_url);
        Bank$DisplaySettings.Theme.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bank$DisplaySettings.display_theme);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Bank$DisplaySettings bank$DisplaySettings = (Bank$DisplaySettings) obj;
        bank$DisplaySettings.getClass();
        int encodedSizeWithTag = Bank$DisplaySettings.Theme.ADAPTER.encodedSizeWithTag(1, bank$DisplaySettings.display_theme) + bank$DisplaySettings.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(9, bank$DisplaySettings.banner_icon_url) + protoAdapter.encodedSizeWithTag(8, bank$DisplaySettings.tab_selection_icon_url) + protoAdapter.encodedSizeWithTag(7, bank$DisplaySettings.selection_icon_url) + protoAdapter.encodedSizeWithTag(6, bank$DisplaySettings.tab_detail_icon_url) + protoAdapter.encodedSizeWithTag(5, bank$DisplaySettings.detail_icon_url) + protoAdapter.encodedSizeWithTag(4, bank$DisplaySettings.tab_card_icon_url) + protoAdapter.encodedSizeWithTag(3, bank$DisplaySettings.color_card_icon_url) + protoAdapter.encodedSizeWithTag(2, bank$DisplaySettings.monochrome_card_icon_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Bank$DisplaySettings bank$DisplaySettings = (Bank$DisplaySettings) obj;
        bank$DisplaySettings.getClass();
        Bank$DisplaySettings.Theme theme = bank$DisplaySettings.display_theme;
        Bank$DisplaySettings.Theme theme2 = theme != null ? (Bank$DisplaySettings.Theme) Bank$DisplaySettings.Theme.ADAPTER.redact(theme) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = bank$DisplaySettings.monochrome_card_icon_url;
        String str2 = bank$DisplaySettings.color_card_icon_url;
        String str3 = bank$DisplaySettings.tab_card_icon_url;
        String str4 = bank$DisplaySettings.detail_icon_url;
        String str5 = bank$DisplaySettings.tab_detail_icon_url;
        String str6 = bank$DisplaySettings.selection_icon_url;
        String str7 = bank$DisplaySettings.tab_selection_icon_url;
        String str8 = bank$DisplaySettings.banner_icon_url;
        byteString.getClass();
        return new Bank$DisplaySettings(theme2, str, str2, str3, str4, str5, str6, str7, str8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Bank$DisplaySettings bank$DisplaySettings = (Bank$DisplaySettings) obj;
        bank$DisplaySettings.getClass();
        Bank$DisplaySettings.Theme.ADAPTER.encodeWithTag(protoWriter, 1, bank$DisplaySettings.display_theme);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, bank$DisplaySettings.monochrome_card_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 3, bank$DisplaySettings.color_card_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 4, bank$DisplaySettings.tab_card_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 5, bank$DisplaySettings.detail_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 6, bank$DisplaySettings.tab_detail_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 7, bank$DisplaySettings.selection_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 8, bank$DisplaySettings.tab_selection_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 9, bank$DisplaySettings.banner_icon_url);
        protoWriter.writeBytes(bank$DisplaySettings.unknownFields());
    }
}
