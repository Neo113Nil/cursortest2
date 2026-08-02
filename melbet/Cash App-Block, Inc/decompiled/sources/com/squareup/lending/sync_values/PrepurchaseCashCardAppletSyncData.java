package com.squareup.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.aegis.core.Section;
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

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletSyncData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PrepurchaseCashCardAppletSyncData> CREATOR;
    public final List alternative_locale_applet_data_list;
    public final List app_supports;
    public final PrepurchaseCashCardAppletData applet_data;

    static {
        PrepurchaseCashCardAppletSyncData$Companion$ADAPTER$1 prepurchaseCashCardAppletSyncData$Companion$ADAPTER$1 = new PrepurchaseCashCardAppletSyncData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PrepurchaseCashCardAppletSyncData.class), "type.googleapis.com/squareup.lending.sync_values.PrepurchaseCashCardAppletSyncData", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_sync_values.proto");
        ADAPTER = prepurchaseCashCardAppletSyncData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseCashCardAppletSyncData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepurchaseCashCardAppletSyncData(List list, PrepurchaseCashCardAppletData prepurchaseCashCardAppletData, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.applet_data = prepurchaseCashCardAppletData;
        this.app_supports = TransactorKt.immutableCopyOf("app_supports", list);
        this.alternative_locale_applet_data_list = TransactorKt.immutableCopyOf("alternative_locale_applet_data_list", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrepurchaseCashCardAppletSyncData)) {
            return false;
        }
        PrepurchaseCashCardAppletSyncData prepurchaseCashCardAppletSyncData = (PrepurchaseCashCardAppletSyncData) obj;
        return Intrinsics.areEqual(unknownFields(), prepurchaseCashCardAppletSyncData.unknownFields()) && Intrinsics.areEqual(this.app_supports, prepurchaseCashCardAppletSyncData.app_supports) && Intrinsics.areEqual(this.applet_data, prepurchaseCashCardAppletSyncData.applet_data) && Intrinsics.areEqual(this.alternative_locale_applet_data_list, prepurchaseCashCardAppletSyncData.alternative_locale_applet_data_list);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.app_supports);
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = this.applet_data;
        int hashCode = this.alternative_locale_applet_data_list.hashCode() + ((m + (prepurchaseCashCardAppletData != null ? prepurchaseCashCardAppletData.hashCode() : 0)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(4);
        builder.groups = this.app_supports;
        builder.header_text = this.applet_data;
        builder.header_button = this.alternative_locale_applet_data_list;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.app_supports;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("app_supports=", arrayList, list);
        }
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = this.applet_data;
        if (prepurchaseCashCardAppletData != null) {
            arrayList.add("applet_data=" + prepurchaseCashCardAppletData);
        }
        List list2 = this.alternative_locale_applet_data_list;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("alternative_locale_applet_data_list=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrepurchaseCashCardAppletSyncData{", "}", 0, null, null, 56);
    }
}
