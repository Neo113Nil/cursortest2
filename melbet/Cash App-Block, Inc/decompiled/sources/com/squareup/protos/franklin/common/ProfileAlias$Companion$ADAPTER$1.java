package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProfileAlias$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ProfileAlias((UiAlias) obj, (Boolean) obj2, (Long) obj3, (Long) obj4, (Long) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAlias.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileAlias profileAlias = (ProfileAlias) obj;
        reverseProtoWriter.getClass();
        profileAlias.getClass();
        reverseProtoWriter.writeBytes(profileAlias.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, profileAlias.display_date);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, profileAlias.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, profileAlias.expires_at);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, profileAlias.verified);
        UiAlias.ADAPTER.encodeWithTag(reverseProtoWriter, 1, profileAlias.alias);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileAlias profileAlias = (ProfileAlias) obj;
        profileAlias.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(2, profileAlias.verified) + UiAlias.ADAPTER.encodedSizeWithTag(1, profileAlias.alias) + profileAlias.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(5, profileAlias.display_date) + protoAdapter.encodedSizeWithTag(4, profileAlias.version) + protoAdapter.encodedSizeWithTag(3, profileAlias.expires_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileAlias profileAlias = (ProfileAlias) obj;
        profileAlias.getClass();
        UiAlias uiAlias = profileAlias.alias;
        UiAlias uiAlias2 = uiAlias != null ? (UiAlias) UiAlias.ADAPTER.redact(uiAlias) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = profileAlias.verified;
        Long l = profileAlias.expires_at;
        Long l2 = profileAlias.version;
        Long l3 = profileAlias.display_date;
        byteString.getClass();
        return new ProfileAlias(uiAlias2, bool, l, l2, l3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileAlias profileAlias = (ProfileAlias) obj;
        profileAlias.getClass();
        UiAlias.ADAPTER.encodeWithTag(protoWriter, 1, profileAlias.alias);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, profileAlias.verified);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, profileAlias.expires_at);
        protoAdapter.encodeWithTag(protoWriter, 4, profileAlias.version);
        protoAdapter.encodeWithTag(protoWriter, 5, profileAlias.display_date);
        protoWriter.writeBytes(profileAlias.unknownFields());
    }
}
