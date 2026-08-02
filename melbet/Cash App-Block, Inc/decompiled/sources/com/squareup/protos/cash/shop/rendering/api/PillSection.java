package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.time.DateTime;
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

/* loaded from: classes8.dex */
public final class PillSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PillSection> CREATOR;
    public final List pills;

    public final class Pill extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Pill> CREATOR;
        public final AnalyticsEvent analytics_view_event;
        public final Color background_color;
        public final LocalizedString l_text;
        public final TapAction tap_action;
        public final String text;

        static {
            PillSection$Pill$Companion$ADAPTER$1 pillSection$Pill$Companion$ADAPTER$1 = new PillSection$Pill$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Pill.class), "type.googleapis.com/squareup.cash.shop.rendering.api.PillSection.Pill", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/PillSection.proto");
            ADAPTER = pillSection$Pill$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(pillSection$Pill$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pill(AnalyticsEvent analyticsEvent, TapAction tapAction, LocalizedString localizedString, Color color, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.analytics_view_event = analyticsEvent;
            this.tap_action = tapAction;
            this.l_text = localizedString;
            this.background_color = color;
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Pill)) {
                return false;
            }
            Pill pill = (Pill) obj;
            return Intrinsics.areEqual(unknownFields(), pill.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, pill.analytics_view_event) && Intrinsics.areEqual(this.tap_action, pill.tap_action) && Intrinsics.areEqual(this.l_text, pill.l_text) && Intrinsics.areEqual(this.background_color, pill.background_color) && Intrinsics.areEqual(this.text, pill.text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
            TapAction tapAction = this.tap_action;
            int hashCode3 = (hashCode2 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.l_text;
            int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Color color = this.background_color;
            int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
            String str = this.text;
            int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DateTime.Builder builder = new DateTime.Builder(17, false);
            builder.instant_usec = this.analytics_view_event;
            builder.ordinal = this.tap_action;
            builder.timezone_offset_min = this.l_text;
            builder.tz_name = this.background_color;
            builder.posix_tz = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            if (analyticsEvent != null) {
                SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
            }
            TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            LocalizedString localizedString = this.l_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_text=", localizedString, arrayList);
            }
            Color color = this.background_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
            }
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Pill{", "}", 0, null, null, 56);
        }
    }

    static {
        PillSection$Companion$ADAPTER$1 pillSection$Companion$ADAPTER$1 = new PillSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PillSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.PillSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/PillSection.proto");
        ADAPTER = pillSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pillSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.pills = TransactorKt.immutableCopyOf("pills", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PillSection)) {
            return false;
        }
        PillSection pillSection = (PillSection) obj;
        return Intrinsics.areEqual(unknownFields(), pillSection.unknownFields()) && Intrinsics.areEqual(this.pills, pillSection.pills);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.pills.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(27, false);
        builder.pools = this.pills;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.pills;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pills=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PillSection{", "}", 0, null, null, 56);
    }
}
