package com.squareup.protos.multipass.service;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzjo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClientCredentials$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjo zzjoVar = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientCredentials(zzjoVar, (DeviceDetails) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzjoVar = new ClientCredentials$Session$SessionId((ClientSessionToken) ClientSessionToken.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(DeviceDetails.ADAPTER, protoReader, obj);
            } else if (nextTag == 4) {
                zzjoVar = new ClientCredentials$Session$Cookie((ClientSessionCookie) ClientSessionCookie.ADAPTER.decode(protoReader));
            } else if (nextTag == 5) {
                zzjoVar = new ClientCredentials$Session$Headers((SessionHeaders) SessionHeaders.ADAPTER.decode(protoReader));
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjoVar = new ClientCredentials$Session$AccessToken((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientCredentials clientCredentials = (ClientCredentials) obj;
        reverseProtoWriter.getClass();
        clientCredentials.getClass();
        reverseProtoWriter.writeBytes(clientCredentials.unknownFields());
        zzjo zzjoVar = clientCredentials.session;
        if (zzjoVar instanceof ClientCredentials$Session$Cookie) {
            ClientSessionCookie.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ClientCredentials$Session$Cookie) zzjoVar).value);
        } else if (zzjoVar instanceof ClientCredentials$Session$SessionId) {
            ClientSessionToken.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ClientCredentials$Session$SessionId) zzjoVar).value);
        } else if (zzjoVar instanceof ClientCredentials$Session$Headers) {
            SessionHeaders.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ClientCredentials$Session$Headers) zzjoVar).value);
        } else if (zzjoVar instanceof ClientCredentials$Session$AccessToken) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, ((ClientCredentials$Session$AccessToken) zzjoVar).value);
        } else if (zzjoVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        DeviceDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 2, clientCredentials.device_details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ClientCredentials clientCredentials = (ClientCredentials) obj;
        clientCredentials.getClass();
        int size$okio = clientCredentials.unknownFields().getSize$okio();
        zzjo zzjoVar = clientCredentials.session;
        if (zzjoVar instanceof ClientCredentials$Session$Cookie) {
            encodedSizeWithTag = ClientSessionCookie.ADAPTER.encodedSizeWithTag(4, ((ClientCredentials$Session$Cookie) zzjoVar).value);
        } else if (zzjoVar instanceof ClientCredentials$Session$SessionId) {
            encodedSizeWithTag = ClientSessionToken.ADAPTER.encodedSizeWithTag(1, ((ClientCredentials$Session$SessionId) zzjoVar).value);
        } else if (zzjoVar instanceof ClientCredentials$Session$Headers) {
            encodedSizeWithTag = SessionHeaders.ADAPTER.encodedSizeWithTag(5, ((ClientCredentials$Session$Headers) zzjoVar).value);
        } else {
            if (!(zzjoVar instanceof ClientCredentials$Session$AccessToken)) {
                if (zzjoVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return DeviceDetails.ADAPTER.encodedSizeWithTag(2, clientCredentials.device_details) + size$okio;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(6, ((ClientCredentials$Session$AccessToken) zzjoVar).value);
        }
        size$okio += encodedSizeWithTag;
        return DeviceDetails.ADAPTER.encodedSizeWithTag(2, clientCredentials.device_details) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientCredentials clientCredentials = (ClientCredentials) obj;
        clientCredentials.getClass();
        DeviceDetails deviceDetails = clientCredentials.device_details;
        DeviceDetails deviceDetails2 = deviceDetails != null ? (DeviceDetails) DeviceDetails.ADAPTER.redact(deviceDetails) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ClientCredentials(null, deviceDetails2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientCredentials clientCredentials = (ClientCredentials) obj;
        clientCredentials.getClass();
        DeviceDetails.ADAPTER.encodeWithTag(protoWriter, 2, clientCredentials.device_details);
        zzjo zzjoVar = clientCredentials.session;
        if (zzjoVar instanceof ClientCredentials$Session$Cookie) {
            ClientSessionCookie.ADAPTER.encodeWithTag(protoWriter, 4, ((ClientCredentials$Session$Cookie) zzjoVar).value);
        } else if (zzjoVar instanceof ClientCredentials$Session$SessionId) {
            ClientSessionToken.ADAPTER.encodeWithTag(protoWriter, 1, ((ClientCredentials$Session$SessionId) zzjoVar).value);
        } else if (zzjoVar instanceof ClientCredentials$Session$Headers) {
            SessionHeaders.ADAPTER.encodeWithTag(protoWriter, 5, ((ClientCredentials$Session$Headers) zzjoVar).value);
        } else if (zzjoVar instanceof ClientCredentials$Session$AccessToken) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, ((ClientCredentials$Session$AccessToken) zzjoVar).value);
        } else if (zzjoVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(clientCredentials.unknownFields());
    }
}
