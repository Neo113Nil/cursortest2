package com.squareup.protos.investing.notifications.settings;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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
import squareup.cash.earnings.EarningsYearToDate;

/* loaded from: classes8.dex */
public final class NotificationsSettingsPerformanceConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationsSettingsPerformanceConfiguration> CREATOR;
    public final Integer value;

    static {
        NotificationsSettingsPerformanceConfiguration$Companion$ADAPTER$1 notificationsSettingsPerformanceConfiguration$Companion$ADAPTER$1 = new NotificationsSettingsPerformanceConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationsSettingsPerformanceConfiguration.class), "type.googleapis.com/squareup.investnotifications.settings.NotificationsSettingsPerformanceConfiguration", Syntax.PROTO_2, null, "squareup/investing/notifications/settings.proto");
        ADAPTER = notificationsSettingsPerformanceConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationsSettingsPerformanceConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsSettingsPerformanceConfiguration(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.value = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsPerformanceConfiguration)) {
            return false;
        }
        NotificationsSettingsPerformanceConfiguration notificationsSettingsPerformanceConfiguration = (NotificationsSettingsPerformanceConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), notificationsSettingsPerformanceConfiguration.unknownFields()) && Intrinsics.areEqual(this.value, notificationsSettingsPerformanceConfiguration.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.value;
        int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningsYearToDate.Builder builder = new EarningsYearToDate.Builder(7);
        builder.year = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.value;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("value=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationsSettingsPerformanceConfiguration{", "}", 0, null, null, 56);
    }
}
