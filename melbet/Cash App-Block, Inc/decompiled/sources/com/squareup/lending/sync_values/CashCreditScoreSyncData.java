package com.squareup.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes7.dex */
public final class CashCreditScoreSyncData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashCreditScoreSyncData> CREATOR;
    public final List entry_point_data;
    public final List home_data;

    static {
        CashCreditScoreSyncData$Companion$ADAPTER$1 cashCreditScoreSyncData$Companion$ADAPTER$1 = new CashCreditScoreSyncData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashCreditScoreSyncData.class), "type.googleapis.com/squareup.lending.sync_values.CashCreditScoreSyncData", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_sync_values.proto");
        ADAPTER = cashCreditScoreSyncData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreSyncData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashCreditScoreSyncData(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.home_data = TransactorKt.immutableCopyOf("home_data", list);
        this.entry_point_data = TransactorKt.immutableCopyOf("entry_point_data", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashCreditScoreSyncData)) {
            return false;
        }
        CashCreditScoreSyncData cashCreditScoreSyncData = (CashCreditScoreSyncData) obj;
        return Intrinsics.areEqual(unknownFields(), cashCreditScoreSyncData.unknownFields()) && Intrinsics.areEqual(this.home_data, cashCreditScoreSyncData.home_data) && Intrinsics.areEqual(this.entry_point_data, cashCreditScoreSyncData.entry_point_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.entry_point_data.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.home_data);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(3, false);
        builder.card_holder_benefits = this.home_data;
        builder.green_status_benefits = this.entry_point_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.home_data;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("home_data=", arrayList, list);
        }
        List list2 = this.entry_point_data;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("entry_point_data=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashCreditScoreSyncData{", "}", 0, null, null, 56);
    }
}
