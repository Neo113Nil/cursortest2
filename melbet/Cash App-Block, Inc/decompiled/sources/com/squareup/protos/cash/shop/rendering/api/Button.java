package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Transfer;
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
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes8.dex */
public final class Button extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Button> CREATOR;
    public final Icon arcade_icon;
    public final Color background_color;
    public final ButtonProminence button_prominence;
    public final Image icon;
    public final LocalizedString l_text;
    public final Prominence prominence;
    public final StyledText styled_text;
    public final TapAction tap_action;
    public final String text;

    public enum Prominence implements WireEnum {
        UNSPECIFIED(0),
        STANDARD(1),
        PROMINENT(2),
        SUBTLE(3);

        public static final Button$Prominence$Companion$ADAPTER$1 ADAPTER;
        public static final TransactionType.Companion Companion;
        public final int value;

        static {
            Prominence prominence = UNSPECIFIED;
            Companion = new TransactionType.Companion();
            ADAPTER = new Button$Prominence$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Prominence.class), Syntax.PROTO_2, prominence);
        }

        Prominence(int i) {
            this.value = i;
        }

        public static final Prominence fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return STANDARD;
            }
            if (i == 2) {
                return PROMINENT;
            }
            if (i != 3) {
                return null;
            }
            return SUBTLE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Button$Companion$ADAPTER$1 button$Companion$ADAPTER$1 = new Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.shop.rendering.api.Button", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TapActions.proto");
        ADAPTER = button$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(button$Companion$ADAPTER$1);
    }

    public /* synthetic */ Button(TapAction tapAction, Prominence prominence, LocalizedString localizedString, Icon icon, Image image, StyledText styledText, ButtonProminence buttonProminence, int i) {
        this((i & 1) != 0 ? null : tapAction, (i & 2) != 0 ? null : prominence, (i & 4) != 0 ? null : localizedString, (i & 8) != 0 ? null : icon, (i & 16) != 0 ? null : image, (i & 32) != 0 ? null : styledText, (i & 64) != 0 ? null : "Reset", null, (i & 256) != 0 ? null : buttonProminence, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.tap_action, button.tap_action) && this.prominence == button.prominence && Intrinsics.areEqual(this.l_text, button.l_text) && Intrinsics.areEqual(this.arcade_icon, button.arcade_icon) && Intrinsics.areEqual(this.icon, button.icon) && Intrinsics.areEqual(this.styled_text, button.styled_text) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.background_color, button.background_color) && this.button_prominence == button.button_prominence;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TapAction tapAction = this.tap_action;
        int hashCode2 = (hashCode + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        Prominence prominence = this.prominence;
        int hashCode3 = (hashCode2 + (prominence != null ? prominence.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.l_text;
        int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Icon icon = this.arcade_icon;
        int hashCode5 = (hashCode4 + (icon != null ? icon.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode6 = (hashCode5 + (image != null ? image.hashCode() : 0)) * 37;
        StyledText styledText = this.styled_text;
        int hashCode7 = (hashCode6 + (styledText != null ? styledText.hashCode() : 0)) * 37;
        String str = this.text;
        int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 37;
        Color color = this.background_color;
        int hashCode9 = (hashCode8 + (color != null ? color.hashCode() : 0)) * 37;
        ButtonProminence buttonProminence = this.button_prominence;
        int hashCode10 = hashCode9 + (buttonProminence != null ? buttonProminence.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(1, false);
        builder.source = this.tap_action;
        builder.target = this.prominence;
        builder.state = this.l_text;
        builder.amount = this.arcade_icon;
        builder.push_amount = this.icon;
        builder.created_at = this.styled_text;
        builder.token = this.text;
        builder.completed_at = this.background_color;
        builder.failed_at = this.button_prominence;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
        }
        Prominence prominence = this.prominence;
        if (prominence != null) {
            arrayList.add("prominence=" + prominence);
        }
        LocalizedString localizedString = this.l_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_text=", localizedString, arrayList);
        }
        Icon icon = this.arcade_icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        StyledText styledText = this.styled_text;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("styled_text=", styledText, arrayList);
        }
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        ButtonProminence buttonProminence = this.button_prominence;
        if (buttonProminence != null) {
            arrayList.add("button_prominence=" + buttonProminence);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Button(TapAction tapAction, Prominence prominence, LocalizedString localizedString, Icon icon, Image image, StyledText styledText, String str, Color color, ButtonProminence buttonProminence, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.tap_action = tapAction;
        this.prominence = prominence;
        this.l_text = localizedString;
        this.arcade_icon = icon;
        this.icon = image;
        this.styled_text = styledText;
        this.text = str;
        this.background_color = color;
        this.button_prominence = buttonProminence;
    }
}
