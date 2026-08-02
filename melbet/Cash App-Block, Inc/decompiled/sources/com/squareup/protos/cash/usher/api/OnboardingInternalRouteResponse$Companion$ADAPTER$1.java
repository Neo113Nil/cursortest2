package com.squareup.protos.cash.usher.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.usher.api.OnboardingInternalRouteResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OnboardingInternalRouteResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new OnboardingInternalRouteResponse((OnboardingInternalRouteResponse.Instruction) obj, (String) obj2, (ResponseContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = OnboardingInternalRouteResponse.Instruction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OnboardingInternalRouteResponse onboardingInternalRouteResponse = (OnboardingInternalRouteResponse) obj;
        reverseProtoWriter.getClass();
        onboardingInternalRouteResponse.getClass();
        reverseProtoWriter.writeBytes(onboardingInternalRouteResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, onboardingInternalRouteResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, onboardingInternalRouteResponse.internal_navigation_url);
        OnboardingInternalRouteResponse.Instruction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, onboardingInternalRouteResponse.instruction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OnboardingInternalRouteResponse onboardingInternalRouteResponse = (OnboardingInternalRouteResponse) obj;
        onboardingInternalRouteResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(3, onboardingInternalRouteResponse.response_context) + ProtoAdapter.STRING.encodedSizeWithTag(2, onboardingInternalRouteResponse.internal_navigation_url) + OnboardingInternalRouteResponse.Instruction.ADAPTER.encodedSizeWithTag(1, onboardingInternalRouteResponse.instruction) + onboardingInternalRouteResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OnboardingInternalRouteResponse onboardingInternalRouteResponse = (OnboardingInternalRouteResponse) obj;
        onboardingInternalRouteResponse.getClass();
        ResponseContext responseContext = onboardingInternalRouteResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        OnboardingInternalRouteResponse.Instruction instruction = onboardingInternalRouteResponse.instruction;
        String str = onboardingInternalRouteResponse.internal_navigation_url;
        byteString.getClass();
        return new OnboardingInternalRouteResponse(instruction, str, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OnboardingInternalRouteResponse onboardingInternalRouteResponse = (OnboardingInternalRouteResponse) obj;
        onboardingInternalRouteResponse.getClass();
        OnboardingInternalRouteResponse.Instruction.ADAPTER.encodeWithTag(protoWriter, 1, onboardingInternalRouteResponse.instruction);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, onboardingInternalRouteResponse.internal_navigation_url);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, onboardingInternalRouteResponse.response_context);
        protoWriter.writeBytes(onboardingInternalRouteResponse.unknownFields());
    }
}
