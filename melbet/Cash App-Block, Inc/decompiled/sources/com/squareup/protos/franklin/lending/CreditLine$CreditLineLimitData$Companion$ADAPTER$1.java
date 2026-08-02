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
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreditLine$CreditLineLimitData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditLine.CreditLineLimitData((String) obj, (String) obj2, (String) obj3, m, (String) obj4, (LocalizableString) obj5, (LocalizableString) obj6, (LocalizableString) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    m.add(CreditLine.CreditLineLimitData.Bullet.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLine.CreditLineLimitData creditLineLimitData = (CreditLine.CreditLineLimitData) obj;
        reverseProtoWriter.getClass();
        creditLineLimitData.getClass();
        reverseProtoWriter.writeBytes(creditLineLimitData.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, creditLineLimitData.localizable_additionalInfoText);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, creditLineLimitData.localizable_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, creditLineLimitData.localizable_title);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, creditLineLimitData.url);
        CreditLine.CreditLineLimitData.Bullet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, creditLineLimitData.bullets);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, creditLineLimitData.additionalInfoText);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, creditLineLimitData.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, creditLineLimitData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditLine.CreditLineLimitData creditLineLimitData = (CreditLine.CreditLineLimitData) obj;
        creditLineLimitData.getClass();
        int size$okio = creditLineLimitData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, creditLineLimitData.url) + CreditLine.CreditLineLimitData.Bullet.ADAPTER.asRepeated().encodedSizeWithTag(4, creditLineLimitData.bullets) + protoAdapter.encodedSizeWithTag(3, creditLineLimitData.additionalInfoText) + protoAdapter.encodedSizeWithTag(2, creditLineLimitData.subtitle) + protoAdapter.encodedSizeWithTag(1, creditLineLimitData.title) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(8, creditLineLimitData.localizable_additionalInfoText) + protoAdapter2.encodedSizeWithTag(7, creditLineLimitData.localizable_subtitle) + protoAdapter2.encodedSizeWithTag(6, creditLineLimitData.localizable_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLine.CreditLineLimitData creditLineLimitData = (CreditLine.CreditLineLimitData) obj;
        creditLineLimitData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(creditLineLimitData.bullets, CreditLine.CreditLineLimitData.Bullet.ADAPTER);
        LocalizableString localizableString = creditLineLimitData.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = creditLineLimitData.localizable_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        LocalizableString localizableString5 = creditLineLimitData.localizable_additionalInfoText;
        LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = creditLineLimitData.title;
        String str2 = creditLineLimitData.subtitle;
        String str3 = creditLineLimitData.additionalInfoText;
        String str4 = creditLineLimitData.url;
        byteString.getClass();
        return new CreditLine.CreditLineLimitData(str, str2, str3, m1169redactElements, str4, localizableString2, localizableString4, localizableString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLine.CreditLineLimitData creditLineLimitData = (CreditLine.CreditLineLimitData) obj;
        creditLineLimitData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, creditLineLimitData.title);
        protoAdapter.encodeWithTag(protoWriter, 2, creditLineLimitData.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, creditLineLimitData.additionalInfoText);
        CreditLine.CreditLineLimitData.Bullet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, creditLineLimitData.bullets);
        protoAdapter.encodeWithTag(protoWriter, 5, creditLineLimitData.url);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, creditLineLimitData.localizable_title);
        protoAdapter2.encodeWithTag(protoWriter, 7, creditLineLimitData.localizable_subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 8, creditLineLimitData.localizable_additionalInfoText);
        protoWriter.writeBytes(creditLineLimitData.unknownFields());
    }
}
