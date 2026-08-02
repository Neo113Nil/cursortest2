package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzde;
import com.squareup.protos.franklin.app.P2pInstrumentSelectionRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class P2pInstrumentSelectionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzde zzdeVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new P2pInstrumentSelectionRequest((RequestContext) obj, zzdeVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                zzdeVar = new P2pInstrumentSelectionRequest$Option$Existing((P2pInstrumentSelectionRequest.ExistingInstrumentOption) P2pInstrumentSelectionRequest.ExistingInstrumentOption.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzdeVar = new P2pInstrumentSelectionRequest$Option$NewLinkOption((P2pInstrumentSelectionRequest.NewLinkOption) P2pInstrumentSelectionRequest.NewLinkOption.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        P2pInstrumentSelectionRequest p2pInstrumentSelectionRequest = (P2pInstrumentSelectionRequest) obj;
        reverseProtoWriter.getClass();
        p2pInstrumentSelectionRequest.getClass();
        reverseProtoWriter.writeBytes(p2pInstrumentSelectionRequest.unknownFields());
        zzde zzdeVar = p2pInstrumentSelectionRequest.option;
        if (zzdeVar instanceof P2pInstrumentSelectionRequest$Option$Existing) {
            P2pInstrumentSelectionRequest.ExistingInstrumentOption.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((P2pInstrumentSelectionRequest$Option$Existing) zzdeVar).value);
        } else if (zzdeVar instanceof P2pInstrumentSelectionRequest$Option$NewLinkOption) {
            P2pInstrumentSelectionRequest.NewLinkOption.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((P2pInstrumentSelectionRequest$Option$NewLinkOption) zzdeVar).value);
        } else if (zzdeVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, p2pInstrumentSelectionRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2pInstrumentSelectionRequest p2pInstrumentSelectionRequest = (P2pInstrumentSelectionRequest) obj;
        p2pInstrumentSelectionRequest.getClass();
        int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, p2pInstrumentSelectionRequest.request_context) + p2pInstrumentSelectionRequest.unknownFields().getSize$okio();
        zzde zzdeVar = p2pInstrumentSelectionRequest.option;
        if (zzdeVar instanceof P2pInstrumentSelectionRequest$Option$Existing) {
            return P2pInstrumentSelectionRequest.ExistingInstrumentOption.ADAPTER.encodedSizeWithTag(2, ((P2pInstrumentSelectionRequest$Option$Existing) zzdeVar).value) + encodedSizeWithTag;
        }
        if (zzdeVar instanceof P2pInstrumentSelectionRequest$Option$NewLinkOption) {
            return P2pInstrumentSelectionRequest.NewLinkOption.ADAPTER.encodedSizeWithTag(3, ((P2pInstrumentSelectionRequest$Option$NewLinkOption) zzdeVar).value) + encodedSizeWithTag;
        }
        if (zzdeVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2pInstrumentSelectionRequest p2pInstrumentSelectionRequest = (P2pInstrumentSelectionRequest) obj;
        p2pInstrumentSelectionRequest.getClass();
        RequestContext requestContext = p2pInstrumentSelectionRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        zzde zzdeVar = p2pInstrumentSelectionRequest.option;
        byteString.getClass();
        return new P2pInstrumentSelectionRequest(requestContext2, zzdeVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2pInstrumentSelectionRequest p2pInstrumentSelectionRequest = (P2pInstrumentSelectionRequest) obj;
        p2pInstrumentSelectionRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, p2pInstrumentSelectionRequest.request_context);
        zzde zzdeVar = p2pInstrumentSelectionRequest.option;
        if (zzdeVar instanceof P2pInstrumentSelectionRequest$Option$Existing) {
            P2pInstrumentSelectionRequest.ExistingInstrumentOption.ADAPTER.encodeWithTag(protoWriter, 2, ((P2pInstrumentSelectionRequest$Option$Existing) zzdeVar).value);
        } else if (zzdeVar instanceof P2pInstrumentSelectionRequest$Option$NewLinkOption) {
            P2pInstrumentSelectionRequest.NewLinkOption.ADAPTER.encodeWithTag(protoWriter, 3, ((P2pInstrumentSelectionRequest$Option$NewLinkOption) zzdeVar).value);
        } else if (zzdeVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(p2pInstrumentSelectionRequest.unknownFields());
    }
}
