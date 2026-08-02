package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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
public final class BlocklistDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlocklistDetails> CREATOR;
    public final String support_page_client_route_url;

    static {
        BlocklistDetails$Companion$ADAPTER$1 blocklistDetails$Companion$ADAPTER$1 = new BlocklistDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlocklistDetails.class), "type.googleapis.com/squareup.cash.blockly.api.BlocklistDetails", Syntax.PROTO_2, null, "squareup/cash/blockly/api/GetBlockedCustomers.proto");
        ADAPTER = blocklistDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(blocklistDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlocklistDetails(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.support_page_client_route_url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlocklistDetails)) {
            return false;
        }
        BlocklistDetails blocklistDetails = (BlocklistDetails) obj;
        return Intrinsics.areEqual(unknownFields(), blocklistDetails.unknownFields()) && Intrinsics.areEqual(this.support_page_client_route_url, blocklistDetails.support_page_client_route_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.support_page_client_route_url;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(20);
        builder.display_name = this.support_page_client_route_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.support_page_client_route_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "support_page_client_route_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlocklistDetails{", "}", 0, null, null, 56);
    }
}
