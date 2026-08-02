package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.giftly.GiftCard;
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
public final class UiCoreCustomer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiCoreCustomer> CREATOR;
    public final Long customer_since;
    public final String customer_token;
    public final Region region;

    static {
        UiCoreCustomer$Companion$ADAPTER$1 uiCoreCustomer$Companion$ADAPTER$1 = new UiCoreCustomer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiCoreCustomer.class), "type.googleapis.com/squareup.franklin.ui.UiCoreCustomer", Syntax.PROTO_2, null, "squareup/franklin/ui/core_customer.proto");
        ADAPTER = uiCoreCustomer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiCoreCustomer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiCoreCustomer(String str, Long l, Region region, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.customer_since = l;
        this.region = region;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiCoreCustomer)) {
            return false;
        }
        UiCoreCustomer uiCoreCustomer = (UiCoreCustomer) obj;
        return Intrinsics.areEqual(unknownFields(), uiCoreCustomer.unknownFields()) && Intrinsics.areEqual(this.customer_token, uiCoreCustomer.customer_token) && Intrinsics.areEqual(this.customer_since, uiCoreCustomer.customer_since) && this.region == uiCoreCustomer.region;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.customer_since;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Region region = this.region;
        int hashCode4 = hashCode3 + (region != null ? region.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(10);
        builder.label = this.customer_token;
        builder.localizable_label = this.customer_since;
        builder.client_scenario = this.region;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        Long l = this.customer_since;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_since=", l, arrayList);
        }
        Region region = this.region;
        if (region != null) {
            arrayList.add("region=" + region);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiCoreCustomer{", "}", 0, null, null, 56);
    }
}
