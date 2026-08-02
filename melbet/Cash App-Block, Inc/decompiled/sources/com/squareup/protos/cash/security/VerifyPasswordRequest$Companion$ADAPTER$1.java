package com.squareup.protos.cash.security;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class VerifyPasswordRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzkp zzkpVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerifyPasswordRequest((RequestContext) obj, zzkpVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                zzkpVar = new VerifyPasswordRequest$Input$Password((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzkpVar = new VerifyPasswordRequest$Input$PasswordToken((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyPasswordRequest verifyPasswordRequest = (VerifyPasswordRequest) obj;
        reverseProtoWriter.getClass();
        verifyPasswordRequest.getClass();
        reverseProtoWriter.writeBytes(verifyPasswordRequest.unknownFields());
        zzkp zzkpVar = verifyPasswordRequest.input;
        if (zzkpVar instanceof VerifyPasswordRequest$Input$Password) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((VerifyPasswordRequest$Input$Password) zzkpVar).value);
        } else if (zzkpVar instanceof VerifyPasswordRequest$Input$PasswordToken) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((VerifyPasswordRequest$Input$PasswordToken) zzkpVar).value);
        } else if (zzkpVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyPasswordRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyPasswordRequest verifyPasswordRequest = (VerifyPasswordRequest) obj;
        verifyPasswordRequest.getClass();
        int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, verifyPasswordRequest.request_context) + verifyPasswordRequest.unknownFields().getSize$okio();
        zzkp zzkpVar = verifyPasswordRequest.input;
        if (zzkpVar instanceof VerifyPasswordRequest$Input$Password) {
            return ProtoAdapter.STRING.encodedSizeWithTag(2, ((VerifyPasswordRequest$Input$Password) zzkpVar).value) + encodedSizeWithTag;
        }
        if (zzkpVar instanceof VerifyPasswordRequest$Input$PasswordToken) {
            return ProtoAdapter.STRING.encodedSizeWithTag(3, ((VerifyPasswordRequest$Input$PasswordToken) zzkpVar).value) + encodedSizeWithTag;
        }
        if (zzkpVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyPasswordRequest verifyPasswordRequest = (VerifyPasswordRequest) obj;
        verifyPasswordRequest.getClass();
        RequestContext requestContext = verifyPasswordRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VerifyPasswordRequest(requestContext2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyPasswordRequest verifyPasswordRequest = (VerifyPasswordRequest) obj;
        verifyPasswordRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, verifyPasswordRequest.request_context);
        zzkp zzkpVar = verifyPasswordRequest.input;
        if (zzkpVar instanceof VerifyPasswordRequest$Input$Password) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ((VerifyPasswordRequest$Input$Password) zzkpVar).value);
        } else if (zzkpVar instanceof VerifyPasswordRequest$Input$PasswordToken) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ((VerifyPasswordRequest$Input$PasswordToken) zzkpVar).value);
        } else if (zzkpVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(verifyPasswordRequest.unknownFields());
    }
}
