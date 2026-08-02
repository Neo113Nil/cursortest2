package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.PreferenceManager;
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

/* loaded from: classes8.dex */
public final class InvestDefaultNotificationSettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestDefaultNotificationSettings> CREATOR;
    public final List message_settings;
    public final List settings;

    static {
        InvestDefaultNotificationSettings$Companion$ADAPTER$1 investDefaultNotificationSettings$Companion$ADAPTER$1 = new InvestDefaultNotificationSettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestDefaultNotificationSettings.class), "type.googleapis.com/squareup.franklin.InvestDefaultNotificationSettings", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = investDefaultNotificationSettings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investDefaultNotificationSettings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestDefaultNotificationSettings(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.settings = TransactorKt.immutableCopyOf(PreferenceManager.PREF_SETTINGS, list);
        this.message_settings = TransactorKt.immutableCopyOf("message_settings", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestDefaultNotificationSettings)) {
            return false;
        }
        InvestDefaultNotificationSettings investDefaultNotificationSettings = (InvestDefaultNotificationSettings) obj;
        return Intrinsics.areEqual(unknownFields(), investDefaultNotificationSettings.unknownFields()) && Intrinsics.areEqual(this.settings, investDefaultNotificationSettings.settings) && Intrinsics.areEqual(this.message_settings, investDefaultNotificationSettings.message_settings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.message_settings.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.settings);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(16, false);
        builder.card_holder_benefits = this.settings;
        builder.green_status_benefits = this.message_settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.settings;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("settings=", arrayList, list);
        }
        List list2 = this.message_settings;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("message_settings=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestDefaultNotificationSettings{", "}", 0, null, null, 56);
    }
}
