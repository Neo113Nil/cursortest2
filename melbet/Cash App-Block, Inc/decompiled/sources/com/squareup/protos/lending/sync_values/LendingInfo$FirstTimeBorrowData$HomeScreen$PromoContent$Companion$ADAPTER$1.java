package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzjm;
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
public final class LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$Companion$ADAPTER$1 extends ProtoAdapter {
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
        zzjm zzjmVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent((String) obj, (String) obj2, (String) obj3, zzjmVar, (LocalizableString) obj4, (LocalizableString) obj5, (LocalizableString) obj6, (Image) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    zzjmVar = new LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonSupportNode((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 5:
                    zzjmVar = new LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    break;
                case 9:
                    obj7 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent promoContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent) obj;
        reverseProtoWriter.getClass();
        promoContent.getClass();
        reverseProtoWriter.writeBytes(promoContent.unknownFields());
        zzjm zzjmVar = promoContent.support_node_routing;
        if (zzjmVar instanceof LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonSupportNode) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonSupportNode) zzjmVar).value);
        } else if (zzjmVar instanceof LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, ((LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl) zzjmVar).value);
        } else if (zzjmVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 9, promoContent.image);
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, promoContent.localizable_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, promoContent.localizable_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, promoContent.localizable_title);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, promoContent.button_title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, promoContent.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, promoContent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent promoContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent) obj;
        promoContent.getClass();
        int size$okio = promoContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, promoContent.button_title) + protoAdapter.encodedSizeWithTag(2, promoContent.subtitle) + protoAdapter.encodedSizeWithTag(1, promoContent.title) + size$okio;
        zzjm zzjmVar = promoContent.support_node_routing;
        if (zzjmVar instanceof LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonSupportNode) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, ((LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonSupportNode) zzjmVar).value);
        } else {
            if (!(zzjmVar instanceof LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl)) {
                if (zzjmVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
                return Image.ADAPTER.encodedSizeWithTag(9, promoContent.image) + protoAdapter2.encodedSizeWithTag(8, promoContent.localizable_button_title) + protoAdapter2.encodedSizeWithTag(7, promoContent.localizable_subtitle) + protoAdapter2.encodedSizeWithTag(6, promoContent.localizable_title) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, ((LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl) zzjmVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        ProtoAdapter protoAdapter22 = LocalizableString.ADAPTER;
        return Image.ADAPTER.encodedSizeWithTag(9, promoContent.image) + protoAdapter22.encodedSizeWithTag(8, promoContent.localizable_button_title) + protoAdapter22.encodedSizeWithTag(7, promoContent.localizable_subtitle) + protoAdapter22.encodedSizeWithTag(6, promoContent.localizable_title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent promoContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent) obj;
        promoContent.getClass();
        LocalizableString localizableString = promoContent.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = promoContent.localizable_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        LocalizableString localizableString5 = promoContent.localizable_button_title;
        LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
        Image image = promoContent.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = promoContent.title;
        String str2 = promoContent.subtitle;
        String str3 = promoContent.button_title;
        zzjm zzjmVar = promoContent.support_node_routing;
        byteString.getClass();
        return new LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent(str, str2, str3, zzjmVar, localizableString2, localizableString4, localizableString6, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent promoContent = (LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent) obj;
        promoContent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, promoContent.title);
        protoAdapter.encodeWithTag(protoWriter, 2, promoContent.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, promoContent.button_title);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, promoContent.localizable_title);
        protoAdapter2.encodeWithTag(protoWriter, 7, promoContent.localizable_subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 8, promoContent.localizable_button_title);
        Image.ADAPTER.encodeWithTag(protoWriter, 9, promoContent.image);
        zzjm zzjmVar = promoContent.support_node_routing;
        if (zzjmVar instanceof LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonSupportNode) {
            protoAdapter.encodeWithTag(protoWriter, 4, ((LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonSupportNode) zzjmVar).value);
        } else if (zzjmVar instanceof LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl) {
            protoAdapter.encodeWithTag(protoWriter, 5, ((LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl) zzjmVar).value);
        } else if (zzjmVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(promoContent.unknownFields());
    }
}
