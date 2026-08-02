package com.squareup.protos.cash.postbank.api;

import android.os.Parcelable;
import com.squareup.protos.cash.postcard.CopyCardNumber;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class InitiateDirectDepositSetupFlowRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateDirectDepositSetupFlowRequest> CREATOR;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateDirectDepositSetupFlowRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.postbank.api.InitiateDirectDepositSetupFlowRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new InitiateDirectDepositSetupFlowRequest(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    protoReader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateDirectDepositSetupFlowRequest initiateDirectDepositSetupFlowRequest = (InitiateDirectDepositSetupFlowRequest) obj;
                reverseProtoWriter.getClass();
                initiateDirectDepositSetupFlowRequest.getClass();
                reverseProtoWriter.writeBytes(initiateDirectDepositSetupFlowRequest.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InitiateDirectDepositSetupFlowRequest initiateDirectDepositSetupFlowRequest = (InitiateDirectDepositSetupFlowRequest) obj;
                initiateDirectDepositSetupFlowRequest.getClass();
                return initiateDirectDepositSetupFlowRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((InitiateDirectDepositSetupFlowRequest) obj).getClass();
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new InitiateDirectDepositSetupFlowRequest(byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateDirectDepositSetupFlowRequest initiateDirectDepositSetupFlowRequest = (InitiateDirectDepositSetupFlowRequest) obj;
                initiateDirectDepositSetupFlowRequest.getClass();
                protoWriter.writeBytes(initiateDirectDepositSetupFlowRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateDirectDepositSetupFlowRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof InitiateDirectDepositSetupFlowRequest) && Intrinsics.areEqual(unknownFields(), ((InitiateDirectDepositSetupFlowRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CopyCardNumber.Builder builder = new CopyCardNumber.Builder(23);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "InitiateDirectDepositSetupFlowRequest{}";
    }
}
