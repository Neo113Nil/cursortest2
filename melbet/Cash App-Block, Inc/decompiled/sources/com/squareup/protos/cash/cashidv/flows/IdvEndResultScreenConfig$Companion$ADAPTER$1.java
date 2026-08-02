package com.squareup.protos.cash.cashidv.flows;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class IdvEndResultScreenConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new IdvEndResultScreenConfig((Boolean) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IdvEndResultScreenConfig idvEndResultScreenConfig = (IdvEndResultScreenConfig) obj;
        reverseProtoWriter.getClass();
        idvEndResultScreenConfig.getClass();
        reverseProtoWriter.writeBytes(idvEndResultScreenConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, idvEndResultScreenConfig.custom_didv_in_review_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, idvEndResultScreenConfig.custom_didv_failure_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, idvEndResultScreenConfig.custom_didv_verified_subtitle);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, idvEndResultScreenConfig.suppress_idv_end_result_screen_on_verified_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IdvEndResultScreenConfig idvEndResultScreenConfig = (IdvEndResultScreenConfig) obj;
        idvEndResultScreenConfig.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, idvEndResultScreenConfig.suppress_idv_end_result_screen_on_verified_status) + idvEndResultScreenConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, idvEndResultScreenConfig.custom_didv_in_review_subtitle) + protoAdapter.encodedSizeWithTag(3, idvEndResultScreenConfig.custom_didv_failure_subtitle) + protoAdapter.encodedSizeWithTag(2, idvEndResultScreenConfig.custom_didv_verified_subtitle) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IdvEndResultScreenConfig idvEndResultScreenConfig = (IdvEndResultScreenConfig) obj;
        idvEndResultScreenConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = idvEndResultScreenConfig.suppress_idv_end_result_screen_on_verified_status;
        String str = idvEndResultScreenConfig.custom_didv_verified_subtitle;
        String str2 = idvEndResultScreenConfig.custom_didv_failure_subtitle;
        String str3 = idvEndResultScreenConfig.custom_didv_in_review_subtitle;
        byteString.getClass();
        return new IdvEndResultScreenConfig(bool, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IdvEndResultScreenConfig idvEndResultScreenConfig = (IdvEndResultScreenConfig) obj;
        idvEndResultScreenConfig.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, idvEndResultScreenConfig.suppress_idv_end_result_screen_on_verified_status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, idvEndResultScreenConfig.custom_didv_verified_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, idvEndResultScreenConfig.custom_didv_failure_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 4, idvEndResultScreenConfig.custom_didv_in_review_subtitle);
        protoWriter.writeBytes(idvEndResultScreenConfig.unknownFields());
    }
}
