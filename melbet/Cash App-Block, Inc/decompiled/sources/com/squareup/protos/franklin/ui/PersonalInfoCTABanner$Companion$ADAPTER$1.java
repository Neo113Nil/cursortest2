package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PersonalInfoCTABanner$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PersonalInfoCTABanner((String) obj, (String) obj2, (String) obj3, (LocalizableString) obj4, (LocalizableString) obj5, (LocalizableString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 6) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
            } else if (nextTag == 7) {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
            } else if (nextTag != 8) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PersonalInfoCTABanner personalInfoCTABanner = (PersonalInfoCTABanner) obj;
        reverseProtoWriter.getClass();
        personalInfoCTABanner.getClass();
        reverseProtoWriter.writeBytes(personalInfoCTABanner.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, personalInfoCTABanner.localizable_banner_primary_button_cta);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, personalInfoCTABanner.localizable_banner_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, personalInfoCTABanner.localizable_banner_title);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, personalInfoCTABanner.banner_primary_button_cta);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, personalInfoCTABanner.banner_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, personalInfoCTABanner.banner_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PersonalInfoCTABanner personalInfoCTABanner = (PersonalInfoCTABanner) obj;
        personalInfoCTABanner.getClass();
        int size$okio = personalInfoCTABanner.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, personalInfoCTABanner.banner_primary_button_cta) + protoAdapter.encodedSizeWithTag(2, personalInfoCTABanner.banner_subtitle) + protoAdapter.encodedSizeWithTag(1, personalInfoCTABanner.banner_title) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(8, personalInfoCTABanner.localizable_banner_primary_button_cta) + protoAdapter2.encodedSizeWithTag(7, personalInfoCTABanner.localizable_banner_subtitle) + protoAdapter2.encodedSizeWithTag(6, personalInfoCTABanner.localizable_banner_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PersonalInfoCTABanner personalInfoCTABanner = (PersonalInfoCTABanner) obj;
        personalInfoCTABanner.getClass();
        LocalizableString localizableString = personalInfoCTABanner.localizable_banner_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = personalInfoCTABanner.localizable_banner_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        LocalizableString localizableString5 = personalInfoCTABanner.localizable_banner_primary_button_cta;
        LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = personalInfoCTABanner.banner_title;
        String str2 = personalInfoCTABanner.banner_subtitle;
        String str3 = personalInfoCTABanner.banner_primary_button_cta;
        byteString.getClass();
        return new PersonalInfoCTABanner(str, str2, str3, localizableString2, localizableString4, localizableString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PersonalInfoCTABanner personalInfoCTABanner = (PersonalInfoCTABanner) obj;
        personalInfoCTABanner.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, personalInfoCTABanner.banner_title);
        protoAdapter.encodeWithTag(protoWriter, 2, personalInfoCTABanner.banner_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, personalInfoCTABanner.banner_primary_button_cta);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, personalInfoCTABanner.localizable_banner_title);
        protoAdapter2.encodeWithTag(protoWriter, 7, personalInfoCTABanner.localizable_banner_subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 8, personalInfoCTABanner.localizable_banner_primary_button_cta);
        protoWriter.writeBytes(personalInfoCTABanner.unknownFields());
    }
}
