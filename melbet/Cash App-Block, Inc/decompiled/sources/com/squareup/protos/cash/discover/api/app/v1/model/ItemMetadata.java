package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ItemMetadata;
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

/* loaded from: classes.dex */
public final class ItemMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ItemMetadata> CREATOR;
    public final String business_name;
    public final String business_token;
    public final String entity_name;
    public final String entity_type;
    public final String strategy_n_version;
    public final String suggestion_id;
    public final String token;

    static {
        ItemMetadata$Companion$ADAPTER$1 itemMetadata$Companion$ADAPTER$1 = new ItemMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ItemMetadata.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.ItemMetadata", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
        ADAPTER = itemMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(itemMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.strategy_n_version = str2;
        this.suggestion_id = str3;
        this.entity_type = str4;
        this.entity_name = str5;
        this.business_token = str6;
        this.business_name = str7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemMetadata)) {
            return false;
        }
        ItemMetadata itemMetadata = (ItemMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), itemMetadata.unknownFields()) && Intrinsics.areEqual(this.token, itemMetadata.token) && Intrinsics.areEqual(this.strategy_n_version, itemMetadata.strategy_n_version) && Intrinsics.areEqual(this.suggestion_id, itemMetadata.suggestion_id) && Intrinsics.areEqual(this.entity_type, itemMetadata.entity_type) && Intrinsics.areEqual(this.entity_name, itemMetadata.entity_name) && Intrinsics.areEqual(this.business_token, itemMetadata.business_token) && Intrinsics.areEqual(this.business_name, itemMetadata.business_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.strategy_n_version;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.suggestion_id;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.entity_type;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.entity_name;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.business_token;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.business_name;
        int hashCode8 = hashCode7 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ItemMetadata.Builder builder = new ItemMetadata.Builder(1);
        builder.token = this.token;
        builder.strategy_n_version = this.strategy_n_version;
        builder.suggestion_id = this.suggestion_id;
        builder.entity_type = this.entity_type;
        builder.entity_name = this.entity_name;
        builder.business_token = this.business_token;
        builder.business_name = this.business_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        if (this.strategy_n_version != null) {
            arrayList.add("strategy_n_version=██");
        }
        if (this.suggestion_id != null) {
            arrayList.add("suggestion_id=██");
        }
        String str2 = this.entity_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "entity_type=", arrayList);
        }
        String str3 = this.entity_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "entity_name=", arrayList);
        }
        String str4 = this.business_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "business_token=", arrayList);
        }
        String str5 = this.business_name;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "business_name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ItemMetadata{", "}", 0, null, null, 56);
    }
}
