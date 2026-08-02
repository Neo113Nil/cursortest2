package com.squareup.protos.cash.cryptoinvestflow.service;

import com.squareup.protos.cash.cryptoinvestflow.service.UserInteractionContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UserInteractionContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UserInteractionContext((UserInteractionContext.UserInteractionSide) obj, (UserInteractionContext.Applet) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = UserInteractionContext.UserInteractionSide.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = UserInteractionContext.Applet.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UserInteractionContext userInteractionContext = (UserInteractionContext) obj;
        reverseProtoWriter.getClass();
        userInteractionContext.getClass();
        reverseProtoWriter.writeBytes(userInteractionContext.unknownFields());
        UserInteractionContext.Applet.ADAPTER.encodeWithTag(reverseProtoWriter, 2, userInteractionContext.applet);
        UserInteractionContext.UserInteractionSide.ADAPTER.encodeWithTag(reverseProtoWriter, 1, userInteractionContext.user_interaction_side);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UserInteractionContext userInteractionContext = (UserInteractionContext) obj;
        userInteractionContext.getClass();
        return UserInteractionContext.Applet.ADAPTER.encodedSizeWithTag(2, userInteractionContext.applet) + UserInteractionContext.UserInteractionSide.ADAPTER.encodedSizeWithTag(1, userInteractionContext.user_interaction_side) + userInteractionContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UserInteractionContext userInteractionContext = (UserInteractionContext) obj;
        userInteractionContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        UserInteractionContext.UserInteractionSide userInteractionSide = userInteractionContext.user_interaction_side;
        UserInteractionContext.Applet applet = userInteractionContext.applet;
        byteString.getClass();
        return new UserInteractionContext(userInteractionSide, applet, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UserInteractionContext userInteractionContext = (UserInteractionContext) obj;
        userInteractionContext.getClass();
        UserInteractionContext.UserInteractionSide.ADAPTER.encodeWithTag(protoWriter, 1, userInteractionContext.user_interaction_side);
        UserInteractionContext.Applet.ADAPTER.encodeWithTag(protoWriter, 2, userInteractionContext.applet);
        protoWriter.writeBytes(userInteractionContext.unknownFields());
    }
}
