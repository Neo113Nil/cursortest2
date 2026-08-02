package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncInvestmentCategory$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        String str3;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str4 = null;
        String str5 = null;
        SyncInvestmentCategory.PrefixIcon prefixIcon = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        SyncInvestmentCategory.CategoryType categoryType = null;
        String str9 = null;
        String str10 = null;
        Object obj = null;
        Integer num = null;
        Boolean bool = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncInvestmentCategory(str4, str5, prefixIcon, str6, str7, str8, m, arrayList, categoryType, str9, str10, (Color) obj, num, bool, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 3:
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    try {
                        prefixIcon = SyncInvestmentCategory.PrefixIcon.ADAPTER.decode(protoReader);
                        str5 = str;
                        str6 = str2;
                        str7 = str3;
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 5:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 6:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 7:
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
                case 8:
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
                case 9:
                    try {
                        categoryType = SyncInvestmentCategory.CategoryType.ADAPTER.decode(protoReader);
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 10:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 11:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 12:
                    obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
                    decode = str4;
                    break;
                case 13:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str4;
                    break;
                case 14:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str4;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
            }
            str4 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvestmentCategory syncInvestmentCategory = (SyncInvestmentCategory) obj;
        reverseProtoWriter.getClass();
        syncInvestmentCategory.getClass();
        reverseProtoWriter.writeBytes(syncInvestmentCategory.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 14, syncInvestmentCategory.show_ipo_preview);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 13, syncInvestmentCategory.ui_ordering);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 12, syncInvestmentCategory.category_color);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, syncInvestmentCategory.filter_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, syncInvestmentCategory.description);
        SyncInvestmentCategory.CategoryType.ADAPTER.encodeWithTag(reverseProtoWriter, 9, syncInvestmentCategory.f1390type);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 8, syncInvestmentCategory.ui_filter_group_tokens);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 7, syncInvestmentCategory.investment_entity_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, syncInvestmentCategory.parent_category_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, syncInvestmentCategory.accent_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, syncInvestmentCategory.image_url);
        SyncInvestmentCategory.PrefixIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, syncInvestmentCategory.prefix_icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, syncInvestmentCategory.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, syncInvestmentCategory.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentCategory syncInvestmentCategory = (SyncInvestmentCategory) obj;
        syncInvestmentCategory.getClass();
        int size$okio = syncInvestmentCategory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(14, syncInvestmentCategory.show_ipo_preview) + ProtoAdapter.INT32.encodedSizeWithTag(13, syncInvestmentCategory.ui_ordering) + Color.ADAPTER.encodedSizeWithTag(12, syncInvestmentCategory.category_color) + protoAdapter.encodedSizeWithTag(11, syncInvestmentCategory.filter_description) + protoAdapter.encodedSizeWithTag(10, syncInvestmentCategory.description) + SyncInvestmentCategory.CategoryType.ADAPTER.encodedSizeWithTag(9, syncInvestmentCategory.f1390type) + protoAdapter.asRepeated().encodedSizeWithTag(8, syncInvestmentCategory.ui_filter_group_tokens) + protoAdapter.asRepeated().encodedSizeWithTag(7, syncInvestmentCategory.investment_entity_tokens) + protoAdapter.encodedSizeWithTag(6, syncInvestmentCategory.parent_category_token) + protoAdapter.encodedSizeWithTag(5, syncInvestmentCategory.accent_color) + protoAdapter.encodedSizeWithTag(4, syncInvestmentCategory.image_url) + SyncInvestmentCategory.PrefixIcon.ADAPTER.encodedSizeWithTag(3, syncInvestmentCategory.prefix_icon) + protoAdapter.encodedSizeWithTag(2, syncInvestmentCategory.name) + protoAdapter.encodedSizeWithTag(1, syncInvestmentCategory.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentCategory syncInvestmentCategory = (SyncInvestmentCategory) obj;
        syncInvestmentCategory.getClass();
        Color color = syncInvestmentCategory.category_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = syncInvestmentCategory.token;
        String str2 = syncInvestmentCategory.name;
        SyncInvestmentCategory.PrefixIcon prefixIcon = syncInvestmentCategory.prefix_icon;
        String str3 = syncInvestmentCategory.image_url;
        String str4 = syncInvestmentCategory.accent_color;
        String str5 = syncInvestmentCategory.parent_category_token;
        List list = syncInvestmentCategory.investment_entity_tokens;
        List list2 = syncInvestmentCategory.ui_filter_group_tokens;
        SyncInvestmentCategory.CategoryType categoryType = syncInvestmentCategory.f1390type;
        String str6 = syncInvestmentCategory.description;
        String str7 = syncInvestmentCategory.filter_description;
        Integer num = syncInvestmentCategory.ui_ordering;
        Boolean bool = syncInvestmentCategory.show_ipo_preview;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new SyncInvestmentCategory(str, str2, prefixIcon, str3, str4, str5, list, list2, categoryType, str6, str7, color2, num, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentCategory syncInvestmentCategory = (SyncInvestmentCategory) obj;
        syncInvestmentCategory.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, syncInvestmentCategory.token);
        protoAdapter.encodeWithTag(protoWriter, 2, syncInvestmentCategory.name);
        SyncInvestmentCategory.PrefixIcon.ADAPTER.encodeWithTag(protoWriter, 3, syncInvestmentCategory.prefix_icon);
        protoAdapter.encodeWithTag(protoWriter, 4, syncInvestmentCategory.image_url);
        protoAdapter.encodeWithTag(protoWriter, 5, syncInvestmentCategory.accent_color);
        protoAdapter.encodeWithTag(protoWriter, 6, syncInvestmentCategory.parent_category_token);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, syncInvestmentCategory.investment_entity_tokens);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 8, syncInvestmentCategory.ui_filter_group_tokens);
        SyncInvestmentCategory.CategoryType.ADAPTER.encodeWithTag(protoWriter, 9, syncInvestmentCategory.f1390type);
        protoAdapter.encodeWithTag(protoWriter, 10, syncInvestmentCategory.description);
        protoAdapter.encodeWithTag(protoWriter, 11, syncInvestmentCategory.filter_description);
        Color.ADAPTER.encodeWithTag(protoWriter, 12, syncInvestmentCategory.category_color);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, syncInvestmentCategory.ui_ordering);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, syncInvestmentCategory.show_ipo_preview);
        protoWriter.writeBytes(syncInvestmentCategory.unknownFields());
    }
}
