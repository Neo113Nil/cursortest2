package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzju;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.pools.PoolParticipant;
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
import okio.internal.ResourceFileSystem;

/* loaded from: classes7.dex */
public final class InlineMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InlineMessage> CREATOR;
    public final Boolean cannot_be_dismissed;
    public final String message_subtitle;
    public final String message_title;
    public final Placement placement;
    public final AppMessageAction primary_navigation_action;
    public final AppMessageAction secondary_navigation_action;
    public final zzju visualAsset;

    /* loaded from: classes.dex */
    public enum Placement implements WireEnum {
        ACTIVITY_TAB(1),
        PROFILE_SCREEN(2);

        public final int value;
        public static final ResourceFileSystem.Companion Companion = new ResourceFileSystem.Companion();
        public static final InlineMessage$Placement$Companion$ADAPTER$1 ADAPTER = new InlineMessage$Placement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Placement.class), Syntax.PROTO_2, null);

        Placement(int i) {
            this.value = i;
        }

        public static final Placement fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ACTIVITY_TAB;
            }
            if (i != 2) {
                return null;
            }
            return PROFILE_SCREEN;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        InlineMessage$Companion$ADAPTER$1 inlineMessage$Companion$ADAPTER$1 = new InlineMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InlineMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.InlineMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = inlineMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inlineMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineMessage(Placement placement, zzju zzjuVar, String str, String str2, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.placement = placement;
        this.visualAsset = zzjuVar;
        this.message_title = str;
        this.message_subtitle = str2;
        this.primary_navigation_action = appMessageAction;
        this.secondary_navigation_action = appMessageAction2;
        this.cannot_be_dismissed = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InlineMessage)) {
            return false;
        }
        InlineMessage inlineMessage = (InlineMessage) obj;
        return Intrinsics.areEqual(unknownFields(), inlineMessage.unknownFields()) && this.placement == inlineMessage.placement && Intrinsics.areEqual(this.visualAsset, inlineMessage.visualAsset) && Intrinsics.areEqual(this.message_title, inlineMessage.message_title) && Intrinsics.areEqual(this.message_subtitle, inlineMessage.message_subtitle) && Intrinsics.areEqual(this.primary_navigation_action, inlineMessage.primary_navigation_action) && Intrinsics.areEqual(this.secondary_navigation_action, inlineMessage.secondary_navigation_action) && Intrinsics.areEqual(this.cannot_be_dismissed, inlineMessage.cannot_be_dismissed);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Placement placement = this.placement;
        int hashCode2 = (hashCode + (placement != null ? placement.hashCode() : 0)) * 37;
        zzju zzjuVar = this.visualAsset;
        int hashCode3 = (hashCode2 + (zzjuVar != null ? zzjuVar.hashCode() : 0)) * 37;
        String str = this.message_title;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message_subtitle;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.primary_navigation_action;
        int hashCode6 = (hashCode5 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction2 = this.secondary_navigation_action;
        int hashCode7 = (hashCode6 + (appMessageAction2 != null ? appMessageAction2.hashCode() : 0)) * 37;
        Boolean bool = this.cannot_be_dismissed;
        int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(7);
        builder.profile_photo_url = this.placement;
        builder.cashtag = this.visualAsset;
        builder.customer_identifier = this.message_title;
        builder.full_name = this.message_subtitle;
        builder.added_at = this.primary_navigation_action;
        builder.participant_type = this.secondary_navigation_action;
        builder.aggregated_contribution_amount = this.cannot_be_dismissed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Placement placement = this.placement;
        if (placement != null) {
            arrayList.add("placement=" + placement);
        }
        zzju zzjuVar = this.visualAsset;
        if (zzjuVar != null) {
            arrayList.add("visualAsset=" + zzjuVar);
        }
        String str = this.message_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_title=", arrayList);
        }
        String str2 = this.message_subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message_subtitle=", arrayList);
        }
        AppMessageAction appMessageAction = this.primary_navigation_action;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("primary_navigation_action=", appMessageAction, arrayList);
        }
        AppMessageAction appMessageAction2 = this.secondary_navigation_action;
        if (appMessageAction2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("secondary_navigation_action=", appMessageAction2, arrayList);
        }
        Boolean bool = this.cannot_be_dismissed;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cannot_be_dismissed=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InlineMessage{", "}", 0, null, null, 56);
    }
}
