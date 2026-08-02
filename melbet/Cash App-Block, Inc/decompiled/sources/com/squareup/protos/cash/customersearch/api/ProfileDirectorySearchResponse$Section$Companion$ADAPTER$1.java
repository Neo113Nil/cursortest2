package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileDirectorySearchResponse.Section((String) obj, m, (ProfileDirectorySearchResponse.Section.ResultsType) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ProfileDirectorySearchResponse.ResultSource.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ProfileDirectorySearchResponse.Section.ResultsType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileDirectorySearchResponse.Section section = (ProfileDirectorySearchResponse.Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        ProfileDirectorySearchResponse.Section.ResultsType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, section.results_type);
        ProfileDirectorySearchResponse.ResultSource.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, section.results);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, section.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileDirectorySearchResponse.Section section = (ProfileDirectorySearchResponse.Section) obj;
        section.getClass();
        return ProfileDirectorySearchResponse.Section.ResultsType.ADAPTER.encodedSizeWithTag(3, section.results_type) + ProfileDirectorySearchResponse.ResultSource.ADAPTER.asRepeated().encodedSizeWithTag(2, section.results) + ProtoAdapter.STRING.encodedSizeWithTag(1, section.title) + section.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileDirectorySearchResponse.Section section = (ProfileDirectorySearchResponse.Section) obj;
        section.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(section.results, ProfileDirectorySearchResponse.ResultSource.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = section.title;
        ProfileDirectorySearchResponse.Section.ResultsType resultsType = section.results_type;
        byteString.getClass();
        return new ProfileDirectorySearchResponse.Section(str, m1169redactElements, resultsType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileDirectorySearchResponse.Section section = (ProfileDirectorySearchResponse.Section) obj;
        section.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, section.title);
        ProfileDirectorySearchResponse.ResultSource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, section.results);
        ProfileDirectorySearchResponse.Section.ResultsType.ADAPTER.encodeWithTag(protoWriter, 3, section.results_type);
        protoWriter.writeBytes(section.unknownFields());
    }
}
