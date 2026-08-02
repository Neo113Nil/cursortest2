package com.squareup.protos.cash.taply.app.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzlr;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProvisioningEligibility$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzlr zzlrVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProvisioningEligibility(zzlrVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzlrVar = new ProvisioningEligibility$Decision$Allowed((Allowed) Allowed.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzlrVar = new ProvisioningEligibility$Decision$Denied((Denied) Denied.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProvisioningEligibility provisioningEligibility = (ProvisioningEligibility) obj;
        reverseProtoWriter.getClass();
        provisioningEligibility.getClass();
        reverseProtoWriter.writeBytes(provisioningEligibility.unknownFields());
        zzlr zzlrVar = provisioningEligibility.decision;
        if (zzlrVar instanceof ProvisioningEligibility$Decision$Allowed) {
            Allowed.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ProvisioningEligibility$Decision$Allowed) zzlrVar).value);
        } else if (zzlrVar instanceof ProvisioningEligibility$Decision$Denied) {
            Denied.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ProvisioningEligibility$Decision$Denied) zzlrVar).value);
        } else {
            if (zzlrVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ProvisioningEligibility provisioningEligibility = (ProvisioningEligibility) obj;
        provisioningEligibility.getClass();
        int size$okio = provisioningEligibility.unknownFields().getSize$okio();
        zzlr zzlrVar = provisioningEligibility.decision;
        if (zzlrVar instanceof ProvisioningEligibility$Decision$Allowed) {
            encodedSizeWithTag = Allowed.ADAPTER.encodedSizeWithTag(1, ((ProvisioningEligibility$Decision$Allowed) zzlrVar).value);
        } else {
            if (!(zzlrVar instanceof ProvisioningEligibility$Decision$Denied)) {
                if (zzlrVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Denied.ADAPTER.encodedSizeWithTag(2, ((ProvisioningEligibility$Decision$Denied) zzlrVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProvisioningEligibility provisioningEligibility = (ProvisioningEligibility) obj;
        provisioningEligibility.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzlr zzlrVar = provisioningEligibility.decision;
        byteString.getClass();
        return new ProvisioningEligibility(zzlrVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProvisioningEligibility provisioningEligibility = (ProvisioningEligibility) obj;
        provisioningEligibility.getClass();
        zzlr zzlrVar = provisioningEligibility.decision;
        if (zzlrVar instanceof ProvisioningEligibility$Decision$Allowed) {
            Allowed.ADAPTER.encodeWithTag(protoWriter, 1, ((ProvisioningEligibility$Decision$Allowed) zzlrVar).value);
        } else if (zzlrVar instanceof ProvisioningEligibility$Decision$Denied) {
            Denied.ADAPTER.encodeWithTag(protoWriter, 2, ((ProvisioningEligibility$Decision$Denied) zzlrVar).value);
        } else if (zzlrVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(provisioningEligibility.unknownFields());
    }
}
