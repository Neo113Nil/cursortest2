package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import com.squareup.protos.cash.cashbusinessaccounts.api.v1.KybUseCase;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class C4BOnboardingFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new C4BOnboardingFlowParameters((C4BOnboardingFlowParameters.EntryPoint) obj, (String) obj2, (KybUseCase) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = C4BOnboardingFlowParameters.EntryPoint.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = KybUseCase.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        C4BOnboardingFlowParameters c4BOnboardingFlowParameters = (C4BOnboardingFlowParameters) obj;
        reverseProtoWriter.getClass();
        c4BOnboardingFlowParameters.getClass();
        reverseProtoWriter.writeBytes(c4BOnboardingFlowParameters.unknownFields());
        KybUseCase.ADAPTER.encodeWithTag(reverseProtoWriter, 3, c4BOnboardingFlowParameters.kyb_use_case);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, c4BOnboardingFlowParameters.referrer_flow_token);
        C4BOnboardingFlowParameters.EntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 1, c4BOnboardingFlowParameters.entry_point);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        C4BOnboardingFlowParameters c4BOnboardingFlowParameters = (C4BOnboardingFlowParameters) obj;
        c4BOnboardingFlowParameters.getClass();
        return KybUseCase.ADAPTER.encodedSizeWithTag(3, c4BOnboardingFlowParameters.kyb_use_case) + ProtoAdapter.STRING.encodedSizeWithTag(2, c4BOnboardingFlowParameters.referrer_flow_token) + C4BOnboardingFlowParameters.EntryPoint.ADAPTER.encodedSizeWithTag(1, c4BOnboardingFlowParameters.entry_point) + c4BOnboardingFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        C4BOnboardingFlowParameters c4BOnboardingFlowParameters = (C4BOnboardingFlowParameters) obj;
        c4BOnboardingFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        C4BOnboardingFlowParameters.EntryPoint entryPoint = c4BOnboardingFlowParameters.entry_point;
        KybUseCase kybUseCase = c4BOnboardingFlowParameters.kyb_use_case;
        byteString.getClass();
        return new C4BOnboardingFlowParameters(entryPoint, null, kybUseCase, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        C4BOnboardingFlowParameters c4BOnboardingFlowParameters = (C4BOnboardingFlowParameters) obj;
        c4BOnboardingFlowParameters.getClass();
        C4BOnboardingFlowParameters.EntryPoint.ADAPTER.encodeWithTag(protoWriter, 1, c4BOnboardingFlowParameters.entry_point);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c4BOnboardingFlowParameters.referrer_flow_token);
        KybUseCase.ADAPTER.encodeWithTag(protoWriter, 3, c4BOnboardingFlowParameters.kyb_use_case);
        protoWriter.writeBytes(c4BOnboardingFlowParameters.unknownFields());
    }
}
