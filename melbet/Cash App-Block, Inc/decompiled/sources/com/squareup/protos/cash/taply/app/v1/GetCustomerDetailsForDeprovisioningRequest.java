package com.squareup.protos.cash.taply.app.v1;

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
public final class GetCustomerDetailsForDeprovisioningRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCustomerDetailsForDeprovisioningRequest> CREATOR;
    public final String fidesmo_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetCustomerDetailsForDeprovisioningRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.taply.app.v1.GetCustomerDetailsForDeprovisioningRequest$Companion$ADAPTER$1
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
                        return new GetCustomerDetailsForDeprovisioningRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GetCustomerDetailsForDeprovisioningRequest getCustomerDetailsForDeprovisioningRequest = (GetCustomerDetailsForDeprovisioningRequest) obj;
                reverseProtoWriter.getClass();
                getCustomerDetailsForDeprovisioningRequest.getClass();
                reverseProtoWriter.writeBytes(getCustomerDetailsForDeprovisioningRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getCustomerDetailsForDeprovisioningRequest.fidesmo_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetCustomerDetailsForDeprovisioningRequest getCustomerDetailsForDeprovisioningRequest = (GetCustomerDetailsForDeprovisioningRequest) obj;
                getCustomerDetailsForDeprovisioningRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, getCustomerDetailsForDeprovisioningRequest.fidesmo_id) + getCustomerDetailsForDeprovisioningRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetCustomerDetailsForDeprovisioningRequest getCustomerDetailsForDeprovisioningRequest = (GetCustomerDetailsForDeprovisioningRequest) obj;
                getCustomerDetailsForDeprovisioningRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getCustomerDetailsForDeprovisioningRequest.fidesmo_id;
                byteString.getClass();
                return new GetCustomerDetailsForDeprovisioningRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetCustomerDetailsForDeprovisioningRequest getCustomerDetailsForDeprovisioningRequest = (GetCustomerDetailsForDeprovisioningRequest) obj;
                getCustomerDetailsForDeprovisioningRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCustomerDetailsForDeprovisioningRequest.fidesmo_id);
                protoWriter.writeBytes(getCustomerDetailsForDeprovisioningRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerDetailsForDeprovisioningRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.fidesmo_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCustomerDetailsForDeprovisioningRequest)) {
            return false;
        }
        GetCustomerDetailsForDeprovisioningRequest getCustomerDetailsForDeprovisioningRequest = (GetCustomerDetailsForDeprovisioningRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getCustomerDetailsForDeprovisioningRequest.unknownFields()) && Intrinsics.areEqual(this.fidesmo_id, getCustomerDetailsForDeprovisioningRequest.fidesmo_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.fidesmo_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(28);
        builder.bio = this.fidesmo_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.fidesmo_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fidesmo_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCustomerDetailsForDeprovisioningRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GetCustomerDetailsForDeprovisioningRequest() {
        this(null, ByteString.EMPTY);
    }
}
