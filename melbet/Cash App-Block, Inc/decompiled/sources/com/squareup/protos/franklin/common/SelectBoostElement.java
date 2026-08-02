package com.squareup.protos.franklin.common;

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
public final class SelectBoostElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectBoostElement> CREATOR;
    public final String boost_identifier;
    public final String upsell_button_text;
    public final String upsell_description;

    static {
        SelectBoostElement$Companion$ADAPTER$1 selectBoostElement$Companion$ADAPTER$1 = new SelectBoostElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectBoostElement.class), "type.googleapis.com/squareup.franklin.common.SelectBoostElement", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
        ADAPTER = selectBoostElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(selectBoostElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectBoostElement(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.boost_identifier = str;
        this.upsell_button_text = str2;
        this.upsell_description = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectBoostElement)) {
            return false;
        }
        SelectBoostElement selectBoostElement = (SelectBoostElement) obj;
        return Intrinsics.areEqual(unknownFields(), selectBoostElement.unknownFields()) && Intrinsics.areEqual(this.boost_identifier, selectBoostElement.boost_identifier) && Intrinsics.areEqual(this.upsell_button_text, selectBoostElement.upsell_button_text) && Intrinsics.areEqual(this.upsell_description, selectBoostElement.upsell_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.boost_identifier;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.upsell_button_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.upsell_description;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolsConfig.Builder builder = new PoolsConfig.Builder(7);
        builder.nux_details_img_url = this.boost_identifier;
        builder.nux_activity_img_url = this.upsell_button_text;
        builder.share_background_img_url = this.upsell_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.boost_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "boost_identifier=", arrayList);
        }
        String str2 = this.upsell_button_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "upsell_button_text=", arrayList);
        }
        String str3 = this.upsell_description;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "upsell_description=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectBoostElement{", "}", 0, null, null, 56);
    }
}
