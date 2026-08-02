package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiPublicProfile$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiPublicProfile((String) obj, (String) obj2, (String) obj3, (FullCashtag) obj4, (Boolean) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj4 = TransactorKt.decodeMessageOrMerge(FullCashtag.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiPublicProfile uiPublicProfile = (UiPublicProfile) obj;
        reverseProtoWriter.getClass();
        uiPublicProfile.getClass();
        reverseProtoWriter.writeBytes(uiPublicProfile.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, uiPublicProfile.is_verified_account);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, uiPublicProfile.cashtag_url_enabled);
        FullCashtag.ADAPTER.encodeWithTag(reverseProtoWriter, 4, uiPublicProfile.full_cashtag);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, uiPublicProfile.synopsis);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, uiPublicProfile.photo_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, uiPublicProfile.full_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiPublicProfile uiPublicProfile = (UiPublicProfile) obj;
        uiPublicProfile.getClass();
        int size$okio = uiPublicProfile.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = FullCashtag.ADAPTER.encodedSizeWithTag(4, uiPublicProfile.full_cashtag) + protoAdapter.encodedSizeWithTag(3, uiPublicProfile.synopsis) + protoAdapter.encodedSizeWithTag(2, uiPublicProfile.photo_url) + protoAdapter.encodedSizeWithTag(1, uiPublicProfile.full_name) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(6, uiPublicProfile.is_verified_account) + protoAdapter2.encodedSizeWithTag(5, uiPublicProfile.cashtag_url_enabled) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiPublicProfile uiPublicProfile = (UiPublicProfile) obj;
        uiPublicProfile.getClass();
        FullCashtag fullCashtag = uiPublicProfile.full_cashtag;
        FullCashtag fullCashtag2 = fullCashtag != null ? (FullCashtag) FullCashtag.ADAPTER.redact(fullCashtag) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiPublicProfile.cashtag_url_enabled;
        Boolean bool2 = uiPublicProfile.is_verified_account;
        byteString.getClass();
        return new UiPublicProfile(null, null, null, fullCashtag2, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiPublicProfile uiPublicProfile = (UiPublicProfile) obj;
        uiPublicProfile.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, uiPublicProfile.full_name);
        protoAdapter.encodeWithTag(protoWriter, 2, uiPublicProfile.photo_url);
        protoAdapter.encodeWithTag(protoWriter, 3, uiPublicProfile.synopsis);
        FullCashtag.ADAPTER.encodeWithTag(protoWriter, 4, uiPublicProfile.full_cashtag);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, uiPublicProfile.cashtag_url_enabled);
        protoAdapter2.encodeWithTag(protoWriter, 6, uiPublicProfile.is_verified_account);
        protoWriter.writeBytes(uiPublicProfile.unknownFields());
    }
}
