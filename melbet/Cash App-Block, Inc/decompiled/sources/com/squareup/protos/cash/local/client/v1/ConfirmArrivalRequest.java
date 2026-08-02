package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.Instrument;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ConfirmArrivalRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConfirmArrivalRequest> CREATOR;
    public final String order_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmArrivalRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.ConfirmArrivalRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ConfirmArrivalRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ConfirmArrivalRequest confirmArrivalRequest = (ConfirmArrivalRequest) obj;
                reverseProtoWriter.getClass();
                confirmArrivalRequest.getClass();
                reverseProtoWriter.writeBytes(confirmArrivalRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, confirmArrivalRequest.order_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ConfirmArrivalRequest confirmArrivalRequest = (ConfirmArrivalRequest) obj;
                confirmArrivalRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, confirmArrivalRequest.order_token) + confirmArrivalRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ConfirmArrivalRequest confirmArrivalRequest = (ConfirmArrivalRequest) obj;
                confirmArrivalRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = confirmArrivalRequest.order_token;
                byteString.getClass();
                return new ConfirmArrivalRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ConfirmArrivalRequest confirmArrivalRequest = (ConfirmArrivalRequest) obj;
                confirmArrivalRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, confirmArrivalRequest.order_token);
                protoWriter.writeBytes(confirmArrivalRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmArrivalRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.order_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmArrivalRequest)) {
            return false;
        }
        ConfirmArrivalRequest confirmArrivalRequest = (ConfirmArrivalRequest) obj;
        return Intrinsics.areEqual(unknownFields(), confirmArrivalRequest.unknownFields()) && Intrinsics.areEqual(this.order_token, confirmArrivalRequest.order_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.order_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(10);
        builder.token = this.order_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.order_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "order_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmArrivalRequest{", "}", 0, null, null, 56);
    }
}
