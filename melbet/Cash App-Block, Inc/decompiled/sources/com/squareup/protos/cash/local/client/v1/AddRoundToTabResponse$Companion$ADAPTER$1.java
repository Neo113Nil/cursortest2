package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.internal.metrics.RemovalReason;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AddRoundToTabResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        RemovalReason removalReason = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddRoundToTabResponse(removalReason, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                removalReason = new AddRoundToTabResponse$Response$Success((AddRoundToTabResponse.Success) AddRoundToTabResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                removalReason = new AddRoundToTabResponse$Response$Error((AddRoundToTabResponse.Error) AddRoundToTabResponse.Error.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddRoundToTabResponse addRoundToTabResponse = (AddRoundToTabResponse) obj;
        reverseProtoWriter.getClass();
        addRoundToTabResponse.getClass();
        reverseProtoWriter.writeBytes(addRoundToTabResponse.unknownFields());
        RemovalReason removalReason = addRoundToTabResponse.response;
        if (removalReason instanceof AddRoundToTabResponse$Response$Success) {
            AddRoundToTabResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AddRoundToTabResponse$Response$Success) removalReason).value);
        } else if (removalReason instanceof AddRoundToTabResponse$Response$Error) {
            AddRoundToTabResponse.Error.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AddRoundToTabResponse$Response$Error) removalReason).value);
        } else {
            if (removalReason == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AddRoundToTabResponse addRoundToTabResponse = (AddRoundToTabResponse) obj;
        addRoundToTabResponse.getClass();
        int size$okio = addRoundToTabResponse.unknownFields().getSize$okio();
        RemovalReason removalReason = addRoundToTabResponse.response;
        if (removalReason instanceof AddRoundToTabResponse$Response$Success) {
            encodedSizeWithTag = AddRoundToTabResponse.Success.ADAPTER.encodedSizeWithTag(1, ((AddRoundToTabResponse$Response$Success) removalReason).value);
        } else {
            if (!(removalReason instanceof AddRoundToTabResponse$Response$Error)) {
                if (removalReason == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = AddRoundToTabResponse.Error.ADAPTER.encodedSizeWithTag(2, ((AddRoundToTabResponse$Response$Error) removalReason).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddRoundToTabResponse addRoundToTabResponse = (AddRoundToTabResponse) obj;
        addRoundToTabResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        RemovalReason removalReason = addRoundToTabResponse.response;
        byteString.getClass();
        return new AddRoundToTabResponse(removalReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddRoundToTabResponse addRoundToTabResponse = (AddRoundToTabResponse) obj;
        addRoundToTabResponse.getClass();
        RemovalReason removalReason = addRoundToTabResponse.response;
        if (removalReason instanceof AddRoundToTabResponse$Response$Success) {
            AddRoundToTabResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((AddRoundToTabResponse$Response$Success) removalReason).value);
        } else if (removalReason instanceof AddRoundToTabResponse$Response$Error) {
            AddRoundToTabResponse.Error.ADAPTER.encodeWithTag(protoWriter, 2, ((AddRoundToTabResponse$Response$Error) removalReason).value);
        } else if (removalReason != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(addRoundToTabResponse.unknownFields());
    }
}
