package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.employeejobs.Job;
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

/* loaded from: classes.dex */
public final class LocalCashActivity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCashActivity> CREATOR;
    public final String header;
    public final List rows;

    /* loaded from: classes7.dex */
    public final class Row extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Row> CREATOR;
        public final LocalColor background_color;
        public final String brand_token;
        public final String client_route;
        public final String description;
        public final Long expires_at;
        public final LocalImage image;
        public final String label;
        public final String location_token;
        public final Source source;
        public final Long transacted_at;
        public final LocalText value;

        public enum Source implements WireEnum {
            SOURCE_UNSPECIFIED(0),
            SOURCE_BUYER_ENROLLED(1);

            public static final LocalCashActivity$Row$Source$Companion$ADAPTER$1 ADAPTER;
            public static final FeeType.Companion Companion;
            public final int value;

            static {
                Source source = SOURCE_UNSPECIFIED;
                Companion = new FeeType.Companion();
                ADAPTER = new LocalCashActivity$Row$Source$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Source.class), Syntax.PROTO_2, source);
            }

            Source(int i) {
                this.value = i;
            }

            public static final Source fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return SOURCE_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return SOURCE_BUYER_ENROLLED;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            LocalCashActivity$Row$Companion$ADAPTER$1 localCashActivity$Row$Companion$ADAPTER$1 = new LocalCashActivity$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCashActivity.Row", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cash.proto");
            ADAPTER = localCashActivity$Row$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localCashActivity$Row$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Row(LocalImage localImage, String str, String str2, Long l, Long l2, LocalText localText, LocalColor localColor, String str3, String str4, String str5, Source source, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = localImage;
            this.label = str;
            this.description = str2;
            this.transacted_at = l;
            this.expires_at = l2;
            this.value = localText;
            this.background_color = localColor;
            this.client_route = str3;
            this.brand_token = str4;
            this.location_token = str5;
            this.source = source;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.image, row.image) && Intrinsics.areEqual(this.label, row.label) && Intrinsics.areEqual(this.description, row.description) && Intrinsics.areEqual(this.transacted_at, row.transacted_at) && Intrinsics.areEqual(this.expires_at, row.expires_at) && Intrinsics.areEqual(this.value, row.value) && Intrinsics.areEqual(this.background_color, row.background_color) && Intrinsics.areEqual(this.client_route, row.client_route) && Intrinsics.areEqual(this.brand_token, row.brand_token) && Intrinsics.areEqual(this.location_token, row.location_token) && this.source == row.source;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalImage localImage = this.image;
            int hashCode2 = (hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37;
            String str = this.label;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Long l = this.transacted_at;
            int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.expires_at;
            int hashCode6 = (hashCode5 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            LocalText localText = this.value;
            int hashCode7 = (hashCode6 + (localText != null ? localText.hashCode() : 0)) * 37;
            LocalColor localColor = this.background_color;
            int hashCode8 = (hashCode7 + (localColor != null ? localColor.hashCode() : 0)) * 37;
            String str3 = this.client_route;
            int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.brand_token;
            int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.location_token;
            int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
            Source source = this.source;
            int hashCode12 = hashCode11 + (source != null ? source.hashCode() : 0);
            this.hashCode = hashCode12;
            return hashCode12;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Job.Builder builder = new Job.Builder(8);
            builder.default_wage = this.image;
            builder.token = this.label;
            builder.merchant_token = this.description;
            builder.created_at_timestamp_ms = this.transacted_at;
            builder.updated_at_timestamp_ms = this.expires_at;
            builder.deleted_at_timestamp_ms = this.value;
            builder.team_member_count = this.background_color;
            builder.title = this.client_route;
            builder.version = this.brand_token;
            builder.tip_eligible = this.location_token;
            builder.default_color_scheme = this.source;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalImage localImage = this.image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
            }
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            Long l = this.transacted_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("transacted_at=", l, arrayList);
            }
            Long l2 = this.expires_at;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l2, arrayList);
            }
            LocalText localText = this.value;
            if (localText != null) {
                arrayList.add("value=" + localText);
            }
            LocalColor localColor = this.background_color;
            if (localColor != null) {
                SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor, arrayList);
            }
            String str3 = this.client_route;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "client_route=", arrayList);
            }
            String str4 = this.brand_token;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "brand_token=", arrayList);
            }
            String str5 = this.location_token;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "location_token=", arrayList);
            }
            Source source = this.source;
            if (source != null) {
                arrayList.add("source=" + source);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalCashActivity$Companion$ADAPTER$1 localCashActivity$Companion$ADAPTER$1 = new LocalCashActivity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCashActivity.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCashActivity", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cash.proto");
        ADAPTER = localCashActivity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCashActivity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCashActivity(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.header = str;
        this.rows = TransactorKt.immutableCopyOf("rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCashActivity)) {
            return false;
        }
        LocalCashActivity localCashActivity = (LocalCashActivity) obj;
        return Intrinsics.areEqual(unknownFields(), localCashActivity.unknownFields()) && Intrinsics.areEqual(this.header, localCashActivity.header) && Intrinsics.areEqual(this.rows, localCashActivity.rows);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.header;
        int hashCode2 = this.rows.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(21);
        builder.toggle_title = this.header;
        builder.sections = this.rows;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.header;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header=", arrayList);
        }
        List list = this.rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCashActivity{", "}", 0, null, null, 56);
    }
}
