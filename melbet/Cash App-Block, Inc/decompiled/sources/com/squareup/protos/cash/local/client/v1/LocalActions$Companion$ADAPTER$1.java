package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalActions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalActions((LocalActionOrdering) obj, (LocalActionP2P) obj2, (LocalActionRedemption) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalActionOrdering.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalActionP2P.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalActionRedemption.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalActions localActions = (LocalActions) obj;
        reverseProtoWriter.getClass();
        localActions.getClass();
        reverseProtoWriter.writeBytes(localActions.unknownFields());
        LocalActionRedemption.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localActions.redemption);
        LocalActionP2P.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localActions.p2p);
        LocalActionOrdering.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localActions.ordering);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalActions localActions = (LocalActions) obj;
        localActions.getClass();
        return LocalActionRedemption.ADAPTER.encodedSizeWithTag(3, localActions.redemption) + LocalActionP2P.ADAPTER.encodedSizeWithTag(2, localActions.p2p) + LocalActionOrdering.ADAPTER.encodedSizeWithTag(1, localActions.ordering) + localActions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalActions localActions = (LocalActions) obj;
        localActions.getClass();
        LocalActionOrdering localActionOrdering = localActions.ordering;
        LocalActionOrdering localActionOrdering2 = localActionOrdering != null ? (LocalActionOrdering) LocalActionOrdering.ADAPTER.redact(localActionOrdering) : null;
        LocalActionP2P localActionP2P = localActions.p2p;
        LocalActionP2P localActionP2P2 = localActionP2P != null ? (LocalActionP2P) LocalActionP2P.ADAPTER.redact(localActionP2P) : null;
        LocalActionRedemption localActionRedemption = localActions.redemption;
        LocalActionRedemption localActionRedemption2 = localActionRedemption != null ? (LocalActionRedemption) LocalActionRedemption.ADAPTER.redact(localActionRedemption) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalActions(localActionOrdering2, localActionP2P2, localActionRedemption2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalActions localActions = (LocalActions) obj;
        localActions.getClass();
        LocalActionOrdering.ADAPTER.encodeWithTag(protoWriter, 1, localActions.ordering);
        LocalActionP2P.ADAPTER.encodeWithTag(protoWriter, 2, localActions.p2p);
        LocalActionRedemption.ADAPTER.encodeWithTag(protoWriter, 3, localActions.redemption);
        protoWriter.writeBytes(localActions.unknownFields());
    }
}
