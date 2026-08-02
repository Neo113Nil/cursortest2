package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
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

/* loaded from: classes7.dex */
public final class AfterpayMerchantSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayMerchantSheet> CREATOR;
    public final AnalyticsEvent analytic_dismiss_event;
    public final AnalyticsEvent analytic_view_event;
    public final UiAvatar avatar;
    public final LocalizedString body;
    public final AfterpayMerchantSheet$Content$PasteboardTextLines content;
    public final Button cta_button;
    public final LocalizedString title;

    public final class PasteboardTextLines extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PasteboardTextLines> CREATOR;
        public final List pasteboard_text_lines;

        static {
            AfterpayMerchantSheet$PasteboardTextLines$Companion$ADAPTER$1 afterpayMerchantSheet$PasteboardTextLines$Companion$ADAPTER$1 = new AfterpayMerchantSheet$PasteboardTextLines$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PasteboardTextLines.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayMerchantSheet.PasteboardTextLines", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpaySheet.proto");
            ADAPTER = afterpayMerchantSheet$PasteboardTextLines$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayMerchantSheet$PasteboardTextLines$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasteboardTextLines(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.pasteboard_text_lines = TransactorKt.immutableCopyOf("pasteboard_text_lines", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PasteboardTextLines)) {
                return false;
            }
            PasteboardTextLines pasteboardTextLines = (PasteboardTextLines) obj;
            return Intrinsics.areEqual(unknownFields(), pasteboardTextLines.unknownFields()) && Intrinsics.areEqual(this.pasteboard_text_lines, pasteboardTextLines.pasteboard_text_lines);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.pasteboard_text_lines.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(10);
            builder.trust = this.pasteboard_text_lines;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.pasteboard_text_lines;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("pasteboard_text_lines=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PasteboardTextLines{", "}", 0, null, null, 56);
        }
    }

    static {
        AfterpayMerchantSheet$Companion$ADAPTER$1 afterpayMerchantSheet$Companion$ADAPTER$1 = new AfterpayMerchantSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayMerchantSheet.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayMerchantSheet", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpaySheet.proto");
        ADAPTER = afterpayMerchantSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayMerchantSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayMerchantSheet(UiAvatar uiAvatar, LocalizedString localizedString, LocalizedString localizedString2, AfterpayMerchantSheet$Content$PasteboardTextLines afterpayMerchantSheet$Content$PasteboardTextLines, Button button, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.avatar = uiAvatar;
        this.title = localizedString;
        this.body = localizedString2;
        this.content = afterpayMerchantSheet$Content$PasteboardTextLines;
        this.cta_button = button;
        this.analytic_view_event = analyticsEvent;
        this.analytic_dismiss_event = analyticsEvent2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayMerchantSheet)) {
            return false;
        }
        AfterpayMerchantSheet afterpayMerchantSheet = (AfterpayMerchantSheet) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayMerchantSheet.unknownFields()) && Intrinsics.areEqual(this.avatar, afterpayMerchantSheet.avatar) && Intrinsics.areEqual(this.title, afterpayMerchantSheet.title) && Intrinsics.areEqual(this.body, afterpayMerchantSheet.body) && Intrinsics.areEqual(this.content, afterpayMerchantSheet.content) && Intrinsics.areEqual(this.cta_button, afterpayMerchantSheet.cta_button) && Intrinsics.areEqual(this.analytic_view_event, afterpayMerchantSheet.analytic_view_event) && Intrinsics.areEqual(this.analytic_dismiss_event, afterpayMerchantSheet.analytic_dismiss_event);
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
        LocalizedString localizedString2 = this.body;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        AfterpayMerchantSheet$Content$PasteboardTextLines afterpayMerchantSheet$Content$PasteboardTextLines = this.content;
        int hashCode5 = (hashCode4 + (afterpayMerchantSheet$Content$PasteboardTextLines != null ? afterpayMerchantSheet$Content$PasteboardTextLines.value.hashCode() : 0)) * 37;
        Button button = this.cta_button;
        int hashCode6 = (hashCode5 + (button != null ? button.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        int hashCode7 = (hashCode6 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent2 = this.analytic_dismiss_event;
        int hashCode8 = hashCode7 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(9, false);
        builder.customer_token = this.avatar;
        builder.alias_value = this.title;
        builder.hashed_alias_token = this.body;
        builder.alias_type = this.content;
        builder.updated_at = this.cta_button;
        builder.linked_at = this.analytic_view_event;
        builder.version = this.analytic_dismiss_event;
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
        LocalizedString localizedString2 = this.body;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
        }
        AfterpayMerchantSheet$Content$PasteboardTextLines afterpayMerchantSheet$Content$PasteboardTextLines = this.content;
        if (afterpayMerchantSheet$Content$PasteboardTextLines != null) {
            arrayList.add("content=" + afterpayMerchantSheet$Content$PasteboardTextLines);
        }
        Button button = this.cta_button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("cta_button=", button, arrayList);
        }
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
        }
        AnalyticsEvent analyticsEvent2 = this.analytic_dismiss_event;
        if (analyticsEvent2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_dismiss_event=", analyticsEvent2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayMerchantSheet{", "}", 0, null, null, 56);
    }
}
