package com.squareup.protos.cash.investcustomer.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CustomerControls extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomerControls> CREATOR;
    public final String customer_token;
    public final Boolean trading_enabled;
    public final List trading_limits;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String customer_token;
        public Boolean trading_enabled;
        public List trading_limits;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CustomerControls(this.trading_enabled, this.customer_token, this.trading_limits, buildUnknownFields());
                case 1:
                    List list = this.trading_limits;
                    return new BenefitsHub.Benefits(this.trading_enabled, this.customer_token, list, buildUnknownFields());
                default:
                    return new LocalizationConfig.LanguageDisclosure(this.trading_enabled, this.customer_token, this.trading_limits, buildUnknownFields());
            }
        }
    }

    static {
        CustomerControls$Companion$ADAPTER$1 customerControls$Companion$ADAPTER$1 = new CustomerControls$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerControls.class), "type.googleapis.com/squareup.cash.investcustomer.api.v1.CustomerControls", Syntax.PROTO_2, null, "squareup/cash/investcustomer/api/v1/service.proto");
        ADAPTER = customerControls$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customerControls$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerControls(Boolean bool, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.customer_token = str;
        this.trading_enabled = bool;
        this.trading_limits = TransactorKt.immutableCopyOf("trading_limits", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerControls)) {
            return false;
        }
        CustomerControls customerControls = (CustomerControls) obj;
        return Intrinsics.areEqual(unknownFields(), customerControls.unknownFields()) && Intrinsics.areEqual(this.customer_token, customerControls.customer_token) && Intrinsics.areEqual(this.trading_enabled, customerControls.trading_enabled) && Intrinsics.areEqual(this.trading_limits, customerControls.trading_limits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.trading_enabled;
        int hashCode3 = this.trading_limits.hashCode() + ((hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.customer_token = this.customer_token;
        builder.trading_enabled = this.trading_enabled;
        builder.trading_limits = this.trading_limits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        Boolean bool = this.trading_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("trading_enabled=", bool, arrayList);
        }
        List list = this.trading_limits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("trading_limits=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerControls{", "}", 0, null, null, 56);
    }
}
