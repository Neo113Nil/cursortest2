package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.app.ProfileListConfig;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/janus/api/RemoveAccountResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoveAccountResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RemoveAccountResponse> CREATOR;
    public final AccountListConfig account_list_config;
    public final ProfileListConfig profile_list_config;

    static {
        RemoveAccountResponse$Companion$ADAPTER$1 removeAccountResponse$Companion$ADAPTER$1 = new RemoveAccountResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RemoveAccountResponse.class), "type.googleapis.com/squareup.cash.janus.api.RemoveAccountResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/RemoveAccountProto.proto");
        ADAPTER = removeAccountResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(removeAccountResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveAccountResponse(AccountListConfig accountListConfig, ProfileListConfig profileListConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.account_list_config = accountListConfig;
        this.profile_list_config = profileListConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoveAccountResponse)) {
            return false;
        }
        RemoveAccountResponse removeAccountResponse = (RemoveAccountResponse) obj;
        return Intrinsics.areEqual(unknownFields(), removeAccountResponse.unknownFields()) && Intrinsics.areEqual(this.account_list_config, removeAccountResponse.account_list_config) && Intrinsics.areEqual(this.profile_list_config, removeAccountResponse.profile_list_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AccountListConfig accountListConfig = this.account_list_config;
        int hashCode2 = (hashCode + (accountListConfig != null ? accountListConfig.hashCode() : 0)) * 37;
        ProfileListConfig profileListConfig = this.profile_list_config;
        int hashCode3 = hashCode2 + (profileListConfig != null ? profileListConfig.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(17);
        builder.card_type = this.account_list_config;
        builder.card_pii = this.profile_list_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AccountListConfig accountListConfig = this.account_list_config;
        if (accountListConfig != null) {
            arrayList.add("account_list_config=" + accountListConfig);
        }
        ProfileListConfig profileListConfig = this.profile_list_config;
        if (profileListConfig != null) {
            arrayList.add("profile_list_config=" + profileListConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RemoveAccountResponse{", "}", 0, null, null, 56);
    }
}
