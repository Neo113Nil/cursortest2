package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$AccessData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingInfo.AccessData((String) obj, (String) obj2, (String) obj3, m, (String) obj4, (LendingInfo.AccessData.Button) obj5, (String) obj6, (LocalizableString) obj7, (LocalizableString) obj8, (LocalizableString) obj9, (LocalizableString) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    m.add(LendingInfo.AccessData.DetailRow.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(LendingInfo.AccessData.Button.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj7);
                    break;
                case 9:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj8);
                    break;
                case 10:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj9);
                    break;
                case 11:
                    obj10 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj10);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.AccessData accessData = (LendingInfo.AccessData) obj;
        reverseProtoWriter.getClass();
        accessData.getClass();
        reverseProtoWriter.writeBytes(accessData.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, accessData.localizable_detail_rows_header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, accessData.localizable_footer_markdown);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, accessData.localizable_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, accessData.localizable_header);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, accessData.detail_rows_header);
        LendingInfo.AccessData.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 6, accessData.button);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, accessData.footer_markdown);
        LendingInfo.AccessData.DetailRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, accessData.detail_rows);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, accessData.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, accessData.header);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, accessData.image_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.AccessData accessData = (LendingInfo.AccessData) obj;
        accessData.getClass();
        int size$okio = accessData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(7, accessData.detail_rows_header) + LendingInfo.AccessData.Button.ADAPTER.encodedSizeWithTag(6, accessData.button) + protoAdapter.encodedSizeWithTag(5, accessData.footer_markdown) + LendingInfo.AccessData.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(4, accessData.detail_rows) + protoAdapter.encodedSizeWithTag(3, accessData.subtitle) + protoAdapter.encodedSizeWithTag(2, accessData.header) + protoAdapter.encodedSizeWithTag(1, accessData.image_url) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(11, accessData.localizable_detail_rows_header) + protoAdapter2.encodedSizeWithTag(10, accessData.localizable_footer_markdown) + protoAdapter2.encodedSizeWithTag(9, accessData.localizable_subtitle) + protoAdapter2.encodedSizeWithTag(8, accessData.localizable_header) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.AccessData accessData = (LendingInfo.AccessData) obj;
        accessData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(accessData.detail_rows, LendingInfo.AccessData.DetailRow.ADAPTER);
        LendingInfo.AccessData.Button button = accessData.button;
        LendingInfo.AccessData.Button button2 = button != null ? (LendingInfo.AccessData.Button) LendingInfo.AccessData.Button.ADAPTER.redact(button) : null;
        LocalizableString localizableString = accessData.localizable_header;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = accessData.localizable_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        LocalizableString localizableString5 = accessData.localizable_footer_markdown;
        LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
        LocalizableString localizableString7 = accessData.localizable_detail_rows_header;
        LocalizableString localizableString8 = localizableString7 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = accessData.image_url;
        String str2 = accessData.header;
        String str3 = accessData.subtitle;
        String str4 = accessData.footer_markdown;
        String str5 = accessData.detail_rows_header;
        byteString.getClass();
        return new LendingInfo.AccessData(str, str2, str3, m1169redactElements, str4, button2, str5, localizableString2, localizableString4, localizableString6, localizableString8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.AccessData accessData = (LendingInfo.AccessData) obj;
        accessData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, accessData.image_url);
        protoAdapter.encodeWithTag(protoWriter, 2, accessData.header);
        protoAdapter.encodeWithTag(protoWriter, 3, accessData.subtitle);
        LendingInfo.AccessData.DetailRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, accessData.detail_rows);
        protoAdapter.encodeWithTag(protoWriter, 5, accessData.footer_markdown);
        LendingInfo.AccessData.Button.ADAPTER.encodeWithTag(protoWriter, 6, accessData.button);
        protoAdapter.encodeWithTag(protoWriter, 7, accessData.detail_rows_header);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 8, accessData.localizable_header);
        protoAdapter2.encodeWithTag(protoWriter, 9, accessData.localizable_subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 10, accessData.localizable_footer_markdown);
        protoAdapter2.encodeWithTag(protoWriter, 11, accessData.localizable_detail_rows_header);
        protoWriter.writeBytes(accessData.unknownFields());
    }
}
