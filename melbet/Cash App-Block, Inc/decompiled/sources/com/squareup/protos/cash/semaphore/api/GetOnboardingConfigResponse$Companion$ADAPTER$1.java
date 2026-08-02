package com.squareup.protos.cash.semaphore.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetOnboardingConfigResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetOnboardingConfigResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                m.add(FeatureFlag.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetOnboardingConfigResponse getOnboardingConfigResponse = (GetOnboardingConfigResponse) obj;
        reverseProtoWriter.getClass();
        getOnboardingConfigResponse.getClass();
        reverseProtoWriter.writeBytes(getOnboardingConfigResponse.unknownFields());
        FeatureFlag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getOnboardingConfigResponse.feature_flags);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetOnboardingConfigResponse getOnboardingConfigResponse = (GetOnboardingConfigResponse) obj;
        getOnboardingConfigResponse.getClass();
        return FeatureFlag.ADAPTER.asRepeated().encodedSizeWithTag(2, getOnboardingConfigResponse.feature_flags) + getOnboardingConfigResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetOnboardingConfigResponse getOnboardingConfigResponse = (GetOnboardingConfigResponse) obj;
        getOnboardingConfigResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getOnboardingConfigResponse.feature_flags, FeatureFlag.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetOnboardingConfigResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetOnboardingConfigResponse getOnboardingConfigResponse = (GetOnboardingConfigResponse) obj;
        getOnboardingConfigResponse.getClass();
        FeatureFlag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getOnboardingConfigResponse.feature_flags);
        protoWriter.writeBytes(getOnboardingConfigResponse.unknownFields());
    }
}
