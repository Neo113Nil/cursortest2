package com.squareup.protos.cash.janus.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.franklin.ui.Avatar;
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
public final class FullAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FullAccount> CREATOR;
    public final String account_holder_token;
    public final String account_id;
    public final Avatar avatar;
    public final String business_category;
    public final String cash_tag;
    public final Boolean is_business;
    public final Boolean is_dependent;
    public final Long joined_date_millis;
    public final String switching_identifier;
    public final String title;

    static {
        FullAccount$Companion$ADAPTER$1 fullAccount$Companion$ADAPTER$1 = new FullAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FullAccount.class), "type.googleapis.com/squareup.cash.janus.syncvalues.FullAccount", Syntax.PROTO_2, null, "squareup/cash/janus/syncvalues/FullAccount.proto");
        ADAPTER = fullAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fullAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullAccount(String str, String str2, String str3, Avatar avatar, Boolean bool, String str4, Long l, String str5, String str6, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.account_id = str;
        this.title = str2;
        this.cash_tag = str3;
        this.avatar = avatar;
        this.is_business = bool;
        this.switching_identifier = str4;
        this.joined_date_millis = l;
        this.business_category = str5;
        this.account_holder_token = str6;
        this.is_dependent = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FullAccount)) {
            return false;
        }
        FullAccount fullAccount = (FullAccount) obj;
        return Intrinsics.areEqual(unknownFields(), fullAccount.unknownFields()) && Intrinsics.areEqual(this.account_id, fullAccount.account_id) && Intrinsics.areEqual(this.title, fullAccount.title) && Intrinsics.areEqual(this.cash_tag, fullAccount.cash_tag) && Intrinsics.areEqual(this.avatar, fullAccount.avatar) && Intrinsics.areEqual(this.is_business, fullAccount.is_business) && Intrinsics.areEqual(this.switching_identifier, fullAccount.switching_identifier) && Intrinsics.areEqual(this.joined_date_millis, fullAccount.joined_date_millis) && Intrinsics.areEqual(this.business_category, fullAccount.business_category) && Intrinsics.areEqual(this.account_holder_token, fullAccount.account_holder_token) && Intrinsics.areEqual(this.is_dependent, fullAccount.is_dependent);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.account_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.cash_tag;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Avatar avatar = this.avatar;
        int hashCode5 = (hashCode4 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        Boolean bool = this.is_business;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str4 = this.switching_identifier;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l = this.joined_date_millis;
        int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str5 = this.business_category;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.account_holder_token;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_dependent;
        int hashCode11 = hashCode10 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(6);
        builder.external_id = this.account_id;
        builder.passcode_token = this.title;
        builder.external_client_transfer_token = this.cash_tag;
        builder.request_context = this.avatar;
        builder.source = this.is_business;
        builder.target = this.switching_identifier;
        builder.amount = this.joined_date_millis;
        builder.call_context = this.business_category;
        builder.forwarded_call_context = this.account_holder_token;
        builder.client_verified_digital_wallet = this.is_dependent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.account_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_id=", arrayList);
        }
        if (this.title != null) {
            arrayList.add("title=██");
        }
        if (this.cash_tag != null) {
            arrayList.add("cash_tag=██");
        }
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        Boolean bool = this.is_business;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_business=", bool, arrayList);
        }
        String str2 = this.switching_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "switching_identifier=", arrayList);
        }
        Long l = this.joined_date_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("joined_date_millis=", l, arrayList);
        }
        String str3 = this.business_category;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "business_category=", arrayList);
        }
        String str4 = this.account_holder_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "account_holder_token=", arrayList);
        }
        Boolean bool2 = this.is_dependent;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_dependent=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FullAccount{", "}", 0, null, null, 56);
    }
}
