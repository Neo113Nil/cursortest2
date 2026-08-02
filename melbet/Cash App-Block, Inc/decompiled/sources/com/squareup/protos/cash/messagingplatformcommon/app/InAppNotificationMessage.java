package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ActionEvent;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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
public final class InAppNotificationMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InAppNotificationMessage> CREATOR;
    public final AppMessageAction action;
    public final Integer duration;
    public final ActionEvent.Usr.Companion visualAsset;

    static {
        InAppNotificationMessage$Companion$ADAPTER$1 inAppNotificationMessage$Companion$ADAPTER$1 = new InAppNotificationMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InAppNotificationMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.InAppNotificationMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = inAppNotificationMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inAppNotificationMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppNotificationMessage(Integer num, ActionEvent.Usr.Companion companion, AppMessageAction appMessageAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.duration = num;
        this.visualAsset = companion;
        this.action = appMessageAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InAppNotificationMessage)) {
            return false;
        }
        InAppNotificationMessage inAppNotificationMessage = (InAppNotificationMessage) obj;
        return Intrinsics.areEqual(unknownFields(), inAppNotificationMessage.unknownFields()) && Intrinsics.areEqual(this.duration, inAppNotificationMessage.duration) && Intrinsics.areEqual(this.visualAsset, inAppNotificationMessage.visualAsset) && Intrinsics.areEqual(this.action, inAppNotificationMessage.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.duration;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        ActionEvent.Usr.Companion companion = this.visualAsset;
        int hashCode3 = (hashCode2 + (companion != null ? companion.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.action;
        int hashCode4 = hashCode3 + (appMessageAction != null ? appMessageAction.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(13, false);
        builder.transmission_level = this.duration;
        builder.advertisement_data = this.visualAsset;
        builder.frequency = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.duration;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("duration=", num, arrayList);
        }
        ActionEvent.Usr.Companion companion = this.visualAsset;
        if (companion != null) {
            arrayList.add("visualAsset=" + companion);
        }
        AppMessageAction appMessageAction = this.action;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("action=", appMessageAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InAppNotificationMessage{", "}", 0, null, null, 56);
    }
}
