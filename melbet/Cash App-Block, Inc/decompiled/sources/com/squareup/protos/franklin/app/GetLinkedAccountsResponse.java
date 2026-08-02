package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/GetLinkedAccountsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/UiAlias$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetLinkedAccountsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetLinkedAccountsResponse> CREATOR;
    public final AccountListConfig account_list_config;
    public final ProfileListConfig profile_list_config;
    public final ResponseContext response_context;

    static {
        GetLinkedAccountsResponse$Companion$ADAPTER$1 getLinkedAccountsResponse$Companion$ADAPTER$1 = new GetLinkedAccountsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetLinkedAccountsResponse.class), "type.googleapis.com/squareup.franklin.app.GetLinkedAccountsResponse", Syntax.PROTO_2, null, "squareup/franklin/app/linked_account.proto");
        ADAPTER = getLinkedAccountsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getLinkedAccountsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLinkedAccountsResponse(AccountListConfig accountListConfig, ResponseContext responseContext, ProfileListConfig profileListConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.account_list_config = accountListConfig;
        this.response_context = responseContext;
        this.profile_list_config = profileListConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetLinkedAccountsResponse)) {
            return false;
        }
        GetLinkedAccountsResponse getLinkedAccountsResponse = (GetLinkedAccountsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getLinkedAccountsResponse.unknownFields()) && Intrinsics.areEqual(this.account_list_config, getLinkedAccountsResponse.account_list_config) && Intrinsics.areEqual(this.response_context, getLinkedAccountsResponse.response_context) && Intrinsics.areEqual(this.profile_list_config, getLinkedAccountsResponse.profile_list_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AccountListConfig accountListConfig = this.account_list_config;
        int hashCode2 = (hashCode + (accountListConfig != null ? accountListConfig.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = (hashCode2 + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        ProfileListConfig profileListConfig = this.profile_list_config;
        int hashCode4 = hashCode3 + (profileListConfig != null ? profileListConfig.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(23);
        builder.f1364type = this.account_list_config;
        builder.canonical_text = this.response_context;
        builder.formatted = this.profile_list_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AccountListConfig accountListConfig = this.account_list_config;
        if (accountListConfig != null) {
            arrayList.add("account_list_config=" + accountListConfig);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        ProfileListConfig profileListConfig = this.profile_list_config;
        if (profileListConfig != null) {
            arrayList.add("profile_list_config=" + profileListConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLinkedAccountsResponse{", "}", 0, null, null, 56);
    }
}
