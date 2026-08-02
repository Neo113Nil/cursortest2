package com.squareup.protos.franklin.service;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzed;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class HandleThreeDomainSecureV2ActionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzed handleThreeDomainSecureV2ActionRequest$Result$Success;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        zzed zzedVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HandleThreeDomainSecureV2ActionRequest((RequestContext) obj, (String) obj2, (String) obj3, (String) obj4, zzedVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 5:
                    handleThreeDomainSecureV2ActionRequest$Result$Success = new HandleThreeDomainSecureV2ActionRequest$Result$Success((ThreeDomainSecureV2ActionSuccess) ThreeDomainSecureV2ActionSuccess.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    handleThreeDomainSecureV2ActionRequest$Result$Success = new HandleThreeDomainSecureV2ActionRequest$Result$Error((ThreeDomainSecureV2ActionError) ThreeDomainSecureV2ActionError.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzedVar = handleThreeDomainSecureV2ActionRequest$Result$Success;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HandleThreeDomainSecureV2ActionRequest handleThreeDomainSecureV2ActionRequest = (HandleThreeDomainSecureV2ActionRequest) obj;
        reverseProtoWriter.getClass();
        handleThreeDomainSecureV2ActionRequest.getClass();
        reverseProtoWriter.writeBytes(handleThreeDomainSecureV2ActionRequest.unknownFields());
        zzed zzedVar = handleThreeDomainSecureV2ActionRequest.result;
        if (zzedVar instanceof HandleThreeDomainSecureV2ActionRequest$Result$Success) {
            ThreeDomainSecureV2ActionSuccess.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((HandleThreeDomainSecureV2ActionRequest$Result$Success) zzedVar).value);
        } else if (zzedVar instanceof HandleThreeDomainSecureV2ActionRequest$Result$Error) {
            ThreeDomainSecureV2ActionError.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((HandleThreeDomainSecureV2ActionRequest$Result$Error) zzedVar).value);
        } else if (zzedVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, handleThreeDomainSecureV2ActionRequest.transaction_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, handleThreeDomainSecureV2ActionRequest.transaction_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, handleThreeDomainSecureV2ActionRequest.action_details);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, handleThreeDomainSecureV2ActionRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        HandleThreeDomainSecureV2ActionRequest handleThreeDomainSecureV2ActionRequest = (HandleThreeDomainSecureV2ActionRequest) obj;
        handleThreeDomainSecureV2ActionRequest.getClass();
        int encodedSizeWithTag2 = RequestContext.ADAPTER.encodedSizeWithTag(1, handleThreeDomainSecureV2ActionRequest.request_context) + handleThreeDomainSecureV2ActionRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(4, handleThreeDomainSecureV2ActionRequest.transaction_id) + protoAdapter.encodedSizeWithTag(3, handleThreeDomainSecureV2ActionRequest.transaction_type) + protoAdapter.encodedSizeWithTag(2, handleThreeDomainSecureV2ActionRequest.action_details) + encodedSizeWithTag2;
        zzed zzedVar = handleThreeDomainSecureV2ActionRequest.result;
        if (zzedVar instanceof HandleThreeDomainSecureV2ActionRequest$Result$Success) {
            encodedSizeWithTag = ThreeDomainSecureV2ActionSuccess.ADAPTER.encodedSizeWithTag(5, ((HandleThreeDomainSecureV2ActionRequest$Result$Success) zzedVar).value);
        } else {
            if (!(zzedVar instanceof HandleThreeDomainSecureV2ActionRequest$Result$Error)) {
                if (zzedVar == null) {
                    return encodedSizeWithTag3;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ThreeDomainSecureV2ActionError.ADAPTER.encodedSizeWithTag(6, ((HandleThreeDomainSecureV2ActionRequest$Result$Error) zzedVar).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HandleThreeDomainSecureV2ActionRequest handleThreeDomainSecureV2ActionRequest = (HandleThreeDomainSecureV2ActionRequest) obj;
        handleThreeDomainSecureV2ActionRequest.getClass();
        RequestContext requestContext = handleThreeDomainSecureV2ActionRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = handleThreeDomainSecureV2ActionRequest.action_details;
        String str2 = handleThreeDomainSecureV2ActionRequest.transaction_type;
        String str3 = handleThreeDomainSecureV2ActionRequest.transaction_id;
        zzed zzedVar = handleThreeDomainSecureV2ActionRequest.result;
        byteString.getClass();
        return new HandleThreeDomainSecureV2ActionRequest(requestContext2, str, str2, str3, zzedVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HandleThreeDomainSecureV2ActionRequest handleThreeDomainSecureV2ActionRequest = (HandleThreeDomainSecureV2ActionRequest) obj;
        handleThreeDomainSecureV2ActionRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, handleThreeDomainSecureV2ActionRequest.request_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, handleThreeDomainSecureV2ActionRequest.action_details);
        protoAdapter.encodeWithTag(protoWriter, 3, handleThreeDomainSecureV2ActionRequest.transaction_type);
        protoAdapter.encodeWithTag(protoWriter, 4, handleThreeDomainSecureV2ActionRequest.transaction_id);
        zzed zzedVar = handleThreeDomainSecureV2ActionRequest.result;
        if (zzedVar instanceof HandleThreeDomainSecureV2ActionRequest$Result$Success) {
            ThreeDomainSecureV2ActionSuccess.ADAPTER.encodeWithTag(protoWriter, 5, ((HandleThreeDomainSecureV2ActionRequest$Result$Success) zzedVar).value);
        } else if (zzedVar instanceof HandleThreeDomainSecureV2ActionRequest$Result$Error) {
            ThreeDomainSecureV2ActionError.ADAPTER.encodeWithTag(protoWriter, 6, ((HandleThreeDomainSecureV2ActionRequest$Result$Error) zzedVar).value);
        } else if (zzedVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(handleThreeDomainSecureV2ActionRequest.unknownFields());
    }
}
