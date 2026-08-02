package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzjg;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Illustration;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.rewardly.ui.AppLinks;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import xyz.block.protos.genie.Collection;
import xyz.block.protos.genie.Expression;

/* loaded from: classes8.dex */
public final class BorrowAppletBulletinsTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BorrowAppletBulletinsTile> CREATOR;
    public final List tiles;

    static {
        BorrowAppletBulletinsTile$Companion$ADAPTER$1 borrowAppletBulletinsTile$Companion$ADAPTER$1 = new BorrowAppletBulletinsTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BorrowAppletBulletinsTile.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletBulletinsTile", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = borrowAppletBulletinsTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletBulletinsTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowAppletBulletinsTile(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.tiles = TransactorKt.immutableCopyOf("tiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BorrowAppletBulletinsTile)) {
            return false;
        }
        BorrowAppletBulletinsTile borrowAppletBulletinsTile = (BorrowAppletBulletinsTile) obj;
        return Intrinsics.areEqual(unknownFields(), borrowAppletBulletinsTile.unknownFields()) && Intrinsics.areEqual(this.tiles, borrowAppletBulletinsTile.tiles);
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
        Collection.Builder builder = new Collection.Builder(10, false);
        builder.items = this.tiles;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.tiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tiles=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BorrowAppletBulletinsTile{", "}", 0, null, null, 56);
    }

    public final class Data extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Data> CREATOR;
        public final List bulletins;
        public final UpsellCard upsell_card;

        public final class UpsellCard extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<UpsellCard> CREATOR;
            public final String action_url;
            public final LocalizedString body_text;
            public final LocalizedString button_text;
            public final String identifier;
            public final Illustration illustration;
            public final LocalizedString title_text;

            static {
                BorrowAppletBulletinsTile$Data$UpsellCard$Companion$ADAPTER$1 borrowAppletBulletinsTile$Data$UpsellCard$Companion$ADAPTER$1 = new BorrowAppletBulletinsTile$Data$UpsellCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpsellCard.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletBulletinsTile.Data.UpsellCard", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = borrowAppletBulletinsTile$Data$UpsellCard$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletBulletinsTile$Data$UpsellCard$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpsellCard(LocalizedString localizedString, LocalizedString localizedString2, Illustration illustration, LocalizedString localizedString3, String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title_text = localizedString;
                this.body_text = localizedString2;
                this.illustration = illustration;
                this.button_text = localizedString3;
                this.action_url = str;
                this.identifier = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof UpsellCard)) {
                    return false;
                }
                UpsellCard upsellCard = (UpsellCard) obj;
                return Intrinsics.areEqual(unknownFields(), upsellCard.unknownFields()) && Intrinsics.areEqual(this.title_text, upsellCard.title_text) && Intrinsics.areEqual(this.body_text, upsellCard.body_text) && Intrinsics.areEqual(this.illustration, upsellCard.illustration) && Intrinsics.areEqual(this.button_text, upsellCard.button_text) && Intrinsics.areEqual(this.action_url, upsellCard.action_url) && Intrinsics.areEqual(this.identifier, upsellCard.identifier);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.body_text;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                Illustration illustration = this.illustration;
                int hashCode4 = (hashCode3 + (illustration != null ? illustration.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.button_text;
                int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                String str = this.action_url;
                int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.identifier;
                int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiPublicProfile.Builder builder = new UiPublicProfile.Builder(18, false);
                builder.synopsis = this.title_text;
                builder.full_cashtag = this.body_text;
                builder.cashtag_url_enabled = this.illustration;
                builder.is_verified_account = this.button_text;
                builder.full_name = this.action_url;
                builder.photo_url = this.identifier;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.body_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body_text=", localizedString2, arrayList);
                }
                Illustration illustration = this.illustration;
                if (illustration != null) {
                    arrayList.add("illustration=" + illustration);
                }
                LocalizedString localizedString3 = this.button_text;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString3, arrayList);
                }
                String str = this.action_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
                }
                String str2 = this.identifier;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "identifier=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "UpsellCard{", "}", 0, null, null, 56);
            }
        }

        static {
            BorrowAppletBulletinsTile$Data$Companion$ADAPTER$1 borrowAppletBulletinsTile$Data$Companion$ADAPTER$1 = new BorrowAppletBulletinsTile$Data$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Data.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletBulletinsTile.Data", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
            ADAPTER = borrowAppletBulletinsTile$Data$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletBulletinsTile$Data$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(List list, UpsellCard upsellCard, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.upsell_card = upsellCard;
            this.bulletins = TransactorKt.immutableCopyOf("bulletins", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.areEqual(unknownFields(), data.unknownFields()) && Intrinsics.areEqual(this.bulletins, data.bulletins) && Intrinsics.areEqual(this.upsell_card, data.upsell_card);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.bulletins);
            UpsellCard upsellCard = this.upsell_card;
            int hashCode = m + (upsellCard != null ? upsellCard.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(12);
            builder.f1411android = this.bulletins;
            builder.ios = this.upsell_card;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.bulletins;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("bulletins=", arrayList, list);
            }
            UpsellCard upsellCard = this.upsell_card;
            if (upsellCard != null) {
                arrayList.add("upsell_card=" + upsellCard);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Data{", "}", 0, null, null, 56);
        }

        public final class Bulletin extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Bulletin> CREATOR;
            public final LocalizedString accessibility_description;
            public final Accessory accessory;
            public final Boolean badged;
            public final LocalizedString detail_text;
            public final Float fill_percent;
            public final Icon icon;
            public final IconShape icon_shape;
            public final String identifier;
            public final Color override_tint_color;
            public final LocalizedString primary_text;
            public final zzjg routing;
            public final SegmentedCircle segmented_circle;

            public enum Accessory implements WireEnum {
                INFO(0),
                CHEVRON(1);

                public static final BorrowAppletBulletinsTile$Data$Bulletin$Accessory$Companion$ADAPTER$1 ADAPTER;
                public static final KeyScope.Companion Companion;
                public final int value;

                static {
                    Accessory accessory = INFO;
                    Companion = new KeyScope.Companion();
                    ADAPTER = new BorrowAppletBulletinsTile$Data$Bulletin$Accessory$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Accessory.class), Syntax.PROTO_2, accessory);
                }

                Accessory(int i) {
                    this.value = i;
                }

                public static final Accessory fromValue(int i) {
                    Companion.getClass();
                    if (i == 0) {
                        return INFO;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return CHEVRON;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            public enum Icon implements WireEnum {
                LIMIT(0),
                ALERT(1),
                LIMIT_DECREASE(2),
                BORROW_LOGO(3);

                public static final BorrowAppletBulletinsTile$Data$Bulletin$Icon$Companion$ADAPTER$1 ADAPTER;
                public static final ClientDriven.Companion Companion;
                public final int value;

                static {
                    Icon icon = LIMIT;
                    Companion = new ClientDriven.Companion();
                    ADAPTER = new BorrowAppletBulletinsTile$Data$Bulletin$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, icon);
                }

                Icon(int i) {
                    this.value = i;
                }

                public static final Icon fromValue(int i) {
                    Companion.getClass();
                    if (i == 0) {
                        return LIMIT;
                    }
                    if (i == 1) {
                        return ALERT;
                    }
                    if (i == 2) {
                        return LIMIT_DECREASE;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return BORROW_LOGO;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            public enum IconShape implements WireEnum {
                ROUNDED_SQUARE(0),
                CIRCLE(1);

                public static final BorrowAppletBulletinsTile$Data$Bulletin$IconShape$Companion$ADAPTER$1 ADAPTER;
                public static final UiControl.Type.Companion Companion;
                public final int value;

                static {
                    IconShape iconShape = ROUNDED_SQUARE;
                    Companion = new UiControl.Type.Companion();
                    ADAPTER = new BorrowAppletBulletinsTile$Data$Bulletin$IconShape$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IconShape.class), Syntax.PROTO_2, iconShape);
                }

                IconShape(int i) {
                    this.value = i;
                }

                public static final IconShape fromValue(int i) {
                    Companion.getClass();
                    if (i == 0) {
                        return ROUNDED_SQUARE;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return CIRCLE;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                BorrowAppletBulletinsTile$Data$Bulletin$Companion$ADAPTER$1 borrowAppletBulletinsTile$Data$Bulletin$Companion$ADAPTER$1 = new BorrowAppletBulletinsTile$Data$Bulletin$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Bulletin.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletBulletinsTile.Data.Bulletin", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = borrowAppletBulletinsTile$Data$Bulletin$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletBulletinsTile$Data$Bulletin$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Bulletin(Icon icon, IconShape iconShape, SegmentedCircle segmentedCircle, LocalizedString localizedString, LocalizedString localizedString2, Accessory accessory, zzjg zzjgVar, Boolean bool, String str, Color color, Float f, LocalizedString localizedString3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = icon;
                this.icon_shape = iconShape;
                this.segmented_circle = segmentedCircle;
                this.primary_text = localizedString;
                this.detail_text = localizedString2;
                this.accessory = accessory;
                this.routing = zzjgVar;
                this.badged = bool;
                this.identifier = str;
                this.override_tint_color = color;
                this.fill_percent = f;
                this.accessibility_description = localizedString3;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Bulletin)) {
                    return false;
                }
                Bulletin bulletin = (Bulletin) obj;
                return Intrinsics.areEqual(unknownFields(), bulletin.unknownFields()) && this.icon == bulletin.icon && this.icon_shape == bulletin.icon_shape && Intrinsics.areEqual(this.segmented_circle, bulletin.segmented_circle) && Intrinsics.areEqual(this.primary_text, bulletin.primary_text) && Intrinsics.areEqual(this.detail_text, bulletin.detail_text) && this.accessory == bulletin.accessory && Intrinsics.areEqual(this.routing, bulletin.routing) && Intrinsics.areEqual(this.badged, bulletin.badged) && Intrinsics.areEqual(this.identifier, bulletin.identifier) && Intrinsics.areEqual(this.override_tint_color, bulletin.override_tint_color) && Intrinsics.areEqual(this.fill_percent, bulletin.fill_percent) && Intrinsics.areEqual(this.accessibility_description, bulletin.accessibility_description);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Icon icon = this.icon;
                int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                IconShape iconShape = this.icon_shape;
                int hashCode3 = (hashCode2 + (iconShape != null ? iconShape.hashCode() : 0)) * 37;
                SegmentedCircle segmentedCircle = this.segmented_circle;
                int hashCode4 = (hashCode3 + (segmentedCircle != null ? segmentedCircle.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.primary_text;
                int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.detail_text;
                int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                Accessory accessory = this.accessory;
                int hashCode7 = (hashCode6 + (accessory != null ? accessory.hashCode() : 0)) * 37;
                zzjg zzjgVar = this.routing;
                int hashCode8 = (hashCode7 + (zzjgVar != null ? zzjgVar.hashCode() : 0)) * 37;
                Boolean bool = this.badged;
                int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                String str = this.identifier;
                int hashCode10 = (hashCode9 + (str != null ? str.hashCode() : 0)) * 37;
                Color color = this.override_tint_color;
                int hashCode11 = (hashCode10 + (color != null ? color.hashCode() : 0)) * 37;
                Float f = this.fill_percent;
                int hashCode12 = (hashCode11 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
                LocalizedString localizedString3 = this.accessibility_description;
                int hashCode13 = hashCode12 + (localizedString3 != null ? localizedString3.hashCode() : 0);
                this.hashCode = hashCode13;
                return hashCode13;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Expression.Builder builder = new Expression.Builder(25, false);
                builder.key_path_ref = this.icon;
                builder.int_literal = this.icon_shape;
                builder.float_literal = this.segmented_circle;
                builder.blob_literal = this.primary_text;
                builder.unary_op = this.detail_text;
                builder.binary_op = this.accessory;
                builder.conditional_op = this.routing;
                builder.bool_literal = this.badged;
                builder.string_literal = this.identifier;
                builder.filter_op = this.override_tint_color;
                builder.collection_literal = this.fill_percent;
                builder.format_string_op = this.accessibility_description;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Icon icon = this.icon;
                if (icon != null) {
                    arrayList.add("icon=" + icon);
                }
                IconShape iconShape = this.icon_shape;
                if (iconShape != null) {
                    arrayList.add("icon_shape=" + iconShape);
                }
                SegmentedCircle segmentedCircle = this.segmented_circle;
                if (segmentedCircle != null) {
                    arrayList.add("segmented_circle=" + segmentedCircle);
                }
                LocalizedString localizedString = this.primary_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("primary_text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.detail_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("detail_text=", localizedString2, arrayList);
                }
                Accessory accessory = this.accessory;
                if (accessory != null) {
                    arrayList.add("accessory=" + accessory);
                }
                zzjg zzjgVar = this.routing;
                if (zzjgVar != null) {
                    arrayList.add("routing=" + zzjgVar);
                }
                Boolean bool = this.badged;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("badged=", bool, arrayList);
                }
                String str = this.identifier;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "identifier=", arrayList);
                }
                Color color = this.override_tint_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("override_tint_color=", color, arrayList);
                }
                Float f = this.fill_percent;
                if (f != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("fill_percent=", f, arrayList);
                }
                LocalizedString localizedString3 = this.accessibility_description;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("accessibility_description=", localizedString3, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Bulletin{", "}", 0, null, null, 56);
            }

            public final class InfoSheet extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<InfoSheet> CREATOR;
                public final List bullets;
                public final LocalizedString detail_text;
                public final TextAlignment detail_text_alignment;
                public final LocalizedString dismiss_button_text;
                public final LocalizedString footer_text;
                public final Icon icon;
                public final Image image;
                public final String primary_action_url;
                public final LocalizedString primary_button_text;
                public final LoanRepaymentSelectionData primary_repayment_selection;
                public final LocalizedString primary_text;
                public final TextAlignment primary_text_alignment;
                public final Boolean render_as_modal;
                public final Timeline timeline;
                public final Color tint_color;

                public enum TextAlignment implements WireEnum {
                    LEADING(1),
                    CENTERED(2);

                    public final int value;
                    public static final Trigger.Companion Companion = new Trigger.Companion();
                    public static final BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1 ADAPTER = new BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextAlignment.class), Syntax.PROTO_2, null);

                    TextAlignment(int i) {
                        this.value = i;
                    }

                    public static final TextAlignment fromValue(int i) {
                        Companion.getClass();
                        if (i == 1) {
                            return LEADING;
                        }
                        if (i != 2) {
                            return null;
                        }
                        return CENTERED;
                    }

                    @Override // com.squareup.wire.WireEnum
                    public final int getValue() {
                        return this.value;
                    }
                }

                static {
                    BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Companion$ADAPTER$1 borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Companion$ADAPTER$1 = new BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InfoSheet.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public InfoSheet(Icon icon, Image image, LocalizedString localizedString, TextAlignment textAlignment, LocalizedString localizedString2, TextAlignment textAlignment2, List list, Timeline timeline, LocalizedString localizedString3, LocalizedString localizedString4, String str, LoanRepaymentSelectionData loanRepaymentSelectionData, LocalizedString localizedString5, Color color, Boolean bool, ByteString byteString) {
                    super(ADAPTER, byteString);
                    list.getClass();
                    byteString.getClass();
                    this.icon = icon;
                    this.image = image;
                    this.primary_text = localizedString;
                    this.primary_text_alignment = textAlignment;
                    this.detail_text = localizedString2;
                    this.detail_text_alignment = textAlignment2;
                    this.timeline = timeline;
                    this.footer_text = localizedString3;
                    this.primary_button_text = localizedString4;
                    this.primary_action_url = str;
                    this.primary_repayment_selection = loanRepaymentSelectionData;
                    this.dismiss_button_text = localizedString5;
                    this.tint_color = color;
                    this.render_as_modal = bool;
                    this.bullets = TransactorKt.immutableCopyOf("bullets", list);
                }

                public static InfoSheet copy$default(InfoSheet infoSheet, Image image, LocalizedString localizedString, LocalizedString localizedString2, ArrayList arrayList, Timeline timeline, LocalizedString localizedString3, LocalizedString localizedString4, LoanRepaymentSelectionData loanRepaymentSelectionData, LocalizedString localizedString5, Color color, ByteString byteString, int i) {
                    Icon icon = infoSheet.icon;
                    Image image2 = (i & 2) != 0 ? infoSheet.image : image;
                    LocalizedString localizedString6 = (i & 4) != 0 ? infoSheet.primary_text : localizedString;
                    TextAlignment textAlignment = infoSheet.primary_text_alignment;
                    LocalizedString localizedString7 = (i & 16) != 0 ? infoSheet.detail_text : localizedString2;
                    TextAlignment textAlignment2 = infoSheet.detail_text_alignment;
                    List list = (i & 64) != 0 ? infoSheet.bullets : arrayList;
                    Timeline timeline2 = (i & 128) != 0 ? infoSheet.timeline : timeline;
                    LocalizedString localizedString8 = (i & 256) != 0 ? infoSheet.footer_text : localizedString3;
                    String str = infoSheet.primary_action_url;
                    LocalizedString localizedString9 = (i & 4096) != 0 ? infoSheet.dismiss_button_text : localizedString5;
                    Color color2 = (i & PKIFailureInfo.certRevoked) != 0 ? infoSheet.tint_color : color;
                    Boolean bool = infoSheet.render_as_modal;
                    ByteString unknownFields = (i & 32768) != 0 ? infoSheet.unknownFields() : byteString;
                    infoSheet.getClass();
                    list.getClass();
                    unknownFields.getClass();
                    return new InfoSheet(icon, image2, localizedString6, textAlignment, localizedString7, textAlignment2, list, timeline2, localizedString8, localizedString4, str, loanRepaymentSelectionData, localizedString9, color2, bool, unknownFields);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof InfoSheet)) {
                        return false;
                    }
                    InfoSheet infoSheet = (InfoSheet) obj;
                    return Intrinsics.areEqual(unknownFields(), infoSheet.unknownFields()) && this.icon == infoSheet.icon && Intrinsics.areEqual(this.image, infoSheet.image) && Intrinsics.areEqual(this.primary_text, infoSheet.primary_text) && this.primary_text_alignment == infoSheet.primary_text_alignment && Intrinsics.areEqual(this.detail_text, infoSheet.detail_text) && this.detail_text_alignment == infoSheet.detail_text_alignment && Intrinsics.areEqual(this.bullets, infoSheet.bullets) && Intrinsics.areEqual(this.timeline, infoSheet.timeline) && Intrinsics.areEqual(this.footer_text, infoSheet.footer_text) && Intrinsics.areEqual(this.primary_button_text, infoSheet.primary_button_text) && Intrinsics.areEqual(this.primary_action_url, infoSheet.primary_action_url) && Intrinsics.areEqual(this.primary_repayment_selection, infoSheet.primary_repayment_selection) && Intrinsics.areEqual(this.dismiss_button_text, infoSheet.dismiss_button_text) && Intrinsics.areEqual(this.tint_color, infoSheet.tint_color) && Intrinsics.areEqual(this.render_as_modal, infoSheet.render_as_modal);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Icon icon = this.icon;
                    int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                    Image image = this.image;
                    int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
                    LocalizedString localizedString = this.primary_text;
                    int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    TextAlignment textAlignment = this.primary_text_alignment;
                    int hashCode5 = (hashCode4 + (textAlignment != null ? textAlignment.hashCode() : 0)) * 37;
                    LocalizedString localizedString2 = this.detail_text;
                    int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                    TextAlignment textAlignment2 = this.detail_text_alignment;
                    int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (textAlignment2 != null ? textAlignment2.hashCode() : 0)) * 37, 37, this.bullets);
                    Timeline timeline = this.timeline;
                    int hashCode7 = (m + (timeline != null ? timeline.hashCode() : 0)) * 37;
                    LocalizedString localizedString3 = this.footer_text;
                    int hashCode8 = (hashCode7 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                    LocalizedString localizedString4 = this.primary_button_text;
                    int hashCode9 = (hashCode8 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
                    String str = this.primary_action_url;
                    int hashCode10 = (hashCode9 + (str != null ? str.hashCode() : 0)) * 37;
                    LoanRepaymentSelectionData loanRepaymentSelectionData = this.primary_repayment_selection;
                    int hashCode11 = (hashCode10 + (loanRepaymentSelectionData != null ? loanRepaymentSelectionData.hashCode() : 0)) * 37;
                    LocalizedString localizedString5 = this.dismiss_button_text;
                    int hashCode12 = (hashCode11 + (localizedString5 != null ? localizedString5.hashCode() : 0)) * 37;
                    Color color = this.tint_color;
                    int hashCode13 = (hashCode12 + (color != null ? color.hashCode() : 0)) * 37;
                    Boolean bool = this.render_as_modal;
                    int hashCode14 = hashCode13 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                    this.hashCode = hashCode14;
                    return hashCode14;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ClientInfo.Builder builder = new ClientInfo.Builder(9);
                    builder.device_uuid = this.icon;
                    builder.date_format = this.image;
                    builder.time_format = this.primary_text;
                    builder.ip_address = this.primary_text_alignment;
                    builder.device_name = this.detail_text;
                    builder.accept_language = this.detail_text_alignment;
                    builder.device_installation_id = this.bullets;
                    builder.drm_id = this.timeline;
                    builder.device_vendor_id = this.footer_text;
                    builder.device_id = this.primary_button_text;
                    builder.user_agent = this.primary_action_url;
                    builder.threatmetrix_smart_id = this.primary_repayment_selection;
                    builder.timestamp = this.dismiss_button_text;
                    builder.navigation_paradigm = this.tint_color;
                    builder.client_scenario = this.render_as_modal;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Icon icon = this.icon;
                    if (icon != null) {
                        arrayList.add("icon=" + icon);
                    }
                    Image image = this.image;
                    if (image != null) {
                        SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                    }
                    LocalizedString localizedString = this.primary_text;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("primary_text=", localizedString, arrayList);
                    }
                    TextAlignment textAlignment = this.primary_text_alignment;
                    if (textAlignment != null) {
                        arrayList.add("primary_text_alignment=" + textAlignment);
                    }
                    LocalizedString localizedString2 = this.detail_text;
                    if (localizedString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("detail_text=", localizedString2, arrayList);
                    }
                    TextAlignment textAlignment2 = this.detail_text_alignment;
                    if (textAlignment2 != null) {
                        arrayList.add("detail_text_alignment=" + textAlignment2);
                    }
                    List list = this.bullets;
                    if (!list.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("bullets=", arrayList, list);
                    }
                    Timeline timeline = this.timeline;
                    if (timeline != null) {
                        arrayList.add("timeline=" + timeline);
                    }
                    LocalizedString localizedString3 = this.footer_text;
                    if (localizedString3 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("footer_text=", localizedString3, arrayList);
                    }
                    LocalizedString localizedString4 = this.primary_button_text;
                    if (localizedString4 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("primary_button_text=", localizedString4, arrayList);
                    }
                    String str = this.primary_action_url;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_action_url=", arrayList);
                    }
                    LoanRepaymentSelectionData loanRepaymentSelectionData = this.primary_repayment_selection;
                    if (loanRepaymentSelectionData != null) {
                        arrayList.add("primary_repayment_selection=" + loanRepaymentSelectionData);
                    }
                    LocalizedString localizedString5 = this.dismiss_button_text;
                    if (localizedString5 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("dismiss_button_text=", localizedString5, arrayList);
                    }
                    Color color = this.tint_color;
                    if (color != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
                    }
                    Boolean bool = this.render_as_modal;
                    if (bool != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("render_as_modal=", bool, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "InfoSheet{", "}", 0, null, null, 56);
                }

                public final class Bullet extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<Bullet> CREATOR;
                    public final com.squareup.protos.cash.ui.Icon arcade_icon;
                    public final Icon icon;
                    public final LocalizedString text;

                    public enum Icon implements WireEnum {
                        TIME(0),
                        DEPOSIT(1);

                        public static final BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Bullet$Icon$Companion$ADAPTER$1 ADAPTER;
                        public static final LinkResult.Companion Companion;
                        public final int value;

                        static {
                            Icon icon = TIME;
                            Companion = new LinkResult.Companion();
                            ADAPTER = new BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Bullet$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, icon);
                        }

                        Icon(int i) {
                            this.value = i;
                        }

                        public static final Icon fromValue(int i) {
                            Companion.getClass();
                            if (i == 0) {
                                return TIME;
                            }
                            if (i != 1) {
                                return null;
                            }
                            return DEPOSIT;
                        }

                        @Override // com.squareup.wire.WireEnum
                        public final int getValue() {
                            return this.value;
                        }
                    }

                    static {
                        BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Bullet$Companion$ADAPTER$1 borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Bullet$Companion$ADAPTER$1 = new BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Bullet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Bullet.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                        ADAPTER = borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Bullet$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Bullet$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Bullet(Icon icon, LocalizedString localizedString, com.squareup.protos.cash.ui.Icon icon2, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.icon = icon;
                        this.text = localizedString;
                        this.arcade_icon = icon2;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof Bullet)) {
                            return false;
                        }
                        Bullet bullet = (Bullet) obj;
                        return Intrinsics.areEqual(unknownFields(), bullet.unknownFields()) && this.icon == bullet.icon && Intrinsics.areEqual(this.text, bullet.text) && Intrinsics.areEqual(this.arcade_icon, bullet.arcade_icon);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        Icon icon = this.icon;
                        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                        LocalizedString localizedString = this.text;
                        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                        com.squareup.protos.cash.ui.Icon icon2 = this.arcade_icon;
                        int hashCode4 = hashCode3 + (icon2 != null ? icon2.hashCode() : 0);
                        this.hashCode = hashCode4;
                        return hashCode4;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(14);
                        builder.label = this.icon;
                        builder.localizable_label = this.text;
                        builder.client_scenario = this.arcade_icon;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        Icon icon = this.icon;
                        if (icon != null) {
                            arrayList.add("icon=" + icon);
                        }
                        LocalizedString localizedString = this.text;
                        if (localizedString != null) {
                            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                        }
                        com.squareup.protos.cash.ui.Icon icon2 = this.arcade_icon;
                        if (icon2 != null) {
                            Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon2, arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Bullet{", "}", 0, null, null, 56);
                    }

                    public /* synthetic */ Bullet(LocalizedString localizedString, com.squareup.protos.cash.ui.Icon icon) {
                        this(null, localizedString, icon, ByteString.EMPTY);
                    }
                }
            }
        }
    }
}
