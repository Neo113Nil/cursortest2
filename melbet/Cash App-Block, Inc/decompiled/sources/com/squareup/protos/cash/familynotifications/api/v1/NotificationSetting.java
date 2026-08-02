package com.squareup.protos.cash.familynotifications.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
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
public final class NotificationSetting extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationSetting> CREATOR;
    public final NotificationSetting$Setting$RealtimeNotificationSetting setting;

    static {
        NotificationSetting$Companion$ADAPTER$1 notificationSetting$Companion$ADAPTER$1 = new NotificationSetting$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationSetting.class), "type.googleapis.com/squareup.cash.familynotifications.api.v1beta1.NotificationSetting", Syntax.PROTO_2, null, "squareup/cash/familynotifications/api/v1beta1/service.proto");
        ADAPTER = notificationSetting$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationSetting$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSetting(NotificationSetting$Setting$RealtimeNotificationSetting notificationSetting$Setting$RealtimeNotificationSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.setting = notificationSetting$Setting$RealtimeNotificationSetting;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationSetting)) {
            return false;
        }
        NotificationSetting notificationSetting = (NotificationSetting) obj;
        return Intrinsics.areEqual(unknownFields(), notificationSetting.unknownFields()) && Intrinsics.areEqual(this.setting, notificationSetting.setting);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NotificationSetting$Setting$RealtimeNotificationSetting notificationSetting$Setting$RealtimeNotificationSetting = this.setting;
        int hashCode2 = hashCode + (notificationSetting$Setting$RealtimeNotificationSetting != null ? notificationSetting$Setting$RealtimeNotificationSetting.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(17);
        builder.asset_type = this.setting;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NotificationSetting$Setting$RealtimeNotificationSetting notificationSetting$Setting$RealtimeNotificationSetting = this.setting;
        if (notificationSetting$Setting$RealtimeNotificationSetting != null) {
            arrayList.add("setting=" + notificationSetting$Setting$RealtimeNotificationSetting);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationSetting{", "}", 0, null, null, 56);
    }
}
