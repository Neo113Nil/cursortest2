package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.ui.Color;
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
import okio.Path;

/* loaded from: classes.dex */
public final class HalfSheetMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HalfSheetMessage> CREATOR;
    public final Color gradient_color;
    public final String message_subtitle;
    public final String message_title;
    public final OverlayColorTreatment overlay_color_treatment;
    public final Placement placement;
    public final AppMessageAction primary_navigation_action;
    public final zzjr secondaryNavigationAction;
    public final ShareSheet share_sheet;
    public final HalfSheetMessage$VisualAsset$Image visualAsset;

    /* loaded from: classes7.dex */
    public enum OverlayColorTreatment implements WireEnum {
        GRADIENT(1),
        SOLID(2);

        public final int value;
        public static final ContactAliasType.Companion Companion = new ContactAliasType.Companion();
        public static final HalfSheetMessage$OverlayColorTreatment$Companion$ADAPTER$1 ADAPTER = new HalfSheetMessage$OverlayColorTreatment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OverlayColorTreatment.class), Syntax.PROTO_2, null);

        OverlayColorTreatment(int i) {
            this.value = i;
        }

        public static final OverlayColorTreatment fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return GRADIENT;
            }
            if (i != 2) {
                return null;
            }
            return SOLID;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Placement implements WireEnum {
        BALANCE_TAB(1),
        CARD_TAB(2),
        PAYMENT_PAD_TAB(3);

        public final int value;
        public static final Path.Companion Companion = new Path.Companion();
        public static final HalfSheetMessage$Placement$Companion$ADAPTER$1 ADAPTER = new HalfSheetMessage$Placement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Placement.class), Syntax.PROTO_2, null);

        Placement(int i) {
            this.value = i;
        }

        public static final Placement fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return BALANCE_TAB;
            }
            if (i == 2) {
                return CARD_TAB;
            }
            if (i != 3) {
                return null;
            }
            return PAYMENT_PAD_TAB;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        HalfSheetMessage$Companion$ADAPTER$1 halfSheetMessage$Companion$ADAPTER$1 = new HalfSheetMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HalfSheetMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.HalfSheetMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = halfSheetMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(halfSheetMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalfSheetMessage(Placement placement, HalfSheetMessage$VisualAsset$Image halfSheetMessage$VisualAsset$Image, String str, String str2, Color color, AppMessageAction appMessageAction, zzjr zzjrVar, ShareSheet shareSheet, OverlayColorTreatment overlayColorTreatment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.placement = placement;
        this.visualAsset = halfSheetMessage$VisualAsset$Image;
        this.message_title = str;
        this.message_subtitle = str2;
        this.gradient_color = color;
        this.primary_navigation_action = appMessageAction;
        this.secondaryNavigationAction = zzjrVar;
        this.share_sheet = shareSheet;
        this.overlay_color_treatment = overlayColorTreatment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HalfSheetMessage)) {
            return false;
        }
        HalfSheetMessage halfSheetMessage = (HalfSheetMessage) obj;
        return Intrinsics.areEqual(unknownFields(), halfSheetMessage.unknownFields()) && this.placement == halfSheetMessage.placement && Intrinsics.areEqual(this.visualAsset, halfSheetMessage.visualAsset) && Intrinsics.areEqual(this.message_title, halfSheetMessage.message_title) && Intrinsics.areEqual(this.message_subtitle, halfSheetMessage.message_subtitle) && Intrinsics.areEqual(this.gradient_color, halfSheetMessage.gradient_color) && Intrinsics.areEqual(this.primary_navigation_action, halfSheetMessage.primary_navigation_action) && Intrinsics.areEqual(this.secondaryNavigationAction, halfSheetMessage.secondaryNavigationAction) && Intrinsics.areEqual(this.share_sheet, halfSheetMessage.share_sheet) && this.overlay_color_treatment == halfSheetMessage.overlay_color_treatment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Placement placement = this.placement;
        int hashCode2 = (hashCode + (placement != null ? placement.hashCode() : 0)) * 37;
        HalfSheetMessage$VisualAsset$Image halfSheetMessage$VisualAsset$Image = this.visualAsset;
        int hashCode3 = (hashCode2 + (halfSheetMessage$VisualAsset$Image != null ? halfSheetMessage$VisualAsset$Image.hashCode() : 0)) * 37;
        String str = this.message_title;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message_subtitle;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Color color = this.gradient_color;
        int hashCode6 = (hashCode5 + (color != null ? color.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.primary_navigation_action;
        int hashCode7 = (hashCode6 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
        zzjr zzjrVar = this.secondaryNavigationAction;
        int hashCode8 = (hashCode7 + (zzjrVar != null ? zzjrVar.hashCode() : 0)) * 37;
        ShareSheet shareSheet = this.share_sheet;
        int hashCode9 = (hashCode8 + (shareSheet != null ? shareSheet.hashCode() : 0)) * 37;
        OverlayColorTreatment overlayColorTreatment = this.overlay_color_treatment;
        int hashCode10 = hashCode9 + (overlayColorTreatment != null ? overlayColorTreatment.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(28, false);
        builder.locale = this.placement;
        builder.title = this.visualAsset;
        builder.info_rows_header = this.message_title;
        builder.footer_text = this.message_subtitle;
        builder.loadable_subtitle = this.gradient_color;
        builder.info_rows = this.primary_navigation_action;
        builder.primary_footer_button_state = this.secondaryNavigationAction;
        builder.secondary_footer_button_state = this.share_sheet;
        builder.payment_plans_data = this.overlay_color_treatment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Placement placement = this.placement;
        if (placement != null) {
            arrayList.add("placement=" + placement);
        }
        HalfSheetMessage$VisualAsset$Image halfSheetMessage$VisualAsset$Image = this.visualAsset;
        if (halfSheetMessage$VisualAsset$Image != null) {
            arrayList.add("visualAsset=" + halfSheetMessage$VisualAsset$Image);
        }
        String str = this.message_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_title=", arrayList);
        }
        String str2 = this.message_subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message_subtitle=", arrayList);
        }
        Color color = this.gradient_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("gradient_color=", color, arrayList);
        }
        AppMessageAction appMessageAction = this.primary_navigation_action;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("primary_navigation_action=", appMessageAction, arrayList);
        }
        zzjr zzjrVar = this.secondaryNavigationAction;
        if (zzjrVar != null) {
            arrayList.add("secondaryNavigationAction=" + zzjrVar);
        }
        ShareSheet shareSheet = this.share_sheet;
        if (shareSheet != null) {
            arrayList.add("share_sheet=" + shareSheet);
        }
        OverlayColorTreatment overlayColorTreatment = this.overlay_color_treatment;
        if (overlayColorTreatment != null) {
            arrayList.add("overlay_color_treatment=" + overlayColorTreatment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HalfSheetMessage{", "}", 0, null, null, 56);
    }
}
