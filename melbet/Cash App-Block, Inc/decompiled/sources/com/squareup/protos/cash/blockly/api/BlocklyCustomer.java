package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.cash.blockly.common.BlockType;
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
public final class BlocklyCustomer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlocklyCustomer> CREATOR;
    public final BlockType block_type;
    public final String blocker_override_customer_token;
    public final String flow_url;
    public final Boolean is_blocked;
    public final BlocklyCustomerMetadata metadata;

    static {
        BlocklyCustomer$Companion$ADAPTER$1 blocklyCustomer$Companion$ADAPTER$1 = new BlocklyCustomer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlocklyCustomer.class), "type.googleapis.com/squareup.cash.blockly.api.BlocklyCustomer", Syntax.PROTO_2, null, "squareup/cash/blockly/api/BlocklyCustomer.proto");
        ADAPTER = blocklyCustomer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(blocklyCustomer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlocklyCustomer(Boolean bool, BlocklyCustomerMetadata blocklyCustomerMetadata, String str, String str2, BlockType blockType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_blocked = bool;
        this.metadata = blocklyCustomerMetadata;
        this.blocker_override_customer_token = str;
        this.flow_url = str2;
        this.block_type = blockType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlocklyCustomer)) {
            return false;
        }
        BlocklyCustomer blocklyCustomer = (BlocklyCustomer) obj;
        return Intrinsics.areEqual(unknownFields(), blocklyCustomer.unknownFields()) && Intrinsics.areEqual(this.is_blocked, blocklyCustomer.is_blocked) && Intrinsics.areEqual(this.metadata, blocklyCustomer.metadata) && Intrinsics.areEqual(this.blocker_override_customer_token, blocklyCustomer.blocker_override_customer_token) && Intrinsics.areEqual(this.flow_url, blocklyCustomer.flow_url) && this.block_type == blocklyCustomer.block_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_blocked;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        BlocklyCustomerMetadata blocklyCustomerMetadata = this.metadata;
        int hashCode3 = (hashCode2 + (blocklyCustomerMetadata != null ? blocklyCustomerMetadata.hashCode() : 0)) * 37;
        String str = this.blocker_override_customer_token;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.flow_url;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BlockType blockType = this.block_type;
        int hashCode6 = hashCode5 + (blockType != null ? blockType.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(17);
        builder.for_each = this.is_blocked;
        builder.moneybot_scaffold = this.metadata;
        builder.compose_platform = this.blocker_override_customer_token;
        builder.is_included = this.flow_url;
        builder.motion = this.block_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_blocked;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_blocked=", bool, arrayList);
        }
        BlocklyCustomerMetadata blocklyCustomerMetadata = this.metadata;
        if (blocklyCustomerMetadata != null) {
            arrayList.add("metadata=" + blocklyCustomerMetadata);
        }
        String str = this.blocker_override_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "blocker_override_customer_token=", arrayList);
        }
        String str2 = this.flow_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "flow_url=", arrayList);
        }
        BlockType blockType = this.block_type;
        if (blockType != null) {
            arrayList.add("block_type=" + blockType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlocklyCustomer{", "}", 0, null, null, 56);
    }
}
