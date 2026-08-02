package com.squareup.protos.cash.security.mri.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class MRIContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MRIContext((Identifiers) obj, (Signals) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Identifiers.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Signals.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MRIContext mRIContext = (MRIContext) obj;
        reverseProtoWriter.getClass();
        mRIContext.getClass();
        reverseProtoWriter.writeBytes(mRIContext.unknownFields());
        Signals.ADAPTER.encodeWithTag(reverseProtoWriter, 2, mRIContext.signals);
        Identifiers.ADAPTER.encodeWithTag(reverseProtoWriter, 1, mRIContext.identifiers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MRIContext mRIContext = (MRIContext) obj;
        mRIContext.getClass();
        return Signals.ADAPTER.encodedSizeWithTag(2, mRIContext.signals) + Identifiers.ADAPTER.encodedSizeWithTag(1, mRIContext.identifiers) + mRIContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MRIContext mRIContext = (MRIContext) obj;
        mRIContext.getClass();
        Identifiers identifiers = mRIContext.identifiers;
        Identifiers identifiers2 = identifiers != null ? (Identifiers) Identifiers.ADAPTER.redact(identifiers) : null;
        Signals signals = mRIContext.signals;
        Signals signals2 = signals != null ? (Signals) Signals.ADAPTER.redact(signals) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MRIContext(identifiers2, signals2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MRIContext mRIContext = (MRIContext) obj;
        mRIContext.getClass();
        Identifiers.ADAPTER.encodeWithTag(protoWriter, 1, mRIContext.identifiers);
        Signals.ADAPTER.encodeWithTag(protoWriter, 2, mRIContext.signals);
        protoWriter.writeBytes(mRIContext.unknownFields());
    }
}
