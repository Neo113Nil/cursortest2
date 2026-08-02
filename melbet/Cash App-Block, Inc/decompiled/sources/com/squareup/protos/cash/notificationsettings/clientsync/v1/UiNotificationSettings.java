package com.squareup.protos.cash.notificationsettings.clientsync.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.money.content.MoneyTab;
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
public final class UiNotificationSettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiNotificationSettings> CREATOR;
    public final List category_preferences;

    static {
        UiNotificationSettings$Companion$ADAPTER$1 uiNotificationSettings$Companion$ADAPTER$1 = new UiNotificationSettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiNotificationSettings.class), "type.googleapis.com/squareup.cash.notificationsettings.clientsync.v1.UiNotificationSettings", Syntax.PROTO_2, null, "squareup/cash/notificationsettings/clientsync/v1/ui_notification_settings.proto");
        ADAPTER = uiNotificationSettings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiNotificationSettings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiNotificationSettings(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.category_preferences = TransactorKt.immutableCopyOf("category_preferences", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiNotificationSettings)) {
            return false;
        }
        UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) obj;
        return Intrinsics.areEqual(unknownFields(), uiNotificationSettings.unknownFields()) && Intrinsics.areEqual(this.category_preferences, uiNotificationSettings.category_preferences);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.category_preferences.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(23, false);
        builder.applets = this.category_preferences;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.category_preferences;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("category_preferences=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiNotificationSettings{", "}", 0, null, null, 56);
    }
}
