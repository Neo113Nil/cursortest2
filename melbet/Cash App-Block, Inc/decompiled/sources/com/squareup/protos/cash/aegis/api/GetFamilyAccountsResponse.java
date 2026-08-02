package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import com.squareup.protos.cash.aegis.core.FamilyAccountsParameters;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/aegis/api/GetFamilyAccountsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetFamilyAccountsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetFamilyAccountsResponse> CREATOR;
    public final FamilyAccountsParameters family_accounts_parameters;

    static {
        GetFamilyAccountsResponse$Companion$ADAPTER$1 getFamilyAccountsResponse$Companion$ADAPTER$1 = new GetFamilyAccountsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetFamilyAccountsResponse.class), "type.googleapis.com/squareup.cash.aegis.api.GetFamilyAccountsResponse", Syntax.PROTO_2, null, "squareup/cash/aegis/api/GetFamilyAccountsResponse.proto");
        ADAPTER = getFamilyAccountsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getFamilyAccountsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFamilyAccountsResponse(FamilyAccountsParameters familyAccountsParameters, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.family_accounts_parameters = familyAccountsParameters;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetFamilyAccountsResponse)) {
            return false;
        }
        GetFamilyAccountsResponse getFamilyAccountsResponse = (GetFamilyAccountsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getFamilyAccountsResponse.unknownFields()) && Intrinsics.areEqual(this.family_accounts_parameters, getFamilyAccountsResponse.family_accounts_parameters);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FamilyAccountsParameters familyAccountsParameters = this.family_accounts_parameters;
        int hashCode2 = hashCode + (familyAccountsParameters != null ? familyAccountsParameters.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(15);
        builder.f1245type = this.family_accounts_parameters;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FamilyAccountsParameters familyAccountsParameters = this.family_accounts_parameters;
        if (familyAccountsParameters != null) {
            arrayList.add("family_accounts_parameters=" + familyAccountsParameters);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFamilyAccountsResponse{", "}", 0, null, null, 56);
    }
}
