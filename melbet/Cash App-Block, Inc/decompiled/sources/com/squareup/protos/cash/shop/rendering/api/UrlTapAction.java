package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.profiles.ProfileDetails;
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
public final class UrlTapAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UrlTapAction> CREATOR;
    public final String action_url;

    static {
        UrlTapAction$Companion$ADAPTER$1 urlTapAction$Companion$ADAPTER$1 = new UrlTapAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UrlTapAction.class), "type.googleapis.com/squareup.cash.shop.rendering.api.UrlTapAction", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TapActions.proto");
        ADAPTER = urlTapAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(urlTapAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlTapAction(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action_url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UrlTapAction)) {
            return false;
        }
        UrlTapAction urlTapAction = (UrlTapAction) obj;
        return Intrinsics.areEqual(unknownFields(), urlTapAction.unknownFields()) && Intrinsics.areEqual(this.action_url, urlTapAction.action_url);
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
        ProfileDetails.Builder builder = new ProfileDetails.Builder(11);
        builder.bio = this.action_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.action_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UrlTapAction{", "}", 0, null, null, 56);
    }

    public /* synthetic */ UrlTapAction(String str) {
        this(str, ByteString.EMPTY);
    }
}
