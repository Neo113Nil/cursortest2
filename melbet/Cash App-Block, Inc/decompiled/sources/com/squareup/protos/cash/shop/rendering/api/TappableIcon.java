package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.cash.ui.Icon;
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
public final class TappableIcon extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TappableIcon> CREATOR;
    public final LocalizedString accessibility_label;
    public final LocalizedString accessibility_text;
    public final Icon arcade_icon;
    public final TapAction tap_action;

    static {
        TappableIcon$Companion$ADAPTER$1 tappableIcon$Companion$ADAPTER$1 = new TappableIcon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TappableIcon.class), "type.googleapis.com/squareup.cash.shop.rendering.api.TappableIcon", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TappableIcon.proto");
        ADAPTER = tappableIcon$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tappableIcon$Companion$ADAPTER$1);
    }

    public /* synthetic */ TappableIcon(TapAction tapAction, Icon icon, LocalizedString localizedString, int i) {
        this((i & 1) != 0 ? null : tapAction, (i & 2) != 0 ? null : icon, null, localizedString, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TappableIcon)) {
            return false;
        }
        TappableIcon tappableIcon = (TappableIcon) obj;
        return Intrinsics.areEqual(unknownFields(), tappableIcon.unknownFields()) && Intrinsics.areEqual(this.tap_action, tappableIcon.tap_action) && Intrinsics.areEqual(this.arcade_icon, tappableIcon.arcade_icon) && Intrinsics.areEqual(this.accessibility_label, tappableIcon.accessibility_label) && Intrinsics.areEqual(this.accessibility_text, tappableIcon.accessibility_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TapAction tapAction = this.tap_action;
        int hashCode2 = (hashCode + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        Icon icon = this.arcade_icon;
        int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.accessibility_label;
        int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.accessibility_text;
        int hashCode5 = hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(20);
        builder.card_encryption_data = this.tap_action;
        builder.customer_token_hash_email = this.arcade_icon;
        builder.device_metadata = this.accessibility_label;
        builder.success_screen = this.accessibility_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
        }
        Icon icon = this.arcade_icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
        }
        LocalizedString localizedString = this.accessibility_label;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("accessibility_label=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.accessibility_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TappableIcon{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TappableIcon(TapAction tapAction, Icon icon, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.tap_action = tapAction;
        this.arcade_icon = icon;
        this.accessibility_label = localizedString;
        this.accessibility_text = localizedString2;
    }
}
