package com.squareup.protos.franklin.ui;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProfileUpsellConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileUpsellConfiguration(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileUpsellConfiguration profileUpsellConfiguration = (ProfileUpsellConfiguration) obj;
        reverseProtoWriter.getClass();
        profileUpsellConfiguration.getClass();
        reverseProtoWriter.writeBytes(profileUpsellConfiguration.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, profileUpsellConfiguration.upsell_entity_ids_priority);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileUpsellConfiguration profileUpsellConfiguration = (ProfileUpsellConfiguration) obj;
        profileUpsellConfiguration.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, profileUpsellConfiguration.upsell_entity_ids_priority) + profileUpsellConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileUpsellConfiguration profileUpsellConfiguration = (ProfileUpsellConfiguration) obj;
        profileUpsellConfiguration.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = profileUpsellConfiguration.upsell_entity_ids_priority;
        list.getClass();
        byteString.getClass();
        return new ProfileUpsellConfiguration(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileUpsellConfiguration profileUpsellConfiguration = (ProfileUpsellConfiguration) obj;
        profileUpsellConfiguration.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, profileUpsellConfiguration.upsell_entity_ids_priority);
        protoWriter.writeBytes(profileUpsellConfiguration.unknownFields());
    }
}
