package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.taply.app.v1.Allowed;
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
public final class CountdownCaption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CountdownCaption> CREATOR;
    public final StyledText countdown;
    public final Long countdown_to_ms;
    public final Long expire_at_ms;
    public final Image icon;

    static {
        CountdownCaption$Companion$ADAPTER$1 countdownCaption$Companion$ADAPTER$1 = new CountdownCaption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CountdownCaption.class), "type.googleapis.com/squareup.cash.shop.rendering.api.CountdownCaption", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Common.proto");
        ADAPTER = countdownCaption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(countdownCaption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownCaption(Long l, Image image, StyledText styledText, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.expire_at_ms = l;
        this.icon = image;
        this.countdown = styledText;
        this.countdown_to_ms = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CountdownCaption)) {
            return false;
        }
        CountdownCaption countdownCaption = (CountdownCaption) obj;
        return Intrinsics.areEqual(unknownFields(), countdownCaption.unknownFields()) && Intrinsics.areEqual(this.expire_at_ms, countdownCaption.expire_at_ms) && Intrinsics.areEqual(this.icon, countdownCaption.icon) && Intrinsics.areEqual(this.countdown, countdownCaption.countdown) && Intrinsics.areEqual(this.countdown_to_ms, countdownCaption.countdown_to_ms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.expire_at_ms;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Image image = this.icon;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
        StyledText styledText = this.countdown;
        int hashCode4 = (hashCode3 + (styledText != null ? styledText.hashCode() : 0)) * 37;
        Long l2 = this.countdown_to_ms;
        int hashCode5 = hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(16);
        builder.card_encryption_data = this.expire_at_ms;
        builder.customer_token_hash_email = this.icon;
        builder.device_metadata = this.countdown;
        builder.success_screen = this.countdown_to_ms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.expire_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at_ms=", l, arrayList);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        StyledText styledText = this.countdown;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("countdown=", styledText, arrayList);
        }
        Long l2 = this.countdown_to_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("countdown_to_ms=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CountdownCaption{", "}", 0, null, null, 56);
    }
}
