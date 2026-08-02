package com.squareup.protos.lending;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_face.zzja;
import com.google.android.gms.internal.mlkit_vision_face.zzjb;
import com.google.android.gms.internal.mlkit_vision_face.zzjc;
import com.google.android.gms.internal.mlkit_vision_face.zzjd;
import com.google.android.gms.internal.mlkit_vision_face.zzje;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.invest.ui.ClientDriven;
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
import squareup.cash.earnings.ActiveDistributionSection;
import squareup.cash.earnings.ActivitySection;
import squareup.cash.savings.GoalFolder;
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PrepurchaseAfterpayAppletData> CREATOR;
    public final String analytics_sheet_type;
    public final List applet_rows;
    public final UiAvatar avatar;
    public final List button_stack;
    public final LocalizedString footer_markdown;
    public final ByteString opaque_request_data;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    public final class AppletRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AppletRow> CREATOR;
        public final String analytics_row_type;
        public final zzjb content;

        public final class Cell extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Cell> CREATOR;
            public final LocalizedString leading_text;
            public final zzja trailing_content;

            public final class Option extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Option> CREATOR;
                public final LocalizedString option_description;
                public final LocalizedString option_header;
                public final LocalizedString option_secondary_description;
                public final LocalizedString summary_text;
                public final String unique_option_id;

                static {
                    PrepurchaseAfterpayAppletData$AppletRow$Cell$Option$Companion$ADAPTER$1 prepurchaseAfterpayAppletData$AppletRow$Cell$Option$Companion$ADAPTER$1 = new PrepurchaseAfterpayAppletData$AppletRow$Cell$Option$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Option.class), "type.googleapis.com/squareup.lending.PrepurchaseAfterpayAppletData.AppletRow.Cell.Option", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
                    ADAPTER = prepurchaseAfterpayAppletData$AppletRow$Cell$Option$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseAfterpayAppletData$AppletRow$Cell$Option$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Option(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.summary_text = localizedString;
                    this.option_header = localizedString2;
                    this.option_description = localizedString3;
                    this.option_secondary_description = localizedString4;
                    this.unique_option_id = str;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Option)) {
                        return false;
                    }
                    Option option = (Option) obj;
                    return Intrinsics.areEqual(unknownFields(), option.unknownFields()) && Intrinsics.areEqual(this.summary_text, option.summary_text) && Intrinsics.areEqual(this.option_header, option.option_header) && Intrinsics.areEqual(this.option_description, option.option_description) && Intrinsics.areEqual(this.option_secondary_description, option.option_secondary_description) && Intrinsics.areEqual(this.unique_option_id, option.unique_option_id);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalizedString localizedString = this.summary_text;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    LocalizedString localizedString2 = this.option_header;
                    int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                    LocalizedString localizedString3 = this.option_description;
                    int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                    LocalizedString localizedString4 = this.option_secondary_description;
                    int hashCode5 = (hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
                    String str = this.unique_option_id;
                    int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
                    this.hashCode = hashCode6;
                    return hashCode6;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ActivitySection.Builder builder = new ActivitySection.Builder(2);
                    builder.title = this.summary_text;
                    builder.no_activity_subtitle = this.option_header;
                    builder.load_failure_subtitle = this.option_description;
                    builder.view_all_button_title = this.option_secondary_description;
                    builder.view_all_client_route = this.unique_option_id;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalizedString localizedString = this.summary_text;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("summary_text=", localizedString, arrayList);
                    }
                    LocalizedString localizedString2 = this.option_header;
                    if (localizedString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("option_header=", localizedString2, arrayList);
                    }
                    LocalizedString localizedString3 = this.option_description;
                    if (localizedString3 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("option_description=", localizedString3, arrayList);
                    }
                    LocalizedString localizedString4 = this.option_secondary_description;
                    if (localizedString4 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("option_secondary_description=", localizedString4, arrayList);
                    }
                    String str = this.unique_option_id;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "unique_option_id=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Option{", "}", 0, null, null, 56);
                }
            }

            public final class Options extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Options> CREATOR;
                public final List options;
                public final LocalizedString screen_subtitle;
                public final LocalizedString screen_title;
                public final String selected_option_id;

                static {
                    PrepurchaseAfterpayAppletData$AppletRow$Cell$Options$Companion$ADAPTER$1 prepurchaseAfterpayAppletData$AppletRow$Cell$Options$Companion$ADAPTER$1 = new PrepurchaseAfterpayAppletData$AppletRow$Cell$Options$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Options.class), "type.googleapis.com/squareup.lending.PrepurchaseAfterpayAppletData.AppletRow.Cell.Options", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
                    ADAPTER = prepurchaseAfterpayAppletData$AppletRow$Cell$Options$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseAfterpayAppletData$AppletRow$Cell$Options$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Options(LocalizedString localizedString, LocalizedString localizedString2, String str, List list, ByteString byteString) {
                    super(ADAPTER, byteString);
                    list.getClass();
                    byteString.getClass();
                    this.selected_option_id = str;
                    this.screen_title = localizedString;
                    this.screen_subtitle = localizedString2;
                    this.options = TransactorKt.immutableCopyOf("options", list);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Options)) {
                        return false;
                    }
                    Options options = (Options) obj;
                    return Intrinsics.areEqual(unknownFields(), options.unknownFields()) && Intrinsics.areEqual(this.options, options.options) && Intrinsics.areEqual(this.selected_option_id, options.selected_option_id) && Intrinsics.areEqual(this.screen_title, options.screen_title) && Intrinsics.areEqual(this.screen_subtitle, options.screen_subtitle);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.options);
                    String str = this.selected_option_id;
                    int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
                    LocalizedString localizedString = this.screen_title;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    LocalizedString localizedString2 = this.screen_subtitle;
                    int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
                    this.hashCode = hashCode3;
                    return hashCode3;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ActiveDistributionSection.Builder builder = new ActiveDistributionSection.Builder(1);
                    builder.stream_avatars = this.options;
                    builder.client_route = this.selected_option_id;
                    builder.title_text = this.screen_title;
                    builder.edit_button_text = this.screen_subtitle;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    List list = this.options;
                    if (!list.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("options=", arrayList, list);
                    }
                    String str = this.selected_option_id;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selected_option_id=", arrayList);
                    }
                    LocalizedString localizedString = this.screen_title;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("screen_title=", localizedString, arrayList);
                    }
                    LocalizedString localizedString2 = this.screen_subtitle;
                    if (localizedString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("screen_subtitle=", localizedString2, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Options{", "}", 0, null, null, 56);
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class UnknownState implements WireEnum {
                public static final /* synthetic */ UnknownState[] $VALUES;
                public static final PrepurchaseAfterpayAppletData$AppletRow$Cell$UnknownState$Companion$ADAPTER$1 ADAPTER;
                public static final ClientDriven.Companion Companion;
                public static final UnknownState SELECTABLE_OPTION;

                static {
                    UnknownState unknownState = new UnknownState("SELECTABLE_OPTION", 0);
                    SELECTABLE_OPTION = unknownState;
                    $VALUES = new UnknownState[]{unknownState};
                    Companion = new ClientDriven.Companion();
                    ADAPTER = new PrepurchaseAfterpayAppletData$AppletRow$Cell$UnknownState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UnknownState.class), Syntax.PROTO_2, null);
                }

                public static final UnknownState fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return SELECTABLE_OPTION;
                    }
                    return null;
                }

                public static UnknownState valueOf(String str) {
                    return (UnknownState) Enum.valueOf(UnknownState.class, str);
                }

                public static UnknownState[] values() {
                    return (UnknownState[]) $VALUES.clone();
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return 1;
                }
            }

            static {
                PrepurchaseAfterpayAppletData$AppletRow$Cell$Companion$ADAPTER$1 prepurchaseAfterpayAppletData$AppletRow$Cell$Companion$ADAPTER$1 = new PrepurchaseAfterpayAppletData$AppletRow$Cell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Cell.class), "type.googleapis.com/squareup.lending.PrepurchaseAfterpayAppletData.AppletRow.Cell", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
                ADAPTER = prepurchaseAfterpayAppletData$AppletRow$Cell$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseAfterpayAppletData$AppletRow$Cell$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Cell(LocalizedString localizedString, zzja zzjaVar, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.leading_text = localizedString;
                this.trailing_content = zzjaVar;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Cell)) {
                    return false;
                }
                Cell cell = (Cell) obj;
                return Intrinsics.areEqual(unknownFields(), cell.unknownFields()) && Intrinsics.areEqual(this.leading_text, cell.leading_text) && Intrinsics.areEqual(this.trailing_content, cell.trailing_content);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.leading_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                zzja zzjaVar = this.trailing_content;
                int hashCode3 = hashCode2 + (zzjaVar != null ? zzjaVar.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                AppLinks.Builder builder = new AppLinks.Builder(9);
                builder.f1411android = this.leading_text;
                builder.ios = this.trailing_content;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.leading_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("leading_text=", localizedString, arrayList);
                }
                zzja zzjaVar = this.trailing_content;
                if (zzjaVar != null) {
                    arrayList.add("trailing_content=" + zzjaVar);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Cell{", "}", 0, null, null, 56);
            }
        }

        public final class UnorderedList extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<UnorderedList> CREATOR;
            public final List items;

            public final class ListItem extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<ListItem> CREATOR;
                public final LocalizedString leading_text;
                public final zzjc trailing_content;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class UnknownState implements WireEnum {
                    public static final /* synthetic */ UnknownState[] $VALUES;
                    public static final PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$UnknownState$Companion$ADAPTER$1 ADAPTER;
                    public static final UiControl.Type.Companion Companion;
                    public static final UnknownState FIXED_STRING;

                    static {
                        UnknownState unknownState = new UnknownState("FIXED_STRING", 0);
                        FIXED_STRING = unknownState;
                        $VALUES = new UnknownState[]{unknownState};
                        Companion = new UiControl.Type.Companion();
                        ADAPTER = new PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$UnknownState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UnknownState.class), Syntax.PROTO_2, null);
                    }

                    public static final UnknownState fromValue(int i) {
                        Companion.getClass();
                        if (i == 1) {
                            return FIXED_STRING;
                        }
                        return null;
                    }

                    public static UnknownState valueOf(String str) {
                        return (UnknownState) Enum.valueOf(UnknownState.class, str);
                    }

                    public static UnknownState[] values() {
                        return (UnknownState[]) $VALUES.clone();
                    }

                    @Override // com.squareup.wire.WireEnum
                    public final int getValue() {
                        return 1;
                    }
                }

                static {
                    PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$Companion$ADAPTER$1 prepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$Companion$ADAPTER$1 = new PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListItem.class), "type.googleapis.com/squareup.lending.PrepurchaseAfterpayAppletData.AppletRow.UnorderedList.ListItem", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
                    ADAPTER = prepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ListItem(LocalizedString localizedString, zzjc zzjcVar, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.leading_text = localizedString;
                    this.trailing_content = zzjcVar;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof ListItem)) {
                        return false;
                    }
                    ListItem listItem = (ListItem) obj;
                    return Intrinsics.areEqual(unknownFields(), listItem.unknownFields()) && Intrinsics.areEqual(this.leading_text, listItem.leading_text) && Intrinsics.areEqual(this.trailing_content, listItem.trailing_content);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalizedString localizedString = this.leading_text;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    zzjc zzjcVar = this.trailing_content;
                    int hashCode3 = hashCode2 + (zzjcVar != null ? zzjcVar.hashCode() : 0);
                    this.hashCode = hashCode3;
                    return hashCode3;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    AppLinks.Builder builder = new AppLinks.Builder(10);
                    builder.f1411android = this.leading_text;
                    builder.ios = this.trailing_content;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalizedString localizedString = this.leading_text;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("leading_text=", localizedString, arrayList);
                    }
                    zzjc zzjcVar = this.trailing_content;
                    if (zzjcVar != null) {
                        arrayList.add("trailing_content=" + zzjcVar);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "ListItem{", "}", 0, null, null, 56);
                }
            }

            static {
                PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$Companion$ADAPTER$1 prepurchaseAfterpayAppletData$AppletRow$UnorderedList$Companion$ADAPTER$1 = new PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnorderedList.class), "type.googleapis.com/squareup.lending.PrepurchaseAfterpayAppletData.AppletRow.UnorderedList", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
                ADAPTER = prepurchaseAfterpayAppletData$AppletRow$UnorderedList$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseAfterpayAppletData$AppletRow$UnorderedList$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnorderedList(List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.items = TransactorKt.immutableCopyOf("items", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof UnorderedList)) {
                    return false;
                }
                UnorderedList unorderedList = (UnorderedList) obj;
                return Intrinsics.areEqual(unknownFields(), unorderedList.unknownFields()) && Intrinsics.areEqual(this.items, unorderedList.items);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Collection.Builder builder = new Collection.Builder(9, false);
                builder.items = this.items;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                List list = this.items;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "UnorderedList{", "}", 0, null, null, 56);
            }
        }

        static {
            PrepurchaseAfterpayAppletData$AppletRow$Companion$ADAPTER$1 prepurchaseAfterpayAppletData$AppletRow$Companion$ADAPTER$1 = new PrepurchaseAfterpayAppletData$AppletRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppletRow.class), "type.googleapis.com/squareup.lending.PrepurchaseAfterpayAppletData.AppletRow", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
            ADAPTER = prepurchaseAfterpayAppletData$AppletRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseAfterpayAppletData$AppletRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppletRow(zzjb zzjbVar, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.content = zzjbVar;
            this.analytics_row_type = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppletRow)) {
                return false;
            }
            AppletRow appletRow = (AppletRow) obj;
            return Intrinsics.areEqual(unknownFields(), appletRow.unknownFields()) && Intrinsics.areEqual(this.content, appletRow.content) && Intrinsics.areEqual(this.analytics_row_type, appletRow.analytics_row_type);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            zzjb zzjbVar = this.content;
            int hashCode2 = (hashCode + (zzjbVar != null ? zzjbVar.hashCode() : 0)) * 37;
            String str = this.analytics_row_type;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(8);
            builder.f1411android = this.content;
            builder.ios = this.analytics_row_type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            zzjb zzjbVar = this.content;
            if (zzjbVar != null) {
                arrayList.add("content=" + zzjbVar);
            }
            String str = this.analytics_row_type;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "analytics_row_type=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppletRow{", "}", 0, null, null, 56);
        }
    }

    public final class ButtonData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ButtonData> CREATOR;
        public final zzje state;

        public final class Content extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Content> CREATOR;
            public final zzjd action;
            public final String analytics_button_type;
            public final LocalizedString text;

            static {
                PrepurchaseAfterpayAppletData$ButtonData$Content$Companion$ADAPTER$1 prepurchaseAfterpayAppletData$ButtonData$Content$Companion$ADAPTER$1 = new PrepurchaseAfterpayAppletData$ButtonData$Content$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Content.class), "type.googleapis.com/squareup.lending.PrepurchaseAfterpayAppletData.ButtonData.Content", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
                ADAPTER = prepurchaseAfterpayAppletData$ButtonData$Content$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseAfterpayAppletData$ButtonData$Content$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Content(zzjd zzjdVar, LocalizedString localizedString, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.action = zzjdVar;
                this.text = localizedString;
                this.analytics_button_type = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.areEqual(unknownFields(), content.unknownFields()) && Intrinsics.areEqual(this.action, content.action) && Intrinsics.areEqual(this.text, content.text) && Intrinsics.areEqual(this.analytics_button_type, content.analytics_button_type);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                zzjd zzjdVar = this.action;
                int hashCode2 = (hashCode + (zzjdVar != null ? zzjdVar.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.text;
                int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                String str = this.analytics_button_type;
                int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                GiftCard.Options.Builder builder = new GiftCard.Options.Builder(12);
                builder.localizable_label = this.action;
                builder.client_scenario = this.text;
                builder.label = this.analytics_button_type;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                zzjd zzjdVar = this.action;
                if (zzjdVar != null) {
                    arrayList.add("action=" + zzjdVar);
                }
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                String str = this.analytics_button_type;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "analytics_button_type=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Content{", "}", 0, null, null, 56);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class UnknownState implements WireEnum {
            public static final /* synthetic */ UnknownState[] $VALUES;
            public static final PrepurchaseAfterpayAppletData$ButtonData$UnknownState$Companion$ADAPTER$1 ADAPTER;
            public static final LinkResult.Companion Companion;
            public static final UnknownState FIXED_STRING;

            static {
                UnknownState unknownState = new UnknownState("FIXED_STRING", 0);
                FIXED_STRING = unknownState;
                $VALUES = new UnknownState[]{unknownState};
                Companion = new LinkResult.Companion();
                ADAPTER = new PrepurchaseAfterpayAppletData$ButtonData$UnknownState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UnknownState.class), Syntax.PROTO_2, null);
            }

            public static final UnknownState fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return FIXED_STRING;
                }
                return null;
            }

            public static UnknownState valueOf(String str) {
                return (UnknownState) Enum.valueOf(UnknownState.class, str);
            }

            public static UnknownState[] values() {
                return (UnknownState[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return 1;
            }
        }

        static {
            PrepurchaseAfterpayAppletData$ButtonData$Companion$ADAPTER$1 prepurchaseAfterpayAppletData$ButtonData$Companion$ADAPTER$1 = new PrepurchaseAfterpayAppletData$ButtonData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonData.class), "type.googleapis.com/squareup.lending.PrepurchaseAfterpayAppletData.ButtonData", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
            ADAPTER = prepurchaseAfterpayAppletData$ButtonData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseAfterpayAppletData$ButtonData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonData(zzje zzjeVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.state = zzjeVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ButtonData)) {
                return false;
            }
            ButtonData buttonData = (ButtonData) obj;
            return Intrinsics.areEqual(unknownFields(), buttonData.unknownFields()) && Intrinsics.areEqual(this.state, buttonData.state);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            zzje zzjeVar = this.state;
            int hashCode2 = hashCode + (zzjeVar != null ? zzjeVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiCashLimits.Builder builder = new UiCashLimits.Builder(22);
            builder.cash_limit_group = this.state;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            zzje zzjeVar = this.state;
            if (zzjeVar != null) {
                arrayList.add("state=" + zzjeVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonData{", "}", 0, null, null, 56);
        }
    }

    static {
        PrepurchaseAfterpayAppletData$Companion$ADAPTER$1 prepurchaseAfterpayAppletData$Companion$ADAPTER$1 = new PrepurchaseAfterpayAppletData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PrepurchaseAfterpayAppletData.class), "type.googleapis.com/squareup.lending.PrepurchaseAfterpayAppletData", Syntax.PROTO_2, null, "squareup/lending/prepurchase_afterpay_applet_data.proto");
        ADAPTER = prepurchaseAfterpayAppletData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(prepurchaseAfterpayAppletData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepurchaseAfterpayAppletData(UiAvatar uiAvatar, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, List list, List list2, ByteString byteString, String str, ByteString byteString2) {
        super(ADAPTER, byteString2);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString2);
        this.avatar = uiAvatar;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.footer_markdown = localizedString3;
        this.opaque_request_data = byteString;
        this.analytics_sheet_type = str;
        this.applet_rows = TransactorKt.immutableCopyOf("applet_rows", list);
        this.button_stack = TransactorKt.immutableCopyOf("button_stack", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrepurchaseAfterpayAppletData)) {
            return false;
        }
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = (PrepurchaseAfterpayAppletData) obj;
        return Intrinsics.areEqual(unknownFields(), prepurchaseAfterpayAppletData.unknownFields()) && Intrinsics.areEqual(this.avatar, prepurchaseAfterpayAppletData.avatar) && Intrinsics.areEqual(this.title, prepurchaseAfterpayAppletData.title) && Intrinsics.areEqual(this.subtitle, prepurchaseAfterpayAppletData.subtitle) && Intrinsics.areEqual(this.footer_markdown, prepurchaseAfterpayAppletData.footer_markdown) && Intrinsics.areEqual(this.applet_rows, prepurchaseAfterpayAppletData.applet_rows) && Intrinsics.areEqual(this.button_stack, prepurchaseAfterpayAppletData.button_stack) && Intrinsics.areEqual(this.opaque_request_data, prepurchaseAfterpayAppletData.opaque_request_data) && Intrinsics.areEqual(this.analytics_sheet_type, prepurchaseAfterpayAppletData.analytics_sheet_type);
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
        LocalizedString localizedString2 = this.subtitle;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.footer_markdown;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37, 37, this.applet_rows), 37, this.button_stack);
        ByteString byteString = this.opaque_request_data;
        int hashCode5 = (m + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.analytics_sheet_type;
        int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GoalFolder.Builder builder = new GoalFolder.Builder(7);
        builder.icon_unicode = this.avatar;
        builder.completion_token = this.title;
        builder.label = this.subtitle;
        builder.goal_flow_parameters = this.footer_markdown;
        builder.met_goal = this.applet_rows;
        builder.goal_amount = this.button_stack;
        builder.goal_progress_percentage = this.opaque_request_data;
        builder.token = this.analytics_sheet_type;
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
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.footer_markdown;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("footer_markdown=", localizedString3, arrayList);
        }
        List list = this.applet_rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("applet_rows=", arrayList, list);
        }
        List list2 = this.button_stack;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("button_stack=", arrayList, list2);
        }
        ByteString byteString = this.opaque_request_data;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("opaque_request_data=", byteString, arrayList);
        }
        String str = this.analytics_sheet_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "analytics_sheet_type=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrepurchaseAfterpayAppletData{", "}", 0, null, null, 56);
    }
}
