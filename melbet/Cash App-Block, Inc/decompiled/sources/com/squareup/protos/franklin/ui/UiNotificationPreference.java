package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
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
public final class UiNotificationPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiNotificationPreference> CREATOR;
    public final UiAlias alias;
    public final Boolean enabled;

    static {
        UiNotificationPreference$Companion$ADAPTER$1 uiNotificationPreference$Companion$ADAPTER$1 = new UiNotificationPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiNotificationPreference.class), "type.googleapis.com/squareup.franklin.ui.UiNotificationPreference", Syntax.PROTO_2, null, "squareup/franklin/ui/notification_preference.proto");
        ADAPTER = uiNotificationPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiNotificationPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiNotificationPreference(UiAlias uiAlias, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.alias = uiAlias;
        this.enabled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiNotificationPreference)) {
            return false;
        }
        UiNotificationPreference uiNotificationPreference = (UiNotificationPreference) obj;
        return Intrinsics.areEqual(unknownFields(), uiNotificationPreference.unknownFields()) && Intrinsics.areEqual(this.alias, uiNotificationPreference.alias) && Intrinsics.areEqual(this.enabled, uiNotificationPreference.enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiAlias uiAlias = this.alias;
        int hashCode2 = (hashCode + (uiAlias != null ? uiAlias.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(4);
        builder.f1411android = this.alias;
        builder.ios = this.enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiAlias uiAlias = this.alias;
        if (uiAlias != null) {
            arrayList.add("alias=" + uiAlias);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiNotificationPreference{", "}", 0, null, null, 56);
    }
}
