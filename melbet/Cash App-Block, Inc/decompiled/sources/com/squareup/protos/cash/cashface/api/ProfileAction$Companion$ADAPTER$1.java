package com.squareup.protos.cash.cashface.api;

import com.squareup.protos.cash.cashface.api.ProfileAction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileAction((String) obj, (ProfileAction.State) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ProfileAction.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileAction profileAction = (ProfileAction) obj;
        reverseProtoWriter.getClass();
        profileAction.getClass();
        reverseProtoWriter.writeBytes(profileAction.unknownFields());
        ProfileAction.State.ADAPTER.encodeWithTag(reverseProtoWriter, 2, profileAction.state);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, profileAction.display_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileAction profileAction = (ProfileAction) obj;
        profileAction.getClass();
        return ProfileAction.State.ADAPTER.encodedSizeWithTag(2, profileAction.state) + ProtoAdapter.STRING.encodedSizeWithTag(1, profileAction.display_text) + profileAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileAction profileAction = (ProfileAction) obj;
        profileAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = profileAction.display_text;
        ProfileAction.State state = profileAction.state;
        byteString.getClass();
        return new ProfileAction(str, state, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileAction profileAction = (ProfileAction) obj;
        profileAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, profileAction.display_text);
        ProfileAction.State.ADAPTER.encodeWithTag(protoWriter, 2, profileAction.state);
        protoWriter.writeBytes(profileAction.unknownFields());
    }
}
