package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetBuyerInfoRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBuyerInfoRequest> CREATOR;
    public final String anonymous_user_app_token;
    public final String attribution_key;
    public final String brand_token;
    public final String location_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetBuyerInfoRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.GetBuyerInfoRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        break;
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj;
                if (str != null) {
                    return new GetBuyerInfoRequest(str, (String) obj2, (String) obj3, (String) obj4, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "brand_token");
                throw null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetBuyerInfoRequest getBuyerInfoRequest = (GetBuyerInfoRequest) obj;
                reverseProtoWriter.getClass();
                getBuyerInfoRequest.getClass();
                reverseProtoWriter.writeBytes(getBuyerInfoRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, getBuyerInfoRequest.anonymous_user_app_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, getBuyerInfoRequest.attribution_key);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getBuyerInfoRequest.location_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getBuyerInfoRequest.brand_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetBuyerInfoRequest getBuyerInfoRequest = (GetBuyerInfoRequest) obj;
                getBuyerInfoRequest.getClass();
                int size$okio = getBuyerInfoRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, getBuyerInfoRequest.anonymous_user_app_token) + protoAdapter2.encodedSizeWithTag(3, getBuyerInfoRequest.attribution_key) + protoAdapter2.encodedSizeWithTag(2, getBuyerInfoRequest.location_token) + protoAdapter2.encodedSizeWithTag(1, getBuyerInfoRequest.brand_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetBuyerInfoRequest getBuyerInfoRequest = (GetBuyerInfoRequest) obj;
                getBuyerInfoRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getBuyerInfoRequest.brand_token;
                String str2 = getBuyerInfoRequest.location_token;
                String str3 = getBuyerInfoRequest.attribution_key;
                String str4 = getBuyerInfoRequest.anonymous_user_app_token;
                str.getClass();
                byteString.getClass();
                return new GetBuyerInfoRequest(str, str2, str3, str4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetBuyerInfoRequest getBuyerInfoRequest = (GetBuyerInfoRequest) obj;
                getBuyerInfoRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getBuyerInfoRequest.brand_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getBuyerInfoRequest.location_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, getBuyerInfoRequest.attribution_key);
                protoAdapter2.encodeWithTag(protoWriter, 4, getBuyerInfoRequest.anonymous_user_app_token);
                protoWriter.writeBytes(getBuyerInfoRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBuyerInfoRequest(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.brand_token = str;
        this.location_token = str2;
        this.attribution_key = str3;
        this.anonymous_user_app_token = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBuyerInfoRequest)) {
            return false;
        }
        GetBuyerInfoRequest getBuyerInfoRequest = (GetBuyerInfoRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getBuyerInfoRequest.unknownFields()) && Intrinsics.areEqual(this.brand_token, getBuyerInfoRequest.brand_token) && Intrinsics.areEqual(this.location_token, getBuyerInfoRequest.location_token) && Intrinsics.areEqual(this.attribution_key, getBuyerInfoRequest.attribution_key) && Intrinsics.areEqual(this.anonymous_user_app_token, getBuyerInfoRequest.anonymous_user_app_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.brand_token);
        String str = this.location_token;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.attribution_key;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.anonymous_user_app_token;
        int hashCode3 = hashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolOwner.Builder builder = new PoolOwner.Builder(4);
        builder.customer_token = this.brand_token;
        builder.full_name = this.location_token;
        builder.profile_photo_url = this.attribution_key;
        builder.cashtag = this.anonymous_user_app_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.brand_token, "brand_token=", arrayList);
        String str = this.location_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "location_token=", arrayList);
        }
        String str2 = this.attribution_key;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "attribution_key=", arrayList);
        }
        String str3 = this.anonymous_user_app_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "anonymous_user_app_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBuyerInfoRequest{", "}", 0, null, null, 56);
    }
}
