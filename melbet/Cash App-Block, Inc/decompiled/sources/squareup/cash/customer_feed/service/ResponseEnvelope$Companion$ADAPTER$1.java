package squareup.cash.customer_feed.service;

import com.squareup.protos.cash.clientsync.serverpush.SyncEntitiesNudge;
import com.squareup.protos.cash.instantpay.api.serverpush.InstantPayoutAttempt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okhttp3.Cache;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class ResponseEnvelope$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Cache.Companion companion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ResponseEnvelope(companion, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                companion = new ResponseEnvelope$Type$Subscription((Subscription) Subscription.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                companion = new ResponseEnvelope$Type$Nudge((SyncEntitiesNudge) SyncEntitiesNudge.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                companion = new ResponseEnvelope$Type$Keepalive((KeepAlive) KeepAlive.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                companion = new ResponseEnvelope$Type$InstantPayoutAttempt((InstantPayoutAttempt) InstantPayoutAttempt.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) obj;
        reverseProtoWriter.getClass();
        responseEnvelope.getClass();
        reverseProtoWriter.writeBytes(responseEnvelope.unknownFields());
        Cache.Companion companion = responseEnvelope.f1636type;
        if (companion instanceof ResponseEnvelope$Type$Subscription) {
            Subscription.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ResponseEnvelope$Type$Subscription) companion).value);
            return;
        }
        if (companion instanceof ResponseEnvelope$Type$Nudge) {
            SyncEntitiesNudge.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ResponseEnvelope$Type$Nudge) companion).value);
            return;
        }
        if (companion instanceof ResponseEnvelope$Type$Keepalive) {
            KeepAlive.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ResponseEnvelope$Type$Keepalive) companion).getValue());
        } else if (companion instanceof ResponseEnvelope$Type$InstantPayoutAttempt) {
            InstantPayoutAttempt.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ResponseEnvelope$Type$InstantPayoutAttempt) companion).getValue());
        } else {
            if (companion == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) obj;
        responseEnvelope.getClass();
        int size$okio = responseEnvelope.unknownFields().getSize$okio();
        Cache.Companion companion = responseEnvelope.f1636type;
        if (companion instanceof ResponseEnvelope$Type$Subscription) {
            encodedSizeWithTag = Subscription.ADAPTER.encodedSizeWithTag(1, ((ResponseEnvelope$Type$Subscription) companion).value);
        } else if (companion instanceof ResponseEnvelope$Type$Nudge) {
            encodedSizeWithTag = SyncEntitiesNudge.ADAPTER.encodedSizeWithTag(2, ((ResponseEnvelope$Type$Nudge) companion).value);
        } else if (companion instanceof ResponseEnvelope$Type$Keepalive) {
            encodedSizeWithTag = KeepAlive.ADAPTER.encodedSizeWithTag(3, ((ResponseEnvelope$Type$Keepalive) companion).getValue());
        } else {
            if (!(companion instanceof ResponseEnvelope$Type$InstantPayoutAttempt)) {
                if (companion == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = InstantPayoutAttempt.ADAPTER.encodedSizeWithTag(5, ((ResponseEnvelope$Type$InstantPayoutAttempt) companion).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) obj;
        responseEnvelope.getClass();
        ByteString byteString = ByteString.EMPTY;
        Cache.Companion companion = responseEnvelope.f1636type;
        byteString.getClass();
        return new ResponseEnvelope(companion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) obj;
        responseEnvelope.getClass();
        Cache.Companion companion = responseEnvelope.f1636type;
        if (companion instanceof ResponseEnvelope$Type$Subscription) {
            Subscription.ADAPTER.encodeWithTag(protoWriter, 1, ((ResponseEnvelope$Type$Subscription) companion).value);
        } else if (companion instanceof ResponseEnvelope$Type$Nudge) {
            SyncEntitiesNudge.ADAPTER.encodeWithTag(protoWriter, 2, ((ResponseEnvelope$Type$Nudge) companion).value);
        } else if (companion instanceof ResponseEnvelope$Type$Keepalive) {
            KeepAlive.ADAPTER.encodeWithTag(protoWriter, 3, ((ResponseEnvelope$Type$Keepalive) companion).getValue());
        } else if (companion instanceof ResponseEnvelope$Type$InstantPayoutAttempt) {
            InstantPayoutAttempt.ADAPTER.encodeWithTag(protoWriter, 5, ((ResponseEnvelope$Type$InstantPayoutAttempt) companion).getValue());
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(responseEnvelope.unknownFields());
    }
}
