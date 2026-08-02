package com.squareup.lending;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes7.dex */
public final class CashCreditScoreEntryPointData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashCreditScoreEntryPointData> CREATOR;
    public final Action action;
    public final List app_supports;
    public final InstalledState installed_state;
    public final UninstalledState uninstalled_state;

    public final class Action extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Action> CREATOR;
        public final String uri;

        static {
            CashCreditScoreEntryPointData$Action$Companion$ADAPTER$1 cashCreditScoreEntryPointData$Action$Companion$ADAPTER$1 = new CashCreditScoreEntryPointData$Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.lending.CashCreditScoreEntryPointData.Action", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_entry_point_data.proto");
            ADAPTER = cashCreditScoreEntryPointData$Action$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreEntryPointData$Action$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.uri = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.uri, action.uri);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.uri;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DisplayName.Builder builder = new DisplayName.Builder(11);
            builder.display_name = this.uri;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.uri;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "uri=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
        }
    }

    public final class InstalledState extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InstalledState> CREATOR;
        public final Integer change_since_last_week;
        public final Graph graph;
        public final Integer score;
        public final Subtitle subtitle;
        public final LocalizedString title;

        public final class Graph extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Graph> CREATOR;
            public final List items;

            public final class Item extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Item> CREATOR;
                public final Float fill_fraction;

                static {
                    CashCreditScoreEntryPointData$InstalledState$Graph$Item$Companion$ADAPTER$1 cashCreditScoreEntryPointData$InstalledState$Graph$Item$Companion$ADAPTER$1 = new CashCreditScoreEntryPointData$InstalledState$Graph$Item$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Item.class), "type.googleapis.com/squareup.lending.CashCreditScoreEntryPointData.InstalledState.Graph.Item", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_entry_point_data.proto");
                    ADAPTER = cashCreditScoreEntryPointData$InstalledState$Graph$Item$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreEntryPointData$InstalledState$Graph$Item$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Item(Float f, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.fill_fraction = f;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) obj;
                    return Intrinsics.areEqual(unknownFields(), item.unknownFields()) && Intrinsics.areEqual(this.fill_fraction, item.fill_fraction);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Float f = this.fill_fraction;
                    int hashCode2 = hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    SubsectionBlock.Builder builder = new SubsectionBlock.Builder(14);
                    builder.f1245type = this.fill_fraction;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Float f = this.fill_fraction;
                    if (f != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("fill_fraction=", f, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Item{", "}", 0, null, null, 56);
                }
            }

            static {
                CashCreditScoreEntryPointData$InstalledState$Graph$Companion$ADAPTER$1 cashCreditScoreEntryPointData$InstalledState$Graph$Companion$ADAPTER$1 = new CashCreditScoreEntryPointData$InstalledState$Graph$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Graph.class), "type.googleapis.com/squareup.lending.CashCreditScoreEntryPointData.InstalledState.Graph", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_entry_point_data.proto");
                ADAPTER = cashCreditScoreEntryPointData$InstalledState$Graph$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreEntryPointData$InstalledState$Graph$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Graph(List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.items = TransactorKt.immutableCopyOf("items", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Graph)) {
                    return false;
                }
                Graph graph = (Graph) obj;
                return Intrinsics.areEqual(unknownFields(), graph.unknownFields()) && Intrinsics.areEqual(this.items, graph.items);
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
                Gradient.Builder builder = new Gradient.Builder(14, false);
                builder.colors = this.items;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                List list = this.items;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Graph{", "}", 0, null, null, 56);
            }
        }

        public final class Subtitle extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Subtitle> CREATOR;
            public final LocalizedString accessibility_description;
            public final LocalizedString brief;
            public final LocalizedString emphasis;

            public final class Builder extends Message.Builder {
                public final /* synthetic */ int $r8$classId;
                public LocalizedString accessibility_description;
                public LocalizedString brief;
                public LocalizedString emphasis;

                public /* synthetic */ Builder(int i) {
                    this.$r8$classId = i;
                }

                @Override // com.squareup.wire.Message.Builder
                public final Message build() {
                    switch (this.$r8$classId) {
                        case 0:
                            return new Subtitle(this.emphasis, this.brief, this.accessibility_description, buildUnknownFields());
                        case 1:
                            return new InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet(this.emphasis, this.brief, this.accessibility_description, buildUnknownFields());
                        default:
                            return new CardBlockedBusinessesUIConfig.ErrorMessageDialog(this.emphasis, this.brief, this.accessibility_description, buildUnknownFields());
                    }
                }
            }

            static {
                CashCreditScoreEntryPointData$InstalledState$Subtitle$Companion$ADAPTER$1 cashCreditScoreEntryPointData$InstalledState$Subtitle$Companion$ADAPTER$1 = new CashCreditScoreEntryPointData$InstalledState$Subtitle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Subtitle.class), "type.googleapis.com/squareup.lending.CashCreditScoreEntryPointData.InstalledState.Subtitle", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_entry_point_data.proto");
                ADAPTER = cashCreditScoreEntryPointData$InstalledState$Subtitle$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreEntryPointData$InstalledState$Subtitle$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Subtitle(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.emphasis = localizedString;
                this.brief = localizedString2;
                this.accessibility_description = localizedString3;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Subtitle)) {
                    return false;
                }
                Subtitle subtitle = (Subtitle) obj;
                return Intrinsics.areEqual(unknownFields(), subtitle.unknownFields()) && Intrinsics.areEqual(this.emphasis, subtitle.emphasis) && Intrinsics.areEqual(this.brief, subtitle.brief) && Intrinsics.areEqual(this.accessibility_description, subtitle.accessibility_description);
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
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.accessibility_description;
                int hashCode4 = hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder(0);
                builder.emphasis = this.emphasis;
                builder.brief = this.brief;
                builder.accessibility_description = this.accessibility_description;
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
                LocalizedString localizedString3 = this.accessibility_description;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("accessibility_description=", localizedString3, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Subtitle{", "}", 0, null, null, 56);
            }
        }

        static {
            CashCreditScoreEntryPointData$InstalledState$Companion$ADAPTER$1 cashCreditScoreEntryPointData$InstalledState$Companion$ADAPTER$1 = new CashCreditScoreEntryPointData$InstalledState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstalledState.class), "type.googleapis.com/squareup.lending.CashCreditScoreEntryPointData.InstalledState", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_entry_point_data.proto");
            ADAPTER = cashCreditScoreEntryPointData$InstalledState$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreEntryPointData$InstalledState$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstalledState(LocalizedString localizedString, Subtitle subtitle, Integer num, Integer num2, Graph graph, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = subtitle;
            this.score = num;
            this.change_since_last_week = num2;
            this.graph = graph;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstalledState)) {
                return false;
            }
            InstalledState installedState = (InstalledState) obj;
            return Intrinsics.areEqual(unknownFields(), installedState.unknownFields()) && Intrinsics.areEqual(this.title, installedState.title) && Intrinsics.areEqual(this.subtitle, installedState.subtitle) && Intrinsics.areEqual(this.score, installedState.score) && Intrinsics.areEqual(this.change_since_last_week, installedState.change_since_last_week) && Intrinsics.areEqual(this.graph, installedState.graph);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Subtitle subtitle = this.subtitle;
            int hashCode3 = (hashCode2 + (subtitle != null ? subtitle.hashCode() : 0)) * 37;
            Integer num = this.score;
            int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.change_since_last_week;
            int hashCode5 = (hashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Graph graph = this.graph;
            int hashCode6 = hashCode5 + (graph != null ? graph.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Node.Builder builder = new Node.Builder(9);
            builder.for_each = this.title;
            builder.moneybot_scaffold = this.subtitle;
            builder.compose_platform = this.score;
            builder.is_included = this.change_since_last_week;
            builder.motion = this.graph;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            Subtitle subtitle = this.subtitle;
            if (subtitle != null) {
                arrayList.add("subtitle=" + subtitle);
            }
            Integer num = this.score;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("score=", num, arrayList);
            }
            Integer num2 = this.change_since_last_week;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("change_since_last_week=", num2, arrayList);
            }
            Graph graph = this.graph;
            if (graph != null) {
                arrayList.add("graph=" + graph);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InstalledState{", "}", 0, null, null, 56);
        }
    }

    public final class UninstalledState extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UninstalledState> CREATOR;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        static {
            CashCreditScoreEntryPointData$UninstalledState$Companion$ADAPTER$1 cashCreditScoreEntryPointData$UninstalledState$Companion$ADAPTER$1 = new CashCreditScoreEntryPointData$UninstalledState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UninstalledState.class), "type.googleapis.com/squareup.lending.CashCreditScoreEntryPointData.UninstalledState", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_entry_point_data.proto");
            ADAPTER = cashCreditScoreEntryPointData$UninstalledState$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreEntryPointData$UninstalledState$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UninstalledState(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = localizedString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UninstalledState)) {
                return false;
            }
            UninstalledState uninstalledState = (UninstalledState) obj;
            return Intrinsics.areEqual(unknownFields(), uninstalledState.unknownFields()) && Intrinsics.areEqual(this.title, uninstalledState.title) && Intrinsics.areEqual(this.subtitle, uninstalledState.subtitle);
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
            int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.HalfApplet.Builder builder = new BillsApplet.HalfApplet.Builder(1);
            builder.title = this.title;
            builder.description = this.subtitle;
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "UninstalledState{", "}", 0, null, null, 56);
        }
    }

    static {
        CashCreditScoreEntryPointData$Companion$ADAPTER$1 cashCreditScoreEntryPointData$Companion$ADAPTER$1 = new CashCreditScoreEntryPointData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashCreditScoreEntryPointData.class), "type.googleapis.com/squareup.lending.CashCreditScoreEntryPointData", Syntax.PROTO_2, null, "squareup/lending/cash_credit_score_entry_point_data.proto");
        ADAPTER = cashCreditScoreEntryPointData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashCreditScoreEntryPointData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashCreditScoreEntryPointData(List list, UninstalledState uninstalledState, InstalledState installedState, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.uninstalled_state = uninstalledState;
        this.installed_state = installedState;
        this.action = action;
        this.app_supports = TransactorKt.immutableCopyOf("app_supports", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashCreditScoreEntryPointData)) {
            return false;
        }
        CashCreditScoreEntryPointData cashCreditScoreEntryPointData = (CashCreditScoreEntryPointData) obj;
        return Intrinsics.areEqual(unknownFields(), cashCreditScoreEntryPointData.unknownFields()) && Intrinsics.areEqual(this.app_supports, cashCreditScoreEntryPointData.app_supports) && Intrinsics.areEqual(this.uninstalled_state, cashCreditScoreEntryPointData.uninstalled_state) && Intrinsics.areEqual(this.installed_state, cashCreditScoreEntryPointData.installed_state) && Intrinsics.areEqual(this.action, cashCreditScoreEntryPointData.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.app_supports);
        UninstalledState uninstalledState = this.uninstalled_state;
        int hashCode = (m + (uninstalledState != null ? uninstalledState.hashCode() : 0)) * 37;
        InstalledState installedState = this.installed_state;
        int hashCode2 = (hashCode + (installedState != null ? installedState.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode3 = hashCode2 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(12);
        builder.collection = this.app_supports;
        builder.template = this.uninstalled_state;
        builder.item_variable = this.installed_state;
        builder.source = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.app_supports;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("app_supports=", arrayList, list);
        }
        UninstalledState uninstalledState = this.uninstalled_state;
        if (uninstalledState != null) {
            arrayList.add("uninstalled_state=" + uninstalledState);
        }
        InstalledState installedState = this.installed_state;
        if (installedState != null) {
            arrayList.add("installed_state=" + installedState);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashCreditScoreEntryPointData{", "}", 0, null, null, 56);
    }
}
