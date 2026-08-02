package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/janus/api/GetAuthorizedAccountResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/Group$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAuthorizedAccountResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAuthorizedAccountResponse> CREATOR;
    public final GetAuthorizedAccountAuthorizedRelationship authorized_relationship;
    public final String principal_switching_identifier;
    public final String principal_token;

    static {
        GetAuthorizedAccountResponse$Companion$ADAPTER$1 getAuthorizedAccountResponse$Companion$ADAPTER$1 = new GetAuthorizedAccountResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAuthorizedAccountResponse.class), "type.googleapis.com/squareup.cash.janus.api.GetAuthorizedAccountResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/JanusService.proto");
        ADAPTER = getAuthorizedAccountResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAuthorizedAccountResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAuthorizedAccountResponse(GetAuthorizedAccountAuthorizedRelationship getAuthorizedAccountAuthorizedRelationship, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.authorized_relationship = getAuthorizedAccountAuthorizedRelationship;
        this.principal_token = str;
        this.principal_switching_identifier = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAuthorizedAccountResponse)) {
            return false;
        }
        GetAuthorizedAccountResponse getAuthorizedAccountResponse = (GetAuthorizedAccountResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAuthorizedAccountResponse.unknownFields()) && this.authorized_relationship == getAuthorizedAccountResponse.authorized_relationship && Intrinsics.areEqual(this.principal_token, getAuthorizedAccountResponse.principal_token) && Intrinsics.areEqual(this.principal_switching_identifier, getAuthorizedAccountResponse.principal_switching_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GetAuthorizedAccountAuthorizedRelationship getAuthorizedAccountAuthorizedRelationship = this.authorized_relationship;
        int hashCode2 = (hashCode + (getAuthorizedAccountAuthorizedRelationship != null ? getAuthorizedAccountAuthorizedRelationship.hashCode() : 0)) * 37;
        String str = this.principal_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.principal_switching_identifier;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(8);
        builder.group_image = this.authorized_relationship;
        builder.name = this.principal_token;
        builder.participants = this.principal_switching_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GetAuthorizedAccountAuthorizedRelationship getAuthorizedAccountAuthorizedRelationship = this.authorized_relationship;
        if (getAuthorizedAccountAuthorizedRelationship != null) {
            arrayList.add("authorized_relationship=" + getAuthorizedAccountAuthorizedRelationship);
        }
        String str = this.principal_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "principal_token=", arrayList);
        }
        String str2 = this.principal_switching_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "principal_switching_identifier=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAuthorizedAccountResponse{", "}", 0, null, null, 56);
    }
}
