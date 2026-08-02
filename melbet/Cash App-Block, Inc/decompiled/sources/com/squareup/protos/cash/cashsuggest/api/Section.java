package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.redwood.yoga.internal.YGValue;
import app.cash.redwood.yoga.internal.detail.CompactValue;
import app.cash.redwood.yoga.internal.enums.YGUnit;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Section extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Section> CREATOR;
    public final Content content;
    public final Integer default_max_items;
    public final Layout layout;
    public final Button section_action_button;
    public final Text section_header;
    public final String section_id;
    public final Text section_subtitle;
    public final Text section_title;
    public final TapAction tap_action;
    public final String title;

    /* loaded from: classes6.dex */
    public abstract class Content {

        /* loaded from: classes7.dex */
        public final class AvatarOverlayCardSection extends Content {
            public final com.squareup.protos.cash.cashsuggest.api.AvatarOverlayCardSection value;

            public AvatarOverlayCardSection(com.squareup.protos.cash.cashsuggest.api.AvatarOverlayCardSection avatarOverlayCardSection) {
                avatarOverlayCardSection.getClass();
                this.value = avatarOverlayCardSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AvatarOverlayCardSection) && Intrinsics.areEqual(this.value, ((AvatarOverlayCardSection) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AvatarOverlayCardSection(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class AvatarSection extends Content {
            public final com.squareup.protos.cash.cashsuggest.api.AvatarSection value;

            public AvatarSection(com.squareup.protos.cash.cashsuggest.api.AvatarSection avatarSection) {
                avatarSection.getClass();
                this.value = avatarSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AvatarSection) && Intrinsics.areEqual(this.value, ((AvatarSection) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AvatarSection(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class CardSection extends Content {
            public final com.squareup.protos.cash.cashsuggest.api.CardSection value;

            public CardSection(com.squareup.protos.cash.cashsuggest.api.CardSection cardSection) {
                cardSection.getClass();
                this.value = cardSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardSection) && Intrinsics.areEqual(this.value, ((CardSection) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CardSection(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class EmbeddedImageSection extends Content {
            public final com.squareup.protos.cash.cashsuggest.api.EmbeddedImageSection value;

            public EmbeddedImageSection(com.squareup.protos.cash.cashsuggest.api.EmbeddedImageSection embeddedImageSection) {
                embeddedImageSection.getClass();
                this.value = embeddedImageSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmbeddedImageSection) && Intrinsics.areEqual(this.value, ((EmbeddedImageSection) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EmbeddedImageSection(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class PlaceholderSection extends Content {
            public final com.squareup.protos.cash.cashsuggest.api.PlaceholderSection value;

            public PlaceholderSection(com.squareup.protos.cash.cashsuggest.api.PlaceholderSection placeholderSection) {
                placeholderSection.getClass();
                this.value = placeholderSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PlaceholderSection) && Intrinsics.areEqual(this.value, ((PlaceholderSection) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PlaceholderSection(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class RowSection extends Content {
            public final com.squareup.protos.cash.cashsuggest.api.RowSection value;

            public RowSection(com.squareup.protos.cash.cashsuggest.api.RowSection rowSection) {
                rowSection.getClass();
                this.value = rowSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RowSection) && Intrinsics.areEqual(this.value, ((RowSection) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "RowSection(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class TileSection extends Content {
            public final com.squareup.protos.cash.cashsuggest.api.TileSection value;

            public TileSection(com.squareup.protos.cash.cashsuggest.api.TileSection tileSection) {
                tileSection.getClass();
                this.value = tileSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TileSection) && Intrinsics.areEqual(this.value, ((TileSection) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TileSection(value=" + this.value + ")";
            }
        }

        public static CompactValue createCompactValue(YGValue yGValue) {
            YGUnit yGUnit = yGValue.unit;
            float f = yGValue.value;
            int ordinal = yGUnit.ordinal();
            if (ordinal == 0) {
                return new CompactValue();
            }
            if (ordinal == 1) {
                return of(f, YGUnit.YGUnitPoint);
            }
            if (ordinal == 2) {
                return of(f, YGUnit.YGUnitPercent);
            }
            if (ordinal == 3) {
                return new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitAuto));
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewEarningsHome.deepLinkSpecs;
        }

        public static CompactValue of(float f, YGUnit yGUnit) {
            if (f < 1.0842022E-19f && f > -1.0842022E-19f) {
                return new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, yGUnit));
            }
            float f2 = yGUnit == YGUnit.YGUnitPercent ? 1.8446743E19f : 3.6893486E19f;
            if (f > f2 || f < (-f2)) {
                f = (f < RecyclerView.DECELERATION_RATE ? -1 : 1) * Math.abs(f2);
            }
            return new CompactValue(new SVGAndroidRenderer(f, yGUnit));
        }
    }

    public enum Layout implements WireEnum {
        ONE_ROW(1),
        ONE_COLUMN(2),
        TWO_ROWS(3),
        TWO_COLUMNS(4),
        THREE_ROWS(5),
        THREE_COLUMNS(6),
        FOUR_ROWS(7),
        FOUR_COLUMNS(8);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final Section$Layout$Companion$ADAPTER$1 ADAPTER = new Section$Layout$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Layout.class), Syntax.PROTO_2, null);

        Layout(int i) {
            this.value = i;
        }

        public static final Layout fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return ONE_ROW;
                case 2:
                    return ONE_COLUMN;
                case 3:
                    return TWO_ROWS;
                case 4:
                    return TWO_COLUMNS;
                case 5:
                    return THREE_ROWS;
                case 6:
                    return THREE_COLUMNS;
                case 7:
                    return FOUR_ROWS;
                case 8:
                    return FOUR_COLUMNS;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Section$Companion$ADAPTER$1 section$Companion$ADAPTER$1 = new Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.cashsuggest.api.Section", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
        ADAPTER = section$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Section(String str, Content content, Integer num, Text text, Text text2, Button button, Text text3, TapAction tapAction, Layout layout, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.content = content;
        this.default_max_items = num;
        this.section_title = text;
        this.section_subtitle = text2;
        this.section_action_button = button;
        this.section_header = text3;
        this.tap_action = tapAction;
        this.layout = layout;
        this.section_id = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.content, section.content) && Intrinsics.areEqual(this.default_max_items, section.default_max_items) && Intrinsics.areEqual(this.section_title, section.section_title) && Intrinsics.areEqual(this.section_subtitle, section.section_subtitle) && Intrinsics.areEqual(this.section_action_button, section.section_action_button) && Intrinsics.areEqual(this.section_header, section.section_header) && Intrinsics.areEqual(this.tap_action, section.tap_action) && this.layout == section.layout && Intrinsics.areEqual(this.section_id, section.section_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Content content = this.content;
        int hashCode3 = (hashCode2 + (content != null ? content.hashCode() : 0)) * 37;
        Integer num = this.default_max_items;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Text text = this.section_title;
        int hashCode5 = (hashCode4 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.section_subtitle;
        int hashCode6 = (hashCode5 + (text2 != null ? text2.hashCode() : 0)) * 37;
        Button button = this.section_action_button;
        int hashCode7 = (hashCode6 + (button != null ? button.hashCode() : 0)) * 37;
        Text text3 = this.section_header;
        int hashCode8 = (hashCode7 + (text3 != null ? text3.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode9 = (hashCode8 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        Layout layout = this.layout;
        int hashCode10 = (hashCode9 + (layout != null ? layout.hashCode() : 0)) * 37;
        String str2 = this.section_id;
        int hashCode11 = hashCode10 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(2);
        builder.external_id = this.title;
        builder.request_context = this.content;
        builder.external_client_transfer_token = this.default_max_items;
        builder.source = this.section_title;
        builder.target = this.section_subtitle;
        builder.amount = this.section_action_button;
        builder.call_context = this.section_header;
        builder.forwarded_call_context = this.tap_action;
        builder.client_verified_digital_wallet = this.layout;
        builder.passcode_token = this.section_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.title != null) {
            arrayList.add("title=██");
        }
        Content content = this.content;
        if (content != null) {
            arrayList.add("content=" + content);
        }
        Integer num = this.default_max_items;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("default_max_items=", num, arrayList);
        }
        Text text = this.section_title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("section_title=", text, arrayList);
        }
        Text text2 = this.section_subtitle;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("section_subtitle=", text2, arrayList);
        }
        Button button = this.section_action_button;
        if (button != null) {
            arrayList.add("section_action_button=" + button);
        }
        Text text3 = this.section_header;
        if (text3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("section_header=", text3, arrayList);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            arrayList.add("tap_action=" + tapAction);
        }
        Layout layout = this.layout;
        if (layout != null) {
            arrayList.add("layout=" + layout);
        }
        String str = this.section_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "section_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
    }
}
