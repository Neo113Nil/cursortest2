package com.squareup.protos.cash.p2p.profile_directory.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Avatar$Initials$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Avatar.Initials((String) obj, (Color) obj2, (Color) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Avatar.Initials initials = (Avatar.Initials) obj;
        reverseProtoWriter.getClass();
        initials.getClass();
        reverseProtoWriter.writeBytes(initials.unknownFields());
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, initials.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, initials.text_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, initials.initials);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Avatar.Initials initials = (Avatar.Initials) obj;
        initials.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, initials.initials) + initials.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, initials.background_color) + protoAdapter.encodedSizeWithTag(2, initials.text_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Avatar.Initials initials = (Avatar.Initials) obj;
        initials.getClass();
        Color color = initials.text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = initials.background_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Avatar.Initials(null, color2, color4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Avatar.Initials initials = (Avatar.Initials) obj;
        initials.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, initials.initials);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, initials.text_color);
        protoAdapter.encodeWithTag(protoWriter, 3, initials.background_color);
        protoWriter.writeBytes(initials.unknownFields());
    }
}
