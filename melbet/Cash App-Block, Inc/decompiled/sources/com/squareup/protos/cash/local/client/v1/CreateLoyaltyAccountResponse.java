package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.datadog.android.core.internal.utils.MiscUtilsKt;
import com.squareup.protos.cash.groups.GroupParticipant;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/CreateLoyaltyAccountResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "com/datadog/android/core/internal/utils/MiscUtilsKt", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateLoyaltyAccountResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateLoyaltyAccountResponse> CREATOR;
    public final MiscUtilsKt response;

    static {
        CreateLoyaltyAccountResponse$Companion$ADAPTER$1 createLoyaltyAccountResponse$Companion$ADAPTER$1 = new CreateLoyaltyAccountResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateLoyaltyAccountResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateLoyaltyAccountResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = createLoyaltyAccountResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createLoyaltyAccountResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyAccountResponse(MiscUtilsKt miscUtilsKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = miscUtilsKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateLoyaltyAccountResponse)) {
            return false;
        }
        CreateLoyaltyAccountResponse createLoyaltyAccountResponse = (CreateLoyaltyAccountResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createLoyaltyAccountResponse.unknownFields()) && Intrinsics.areEqual(this.response, createLoyaltyAccountResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MiscUtilsKt miscUtilsKt = this.response;
        int hashCode2 = hashCode + (miscUtilsKt != null ? miscUtilsKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(20);
        builder.f1276type = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MiscUtilsKt miscUtilsKt = this.response;
        if (miscUtilsKt != null) {
            arrayList.add("response=" + miscUtilsKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateLoyaltyAccountResponse{", "}", 0, null, null, 56);
    }
}
