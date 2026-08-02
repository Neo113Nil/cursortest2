package com.squareup.protos.investing.notifications.settings;

import android.os.Parcelable;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.rewardly.ui.AppLinks;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class NotificationsSettingsOptionsConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationsSettingsOptionsConfiguration> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final NotificationsSettingsOptionsConfigurationType f1402type;
    public final NotificationsSettingsOptionsConfiguration$Value$Performance value;

    public enum NotificationsSettingsOptionsConfigurationType implements WireEnum {
        UNKNOWN(0),
        PERFORMANCE(1);

        public static final NotificationsSettingsOptionsConfiguration$NotificationsSettingsOptionsConfigurationType$Companion$ADAPTER$1 ADAPTER;
        public static final Trigger.Companion Companion;
        public final int value;

        static {
            NotificationsSettingsOptionsConfigurationType notificationsSettingsOptionsConfigurationType = UNKNOWN;
            Companion = new Trigger.Companion();
            ADAPTER = new NotificationsSettingsOptionsConfiguration$NotificationsSettingsOptionsConfigurationType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NotificationsSettingsOptionsConfigurationType.class), Syntax.PROTO_2, notificationsSettingsOptionsConfigurationType);
        }

        NotificationsSettingsOptionsConfigurationType(int i) {
            this.value = i;
        }

        public static final NotificationsSettingsOptionsConfigurationType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return PERFORMANCE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        NotificationsSettingsOptionsConfiguration$Companion$ADAPTER$1 notificationsSettingsOptionsConfiguration$Companion$ADAPTER$1 = new NotificationsSettingsOptionsConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationsSettingsOptionsConfiguration.class), "type.googleapis.com/squareup.investnotifications.settings.NotificationsSettingsOptionsConfiguration", Syntax.PROTO_2, null, "squareup/investing/notifications/settings.proto");
        ADAPTER = notificationsSettingsOptionsConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationsSettingsOptionsConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsSettingsOptionsConfiguration(NotificationsSettingsOptionsConfigurationType notificationsSettingsOptionsConfigurationType, NotificationsSettingsOptionsConfiguration$Value$Performance notificationsSettingsOptionsConfiguration$Value$Performance, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1402type = notificationsSettingsOptionsConfigurationType;
        this.value = notificationsSettingsOptionsConfiguration$Value$Performance;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsOptionsConfiguration)) {
            return false;
        }
        NotificationsSettingsOptionsConfiguration notificationsSettingsOptionsConfiguration = (NotificationsSettingsOptionsConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), notificationsSettingsOptionsConfiguration.unknownFields()) && this.f1402type == notificationsSettingsOptionsConfiguration.f1402type && Intrinsics.areEqual(this.value, notificationsSettingsOptionsConfiguration.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NotificationsSettingsOptionsConfigurationType notificationsSettingsOptionsConfigurationType = this.f1402type;
        int hashCode2 = (hashCode + (notificationsSettingsOptionsConfigurationType != null ? notificationsSettingsOptionsConfigurationType.hashCode() : 0)) * 37;
        NotificationsSettingsOptionsConfiguration$Value$Performance notificationsSettingsOptionsConfiguration$Value$Performance = this.value;
        int hashCode3 = hashCode2 + (notificationsSettingsOptionsConfiguration$Value$Performance != null ? notificationsSettingsOptionsConfiguration$Value$Performance.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(6);
        builder.f1411android = this.f1402type;
        builder.ios = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NotificationsSettingsOptionsConfigurationType notificationsSettingsOptionsConfigurationType = this.f1402type;
        if (notificationsSettingsOptionsConfigurationType != null) {
            arrayList.add("type=" + notificationsSettingsOptionsConfigurationType);
        }
        NotificationsSettingsOptionsConfiguration$Value$Performance notificationsSettingsOptionsConfiguration$Value$Performance = this.value;
        if (notificationsSettingsOptionsConfiguration$Value$Performance != null) {
            arrayList.add("value=" + notificationsSettingsOptionsConfiguration$Value$Performance);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationsSettingsOptionsConfiguration{", "}", 0, null, null, 56);
    }
}
