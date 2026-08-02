package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzjf;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
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
import squareup.cash.earnings.ActionButton;

/* loaded from: classes8.dex */
public final class AfterpayPrepurchaseData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayPrepurchaseData> CREATOR;
    public final PrepurchaseAfterpayAppletData applet_data;
    public final CardsEntryPoint cards_entry_point;

    public final class CardsEntryPoint extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardsEntryPoint> CREATOR;
        public final AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint entry_point;

        public final class ToggleEntrypointData extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ToggleEntrypointData> CREATOR;
            public final Icon icon;
            public final LocalizedString info_text;
            public final Boolean is_enabled;
            public final LocalizedString main_text;
            public final Action toggle_action;
            public final Button view_detail_button;

            public final class Action extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Action> CREATOR;
                public final zzjf action;

                static {
                    AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Companion$ADAPTER$1 afterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Companion$ADAPTER$1 = new AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.lending.sync_values.AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = afterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Action(zzjf zzjfVar, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.action = zzjfVar;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Action)) {
                        return false;
                    }
                    Action action = (Action) obj;
                    return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.action, action.action);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    zzjf zzjfVar = this.action;
                    int hashCode2 = hashCode + (zzjfVar != null ? zzjfVar.hashCode() : 0);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    UiCashLimits.Builder builder = new UiCashLimits.Builder(24);
                    builder.cash_limit_group = this.action;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    zzjf zzjfVar = this.action;
                    if (zzjfVar != null) {
                        arrayList.add("action=" + zzjfVar);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
                }
            }

            public final class Button extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Button> CREATOR;
                public final LocalizedString button_text;
                public final String client_route;

                static {
                    AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Button$Companion$ADAPTER$1 afterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Button$Companion$ADAPTER$1 = new AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.lending.sync_values.AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = afterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Button$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Button$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Button(LocalizedString localizedString, String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.button_text = localizedString;
                    this.client_route = str;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.button_text, button.button_text) && Intrinsics.areEqual(this.client_route, button.client_route);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalizedString localizedString = this.button_text;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    String str = this.client_route;
                    int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
                    this.hashCode = hashCode3;
                    return hashCode3;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ActionButton.Builder builder = new ActionButton.Builder(3);
                    builder.title = this.button_text;
                    builder.client_route = this.client_route;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalizedString localizedString = this.button_text;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString, arrayList);
                    }
                    String str = this.client_route;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
                }
            }

            static {
                AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Companion$ADAPTER$1 afterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Companion$ADAPTER$1 = new AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ToggleEntrypointData.class), "type.googleapis.com/squareup.lending.sync_values.AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = afterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ToggleEntrypointData(LocalizedString localizedString, LocalizedString localizedString2, Action action, Boolean bool, Button button, Icon icon, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.main_text = localizedString;
                this.info_text = localizedString2;
                this.toggle_action = action;
                this.is_enabled = bool;
                this.view_detail_button = button;
                this.icon = icon;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ToggleEntrypointData)) {
                    return false;
                }
                ToggleEntrypointData toggleEntrypointData = (ToggleEntrypointData) obj;
                return Intrinsics.areEqual(unknownFields(), toggleEntrypointData.unknownFields()) && Intrinsics.areEqual(this.main_text, toggleEntrypointData.main_text) && Intrinsics.areEqual(this.info_text, toggleEntrypointData.info_text) && Intrinsics.areEqual(this.toggle_action, toggleEntrypointData.toggle_action) && Intrinsics.areEqual(this.is_enabled, toggleEntrypointData.is_enabled) && Intrinsics.areEqual(this.view_detail_button, toggleEntrypointData.view_detail_button) && Intrinsics.areEqual(this.icon, toggleEntrypointData.icon);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.main_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.info_text;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                Action action = this.toggle_action;
                int hashCode4 = (hashCode3 + (action != null ? action.hashCode() : 0)) * 37;
                Boolean bool = this.is_enabled;
                int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                Button button = this.view_detail_button;
                int hashCode6 = (hashCode5 + (button != null ? button.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode7 = hashCode6 + (icon != null ? icon.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiPublicProfile.Builder builder = new UiPublicProfile.Builder(17, false);
                builder.full_name = this.main_text;
                builder.photo_url = this.info_text;
                builder.synopsis = this.toggle_action;
                builder.cashtag_url_enabled = this.is_enabled;
                builder.full_cashtag = this.view_detail_button;
                builder.is_verified_account = this.icon;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.main_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("main_text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.info_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("info_text=", localizedString2, arrayList);
                }
                Action action = this.toggle_action;
                if (action != null) {
                    arrayList.add("toggle_action=" + action);
                }
                Boolean bool = this.is_enabled;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("is_enabled=", bool, arrayList);
                }
                Button button = this.view_detail_button;
                if (button != null) {
                    arrayList.add("view_detail_button=" + button);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ToggleEntrypointData{", "}", 0, null, null, 56);
            }
        }

        static {
            AfterpayPrepurchaseData$CardsEntryPoint$Companion$ADAPTER$1 afterpayPrepurchaseData$CardsEntryPoint$Companion$ADAPTER$1 = new AfterpayPrepurchaseData$CardsEntryPoint$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardsEntryPoint.class), "type.googleapis.com/squareup.lending.sync_values.AfterpayPrepurchaseData.CardsEntryPoint", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
            ADAPTER = afterpayPrepurchaseData$CardsEntryPoint$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayPrepurchaseData$CardsEntryPoint$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardsEntryPoint(AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.entry_point = afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardsEntryPoint)) {
                return false;
            }
            CardsEntryPoint cardsEntryPoint = (CardsEntryPoint) obj;
            return Intrinsics.areEqual(unknownFields(), cardsEntryPoint.unknownFields()) && Intrinsics.areEqual(this.entry_point, cardsEntryPoint.entry_point);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint = this.entry_point;
            int hashCode2 = hashCode + (afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint != null ? afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiCashLimits.Builder builder = new UiCashLimits.Builder(23);
            builder.cash_limit_group = this.entry_point;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint = this.entry_point;
            if (afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint != null) {
                arrayList.add("entry_point=" + afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardsEntryPoint{", "}", 0, null, null, 56);
        }
    }

    static {
        AfterpayPrepurchaseData$Companion$ADAPTER$1 afterpayPrepurchaseData$Companion$ADAPTER$1 = new AfterpayPrepurchaseData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayPrepurchaseData.class), "type.googleapis.com/squareup.lending.sync_values.AfterpayPrepurchaseData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = afterpayPrepurchaseData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayPrepurchaseData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayPrepurchaseData(CardsEntryPoint cardsEntryPoint, PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cards_entry_point = cardsEntryPoint;
        this.applet_data = prepurchaseAfterpayAppletData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayPrepurchaseData)) {
            return false;
        }
        AfterpayPrepurchaseData afterpayPrepurchaseData = (AfterpayPrepurchaseData) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayPrepurchaseData.unknownFields()) && Intrinsics.areEqual(this.cards_entry_point, afterpayPrepurchaseData.cards_entry_point) && Intrinsics.areEqual(this.applet_data, afterpayPrepurchaseData.applet_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardsEntryPoint cardsEntryPoint = this.cards_entry_point;
        int hashCode2 = (hashCode + (cardsEntryPoint != null ? cardsEntryPoint.hashCode() : 0)) * 37;
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = this.applet_data;
        int hashCode3 = hashCode2 + (prepurchaseAfterpayAppletData != null ? prepurchaseAfterpayAppletData.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(11);
        builder.f1411android = this.cards_entry_point;
        builder.ios = this.applet_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardsEntryPoint cardsEntryPoint = this.cards_entry_point;
        if (cardsEntryPoint != null) {
            arrayList.add("cards_entry_point=" + cardsEntryPoint);
        }
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = this.applet_data;
        if (prepurchaseAfterpayAppletData != null) {
            arrayList.add("applet_data=" + prepurchaseAfterpayAppletData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayPrepurchaseData{", "}", 0, null, null, 56);
    }
}
