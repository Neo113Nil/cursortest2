package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.network.internal.UtilsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.protos.cash.favorites.Favorite;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.LoanOption;
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

/* loaded from: classes7.dex */
public final class Action extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Action> CREATOR;
    public final UtilsKt action;
    public final AnalyticsData analytics_data;
    public final AnalyticsEvent analytics_event;
    public final Boolean mark_context_stale;

    public final class DismissAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DismissAction> CREATOR;

        static {
            Action$DismissAction$Companion$ADAPTER$1 action$DismissAction$Companion$ADAPTER$1 = new Action$DismissAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DismissAction.class), "type.googleapis.com/squareup.cash.genericelements.ui.Action.DismissAction", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = action$DismissAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$DismissAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DismissAction(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof DismissAction) && Intrinsics.areEqual(unknownFields(), ((DismissAction) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Empty.Builder builder = new Empty.Builder(28);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "DismissAction{}";
        }
    }

    public final class OpenUrlAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OpenUrlAction> CREATOR;
        public final String url;

        static {
            Action$OpenUrlAction$Companion$ADAPTER$1 action$OpenUrlAction$Companion$ADAPTER$1 = new Action$OpenUrlAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenUrlAction.class), "type.googleapis.com/squareup.cash.genericelements.ui.Action.OpenUrlAction", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = action$OpenUrlAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OpenUrlAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrlAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OpenUrlAction)) {
                return false;
            }
            OpenUrlAction openUrlAction = (OpenUrlAction) obj;
            return Intrinsics.areEqual(unknownFields(), openUrlAction.unknownFields()) && Intrinsics.areEqual(this.url, openUrlAction.url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Favorite.Builder builder = new Favorite.Builder(7);
            builder.favorite_customer_token = this.url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OpenUrlAction{", "}", 0, null, null, 56);
        }
    }

    public final class OverlayAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OverlayAction> CREATOR;
        public final ContainerElement error_element_tree;
        public final String get_elements_context;
        public final List overlay_element_tree;

        static {
            Action$OverlayAction$Companion$ADAPTER$1 action$OverlayAction$Companion$ADAPTER$1 = new Action$OverlayAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverlayAction.class), "type.googleapis.com/squareup.cash.genericelements.ui.Action.OverlayAction", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = action$OverlayAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$OverlayAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverlayAction(List list, String str, ContainerElement containerElement, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.get_elements_context = str;
            this.error_element_tree = containerElement;
            this.overlay_element_tree = TransactorKt.immutableCopyOf("overlay_element_tree", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OverlayAction)) {
                return false;
            }
            OverlayAction overlayAction = (OverlayAction) obj;
            return Intrinsics.areEqual(unknownFields(), overlayAction.unknownFields()) && Intrinsics.areEqual(this.overlay_element_tree, overlayAction.overlay_element_tree) && Intrinsics.areEqual(this.get_elements_context, overlayAction.get_elements_context) && Intrinsics.areEqual(this.error_element_tree, overlayAction.error_element_tree);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.overlay_element_tree);
            String str = this.get_elements_context;
            int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
            ContainerElement containerElement = this.error_element_tree;
            int hashCode2 = hashCode + (containerElement != null ? containerElement.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LoanOption.Builder builder = new LoanOption.Builder(22);
            builder.payment_schedule = this.overlay_element_tree;
            builder.loan_type = this.get_elements_context;
            builder.tila_data = this.error_element_tree;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.overlay_element_tree;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("overlay_element_tree=", arrayList, list);
            }
            String str = this.get_elements_context;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "get_elements_context=", arrayList);
            }
            ContainerElement containerElement = this.error_element_tree;
            if (containerElement != null) {
                arrayList.add("error_element_tree=" + containerElement);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OverlayAction{", "}", 0, null, null, 56);
        }
    }

    static {
        Action$Companion$ADAPTER$1 action$Companion$ADAPTER$1 = new Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.cash.genericelements.ui.Action", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = action$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(action$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Action(UtilsKt utilsKt, AnalyticsData analyticsData, AnalyticsEvent analyticsEvent, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = utilsKt;
        this.analytics_data = analyticsData;
        this.analytics_event = analyticsEvent;
        this.mark_context_stale = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.action, action.action) && Intrinsics.areEqual(this.analytics_data, action.analytics_data) && Intrinsics.areEqual(this.analytics_event, action.analytics_event) && Intrinsics.areEqual(this.mark_context_stale, action.mark_context_stale);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UtilsKt utilsKt = this.action;
        int hashCode2 = (hashCode + (utilsKt != null ? utilsKt.hashCode() : 0)) * 37;
        AnalyticsData analyticsData = this.analytics_data;
        int hashCode3 = (hashCode2 + (analyticsData != null ? analyticsData.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytics_event;
        int hashCode4 = (hashCode3 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        Boolean bool = this.mark_context_stale;
        int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(8, false);
        builder.postal_code = this.action;
        builder.last_four_digits = this.analytics_data;
        builder.expiration = this.analytics_event;
        builder.ciphertext_ = this.mark_context_stale;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UtilsKt utilsKt = this.action;
        if (utilsKt != null) {
            arrayList.add("action=" + utilsKt);
        }
        AnalyticsData analyticsData = this.analytics_data;
        if (analyticsData != null) {
            arrayList.add("analytics_data=" + analyticsData);
        }
        AnalyticsEvent analyticsEvent = this.analytics_event;
        if (analyticsEvent != null) {
            arrayList.add("analytics_event=" + analyticsEvent);
        }
        Boolean bool = this.mark_context_stale;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("mark_context_stale=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
    }
}
