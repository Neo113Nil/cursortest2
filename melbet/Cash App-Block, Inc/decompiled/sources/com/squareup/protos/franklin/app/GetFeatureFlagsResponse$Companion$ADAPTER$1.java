package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetFeatureFlagsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetFeatureFlagsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(FeatureFlag.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFeatureFlagsResponse getFeatureFlagsResponse = (GetFeatureFlagsResponse) obj;
        reverseProtoWriter.getClass();
        getFeatureFlagsResponse.getClass();
        reverseProtoWriter.writeBytes(getFeatureFlagsResponse.unknownFields());
        FeatureFlag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getFeatureFlagsResponse.feature_flags);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetFeatureFlagsResponse getFeatureFlagsResponse = (GetFeatureFlagsResponse) obj;
        getFeatureFlagsResponse.getClass();
        return FeatureFlag.ADAPTER.asRepeated().encodedSizeWithTag(1, getFeatureFlagsResponse.feature_flags) + getFeatureFlagsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFeatureFlagsResponse getFeatureFlagsResponse = (GetFeatureFlagsResponse) obj;
        getFeatureFlagsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getFeatureFlagsResponse.feature_flags, FeatureFlag.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetFeatureFlagsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFeatureFlagsResponse getFeatureFlagsResponse = (GetFeatureFlagsResponse) obj;
        getFeatureFlagsResponse.getClass();
        FeatureFlag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getFeatureFlagsResponse.feature_flags);
        protoWriter.writeBytes(getFeatureFlagsResponse.unknownFields());
    }
}
