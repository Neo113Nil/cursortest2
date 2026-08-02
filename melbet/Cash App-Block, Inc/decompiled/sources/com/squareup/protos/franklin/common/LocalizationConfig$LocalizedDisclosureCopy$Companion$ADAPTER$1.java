package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalizationConfig$LocalizedDisclosureCopy$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalizationConfig.LocalizedDisclosureCopy((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalizationConfig.LocalizedDisclosureCopy localizedDisclosureCopy = (LocalizationConfig.LocalizedDisclosureCopy) obj;
        reverseProtoWriter.getClass();
        localizedDisclosureCopy.getClass();
        reverseProtoWriter.writeBytes(localizedDisclosureCopy.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, localizedDisclosureCopy.accept_cta);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, localizedDisclosureCopy.disclaimer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, localizedDisclosureCopy.terms_body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, localizedDisclosureCopy.terms_header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localizedDisclosureCopy.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localizedDisclosureCopy.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localizedDisclosureCopy.locale_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localizedDisclosureCopy.locale);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalizationConfig.LocalizedDisclosureCopy localizedDisclosureCopy = (LocalizationConfig.LocalizedDisclosureCopy) obj;
        localizedDisclosureCopy.getClass();
        int size$okio = localizedDisclosureCopy.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(8, localizedDisclosureCopy.accept_cta) + protoAdapter.encodedSizeWithTag(7, localizedDisclosureCopy.disclaimer) + protoAdapter.encodedSizeWithTag(6, localizedDisclosureCopy.terms_body) + protoAdapter.encodedSizeWithTag(5, localizedDisclosureCopy.terms_header) + protoAdapter.encodedSizeWithTag(4, localizedDisclosureCopy.subtitle) + protoAdapter.encodedSizeWithTag(3, localizedDisclosureCopy.title) + protoAdapter.encodedSizeWithTag(2, localizedDisclosureCopy.locale_label) + protoAdapter.encodedSizeWithTag(1, localizedDisclosureCopy.locale) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalizationConfig.LocalizedDisclosureCopy localizedDisclosureCopy = (LocalizationConfig.LocalizedDisclosureCopy) obj;
        localizedDisclosureCopy.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localizedDisclosureCopy.locale;
        String str2 = localizedDisclosureCopy.locale_label;
        String str3 = localizedDisclosureCopy.title;
        String str4 = localizedDisclosureCopy.subtitle;
        String str5 = localizedDisclosureCopy.terms_header;
        String str6 = localizedDisclosureCopy.terms_body;
        String str7 = localizedDisclosureCopy.disclaimer;
        String str8 = localizedDisclosureCopy.accept_cta;
        byteString.getClass();
        return new LocalizationConfig.LocalizedDisclosureCopy(str, str2, str3, str4, str5, str6, str7, str8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalizationConfig.LocalizedDisclosureCopy localizedDisclosureCopy = (LocalizationConfig.LocalizedDisclosureCopy) obj;
        localizedDisclosureCopy.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localizedDisclosureCopy.locale);
        protoAdapter.encodeWithTag(protoWriter, 2, localizedDisclosureCopy.locale_label);
        protoAdapter.encodeWithTag(protoWriter, 3, localizedDisclosureCopy.title);
        protoAdapter.encodeWithTag(protoWriter, 4, localizedDisclosureCopy.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 5, localizedDisclosureCopy.terms_header);
        protoAdapter.encodeWithTag(protoWriter, 6, localizedDisclosureCopy.terms_body);
        protoAdapter.encodeWithTag(protoWriter, 7, localizedDisclosureCopy.disclaimer);
        protoAdapter.encodeWithTag(protoWriter, 8, localizedDisclosureCopy.accept_cta);
        protoWriter.writeBytes(localizedDisclosureCopy.unknownFields());
    }
}
