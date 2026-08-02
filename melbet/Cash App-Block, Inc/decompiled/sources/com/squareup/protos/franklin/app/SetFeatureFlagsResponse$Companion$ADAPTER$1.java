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
public final class SetFeatureFlagsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetFeatureFlagsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SetFeatureFlagsResponse setFeatureFlagsResponse = (SetFeatureFlagsResponse) obj;
        reverseProtoWriter.getClass();
        setFeatureFlagsResponse.getClass();
        reverseProtoWriter.writeBytes(setFeatureFlagsResponse.unknownFields());
        FeatureFlag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, setFeatureFlagsResponse.feature_flags);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetFeatureFlagsResponse setFeatureFlagsResponse = (SetFeatureFlagsResponse) obj;
        setFeatureFlagsResponse.getClass();
        return FeatureFlag.ADAPTER.asRepeated().encodedSizeWithTag(1, setFeatureFlagsResponse.feature_flags) + setFeatureFlagsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetFeatureFlagsResponse setFeatureFlagsResponse = (SetFeatureFlagsResponse) obj;
        setFeatureFlagsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(setFeatureFlagsResponse.feature_flags, FeatureFlag.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetFeatureFlagsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetFeatureFlagsResponse setFeatureFlagsResponse = (SetFeatureFlagsResponse) obj;
        setFeatureFlagsResponse.getClass();
        FeatureFlag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, setFeatureFlagsResponse.feature_flags);
        protoWriter.writeBytes(setFeatureFlagsResponse.unknownFields());
    }
}
