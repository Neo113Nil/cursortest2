package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class CashLiteClientRoute extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashLiteClientRoute> CREATOR;
    public final String spec_name;

    static {
        CashLiteClientRoute$Companion$ADAPTER$1 cashLiteClientRoute$Companion$ADAPTER$1 = new CashLiteClientRoute$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashLiteClientRoute.class), "type.googleapis.com/squareup.franklin.app.CashLiteClientRoute", Syntax.PROTO_2, null, "squareup/franklin/app/cash_lite_config.proto");
        ADAPTER = cashLiteClientRoute$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashLiteClientRoute$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLiteClientRoute(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.spec_name = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashLiteClientRoute)) {
            return false;
        }
        CashLiteClientRoute cashLiteClientRoute = (CashLiteClientRoute) obj;
        return Intrinsics.areEqual(unknownFields(), cashLiteClientRoute.unknownFields()) && Intrinsics.areEqual(this.spec_name, cashLiteClientRoute.spec_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.spec_name;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(7);
        builder.client_route = this.spec_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.spec_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "spec_name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashLiteClientRoute{", "}", 0, null, null, 56);
    }
}
