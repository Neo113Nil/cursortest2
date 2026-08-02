package com.squareup.protos.cash.deviceintegritly.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ValidateAttestationResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ValidateAttestationResponse((Long) obj, (Long) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (Boolean) obj6, (Boolean) obj7, (Boolean) obj8, (String) obj9, (PlayIntegrityVerdict) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj10 = TransactorKt.decodeMessageOrMerge(PlayIntegrityVerdict.ADAPTER, protoReader, obj10);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ValidateAttestationResponse validateAttestationResponse = (ValidateAttestationResponse) obj;
        reverseProtoWriter.getClass();
        validateAttestationResponse.getClass();
        reverseProtoWriter.writeBytes(validateAttestationResponse.unknownFields());
        PlayIntegrityVerdict.ADAPTER.encodeWithTag(reverseProtoWriter, 10, validateAttestationResponse.play_integrity_verdict);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, validateAttestationResponse.evaluation_type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, validateAttestationResponse.basic_integrity_passed);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, validateAttestationResponse.cts_profile_match);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, validateAttestationResponse.is_signature_valid);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, validateAttestationResponse.is_public_release);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, validateAttestationResponse.is_nonce_valid);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, validateAttestationResponse.result_code);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, validateAttestationResponse.completed_at);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, validateAttestationResponse.created_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ValidateAttestationResponse validateAttestationResponse = (ValidateAttestationResponse) obj;
        validateAttestationResponse.getClass();
        int size$okio = validateAttestationResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, validateAttestationResponse.completed_at) + protoAdapter.encodedSizeWithTag(1, validateAttestationResponse.created_at) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, validateAttestationResponse.result_code) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return PlayIntegrityVerdict.ADAPTER.encodedSizeWithTag(10, validateAttestationResponse.play_integrity_verdict) + protoAdapter2.encodedSizeWithTag(9, validateAttestationResponse.evaluation_type) + protoAdapter3.encodedSizeWithTag(8, validateAttestationResponse.basic_integrity_passed) + protoAdapter3.encodedSizeWithTag(7, validateAttestationResponse.cts_profile_match) + protoAdapter3.encodedSizeWithTag(6, validateAttestationResponse.is_signature_valid) + protoAdapter3.encodedSizeWithTag(5, validateAttestationResponse.is_public_release) + protoAdapter3.encodedSizeWithTag(4, validateAttestationResponse.is_nonce_valid) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ValidateAttestationResponse validateAttestationResponse = (ValidateAttestationResponse) obj;
        validateAttestationResponse.getClass();
        PlayIntegrityVerdict playIntegrityVerdict = validateAttestationResponse.play_integrity_verdict;
        PlayIntegrityVerdict playIntegrityVerdict2 = playIntegrityVerdict != null ? (PlayIntegrityVerdict) PlayIntegrityVerdict.ADAPTER.redact(playIntegrityVerdict) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = validateAttestationResponse.created_at;
        Long l2 = validateAttestationResponse.completed_at;
        String str = validateAttestationResponse.result_code;
        Boolean bool = validateAttestationResponse.is_nonce_valid;
        Boolean bool2 = validateAttestationResponse.is_public_release;
        Boolean bool3 = validateAttestationResponse.is_signature_valid;
        Boolean bool4 = validateAttestationResponse.cts_profile_match;
        Boolean bool5 = validateAttestationResponse.basic_integrity_passed;
        String str2 = validateAttestationResponse.evaluation_type;
        byteString.getClass();
        return new ValidateAttestationResponse(l, l2, str, bool, bool2, bool3, bool4, bool5, str2, playIntegrityVerdict2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ValidateAttestationResponse validateAttestationResponse = (ValidateAttestationResponse) obj;
        validateAttestationResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, validateAttestationResponse.created_at);
        protoAdapter.encodeWithTag(protoWriter, 2, validateAttestationResponse.completed_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, validateAttestationResponse.result_code);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 4, validateAttestationResponse.is_nonce_valid);
        protoAdapter3.encodeWithTag(protoWriter, 5, validateAttestationResponse.is_public_release);
        protoAdapter3.encodeWithTag(protoWriter, 6, validateAttestationResponse.is_signature_valid);
        protoAdapter3.encodeWithTag(protoWriter, 7, validateAttestationResponse.cts_profile_match);
        protoAdapter3.encodeWithTag(protoWriter, 8, validateAttestationResponse.basic_integrity_passed);
        protoAdapter2.encodeWithTag(protoWriter, 9, validateAttestationResponse.evaluation_type);
        PlayIntegrityVerdict.ADAPTER.encodeWithTag(protoWriter, 10, validateAttestationResponse.play_integrity_verdict);
        protoWriter.writeBytes(validateAttestationResponse.unknownFields());
    }
}
