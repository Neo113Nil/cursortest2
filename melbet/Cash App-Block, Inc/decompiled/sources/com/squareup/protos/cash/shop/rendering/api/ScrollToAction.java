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
public final class ScrollToAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScrollToAction> CREATOR;
    public final String target_id;

    static {
        ScrollToAction$Companion$ADAPTER$1 scrollToAction$Companion$ADAPTER$1 = new ScrollToAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScrollToAction.class), "type.googleapis.com/squareup.cash.shop.rendering.api.ScrollToAction", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TapActions.proto");
        ADAPTER = scrollToAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scrollToAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollToAction(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.target_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScrollToAction)) {
            return false;
        }
        ScrollToAction scrollToAction = (ScrollToAction) obj;
        return Intrinsics.areEqual(unknownFields(), scrollToAction.unknownFields()) && Intrinsics.areEqual(this.target_id, scrollToAction.target_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.target_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(10);
        builder.bio = this.target_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.target_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "target_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScrollToAction{", "}", 0, null, null, 56);
    }
}
