package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.invest.ui.ClientDriven;
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

/* loaded from: classes8.dex */
public final class RoundUpsElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RoundUpsElement> CREATOR;
    public final String accessibility_text;
    public final String client_route;
    public final Icon icon;
    public final String info_text;
    public final Color info_text_background_color;
    public final Color info_text_color;
    public final Font info_text_font;
    public final LocalizableString localizable_accessibility_text;
    public final LocalizableString localizable_info_text;
    public final LocalizableString localizable_main_text;
    public final String main_text;

    public enum Font implements WireEnum {
        MEDIUM(1),
        SMALL(2);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final RoundUpsElement$Font$Companion$ADAPTER$1 ADAPTER = new RoundUpsElement$Font$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Font.class), Syntax.PROTO_2, null);

        Font(int i) {
            this.value = i;
        }

        public static final Font fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return MEDIUM;
            }
            if (i != 2) {
                return null;
            }
            return SMALL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Icon implements WireEnum {
        public static final /* synthetic */ Icon[] $VALUES;
        public static final RoundUpsElement$Icon$Companion$ADAPTER$1 ADAPTER;
        public static final UiControl.Type.Companion Companion;
        public static final Icon ROUND_ARROW_UP;

        static {
            Icon icon = new Icon("ROUND_ARROW_UP", 0);
            ROUND_ARROW_UP = icon;
            $VALUES = new Icon[]{icon};
            Companion = new UiControl.Type.Companion();
            ADAPTER = new RoundUpsElement$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);
        }

        public static final Icon fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ROUND_ARROW_UP;
            }
            return null;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return 1;
        }
    }

    static {
        UiControl.Type.Companion companion = Icon.Companion;
        ClientDriven.Companion companion2 = Font.Companion;
        RoundUpsElement$Companion$ADAPTER$1 roundUpsElement$Companion$ADAPTER$1 = new RoundUpsElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RoundUpsElement.class), "type.googleapis.com/squareup.franklin.common.RoundUpsElement", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
        ADAPTER = roundUpsElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(roundUpsElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundUpsElement(Icon icon, String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, Color color, Color color2, String str3, LocalizableString localizableString3, Font font, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = icon;
        this.main_text = str;
        this.localizable_main_text = localizableString;
        this.info_text = str2;
        this.localizable_info_text = localizableString2;
        this.info_text_color = color;
        this.info_text_background_color = color2;
        this.accessibility_text = str3;
        this.localizable_accessibility_text = localizableString3;
        this.info_text_font = font;
        this.client_route = str4;
    }

    public static RoundUpsElement copy$default(RoundUpsElement roundUpsElement, LocalizableString localizableString, String str, LocalizableString localizableString2, Color color, Color color2, LocalizableString localizableString3, ByteString byteString, int i) {
        Icon icon = roundUpsElement.icon;
        String str2 = roundUpsElement.main_text;
        if ((i & 4) != 0) {
            localizableString = roundUpsElement.localizable_main_text;
        }
        LocalizableString localizableString4 = localizableString;
        if ((i & 8) != 0) {
            str = roundUpsElement.info_text;
        }
        String str3 = str;
        LocalizableString localizableString5 = (i & 16) != 0 ? roundUpsElement.localizable_info_text : localizableString2;
        String str4 = roundUpsElement.accessibility_text;
        LocalizableString localizableString6 = (i & 256) != 0 ? roundUpsElement.localizable_accessibility_text : localizableString3;
        Font font = (i & 512) != 0 ? roundUpsElement.info_text_font : null;
        String str5 = (i & 1024) != 0 ? roundUpsElement.client_route : "https://internal.cash.app/dl/view/investing/round_ups";
        ByteString unknownFields = (i & 2048) != 0 ? roundUpsElement.unknownFields() : byteString;
        roundUpsElement.getClass();
        unknownFields.getClass();
        return new RoundUpsElement(icon, str2, localizableString4, str3, localizableString5, color, color2, str4, localizableString6, font, str5, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoundUpsElement)) {
            return false;
        }
        RoundUpsElement roundUpsElement = (RoundUpsElement) obj;
        return Intrinsics.areEqual(unknownFields(), roundUpsElement.unknownFields()) && this.icon == roundUpsElement.icon && Intrinsics.areEqual(this.main_text, roundUpsElement.main_text) && Intrinsics.areEqual(this.localizable_main_text, roundUpsElement.localizable_main_text) && Intrinsics.areEqual(this.info_text, roundUpsElement.info_text) && Intrinsics.areEqual(this.localizable_info_text, roundUpsElement.localizable_info_text) && Intrinsics.areEqual(this.info_text_color, roundUpsElement.info_text_color) && Intrinsics.areEqual(this.info_text_background_color, roundUpsElement.info_text_background_color) && Intrinsics.areEqual(this.accessibility_text, roundUpsElement.accessibility_text) && Intrinsics.areEqual(this.localizable_accessibility_text, roundUpsElement.localizable_accessibility_text) && this.info_text_font == roundUpsElement.info_text_font && Intrinsics.areEqual(this.client_route, roundUpsElement.client_route);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        String str = this.main_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_main_text;
        int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str2 = this.info_text;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_info_text;
        int hashCode6 = (hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        Color color = this.info_text_color;
        int hashCode7 = (hashCode6 + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.info_text_background_color;
        int hashCode8 = (hashCode7 + (color2 != null ? color2.hashCode() : 0)) * 37;
        String str3 = this.accessibility_text;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalizableString localizableString3 = this.localizable_accessibility_text;
        int hashCode10 = (hashCode9 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
        Font font = this.info_text_font;
        int hashCode11 = (hashCode10 + (font != null ? font.hashCode() : 0)) * 37;
        String str4 = this.client_route;
        int hashCode12 = hashCode11 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(16);
        builder.default_wage = this.icon;
        builder.token = this.main_text;
        builder.created_at_timestamp_ms = this.localizable_main_text;
        builder.merchant_token = this.info_text;
        builder.updated_at_timestamp_ms = this.localizable_info_text;
        builder.deleted_at_timestamp_ms = this.info_text_color;
        builder.team_member_count = this.info_text_background_color;
        builder.title = this.accessibility_text;
        builder.version = this.localizable_accessibility_text;
        builder.tip_eligible = this.info_text_font;
        builder.default_color_scheme = this.client_route;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        String str = this.main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_text=", arrayList);
        }
        LocalizableString localizableString = this.localizable_main_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_main_text=", localizableString, arrayList);
        }
        String str2 = this.info_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "info_text=", arrayList);
        }
        LocalizableString localizableString2 = this.localizable_info_text;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_info_text=", localizableString2, arrayList);
        }
        Color color = this.info_text_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("info_text_color=", color, arrayList);
        }
        Color color2 = this.info_text_background_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("info_text_background_color=", color2, arrayList);
        }
        String str3 = this.accessibility_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "accessibility_text=", arrayList);
        }
        LocalizableString localizableString3 = this.localizable_accessibility_text;
        if (localizableString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_accessibility_text=", localizableString3, arrayList);
        }
        Font font = this.info_text_font;
        if (font != null) {
            arrayList.add("info_text_font=" + font);
        }
        String str4 = this.client_route;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "client_route=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RoundUpsElement{", "}", 0, null, null, 56);
    }
}
