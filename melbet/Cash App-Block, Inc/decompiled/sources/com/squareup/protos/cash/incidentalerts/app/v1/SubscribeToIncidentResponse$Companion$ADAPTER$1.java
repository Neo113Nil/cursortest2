package com.squareup.protos.cash.incidentalerts.app.v1;

import com.bugsnag.android.internal.StringUtils;
import com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SubscribeToIncidentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        StringUtils stringUtils = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubscribeToIncidentResponse(stringUtils, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                stringUtils = new SubscribeToIncidentResponse$Result$Success((SubscribeToIncidentResponse.Success) SubscribeToIncidentResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                stringUtils = new SubscribeToIncidentResponse$Result$Failure((SubscribeToIncidentResponse.Failure) SubscribeToIncidentResponse.Failure.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubscribeToIncidentResponse subscribeToIncidentResponse = (SubscribeToIncidentResponse) obj;
        reverseProtoWriter.getClass();
        subscribeToIncidentResponse.getClass();
        reverseProtoWriter.writeBytes(subscribeToIncidentResponse.unknownFields());
        StringUtils stringUtils = subscribeToIncidentResponse.result;
        if (stringUtils instanceof SubscribeToIncidentResponse$Result$Success) {
            SubscribeToIncidentResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SubscribeToIncidentResponse$Result$Success) stringUtils).value);
        } else if (stringUtils instanceof SubscribeToIncidentResponse$Result$Failure) {
            SubscribeToIncidentResponse.Failure.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SubscribeToIncidentResponse$Result$Failure) stringUtils).value);
        } else {
            if (stringUtils == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SubscribeToIncidentResponse subscribeToIncidentResponse = (SubscribeToIncidentResponse) obj;
        subscribeToIncidentResponse.getClass();
        int size$okio = subscribeToIncidentResponse.unknownFields().getSize$okio();
        StringUtils stringUtils = subscribeToIncidentResponse.result;
        if (stringUtils instanceof SubscribeToIncidentResponse$Result$Success) {
            encodedSizeWithTag = SubscribeToIncidentResponse.Success.ADAPTER.encodedSizeWithTag(1, ((SubscribeToIncidentResponse$Result$Success) stringUtils).value);
        } else {
            if (!(stringUtils instanceof SubscribeToIncidentResponse$Result$Failure)) {
                if (stringUtils == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SubscribeToIncidentResponse.Failure.ADAPTER.encodedSizeWithTag(2, ((SubscribeToIncidentResponse$Result$Failure) stringUtils).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubscribeToIncidentResponse subscribeToIncidentResponse = (SubscribeToIncidentResponse) obj;
        subscribeToIncidentResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        StringUtils stringUtils = subscribeToIncidentResponse.result;
        byteString.getClass();
        return new SubscribeToIncidentResponse(stringUtils, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubscribeToIncidentResponse subscribeToIncidentResponse = (SubscribeToIncidentResponse) obj;
        subscribeToIncidentResponse.getClass();
        StringUtils stringUtils = subscribeToIncidentResponse.result;
        if (stringUtils instanceof SubscribeToIncidentResponse$Result$Success) {
            SubscribeToIncidentResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((SubscribeToIncidentResponse$Result$Success) stringUtils).value);
        } else if (stringUtils instanceof SubscribeToIncidentResponse$Result$Failure) {
            SubscribeToIncidentResponse.Failure.ADAPTER.encodeWithTag(protoWriter, 2, ((SubscribeToIncidentResponse$Result$Failure) stringUtils).value);
        } else if (stringUtils != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(subscribeToIncidentResponse.unknownFields());
    }
}
