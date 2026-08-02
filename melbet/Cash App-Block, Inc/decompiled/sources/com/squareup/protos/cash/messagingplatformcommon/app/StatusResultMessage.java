package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjw;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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

/* loaded from: classes7.dex */
public final class StatusResultMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StatusResultMessage> CREATOR;
    public final AppMessageAction action;
    public final Placement placement;
    public final String subtitle;
    public final String title;
    public final zzjw visualAsset;

    public enum Placement implements WireEnum {
        CASH_IN_SUCCESS(1),
        CASH_IN_FAILURE(2),
        CASH_OUT_SUCCESS(3),
        ISSUED_CARD_ACTIVATED_PHYSICAL_CARD_REQUESTED(4),
        PHYSICAL_CARD_REQUEST_SUCCESS(5);

        public final int value;
        public static final Origin.Companion Companion = new Origin.Companion();
        public static final StatusResultMessage$Placement$Companion$ADAPTER$1 ADAPTER = new StatusResultMessage$Placement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Placement.class), Syntax.PROTO_2, null);

        Placement(int i) {
            this.value = i;
        }

        public static final Placement fromValue(int i) {
            Companion.getClass();
            return Origin.Companion.m3885fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        StatusResultMessage$Companion$ADAPTER$1 statusResultMessage$Companion$ADAPTER$1 = new StatusResultMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StatusResultMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.StatusResultMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = statusResultMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(statusResultMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusResultMessage(Placement placement, zzjw zzjwVar, String str, String str2, AppMessageAction appMessageAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.placement = placement;
        this.visualAsset = zzjwVar;
        this.title = str;
        this.subtitle = str2;
        this.action = appMessageAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StatusResultMessage)) {
            return false;
        }
        StatusResultMessage statusResultMessage = (StatusResultMessage) obj;
        return Intrinsics.areEqual(unknownFields(), statusResultMessage.unknownFields()) && this.placement == statusResultMessage.placement && Intrinsics.areEqual(this.visualAsset, statusResultMessage.visualAsset) && Intrinsics.areEqual(this.title, statusResultMessage.title) && Intrinsics.areEqual(this.subtitle, statusResultMessage.subtitle) && Intrinsics.areEqual(this.action, statusResultMessage.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Placement placement = this.placement;
        int hashCode2 = (hashCode + (placement != null ? placement.hashCode() : 0)) * 37;
        zzjw zzjwVar = this.visualAsset;
        int hashCode3 = (hashCode2 + (zzjwVar != null ? zzjwVar.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.action;
        int hashCode6 = hashCode5 + (appMessageAction != null ? appMessageAction.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(23);
        builder.icon = this.placement;
        builder.title = this.visualAsset;
        builder.subtitle = this.title;
        builder.action = this.subtitle;
        builder.icon_background_color = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Placement placement = this.placement;
        if (placement != null) {
            arrayList.add("placement=" + placement);
        }
        zzjw zzjwVar = this.visualAsset;
        if (zzjwVar != null) {
            arrayList.add("visualAsset=" + zzjwVar);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        AppMessageAction appMessageAction = this.action;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("action=", appMessageAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StatusResultMessage{", "}", 0, null, null, 56);
    }
}
