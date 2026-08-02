package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ExecuteUserOpRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExecuteUserOpRequest> CREATOR;
    public final Chain chain;
    public final String operation_token;
    public final ByteString prepared_calls;
    public final List signed;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ExecuteUserOpRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.ExecuteUserOpRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ExecuteUserOpRequest((ByteString) obj, (Chain) obj2, m, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = Chain.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        m.add(SignedEnvelope.ADAPTER.decode(protoReader));
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ExecuteUserOpRequest executeUserOpRequest = (ExecuteUserOpRequest) obj;
                reverseProtoWriter.getClass();
                executeUserOpRequest.getClass();
                reverseProtoWriter.writeBytes(executeUserOpRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, executeUserOpRequest.operation_token);
                SignedEnvelope.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, executeUserOpRequest.signed);
                Chain.ADAPTER.encodeWithTag(reverseProtoWriter, 2, executeUserOpRequest.chain);
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, executeUserOpRequest.prepared_calls);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ExecuteUserOpRequest executeUserOpRequest = (ExecuteUserOpRequest) obj;
                executeUserOpRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(5, executeUserOpRequest.operation_token) + SignedEnvelope.ADAPTER.asRepeated().encodedSizeWithTag(3, executeUserOpRequest.signed) + Chain.ADAPTER.encodedSizeWithTag(2, executeUserOpRequest.chain) + ProtoAdapter.BYTES.encodedSizeWithTag(1, executeUserOpRequest.prepared_calls) + executeUserOpRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ExecuteUserOpRequest executeUserOpRequest = (ExecuteUserOpRequest) obj;
                executeUserOpRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(executeUserOpRequest.signed, SignedEnvelope.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                ByteString byteString2 = executeUserOpRequest.prepared_calls;
                Chain chain = executeUserOpRequest.chain;
                String str = executeUserOpRequest.operation_token;
                byteString.getClass();
                return new ExecuteUserOpRequest(byteString2, chain, m1169redactElements, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ExecuteUserOpRequest executeUserOpRequest = (ExecuteUserOpRequest) obj;
                executeUserOpRequest.getClass();
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, executeUserOpRequest.prepared_calls);
                Chain.ADAPTER.encodeWithTag(protoWriter, 2, executeUserOpRequest.chain);
                SignedEnvelope.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, executeUserOpRequest.signed);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, executeUserOpRequest.operation_token);
                protoWriter.writeBytes(executeUserOpRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteUserOpRequest(ByteString byteString, Chain chain, List list, String str, ByteString byteString2) {
        super(ADAPTER, byteString2);
        list.getClass();
        byteString2.getClass();
        this.prepared_calls = byteString;
        this.chain = chain;
        this.operation_token = str;
        this.signed = TransactorKt.immutableCopyOf("signed", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExecuteUserOpRequest)) {
            return false;
        }
        ExecuteUserOpRequest executeUserOpRequest = (ExecuteUserOpRequest) obj;
        return Intrinsics.areEqual(unknownFields(), executeUserOpRequest.unknownFields()) && Intrinsics.areEqual(this.prepared_calls, executeUserOpRequest.prepared_calls) && this.chain == executeUserOpRequest.chain && Intrinsics.areEqual(this.signed, executeUserOpRequest.signed) && Intrinsics.areEqual(this.operation_token, executeUserOpRequest.operation_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.prepared_calls;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        Chain chain = this.chain;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (chain != null ? chain.hashCode() : 0)) * 37, 37, this.signed);
        String str = this.operation_token;
        int hashCode3 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(10);
        builder.icon = this.prepared_calls;
        builder.enabled = this.chain;
        builder.id = this.signed;
        builder.title = this.operation_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.prepared_calls;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("prepared_calls=", byteString, arrayList);
        }
        Chain chain = this.chain;
        if (chain != null) {
            arrayList.add("chain=" + chain);
        }
        List list = this.signed;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("signed=", arrayList, list);
        }
        String str = this.operation_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "operation_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExecuteUserOpRequest{", "}", 0, null, null, 56);
    }
}
