package com.squareup.protos.invest.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.franklin.ui.UiDda;
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
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes.dex */
public final class Section extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Section> CREATOR;
    public final List rows;
    public final String title;

    /* loaded from: classes8.dex */
    public final class KeyStatsDetailsRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<KeyStatsDetailsRow> CREATOR;
        public final ClientDriven client_driven;
        public final String description;
        public final String label;
        public final String spoken_label;
        public final String value;

        static {
            Section$KeyStatsDetailsRow$Companion$ADAPTER$1 section$KeyStatsDetailsRow$Companion$ADAPTER$1 = new Section$KeyStatsDetailsRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(KeyStatsDetailsRow.class), "type.googleapis.com/squareup.invest.ui.Section.KeyStatsDetailsRow", Syntax.PROTO_2, null, "squareup/invest/ui.proto");
            ADAPTER = section$KeyStatsDetailsRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(section$KeyStatsDetailsRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeyStatsDetailsRow(String str, String str2, String str3, ClientDriven clientDriven, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.value = str2;
            this.description = str3;
            this.client_driven = clientDriven;
            this.spoken_label = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyStatsDetailsRow)) {
                return false;
            }
            KeyStatsDetailsRow keyStatsDetailsRow = (KeyStatsDetailsRow) obj;
            return Intrinsics.areEqual(unknownFields(), keyStatsDetailsRow.unknownFields()) && Intrinsics.areEqual(this.label, keyStatsDetailsRow.label) && Intrinsics.areEqual(this.value, keyStatsDetailsRow.value) && Intrinsics.areEqual(this.description, keyStatsDetailsRow.description) && this.client_driven == keyStatsDetailsRow.client_driven && Intrinsics.areEqual(this.spoken_label, keyStatsDetailsRow.spoken_label);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.description;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            ClientDriven clientDriven = this.client_driven;
            int hashCode5 = (hashCode4 + (clientDriven != null ? clientDriven.hashCode() : 0)) * 37;
            String str4 = this.spoken_label;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileAlias.Builder builder = new ProfileAlias.Builder(26, false);
            builder.alias = this.label;
            builder.verified = this.value;
            builder.expires_at = this.description;
            builder.version = this.client_driven;
            builder.display_date = this.spoken_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.value;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
            }
            String str3 = this.description;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "description=", arrayList);
            }
            ClientDriven clientDriven = this.client_driven;
            if (clientDriven != null) {
                arrayList.add("client_driven=" + clientDriven);
            }
            String str4 = this.spoken_label;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "spoken_label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "KeyStatsDetailsRow{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class Row extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Row> CREATOR;
        public final String label;
        public final MoreInfo more_info;
        public final String spoken_label;
        public final Value value;

        public final class MoreInfo extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<MoreInfo> CREATOR;
            public final String text;
            public final String title;
            public final String url;
            public final String url_text;

            static {
                Section$Row$MoreInfo$Companion$ADAPTER$1 section$Row$MoreInfo$Companion$ADAPTER$1 = new Section$Row$MoreInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoreInfo.class), "type.googleapis.com/squareup.invest.ui.Section.Row.MoreInfo", Syntax.PROTO_2, null, "squareup/invest/ui.proto");
                ADAPTER = section$Row$MoreInfo$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Row$MoreInfo$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoreInfo(String str, String str2, String str3, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.text = str2;
                this.url = str3;
                this.url_text = str4;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MoreInfo)) {
                    return false;
                }
                MoreInfo moreInfo = (MoreInfo) obj;
                return Intrinsics.areEqual(unknownFields(), moreInfo.unknownFields()) && Intrinsics.areEqual(this.title, moreInfo.title) && Intrinsics.areEqual(this.text, moreInfo.text) && Intrinsics.areEqual(this.url, moreInfo.url) && Intrinsics.areEqual(this.url_text, moreInfo.url_text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.text;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.url;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.url_text;
                int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PoolOwner.Builder builder = new PoolOwner.Builder(21);
                builder.customer_token = this.title;
                builder.full_name = this.text;
                builder.profile_photo_url = this.url;
                builder.cashtag = this.url_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.text;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "text=", arrayList);
                }
                String str3 = this.url;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "url=", arrayList);
                }
                String str4 = this.url_text;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "url_text=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "MoreInfo{", "}", 0, null, null, 56);
            }
        }

        public final class Value extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Value> CREATOR;
            public final ClientDriven client_driven;
            public final Color color;
            public final Icon icon;
            public final String text;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Color implements WireEnum {
                public static final /* synthetic */ Color[] $VALUES;
                public static final Section$Row$Value$Color$Companion$ADAPTER$1 ADAPTER;
                public static final UiControl.Type.Companion Companion;
                public static final Color PURPLE;

                static {
                    Color color = new Color("PURPLE", 0);
                    PURPLE = color;
                    $VALUES = new Color[]{color};
                    Companion = new UiControl.Type.Companion();
                    ADAPTER = new Section$Row$Value$Color$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Color.class), Syntax.PROTO_2, null);
                }

                public static final Color fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return PURPLE;
                    }
                    return null;
                }

                public static Color valueOf(String str) {
                    return (Color) Enum.valueOf(Color.class, str);
                }

                public static Color[] values() {
                    return (Color[]) $VALUES.clone();
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return 1;
                }
            }

            public enum Icon implements WireEnum {
                ARROW_UP(1),
                ARROW_DOWN(2);

                public final int value;
                public static final LinkResult.Companion Companion = new LinkResult.Companion();
                public static final Section$Row$Value$Icon$Companion$ADAPTER$1 ADAPTER = new Section$Row$Value$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

                Icon(int i) {
                    this.value = i;
                }

                public static final Icon fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return ARROW_UP;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return ARROW_DOWN;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                Section$Row$Value$Companion$ADAPTER$1 section$Row$Value$Companion$ADAPTER$1 = new Section$Row$Value$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Value.class), "type.googleapis.com/squareup.invest.ui.Section.Row.Value", Syntax.PROTO_2, null, "squareup/invest/ui.proto");
                ADAPTER = section$Row$Value$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Row$Value$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Value(String str, Icon icon, Color color, ClientDriven clientDriven, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
                this.icon = icon;
                this.color = color;
                this.client_driven = clientDriven;
            }

            public static Value copy$default(Value value, String str, ByteString byteString, int i) {
                if ((i & 1) != 0) {
                    str = value.text;
                }
                String str2 = str;
                Icon icon = value.icon;
                Color color = value.color;
                ClientDriven clientDriven = value.client_driven;
                if ((i & 16) != 0) {
                    byteString = value.unknownFields();
                }
                ByteString byteString2 = byteString;
                value.getClass();
                byteString2.getClass();
                return new Value(str2, icon, color, clientDriven, byteString2);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Value)) {
                    return false;
                }
                Value value = (Value) obj;
                return Intrinsics.areEqual(unknownFields(), value.unknownFields()) && Intrinsics.areEqual(this.text, value.text) && this.icon == value.icon && this.color == value.color && this.client_driven == value.client_driven;
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
                Color color = this.color;
                int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
                ClientDriven clientDriven = this.client_driven;
                int hashCode5 = hashCode4 + (clientDriven != null ? clientDriven.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiDda.Builder builder = new UiDda.Builder(14);
                builder.account = this.text;
                builder.enabled = this.icon;
                builder.button = this.color;
                builder.dda_form = this.client_driven;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    arrayList.add("icon=" + icon);
                }
                Color color = this.color;
                if (color != null) {
                    arrayList.add("color=" + color);
                }
                ClientDriven clientDriven = this.client_driven;
                if (clientDriven != null) {
                    arrayList.add("client_driven=" + clientDriven);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Value{", "}", 0, null, null, 56);
            }
        }

        static {
            Section$Row$Companion$ADAPTER$1 section$Row$Companion$ADAPTER$1 = new Section$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.invest.ui.Section.Row", Syntax.PROTO_2, null, "squareup/invest/ui.proto");
            ADAPTER = section$Row$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Row$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Row(String str, Value value, MoreInfo moreInfo, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.value = value;
            this.more_info = moreInfo;
            this.spoken_label = str2;
        }

        public static Row copy$default(Row row, Value value, MoreInfo moreInfo, ByteString byteString, int i) {
            String str = row.label;
            if ((i & 4) != 0) {
                moreInfo = row.more_info;
            }
            MoreInfo moreInfo2 = moreInfo;
            String str2 = row.spoken_label;
            if ((i & 16) != 0) {
                byteString = row.unknownFields();
            }
            ByteString byteString2 = byteString;
            row.getClass();
            byteString2.getClass();
            return new Row(str, value, moreInfo2, str2, byteString2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.label, row.label) && Intrinsics.areEqual(this.value, row.value) && Intrinsics.areEqual(this.more_info, row.more_info) && Intrinsics.areEqual(this.spoken_label, row.spoken_label);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Value value = this.value;
            int hashCode3 = (hashCode2 + (value != null ? value.hashCode() : 0)) * 37;
            MoreInfo moreInfo = this.more_info;
            int hashCode4 = (hashCode3 + (moreInfo != null ? moreInfo.hashCode() : 0)) * 37;
            String str2 = this.spoken_label;
            int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiDda.Builder builder = new UiDda.Builder(13);
            builder.account = this.label;
            builder.enabled = this.value;
            builder.button = this.more_info;
            builder.dda_form = this.spoken_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            Value value = this.value;
            if (value != null) {
                arrayList.add("value=" + value);
            }
            MoreInfo moreInfo = this.more_info;
            if (moreInfo != null) {
                arrayList.add("more_info=" + moreInfo);
            }
            String str2 = this.spoken_label;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "spoken_label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
        }
    }

    static {
        Section$Companion$ADAPTER$1 section$Companion$ADAPTER$1 = new Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.invest.ui.Section", Syntax.PROTO_2, null, "squareup/invest/ui.proto");
        ADAPTER = section$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Section(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.rows = TransactorKt.immutableCopyOf("rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.rows, section.rows);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = this.rows.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ViewPlan.Builder builder = new ViewPlan.Builder(10);
        builder.initial_view_slug = this.title;
        builder.view_entries = this.rows;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        List list = this.rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
    }
}
