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
public final class CancelCheckoutRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CancelCheckoutRequest> CREATOR;
    public final String sup_checkout_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CancelCheckoutRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.sup.api.v1.CancelCheckoutRequest$Companion$ADAPTER$1
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
                        return new CancelCheckoutRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                CancelCheckoutRequest cancelCheckoutRequest = (CancelCheckoutRequest) obj;
                reverseProtoWriter.getClass();
                cancelCheckoutRequest.getClass();
                reverseProtoWriter.writeBytes(cancelCheckoutRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cancelCheckoutRequest.sup_checkout_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CancelCheckoutRequest cancelCheckoutRequest = (CancelCheckoutRequest) obj;
                cancelCheckoutRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, cancelCheckoutRequest.sup_checkout_id) + cancelCheckoutRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CancelCheckoutRequest cancelCheckoutRequest = (CancelCheckoutRequest) obj;
                cancelCheckoutRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = cancelCheckoutRequest.sup_checkout_id;
                byteString.getClass();
                return new CancelCheckoutRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CancelCheckoutRequest cancelCheckoutRequest = (CancelCheckoutRequest) obj;
                cancelCheckoutRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cancelCheckoutRequest.sup_checkout_id);
                protoWriter.writeBytes(cancelCheckoutRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelCheckoutRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sup_checkout_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelCheckoutRequest)) {
            return false;
        }
        CancelCheckoutRequest cancelCheckoutRequest = (CancelCheckoutRequest) obj;
        return Intrinsics.areEqual(unknownFields(), cancelCheckoutRequest.unknownFields()) && Intrinsics.areEqual(this.sup_checkout_id, cancelCheckoutRequest.sup_checkout_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.sup_checkout_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(13);
        builder.bio = this.sup_checkout_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.sup_checkout_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sup_checkout_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CancelCheckoutRequest{", "}", 0, null, null, 56);
    }
}
