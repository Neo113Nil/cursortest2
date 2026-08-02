package com.squareup.protos.cash.aegis.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GraduationCta$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GraduationCta((String) obj, (String) obj2, (String) obj3, (String) obj4, (Image) obj5, (LocalizableString) obj6, (LocalizableString) obj7, (LocalizableString) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GraduationCta graduationCta = (GraduationCta) obj;
        reverseProtoWriter.getClass();
        graduationCta.getClass();
        reverseProtoWriter.writeBytes(graduationCta.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, graduationCta.localizable_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, graduationCta.localizable_subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, graduationCta.localizable_title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, graduationCta.image);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, graduationCta.url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, graduationCta.button_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, graduationCta.subtext);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, graduationCta.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GraduationCta graduationCta = (GraduationCta) obj;
        graduationCta.getClass();
        int size$okio = graduationCta.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(5, graduationCta.image) + protoAdapter.encodedSizeWithTag(4, graduationCta.url) + protoAdapter.encodedSizeWithTag(3, graduationCta.button_text) + protoAdapter.encodedSizeWithTag(2, graduationCta.subtext) + protoAdapter.encodedSizeWithTag(1, graduationCta.title) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(8, graduationCta.localizable_button_text) + protoAdapter2.encodedSizeWithTag(7, graduationCta.localizable_subtext) + protoAdapter2.encodedSizeWithTag(6, graduationCta.localizable_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GraduationCta graduationCta = (GraduationCta) obj;
        graduationCta.getClass();
        Image image = graduationCta.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizableString localizableString = graduationCta.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = graduationCta.localizable_subtext;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        LocalizableString localizableString5 = graduationCta.localizable_button_text;
        LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = graduationCta.title;
        String str2 = graduationCta.subtext;
        String str3 = graduationCta.button_text;
        String str4 = graduationCta.url;
        byteString.getClass();
        return new GraduationCta(str, str2, str3, str4, image2, localizableString2, localizableString4, localizableString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GraduationCta graduationCta = (GraduationCta) obj;
        graduationCta.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, graduationCta.title);
        protoAdapter.encodeWithTag(protoWriter, 2, graduationCta.subtext);
        protoAdapter.encodeWithTag(protoWriter, 3, graduationCta.button_text);
        protoAdapter.encodeWithTag(protoWriter, 4, graduationCta.url);
        Image.ADAPTER.encodeWithTag(protoWriter, 5, graduationCta.image);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, graduationCta.localizable_title);
        protoAdapter2.encodeWithTag(protoWriter, 7, graduationCta.localizable_subtext);
        protoAdapter2.encodeWithTag(protoWriter, 8, graduationCta.localizable_button_text);
        protoWriter.writeBytes(graduationCta.unknownFields());
    }
}
