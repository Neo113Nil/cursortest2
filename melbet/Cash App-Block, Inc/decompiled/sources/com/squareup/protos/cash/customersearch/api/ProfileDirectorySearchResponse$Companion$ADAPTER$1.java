package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileDirectorySearchResponse(m, (ProfileDirectorySearchResponse.DefaultUiElements) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProfileDirectorySearchResponse.Section.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ProfileDirectorySearchResponse.DefaultUiElements.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileDirectorySearchResponse profileDirectorySearchResponse = (ProfileDirectorySearchResponse) obj;
        reverseProtoWriter.getClass();
        profileDirectorySearchResponse.getClass();
        reverseProtoWriter.writeBytes(profileDirectorySearchResponse.unknownFields());
        ProfileDirectorySearchResponse.DefaultUiElements.ADAPTER.encodeWithTag(reverseProtoWriter, 2, profileDirectorySearchResponse.default_ui_elements);
        ProfileDirectorySearchResponse.Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, profileDirectorySearchResponse.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileDirectorySearchResponse profileDirectorySearchResponse = (ProfileDirectorySearchResponse) obj;
        profileDirectorySearchResponse.getClass();
        return ProfileDirectorySearchResponse.DefaultUiElements.ADAPTER.encodedSizeWithTag(2, profileDirectorySearchResponse.default_ui_elements) + ProfileDirectorySearchResponse.Section.ADAPTER.asRepeated().encodedSizeWithTag(1, profileDirectorySearchResponse.sections) + profileDirectorySearchResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileDirectorySearchResponse profileDirectorySearchResponse = (ProfileDirectorySearchResponse) obj;
        profileDirectorySearchResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(profileDirectorySearchResponse.sections, ProfileDirectorySearchResponse.Section.ADAPTER);
        ProfileDirectorySearchResponse.DefaultUiElements defaultUiElements = profileDirectorySearchResponse.default_ui_elements;
        ProfileDirectorySearchResponse.DefaultUiElements defaultUiElements2 = defaultUiElements != null ? (ProfileDirectorySearchResponse.DefaultUiElements) ProfileDirectorySearchResponse.DefaultUiElements.ADAPTER.redact(defaultUiElements) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProfileDirectorySearchResponse(m1169redactElements, defaultUiElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileDirectorySearchResponse profileDirectorySearchResponse = (ProfileDirectorySearchResponse) obj;
        profileDirectorySearchResponse.getClass();
        ProfileDirectorySearchResponse.Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, profileDirectorySearchResponse.sections);
        ProfileDirectorySearchResponse.DefaultUiElements.ADAPTER.encodeWithTag(protoWriter, 2, profileDirectorySearchResponse.default_ui_elements);
        protoWriter.writeBytes(profileDirectorySearchResponse.unknownFields());
    }
}
