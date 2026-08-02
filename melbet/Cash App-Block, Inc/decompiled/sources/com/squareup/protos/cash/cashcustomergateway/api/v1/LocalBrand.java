package com.squareup.protos.cash.cashcustomergateway.api.v1;

import android.os.Parcelable;
import app.cash.local.primitives.MenuHoursKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
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
public final class LocalBrand extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalBrand> CREATOR;
    public final Long expires_at;
    public final Boolean is_enrolled;
    public final MenuHoursKt response;

    static {
        LocalBrand$Companion$ADAPTER$1 localBrand$Companion$ADAPTER$1 = new LocalBrand$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalBrand.class), "type.googleapis.com/squareup.cash.cashcustomergateway.api.v1beta1.LocalBrand", Syntax.PROTO_2, null, "squareup/cash/cashcustomergateway/api/v1beta1/lookup_cashtag_service.proto");
        ADAPTER = localBrand$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localBrand$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrand(Long l, MenuHoursKt menuHoursKt, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.expires_at = l;
        this.response = menuHoursKt;
        this.is_enrolled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalBrand)) {
            return false;
        }
        LocalBrand localBrand = (LocalBrand) obj;
        return Intrinsics.areEqual(unknownFields(), localBrand.unknownFields()) && Intrinsics.areEqual(this.expires_at, localBrand.expires_at) && Intrinsics.areEqual(this.response, localBrand.response) && Intrinsics.areEqual(this.is_enrolled, localBrand.is_enrolled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.expires_at;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        MenuHoursKt menuHoursKt = this.response;
        int hashCode3 = (hashCode2 + (menuHoursKt != null ? menuHoursKt.hashCode() : 0)) * 37;
        Boolean bool = this.is_enrolled;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(3);
        builder.title = this.expires_at;
        builder.subtitle = this.response;
        builder.action = this.is_enrolled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        MenuHoursKt menuHoursKt = this.response;
        if (menuHoursKt != null) {
            arrayList.add("response=" + menuHoursKt);
        }
        Boolean bool = this.is_enrolled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_enrolled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalBrand{", "}", 0, null, null, 56);
    }
}
