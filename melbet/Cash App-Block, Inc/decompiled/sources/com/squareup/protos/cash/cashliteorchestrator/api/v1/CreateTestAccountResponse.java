package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.DeviceLocationHeuristics;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/CreateTestAccountResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/DeviceLocationHeuristics$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateTestAccountResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateTestAccountResponse> CREATOR;
    public final String account_holder_token;
    public final String customer_token;
    public final String evm_wallet_address;
    public final List messages;
    public final String sub_org_id;
    public final String tenant_token;

    static {
        CreateTestAccountResponse$Companion$ADAPTER$1 createTestAccountResponse$Companion$ADAPTER$1 = new CreateTestAccountResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateTestAccountResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.CreateTestAccountResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = createTestAccountResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createTestAccountResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTestAccountResponse(String str, String str2, String str3, String str4, String str5, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.customer_token = str;
        this.account_holder_token = str2;
        this.sub_org_id = str3;
        this.evm_wallet_address = str4;
        this.tenant_token = str5;
        this.messages = TransactorKt.immutableCopyOf("messages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateTestAccountResponse)) {
            return false;
        }
        CreateTestAccountResponse createTestAccountResponse = (CreateTestAccountResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createTestAccountResponse.unknownFields()) && Intrinsics.areEqual(this.customer_token, createTestAccountResponse.customer_token) && Intrinsics.areEqual(this.account_holder_token, createTestAccountResponse.account_holder_token) && Intrinsics.areEqual(this.sub_org_id, createTestAccountResponse.sub_org_id) && Intrinsics.areEqual(this.evm_wallet_address, createTestAccountResponse.evm_wallet_address) && Intrinsics.areEqual(this.tenant_token, createTestAccountResponse.tenant_token) && Intrinsics.areEqual(this.messages, createTestAccountResponse.messages);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.account_holder_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.sub_org_id;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.evm_wallet_address;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.tenant_token;
        int hashCode6 = this.messages.hashCode() + ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DeviceLocationHeuristics.Builder builder = new DeviceLocationHeuristics.Builder(1);
        builder.language = this.customer_token;
        builder.country_code = this.account_holder_token;
        builder.carrier_name = this.sub_org_id;
        builder.carrier_country_code = this.evm_wallet_address;
        builder.time_zone = this.tenant_token;
        builder.installed_keyboards = this.messages;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        String str2 = this.account_holder_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "account_holder_token=", arrayList);
        }
        String str3 = this.sub_org_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "sub_org_id=", arrayList);
        }
        String str4 = this.evm_wallet_address;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "evm_wallet_address=", arrayList);
        }
        String str5 = this.tenant_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "tenant_token=", arrayList);
        }
        List list = this.messages;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("messages=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateTestAccountResponse{", "}", 0, null, null, 56);
    }
}
