package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PoolsConfig;
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
public final class UiItemizedReceipt extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiItemizedReceipt> CREATOR;
    public final String render_json;
    public final String token;
    public final String transaction_token;

    static {
        UiItemizedReceipt$Companion$ADAPTER$1 uiItemizedReceipt$Companion$ADAPTER$1 = new UiItemizedReceipt$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiItemizedReceipt.class), "type.googleapis.com/squareup.franklin.ui.UiItemizedReceipt", Syntax.PROTO_2, null, "squareup/franklin/ui/itemized_receipt.proto");
        ADAPTER = uiItemizedReceipt$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiItemizedReceipt$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiItemizedReceipt(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.transaction_token = str2;
        this.render_json = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiItemizedReceipt)) {
            return false;
        }
        UiItemizedReceipt uiItemizedReceipt = (UiItemizedReceipt) obj;
        return Intrinsics.areEqual(unknownFields(), uiItemizedReceipt.unknownFields()) && Intrinsics.areEqual(this.token, uiItemizedReceipt.token) && Intrinsics.areEqual(this.transaction_token, uiItemizedReceipt.transaction_token) && Intrinsics.areEqual(this.render_json, uiItemizedReceipt.render_json);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.transaction_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.render_json;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolsConfig.Builder builder = new PoolsConfig.Builder(11);
        builder.nux_details_img_url = this.token;
        builder.nux_activity_img_url = this.transaction_token;
        builder.share_background_img_url = this.render_json;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.transaction_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "transaction_token=", arrayList);
        }
        String str3 = this.render_json;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "render_json=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiItemizedReceipt{", "}", 0, null, null, 56);
    }
}
