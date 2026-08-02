package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes8.dex */
public final class InfoSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InfoSheet> CREATOR;
    public final AnalyticsEvent analytic_dismiss_event;
    public final AnalyticsEvent analytic_view_event;
    public final UiAvatar avatar;
    public final Button cta_button;
    public final LocalizedString subtitle;
    public final List text_content;
    public final LocalizedString title;

    public final class NumberedList extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NumberedList> CREATOR;
        public final List numbered_list_item;

        static {
            InfoSheet$NumberedList$Companion$ADAPTER$1 infoSheet$NumberedList$Companion$ADAPTER$1 = new InfoSheet$NumberedList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NumberedList.class), "type.googleapis.com/squareup.cash.shop.rendering.api.InfoSheet.NumberedList", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TapActions.proto");
            ADAPTER = infoSheet$NumberedList$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(infoSheet$NumberedList$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NumberedList(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.numbered_list_item = TransactorKt.immutableCopyOf("numbered_list_item", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NumberedList)) {
                return false;
            }
            NumberedList numberedList = (NumberedList) obj;
            return Intrinsics.areEqual(unknownFields(), numberedList.unknownFields()) && Intrinsics.areEqual(this.numbered_list_item, numberedList.numbered_list_item);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.numbered_list_item.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(25, false);
            builder.pools = this.numbered_list_item;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.numbered_list_item;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("numbered_list_item=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NumberedList{", "}", 0, null, null, 56);
        }
    }

    public final class NumberedListItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NumberedListItem> CREATOR;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        static {
            InfoSheet$NumberedListItem$Companion$ADAPTER$1 infoSheet$NumberedListItem$Companion$ADAPTER$1 = new InfoSheet$NumberedListItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NumberedListItem.class), "type.googleapis.com/squareup.cash.shop.rendering.api.InfoSheet.NumberedListItem", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TapActions.proto");
            ADAPTER = infoSheet$NumberedListItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(infoSheet$NumberedListItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NumberedListItem(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = localizedString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NumberedListItem)) {
                return false;
            }
            NumberedListItem numberedListItem = (NumberedListItem) obj;
            return Intrinsics.areEqual(unknownFields(), numberedListItem.unknownFields()) && Intrinsics.areEqual(this.title, numberedListItem.title) && Intrinsics.areEqual(this.subtitle, numberedListItem.subtitle);
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
            BillsApplet.HalfApplet.Builder builder = new BillsApplet.HalfApplet.Builder(4);
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "NumberedListItem{", "}", 0, null, null, 56);
        }
    }

    public final class TextBulletList extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TextBulletList> CREATOR;
        public final List text_bullet_list_item;

        static {
            InfoSheet$TextBulletList$Companion$ADAPTER$1 infoSheet$TextBulletList$Companion$ADAPTER$1 = new InfoSheet$TextBulletList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextBulletList.class), "type.googleapis.com/squareup.cash.shop.rendering.api.InfoSheet.TextBulletList", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TapActions.proto");
            ADAPTER = infoSheet$TextBulletList$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(infoSheet$TextBulletList$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextBulletList(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.text_bullet_list_item = TransactorKt.immutableCopyOf("text_bullet_list_item", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextBulletList)) {
                return false;
            }
            TextBulletList textBulletList = (TextBulletList) obj;
            return Intrinsics.areEqual(unknownFields(), textBulletList.unknownFields()) && Intrinsics.areEqual(this.text_bullet_list_item, textBulletList.text_bullet_list_item);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.text_bullet_list_item.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(26, false);
            builder.pools = this.text_bullet_list_item;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.text_bullet_list_item;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("text_bullet_list_item=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextBulletList{", "}", 0, null, null, 56);
        }
    }

    public final class TextContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TextContent> CREATOR;
        public final zzkv content;

        static {
            InfoSheet$TextContent$Companion$ADAPTER$1 infoSheet$TextContent$Companion$ADAPTER$1 = new InfoSheet$TextContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextContent.class), "type.googleapis.com/squareup.cash.shop.rendering.api.InfoSheet.TextContent", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TapActions.proto");
            ADAPTER = infoSheet$TextContent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(infoSheet$TextContent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextContent(zzkv zzkvVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.content = zzkvVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextContent)) {
                return false;
            }
            TextContent textContent = (TextContent) obj;
            return Intrinsics.areEqual(unknownFields(), textContent.unknownFields()) && Intrinsics.areEqual(this.content, textContent.content);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            zzkv zzkvVar = this.content;
            int hashCode2 = hashCode + (zzkvVar != null ? zzkvVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(20);
            builder.pool_lifecycle_filter = this.content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            zzkv zzkvVar = this.content;
            if (zzkvVar != null) {
                arrayList.add("content=" + zzkvVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextContent{", "}", 0, null, null, 56);
        }
    }

    static {
        InfoSheet$Companion$ADAPTER$1 infoSheet$Companion$ADAPTER$1 = new InfoSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InfoSheet.class), "type.googleapis.com/squareup.cash.shop.rendering.api.InfoSheet", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TapActions.proto");
        ADAPTER = infoSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(infoSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoSheet(LocalizedString localizedString, LocalizedString localizedString2, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, Button button, List list, UiAvatar uiAvatar, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.analytic_view_event = analyticsEvent;
        this.analytic_dismiss_event = analyticsEvent2;
        this.cta_button = button;
        this.avatar = uiAvatar;
        this.text_content = TransactorKt.immutableCopyOf("text_content", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InfoSheet)) {
            return false;
        }
        InfoSheet infoSheet = (InfoSheet) obj;
        return Intrinsics.areEqual(unknownFields(), infoSheet.unknownFields()) && Intrinsics.areEqual(this.title, infoSheet.title) && Intrinsics.areEqual(this.subtitle, infoSheet.subtitle) && Intrinsics.areEqual(this.analytic_view_event, infoSheet.analytic_view_event) && Intrinsics.areEqual(this.analytic_dismiss_event, infoSheet.analytic_dismiss_event) && Intrinsics.areEqual(this.cta_button, infoSheet.cta_button) && Intrinsics.areEqual(this.text_content, infoSheet.text_content) && Intrinsics.areEqual(this.avatar, infoSheet.avatar);
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
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        int hashCode4 = (hashCode3 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent2 = this.analytic_dismiss_event;
        int hashCode5 = (hashCode4 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0)) * 37;
        Button button = this.cta_button;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (button != null ? button.hashCode() : 0)) * 37, 37, this.text_content);
        UiAvatar uiAvatar = this.avatar;
        int hashCode6 = m + (uiAvatar != null ? uiAvatar.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(22);
        builder.customer_identifier = this.title;
        builder.full_name = this.subtitle;
        builder.profile_photo_url = this.analytic_view_event;
        builder.cashtag = this.analytic_dismiss_event;
        builder.added_at = this.cta_button;
        builder.participant_type = this.text_content;
        builder.aggregated_contribution_amount = this.avatar;
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
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
        }
        AnalyticsEvent analyticsEvent2 = this.analytic_dismiss_event;
        if (analyticsEvent2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_dismiss_event=", analyticsEvent2, arrayList);
        }
        Button button = this.cta_button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("cta_button=", button, arrayList);
        }
        List list = this.text_content;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("text_content=", arrayList, list);
        }
        UiAvatar uiAvatar = this.avatar;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InfoSheet{", "}", 0, null, null, 56);
    }

    public InfoSheet(LocalizedString localizedString, LocalizedString localizedString2, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, Button button) {
        this(localizedString, localizedString2, analyticsEvent, analyticsEvent2, button, EmptyList.INSTANCE, null, ByteString.EMPTY);
    }
}
