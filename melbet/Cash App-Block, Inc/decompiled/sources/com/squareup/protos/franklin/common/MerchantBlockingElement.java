package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.franklin.ui.UiControl;
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
public final class MerchantBlockingElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MerchantBlockingElement> CREATOR;
    public final String client_route;
    public final UiControl.Icon icon;
    public final LocalizableString localizable_row_title;
    public final String row_title;

    static {
        MerchantBlockingElement$Companion$ADAPTER$1 merchantBlockingElement$Companion$ADAPTER$1 = new MerchantBlockingElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MerchantBlockingElement.class), "type.googleapis.com/squareup.franklin.common.MerchantBlockingElement", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
        ADAPTER = merchantBlockingElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(merchantBlockingElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantBlockingElement(String str, LocalizableString localizableString, UiControl.Icon icon, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.row_title = str;
        this.localizable_row_title = localizableString;
        this.icon = icon;
        this.client_route = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MerchantBlockingElement)) {
            return false;
        }
        MerchantBlockingElement merchantBlockingElement = (MerchantBlockingElement) obj;
        return Intrinsics.areEqual(unknownFields(), merchantBlockingElement.unknownFields()) && Intrinsics.areEqual(this.row_title, merchantBlockingElement.row_title) && Intrinsics.areEqual(this.localizable_row_title, merchantBlockingElement.localizable_row_title) && this.icon == merchantBlockingElement.icon && Intrinsics.areEqual(this.client_route, merchantBlockingElement.client_route);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.row_title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_row_title;
        int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        UiControl.Icon icon = this.icon;
        int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
        String str2 = this.client_route;
        int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(25);
        builder.button_color = this.row_title;
        builder.text_color = this.localizable_row_title;
        builder.text = this.icon;
        builder.action = this.client_route;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.row_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "row_title=", arrayList);
        }
        LocalizableString localizableString = this.localizable_row_title;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_row_title=", localizableString, arrayList);
        }
        UiControl.Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        String str2 = this.client_route;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "client_route=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MerchantBlockingElement{", "}", 0, null, null, 56);
    }
}
