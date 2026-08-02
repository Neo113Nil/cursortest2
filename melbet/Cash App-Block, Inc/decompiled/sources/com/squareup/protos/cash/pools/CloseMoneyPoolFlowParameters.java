package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.Instrument;
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
public final class CloseMoneyPoolFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CloseMoneyPoolFlowParameters> CREATOR;
    public final String pool_token;

    static {
        CloseMoneyPoolFlowParameters$Companion$ADAPTER$1 closeMoneyPoolFlowParameters$Companion$ADAPTER$1 = new CloseMoneyPoolFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CloseMoneyPoolFlowParameters.class), "type.googleapis.com/squareup.cash.pools.v1beta.CloseMoneyPoolFlowParameters", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/close_money_pool_flow.proto");
        ADAPTER = closeMoneyPoolFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(closeMoneyPoolFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseMoneyPoolFlowParameters(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.pool_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CloseMoneyPoolFlowParameters)) {
            return false;
        }
        CloseMoneyPoolFlowParameters closeMoneyPoolFlowParameters = (CloseMoneyPoolFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), closeMoneyPoolFlowParameters.unknownFields()) && Intrinsics.areEqual(this.pool_token, closeMoneyPoolFlowParameters.pool_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.pool_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(27);
        builder.token = this.pool_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.pool_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pool_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CloseMoneyPoolFlowParameters{", "}", 0, null, null, 56);
    }

    public /* synthetic */ CloseMoneyPoolFlowParameters(String str) {
        this(str, ByteString.EMPTY);
    }
}
