package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
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
public final class GetStaffBrandDetailsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetStaffBrandDetailsRequest> CREATOR;
    public final List merchant_tokens;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetStaffBrandDetailsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.app.v1.GetStaffBrandDetailsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetStaffBrandDetailsRequest(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetStaffBrandDetailsRequest getStaffBrandDetailsRequest = (GetStaffBrandDetailsRequest) obj;
                reverseProtoWriter.getClass();
                getStaffBrandDetailsRequest.getClass();
                reverseProtoWriter.writeBytes(getStaffBrandDetailsRequest.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, getStaffBrandDetailsRequest.merchant_tokens);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetStaffBrandDetailsRequest getStaffBrandDetailsRequest = (GetStaffBrandDetailsRequest) obj;
                getStaffBrandDetailsRequest.getClass();
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getStaffBrandDetailsRequest.merchant_tokens) + getStaffBrandDetailsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetStaffBrandDetailsRequest getStaffBrandDetailsRequest = (GetStaffBrandDetailsRequest) obj;
                getStaffBrandDetailsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                List list = getStaffBrandDetailsRequest.merchant_tokens;
                list.getClass();
                byteString.getClass();
                return new GetStaffBrandDetailsRequest(list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetStaffBrandDetailsRequest getStaffBrandDetailsRequest = (GetStaffBrandDetailsRequest) obj;
                getStaffBrandDetailsRequest.getClass();
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getStaffBrandDetailsRequest.merchant_tokens);
                protoWriter.writeBytes(getStaffBrandDetailsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStaffBrandDetailsRequest(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.merchant_tokens = TransactorKt.immutableCopyOf("merchant_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStaffBrandDetailsRequest)) {
            return false;
        }
        GetStaffBrandDetailsRequest getStaffBrandDetailsRequest = (GetStaffBrandDetailsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getStaffBrandDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.merchant_tokens, getStaffBrandDetailsRequest.merchant_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.merchant_tokens.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(29);
        builder.scenarios = this.merchant_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.merchant_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("merchant_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetStaffBrandDetailsRequest{", "}", 0, null, null, 56);
    }
}
