package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.datadog.android.rum.model.LongTaskEvent;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UpsellSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpsellSheet> CREATOR;
    public final AnalyticsEvent analytic_dismiss_event;
    public final AnalyticsEvent analytic_view_event;
    public final LocalizedString body;
    public final Button cta_button;
    public final LocalizedString footer_text;
    public final Button secondary_button;
    public final LocalizedString title;
    public final LongTaskEvent.Companion top_content;

    static {
        UpsellSheet$Companion$ADAPTER$1 upsellSheet$Companion$ADAPTER$1 = new UpsellSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpsellSheet.class), "type.googleapis.com/squareup.cash.shop.rendering.api.UpsellSheet", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/UpsellSheet.proto");
        ADAPTER = upsellSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(upsellSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpsellSheet(LongTaskEvent.Companion companion, LocalizedString localizedString, LocalizedString localizedString2, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, LocalizedString localizedString3, Button button, Button button2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.top_content = companion;
        this.title = localizedString;
        this.body = localizedString2;
        this.analytic_view_event = analyticsEvent;
        this.analytic_dismiss_event = analyticsEvent2;
        this.footer_text = localizedString3;
        this.cta_button = button;
        this.secondary_button = button2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpsellSheet)) {
            return false;
        }
        UpsellSheet upsellSheet = (UpsellSheet) obj;
        return Intrinsics.areEqual(unknownFields(), upsellSheet.unknownFields()) && Intrinsics.areEqual(this.top_content, upsellSheet.top_content) && Intrinsics.areEqual(this.title, upsellSheet.title) && Intrinsics.areEqual(this.body, upsellSheet.body) && Intrinsics.areEqual(this.analytic_view_event, upsellSheet.analytic_view_event) && Intrinsics.areEqual(this.analytic_dismiss_event, upsellSheet.analytic_dismiss_event) && Intrinsics.areEqual(this.footer_text, upsellSheet.footer_text) && Intrinsics.areEqual(this.cta_button, upsellSheet.cta_button) && Intrinsics.areEqual(this.secondary_button, upsellSheet.secondary_button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LongTaskEvent.Companion companion = this.top_content;
        int hashCode2 = (hashCode + (companion != null ? companion.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.body;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        int hashCode5 = (hashCode4 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent2 = this.analytic_dismiss_event;
        int hashCode6 = (hashCode5 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.footer_text;
        int hashCode7 = (hashCode6 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        Button button = this.cta_button;
        int hashCode8 = (hashCode7 + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.secondary_button;
        int hashCode9 = hashCode8 + (button2 != null ? button2.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(18, false);
        builder.category = this.top_content;
        builder.token = this.title;
        builder.title = this.body;
        builder.client_route = this.analytic_view_event;
        builder.url = this.analytic_dismiss_event;
        builder.owner_token = this.footer_text;
        builder.version_data = this.cta_button;
        builder.localizable_title = this.secondary_button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LongTaskEvent.Companion companion = this.top_content;
        if (companion != null) {
            arrayList.add("top_content=" + companion);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.body;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
        }
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
        }
        AnalyticsEvent analyticsEvent2 = this.analytic_dismiss_event;
        if (analyticsEvent2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_dismiss_event=", analyticsEvent2, arrayList);
        }
        LocalizedString localizedString3 = this.footer_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("footer_text=", localizedString3, arrayList);
        }
        Button button = this.cta_button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("cta_button=", button, arrayList);
        }
        Button button2 = this.secondary_button;
        if (button2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("secondary_button=", button2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpsellSheet{", "}", 0, null, null, 56);
    }
}
