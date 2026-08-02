package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.bankbook.Institution;
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
public final class RestrictedCashInTransferRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RestrictedCashInTransferRenderData> CREATOR;
    public final Long actual_restriction_lifted_at_epoch_ms;
    public final Long estimated_restriction_lifted_at_epoch_ms;
    public final Boolean is_for_bitcoin_purchase;

    static {
        RestrictedCashInTransferRenderData$Companion$ADAPTER$1 restrictedCashInTransferRenderData$Companion$ADAPTER$1 = new RestrictedCashInTransferRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RestrictedCashInTransferRenderData.class), "type.googleapis.com/squareup.franklin.RestrictedCashInTransferRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = restrictedCashInTransferRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(restrictedCashInTransferRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictedCashInTransferRenderData(Long l, Long l2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.estimated_restriction_lifted_at_epoch_ms = l;
        this.actual_restriction_lifted_at_epoch_ms = l2;
        this.is_for_bitcoin_purchase = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RestrictedCashInTransferRenderData)) {
            return false;
        }
        RestrictedCashInTransferRenderData restrictedCashInTransferRenderData = (RestrictedCashInTransferRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), restrictedCashInTransferRenderData.unknownFields()) && Intrinsics.areEqual(this.estimated_restriction_lifted_at_epoch_ms, restrictedCashInTransferRenderData.estimated_restriction_lifted_at_epoch_ms) && Intrinsics.areEqual(this.actual_restriction_lifted_at_epoch_ms, restrictedCashInTransferRenderData.actual_restriction_lifted_at_epoch_ms) && Intrinsics.areEqual(this.is_for_bitcoin_purchase, restrictedCashInTransferRenderData.is_for_bitcoin_purchase);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.estimated_restriction_lifted_at_epoch_ms;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.actual_restriction_lifted_at_epoch_ms;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Boolean bool = this.is_for_bitcoin_purchase;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(27, false);
        builder.institution_token = this.estimated_restriction_lifted_at_epoch_ms;
        builder.display_info = this.actual_restriction_lifted_at_epoch_ms;
        builder.help_menu_items = this.is_for_bitcoin_purchase;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.estimated_restriction_lifted_at_epoch_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("estimated_restriction_lifted_at_epoch_ms=", l, arrayList);
        }
        Long l2 = this.actual_restriction_lifted_at_epoch_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("actual_restriction_lifted_at_epoch_ms=", l2, arrayList);
        }
        Boolean bool = this.is_for_bitcoin_purchase;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_for_bitcoin_purchase=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RestrictedCashInTransferRenderData{", "}", 0, null, null, 56);
    }
}
