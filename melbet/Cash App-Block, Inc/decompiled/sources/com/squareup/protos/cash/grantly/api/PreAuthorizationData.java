package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PreAuthorizationData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PreAuthorizationData> CREATOR;
    public final Discount auto_selected_discount;
    public final List eligible_discounts;
    public final List eligible_loan_options;
    public final String order_id;
    public final String pre_auth_token;

    static {
        PreAuthorizationData$Companion$ADAPTER$1 preAuthorizationData$Companion$ADAPTER$1 = new PreAuthorizationData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PreAuthorizationData.class), "type.googleapis.com/squareup.cash.grantly.api.PreAuthorizationData", Syntax.PROTO_2, null, "squareup/cash/grantly/api/preauthorize_payment_response.proto");
        ADAPTER = preAuthorizationData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(preAuthorizationData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreAuthorizationData(String str, List list, Discount discount, List list2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        list.getClass();
        list2.getClass();
        byteString.getClass();
        this.pre_auth_token = str;
        this.auto_selected_discount = discount;
        this.order_id = str2;
        this.eligible_discounts = TransactorKt.immutableCopyOf("eligible_discounts", list);
        this.eligible_loan_options = TransactorKt.immutableCopyOf("eligible_loan_options", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreAuthorizationData)) {
            return false;
        }
        PreAuthorizationData preAuthorizationData = (PreAuthorizationData) obj;
        return Intrinsics.areEqual(unknownFields(), preAuthorizationData.unknownFields()) && Intrinsics.areEqual(this.pre_auth_token, preAuthorizationData.pre_auth_token) && Intrinsics.areEqual(this.eligible_discounts, preAuthorizationData.eligible_discounts) && Intrinsics.areEqual(this.auto_selected_discount, preAuthorizationData.auto_selected_discount) && Intrinsics.areEqual(this.eligible_loan_options, preAuthorizationData.eligible_loan_options) && Intrinsics.areEqual(this.order_id, preAuthorizationData.order_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.pre_auth_token), 37, this.eligible_discounts);
        Discount discount = this.auto_selected_discount;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (discount != null ? discount.hashCode() : 0)) * 37, 37, this.eligible_loan_options);
        String str = this.order_id;
        int hashCode = m2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(13);
        builder.text = this.pre_auth_token;
        builder.text_style = this.eligible_discounts;
        builder.text_decoration = this.auto_selected_discount;
        builder.text_color = this.eligible_loan_options;
        builder.icon = this.order_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.pre_auth_token, "pre_auth_token=", arrayList);
        List list = this.eligible_discounts;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("eligible_discounts=", arrayList, list);
        }
        Discount discount = this.auto_selected_discount;
        if (discount != null) {
            arrayList.add("auto_selected_discount=" + discount);
        }
        List list2 = this.eligible_loan_options;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("eligible_loan_options=", arrayList, list2);
        }
        String str = this.order_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "order_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreAuthorizationData{", "}", 0, null, null, 56);
    }
}
