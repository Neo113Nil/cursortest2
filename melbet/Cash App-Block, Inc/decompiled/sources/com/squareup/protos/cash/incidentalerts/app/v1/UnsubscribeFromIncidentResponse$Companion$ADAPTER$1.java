package com.squareup.protos.cash.incidentalerts.app.v1;

import com.bumptech.glide.RegistryFactory;
import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UnsubscribeFromIncidentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        RegistryFactory registryFactory = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UnsubscribeFromIncidentResponse(registryFactory, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                registryFactory = new UnsubscribeFromIncidentResponse$Result$Success((UnsubscribeFromIncidentResponse.Success) UnsubscribeFromIncidentResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                registryFactory = new UnsubscribeFromIncidentResponse$Result$Failure((UnsubscribeFromIncidentResponse.Failure) UnsubscribeFromIncidentResponse.Failure.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UnsubscribeFromIncidentResponse unsubscribeFromIncidentResponse = (UnsubscribeFromIncidentResponse) obj;
        reverseProtoWriter.getClass();
        unsubscribeFromIncidentResponse.getClass();
        reverseProtoWriter.writeBytes(unsubscribeFromIncidentResponse.unknownFields());
        RegistryFactory registryFactory = unsubscribeFromIncidentResponse.result;
        if (registryFactory instanceof UnsubscribeFromIncidentResponse$Result$Success) {
            UnsubscribeFromIncidentResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((UnsubscribeFromIncidentResponse$Result$Success) registryFactory).value);
        } else if (registryFactory instanceof UnsubscribeFromIncidentResponse$Result$Failure) {
            UnsubscribeFromIncidentResponse.Failure.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((UnsubscribeFromIncidentResponse$Result$Failure) registryFactory).value);
        } else {
            if (registryFactory == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        UnsubscribeFromIncidentResponse unsubscribeFromIncidentResponse = (UnsubscribeFromIncidentResponse) obj;
        unsubscribeFromIncidentResponse.getClass();
        int size$okio = unsubscribeFromIncidentResponse.unknownFields().getSize$okio();
        RegistryFactory registryFactory = unsubscribeFromIncidentResponse.result;
        if (registryFactory instanceof UnsubscribeFromIncidentResponse$Result$Success) {
            encodedSizeWithTag = UnsubscribeFromIncidentResponse.Success.ADAPTER.encodedSizeWithTag(1, ((UnsubscribeFromIncidentResponse$Result$Success) registryFactory).value);
        } else {
            if (!(registryFactory instanceof UnsubscribeFromIncidentResponse$Result$Failure)) {
                if (registryFactory == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = UnsubscribeFromIncidentResponse.Failure.ADAPTER.encodedSizeWithTag(2, ((UnsubscribeFromIncidentResponse$Result$Failure) registryFactory).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UnsubscribeFromIncidentResponse unsubscribeFromIncidentResponse = (UnsubscribeFromIncidentResponse) obj;
        unsubscribeFromIncidentResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        RegistryFactory registryFactory = unsubscribeFromIncidentResponse.result;
        byteString.getClass();
        return new UnsubscribeFromIncidentResponse(registryFactory, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UnsubscribeFromIncidentResponse unsubscribeFromIncidentResponse = (UnsubscribeFromIncidentResponse) obj;
        unsubscribeFromIncidentResponse.getClass();
        RegistryFactory registryFactory = unsubscribeFromIncidentResponse.result;
        if (registryFactory instanceof UnsubscribeFromIncidentResponse$Result$Success) {
            UnsubscribeFromIncidentResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((UnsubscribeFromIncidentResponse$Result$Success) registryFactory).value);
        } else if (registryFactory instanceof UnsubscribeFromIncidentResponse$Result$Failure) {
            UnsubscribeFromIncidentResponse.Failure.ADAPTER.encodeWithTag(protoWriter, 2, ((UnsubscribeFromIncidentResponse$Result$Failure) registryFactory).value);
        } else if (registryFactory != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(unsubscribeFromIncidentResponse.unknownFields());
    }
}
