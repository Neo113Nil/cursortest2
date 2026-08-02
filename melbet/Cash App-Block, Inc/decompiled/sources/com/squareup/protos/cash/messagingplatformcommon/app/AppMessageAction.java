package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.ui.Color;
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

/* loaded from: classes.dex */
public final class AppMessageAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppMessageAction> CREATOR;
    public final String deprecated_text_color;
    public final String text;
    public final Color text_color;
    public final String url_to_open;

    static {
        AppMessageAction$Companion$ADAPTER$1 appMessageAction$Companion$ADAPTER$1 = new AppMessageAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppMessageAction.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.AppMessageAction", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = appMessageAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appMessageAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMessageAction(String str, String str2, String str3, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.url_to_open = str;
        this.text = str2;
        this.deprecated_text_color = str3;
        this.text_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppMessageAction)) {
            return false;
        }
        AppMessageAction appMessageAction = (AppMessageAction) obj;
        return Intrinsics.areEqual(unknownFields(), appMessageAction.unknownFields()) && Intrinsics.areEqual(this.url_to_open, appMessageAction.url_to_open) && Intrinsics.areEqual(this.text, appMessageAction.text) && Intrinsics.areEqual(this.deprecated_text_color, appMessageAction.deprecated_text_color) && Intrinsics.areEqual(this.text_color, appMessageAction.text_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.url_to_open;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.deprecated_text_color;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Color color = this.text_color;
        int hashCode5 = hashCode4 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(21, false);
        builder.id = this.url_to_open;
        builder.last_4 = this.text;
        builder.gift_card_id = this.deprecated_text_color;
        builder.gift_card_amount = this.text_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.url_to_open;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url_to_open=", arrayList);
        }
        String str2 = this.text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "text=", arrayList);
        }
        String str3 = this.deprecated_text_color;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "deprecated_text_color=", arrayList);
        }
        Color color = this.text_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppMessageAction{", "}", 0, null, null, 56);
    }
}
