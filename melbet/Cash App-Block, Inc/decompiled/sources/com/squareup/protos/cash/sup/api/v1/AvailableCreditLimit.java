package com.squareup.protos.cash.sup.api.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
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
import squareup.cash.overdraft.OverdraftUsage;

/* loaded from: classes8.dex */
public final class AvailableCreditLimit extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvailableCreditLimit> CREATOR;
    public final Money available_limit;
    public final Money cart_minimum;

    static {
        AvailableCreditLimit$Companion$ADAPTER$1 availableCreditLimit$Companion$ADAPTER$1 = new AvailableCreditLimit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvailableCreditLimit.class), "type.googleapis.com/squareup.cash.sup.api.v1.AvailableCreditLimit", Syntax.PROTO_2, null, "squareup/cash/sup/api/v1/merchant_config.proto");
        ADAPTER = availableCreditLimit$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(availableCreditLimit$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableCreditLimit(Money money, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.available_limit = money;
        this.cart_minimum = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvailableCreditLimit)) {
            return false;
        }
        AvailableCreditLimit availableCreditLimit = (AvailableCreditLimit) obj;
        return Intrinsics.areEqual(unknownFields(), availableCreditLimit.unknownFields()) && Intrinsics.areEqual(this.available_limit, availableCreditLimit.available_limit) && Intrinsics.areEqual(this.cart_minimum, availableCreditLimit.cart_minimum);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.available_limit;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.cart_minimum;
        int hashCode3 = hashCode2 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OverdraftUsage.Builder builder = new OverdraftUsage.Builder(3);
        builder.limit = this.available_limit;
        builder.usage = this.cart_minimum;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.available_limit;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("available_limit=", money, arrayList);
        }
        Money money2 = this.cart_minimum;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("cart_minimum=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvailableCreditLimit{", "}", 0, null, null, 56);
    }
}
