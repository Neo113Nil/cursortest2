package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzji;
import com.google.android.gms.internal.mlkit_vision_face.zzjj;
import com.google.android.gms.internal.mlkit_vision_face.zzjk;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.ColoredString;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.invest.ui.ClientDriven;
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
import squareup.cash.bills.BillsApplet;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class BorrowData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BorrowData> CREATOR;
    public final AppletData applet_data;

    public final class AppletData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AppletData> CREATOR;
        public final List entry_points;
        public final LocalizedString title;
        public final List vertical_layout;

        public final class EntryPointData extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<EntryPointData> CREATOR;
            public final List app_supports;
            public final zzji entry_point;
            public final zzjj entry_point_v2;

            public final class HiddenEntryPoint extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<HiddenEntryPoint> CREATOR;
                public final Reason hidden_reason;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class Reason implements WireEnum {
                    public static final /* synthetic */ Reason[] $VALUES;
                    public static final BorrowData$AppletData$EntryPointData$HiddenEntryPoint$Reason$Companion$ADAPTER$1 ADAPTER;
                    public static final KeyScope.Companion Companion;
                    public static final Reason UNKNOWN;

                    static {
                        Reason reason = new Reason("UNKNOWN", 0);
                        UNKNOWN = reason;
                        $VALUES = new Reason[]{reason};
                        Companion = new KeyScope.Companion();
                        ADAPTER = new BorrowData$AppletData$EntryPointData$HiddenEntryPoint$Reason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Reason.class), Syntax.PROTO_2, reason);
                    }

                    public static final Reason fromValue(int i) {
                        Companion.getClass();
                        if (i == 0) {
                            return UNKNOWN;
                        }
                        return null;
                    }

                    public static Reason valueOf(String str) {
                        return (Reason) Enum.valueOf(Reason.class, str);
                    }

                    public static Reason[] values() {
                        return (Reason[]) $VALUES.clone();
                    }

                    @Override // com.squareup.wire.WireEnum
                    public final int getValue() {
                        return 0;
                    }
                }

                static {
                    BorrowData$AppletData$EntryPointData$HiddenEntryPoint$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$HiddenEntryPoint$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$HiddenEntryPoint$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HiddenEntryPoint.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.HiddenEntryPoint", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = borrowData$AppletData$EntryPointData$HiddenEntryPoint$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$HiddenEntryPoint$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public HiddenEntryPoint(Reason reason, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.hidden_reason = reason;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof HiddenEntryPoint)) {
                        return false;
                    }
                    HiddenEntryPoint hiddenEntryPoint = (HiddenEntryPoint) obj;
                    return Intrinsics.areEqual(unknownFields(), hiddenEntryPoint.unknownFields()) && this.hidden_reason == hiddenEntryPoint.hidden_reason;
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Reason reason = this.hidden_reason;
                    int hashCode2 = hashCode + (reason != null ? reason.hashCode() : 0);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    UiCashLimits.Builder builder = new UiCashLimits.Builder(25);
                    builder.cash_limit_group = this.hidden_reason;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Reason reason = this.hidden_reason;
                    if (reason != null) {
                        arrayList.add("hidden_reason=" + reason);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "HiddenEntryPoint{", "}", 0, null, null, 56);
                }
            }

            public final class RowEntryPoint extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<RowEntryPoint> CREATOR;
                public final Boolean badged;
                public final String client_route;
                public final LocalizedString subtitle;
                public final LocalizedString title;

                static {
                    BorrowData$AppletData$EntryPointData$RowEntryPoint$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$RowEntryPoint$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$RowEntryPoint$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RowEntryPoint.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.RowEntryPoint", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = borrowData$AppletData$EntryPointData$RowEntryPoint$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$RowEntryPoint$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public RowEntryPoint(LocalizedString localizedString, LocalizedString localizedString2, Boolean bool, String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.title = localizedString;
                    this.subtitle = localizedString2;
                    this.badged = bool;
                    this.client_route = str;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof RowEntryPoint)) {
                        return false;
                    }
                    RowEntryPoint rowEntryPoint = (RowEntryPoint) obj;
                    return Intrinsics.areEqual(unknownFields(), rowEntryPoint.unknownFields()) && Intrinsics.areEqual(this.title, rowEntryPoint.title) && Intrinsics.areEqual(this.subtitle, rowEntryPoint.subtitle) && Intrinsics.areEqual(this.badged, rowEntryPoint.badged) && Intrinsics.areEqual(this.client_route, rowEntryPoint.client_route);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalizedString localizedString = this.title;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    LocalizedString localizedString2 = this.subtitle;
                    int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                    Boolean bool = this.badged;
                    int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                    String str = this.client_route;
                    int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
                    this.hashCode = hashCode5;
                    return hashCode5;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    UiDda.Builder builder = new UiDda.Builder(16);
                    builder.account = this.title;
                    builder.button = this.subtitle;
                    builder.enabled = this.badged;
                    builder.dda_form = this.client_route;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalizedString localizedString = this.title;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                    }
                    LocalizedString localizedString2 = this.subtitle;
                    if (localizedString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
                    }
                    Boolean bool = this.badged;
                    if (bool != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("badged=", bool, arrayList);
                    }
                    String str = this.client_route;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "RowEntryPoint{", "}", 0, null, null, 56);
                }
            }

            public final class TileEntryPoint extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<TileEntryPoint> CREATOR;
                public final String client_route;
                public final RowEntryPoint fallback_row_entry_point;
                public final FullWidthTile full_width_tile;
                public final HalfWidthTile half_width_tile;

                public final class Badge extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<Badge> CREATOR;
                    public final Color color;
                    public final LocalizedString text;

                    static {
                        BorrowData$AppletData$EntryPointData$TileEntryPoint$Badge$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$TileEntryPoint$Badge$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Badge$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Badge.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                        ADAPTER = borrowData$AppletData$EntryPointData$TileEntryPoint$Badge$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$TileEntryPoint$Badge$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Badge(LocalizedString localizedString, Color color, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.color = color;
                        this.text = localizedString;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof Badge)) {
                            return false;
                        }
                        Badge badge = (Badge) obj;
                        return Intrinsics.areEqual(unknownFields(), badge.unknownFields()) && Intrinsics.areEqual(this.color, badge.color) && Intrinsics.areEqual(this.text, badge.text);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        Color color = this.color;
                        int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
                        LocalizedString localizedString = this.text;
                        int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
                        this.hashCode = hashCode3;
                        return hashCode3;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        ColoredString.Builder builder = new ColoredString.Builder(2);
                        builder.color = this.color;
                        builder.text = this.text;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        Color color = this.color;
                        if (color != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
                        }
                        LocalizedString localizedString = this.text;
                        if (localizedString != null) {
                            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Badge{", "}", 0, null, null, 56);
                    }
                }

                public final class FullWidthTile extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<FullWidthTile> CREATOR;
                    public final Badge badge;
                    public final List rows;
                    public final LocalizedString title;

                    static {
                        BorrowData$AppletData$EntryPointData$TileEntryPoint$FullWidthTile$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$TileEntryPoint$FullWidthTile$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$TileEntryPoint$FullWidthTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FullWidthTile.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                        ADAPTER = borrowData$AppletData$EntryPointData$TileEntryPoint$FullWidthTile$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$TileEntryPoint$FullWidthTile$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public FullWidthTile(LocalizedString localizedString, List list, Badge badge, ByteString byteString) {
                        super(ADAPTER, byteString);
                        list.getClass();
                        byteString.getClass();
                        this.title = localizedString;
                        this.badge = badge;
                        this.rows = TransactorKt.immutableCopyOf("rows", list);
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof FullWidthTile)) {
                            return false;
                        }
                        FullWidthTile fullWidthTile = (FullWidthTile) obj;
                        return Intrinsics.areEqual(unknownFields(), fullWidthTile.unknownFields()) && Intrinsics.areEqual(this.title, fullWidthTile.title) && Intrinsics.areEqual(this.rows, fullWidthTile.rows) && Intrinsics.areEqual(this.badge, fullWidthTile.badge);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        LocalizedString localizedString = this.title;
                        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.rows);
                        Badge badge = this.badge;
                        int hashCode2 = m + (badge != null ? badge.hashCode() : 0);
                        this.hashCode = hashCode2;
                        return hashCode2;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(19);
                        builder.label = this.title;
                        builder.localizable_label = this.rows;
                        builder.client_scenario = this.badge;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        LocalizedString localizedString = this.title;
                        if (localizedString != null) {
                            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                        }
                        List list = this.rows;
                        if (!list.isEmpty()) {
                            re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
                        }
                        Badge badge = this.badge;
                        if (badge != null) {
                            arrayList.add("badge=" + badge);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "FullWidthTile{", "}", 0, null, null, 56);
                    }
                }

                public final class Graphic extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<Graphic> CREATOR;
                    public final LocalizedString accessibility_description;
                    public final Float fill_percent;
                    public final Color foreground_color;
                    public final Icon foreground_icon;
                    public final Color primary_color;

                    public enum Icon implements WireEnum {
                        BORROW_LOGO(1),
                        EXCLAMATION(2);

                        public final int value;
                        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
                        public static final BorrowData$AppletData$EntryPointData$TileEntryPoint$Graphic$Icon$Companion$ADAPTER$1 ADAPTER = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Graphic$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

                        Icon(int i) {
                            this.value = i;
                        }

                        public static final Icon fromValue(int i) {
                            Companion.getClass();
                            if (i == 1) {
                                return BORROW_LOGO;
                            }
                            if (i != 2) {
                                return null;
                            }
                            return EXCLAMATION;
                        }

                        @Override // com.squareup.wire.WireEnum
                        public final int getValue() {
                            return this.value;
                        }
                    }

                    static {
                        BorrowData$AppletData$EntryPointData$TileEntryPoint$Graphic$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$TileEntryPoint$Graphic$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Graphic$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Graphic.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                        ADAPTER = borrowData$AppletData$EntryPointData$TileEntryPoint$Graphic$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$TileEntryPoint$Graphic$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Graphic(Color color, Color color2, Icon icon, Float f, LocalizedString localizedString, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.primary_color = color;
                        this.foreground_color = color2;
                        this.foreground_icon = icon;
                        this.fill_percent = f;
                        this.accessibility_description = localizedString;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof Graphic)) {
                            return false;
                        }
                        Graphic graphic = (Graphic) obj;
                        return Intrinsics.areEqual(unknownFields(), graphic.unknownFields()) && Intrinsics.areEqual(this.primary_color, graphic.primary_color) && Intrinsics.areEqual(this.foreground_color, graphic.foreground_color) && this.foreground_icon == graphic.foreground_icon && Intrinsics.areEqual(this.fill_percent, graphic.fill_percent) && Intrinsics.areEqual(this.accessibility_description, graphic.accessibility_description);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        Color color = this.primary_color;
                        int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
                        Color color2 = this.foreground_color;
                        int hashCode3 = (hashCode2 + (color2 != null ? color2.hashCode() : 0)) * 37;
                        Icon icon = this.foreground_icon;
                        int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
                        Float f = this.fill_percent;
                        int hashCode5 = (hashCode4 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
                        LocalizedString localizedString = this.accessibility_description;
                        int hashCode6 = hashCode5 + (localizedString != null ? localizedString.hashCode() : 0);
                        this.hashCode = hashCode6;
                        return hashCode6;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        ProfileAlias.Builder builder = new ProfileAlias.Builder(29, false);
                        builder.alias = this.primary_color;
                        builder.verified = this.foreground_color;
                        builder.expires_at = this.foreground_icon;
                        builder.version = this.fill_percent;
                        builder.display_date = this.accessibility_description;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        Color color = this.primary_color;
                        if (color != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("primary_color=", color, arrayList);
                        }
                        Color color2 = this.foreground_color;
                        if (color2 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("foreground_color=", color2, arrayList);
                        }
                        Icon icon = this.foreground_icon;
                        if (icon != null) {
                            arrayList.add("foreground_icon=" + icon);
                        }
                        Float f = this.fill_percent;
                        if (f != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("fill_percent=", f, arrayList);
                        }
                        LocalizedString localizedString = this.accessibility_description;
                        if (localizedString != null) {
                            Matcher$$ExternalSyntheticOutline0.m("accessibility_description=", localizedString, arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Graphic{", "}", 0, null, null, 56);
                    }
                }

                public final class HalfWidthTile extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<HalfWidthTile> CREATOR;
                    public final Graphic graphic;
                    public final Boolean is_applet_adopted;
                    public final LocalizedString primary_text;
                    public final LocalizedString secondary_text;
                    public final LocalizedString subtitle;
                    public final LocalizedString title;

                    static {
                        BorrowData$AppletData$EntryPointData$TileEntryPoint$HalfWidthTile$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$TileEntryPoint$HalfWidthTile$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$TileEntryPoint$HalfWidthTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HalfWidthTile.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                        ADAPTER = borrowData$AppletData$EntryPointData$TileEntryPoint$HalfWidthTile$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$TileEntryPoint$HalfWidthTile$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public HalfWidthTile(LocalizedString localizedString, LocalizedString localizedString2, Graphic graphic, LocalizedString localizedString3, LocalizedString localizedString4, Boolean bool, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.title = localizedString;
                        this.subtitle = localizedString2;
                        this.graphic = graphic;
                        this.primary_text = localizedString3;
                        this.secondary_text = localizedString4;
                        this.is_applet_adopted = bool;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof HalfWidthTile)) {
                            return false;
                        }
                        HalfWidthTile halfWidthTile = (HalfWidthTile) obj;
                        return Intrinsics.areEqual(unknownFields(), halfWidthTile.unknownFields()) && Intrinsics.areEqual(this.title, halfWidthTile.title) && Intrinsics.areEqual(this.subtitle, halfWidthTile.subtitle) && Intrinsics.areEqual(this.graphic, halfWidthTile.graphic) && Intrinsics.areEqual(this.primary_text, halfWidthTile.primary_text) && Intrinsics.areEqual(this.secondary_text, halfWidthTile.secondary_text) && Intrinsics.areEqual(this.is_applet_adopted, halfWidthTile.is_applet_adopted);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        LocalizedString localizedString = this.title;
                        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                        LocalizedString localizedString2 = this.subtitle;
                        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                        Graphic graphic = this.graphic;
                        int hashCode4 = (hashCode3 + (graphic != null ? graphic.hashCode() : 0)) * 37;
                        LocalizedString localizedString3 = this.primary_text;
                        int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                        LocalizedString localizedString4 = this.secondary_text;
                        int hashCode6 = (hashCode5 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
                        Boolean bool = this.is_applet_adopted;
                        int hashCode7 = hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                        this.hashCode = hashCode7;
                        return hashCode7;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(21, false);
                        builder.full_name = this.title;
                        builder.photo_url = this.subtitle;
                        builder.synopsis = this.graphic;
                        builder.full_cashtag = this.primary_text;
                        builder.is_verified_account = this.secondary_text;
                        builder.cashtag_url_enabled = this.is_applet_adopted;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        LocalizedString localizedString = this.title;
                        if (localizedString != null) {
                            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                        }
                        LocalizedString localizedString2 = this.subtitle;
                        if (localizedString2 != null) {
                            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
                        }
                        Graphic graphic = this.graphic;
                        if (graphic != null) {
                            arrayList.add("graphic=" + graphic);
                        }
                        LocalizedString localizedString3 = this.primary_text;
                        if (localizedString3 != null) {
                            Matcher$$ExternalSyntheticOutline0.m("primary_text=", localizedString3, arrayList);
                        }
                        LocalizedString localizedString4 = this.secondary_text;
                        if (localizedString4 != null) {
                            Matcher$$ExternalSyntheticOutline0.m("secondary_text=", localizedString4, arrayList);
                        }
                        Boolean bool = this.is_applet_adopted;
                        if (bool != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_applet_adopted=", bool, arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "HalfWidthTile{", "}", 0, null, null, 56);
                    }
                }

                public final class Row extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<Row> CREATOR;
                    public final Icon icon;
                    public final Color icon_background_color;
                    public final Color icon_foreground_color;
                    public final DetailText text;
                    public final zzjk visual;

                    public final class Allocations extends AndroidMessage {
                        public static final ProtoAdapter ADAPTER;
                        public static final Parcelable.Creator<Allocations> CREATOR;
                        public final List values;

                        public final class Allocation extends AndroidMessage {
                            public static final ProtoAdapter ADAPTER;
                            public static final Parcelable.Creator<Allocation> CREATOR;
                            public final Color color;
                            public final Float percent;

                            static {
                                BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Allocation$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Allocation$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Allocation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Allocation.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                                ADAPTER = borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Allocation$Companion$ADAPTER$1;
                                AndroidMessage.Companion.getClass();
                                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Allocation$Companion$ADAPTER$1);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public Allocation(Color color, Float f, ByteString byteString) {
                                super(ADAPTER, byteString);
                                byteString.getClass();
                                this.color = color;
                                this.percent = f;
                            }

                            public final boolean equals(Object obj) {
                                if (obj == this) {
                                    return true;
                                }
                                if (!(obj instanceof Allocation)) {
                                    return false;
                                }
                                Allocation allocation = (Allocation) obj;
                                return Intrinsics.areEqual(unknownFields(), allocation.unknownFields()) && Intrinsics.areEqual(this.color, allocation.color) && Intrinsics.areEqual(this.percent, allocation.percent);
                            }

                            public final int hashCode() {
                                int i = this.hashCode;
                                if (i != 0) {
                                    return i;
                                }
                                int hashCode = unknownFields().hashCode() * 37;
                                Color color = this.color;
                                int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
                                Float f = this.percent;
                                int hashCode3 = hashCode2 + (f != null ? Float.hashCode(f.floatValue()) : 0);
                                this.hashCode = hashCode3;
                                return hashCode3;
                            }

                            @Override // com.squareup.wire.Message
                            public final Message.Builder newBuilder() {
                                SegmentedCircle.Segment.Builder builder = new SegmentedCircle.Segment.Builder(1);
                                builder.color = this.color;
                                builder.percent = this.percent;
                                builder.addUnknownFields(unknownFields());
                                return builder;
                            }

                            public final String toString() {
                                ArrayList arrayList = new ArrayList();
                                Color color = this.color;
                                if (color != null) {
                                    BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
                                }
                                Float f = this.percent;
                                if (f != null) {
                                    BalanceFeedKt$$ExternalSyntheticOutline0.m("percent=", f, arrayList);
                                }
                                return CollectionsKt.joinToString$default(arrayList, ", ", "Allocation{", "}", 0, null, null, 56);
                            }
                        }

                        static {
                            BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Allocations.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                            ADAPTER = borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Companion$ADAPTER$1;
                            AndroidMessage.Companion.getClass();
                            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Companion$ADAPTER$1);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public Allocations(List list, ByteString byteString) {
                            super(ADAPTER, byteString);
                            list.getClass();
                            byteString.getClass();
                            this.values = TransactorKt.immutableCopyOf("values", list);
                        }

                        public final boolean equals(Object obj) {
                            if (obj == this) {
                                return true;
                            }
                            if (!(obj instanceof Allocations)) {
                                return false;
                            }
                            Allocations allocations = (Allocations) obj;
                            return Intrinsics.areEqual(unknownFields(), allocations.unknownFields()) && Intrinsics.areEqual(this.values, allocations.values);
                        }

                        public final int hashCode() {
                            int i = this.hashCode;
                            if (i != 0) {
                                return i;
                            }
                            int hashCode = this.values.hashCode() + (unknownFields().hashCode() * 37);
                            this.hashCode = hashCode;
                            return hashCode;
                        }

                        @Override // com.squareup.wire.Message
                        public final Message.Builder newBuilder() {
                            Collection.Builder builder = new Collection.Builder(15, false);
                            builder.items = this.values;
                            builder.addUnknownFields(unknownFields());
                            return builder;
                        }

                        public final String toString() {
                            ArrayList arrayList = new ArrayList();
                            List list = this.values;
                            if (!list.isEmpty()) {
                                re$$ExternalSyntheticOutline0.m("values=", arrayList, list);
                            }
                            return CollectionsKt.joinToString$default(arrayList, ", ", "Allocations{", "}", 0, null, null, 56);
                        }
                    }

                    public final class DetailText extends AndroidMessage {
                        public static final ProtoAdapter ADAPTER;
                        public static final Parcelable.Creator<DetailText> CREATOR;
                        public final LocalizedString brief;
                        public final LocalizedString emphasis;

                        static {
                            BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$DetailText$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$TileEntryPoint$Row$DetailText$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$DetailText$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailText.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                            ADAPTER = borrowData$AppletData$EntryPointData$TileEntryPoint$Row$DetailText$Companion$ADAPTER$1;
                            AndroidMessage.Companion.getClass();
                            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$TileEntryPoint$Row$DetailText$Companion$ADAPTER$1);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public DetailText(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
                            super(ADAPTER, byteString);
                            byteString.getClass();
                            this.emphasis = localizedString;
                            this.brief = localizedString2;
                        }

                        public final boolean equals(Object obj) {
                            if (obj == this) {
                                return true;
                            }
                            if (!(obj instanceof DetailText)) {
                                return false;
                            }
                            DetailText detailText = (DetailText) obj;
                            return Intrinsics.areEqual(unknownFields(), detailText.unknownFields()) && Intrinsics.areEqual(this.emphasis, detailText.emphasis) && Intrinsics.areEqual(this.brief, detailText.brief);
                        }

                        public final int hashCode() {
                            int i = this.hashCode;
                            if (i != 0) {
                                return i;
                            }
                            int hashCode = unknownFields().hashCode() * 37;
                            LocalizedString localizedString = this.emphasis;
                            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                            LocalizedString localizedString2 = this.brief;
                            int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
                            this.hashCode = hashCode3;
                            return hashCode3;
                        }

                        @Override // com.squareup.wire.Message
                        public final Message.Builder newBuilder() {
                            BillsApplet.HalfApplet.Builder builder = new BillsApplet.HalfApplet.Builder(5);
                            builder.title = this.emphasis;
                            builder.description = this.brief;
                            builder.addUnknownFields(unknownFields());
                            return builder;
                        }

                        public final String toString() {
                            ArrayList arrayList = new ArrayList();
                            LocalizedString localizedString = this.emphasis;
                            if (localizedString != null) {
                                Matcher$$ExternalSyntheticOutline0.m("emphasis=", localizedString, arrayList);
                            }
                            LocalizedString localizedString2 = this.brief;
                            if (localizedString2 != null) {
                                Matcher$$ExternalSyntheticOutline0.m("brief=", localizedString2, arrayList);
                            }
                            return CollectionsKt.joinToString$default(arrayList, ", ", "DetailText{", "}", 0, null, null, 56);
                        }
                    }

                    public enum Icon implements WireEnum {
                        BORROW_ARROW(1),
                        CALENDAR(2),
                        EXCLAMATION(3);

                        public final int value;
                        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
                        public static final BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Icon$Companion$ADAPTER$1 ADAPTER = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

                        Icon(int i) {
                            this.value = i;
                        }

                        public static final Icon fromValue(int i) {
                            Companion.getClass();
                            if (i == 1) {
                                return BORROW_ARROW;
                            }
                            if (i == 2) {
                                return CALENDAR;
                            }
                            if (i != 3) {
                                return null;
                            }
                            return EXCLAMATION;
                        }

                        @Override // com.squareup.wire.WireEnum
                        public final int getValue() {
                            return this.value;
                        }
                    }

                    static {
                        BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.TileEntryPoint.Row", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                        ADAPTER = borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Row(Icon icon, Color color, Color color2, zzjk zzjkVar, DetailText detailText, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.icon = icon;
                        this.icon_foreground_color = color;
                        this.icon_background_color = color2;
                        this.visual = zzjkVar;
                        this.text = detailText;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof Row)) {
                            return false;
                        }
                        Row row = (Row) obj;
                        return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && this.icon == row.icon && Intrinsics.areEqual(this.icon_foreground_color, row.icon_foreground_color) && Intrinsics.areEqual(this.icon_background_color, row.icon_background_color) && Intrinsics.areEqual(this.visual, row.visual) && Intrinsics.areEqual(this.text, row.text);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        Icon icon = this.icon;
                        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                        Color color = this.icon_foreground_color;
                        int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
                        Color color2 = this.icon_background_color;
                        int hashCode4 = (hashCode3 + (color2 != null ? color2.hashCode() : 0)) * 37;
                        zzjk zzjkVar = this.visual;
                        int hashCode5 = (hashCode4 + (zzjkVar != null ? zzjkVar.hashCode() : 0)) * 37;
                        DetailText detailText = this.text;
                        int hashCode6 = hashCode5 + (detailText != null ? detailText.hashCode() : 0);
                        this.hashCode = hashCode6;
                        return hashCode6;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        Binding.Builder builder = new Binding.Builder(1);
                        builder.key_path = this.icon;
                        builder.get_transform = this.icon_foreground_color;
                        builder.set_transform = this.icon_background_color;
                        builder.validation = this.visual;
                        builder.on_invalid = this.text;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        Icon icon = this.icon;
                        if (icon != null) {
                            arrayList.add("icon=" + icon);
                        }
                        Color color = this.icon_foreground_color;
                        if (color != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("icon_foreground_color=", color, arrayList);
                        }
                        Color color2 = this.icon_background_color;
                        if (color2 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("icon_background_color=", color2, arrayList);
                        }
                        zzjk zzjkVar = this.visual;
                        if (zzjkVar != null) {
                            arrayList.add("visual=" + zzjkVar);
                        }
                        DetailText detailText = this.text;
                        if (detailText != null) {
                            arrayList.add("text=" + detailText);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
                    }
                }

                static {
                    BorrowData$AppletData$EntryPointData$TileEntryPoint$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$TileEntryPoint$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$TileEntryPoint$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TileEntryPoint.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData.TileEntryPoint", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = borrowData$AppletData$EntryPointData$TileEntryPoint$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$TileEntryPoint$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TileEntryPoint(String str, RowEntryPoint rowEntryPoint, FullWidthTile fullWidthTile, HalfWidthTile halfWidthTile, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.client_route = str;
                    this.fallback_row_entry_point = rowEntryPoint;
                    this.full_width_tile = fullWidthTile;
                    this.half_width_tile = halfWidthTile;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof TileEntryPoint)) {
                        return false;
                    }
                    TileEntryPoint tileEntryPoint = (TileEntryPoint) obj;
                    return Intrinsics.areEqual(unknownFields(), tileEntryPoint.unknownFields()) && Intrinsics.areEqual(this.client_route, tileEntryPoint.client_route) && Intrinsics.areEqual(this.fallback_row_entry_point, tileEntryPoint.fallback_row_entry_point) && Intrinsics.areEqual(this.full_width_tile, tileEntryPoint.full_width_tile) && Intrinsics.areEqual(this.half_width_tile, tileEntryPoint.half_width_tile);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.client_route;
                    int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                    RowEntryPoint rowEntryPoint = this.fallback_row_entry_point;
                    int hashCode3 = (hashCode2 + (rowEntryPoint != null ? rowEntryPoint.hashCode() : 0)) * 37;
                    FullWidthTile fullWidthTile = this.full_width_tile;
                    int hashCode4 = (hashCode3 + (fullWidthTile != null ? fullWidthTile.hashCode() : 0)) * 37;
                    HalfWidthTile halfWidthTile = this.half_width_tile;
                    int hashCode5 = hashCode4 + (halfWidthTile != null ? halfWidthTile.hashCode() : 0);
                    this.hashCode = hashCode5;
                    return hashCode5;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    UiDda.Builder builder = new UiDda.Builder(17);
                    builder.account = this.client_route;
                    builder.enabled = this.fallback_row_entry_point;
                    builder.button = this.full_width_tile;
                    builder.dda_form = this.half_width_tile;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.client_route;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
                    }
                    RowEntryPoint rowEntryPoint = this.fallback_row_entry_point;
                    if (rowEntryPoint != null) {
                        arrayList.add("fallback_row_entry_point=" + rowEntryPoint);
                    }
                    FullWidthTile fullWidthTile = this.full_width_tile;
                    if (fullWidthTile != null) {
                        arrayList.add("full_width_tile=" + fullWidthTile);
                    }
                    HalfWidthTile halfWidthTile = this.half_width_tile;
                    if (halfWidthTile != null) {
                        arrayList.add("half_width_tile=" + halfWidthTile);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "TileEntryPoint{", "}", 0, null, null, 56);
                }
            }

            static {
                BorrowData$AppletData$EntryPointData$Companion$ADAPTER$1 borrowData$AppletData$EntryPointData$Companion$ADAPTER$1 = new BorrowData$AppletData$EntryPointData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EntryPointData.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData.EntryPointData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = borrowData$AppletData$EntryPointData$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$EntryPointData$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EntryPointData(List list, zzji zzjiVar, zzjj zzjjVar, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.entry_point = zzjiVar;
                this.entry_point_v2 = zzjjVar;
                this.app_supports = TransactorKt.immutableCopyOf("app_supports", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EntryPointData)) {
                    return false;
                }
                EntryPointData entryPointData = (EntryPointData) obj;
                return Intrinsics.areEqual(unknownFields(), entryPointData.unknownFields()) && Intrinsics.areEqual(this.app_supports, entryPointData.app_supports) && Intrinsics.areEqual(this.entry_point, entryPointData.entry_point) && Intrinsics.areEqual(this.entry_point_v2, entryPointData.entry_point_v2);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.app_supports);
                zzji zzjiVar = this.entry_point;
                int hashCode = (m + (zzjiVar != null ? zzjiVar.hashCode() : 0)) * 37;
                zzjj zzjjVar = this.entry_point_v2;
                int hashCode2 = hashCode + (zzjjVar != null ? zzjjVar.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                GiftCard.Options.Builder builder = new GiftCard.Options.Builder(18);
                builder.label = this.app_supports;
                builder.localizable_label = this.entry_point;
                builder.client_scenario = this.entry_point_v2;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                List list = this.app_supports;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("app_supports=", arrayList, list);
                }
                zzji zzjiVar = this.entry_point;
                if (zzjiVar != null) {
                    arrayList.add("entry_point=" + zzjiVar);
                }
                zzjj zzjjVar = this.entry_point_v2;
                if (zzjjVar != null) {
                    arrayList.add("entry_point_v2=" + zzjjVar);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "EntryPointData{", "}", 0, null, null, 56);
            }
        }

        static {
            BorrowData$AppletData$Companion$ADAPTER$1 borrowData$AppletData$Companion$ADAPTER$1 = new BorrowData$AppletData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppletData.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData.AppletData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
            ADAPTER = borrowData$AppletData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$AppletData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppletData(List list, List list2, LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.title = localizedString;
            this.entry_points = TransactorKt.immutableCopyOf("entry_points", list);
            this.vertical_layout = TransactorKt.immutableCopyOf("vertical_layout", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppletData)) {
                return false;
            }
            AppletData appletData = (AppletData) obj;
            return Intrinsics.areEqual(unknownFields(), appletData.unknownFields()) && Intrinsics.areEqual(this.entry_points, appletData.entry_points) && Intrinsics.areEqual(this.vertical_layout, appletData.vertical_layout) && Intrinsics.areEqual(this.title, appletData.title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.entry_points), 37, this.vertical_layout);
            LocalizedString localizedString = this.title;
            int hashCode = m + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Options.Builder builder = new GiftCard.Options.Builder(17);
            builder.label = this.entry_points;
            builder.localizable_label = this.vertical_layout;
            builder.client_scenario = this.title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.entry_points;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("entry_points=", arrayList, list);
            }
            List list2 = this.vertical_layout;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("vertical_layout=", arrayList, list2);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppletData{", "}", 0, null, null, 56);
        }
    }

    public enum TileType implements WireEnum {
        CREDIT_LIMIT_AND_BORROW_BUTTON(0),
        PAYMENT_TIMELINE_TILE(1),
        BULLETINS_TILE(2),
        LOAN_HISTORY_TILE(3),
        LINKS_TILE(4);

        public static final BorrowData$TileType$Companion$ADAPTER$1 ADAPTER;
        public static final LinkResult.Companion Companion;
        public final int value;

        static {
            TileType tileType = CREDIT_LIMIT_AND_BORROW_BUTTON;
            Companion = new LinkResult.Companion();
            ADAPTER = new BorrowData$TileType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TileType.class), Syntax.PROTO_2, tileType);
        }

        TileType(int i) {
            this.value = i;
        }

        public static final TileType fromValue(int i) {
            Companion.getClass();
            return LinkResult.Companion.m3962fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BorrowData$Companion$ADAPTER$1 borrowData$Companion$ADAPTER$1 = new BorrowData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BorrowData.class), "type.googleapis.com/squareup.lending.sync_values.BorrowData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = borrowData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowData(AppletData appletData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.applet_data = appletData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BorrowData)) {
            return false;
        }
        BorrowData borrowData = (BorrowData) obj;
        return Intrinsics.areEqual(unknownFields(), borrowData.unknownFields()) && Intrinsics.areEqual(this.applet_data, borrowData.applet_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppletData appletData = this.applet_data;
        int hashCode2 = hashCode + (appletData != null ? appletData.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(26);
        builder.cash_limit_group = this.applet_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppletData appletData = this.applet_data;
        if (appletData != null) {
            arrayList.add("applet_data=" + appletData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BorrowData{", "}", 0, null, null, 56);
    }
}
