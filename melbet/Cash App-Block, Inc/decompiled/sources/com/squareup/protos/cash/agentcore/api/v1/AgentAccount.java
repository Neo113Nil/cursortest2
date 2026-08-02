package com.squareup.protos.cash.agentcore.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Grant;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.common.Money;
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
public final class AgentAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AgentAccount> CREATOR;
    public final String agent_account_token;
    public final Money balance;
    public final String cashtag;
    public final String display_name;
    public final Grant grant;
    public final String sponsorship_token;
    public final String status;

    static {
        AgentAccount$Companion$ADAPTER$1 agentAccount$Companion$ADAPTER$1 = new AgentAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AgentAccount.class), "type.googleapis.com/squareup.cash.agentcore.api.v1beta1.AgentAccount", Syntax.PROTO_2, null, "squareup/cash/agentcore/api/v1beta1/agents_messages.proto");
        ADAPTER = agentAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(agentAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentAccount(String str, String str2, String str3, String str4, String str5, Money money, Grant grant, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.agent_account_token = str;
        this.sponsorship_token = str2;
        this.display_name = str3;
        this.cashtag = str4;
        this.status = str5;
        this.balance = money;
        this.grant = grant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgentAccount)) {
            return false;
        }
        AgentAccount agentAccount = (AgentAccount) obj;
        return Intrinsics.areEqual(unknownFields(), agentAccount.unknownFields()) && Intrinsics.areEqual(this.agent_account_token, agentAccount.agent_account_token) && Intrinsics.areEqual(this.sponsorship_token, agentAccount.sponsorship_token) && Intrinsics.areEqual(this.display_name, agentAccount.display_name) && Intrinsics.areEqual(this.cashtag, agentAccount.cashtag) && Intrinsics.areEqual(this.status, agentAccount.status) && Intrinsics.areEqual(this.balance, agentAccount.balance) && Intrinsics.areEqual(this.grant, agentAccount.grant);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.agent_account_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.sponsorship_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.display_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.cashtag;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.status;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Money money = this.balance;
        int hashCode7 = (hashCode6 + (money != null ? money.hashCode() : 0)) * 37;
        Grant grant = this.grant;
        int hashCode8 = hashCode7 + (grant != null ? grant.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(6, false);
        builder.customer_token = this.agent_account_token;
        builder.alias_value = this.sponsorship_token;
        builder.hashed_alias_token = this.display_name;
        builder.alias_type = this.cashtag;
        builder.updated_at = this.status;
        builder.linked_at = this.balance;
        builder.version = this.grant;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.agent_account_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "agent_account_token=", arrayList);
        }
        String str2 = this.sponsorship_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sponsorship_token=", arrayList);
        }
        if (this.display_name != null) {
            arrayList.add("display_name=██");
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        String str3 = this.status;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "status=", arrayList);
        }
        Money money = this.balance;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("balance=", money, arrayList);
        }
        Grant grant = this.grant;
        if (grant != null) {
            arrayList.add("grant=" + grant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AgentAccount{", "}", 0, null, null, 56);
    }
}
