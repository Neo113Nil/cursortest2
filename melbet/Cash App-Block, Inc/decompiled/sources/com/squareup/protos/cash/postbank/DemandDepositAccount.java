package com.squareup.protos.cash.postbank;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardScheme;
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
public final class DemandDepositAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DemandDepositAccount> CREATOR;
    public final DemandDepositAccountState state;
    public final String support_node_token;
    public final Boolean visible;

    static {
        DemandDepositAccount$Companion$ADAPTER$1 demandDepositAccount$Companion$ADAPTER$1 = new DemandDepositAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DemandDepositAccount.class), "type.googleapis.com/squareup.cash.postbank.DemandDepositAccount", Syntax.PROTO_2, null, "squareup/cash/postbank/demand_deposit_account.proto");
        ADAPTER = demandDepositAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(demandDepositAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DemandDepositAccount(DemandDepositAccountState demandDepositAccountState, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.state = demandDepositAccountState;
        this.support_node_token = str;
        this.visible = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DemandDepositAccount)) {
            return false;
        }
        DemandDepositAccount demandDepositAccount = (DemandDepositAccount) obj;
        return Intrinsics.areEqual(unknownFields(), demandDepositAccount.unknownFields()) && this.state == demandDepositAccount.state && Intrinsics.areEqual(this.support_node_token, demandDepositAccount.support_node_token) && Intrinsics.areEqual(this.visible, demandDepositAccount.visible);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DemandDepositAccountState demandDepositAccountState = this.state;
        int hashCode2 = (hashCode + (demandDepositAccountState != null ? demandDepositAccountState.hashCode() : 0)) * 37;
        String str = this.support_node_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.visible;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(6);
        builder.modules = this.state;
        builder.overflow_modules = this.support_node_token;
        builder.card_home_actions = this.visible;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DemandDepositAccountState demandDepositAccountState = this.state;
        if (demandDepositAccountState != null) {
            arrayList.add("state=" + demandDepositAccountState);
        }
        String str = this.support_node_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "support_node_token=", arrayList);
        }
        Boolean bool = this.visible;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("visible=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DemandDepositAccount{", "}", 0, null, null, 56);
    }
}
