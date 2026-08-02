package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.favorites.Favorite;
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
public final class TapAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TapAction> CREATOR;
    public final String action_url;

    static {
        TapAction$Companion$ADAPTER$1 tapAction$Companion$ADAPTER$1 = new TapAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TapAction.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.TapAction", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
        ADAPTER = tapAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tapAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapAction(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action_url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TapAction)) {
            return false;
        }
        TapAction tapAction = (TapAction) obj;
        return Intrinsics.areEqual(unknownFields(), tapAction.unknownFields()) && Intrinsics.areEqual(this.action_url, tapAction.action_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.action_url;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Favorite.Builder builder = new Favorite.Builder(2);
        builder.favorite_customer_token = this.action_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.action_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TapAction{", "}", 0, null, null, 56);
    }
}
