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
public final class PrepurchaseCashCardData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PrepurchaseCashCardData> CREATOR;
    public final List applet_sync_data_list;
    public final List cards_entry_points;

    static {
        PrepurchaseCashCardData$Companion$ADAPTER$1 prepurchaseCashCardData$Companion$ADAPTER$1 = new PrepurchaseCashCardData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PrepurchaseCashCardData.class), "type.googleapis.com/squareup.lending.sync_values.PrepurchaseCashCardData", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_sync_values.proto");
        ADAPTER = prepurchaseCashCardData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepurchaseCashCardData(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.applet_sync_data_list = TransactorKt.immutableCopyOf("applet_sync_data_list", list);
        this.cards_entry_points = TransactorKt.immutableCopyOf("cards_entry_points", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrepurchaseCashCardData)) {
            return false;
        }
        PrepurchaseCashCardData prepurchaseCashCardData = (PrepurchaseCashCardData) obj;
        return Intrinsics.areEqual(unknownFields(), prepurchaseCashCardData.unknownFields()) && Intrinsics.areEqual(this.applet_sync_data_list, prepurchaseCashCardData.applet_sync_data_list) && Intrinsics.areEqual(this.cards_entry_points, prepurchaseCashCardData.cards_entry_points);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.cards_entry_points.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.applet_sync_data_list);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(4, false);
        builder.card_holder_benefits = this.applet_sync_data_list;
        builder.green_status_benefits = this.cards_entry_points;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.applet_sync_data_list;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("applet_sync_data_list=", arrayList, list);
        }
        List list2 = this.cards_entry_points;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cards_entry_points=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrepurchaseCashCardData{", "}", 0, null, null, 56);
    }
}
