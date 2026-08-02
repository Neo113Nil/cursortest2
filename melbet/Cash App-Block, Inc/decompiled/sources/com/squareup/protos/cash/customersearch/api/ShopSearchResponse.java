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

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/customersearch/api/ShopSearchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/SandboxMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShopSearchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopSearchResponse> CREATOR;
    public final List sections;

    static {
        ShopSearchResponse$Companion$ADAPTER$1 shopSearchResponse$Companion$ADAPTER$1 = new ShopSearchResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShopSearchResponse.class), "type.googleapis.com/squareup.cash.customersearch.api.ShopSearchResponse", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ShopSearch.proto");
        ADAPTER = shopSearchResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shopSearchResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSearchResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopSearchResponse)) {
            return false;
        }
        ShopSearchResponse shopSearchResponse = (ShopSearchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), shopSearchResponse.unknownFields()) && Intrinsics.areEqual(this.sections, shopSearchResponse.sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.sections.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(5, false);
        builder.scenarios = this.sections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopSearchResponse{", "}", 0, null, null, 56);
    }
}
