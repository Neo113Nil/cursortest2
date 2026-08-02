package com.squareup.protos.cash.transactionwriter.config;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.lending.OpaqueRoute;
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

/* loaded from: classes8.dex */
public final class TransactionActivityConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TransactionActivityConfig> CREATOR;
    public final TransactionAuthConfig transaction_auth_config;

    public final class TransactionAuthConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TransactionAuthConfig> CREATOR;
        public final String transaction_auth_rollup_url;

        static {
            TransactionActivityConfig$TransactionAuthConfig$Companion$ADAPTER$1 transactionActivityConfig$TransactionAuthConfig$Companion$ADAPTER$1 = new TransactionActivityConfig$TransactionAuthConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransactionAuthConfig.class), "type.googleapis.com/squareup.cash.transactionwriter.config.TransactionActivityConfig.TransactionAuthConfig", Syntax.PROTO_2, null, "squareup/cash/transactionwriter/config/TransactionActivityConfig.proto");
            ADAPTER = transactionActivityConfig$TransactionAuthConfig$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(transactionActivityConfig$TransactionAuthConfig$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionAuthConfig(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.transaction_auth_rollup_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TransactionAuthConfig)) {
                return false;
            }
            TransactionAuthConfig transactionAuthConfig = (TransactionAuthConfig) obj;
            return Intrinsics.areEqual(unknownFields(), transactionAuthConfig.unknownFields()) && Intrinsics.areEqual(this.transaction_auth_rollup_url, transactionAuthConfig.transaction_auth_rollup_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.transaction_auth_rollup_url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(3);
            builder.client_route = this.transaction_auth_rollup_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.transaction_auth_rollup_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "transaction_auth_rollup_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TransactionAuthConfig{", "}", 0, null, null, 56);
        }
    }

    static {
        TransactionActivityConfig$Companion$ADAPTER$1 transactionActivityConfig$Companion$ADAPTER$1 = new TransactionActivityConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransactionActivityConfig.class), "type.googleapis.com/squareup.cash.transactionwriter.config.TransactionActivityConfig", Syntax.PROTO_2, null, "squareup/cash/transactionwriter/config/TransactionActivityConfig.proto");
        ADAPTER = transactionActivityConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(transactionActivityConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionActivityConfig(TransactionAuthConfig transactionAuthConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.transaction_auth_config = transactionAuthConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransactionActivityConfig)) {
            return false;
        }
        TransactionActivityConfig transactionActivityConfig = (TransactionActivityConfig) obj;
        return Intrinsics.areEqual(unknownFields(), transactionActivityConfig.unknownFields()) && Intrinsics.areEqual(this.transaction_auth_config, transactionActivityConfig.transaction_auth_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TransactionAuthConfig transactionAuthConfig = this.transaction_auth_config;
        int hashCode2 = hashCode + (transactionAuthConfig != null ? transactionAuthConfig.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(4);
        builder.claimable_payment = this.transaction_auth_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TransactionAuthConfig transactionAuthConfig = this.transaction_auth_config;
        if (transactionAuthConfig != null) {
            arrayList.add("transaction_auth_config=" + transactionAuthConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransactionActivityConfig{", "}", 0, null, null, 56);
    }
}
