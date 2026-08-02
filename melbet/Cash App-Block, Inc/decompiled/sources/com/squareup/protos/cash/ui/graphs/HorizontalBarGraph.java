package com.squareup.protos.cash.ui.graphs;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.franklin.ui.UiAvatar;
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
public final class HorizontalBarGraph extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HorizontalBarGraph> CREATOR;
    public final Color bar_item_color;
    public final Color bar_item_text_color;
    public final List bar_items;
    public final LocalizedString title;

    public final class BarItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BarItem> CREATOR;
        public final UiAvatar avatar;
        public final String client_route;
        public final LocalizedString name;
        public final LocalizedString text;
        public final Long value;

        static {
            HorizontalBarGraph$BarItem$Companion$ADAPTER$1 horizontalBarGraph$BarItem$Companion$ADAPTER$1 = new HorizontalBarGraph$BarItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BarItem.class), "type.googleapis.com/squareup.cash.ui.graphs.HorizontalBarGraph.BarItem", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
            ADAPTER = horizontalBarGraph$BarItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(horizontalBarGraph$BarItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BarItem(LocalizedString localizedString, Long l, LocalizedString localizedString2, UiAvatar uiAvatar, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = localizedString;
            this.value = l;
            this.text = localizedString2;
            this.avatar = uiAvatar;
            this.client_route = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BarItem)) {
                return false;
            }
            BarItem barItem = (BarItem) obj;
            return Intrinsics.areEqual(unknownFields(), barItem.unknownFields()) && Intrinsics.areEqual(this.name, barItem.name) && Intrinsics.areEqual(this.value, barItem.value) && Intrinsics.areEqual(this.text, barItem.text) && Intrinsics.areEqual(this.avatar, barItem.avatar) && Intrinsics.areEqual(this.client_route, barItem.client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.name;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Long l = this.value;
            int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            LocalizedString localizedString2 = this.text;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            UiAvatar uiAvatar = this.avatar;
            int hashCode5 = (hashCode4 + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            String str = this.client_route;
            int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DateTime.Builder builder = new DateTime.Builder(21, false);
            builder.ordinal = this.name;
            builder.instant_usec = this.value;
            builder.timezone_offset_min = this.text;
            builder.tz_name = this.avatar;
            builder.posix_tz = this.client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.name;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("name=", localizedString, arrayList);
            }
            Long l = this.value;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("value=", l, arrayList);
            }
            LocalizedString localizedString2 = this.text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString2, arrayList);
            }
            UiAvatar uiAvatar = this.avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
            }
            String str = this.client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BarItem{", "}", 0, null, null, 56);
        }
    }

    static {
        HorizontalBarGraph$Companion$ADAPTER$1 horizontalBarGraph$Companion$ADAPTER$1 = new HorizontalBarGraph$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HorizontalBarGraph.class), "type.googleapis.com/squareup.cash.ui.graphs.HorizontalBarGraph", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
        ADAPTER = horizontalBarGraph$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(horizontalBarGraph$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalBarGraph(LocalizedString localizedString, List list, Color color, Color color2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.bar_item_color = color;
        this.bar_item_text_color = color2;
        this.bar_items = TransactorKt.immutableCopyOf("bar_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HorizontalBarGraph)) {
            return false;
        }
        HorizontalBarGraph horizontalBarGraph = (HorizontalBarGraph) obj;
        return Intrinsics.areEqual(unknownFields(), horizontalBarGraph.unknownFields()) && Intrinsics.areEqual(this.title, horizontalBarGraph.title) && Intrinsics.areEqual(this.bar_items, horizontalBarGraph.bar_items) && Intrinsics.areEqual(this.bar_item_color, horizontalBarGraph.bar_item_color) && Intrinsics.areEqual(this.bar_item_text_color, horizontalBarGraph.bar_item_text_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.bar_items);
        Color color = this.bar_item_color;
        int hashCode2 = (m + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.bar_item_text_color;
        int hashCode3 = hashCode2 + (color2 != null ? color2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(2);
        builder.text = this.title;
        builder.action = this.bar_items;
        builder.button_color = this.bar_item_color;
        builder.text_color = this.bar_item_text_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        List list = this.bar_items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("bar_items=", arrayList, list);
        }
        Color color = this.bar_item_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bar_item_color=", color, arrayList);
        }
        Color color2 = this.bar_item_text_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bar_item_text_color=", color2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HorizontalBarGraph{", "}", 0, null, null, 56);
    }
}
