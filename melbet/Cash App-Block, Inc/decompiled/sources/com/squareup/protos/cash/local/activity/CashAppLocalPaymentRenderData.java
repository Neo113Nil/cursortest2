package com.squareup.protos.cash.local.activity;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.GroupParticipant;
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
public final class CashAppLocalPaymentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppLocalPaymentRenderData> CREATOR;
    public final Actions actions;

    public final class Actions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Actions> CREATOR;
        public final String new_order_client_route;

        static {
            CashAppLocalPaymentRenderData$Actions$Companion$ADAPTER$1 cashAppLocalPaymentRenderData$Actions$Companion$ADAPTER$1 = new CashAppLocalPaymentRenderData$Actions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Actions.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalPaymentRenderData.Actions", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_payment_render_data.proto");
            ADAPTER = cashAppLocalPaymentRenderData$Actions$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalPaymentRenderData$Actions$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Actions(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.new_order_client_route = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) obj;
            return Intrinsics.areEqual(unknownFields(), actions.unknownFields()) && Intrinsics.areEqual(this.new_order_client_route, actions.new_order_client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.new_order_client_route;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Instrument.Builder builder = new Instrument.Builder(3);
            builder.token = this.new_order_client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.new_order_client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "new_order_client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Actions{", "}", 0, null, null, 56);
        }
    }

    static {
        CashAppLocalPaymentRenderData$Companion$ADAPTER$1 cashAppLocalPaymentRenderData$Companion$ADAPTER$1 = new CashAppLocalPaymentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppLocalPaymentRenderData.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalPaymentRenderData", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_payment_render_data.proto");
        ADAPTER = cashAppLocalPaymentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalPaymentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppLocalPaymentRenderData(Actions actions, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.actions = actions;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppLocalPaymentRenderData)) {
            return false;
        }
        CashAppLocalPaymentRenderData cashAppLocalPaymentRenderData = (CashAppLocalPaymentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppLocalPaymentRenderData.unknownFields()) && Intrinsics.areEqual(this.actions, cashAppLocalPaymentRenderData.actions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Actions actions = this.actions;
        int hashCode2 = hashCode + (actions != null ? actions.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(12);
        builder.f1276type = this.actions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Actions actions = this.actions;
        if (actions != null) {
            arrayList.add("actions=" + actions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppLocalPaymentRenderData{", "}", 0, null, null, 56);
    }
}
