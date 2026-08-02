package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzis;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalBuyer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzis zzisVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalBuyer(zzisVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzisVar = new LocalBuyer$LocalBuyer$LocalBuyerAccount((LocalBuyer.LocalBuyerAccount) LocalBuyer.LocalBuyerAccount.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzisVar = new LocalBuyer$LocalBuyer$LocalBuyerGuest((LocalBuyer.LocalBuyerGuest) LocalBuyer.LocalBuyerGuest.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalBuyer localBuyer = (LocalBuyer) obj;
        reverseProtoWriter.getClass();
        localBuyer.getClass();
        reverseProtoWriter.writeBytes(localBuyer.unknownFields());
        zzis zzisVar = localBuyer.local_buyer;
        if (zzisVar instanceof LocalBuyer$LocalBuyer$LocalBuyerAccount) {
            LocalBuyer.LocalBuyerAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((LocalBuyer$LocalBuyer$LocalBuyerAccount) zzisVar).value);
        } else if (zzisVar instanceof LocalBuyer$LocalBuyer$LocalBuyerGuest) {
            LocalBuyer.LocalBuyerGuest.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((LocalBuyer$LocalBuyer$LocalBuyerGuest) zzisVar).value);
        } else {
            if (zzisVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LocalBuyer localBuyer = (LocalBuyer) obj;
        localBuyer.getClass();
        int size$okio = localBuyer.unknownFields().getSize$okio();
        zzis zzisVar = localBuyer.local_buyer;
        if (zzisVar instanceof LocalBuyer$LocalBuyer$LocalBuyerAccount) {
            encodedSizeWithTag = LocalBuyer.LocalBuyerAccount.ADAPTER.encodedSizeWithTag(1, ((LocalBuyer$LocalBuyer$LocalBuyerAccount) zzisVar).value);
        } else {
            if (!(zzisVar instanceof LocalBuyer$LocalBuyer$LocalBuyerGuest)) {
                if (zzisVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalBuyer.LocalBuyerGuest.ADAPTER.encodedSizeWithTag(2, ((LocalBuyer$LocalBuyer$LocalBuyerGuest) zzisVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalBuyer localBuyer = (LocalBuyer) obj;
        localBuyer.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzis zzisVar = localBuyer.local_buyer;
        byteString.getClass();
        return new LocalBuyer(zzisVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalBuyer localBuyer = (LocalBuyer) obj;
        localBuyer.getClass();
        zzis zzisVar = localBuyer.local_buyer;
        if (zzisVar instanceof LocalBuyer$LocalBuyer$LocalBuyerAccount) {
            LocalBuyer.LocalBuyerAccount.ADAPTER.encodeWithTag(protoWriter, 1, ((LocalBuyer$LocalBuyer$LocalBuyerAccount) zzisVar).value);
        } else if (zzisVar instanceof LocalBuyer$LocalBuyer$LocalBuyerGuest) {
            LocalBuyer.LocalBuyerGuest.ADAPTER.encodeWithTag(protoWriter, 2, ((LocalBuyer$LocalBuyer$LocalBuyerGuest) zzisVar).value);
        } else if (zzisVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(localBuyer.unknownFields());
    }
}
