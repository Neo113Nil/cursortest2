package com.squareup.protos.cash.woodrow.syncvalues;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.common.SettingsGroup;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PerformanceDetailsUiSection> CREATOR;
    public final LocalizableString localizable_title;
    public final List rows;
    public final String title;

    public final class Row extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Row> CREATOR;
        public final String label;
        public final LocalizableString localizable_label;
        public final LocalizableString localizable_spoken_label;
        public final MoreInfo more_info;
        public final String spoken_label;
        public final zzlu value;

        public final class MoreInfo extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<MoreInfo> CREATOR;
            public final LocalizableString localizable_text;
            public final LocalizableString localizable_title;
            public final LocalizableString localizable_url_text;
            public final String text;
            public final String title;
            public final String url;
            public final String url_text;

            static {
                PerformanceDetailsUiSection$Row$MoreInfo$Companion$ADAPTER$1 performanceDetailsUiSection$Row$MoreInfo$Companion$ADAPTER$1 = new PerformanceDetailsUiSection$Row$MoreInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoreInfo.class), "type.googleapis.com/squareup.cash.woodrow.syncvalues.PerformanceDetailsUiSection.Row.MoreInfo", Syntax.PROTO_3, null, "squareup/cash/woodrow/syncvalues/types.proto");
                ADAPTER = performanceDetailsUiSection$Row$MoreInfo$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(performanceDetailsUiSection$Row$MoreInfo$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoreInfo(String str, String str2, String str3, String str4, LocalizableString localizableString, LocalizableString localizableString2, LocalizableString localizableString3, ByteString byteString) {
                super(ADAPTER, byteString);
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                byteString.getClass();
                this.title = str;
                this.text = str2;
                this.url = str3;
                this.url_text = str4;
                this.localizable_title = localizableString;
                this.localizable_text = localizableString2;
                this.localizable_url_text = localizableString3;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MoreInfo)) {
                    return false;
                }
                MoreInfo moreInfo = (MoreInfo) obj;
                return Intrinsics.areEqual(unknownFields(), moreInfo.unknownFields()) && Intrinsics.areEqual(this.title, moreInfo.title) && Intrinsics.areEqual(this.text, moreInfo.text) && Intrinsics.areEqual(this.url, moreInfo.url) && Intrinsics.areEqual(this.url_text, moreInfo.url_text) && Intrinsics.areEqual(this.localizable_title, moreInfo.localizable_title) && Intrinsics.areEqual(this.localizable_text, moreInfo.localizable_text) && Intrinsics.areEqual(this.localizable_url_text, moreInfo.localizable_url_text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.title), 37, this.text), 37, this.url), 37, this.url_text);
                LocalizableString localizableString = this.localizable_title;
                int hashCode = (m + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                LocalizableString localizableString2 = this.localizable_text;
                int hashCode2 = (hashCode + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
                LocalizableString localizableString3 = this.localizable_url_text;
                int hashCode3 = hashCode2 + (localizableString3 != null ? localizableString3.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PoolParticipant.Builder builder = new PoolParticipant.Builder(29);
                builder.customer_identifier = this.title;
                builder.full_name = this.text;
                builder.profile_photo_url = this.url;
                builder.cashtag = this.url_text;
                builder.added_at = this.localizable_title;
                builder.participant_type = this.localizable_text;
                builder.aggregated_contribution_amount = this.localizable_url_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                BalanceFeedKt$$ExternalSyntheticOutline0.m(this.title, "title=", arrayList);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(this.text, "text=", arrayList);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(this.url, "url=", arrayList);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(this.url_text, "url_text=", arrayList);
                LocalizableString localizableString = this.localizable_title;
                if (localizableString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
                }
                LocalizableString localizableString2 = this.localizable_text;
                if (localizableString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString2, arrayList);
                }
                LocalizableString localizableString3 = this.localizable_url_text;
                if (localizableString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_url_text=", localizableString3, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "MoreInfo{", "}", 0, null, null, 56);
            }
        }

        public enum ValueType implements WireEnum {
            VALUE_TYPE_UNSPECIFIED(0),
            CURRENT_VALUE(1),
            ALL_TIME_RETURNS(2),
            ALL_TIME_RETURNS_PERCENTAGE(3);

            public static final PerformanceDetailsUiSection$Row$ValueType$Companion$ADAPTER$1 ADAPTER;
            public static final PoolVisibility.Companion Companion;
            public final int value;

            static {
                ValueType valueType = VALUE_TYPE_UNSPECIFIED;
                Companion = new PoolVisibility.Companion();
                ADAPTER = new PerformanceDetailsUiSection$Row$ValueType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ValueType.class), Syntax.PROTO_3, valueType);
            }

            ValueType(int i) {
                this.value = i;
            }

            public static final ValueType fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return VALUE_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return CURRENT_VALUE;
                }
                if (i == 2) {
                    return ALL_TIME_RETURNS;
                }
                if (i != 3) {
                    return null;
                }
                return ALL_TIME_RETURNS_PERCENTAGE;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            PerformanceDetailsUiSection$Row$Companion$ADAPTER$1 performanceDetailsUiSection$Row$Companion$ADAPTER$1 = new PerformanceDetailsUiSection$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.cash.woodrow.syncvalues.PerformanceDetailsUiSection.Row", Syntax.PROTO_3, null, "squareup/cash/woodrow/syncvalues/types.proto");
            ADAPTER = performanceDetailsUiSection$Row$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(performanceDetailsUiSection$Row$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Row(String str, MoreInfo moreInfo, String str2, zzlu zzluVar, LocalizableString localizableString, LocalizableString localizableString2, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            str2.getClass();
            byteString.getClass();
            this.label = str;
            this.more_info = moreInfo;
            this.spoken_label = str2;
            this.value = zzluVar;
            this.localizable_label = localizableString;
            this.localizable_spoken_label = localizableString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.label, row.label) && Intrinsics.areEqual(this.more_info, row.more_info) && Intrinsics.areEqual(this.spoken_label, row.spoken_label) && Intrinsics.areEqual(this.value, row.value) && Intrinsics.areEqual(this.localizable_label, row.localizable_label) && Intrinsics.areEqual(this.localizable_spoken_label, row.localizable_spoken_label);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.label);
            MoreInfo moreInfo = this.more_info;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (moreInfo != null ? moreInfo.hashCode() : 0)) * 37, 37, this.spoken_label);
            zzlu zzluVar = this.value;
            int hashCode = (m2 + (zzluVar != null ? zzluVar.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_label;
            int hashCode2 = (hashCode + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_spoken_label;
            int hashCode3 = hashCode2 + (localizableString2 != null ? localizableString2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Document.Builder builder = new Document.Builder(9, false);
            builder.category = this.label;
            builder.title = this.more_info;
            builder.token = this.spoken_label;
            builder.url = this.value;
            builder.owner_token = this.localizable_label;
            builder.document_date = this.localizable_spoken_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.label, "label=", arrayList);
            MoreInfo moreInfo = this.more_info;
            if (moreInfo != null) {
                arrayList.add("more_info=" + moreInfo);
            }
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.spoken_label, "spoken_label=", arrayList);
            zzlu zzluVar = this.value;
            if (zzluVar != null) {
                arrayList.add("value=" + zzluVar);
            }
            LocalizableString localizableString = this.localizable_label;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_label=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_spoken_label;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_spoken_label=", localizableString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
        }
    }

    static {
        PerformanceDetailsUiSection$Companion$ADAPTER$1 performanceDetailsUiSection$Companion$ADAPTER$1 = new PerformanceDetailsUiSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PerformanceDetailsUiSection.class), "type.googleapis.com/squareup.cash.woodrow.syncvalues.PerformanceDetailsUiSection", Syntax.PROTO_3, null, "squareup/cash/woodrow/syncvalues/types.proto");
        ADAPTER = performanceDetailsUiSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(performanceDetailsUiSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceDetailsUiSection(LocalizableString localizableString, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.localizable_title = localizableString;
        this.rows = TransactorKt.immutableCopyOf("rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PerformanceDetailsUiSection)) {
            return false;
        }
        PerformanceDetailsUiSection performanceDetailsUiSection = (PerformanceDetailsUiSection) obj;
        return Intrinsics.areEqual(unknownFields(), performanceDetailsUiSection.unknownFields()) && Intrinsics.areEqual(this.title, performanceDetailsUiSection.title) && Intrinsics.areEqual(this.rows, performanceDetailsUiSection.rows) && Intrinsics.areEqual(this.localizable_title, performanceDetailsUiSection.localizable_title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.title), 37, this.rows);
        LocalizableString localizableString = this.localizable_title;
        int hashCode = m + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SettingsGroup.Builder builder = new SettingsGroup.Builder(1);
        builder.title = this.title;
        builder.settings_categories = this.rows;
        builder.localizable_title = this.localizable_title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.title, "title=", arrayList);
        List list = this.rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
        }
        LocalizableString localizableString = this.localizable_title;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerformanceDetailsUiSection{", "}", 0, null, null, 56);
    }
}
