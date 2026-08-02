package com.squareup.protos.cash.shopping;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppLock;
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
public final class CustomerShoppingPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomerShoppingPreference> CREATOR;
    public final Boolean opt_in_personalized_shopping;

    static {
        CustomerShoppingPreference$Companion$ADAPTER$1 customerShoppingPreference$Companion$ADAPTER$1 = new CustomerShoppingPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerShoppingPreference.class), "type.googleapis.com/squareup.cash.shopping.CustomerShoppingPreference", Syntax.PROTO_2, null, "squareup/cash/shopping/CustomerShoppingPreferences.proto");
        ADAPTER = customerShoppingPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customerShoppingPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerShoppingPreference(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.opt_in_personalized_shopping = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerShoppingPreference)) {
            return false;
        }
        CustomerShoppingPreference customerShoppingPreference = (CustomerShoppingPreference) obj;
        return Intrinsics.areEqual(unknownFields(), customerShoppingPreference.unknownFields()) && Intrinsics.areEqual(this.opt_in_personalized_shopping, customerShoppingPreference.opt_in_personalized_shopping);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.opt_in_personalized_shopping;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(18);
        builder.activated = this.opt_in_personalized_shopping;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.opt_in_personalized_shopping;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("opt_in_personalized_shopping=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerShoppingPreference{", "}", 0, null, null, 56);
    }
}
