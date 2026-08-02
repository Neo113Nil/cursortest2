package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
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
public final class IconTextSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IconTextSection> CREATOR;
    public final Icon icon;
    public final LocalizedString subtitle;
    public final TapAction tap_action;
    public final TintedIcon tinted_icon;
    public final LocalizedString title;

    static {
        IconTextSection$Companion$ADAPTER$1 iconTextSection$Companion$ADAPTER$1 = new IconTextSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IconTextSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.IconTextSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/IconTextSection.proto");
        ADAPTER = iconTextSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(iconTextSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconTextSection(Icon icon, TintedIcon tintedIcon, LocalizedString localizedString, LocalizedString localizedString2, TapAction tapAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = icon;
        this.tinted_icon = tintedIcon;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.tap_action = tapAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IconTextSection)) {
            return false;
        }
        IconTextSection iconTextSection = (IconTextSection) obj;
        return Intrinsics.areEqual(unknownFields(), iconTextSection.unknownFields()) && Intrinsics.areEqual(this.icon, iconTextSection.icon) && Intrinsics.areEqual(this.tinted_icon, iconTextSection.tinted_icon) && Intrinsics.areEqual(this.title, iconTextSection.title) && Intrinsics.areEqual(this.subtitle, iconTextSection.subtitle) && Intrinsics.areEqual(this.tap_action, iconTextSection.tap_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        TintedIcon tintedIcon = this.tinted_icon;
        int hashCode3 = (hashCode2 + (tintedIcon != null ? tintedIcon.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode6 = hashCode5 + (tapAction != null ? tapAction.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(13, false);
        builder.instant_usec = this.icon;
        builder.ordinal = this.tinted_icon;
        builder.timezone_offset_min = this.title;
        builder.posix_tz = this.subtitle;
        builder.tz_name = this.tap_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        TintedIcon tintedIcon = this.tinted_icon;
        if (tintedIcon != null) {
            arrayList.add("tinted_icon=" + tintedIcon);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "IconTextSection{", "}", 0, null, null, 56);
    }
}
