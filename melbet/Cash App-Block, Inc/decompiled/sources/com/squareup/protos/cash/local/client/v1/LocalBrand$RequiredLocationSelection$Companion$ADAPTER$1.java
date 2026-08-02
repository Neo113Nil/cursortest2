package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalBrand$RequiredLocationSelection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalBrand.RequiredLocationSelection((String) obj, (String) obj2, (String) obj3, (String) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalBrand.RequiredLocationSelection requiredLocationSelection = (LocalBrand.RequiredLocationSelection) obj;
        reverseProtoWriter.getClass();
        requiredLocationSelection.getClass();
        reverseProtoWriter.writeBytes(requiredLocationSelection.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, requiredLocationSelection.selected_location_is_default);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, requiredLocationSelection.cancel_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, requiredLocationSelection.confirm_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, requiredLocationSelection.prompt_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, requiredLocationSelection.prompt_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalBrand.RequiredLocationSelection requiredLocationSelection = (LocalBrand.RequiredLocationSelection) obj;
        requiredLocationSelection.getClass();
        int size$okio = requiredLocationSelection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(5, requiredLocationSelection.selected_location_is_default) + protoAdapter.encodedSizeWithTag(4, requiredLocationSelection.cancel_button_title) + protoAdapter.encodedSizeWithTag(3, requiredLocationSelection.confirm_button_title) + protoAdapter.encodedSizeWithTag(2, requiredLocationSelection.prompt_subtitle) + protoAdapter.encodedSizeWithTag(1, requiredLocationSelection.prompt_title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalBrand.RequiredLocationSelection requiredLocationSelection = (LocalBrand.RequiredLocationSelection) obj;
        requiredLocationSelection.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = requiredLocationSelection.prompt_title;
        String str2 = requiredLocationSelection.prompt_subtitle;
        String str3 = requiredLocationSelection.confirm_button_title;
        String str4 = requiredLocationSelection.cancel_button_title;
        Boolean bool = requiredLocationSelection.selected_location_is_default;
        byteString.getClass();
        return new LocalBrand.RequiredLocationSelection(str, str2, str3, str4, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalBrand.RequiredLocationSelection requiredLocationSelection = (LocalBrand.RequiredLocationSelection) obj;
        requiredLocationSelection.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, requiredLocationSelection.prompt_title);
        protoAdapter.encodeWithTag(protoWriter, 2, requiredLocationSelection.prompt_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, requiredLocationSelection.confirm_button_title);
        protoAdapter.encodeWithTag(protoWriter, 4, requiredLocationSelection.cancel_button_title);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, requiredLocationSelection.selected_location_is_default);
        protoWriter.writeBytes(requiredLocationSelection.unknownFields());
    }
}
