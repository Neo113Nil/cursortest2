package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.giftly.GiftCardDetails;
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
public final class CashAppTagRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppTagRenderData> CREATOR;
    public final String device_display_name;
    public final LocalizableString localizable_payment_method_display_name;
    public final String payment_method_display_name;

    static {
        CashAppTagRenderData$Companion$ADAPTER$1 cashAppTagRenderData$Companion$ADAPTER$1 = new CashAppTagRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppTagRenderData.class), "type.googleapis.com/squareup.franklin.CashAppTagRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = cashAppTagRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppTagRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppTagRenderData(String str, String str2, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.localizable_payment_method_display_name = localizableString;
        this.payment_method_display_name = str;
        this.device_display_name = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppTagRenderData)) {
            return false;
        }
        CashAppTagRenderData cashAppTagRenderData = (CashAppTagRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppTagRenderData.unknownFields()) && Intrinsics.areEqual(this.localizable_payment_method_display_name, cashAppTagRenderData.localizable_payment_method_display_name) && Intrinsics.areEqual(this.payment_method_display_name, cashAppTagRenderData.payment_method_display_name) && Intrinsics.areEqual(this.device_display_name, cashAppTagRenderData.device_display_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizableString localizableString = this.localizable_payment_method_display_name;
        int hashCode2 = (hashCode + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str = this.payment_method_display_name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.device_display_name;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCardDetails.Builder builder = new GiftCardDetails.Builder(3);
        builder.localizable_note = this.localizable_payment_method_display_name;
        builder.icon = this.payment_method_display_name;
        builder.note = this.device_display_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizableString localizableString = this.localizable_payment_method_display_name;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_payment_method_display_name=", localizableString, arrayList);
        }
        String str = this.payment_method_display_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_method_display_name=", arrayList);
        }
        String str2 = this.device_display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "device_display_name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppTagRenderData{", "}", 0, null, null, 56);
    }
}
