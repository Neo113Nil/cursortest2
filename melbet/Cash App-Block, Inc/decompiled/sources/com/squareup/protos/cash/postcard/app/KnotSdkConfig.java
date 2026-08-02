package com.squareup.protos.cash.postcard.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class KnotSdkConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<KnotSdkConfig> CREATOR;
    public final Boolean categories;
    public final KnotEntryPoint entry_point;
    public final List merchant_ids;
    public final Boolean search;

    static {
        KnotSdkConfig$Companion$ADAPTER$1 knotSdkConfig$Companion$ADAPTER$1 = new KnotSdkConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(KnotSdkConfig.class), "type.googleapis.com/squareup.cash.postcard.app.KnotSdkConfig", Syntax.PROTO_2, null, "squareup/cash/postcard/app/KnotApi.proto");
        ADAPTER = knotSdkConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(knotSdkConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnotSdkConfig(Boolean bool, Boolean bool2, KnotEntryPoint knotEntryPoint, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.categories = bool;
        this.search = bool2;
        this.entry_point = knotEntryPoint;
        this.merchant_ids = TransactorKt.immutableCopyOf("merchant_ids", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KnotSdkConfig)) {
            return false;
        }
        KnotSdkConfig knotSdkConfig = (KnotSdkConfig) obj;
        return Intrinsics.areEqual(unknownFields(), knotSdkConfig.unknownFields()) && Intrinsics.areEqual(this.categories, knotSdkConfig.categories) && Intrinsics.areEqual(this.search, knotSdkConfig.search) && this.entry_point == knotSdkConfig.entry_point && Intrinsics.areEqual(this.merchant_ids, knotSdkConfig.merchant_ids);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.categories;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.search;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        KnotEntryPoint knotEntryPoint = this.entry_point;
        int hashCode4 = this.merchant_ids.hashCode() + ((hashCode3 + (knotEntryPoint != null ? knotEntryPoint.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(10);
        builder.card_encryption_data = this.categories;
        builder.customer_token_hash_email = this.search;
        builder.device_metadata = this.entry_point;
        builder.success_screen = this.merchant_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.categories;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("categories=", bool, arrayList);
        }
        Boolean bool2 = this.search;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("search=", bool2, arrayList);
        }
        KnotEntryPoint knotEntryPoint = this.entry_point;
        if (knotEntryPoint != null) {
            arrayList.add("entry_point=" + knotEntryPoint);
        }
        List list = this.merchant_ids;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("merchant_ids=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "KnotSdkConfig{", "}", 0, null, null, 56);
    }
}
