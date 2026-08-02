package com.squareup.protos.cash.sup.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.profiles.ProfileDetails;
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
public final class CancelCheckoutByPaymentTokenRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CancelCheckoutByPaymentTokenRequest> CREATOR;
    public final String payment_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CancelCheckoutByPaymentTokenRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.sup.api.v1.CancelCheckoutByPaymentTokenRequest$Companion$ADAPTER$1
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
                        return new CancelCheckoutByPaymentTokenRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                CancelCheckoutByPaymentTokenRequest cancelCheckoutByPaymentTokenRequest = (CancelCheckoutByPaymentTokenRequest) obj;
                reverseProtoWriter.getClass();
                cancelCheckoutByPaymentTokenRequest.getClass();
                reverseProtoWriter.writeBytes(cancelCheckoutByPaymentTokenRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cancelCheckoutByPaymentTokenRequest.payment_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CancelCheckoutByPaymentTokenRequest cancelCheckoutByPaymentTokenRequest = (CancelCheckoutByPaymentTokenRequest) obj;
                cancelCheckoutByPaymentTokenRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, cancelCheckoutByPaymentTokenRequest.payment_token) + cancelCheckoutByPaymentTokenRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CancelCheckoutByPaymentTokenRequest cancelCheckoutByPaymentTokenRequest = (CancelCheckoutByPaymentTokenRequest) obj;
                cancelCheckoutByPaymentTokenRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = cancelCheckoutByPaymentTokenRequest.payment_token;
                byteString.getClass();
                return new CancelCheckoutByPaymentTokenRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CancelCheckoutByPaymentTokenRequest cancelCheckoutByPaymentTokenRequest = (CancelCheckoutByPaymentTokenRequest) obj;
                cancelCheckoutByPaymentTokenRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cancelCheckoutByPaymentTokenRequest.payment_token);
                protoWriter.writeBytes(cancelCheckoutByPaymentTokenRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelCheckoutByPaymentTokenRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelCheckoutByPaymentTokenRequest)) {
            return false;
        }
        CancelCheckoutByPaymentTokenRequest cancelCheckoutByPaymentTokenRequest = (CancelCheckoutByPaymentTokenRequest) obj;
        return Intrinsics.areEqual(unknownFields(), cancelCheckoutByPaymentTokenRequest.unknownFields()) && Intrinsics.areEqual(this.payment_token, cancelCheckoutByPaymentTokenRequest.payment_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(12);
        builder.bio = this.payment_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payment_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CancelCheckoutByPaymentTokenRequest{", "}", 0, null, null, 56);
    }
}
