package com.squareup.protos.cash.p2p.profile_directory.ui;

import android.os.Parcelable;
import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.pools.PoolParticipant;
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

/* loaded from: classes7.dex */
public final class Button extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Button> CREATOR;
    public final ButtonAction action_type;
    public final String action_url;
    public final Color background_color;
    public final ButtonSize button_size;
    public final ButtonStyle button_style;
    public final ErrorEvent.Companion content;
    public final ShopInfoHalfSheet half_sheet;

    public enum ButtonAction implements WireEnum {
        DISMISS(1),
        URL(2),
        HALF_SHEET(3);

        public final int value;
        public static final ContactAliasType.Companion Companion = new ContactAliasType.Companion();
        public static final Button$ButtonAction$Companion$ADAPTER$1 ADAPTER = new Button$ButtonAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ButtonAction.class), Syntax.PROTO_2, null);

        ButtonAction(int i) {
            this.value = i;
        }

        public static final ButtonAction fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return DISMISS;
            }
            if (i == 2) {
                return URL;
            }
            if (i != 3) {
                return null;
            }
            return HALF_SHEET;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum ButtonSize implements WireEnum {
        SMALL(1),
        LARGE(2);

        public final int value;
        public static final RetailerType.Companion Companion = new RetailerType.Companion();
        public static final Button$ButtonSize$Companion$ADAPTER$1 ADAPTER = new Button$ButtonSize$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ButtonSize.class), Syntax.PROTO_2, null);

        ButtonSize(int i) {
            this.value = i;
        }

        public static final ButtonSize fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SMALL;
            }
            if (i != 2) {
                return null;
            }
            return LARGE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum ButtonStyle implements WireEnum {
        PRIMARY(1),
        SECONDARY(2),
        TERTIARY(3),
        OUTLINE(4);

        public final int value;
        public static final Origin.Companion Companion = new Origin.Companion();
        public static final Button$ButtonStyle$Companion$ADAPTER$1 ADAPTER = new Button$ButtonStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ButtonStyle.class), Syntax.PROTO_2, null);

        ButtonStyle(int i) {
            this.value = i;
        }

        public static final ButtonStyle fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PRIMARY;
            }
            if (i == 2) {
                return SECONDARY;
            }
            if (i == 3) {
                return TERTIARY;
            }
            if (i != 4) {
                return null;
            }
            return OUTLINE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Button$Companion$ADAPTER$1 button$Companion$ADAPTER$1 = new Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.p2p.profile_directory.ui.Button", Syntax.PROTO_2, null, "squareup/cash/p2p/profile_directory/ui/UIElements.proto");
        ADAPTER = button$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(button$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Button(ButtonAction buttonAction, String str, ShopInfoHalfSheet shopInfoHalfSheet, Color color, ErrorEvent.Companion companion, ButtonStyle buttonStyle, ButtonSize buttonSize, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action_type = buttonAction;
        this.action_url = str;
        this.half_sheet = shopInfoHalfSheet;
        this.background_color = color;
        this.content = companion;
        this.button_style = buttonStyle;
        this.button_size = buttonSize;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && this.action_type == button.action_type && Intrinsics.areEqual(this.action_url, button.action_url) && Intrinsics.areEqual(this.half_sheet, button.half_sheet) && Intrinsics.areEqual(this.background_color, button.background_color) && Intrinsics.areEqual(this.content, button.content) && this.button_style == button.button_style && this.button_size == button.button_size;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ButtonAction buttonAction = this.action_type;
        int hashCode2 = (hashCode + (buttonAction != null ? buttonAction.hashCode() : 0)) * 37;
        String str = this.action_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ShopInfoHalfSheet shopInfoHalfSheet = this.half_sheet;
        int hashCode4 = (hashCode3 + (shopInfoHalfSheet != null ? shopInfoHalfSheet.hashCode() : 0)) * 37;
        Color color = this.background_color;
        int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
        ErrorEvent.Companion companion = this.content;
        int hashCode6 = (hashCode5 + (companion != null ? companion.hashCode() : 0)) * 37;
        ButtonStyle buttonStyle = this.button_style;
        int hashCode7 = (hashCode6 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 37;
        ButtonSize buttonSize = this.button_size;
        int hashCode8 = hashCode7 + (buttonSize != null ? buttonSize.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(9);
        builder.full_name = this.action_type;
        builder.customer_identifier = this.action_url;
        builder.profile_photo_url = this.half_sheet;
        builder.cashtag = this.background_color;
        builder.added_at = this.content;
        builder.participant_type = this.button_style;
        builder.aggregated_contribution_amount = this.button_size;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ButtonAction buttonAction = this.action_type;
        if (buttonAction != null) {
            arrayList.add("action_type=" + buttonAction);
        }
        if (this.action_url != null) {
            arrayList.add("action_url=██");
        }
        ShopInfoHalfSheet shopInfoHalfSheet = this.half_sheet;
        if (shopInfoHalfSheet != null) {
            arrayList.add("half_sheet=" + shopInfoHalfSheet);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        if (this.content != null) {
            arrayList.add("content=██");
        }
        ButtonStyle buttonStyle = this.button_style;
        if (buttonStyle != null) {
            arrayList.add("button_style=" + buttonStyle);
        }
        ButtonSize buttonSize = this.button_size;
        if (buttonSize != null) {
            arrayList.add("button_size=" + buttonSize);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
    }
}
