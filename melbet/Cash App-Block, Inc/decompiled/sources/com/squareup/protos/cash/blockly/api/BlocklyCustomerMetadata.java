package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class BlocklyCustomerMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlocklyCustomerMetadata> CREATOR;
    public final Cashtag cashtag;
    public final String customer_token;
    public final String full_name;
    public final String profile_photo_url;

    static {
        BlocklyCustomerMetadata$Companion$ADAPTER$1 blocklyCustomerMetadata$Companion$ADAPTER$1 = new BlocklyCustomerMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlocklyCustomerMetadata.class), "type.googleapis.com/squareup.cash.blockly.api.BlocklyCustomerMetadata", Syntax.PROTO_2, null, "squareup/cash/blockly/api/BlocklyCustomer.proto");
        ADAPTER = blocklyCustomerMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(blocklyCustomerMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlocklyCustomerMetadata(String str, String str2, String str3, Cashtag cashtag, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.profile_photo_url = str2;
        this.full_name = str3;
        this.cashtag = cashtag;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlocklyCustomerMetadata)) {
            return false;
        }
        BlocklyCustomerMetadata blocklyCustomerMetadata = (BlocklyCustomerMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), blocklyCustomerMetadata.unknownFields()) && Intrinsics.areEqual(this.customer_token, blocklyCustomerMetadata.customer_token) && Intrinsics.areEqual(this.profile_photo_url, blocklyCustomerMetadata.profile_photo_url) && Intrinsics.areEqual(this.full_name, blocklyCustomerMetadata.full_name) && Intrinsics.areEqual(this.cashtag, blocklyCustomerMetadata.cashtag);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.profile_photo_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.full_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Cashtag cashtag = this.cashtag;
        int hashCode5 = hashCode4 + (cashtag != null ? cashtag.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(25);
        builder.item_variable = this.customer_token;
        builder.collection = this.profile_photo_url;
        builder.template = this.full_name;
        builder.source = this.cashtag;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        if (this.profile_photo_url != null) {
            arrayList.add("profile_photo_url=██");
        }
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlocklyCustomerMetadata{", "}", 0, null, null, 56);
    }
}
