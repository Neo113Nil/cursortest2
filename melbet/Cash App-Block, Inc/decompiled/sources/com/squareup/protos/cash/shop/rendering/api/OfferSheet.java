package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.time.DateTime;
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
public final class OfferSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OfferSheet> CREATOR;
    public final AnalyticsEvent analytics_dismiss_event;
    public final AnalyticsEvent analytics_view_event;
    public final StyledText footer_markdown_text;
    public final LocalizedString l_footer_markdown_text;
    public final zzkw sheet;

    static {
        OfferSheet$Companion$ADAPTER$1 offerSheet$Companion$ADAPTER$1 = new OfferSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferSheet.class), "type.googleapis.com/squareup.cash.shop.rendering.api.OfferSheet", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Sheets.proto");
        ADAPTER = offerSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offerSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferSheet(zzkw zzkwVar, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, LocalizedString localizedString, StyledText styledText, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sheet = zzkwVar;
        this.analytics_view_event = analyticsEvent;
        this.analytics_dismiss_event = analyticsEvent2;
        this.l_footer_markdown_text = localizedString;
        this.footer_markdown_text = styledText;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfferSheet)) {
            return false;
        }
        OfferSheet offerSheet = (OfferSheet) obj;
        return Intrinsics.areEqual(unknownFields(), offerSheet.unknownFields()) && Intrinsics.areEqual(this.sheet, offerSheet.sheet) && Intrinsics.areEqual(this.analytics_view_event, offerSheet.analytics_view_event) && Intrinsics.areEqual(this.analytics_dismiss_event, offerSheet.analytics_dismiss_event) && Intrinsics.areEqual(this.l_footer_markdown_text, offerSheet.l_footer_markdown_text) && Intrinsics.areEqual(this.footer_markdown_text, offerSheet.footer_markdown_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzkw zzkwVar = this.sheet;
        int hashCode2 = (hashCode + (zzkwVar != null ? zzkwVar.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int hashCode3 = (hashCode2 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent2 = this.analytics_dismiss_event;
        int hashCode4 = (hashCode3 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.l_footer_markdown_text;
        int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        StyledText styledText = this.footer_markdown_text;
        int hashCode6 = hashCode5 + (styledText != null ? styledText.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(15, false);
        builder.instant_usec = this.sheet;
        builder.ordinal = this.analytics_view_event;
        builder.timezone_offset_min = this.analytics_dismiss_event;
        builder.posix_tz = this.l_footer_markdown_text;
        builder.tz_name = this.footer_markdown_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzkw zzkwVar = this.sheet;
        if (zzkwVar != null) {
            arrayList.add("sheet=" + zzkwVar);
        }
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        AnalyticsEvent analyticsEvent2 = this.analytics_dismiss_event;
        if (analyticsEvent2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_dismiss_event=", analyticsEvent2, arrayList);
        }
        LocalizedString localizedString = this.l_footer_markdown_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_footer_markdown_text=", localizedString, arrayList);
        }
        StyledText styledText = this.footer_markdown_text;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("footer_markdown_text=", styledText, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OfferSheet{", "}", 0, null, null, 56);
    }
}
