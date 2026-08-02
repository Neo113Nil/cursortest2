package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.ui.Image;
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
public final class ZeroResultsMessageSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ZeroResultsMessageSection> CREATOR;
    public final AnalyticsEvent analytics_view_item_event;
    public final Button button;
    public final Image image;
    public final LocalizedString l_subtitle;
    public final LocalizedString l_title;
    public final StyledText subtitle;
    public final StyledText title;

    static {
        ZeroResultsMessageSection$Companion$ADAPTER$1 zeroResultsMessageSection$Companion$ADAPTER$1 = new ZeroResultsMessageSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ZeroResultsMessageSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.ZeroResultsMessageSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/ZeroResultsMessageSection.proto");
        ADAPTER = zeroResultsMessageSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(zeroResultsMessageSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroResultsMessageSection(Image image, LocalizedString localizedString, LocalizedString localizedString2, Button button, AnalyticsEvent analyticsEvent, StyledText styledText, StyledText styledText2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.l_title = localizedString;
        this.l_subtitle = localizedString2;
        this.button = button;
        this.analytics_view_item_event = analyticsEvent;
        this.title = styledText;
        this.subtitle = styledText2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZeroResultsMessageSection)) {
            return false;
        }
        ZeroResultsMessageSection zeroResultsMessageSection = (ZeroResultsMessageSection) obj;
        return Intrinsics.areEqual(unknownFields(), zeroResultsMessageSection.unknownFields()) && Intrinsics.areEqual(this.image, zeroResultsMessageSection.image) && Intrinsics.areEqual(this.l_title, zeroResultsMessageSection.l_title) && Intrinsics.areEqual(this.l_subtitle, zeroResultsMessageSection.l_subtitle) && Intrinsics.areEqual(this.button, zeroResultsMessageSection.button) && Intrinsics.areEqual(this.analytics_view_item_event, zeroResultsMessageSection.analytics_view_item_event) && Intrinsics.areEqual(this.title, zeroResultsMessageSection.title) && Intrinsics.areEqual(this.subtitle, zeroResultsMessageSection.subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.l_title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.l_subtitle;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Button button = this.button;
        int hashCode5 = (hashCode4 + (button != null ? button.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_item_event;
        int hashCode6 = (hashCode5 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        StyledText styledText = this.title;
        int hashCode7 = (hashCode6 + (styledText != null ? styledText.hashCode() : 0)) * 37;
        StyledText styledText2 = this.subtitle;
        int hashCode8 = hashCode7 + (styledText2 != null ? styledText2.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(24);
        builder.customer_identifier = this.image;
        builder.full_name = this.l_title;
        builder.profile_photo_url = this.l_subtitle;
        builder.cashtag = this.button;
        builder.added_at = this.analytics_view_item_event;
        builder.participant_type = this.title;
        builder.aggregated_contribution_amount = this.subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        LocalizedString localizedString = this.l_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.l_subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_subtitle=", localizedString2, arrayList);
        }
        Button button = this.button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("button=", button, arrayList);
        }
        AnalyticsEvent analyticsEvent = this.analytics_view_item_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_item_event=", analyticsEvent, arrayList);
        }
        StyledText styledText = this.title;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", styledText, arrayList);
        }
        StyledText styledText2 = this.subtitle;
        if (styledText2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtitle=", styledText2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ZeroResultsMessageSection{", "}", 0, null, null, 56);
    }
}
