package com.squareup.protos.franklin.bankbook;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.ClientDisplayTheme;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Institution$DisplayInformation$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Institution.DisplayInformation((String) obj, (String) obj2, (String) obj3, (ClientDisplayTheme) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj4 = TransactorKt.decodeMessageOrMerge(ClientDisplayTheme.ADAPTER, protoReader, obj4);
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
        Institution.DisplayInformation displayInformation = (Institution.DisplayInformation) obj;
        reverseProtoWriter.getClass();
        displayInformation.getClass();
        reverseProtoWriter.writeBytes(displayInformation.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, displayInformation.submit_button_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, displayInformation.help_button_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, displayInformation.pin_hint_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, displayInformation.password_hint_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, displayInformation.username_hint_text);
        ClientDisplayTheme.ADAPTER.encodeWithTag(reverseProtoWriter, 4, displayInformation.theme);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, displayInformation.banner_logo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, displayInformation.icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, displayInformation.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Institution.DisplayInformation displayInformation = (Institution.DisplayInformation) obj;
        displayInformation.getClass();
        int size$okio = displayInformation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(9, displayInformation.submit_button_label) + protoAdapter.encodedSizeWithTag(8, displayInformation.help_button_label) + protoAdapter.encodedSizeWithTag(7, displayInformation.pin_hint_text) + protoAdapter.encodedSizeWithTag(6, displayInformation.password_hint_text) + protoAdapter.encodedSizeWithTag(5, displayInformation.username_hint_text) + ClientDisplayTheme.ADAPTER.encodedSizeWithTag(4, displayInformation.theme) + protoAdapter.encodedSizeWithTag(3, displayInformation.banner_logo_url) + protoAdapter.encodedSizeWithTag(2, displayInformation.icon_url) + protoAdapter.encodedSizeWithTag(1, displayInformation.display_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Institution.DisplayInformation displayInformation = (Institution.DisplayInformation) obj;
        displayInformation.getClass();
        ClientDisplayTheme clientDisplayTheme = displayInformation.theme;
        ClientDisplayTheme clientDisplayTheme2 = clientDisplayTheme != null ? (ClientDisplayTheme) ClientDisplayTheme.ADAPTER.redact(clientDisplayTheme) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = displayInformation.display_name;
        String str2 = displayInformation.icon_url;
        String str3 = displayInformation.banner_logo_url;
        String str4 = displayInformation.username_hint_text;
        String str5 = displayInformation.password_hint_text;
        String str6 = displayInformation.pin_hint_text;
        String str7 = displayInformation.help_button_label;
        String str8 = displayInformation.submit_button_label;
        byteString.getClass();
        return new Institution.DisplayInformation(str, str2, str3, clientDisplayTheme2, str4, str5, str6, str7, str8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Institution.DisplayInformation displayInformation = (Institution.DisplayInformation) obj;
        displayInformation.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, displayInformation.display_name);
        protoAdapter.encodeWithTag(protoWriter, 2, displayInformation.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 3, displayInformation.banner_logo_url);
        ClientDisplayTheme.ADAPTER.encodeWithTag(protoWriter, 4, displayInformation.theme);
        protoAdapter.encodeWithTag(protoWriter, 5, displayInformation.username_hint_text);
        protoAdapter.encodeWithTag(protoWriter, 6, displayInformation.password_hint_text);
        protoAdapter.encodeWithTag(protoWriter, 7, displayInformation.pin_hint_text);
        protoAdapter.encodeWithTag(protoWriter, 8, displayInformation.help_button_label);
        protoAdapter.encodeWithTag(protoWriter, 9, displayInformation.submit_button_label);
        protoWriter.writeBytes(displayInformation.unknownFields());
    }
}
