package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b%&'$()*+R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0007R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\r¨\u0006,"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$Builder;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "icon", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "getIcon$annotations", "()V", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$HeaderIcon;", "header_icon", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$HeaderIcon;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "description", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "primary_button", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "getPrimary_button$annotations", "", "primary_button_hidden_tap_message", "Ljava/lang/String;", "getPrimary_button_hidden_tap_message$annotations", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$Accessory;", "accessory", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$Accessory;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$TapBehavior;", "tap_behavior", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$TapBehavior;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction;", "header_icon_action", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction;", "", "version", "Ljava/lang/Integer;", "header_icon_action_accessibility_text", "Companion", "Builder", "HeaderIcon", "TapBehavior", "EmojiIcon", "Accessory", "CardTapAction", "CardButtons", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActionCard> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ActionCard$Accessory#ADAPTER", schemaIndex = 6, tag = 6)
    public final Accessory accessory;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 3)
    public final LocalizedString description;

    @WireSealedOneof(schemaIndex = 1)
    public final HeaderIcon header_icon;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ActionCard$CardTapAction#ADAPTER", schemaIndex = 8, tag = 11)
    public final CardTapAction header_icon_action;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 10, tag = 13)
    public final LocalizedString header_icon_action_accessibility_text;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", schemaIndex = 0, tag = 1)
    public final UiAvatar icon;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ActionableButtonDefault#ADAPTER", schemaIndex = 4, tag = 4)
    public final ActionableButtonDefault primary_button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 5)
    public final String primary_button_hidden_tap_message;

    @WireSealedOneof(schemaIndex = 7)
    public final TapBehavior tap_behavior;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 2)
    public final LocalizedString title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 9, tag = 12)
    public final Integer version;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$Accessory;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$Accessory$Builder;", "Lcom/squareup/protos/cash/ui/Icon;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "accessibility_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Accessory extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Accessory> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString accessibility_text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 0, tag = 1)
        public final Icon icon;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$Accessory$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$Accessory;", "<init>", "()V", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "accessibility_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString accessibility_text;
            public Icon icon;

            public final Builder accessibility_text(LocalizedString accessibility_text) {
                this.accessibility_text = accessibility_text;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Accessory build() {
                return new Accessory(this.icon, this.accessibility_text, buildUnknownFields());
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }
        }

        static {
            ActionCard$Accessory$Companion$ADAPTER$1 actionCard$Accessory$Companion$ADAPTER$1 = new ActionCard$Accessory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Accessory.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ActionCard.Accessory", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = actionCard$Accessory$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(actionCard$Accessory$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Accessory(Icon icon, LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = icon;
            this.accessibility_text = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Accessory)) {
                return false;
            }
            Accessory accessory = (Accessory) obj;
            return Intrinsics.areEqual(unknownFields(), accessory.unknownFields()) && Intrinsics.areEqual(this.icon, accessory.icon) && Intrinsics.areEqual(this.accessibility_text, accessory.accessibility_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.accessibility_text;
            int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.icon = this.icon;
            builder.accessibility_text = this.accessibility_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            LocalizedString localizedString = this.accessibility_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Accessory{", "}", 0, null, null, 56);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0012\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard;", "<init>", "()V", "icon", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "header_icon", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$HeaderIcon;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "description", "primary_button", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "primary_button_hidden_tap_message", "", "accessory", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$Accessory;", "tap_behavior", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$TapBehavior;", "header_icon_action", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction;", "version", "", "Ljava/lang/Integer;", "header_icon_action_accessibility_text", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Accessory accessory;
        public LocalizedString description;
        public HeaderIcon header_icon;
        public CardTapAction header_icon_action;
        public LocalizedString header_icon_action_accessibility_text;
        public UiAvatar icon;
        public ActionableButtonDefault primary_button;
        public String primary_button_hidden_tap_message;
        public TapBehavior tap_behavior;
        public LocalizedString title;
        public Integer version;

        public final Builder accessory(Accessory accessory) {
            this.accessory = accessory;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActionCard build() {
            return new ActionCard(this.icon, this.header_icon, this.title, this.description, this.primary_button, this.primary_button_hidden_tap_message, this.accessory, this.tap_behavior, this.header_icon_action, this.version, this.header_icon_action_accessibility_text, buildUnknownFields());
        }

        public final Builder description(LocalizedString description) {
            this.description = description;
            return this;
        }

        public final Builder header_icon(HeaderIcon header_icon) {
            this.header_icon = header_icon;
            return this;
        }

        public final Builder header_icon_action(CardTapAction header_icon_action) {
            this.header_icon_action = header_icon_action;
            return this;
        }

        public final Builder header_icon_action_accessibility_text(LocalizedString header_icon_action_accessibility_text) {
            this.header_icon_action_accessibility_text = header_icon_action_accessibility_text;
            return this;
        }

        @Deprecated
        public final Builder icon(UiAvatar icon) {
            this.icon = icon;
            return this;
        }

        @Deprecated
        public final Builder primary_button(ActionableButtonDefault primary_button) {
            this.primary_button = primary_button;
            return this;
        }

        @Deprecated
        public final Builder primary_button_hidden_tap_message(String primary_button_hidden_tap_message) {
            this.primary_button_hidden_tap_message = primary_button_hidden_tap_message;
            return this;
        }

        public final Builder tap_behavior(TapBehavior tap_behavior) {
            this.tap_behavior = tap_behavior;
            return this;
        }

        public final Builder title(LocalizedString title) {
            this.title = title;
            return this;
        }

        public final Builder version(Integer version) {
            this.version = version;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons$Builder;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "primary_button", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "", "primary_button_hidden_message", "Ljava/lang/String;", "secondary_button", "secondary_button_hidden_message", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CardButtons extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardButtons> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "squareup.cash.ui.arcade.elements.ActionableButtonDefault#ADAPTER", schemaIndex = 0, tag = 1)
        public final ActionableButtonDefault primary_button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String primary_button_hidden_message;

        @WireField(adapter = "squareup.cash.ui.arcade.elements.ActionableButtonDefault#ADAPTER", schemaIndex = 2, tag = 3)
        public final ActionableButtonDefault secondary_button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String secondary_button_hidden_message;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons;", "<init>", "()V", "primary_button", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "primary_button_hidden_message", "", "secondary_button", "secondary_button_hidden_message", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ActionableButtonDefault primary_button;
            public String primary_button_hidden_message;
            public ActionableButtonDefault secondary_button;
            public String secondary_button_hidden_message;

            @Override // com.squareup.wire.Message.Builder
            public CardButtons build() {
                return new CardButtons(this.primary_button, this.primary_button_hidden_message, this.secondary_button, this.secondary_button_hidden_message, buildUnknownFields());
            }

            public final Builder primary_button(ActionableButtonDefault primary_button) {
                this.primary_button = primary_button;
                return this;
            }

            public final Builder primary_button_hidden_message(String primary_button_hidden_message) {
                this.primary_button_hidden_message = primary_button_hidden_message;
                return this;
            }

            public final Builder secondary_button(ActionableButtonDefault secondary_button) {
                this.secondary_button = secondary_button;
                return this;
            }

            public final Builder secondary_button_hidden_message(String secondary_button_hidden_message) {
                this.secondary_button_hidden_message = secondary_button_hidden_message;
                return this;
            }
        }

        static {
            ActionCard$CardButtons$Companion$ADAPTER$1 actionCard$CardButtons$Companion$ADAPTER$1 = new ActionCard$CardButtons$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardButtons.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ActionCard.CardButtons", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = actionCard$CardButtons$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(actionCard$CardButtons$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardButtons(ActionableButtonDefault actionableButtonDefault, String str, ActionableButtonDefault actionableButtonDefault2, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.primary_button = actionableButtonDefault;
            this.primary_button_hidden_message = str;
            this.secondary_button = actionableButtonDefault2;
            this.secondary_button_hidden_message = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardButtons)) {
                return false;
            }
            CardButtons cardButtons = (CardButtons) obj;
            return Intrinsics.areEqual(unknownFields(), cardButtons.unknownFields()) && Intrinsics.areEqual(this.primary_button, cardButtons.primary_button) && Intrinsics.areEqual(this.primary_button_hidden_message, cardButtons.primary_button_hidden_message) && Intrinsics.areEqual(this.secondary_button, cardButtons.secondary_button) && Intrinsics.areEqual(this.secondary_button_hidden_message, cardButtons.secondary_button_hidden_message);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ActionableButtonDefault actionableButtonDefault = this.primary_button;
            int hashCode2 = (hashCode + (actionableButtonDefault != null ? actionableButtonDefault.hashCode() : 0)) * 37;
            String str = this.primary_button_hidden_message;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            ActionableButtonDefault actionableButtonDefault2 = this.secondary_button;
            int hashCode4 = (hashCode3 + (actionableButtonDefault2 != null ? actionableButtonDefault2.hashCode() : 0)) * 37;
            String str2 = this.secondary_button_hidden_message;
            int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.primary_button = this.primary_button;
            builder.primary_button_hidden_message = this.primary_button_hidden_message;
            builder.secondary_button = this.secondary_button;
            builder.secondary_button_hidden_message = this.secondary_button_hidden_message;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ActionableButtonDefault actionableButtonDefault = this.primary_button;
            if (actionableButtonDefault != null) {
                arrayList.add("primary_button=" + actionableButtonDefault);
            }
            String str = this.primary_button_hidden_message;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_button_hidden_message=", arrayList);
            }
            ActionableButtonDefault actionableButtonDefault2 = this.secondary_button;
            if (actionableButtonDefault2 != null) {
                arrayList.add("secondary_button=" + actionableButtonDefault2);
            }
            String str2 = this.secondary_button_hidden_message;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "secondary_button_hidden_message=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardButtons{", "}", 0, null, null, 56);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\r\u000e\f\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$Builder;", "", "hidden_message", "Ljava/lang/String;", "Lsquareup/cash/analytics/CdfEvent;", "cdf_event", "Lsquareup/cash/analytics/CdfEvent;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$Action;", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$Action;", "Companion", "Builder", "Action", "ClientRouteAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CardTapAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardTapAction> CREATOR;
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 2)
        public final Action action;

        @WireField(adapter = "squareup.cash.analytics.CdfEvent#ADAPTER", schemaIndex = 1, tag = 2)
        public final CdfEvent cdf_event;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String hidden_message;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$Action;", "", "ClientRouteAction", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$Action$ClientRouteAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Action {

            @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ActionCard$CardTapAction$ClientRouteAction#ADAPTER", declaredName = "client_route_action", tag = 3)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$Action$ClientRouteAction;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$Action;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$ClientRouteAction;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$ClientRouteAction;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$ClientRouteAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ClientRouteAction extends Action {
                private final ClientRouteAction value;

                public ClientRouteAction(ClientRouteAction clientRouteAction) {
                    clientRouteAction.getClass();
                    this.value = clientRouteAction;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ClientRouteAction) && Intrinsics.areEqual(this.value, ((ClientRouteAction) obj).value);
                }

                public final ClientRouteAction getValue() {
                    return this.value;
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "ClientRouteAction(value=" + this.value + ")";
                }
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction;", "<init>", "()V", "hidden_message", "", "cdf_event", "Lsquareup/cash/analytics/CdfEvent;", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$Action;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Action action;
            public CdfEvent cdf_event;
            public String hidden_message;

            public final Builder action(Action action) {
                this.action = action;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public CardTapAction build() {
                return new CardTapAction(this.hidden_message, this.cdf_event, this.action, buildUnknownFields());
            }

            public final Builder cdf_event(CdfEvent cdf_event) {
                this.cdf_event = cdf_event;
                return this;
            }

            public final Builder hidden_message(String hidden_message) {
                this.hidden_message = hidden_message;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$ClientRouteAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$ClientRouteAction$Builder;", "", "client_route_url", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ClientRouteAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ClientRouteAction> CREATOR;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String client_route_url;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$ClientRouteAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction$ClientRouteAction;", "<init>", "()V", "client_route_url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String client_route_url;

                @Override // com.squareup.wire.Message.Builder
                public ClientRouteAction build() {
                    return new ClientRouteAction(this.client_route_url, buildUnknownFields());
                }

                public final Builder client_route_url(String client_route_url) {
                    this.client_route_url = client_route_url;
                    return this;
                }
            }

            static {
                ActionCard$CardTapAction$ClientRouteAction$Companion$ADAPTER$1 actionCard$CardTapAction$ClientRouteAction$Companion$ADAPTER$1 = new ActionCard$CardTapAction$ClientRouteAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRouteAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ActionCard.CardTapAction.ClientRouteAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
                ADAPTER = actionCard$CardTapAction$ClientRouteAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(actionCard$CardTapAction$ClientRouteAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClientRouteAction(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.client_route_url = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ClientRouteAction)) {
                    return false;
                }
                ClientRouteAction clientRouteAction = (ClientRouteAction) obj;
                return Intrinsics.areEqual(unknownFields(), clientRouteAction.unknownFields()) && Intrinsics.areEqual(this.client_route_url, clientRouteAction.client_route_url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.client_route_url;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder();
                builder.client_route_url = this.client_route_url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.client_route_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRouteAction{", "}", 0, null, null, 56);
            }
        }

        static {
            ActionCard$CardTapAction$Companion$ADAPTER$1 actionCard$CardTapAction$Companion$ADAPTER$1 = new ActionCard$CardTapAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardTapAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ActionCard.CardTapAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = actionCard$CardTapAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(actionCard$CardTapAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardTapAction(String str, CdfEvent cdfEvent, Action action, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.hidden_message = str;
            this.cdf_event = cdfEvent;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardTapAction)) {
                return false;
            }
            CardTapAction cardTapAction = (CardTapAction) obj;
            return Intrinsics.areEqual(unknownFields(), cardTapAction.unknownFields()) && Intrinsics.areEqual(this.hidden_message, cardTapAction.hidden_message) && Intrinsics.areEqual(this.cdf_event, cardTapAction.cdf_event) && Intrinsics.areEqual(this.action, cardTapAction.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.hidden_message;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            CdfEvent cdfEvent = this.cdf_event;
            int hashCode3 = (hashCode2 + (cdfEvent != null ? cdfEvent.hashCode() : 0)) * 37;
            Action action = this.action;
            int hashCode4 = hashCode3 + (action != null ? action.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.hidden_message = this.hidden_message;
            builder.cdf_event = this.cdf_event;
            builder.action = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.hidden_message;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "hidden_message=", arrayList);
            }
            CdfEvent cdfEvent = this.cdf_event;
            if (cdfEvent != null) {
                arrayList.add("cdf_event=" + cdfEvent);
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardTapAction{", "}", 0, null, null, 56);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$EmojiIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$EmojiIcon$Builder;", "", "icon_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "accessibility_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EmojiIcon extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EmojiIcon> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString accessibility_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String icon_id;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$EmojiIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$EmojiIcon;", "<init>", "()V", "icon_id", "", "accessibility_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString accessibility_text;
            public String icon_id;

            public final Builder accessibility_text(LocalizedString accessibility_text) {
                this.accessibility_text = accessibility_text;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public EmojiIcon build() {
                return new EmojiIcon(this.accessibility_text, this.icon_id, buildUnknownFields());
            }

            public final Builder icon_id(String icon_id) {
                this.icon_id = icon_id;
                return this;
            }
        }

        static {
            ActionCard$EmojiIcon$Companion$ADAPTER$1 actionCard$EmojiIcon$Companion$ADAPTER$1 = new ActionCard$EmojiIcon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EmojiIcon.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ActionCard.EmojiIcon", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = actionCard$EmojiIcon$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(actionCard$EmojiIcon$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmojiIcon(LocalizedString localizedString, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon_id = str;
            this.accessibility_text = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EmojiIcon)) {
                return false;
            }
            EmojiIcon emojiIcon = (EmojiIcon) obj;
            return Intrinsics.areEqual(unknownFields(), emojiIcon.unknownFields()) && Intrinsics.areEqual(this.icon_id, emojiIcon.icon_id) && Intrinsics.areEqual(this.accessibility_text, emojiIcon.accessibility_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.icon_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.accessibility_text;
            int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.icon_id = this.icon_id;
            builder.accessibility_text = this.accessibility_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.icon_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_id=", arrayList);
            }
            LocalizedString localizedString = this.accessibility_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EmojiIcon{", "}", 0, null, null, 56);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$HeaderIcon;", "", "Avatar", "EmojiIcon", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$HeaderIcon$Avatar;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$HeaderIcon$EmojiIcon;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class HeaderIcon {

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", declaredName = "avatar", tag = 9)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$HeaderIcon$Avatar;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$HeaderIcon;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "value", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "getValue", "()Lcom/squareup/protos/franklin/ui/UiAvatar;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Avatar extends HeaderIcon {
            private final UiAvatar value;

            public Avatar(UiAvatar uiAvatar) {
                uiAvatar.getClass();
                this.value = uiAvatar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Avatar) && Intrinsics.areEqual(this.value, ((Avatar) obj).value);
            }

            public final UiAvatar getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Avatar(value=", ")");
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ActionCard$EmojiIcon#ADAPTER", declaredName = "emoji_icon", tag = 10)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$HeaderIcon$EmojiIcon;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$HeaderIcon;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$EmojiIcon;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$EmojiIcon;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$EmojiIcon;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EmojiIcon extends HeaderIcon {
            private final EmojiIcon value;

            public EmojiIcon(EmojiIcon emojiIcon) {
                emojiIcon.getClass();
                this.value = emojiIcon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmojiIcon) && Intrinsics.areEqual(this.value, ((EmojiIcon) obj).value);
            }

            public final EmojiIcon getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EmojiIcon(value=" + this.value + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$TapBehavior;", "", "CardTapAction", "CardButtons", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$TapBehavior$CardButtons;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$TapBehavior$CardTapAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class TapBehavior {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ActionCard$CardButtons#ADAPTER", declaredName = "card_buttons", tag = 8)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$TapBehavior$CardButtons;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$TapBehavior;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardButtons extends TapBehavior {
            private final CardButtons value;

            public CardButtons(CardButtons cardButtons) {
                cardButtons.getClass();
                this.value = cardButtons;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardButtons) && Intrinsics.areEqual(this.value, ((CardButtons) obj).value);
            }

            public final CardButtons getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CardButtons(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ActionCard$CardTapAction#ADAPTER", declaredName = "card_tap_action", tag = 7)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$TapBehavior$CardTapAction;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$TapBehavior;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardTapAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardTapAction extends TapBehavior {
            private final CardTapAction value;

            public CardTapAction(CardTapAction cardTapAction) {
                cardTapAction.getClass();
                this.value = cardTapAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardTapAction) && Intrinsics.areEqual(this.value, ((CardTapAction) obj).value);
            }

            public final CardTapAction getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CardTapAction(value=" + this.value + ")";
            }
        }
    }

    static {
        ActionCard$Companion$ADAPTER$1 actionCard$Companion$ADAPTER$1 = new ActionCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActionCard.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ActionCard", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = actionCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(actionCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionCard(UiAvatar uiAvatar, HeaderIcon headerIcon, LocalizedString localizedString, LocalizedString localizedString2, ActionableButtonDefault actionableButtonDefault, String str, Accessory accessory, TapBehavior tapBehavior, CardTapAction cardTapAction, Integer num, LocalizedString localizedString3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = uiAvatar;
        this.header_icon = headerIcon;
        this.title = localizedString;
        this.description = localizedString2;
        this.primary_button = actionableButtonDefault;
        this.primary_button_hidden_tap_message = str;
        this.accessory = accessory;
        this.tap_behavior = tapBehavior;
        this.header_icon_action = cardTapAction;
        this.version = num;
        this.header_icon_action_accessibility_text = localizedString3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionCard)) {
            return false;
        }
        ActionCard actionCard = (ActionCard) obj;
        return Intrinsics.areEqual(unknownFields(), actionCard.unknownFields()) && Intrinsics.areEqual(this.icon, actionCard.icon) && Intrinsics.areEqual(this.header_icon, actionCard.header_icon) && Intrinsics.areEqual(this.title, actionCard.title) && Intrinsics.areEqual(this.description, actionCard.description) && Intrinsics.areEqual(this.primary_button, actionCard.primary_button) && Intrinsics.areEqual(this.primary_button_hidden_tap_message, actionCard.primary_button_hidden_tap_message) && Intrinsics.areEqual(this.accessory, actionCard.accessory) && Intrinsics.areEqual(this.tap_behavior, actionCard.tap_behavior) && Intrinsics.areEqual(this.header_icon_action, actionCard.header_icon_action) && Intrinsics.areEqual(this.version, actionCard.version) && Intrinsics.areEqual(this.header_icon_action_accessibility_text, actionCard.header_icon_action_accessibility_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiAvatar uiAvatar = this.icon;
        int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
        HeaderIcon headerIcon = this.header_icon;
        int hashCode3 = (hashCode2 + (headerIcon != null ? headerIcon.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.description;
        int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        ActionableButtonDefault actionableButtonDefault = this.primary_button;
        int hashCode6 = (hashCode5 + (actionableButtonDefault != null ? actionableButtonDefault.hashCode() : 0)) * 37;
        String str = this.primary_button_hidden_tap_message;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        Accessory accessory = this.accessory;
        int hashCode8 = (hashCode7 + (accessory != null ? accessory.hashCode() : 0)) * 37;
        TapBehavior tapBehavior = this.tap_behavior;
        int hashCode9 = (hashCode8 + (tapBehavior != null ? tapBehavior.hashCode() : 0)) * 37;
        CardTapAction cardTapAction = this.header_icon_action;
        int hashCode10 = (hashCode9 + (cardTapAction != null ? cardTapAction.hashCode() : 0)) * 37;
        Integer num = this.version;
        int hashCode11 = (hashCode10 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        LocalizedString localizedString3 = this.header_icon_action_accessibility_text;
        int hashCode12 = hashCode11 + (localizedString3 != null ? localizedString3.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.icon = this.icon;
        builder.header_icon = this.header_icon;
        builder.title = this.title;
        builder.description = this.description;
        builder.primary_button = this.primary_button;
        builder.primary_button_hidden_tap_message = this.primary_button_hidden_tap_message;
        builder.accessory = this.accessory;
        builder.tap_behavior = this.tap_behavior;
        builder.header_icon_action = this.header_icon_action;
        builder.version = this.version;
        builder.header_icon_action_accessibility_text = this.header_icon_action_accessibility_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiAvatar uiAvatar = this.icon;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", uiAvatar, arrayList);
        }
        HeaderIcon headerIcon = this.header_icon;
        if (headerIcon != null) {
            arrayList.add("header_icon=" + headerIcon);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.description;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("description=", localizedString2, arrayList);
        }
        ActionableButtonDefault actionableButtonDefault = this.primary_button;
        if (actionableButtonDefault != null) {
            arrayList.add("primary_button=" + actionableButtonDefault);
        }
        String str = this.primary_button_hidden_tap_message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_button_hidden_tap_message=", arrayList);
        }
        Accessory accessory = this.accessory;
        if (accessory != null) {
            arrayList.add("accessory=" + accessory);
        }
        TapBehavior tapBehavior = this.tap_behavior;
        if (tapBehavior != null) {
            arrayList.add("tap_behavior=" + tapBehavior);
        }
        CardTapAction cardTapAction = this.header_icon_action;
        if (cardTapAction != null) {
            arrayList.add("header_icon_action=" + cardTapAction);
        }
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        LocalizedString localizedString3 = this.header_icon_action_accessibility_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("header_icon_action_accessibility_text=", localizedString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionCard{", "}", 0, null, null, 56);
    }
}
