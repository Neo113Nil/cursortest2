package com.squareup.protos.cash.cashcustomergateway.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
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
public final class LocalBrandEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalBrandEntity> CREATOR;
    public final com.squareup.protos.cash.local.client.v1.LocalBrand brand;
    public final String customer_token;

    static {
        LocalBrandEntity$Companion$ADAPTER$1 localBrandEntity$Companion$ADAPTER$1 = new LocalBrandEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalBrandEntity.class), "type.googleapis.com/squareup.cash.cashcustomergateway.api.v1beta1.LocalBrandEntity", Syntax.PROTO_2, null, "squareup/cash/cashcustomergateway/api/v1beta1/lookup_cashtag_service.proto");
        ADAPTER = localBrandEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localBrandEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrandEntity(com.squareup.protos.cash.local.client.v1.LocalBrand localBrand, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.brand = localBrand;
        this.customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalBrandEntity)) {
            return false;
        }
        LocalBrandEntity localBrandEntity = (LocalBrandEntity) obj;
        return Intrinsics.areEqual(unknownFields(), localBrandEntity.unknownFields()) && Intrinsics.areEqual(this.brand, localBrandEntity.brand) && Intrinsics.areEqual(this.customer_token, localBrandEntity.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        com.squareup.protos.cash.local.client.v1.LocalBrand localBrand = this.brand;
        int hashCode2 = (hashCode + (localBrand != null ? localBrand.hashCode() : 0)) * 37;
        String str = this.customer_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(17);
        builder.errors = this.brand;
        builder.result = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        com.squareup.protos.cash.local.client.v1.LocalBrand localBrand = this.brand;
        if (localBrand != null) {
            arrayList.add("brand=" + localBrand);
        }
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalBrandEntity{", "}", 0, null, null, 56);
    }
}
