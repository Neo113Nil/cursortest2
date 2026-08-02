package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FeatureContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FeatureContext((MoneybotContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(MoneybotContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FeatureContext featureContext = (FeatureContext) obj;
        reverseProtoWriter.getClass();
        featureContext.getClass();
        reverseProtoWriter.writeBytes(featureContext.unknownFields());
        MoneybotContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, featureContext.moneybot_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FeatureContext featureContext = (FeatureContext) obj;
        featureContext.getClass();
        return MoneybotContext.ADAPTER.encodedSizeWithTag(1, featureContext.moneybot_context) + featureContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FeatureContext featureContext = (FeatureContext) obj;
        featureContext.getClass();
        MoneybotContext moneybotContext = featureContext.moneybot_context;
        MoneybotContext moneybotContext2 = moneybotContext != null ? (MoneybotContext) MoneybotContext.ADAPTER.redact(moneybotContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FeatureContext(moneybotContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FeatureContext featureContext = (FeatureContext) obj;
        featureContext.getClass();
        MoneybotContext.ADAPTER.encodeWithTag(protoWriter, 1, featureContext.moneybot_context);
        protoWriter.writeBytes(featureContext.unknownFields());
    }
}
