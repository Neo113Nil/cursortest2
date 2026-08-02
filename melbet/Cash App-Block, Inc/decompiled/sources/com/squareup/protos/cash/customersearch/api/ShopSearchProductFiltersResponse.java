package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
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

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/customersearch/api/ShopSearchProductFiltersResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/SandboxMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShopSearchProductFiltersResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopSearchProductFiltersResponse> CREATOR;
    public final List available_filters;

    static {
        ShopSearchProductFiltersResponse$Companion$ADAPTER$1 shopSearchProductFiltersResponse$Companion$ADAPTER$1 = new ShopSearchProductFiltersResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShopSearchProductFiltersResponse.class), "type.googleapis.com/squareup.cash.customersearch.api.ShopSearchProductFiltersResponse", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ShopSearchProductFilters.proto");
        ADAPTER = shopSearchProductFiltersResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shopSearchProductFiltersResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSearchProductFiltersResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.available_filters = TransactorKt.immutableCopyOf("available_filters", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopSearchProductFiltersResponse)) {
            return false;
        }
        ShopSearchProductFiltersResponse shopSearchProductFiltersResponse = (ShopSearchProductFiltersResponse) obj;
        return Intrinsics.areEqual(unknownFields(), shopSearchProductFiltersResponse.unknownFields()) && Intrinsics.areEqual(this.available_filters, shopSearchProductFiltersResponse.available_filters);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.available_filters.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(4, false);
        builder.scenarios = this.available_filters;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.available_filters;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_filters=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopSearchProductFiltersResponse{", "}", 0, null, null, 56);
    }
}
