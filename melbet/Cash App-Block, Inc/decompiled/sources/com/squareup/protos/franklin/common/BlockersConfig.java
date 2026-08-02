package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.bankbook.Institution;
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

/* loaded from: classes8.dex */
public final class BlockersConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlockersConfig> CREATOR;
    public final String add_cash_header_text;
    public final Boolean address_typeahead_enabled;
    public final Money target_balance_amount;

    static {
        BlockersConfig$Companion$ADAPTER$1 blockersConfig$Companion$ADAPTER$1 = new BlockersConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlockersConfig.class), "type.googleapis.com/squareup.franklin.common.BlockersConfig", Syntax.PROTO_2, null, "squareup/franklin/common/blockers_config.proto");
        ADAPTER = blockersConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(blockersConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockersConfig(Boolean bool, String str, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.address_typeahead_enabled = bool;
        this.add_cash_header_text = str;
        this.target_balance_amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockersConfig)) {
            return false;
        }
        BlockersConfig blockersConfig = (BlockersConfig) obj;
        return Intrinsics.areEqual(unknownFields(), blockersConfig.unknownFields()) && Intrinsics.areEqual(this.address_typeahead_enabled, blockersConfig.address_typeahead_enabled) && Intrinsics.areEqual(this.add_cash_header_text, blockersConfig.add_cash_header_text) && Intrinsics.areEqual(this.target_balance_amount, blockersConfig.target_balance_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.address_typeahead_enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.add_cash_header_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.target_balance_amount;
        int hashCode4 = hashCode3 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(12, false);
        builder.display_info = this.address_typeahead_enabled;
        builder.institution_token = this.add_cash_header_text;
        builder.help_menu_items = this.target_balance_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.address_typeahead_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("address_typeahead_enabled=", bool, arrayList);
        }
        String str = this.add_cash_header_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "add_cash_header_text=", arrayList);
        }
        Money money = this.target_balance_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("target_balance_amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlockersConfig{", "}", 0, null, null, 56);
    }
}
