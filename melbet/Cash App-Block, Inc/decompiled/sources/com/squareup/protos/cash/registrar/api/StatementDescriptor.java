package com.squareup.protos.cash.registrar.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.Allowed;
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
public final class StatementDescriptor extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StatementDescriptor> CREATOR;
    public final String display_name;
    public final StatementCoverage statement_coverage;
    public final String statement_token;
    public final String statement_url;

    static {
        StatementDescriptor$Companion$ADAPTER$1 statementDescriptor$Companion$ADAPTER$1 = new StatementDescriptor$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StatementDescriptor.class), "type.googleapis.com/squareup.cash.registrar.api.StatementDescriptor", Syntax.PROTO_2, null, "squareup/cash/registrar/api/get_available_statements_for_account.proto");
        ADAPTER = statementDescriptor$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(statementDescriptor$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatementDescriptor(String str, StatementCoverage statementCoverage, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_name = str;
        this.statement_coverage = statementCoverage;
        this.statement_url = str2;
        this.statement_token = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StatementDescriptor)) {
            return false;
        }
        StatementDescriptor statementDescriptor = (StatementDescriptor) obj;
        return Intrinsics.areEqual(unknownFields(), statementDescriptor.unknownFields()) && Intrinsics.areEqual(this.display_name, statementDescriptor.display_name) && Intrinsics.areEqual(this.statement_coverage, statementDescriptor.statement_coverage) && Intrinsics.areEqual(this.statement_url, statementDescriptor.statement_url) && Intrinsics.areEqual(this.statement_token, statementDescriptor.statement_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.display_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        StatementCoverage statementCoverage = this.statement_coverage;
        int hashCode3 = (hashCode2 + (statementCoverage != null ? statementCoverage.hashCode() : 0)) * 37;
        String str2 = this.statement_url;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.statement_token;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(12);
        builder.customer_token_hash_email = this.display_name;
        builder.card_encryption_data = this.statement_coverage;
        builder.device_metadata = this.statement_url;
        builder.success_screen = this.statement_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.display_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
        }
        StatementCoverage statementCoverage = this.statement_coverage;
        if (statementCoverage != null) {
            arrayList.add("statement_coverage=" + statementCoverage);
        }
        String str2 = this.statement_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "statement_url=", arrayList);
        }
        String str3 = this.statement_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "statement_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StatementDescriptor{", "}", 0, null, null, 56);
    }
}
