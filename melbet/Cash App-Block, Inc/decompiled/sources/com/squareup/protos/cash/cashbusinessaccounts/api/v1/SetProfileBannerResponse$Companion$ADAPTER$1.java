package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetProfileBannerResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetProfileBannerResponse((ResponseContext) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetProfileBannerResponse setProfileBannerResponse = (SetProfileBannerResponse) obj;
        reverseProtoWriter.getClass();
        setProfileBannerResponse.getClass();
        reverseProtoWriter.writeBytes(setProfileBannerResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setProfileBannerResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, setProfileBannerResponse.banner_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetProfileBannerResponse setProfileBannerResponse = (SetProfileBannerResponse) obj;
        setProfileBannerResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, setProfileBannerResponse.response_context) + ProtoAdapter.STRING.encodedSizeWithTag(1, setProfileBannerResponse.banner_color) + setProfileBannerResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetProfileBannerResponse setProfileBannerResponse = (SetProfileBannerResponse) obj;
        setProfileBannerResponse.getClass();
        ResponseContext responseContext = setProfileBannerResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = setProfileBannerResponse.banner_color;
        byteString.getClass();
        return new SetProfileBannerResponse(responseContext2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetProfileBannerResponse setProfileBannerResponse = (SetProfileBannerResponse) obj;
        setProfileBannerResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setProfileBannerResponse.banner_color);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, setProfileBannerResponse.response_context);
        protoWriter.writeBytes(setProfileBannerResponse.unknownFields());
    }
}
