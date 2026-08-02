package com.squareup.protos.cash.giftly.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GiftCardStoreUpsell extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GiftCardStoreUpsell> CREATOR;
    public final List gift_card_type_tokens;
    public final String title;

    static {
        GiftCardStoreUpsell$Companion$ADAPTER$1 giftCardStoreUpsell$Companion$ADAPTER$1 = new GiftCardStoreUpsell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCardStoreUpsell.class), "type.googleapis.com/squareup.cash.giftly.app.GiftCardStoreUpsell", Syntax.PROTO_2, null, "squareup/cash/giftly/app/service.proto");
        ADAPTER = giftCardStoreUpsell$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCardStoreUpsell$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCardStoreUpsell(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.gift_card_type_tokens = TransactorKt.immutableCopyOf("gift_card_type_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftCardStoreUpsell)) {
            return false;
        }
        GiftCardStoreUpsell giftCardStoreUpsell = (GiftCardStoreUpsell) obj;
        return Intrinsics.areEqual(unknownFields(), giftCardStoreUpsell.unknownFields()) && Intrinsics.areEqual(this.title, giftCardStoreUpsell.title) && Intrinsics.areEqual(this.gift_card_type_tokens, giftCardStoreUpsell.gift_card_type_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = this.gift_card_type_tokens.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(17, false);
        builder.toggle_title = this.title;
        builder.sections = this.gift_card_type_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        List list = this.gift_card_type_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("gift_card_type_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCardStoreUpsell{", "}", 0, null, null, 56);
    }
}
