package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.redwood.compose.HostFocusDirectorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzux;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AvatarTextSection;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppletCardSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppletCardSection> CREATOR;
    public final zzuv content;
    public final LocalToolbarKt footer;
    public final AppletCardSection$Header$StandardHeader header;

    public final class CashCardRenderingConfiguration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CashCardRenderingConfiguration> CREATOR;
        public final DisplayStyle display_style;

        public enum DisplayStyle implements WireEnum {
            STANDARD(1),
            ROTATED(2),
            ROTATED_PARTIAL(3);

            public final int value;
            public static final Channel.Companion Companion = new Channel.Companion();
            public static final AppletCardSection$CashCardRenderingConfiguration$DisplayStyle$Companion$ADAPTER$1 ADAPTER = new AppletCardSection$CashCardRenderingConfiguration$DisplayStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayStyle.class), Syntax.PROTO_2, null);

            DisplayStyle(int i) {
                this.value = i;
            }

            public static final DisplayStyle fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return STANDARD;
                }
                if (i == 2) {
                    return ROTATED;
                }
                if (i != 3) {
                    return null;
                }
                return ROTATED_PARTIAL;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            AppletCardSection$CashCardRenderingConfiguration$Companion$ADAPTER$1 appletCardSection$CashCardRenderingConfiguration$Companion$ADAPTER$1 = new AppletCardSection$CashCardRenderingConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashCardRenderingConfiguration.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AppletCardSection.CashCardRenderingConfiguration", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AppletCardSection.proto");
            ADAPTER = appletCardSection$CashCardRenderingConfiguration$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(appletCardSection$CashCardRenderingConfiguration$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CashCardRenderingConfiguration(DisplayStyle displayStyle, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_style = displayStyle;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CashCardRenderingConfiguration)) {
                return false;
            }
            CashCardRenderingConfiguration cashCardRenderingConfiguration = (CashCardRenderingConfiguration) obj;
            return Intrinsics.areEqual(unknownFields(), cashCardRenderingConfiguration.unknownFields()) && this.display_style == cashCardRenderingConfiguration.display_style;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            DisplayStyle displayStyle = this.display_style;
            int hashCode2 = hashCode + (displayStyle != null ? displayStyle.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Activity.Builder builder = new Activity.Builder(23);
            builder.activity = this.display_style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            DisplayStyle displayStyle = this.display_style;
            if (displayStyle != null) {
                arrayList.add("display_style=" + displayStyle);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CashCardRenderingConfiguration{", "}", 0, null, null, 56);
        }
    }

    static {
        AppletCardSection$Companion$ADAPTER$1 appletCardSection$Companion$ADAPTER$1 = new AppletCardSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppletCardSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AppletCardSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AppletCardSection.proto");
        ADAPTER = appletCardSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appletCardSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppletCardSection(AppletCardSection$Header$StandardHeader appletCardSection$Header$StandardHeader, zzuv zzuvVar, LocalToolbarKt localToolbarKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.header = appletCardSection$Header$StandardHeader;
        this.content = zzuvVar;
        this.footer = localToolbarKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppletCardSection)) {
            return false;
        }
        AppletCardSection appletCardSection = (AppletCardSection) obj;
        return Intrinsics.areEqual(unknownFields(), appletCardSection.unknownFields()) && Intrinsics.areEqual(this.header, appletCardSection.header) && Intrinsics.areEqual(this.content, appletCardSection.content) && Intrinsics.areEqual(this.footer, appletCardSection.footer);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppletCardSection$Header$StandardHeader appletCardSection$Header$StandardHeader = this.header;
        int hashCode2 = (hashCode + (appletCardSection$Header$StandardHeader != null ? appletCardSection$Header$StandardHeader.hashCode() : 0)) * 37;
        zzuv zzuvVar = this.content;
        int hashCode3 = (hashCode2 + (zzuvVar != null ? zzuvVar.hashCode() : 0)) * 37;
        LocalToolbarKt localToolbarKt = this.footer;
        int hashCode4 = hashCode3 + (localToolbarKt != null ? localToolbarKt.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(22);
        builder.title = this.header;
        builder.subtitle = this.content;
        builder.action = this.footer;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppletCardSection$Header$StandardHeader appletCardSection$Header$StandardHeader = this.header;
        if (appletCardSection$Header$StandardHeader != null) {
            arrayList.add("header=" + appletCardSection$Header$StandardHeader);
        }
        zzuv zzuvVar = this.content;
        if (zzuvVar != null) {
            arrayList.add("content=" + zzuvVar);
        }
        LocalToolbarKt localToolbarKt = this.footer;
        if (localToolbarKt != null) {
            arrayList.add("footer=" + localToolbarKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppletCardSection{", "}", 0, null, null, 56);
    }

    public final class ButtonTextFooter extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ButtonTextFooter> CREATOR;
        public final Button button;
        public final LocalizedString title;

        static {
            AppletCardSection$ButtonTextFooter$Companion$ADAPTER$1 appletCardSection$ButtonTextFooter$Companion$ADAPTER$1 = new AppletCardSection$ButtonTextFooter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonTextFooter.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AppletCardSection.ButtonTextFooter", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AppletCardSection.proto");
            ADAPTER = appletCardSection$ButtonTextFooter$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(appletCardSection$ButtonTextFooter$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonTextFooter(LocalizedString localizedString, Button button, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.button = button;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ButtonTextFooter)) {
                return false;
            }
            ButtonTextFooter buttonTextFooter = (ButtonTextFooter) obj;
            return Intrinsics.areEqual(unknownFields(), buttonTextFooter.unknownFields()) && Intrinsics.areEqual(this.title, buttonTextFooter.title) && Intrinsics.areEqual(this.button, buttonTextFooter.button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode3 = hashCode2 + (button != null ? button.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(15);
            builder.image_url = this.title;
            builder.asset = this.button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            Button button = this.button;
            if (button != null) {
                SizeMode$EnumUnboxingLocalUtility.m("button=", button, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonTextFooter{", "}", 0, null, null, 56);
        }

        public /* synthetic */ ButtonTextFooter(LocalizedString localizedString, Button button) {
            this(localizedString, button, ByteString.EMPTY);
        }
    }

    public final class ImageTextContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ImageTextContent> CREATOR;
        public final zzux image_content;
        public final LocalizedString subtitle;
        public final com.squareup.protos.cash.shop.rendering.api.TapAction tap_action;
        public final LocalizedString title;

        static {
            AppletCardSection$ImageTextContent$Companion$ADAPTER$1 appletCardSection$ImageTextContent$Companion$ADAPTER$1 = new AppletCardSection$ImageTextContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageTextContent.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AppletCardSection.ImageTextContent", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AppletCardSection.proto");
            ADAPTER = appletCardSection$ImageTextContent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(appletCardSection$ImageTextContent$Companion$ADAPTER$1);
        }

        public /* synthetic */ ImageTextContent(AppletCardSection$ImageTextContent$ImageContent$Image appletCardSection$ImageTextContent$ImageContent$Image, LocalizedString localizedString, LocalizedString localizedString2, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, int i) {
            this(appletCardSection$ImageTextContent$ImageContent$Image, localizedString, (i & 4) != 0 ? null : localizedString2, (i & 8) != 0 ? null : tapAction, ByteString.EMPTY);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ImageTextContent)) {
                return false;
            }
            ImageTextContent imageTextContent = (ImageTextContent) obj;
            return Intrinsics.areEqual(unknownFields(), imageTextContent.unknownFields()) && Intrinsics.areEqual(this.image_content, imageTextContent.image_content) && Intrinsics.areEqual(this.title, imageTextContent.title) && Intrinsics.areEqual(this.subtitle, imageTextContent.subtitle) && Intrinsics.areEqual(this.tap_action, imageTextContent.tap_action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            zzux zzuxVar = this.image_content;
            int hashCode2 = (hashCode + (zzuxVar != null ? zzuxVar.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
            int hashCode5 = hashCode4 + (tapAction != null ? tapAction.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Trust.Builder builder = new Trust.Builder(15, false);
            builder.icon = this.image_content;
            builder.title = this.title;
            builder.enabled = this.subtitle;
            builder.id = this.tap_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            zzux zzuxVar = this.image_content;
            if (zzuxVar != null) {
                arrayList.add("image_content=" + zzuxVar);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ImageTextContent{", "}", 0, null, null, 56);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageTextContent(zzux zzuxVar, LocalizedString localizedString, LocalizedString localizedString2, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image_content = zzuxVar;
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.tap_action = tapAction;
        }
    }

    public final class TappableFooter extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TappableFooter> CREATOR;
        public final HostFocusDirectorKt image_content;
        public final LocalizedString subtitle;
        public final com.squareup.protos.cash.shop.rendering.api.TapAction tap_action;
        public final LocalizedString title;

        static {
            AppletCardSection$TappableFooter$Companion$ADAPTER$1 appletCardSection$TappableFooter$Companion$ADAPTER$1 = new AppletCardSection$TappableFooter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TappableFooter.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AppletCardSection.TappableFooter", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AppletCardSection.proto");
            ADAPTER = appletCardSection$TappableFooter$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(appletCardSection$TappableFooter$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TappableFooter(HostFocusDirectorKt hostFocusDirectorKt, LocalizedString localizedString, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image_content = hostFocusDirectorKt;
            this.title = localizedString;
            this.tap_action = tapAction;
            this.subtitle = localizedString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TappableFooter)) {
                return false;
            }
            TappableFooter tappableFooter = (TappableFooter) obj;
            return Intrinsics.areEqual(unknownFields(), tappableFooter.unknownFields()) && Intrinsics.areEqual(this.image_content, tappableFooter.image_content) && Intrinsics.areEqual(this.title, tappableFooter.title) && Intrinsics.areEqual(this.tap_action, tappableFooter.tap_action) && Intrinsics.areEqual(this.subtitle, tappableFooter.subtitle);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            HostFocusDirectorKt hostFocusDirectorKt = this.image_content;
            int hashCode2 = (hashCode + (hostFocusDirectorKt != null ? hostFocusDirectorKt.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
            int hashCode4 = (hashCode3 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode5 = hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Trust.Builder builder = new Trust.Builder(16, false);
            builder.icon = this.image_content;
            builder.title = this.title;
            builder.enabled = this.tap_action;
            builder.id = this.subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            HostFocusDirectorKt hostFocusDirectorKt = this.image_content;
            if (hostFocusDirectorKt != null) {
                arrayList.add("image_content=" + hostFocusDirectorKt);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TappableFooter{", "}", 0, null, null, 56);
        }

        public /* synthetic */ TappableFooter(LocalizedString localizedString, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction) {
            this(null, localizedString, tapAction, null, ByteString.EMPTY);
        }
    }

    public final class TileCarousel extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TileCarousel> CREATOR;
        public final List tiles;

        static {
            AppletCardSection$TileCarousel$Companion$ADAPTER$1 appletCardSection$TileCarousel$Companion$ADAPTER$1 = new AppletCardSection$TileCarousel$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TileCarousel.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AppletCardSection.TileCarousel", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AppletCardSection.proto");
            ADAPTER = appletCardSection$TileCarousel$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(appletCardSection$TileCarousel$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TileCarousel(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.tiles = TransactorKt.immutableCopyOf("tiles", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TileCarousel)) {
                return false;
            }
            TileCarousel tileCarousel = (TileCarousel) obj;
            return Intrinsics.areEqual(unknownFields(), tileCarousel.unknownFields()) && Intrinsics.areEqual(this.tiles, tileCarousel.tiles);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.tiles.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(11);
            builder.trust = this.tiles;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.tiles;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("tiles=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TileCarousel{", "}", 0, null, null, 56);
        }

        public TileCarousel(List list) {
            this(list, ByteString.EMPTY);
        }

        public final class Tile extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Tile> CREATOR;
            public final AnalyticsEvent analytic_view_event;
            public final UiAvatar avatar;
            public final Boolean dimmer_enabled;
            public final EngagedItemToken engaged_token;
            public final Image image;
            public final OverlayColor overlay_color;
            public final com.squareup.protos.cash.shop.rendering.api.TapAction tap_action;
            public final LocalizedString title;

            public enum OverlayColor implements WireEnum {
                UNSPECIFIED(0),
                BLACK(1),
                WHITE(2);

                public static final AppletCardSection$TileCarousel$Tile$OverlayColor$Companion$ADAPTER$1 ADAPTER;
                public static final ImageLayout.Companion Companion;
                public final int value;

                static {
                    OverlayColor overlayColor = UNSPECIFIED;
                    Companion = new ImageLayout.Companion();
                    ADAPTER = new AppletCardSection$TileCarousel$Tile$OverlayColor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OverlayColor.class), Syntax.PROTO_2, overlayColor);
                }

                OverlayColor(int i) {
                    this.value = i;
                }

                public static final OverlayColor fromValue(int i) {
                    Companion.getClass();
                    if (i == 0) {
                        return UNSPECIFIED;
                    }
                    if (i == 1) {
                        return BLACK;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return WHITE;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                AppletCardSection$TileCarousel$Tile$Companion$ADAPTER$1 appletCardSection$TileCarousel$Tile$Companion$ADAPTER$1 = new AppletCardSection$TileCarousel$Tile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Tile.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AppletCardSection.TileCarousel.Tile", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AppletCardSection.proto");
                ADAPTER = appletCardSection$TileCarousel$Tile$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(appletCardSection$TileCarousel$Tile$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Tile(UiAvatar uiAvatar, LocalizedString localizedString, Image image, OverlayColor overlayColor, Boolean bool, EngagedItemToken engagedItemToken, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, AnalyticsEvent analyticsEvent, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.avatar = uiAvatar;
                this.title = localizedString;
                this.image = image;
                this.overlay_color = overlayColor;
                this.dimmer_enabled = bool;
                this.engaged_token = engagedItemToken;
                this.tap_action = tapAction;
                this.analytic_view_event = analyticsEvent;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Tile)) {
                    return false;
                }
                Tile tile = (Tile) obj;
                return Intrinsics.areEqual(unknownFields(), tile.unknownFields()) && Intrinsics.areEqual(this.avatar, tile.avatar) && Intrinsics.areEqual(this.title, tile.title) && Intrinsics.areEqual(this.image, tile.image) && this.overlay_color == tile.overlay_color && Intrinsics.areEqual(this.dimmer_enabled, tile.dimmer_enabled) && Intrinsics.areEqual(this.engaged_token, tile.engaged_token) && Intrinsics.areEqual(this.tap_action, tile.tap_action) && Intrinsics.areEqual(this.analytic_view_event, tile.analytic_view_event);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                UiAvatar uiAvatar = this.avatar;
                int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.title;
                int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                Image image = this.image;
                int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
                OverlayColor overlayColor = this.overlay_color;
                int hashCode5 = (hashCode4 + (overlayColor != null ? overlayColor.hashCode() : 0)) * 37;
                Boolean bool = this.dimmer_enabled;
                int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                EngagedItemToken engagedItemToken = this.engaged_token;
                int hashCode7 = (hashCode6 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0)) * 37;
                com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
                int hashCode8 = (hashCode7 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
                AnalyticsEvent analyticsEvent = this.analytic_view_event;
                int hashCode9 = hashCode8 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0);
                this.hashCode = hashCode9;
                return hashCode9;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Badge.Builder builder = new Badge.Builder(12, false);
                builder.external_token = this.avatar;
                builder.customer_token = this.title;
                builder.external_version = this.image;
                builder.updated_at = this.overlay_color;
                builder.is_badged = this.dimmer_enabled;
                builder.created_at = this.engaged_token;
                builder.item_type = this.tap_action;
                builder.count_groups = this.analytic_view_event;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                UiAvatar uiAvatar = this.avatar;
                if (uiAvatar != null) {
                    Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
                }
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                Image image = this.image;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                }
                OverlayColor overlayColor = this.overlay_color;
                if (overlayColor != null) {
                    arrayList.add("overlay_color=" + overlayColor);
                }
                Boolean bool = this.dimmer_enabled;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("dimmer_enabled=", bool, arrayList);
                }
                EngagedItemToken engagedItemToken = this.engaged_token;
                if (engagedItemToken != null) {
                    arrayList.add("engaged_token=" + engagedItemToken);
                }
                com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
                if (tapAction != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
                }
                AnalyticsEvent analyticsEvent = this.analytic_view_event;
                if (analyticsEvent != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Tile{", "}", 0, null, null, 56);
            }

            public /* synthetic */ Tile(LocalizedString localizedString, Image image, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, AnalyticsEvent analyticsEvent, int i) {
                this(null, localizedString, image, null, null, null, (i & 64) != 0 ? null : tapAction, analyticsEvent, ByteString.EMPTY);
            }
        }
    }

    public final class TransactionList extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TransactionList> CREATOR;
        public final List order_rows;

        static {
            AppletCardSection$TransactionList$Companion$ADAPTER$1 appletCardSection$TransactionList$Companion$ADAPTER$1 = new AppletCardSection$TransactionList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransactionList.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AppletCardSection.TransactionList", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AppletCardSection.proto");
            ADAPTER = appletCardSection$TransactionList$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(appletCardSection$TransactionList$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionList(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.order_rows = TransactorKt.immutableCopyOf("order_rows", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TransactionList)) {
                return false;
            }
            TransactionList transactionList = (TransactionList) obj;
            return Intrinsics.areEqual(unknownFields(), transactionList.unknownFields()) && Intrinsics.areEqual(this.order_rows, transactionList.order_rows);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.order_rows.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(12);
            builder.trust = this.order_rows;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.order_rows;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("order_rows=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TransactionList{", "}", 0, null, null, 56);
        }

        public TransactionList(List list) {
            this(list, ByteString.EMPTY);
        }
    }

    public final class StandardHeader extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<StandardHeader> CREATOR;
        public final Money amount;
        public final LocalizedString amount_caption;
        public final TappableIcon amount_caption_tappable_info;
        public final LocalizedString body;
        public final DisplayStyle display_style;

        public enum DisplayStyle implements WireEnum {
            REGULAR(1),
            DISABLED(2);

            public final int value;
            public static final RadioType.Companion Companion = new RadioType.Companion();
            public static final AppletCardSection$StandardHeader$DisplayStyle$Companion$ADAPTER$1 ADAPTER = new AppletCardSection$StandardHeader$DisplayStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayStyle.class), Syntax.PROTO_2, null);

            DisplayStyle(int i) {
                this.value = i;
            }

            public static final DisplayStyle fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return REGULAR;
                }
                if (i != 2) {
                    return null;
                }
                return DISABLED;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            AppletCardSection$StandardHeader$Companion$ADAPTER$1 appletCardSection$StandardHeader$Companion$ADAPTER$1 = new AppletCardSection$StandardHeader$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StandardHeader.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AppletCardSection.StandardHeader", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AppletCardSection.proto");
            ADAPTER = appletCardSection$StandardHeader$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(appletCardSection$StandardHeader$Companion$ADAPTER$1);
        }

        public /* synthetic */ StandardHeader(Money money, LocalizedString localizedString, TappableIcon tappableIcon, LocalizedString localizedString2, DisplayStyle displayStyle, int i) {
            this(money, localizedString, (i & 4) != 0 ? null : tappableIcon, (i & 8) != 0 ? null : localizedString2, (i & 16) != 0 ? null : displayStyle, ByteString.EMPTY);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StandardHeader)) {
                return false;
            }
            StandardHeader standardHeader = (StandardHeader) obj;
            return Intrinsics.areEqual(unknownFields(), standardHeader.unknownFields()) && Intrinsics.areEqual(this.amount, standardHeader.amount) && Intrinsics.areEqual(this.amount_caption, standardHeader.amount_caption) && Intrinsics.areEqual(this.amount_caption_tappable_info, standardHeader.amount_caption_tappable_info) && Intrinsics.areEqual(this.body, standardHeader.body) && this.display_style == standardHeader.display_style;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.amount_caption;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            TappableIcon tappableIcon = this.amount_caption_tappable_info;
            int hashCode4 = (hashCode3 + (tappableIcon != null ? tappableIcon.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.body;
            int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            DisplayStyle displayStyle = this.display_style;
            int hashCode6 = hashCode5 + (displayStyle != null ? displayStyle.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Account.Builder builder = new Account.Builder(17, false);
            builder.customer_token = this.amount;
            builder.account_token = this.amount_caption;
            builder.display_name = this.amount_caption_tappable_info;
            builder.account_type = this.body;
            builder.is_sponsored_account = this.display_style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            LocalizedString localizedString = this.amount_caption;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount_caption=", localizedString, arrayList);
            }
            TappableIcon tappableIcon = this.amount_caption_tappable_info;
            if (tappableIcon != null) {
                arrayList.add("amount_caption_tappable_info=" + tappableIcon);
            }
            LocalizedString localizedString2 = this.body;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
            }
            DisplayStyle displayStyle = this.display_style;
            if (displayStyle != null) {
                arrayList.add("display_style=" + displayStyle);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "StandardHeader{", "}", 0, null, null, 56);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StandardHeader(Money money, LocalizedString localizedString, TappableIcon tappableIcon, LocalizedString localizedString2, DisplayStyle displayStyle, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = money;
            this.amount_caption = localizedString;
            this.amount_caption_tappable_info = tappableIcon;
            this.body = localizedString2;
            this.display_style = displayStyle;
        }
    }

    public final class AvatarTextFooter extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarTextFooter> CREATOR;
        public final List avatar;
        public final LocalizedString subtitle;
        public final com.squareup.protos.cash.shop.rendering.api.TapAction tap_action;
        public final LocalizedString title;

        static {
            AppletCardSection$AvatarTextFooter$Companion$ADAPTER$1 appletCardSection$AvatarTextFooter$Companion$ADAPTER$1 = new AppletCardSection$AvatarTextFooter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarTextFooter.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AppletCardSection.AvatarTextFooter", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AppletCardSection.proto");
            ADAPTER = appletCardSection$AvatarTextFooter$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(appletCardSection$AvatarTextFooter$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarTextFooter(List list, LocalizedString localizedString, LocalizedString localizedString2, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.tap_action = tapAction;
            this.avatar = TransactorKt.immutableCopyOf("avatar", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarTextFooter)) {
                return false;
            }
            AvatarTextFooter avatarTextFooter = (AvatarTextFooter) obj;
            return Intrinsics.areEqual(unknownFields(), avatarTextFooter.unknownFields()) && Intrinsics.areEqual(this.avatar, avatarTextFooter.avatar) && Intrinsics.areEqual(this.title, avatarTextFooter.title) && Intrinsics.areEqual(this.subtitle, avatarTextFooter.subtitle) && Intrinsics.areEqual(this.tap_action, avatarTextFooter.tap_action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.avatar);
            LocalizedString localizedString = this.title;
            int hashCode = (m + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode2 = (hashCode + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
            int hashCode3 = hashCode2 + (tapAction != null ? tapAction.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AvatarTextSection.Builder builder = new AvatarTextSection.Builder(1);
            builder.avatars = this.avatar;
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.tap_action = this.tap_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.avatar;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("avatar=", arrayList, list);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarTextFooter{", "}", 0, null, null, 56);
        }

        public AvatarTextFooter(List list, LocalizedString localizedString, LocalizedString localizedString2, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction) {
            this(list, localizedString, localizedString2, tapAction, ByteString.EMPTY);
        }
    }
}
