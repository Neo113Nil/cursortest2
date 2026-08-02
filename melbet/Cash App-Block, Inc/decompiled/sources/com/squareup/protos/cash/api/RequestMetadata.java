package com.squareup.protos.cash.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RequestMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RequestMetadata> CREATOR;
    public final Integer deadline;
    public final Boolean is_retry;
    public final String origin_ip;
    public final InternalRegion region;
    public final ByteString serialized_configuration;
    public final ByteString signed_client_session;

    static {
        RequestMetadata$Companion$ADAPTER$1 requestMetadata$Companion$ADAPTER$1 = new RequestMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RequestMetadata.class), "type.googleapis.com/squareup.cash.api.RequestMetadata", Syntax.PROTO_2, null, "squareup/cash/api/contract.proto");
        ADAPTER = requestMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(requestMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestMetadata(ByteString byteString, InternalRegion internalRegion, Integer num, String str, Boolean bool, ByteString byteString2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        byteString3.getClass();
        this.signed_client_session = byteString;
        this.region = internalRegion;
        this.deadline = num;
        this.origin_ip = str;
        this.is_retry = bool;
        this.serialized_configuration = byteString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestMetadata)) {
            return false;
        }
        RequestMetadata requestMetadata = (RequestMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), requestMetadata.unknownFields()) && Intrinsics.areEqual(this.signed_client_session, requestMetadata.signed_client_session) && this.region == requestMetadata.region && Intrinsics.areEqual(this.deadline, requestMetadata.deadline) && Intrinsics.areEqual(this.origin_ip, requestMetadata.origin_ip) && Intrinsics.areEqual(this.is_retry, requestMetadata.is_retry) && Intrinsics.areEqual(this.serialized_configuration, requestMetadata.serialized_configuration);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.signed_client_session;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        InternalRegion internalRegion = this.region;
        int hashCode3 = (hashCode2 + (internalRegion != null ? internalRegion.hashCode() : 0)) * 37;
        Integer num = this.deadline;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str = this.origin_ip;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.is_retry;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ByteString byteString2 = this.serialized_configuration;
        int hashCode7 = hashCode6 + (byteString2 != null ? byteString2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(9, false);
        builder.category = this.signed_client_session;
        builder.code = this.region;
        builder.field = this.deadline;
        builder.description = this.origin_ip;
        builder.retryable = this.is_retry;
        builder.metadata = this.serialized_configuration;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.signed_client_session;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("signed_client_session=", byteString, arrayList);
        }
        InternalRegion internalRegion = this.region;
        if (internalRegion != null) {
            arrayList.add("region=" + internalRegion);
        }
        Integer num = this.deadline;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("deadline=", num, arrayList);
        }
        String str = this.origin_ip;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "origin_ip=", arrayList);
        }
        Boolean bool = this.is_retry;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_retry=", bool, arrayList);
        }
        ByteString byteString2 = this.serialized_configuration;
        if (byteString2 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("serialized_configuration=", byteString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RequestMetadata{", "}", 0, null, null, 56);
    }
}
