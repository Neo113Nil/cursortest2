package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreditLine$FirstTimeBorrowData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditLine.FirstTimeBorrowData((String) obj, (String) obj2, (String) obj3, m, (String) obj4, (String) obj5, (CreditLine.FirstTimeBorrowData.PromoContent) obj6, (String) obj7, (String) obj8, (LocalizableString) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(CreditLine.FirstTimeBorrowData.PromoContent.ADAPTER, protoReader, obj6);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj9);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLine.FirstTimeBorrowData firstTimeBorrowData = (CreditLine.FirstTimeBorrowData) obj;
        reverseProtoWriter.getClass();
        firstTimeBorrowData.getClass();
        reverseProtoWriter.writeBytes(firstTimeBorrowData.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 10, firstTimeBorrowData.localizable_title);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, firstTimeBorrowData.notice_body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, firstTimeBorrowData.notice_title);
        CreditLine.FirstTimeBorrowData.PromoContent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, firstTimeBorrowData.promo_content);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, firstTimeBorrowData.support_node);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, firstTimeBorrowData.support_button_title);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, firstTimeBorrowData.bullets);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, firstTimeBorrowData.button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, firstTimeBorrowData.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, firstTimeBorrowData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditLine.FirstTimeBorrowData firstTimeBorrowData = (CreditLine.FirstTimeBorrowData) obj;
        firstTimeBorrowData.getClass();
        int size$okio = firstTimeBorrowData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(10, firstTimeBorrowData.localizable_title) + protoAdapter.encodedSizeWithTag(9, firstTimeBorrowData.notice_body) + protoAdapter.encodedSizeWithTag(8, firstTimeBorrowData.notice_title) + CreditLine.FirstTimeBorrowData.PromoContent.ADAPTER.encodedSizeWithTag(7, firstTimeBorrowData.promo_content) + protoAdapter.encodedSizeWithTag(5, firstTimeBorrowData.support_node) + protoAdapter.encodedSizeWithTag(6, firstTimeBorrowData.support_button_title) + protoAdapter.asRepeated().encodedSizeWithTag(4, firstTimeBorrowData.bullets) + protoAdapter.encodedSizeWithTag(3, firstTimeBorrowData.button_title) + protoAdapter.encodedSizeWithTag(2, firstTimeBorrowData.subtitle) + protoAdapter.encodedSizeWithTag(1, firstTimeBorrowData.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLine.FirstTimeBorrowData firstTimeBorrowData = (CreditLine.FirstTimeBorrowData) obj;
        firstTimeBorrowData.getClass();
        CreditLine.FirstTimeBorrowData.PromoContent promoContent = firstTimeBorrowData.promo_content;
        CreditLine.FirstTimeBorrowData.PromoContent promoContent2 = promoContent != null ? (CreditLine.FirstTimeBorrowData.PromoContent) CreditLine.FirstTimeBorrowData.PromoContent.ADAPTER.redact(promoContent) : null;
        LocalizableString localizableString = firstTimeBorrowData.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = firstTimeBorrowData.title;
        String str2 = firstTimeBorrowData.subtitle;
        String str3 = firstTimeBorrowData.button_title;
        List list = firstTimeBorrowData.bullets;
        String str4 = firstTimeBorrowData.support_button_title;
        String str5 = firstTimeBorrowData.support_node;
        String str6 = firstTimeBorrowData.notice_title;
        String str7 = firstTimeBorrowData.notice_body;
        list.getClass();
        byteString.getClass();
        return new CreditLine.FirstTimeBorrowData(str, str2, str3, list, str4, str5, promoContent2, str6, str7, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLine.FirstTimeBorrowData firstTimeBorrowData = (CreditLine.FirstTimeBorrowData) obj;
        firstTimeBorrowData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, firstTimeBorrowData.title);
        protoAdapter.encodeWithTag(protoWriter, 2, firstTimeBorrowData.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, firstTimeBorrowData.button_title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, firstTimeBorrowData.bullets);
        protoAdapter.encodeWithTag(protoWriter, 6, firstTimeBorrowData.support_button_title);
        protoAdapter.encodeWithTag(protoWriter, 5, firstTimeBorrowData.support_node);
        CreditLine.FirstTimeBorrowData.PromoContent.ADAPTER.encodeWithTag(protoWriter, 7, firstTimeBorrowData.promo_content);
        protoAdapter.encodeWithTag(protoWriter, 8, firstTimeBorrowData.notice_title);
        protoAdapter.encodeWithTag(protoWriter, 9, firstTimeBorrowData.notice_body);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 10, firstTimeBorrowData.localizable_title);
        protoWriter.writeBytes(firstTimeBorrowData.unknownFields());
    }
}
