package com.squareup.protos.cash.registrar.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.time.DateTime;
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
public final class StatementTypeDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StatementTypeDetails> CREATOR;
    public final String customer_token;
    public final String display_name;
    public final Boolean is_active_sponsored_account;
    public final Boolean is_sponsored_account;
    public final StatementType statement_type;

    static {
        StatementTypeDetails$Companion$ADAPTER$1 statementTypeDetails$Companion$ADAPTER$1 = new StatementTypeDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StatementTypeDetails.class), "type.googleapis.com/squareup.cash.registrar.api.StatementTypeDetails", Syntax.PROTO_2, null, "squareup/cash/registrar/api/statement.proto");
        ADAPTER = statementTypeDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(statementTypeDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatementTypeDetails(String str, StatementType statementType, Boolean bool, String str2, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.statement_type = statementType;
        this.is_sponsored_account = bool;
        this.display_name = str2;
        this.is_active_sponsored_account = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StatementTypeDetails)) {
            return false;
        }
        StatementTypeDetails statementTypeDetails = (StatementTypeDetails) obj;
        return Intrinsics.areEqual(unknownFields(), statementTypeDetails.unknownFields()) && Intrinsics.areEqual(this.customer_token, statementTypeDetails.customer_token) && this.statement_type == statementTypeDetails.statement_type && Intrinsics.areEqual(this.is_sponsored_account, statementTypeDetails.is_sponsored_account) && Intrinsics.areEqual(this.display_name, statementTypeDetails.display_name) && Intrinsics.areEqual(this.is_active_sponsored_account, statementTypeDetails.is_active_sponsored_account);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        StatementType statementType = this.statement_type;
        int hashCode3 = (hashCode2 + (statementType != null ? statementType.hashCode() : 0)) * 37;
        Boolean bool = this.is_sponsored_account;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str2 = this.display_name;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_active_sponsored_account;
        int hashCode6 = hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(10, false);
        builder.posix_tz = this.customer_token;
        builder.instant_usec = this.statement_type;
        builder.ordinal = this.is_sponsored_account;
        builder.timezone_offset_min = this.display_name;
        builder.tz_name = this.is_active_sponsored_account;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        StatementType statementType = this.statement_type;
        if (statementType != null) {
            arrayList.add("statement_type=" + statementType);
        }
        Boolean bool = this.is_sponsored_account;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_sponsored_account=", bool, arrayList);
        }
        String str2 = this.display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "display_name=", arrayList);
        }
        Boolean bool2 = this.is_active_sponsored_account;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_active_sponsored_account=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StatementTypeDetails{", "}", 0, null, null, 56);
    }
}
