package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ScheduledReloadData;
import com.squareup.protos.rewardly.ui.AppLinks;
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
public final class UiScheduledPayments extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiScheduledPayments> CREATOR;
    public final ScheduledReloadData scheduled_reload_data;
    public final Boolean scheduled_reload_enabled;

    static {
        UiScheduledPayments$Companion$ADAPTER$1 uiScheduledPayments$Companion$ADAPTER$1 = new UiScheduledPayments$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiScheduledPayments.class), "type.googleapis.com/squareup.franklin.ui.UiScheduledPayments", Syntax.PROTO_2, null, "squareup/franklin/ui/scheduled_payments.proto");
        ADAPTER = uiScheduledPayments$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiScheduledPayments$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiScheduledPayments(ScheduledReloadData scheduledReloadData, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.scheduled_reload_data = scheduledReloadData;
        this.scheduled_reload_enabled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiScheduledPayments)) {
            return false;
        }
        UiScheduledPayments uiScheduledPayments = (UiScheduledPayments) obj;
        return Intrinsics.areEqual(unknownFields(), uiScheduledPayments.unknownFields()) && Intrinsics.areEqual(this.scheduled_reload_data, uiScheduledPayments.scheduled_reload_data) && Intrinsics.areEqual(this.scheduled_reload_enabled, uiScheduledPayments.scheduled_reload_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScheduledReloadData scheduledReloadData = this.scheduled_reload_data;
        int hashCode2 = (hashCode + (scheduledReloadData != null ? scheduledReloadData.hashCode() : 0)) * 37;
        Boolean bool = this.scheduled_reload_enabled;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(5);
        builder.f1411android = this.scheduled_reload_data;
        builder.ios = this.scheduled_reload_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ScheduledReloadData scheduledReloadData = this.scheduled_reload_data;
        if (scheduledReloadData != null) {
            arrayList.add("scheduled_reload_data=" + scheduledReloadData);
        }
        Boolean bool = this.scheduled_reload_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("scheduled_reload_enabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiScheduledPayments{", "}", 0, null, null, 56);
    }
}
