package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
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

/* loaded from: classes7.dex */
public final class Banner extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Banner> CREATOR;
    public final UiAvatar avatar;
    public final LocalizedString button_text;
    public final LocalizedString subtitle;
    public final com.squareup.protos.cash.shop.rendering.api.TapAction tap_action;
    public final LocalizedString title;

    static {
        Banner$Companion$ADAPTER$1 banner$Companion$ADAPTER$1 = new Banner$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Banner.class), "type.googleapis.com/squareup.cash.cashsuggest.api.Banner", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
        ADAPTER = banner$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(banner$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(UiAvatar uiAvatar, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.avatar = uiAvatar;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.button_text = localizedString3;
        this.tap_action = tapAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) obj;
        return Intrinsics.areEqual(unknownFields(), banner.unknownFields()) && Intrinsics.areEqual(this.avatar, banner.avatar) && Intrinsics.areEqual(this.title, banner.title) && Intrinsics.areEqual(this.subtitle, banner.subtitle) && Intrinsics.areEqual(this.button_text, banner.button_text) && Intrinsics.areEqual(this.tap_action, banner.tap_action);
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
        LocalizedString localizedString2 = this.subtitle;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.button_text;
        int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
        int hashCode6 = hashCode5 + (tapAction != null ? tapAction.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(19, false);
        builder.customer_token = this.avatar;
        builder.account_token = this.title;
        builder.display_name = this.subtitle;
        builder.account_type = this.button_text;
        builder.is_sponsored_account = this.tap_action;
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
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.button_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString3, arrayList);
        }
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Banner{", "}", 0, null, null, 56);
    }

    public /* synthetic */ Banner(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction) {
        this(null, localizedString, localizedString2, localizedString3, tapAction, ByteString.EMPTY);
    }
}
