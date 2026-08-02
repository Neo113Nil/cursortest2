package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$HomeScreen$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj10 = null;
        LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingInfo.FirstTimeBorrowData.HomeScreen((String) obj, (String) obj2, (Image) obj3, (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent) obj4, (String) obj5, (LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent) obj6, (LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent) obj7, lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute, (LocalizableString) obj8, (LocalizableString) obj9, (LocalizableString) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute = new LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
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
        LendingInfo.FirstTimeBorrowData.HomeScreen homeScreen = (LendingInfo.FirstTimeBorrowData.HomeScreen) obj;
        reverseProtoWriter.getClass();
        homeScreen.getClass();
        reverseProtoWriter.writeBytes(homeScreen.unknownFields());
        LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute = homeScreen.button_routing;
        if (lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 8, lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute.value);
        } else if (lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, homeScreen.localizable_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, homeScreen.localizable_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, homeScreen.localizable_title);
        LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, homeScreen.notice_content);
        LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent.ADAPTER.encodeWithTag(reverseProtoWriter, 6, homeScreen.promo_content);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, homeScreen.button_title);
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, homeScreen.bullets);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, homeScreen.image);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, homeScreen.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, homeScreen.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen homeScreen = (LendingInfo.FirstTimeBorrowData.HomeScreen) obj;
        homeScreen.getClass();
        int size$okio = homeScreen.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent.ADAPTER.encodedSizeWithTag(7, homeScreen.notice_content) + LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent.ADAPTER.encodedSizeWithTag(6, homeScreen.promo_content) + protoAdapter.encodedSizeWithTag(5, homeScreen.button_title) + LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.ADAPTER.encodedSizeWithTag(4, homeScreen.bullets) + Image.ADAPTER.encodedSizeWithTag(3, homeScreen.image) + protoAdapter.encodedSizeWithTag(2, homeScreen.subtitle) + protoAdapter.encodedSizeWithTag(1, homeScreen.title) + size$okio;
        LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute = homeScreen.button_routing;
        if (lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute != null) {
            encodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute.value);
        } else if (lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(11, homeScreen.localizable_button_title) + protoAdapter2.encodedSizeWithTag(10, homeScreen.localizable_subtitle) + protoAdapter2.encodedSizeWithTag(9, homeScreen.localizable_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen homeScreen = (LendingInfo.FirstTimeBorrowData.HomeScreen) obj;
        homeScreen.getClass();
        Image image = homeScreen.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent bulletContent = homeScreen.bullets;
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent bulletContent2 = bulletContent != null ? (LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent) LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.ADAPTER.redact(bulletContent) : null;
        LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent promoContent = homeScreen.promo_content;
        LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent promoContent2 = promoContent != null ? (LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent) LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent.ADAPTER.redact(promoContent) : null;
        LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent noticeContent = homeScreen.notice_content;
        LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent noticeContent2 = noticeContent != null ? (LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent) LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent.ADAPTER.redact(noticeContent) : null;
        LocalizableString localizableString = homeScreen.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = homeScreen.localizable_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        LocalizableString localizableString5 = homeScreen.localizable_button_title;
        LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = homeScreen.title;
        String str2 = homeScreen.subtitle;
        String str3 = homeScreen.button_title;
        LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute = homeScreen.button_routing;
        byteString.getClass();
        return new LendingInfo.FirstTimeBorrowData.HomeScreen(str, str2, image2, bulletContent2, str3, promoContent2, noticeContent2, lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute, localizableString2, localizableString4, localizableString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen homeScreen = (LendingInfo.FirstTimeBorrowData.HomeScreen) obj;
        homeScreen.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, homeScreen.title);
        protoAdapter.encodeWithTag(protoWriter, 2, homeScreen.subtitle);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, homeScreen.image);
        LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.ADAPTER.encodeWithTag(protoWriter, 4, homeScreen.bullets);
        protoAdapter.encodeWithTag(protoWriter, 5, homeScreen.button_title);
        LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent.ADAPTER.encodeWithTag(protoWriter, 6, homeScreen.promo_content);
        LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent.ADAPTER.encodeWithTag(protoWriter, 7, homeScreen.notice_content);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 9, homeScreen.localizable_title);
        protoAdapter2.encodeWithTag(protoWriter, 10, homeScreen.localizable_subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 11, homeScreen.localizable_button_title);
        LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute = homeScreen.button_routing;
        if (lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute != null) {
            protoAdapter.encodeWithTag(protoWriter, 8, lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute.value);
        } else if (lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(homeScreen.unknownFields());
    }
}
