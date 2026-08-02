package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import app.cash.local.primitives.LocalErrorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.Error;
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
public final class AfterpayHubRowItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayHubRowItem> CREATOR;
    public final Avatar avatar;
    public final LocalErrorKt detail_content;
    public final String id;
    public final String row_action_url;
    public final Text subtitle;
    public final Text title;

    static {
        AfterpayHubRowItem$Companion$ADAPTER$1 afterpayHubRowItem$Companion$ADAPTER$1 = new AfterpayHubRowItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayHubRowItem.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.AfterpayHubRowItem", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/afterpay_hub.proto");
        ADAPTER = afterpayHubRowItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayHubRowItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayHubRowItem(Avatar avatar, Text text, Text text2, String str, String str2, LocalErrorKt localErrorKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.avatar = avatar;
        this.title = text;
        this.subtitle = text2;
        this.row_action_url = str;
        this.id = str2;
        this.detail_content = localErrorKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayHubRowItem)) {
            return false;
        }
        AfterpayHubRowItem afterpayHubRowItem = (AfterpayHubRowItem) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayHubRowItem.unknownFields()) && Intrinsics.areEqual(this.avatar, afterpayHubRowItem.avatar) && Intrinsics.areEqual(this.title, afterpayHubRowItem.title) && Intrinsics.areEqual(this.subtitle, afterpayHubRowItem.subtitle) && Intrinsics.areEqual(this.row_action_url, afterpayHubRowItem.row_action_url) && Intrinsics.areEqual(this.id, afterpayHubRowItem.id) && Intrinsics.areEqual(this.detail_content, afterpayHubRowItem.detail_content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Avatar avatar = this.avatar;
        int hashCode2 = (hashCode + (avatar != null ? avatar.hashCode() : 0)) * 37;
        Text text = this.title;
        int hashCode3 = (hashCode2 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.subtitle;
        int hashCode4 = (hashCode3 + (text2 != null ? text2.hashCode() : 0)) * 37;
        String str = this.row_action_url;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.id;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalErrorKt localErrorKt = this.detail_content;
        int hashCode7 = hashCode6 + (localErrorKt != null ? localErrorKt.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(12, false);
        builder.category = this.avatar;
        builder.code = this.title;
        builder.retryable = this.subtitle;
        builder.description = this.row_action_url;
        builder.field = this.id;
        builder.metadata = this.detail_content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        Text text2 = this.subtitle;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtitle=", text2, arrayList);
        }
        if (this.row_action_url != null) {
            arrayList.add("row_action_url=██");
        }
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        LocalErrorKt localErrorKt = this.detail_content;
        if (localErrorKt != null) {
            arrayList.add("detail_content=" + localErrorKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayHubRowItem{", "}", 0, null, null, 56);
    }
}
