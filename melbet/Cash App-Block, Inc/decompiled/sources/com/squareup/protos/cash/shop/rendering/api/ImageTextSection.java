package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
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
public final class ImageTextSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ImageTextSection> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final Button button;
    public final Image image;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    static {
        ImageTextSection$Companion$ADAPTER$1 imageTextSection$Companion$ADAPTER$1 = new ImageTextSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageTextSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.ImageTextSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/ImageTextSection.proto");
        ADAPTER = imageTextSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(imageTextSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTextSection(Image image, LocalizedString localizedString, LocalizedString localizedString2, Button button, AnalyticsEvent analyticsEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.button = button;
        this.analytics_view_event = analyticsEvent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageTextSection)) {
            return false;
        }
        ImageTextSection imageTextSection = (ImageTextSection) obj;
        return Intrinsics.areEqual(unknownFields(), imageTextSection.unknownFields()) && Intrinsics.areEqual(this.image, imageTextSection.image) && Intrinsics.areEqual(this.title, imageTextSection.title) && Intrinsics.areEqual(this.subtitle, imageTextSection.subtitle) && Intrinsics.areEqual(this.button, imageTextSection.button) && Intrinsics.areEqual(this.analytics_view_event, imageTextSection.analytics_view_event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Button button = this.button;
        int hashCode5 = (hashCode4 + (button != null ? button.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int hashCode6 = hashCode5 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(14, false);
        builder.instant_usec = this.image;
        builder.ordinal = this.title;
        builder.timezone_offset_min = this.subtitle;
        builder.posix_tz = this.button;
        builder.tz_name = this.analytics_view_event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        Button button = this.button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("button=", button, arrayList);
        }
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageTextSection{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ImageTextSection(LocalizedString localizedString, LocalizedString localizedString2, Button button, int i) {
        this(null, localizedString, localizedString2, button, null, ByteString.EMPTY);
    }
}
