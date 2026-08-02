package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.datadog.android.rum.model.ErrorEvent;
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
public final class PageHeaderSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PageHeaderSection> CREATOR;
    public final Button button;
    public final LocalizedString subtitle;
    public final TapAction tap_action;
    public final LocalizedString title;
    public final ErrorEvent.Usr.Companion top_content;

    static {
        PageHeaderSection$Companion$ADAPTER$1 pageHeaderSection$Companion$ADAPTER$1 = new PageHeaderSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PageHeaderSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.PageHeaderSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/PageHeaderSection.proto");
        ADAPTER = pageHeaderSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pageHeaderSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageHeaderSection(ErrorEvent.Usr.Companion companion, LocalizedString localizedString, LocalizedString localizedString2, TapAction tapAction, Button button, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.top_content = companion;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.tap_action = tapAction;
        this.button = button;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PageHeaderSection)) {
            return false;
        }
        PageHeaderSection pageHeaderSection = (PageHeaderSection) obj;
        return Intrinsics.areEqual(unknownFields(), pageHeaderSection.unknownFields()) && Intrinsics.areEqual(this.top_content, pageHeaderSection.top_content) && Intrinsics.areEqual(this.title, pageHeaderSection.title) && Intrinsics.areEqual(this.subtitle, pageHeaderSection.subtitle) && Intrinsics.areEqual(this.tap_action, pageHeaderSection.tap_action) && Intrinsics.areEqual(this.button, pageHeaderSection.button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ErrorEvent.Usr.Companion companion = this.top_content;
        int hashCode2 = (hashCode + (companion != null ? companion.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode5 = (hashCode4 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        Button button = this.button;
        int hashCode6 = hashCode5 + (button != null ? button.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(16, false);
        builder.instant_usec = this.top_content;
        builder.ordinal = this.title;
        builder.timezone_offset_min = this.subtitle;
        builder.posix_tz = this.tap_action;
        builder.tz_name = this.button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ErrorEvent.Usr.Companion companion = this.top_content;
        if (companion != null) {
            arrayList.add("top_content=" + companion);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
        }
        Button button = this.button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("button=", button, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PageHeaderSection{", "}", 0, null, null, 56);
    }

    public /* synthetic */ PageHeaderSection(LocalizedString localizedString, LocalizedString localizedString2, TapAction tapAction, Button button) {
        this(null, localizedString, localizedString2, tapAction, button, ByteString.EMPTY);
    }
}
