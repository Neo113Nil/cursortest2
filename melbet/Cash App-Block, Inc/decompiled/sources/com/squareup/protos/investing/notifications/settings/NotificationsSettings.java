package com.squareup.protos.investing.notifications.settings;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class NotificationsSettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationsSettings> CREATOR;
    public final List options;

    static {
        NotificationsSettings$Companion$ADAPTER$1 notificationsSettings$Companion$ADAPTER$1 = new NotificationsSettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationsSettings.class), "type.googleapis.com/squareup.investnotifications.settings.NotificationsSettings", Syntax.PROTO_2, null, "squareup/investing/notifications/settings.proto");
        ADAPTER = notificationsSettings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationsSettings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsSettings(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.options = TransactorKt.immutableCopyOf("options", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationsSettings)) {
            return false;
        }
        NotificationsSettings notificationsSettings = (NotificationsSettings) obj;
        return Intrinsics.areEqual(unknownFields(), notificationsSettings.unknownFields()) && Intrinsics.areEqual(this.options, notificationsSettings.options);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.options.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(8, false);
        builder.items = this.options;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.options;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("options=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationsSettings{", "}", 0, null, null, 56);
    }
}
