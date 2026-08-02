package com.squareup.protos.cash.aegis.sync_values;

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

/* loaded from: classes7.dex */
public final class SendCashCta extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendCashCta> CREATOR;
    public final LocalizableString localizable_text;
    public final String text;
    public final String url;

    static {
        SendCashCta$Companion$ADAPTER$1 sendCashCta$Companion$ADAPTER$1 = new SendCashCta$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SendCashCta.class), "type.googleapis.com/squareup.cash.aegis.sync_values.SendCashCta", Syntax.PROTO_2, null, "squareup/cash/aegis/sync_values/UiFamilyAccount.proto");
        ADAPTER = sendCashCta$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sendCashCta$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendCashCta(String str, String str2, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.url = str;
        this.text = str2;
        this.localizable_text = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendCashCta)) {
            return false;
        }
        SendCashCta sendCashCta = (SendCashCta) obj;
        return Intrinsics.areEqual(unknownFields(), sendCashCta.unknownFields()) && Intrinsics.areEqual(this.url, sendCashCta.url) && Intrinsics.areEqual(this.text, sendCashCta.text) && Intrinsics.areEqual(this.localizable_text, sendCashCta.localizable_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_text;
        int hashCode4 = hashCode3 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCardDetails.Builder builder = new GiftCardDetails.Builder(2);
        builder.icon = this.url;
        builder.note = this.text;
        builder.localizable_note = this.localizable_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.url != null) {
            arrayList.add("url=██");
        }
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        LocalizableString localizableString = this.localizable_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendCashCta{", "}", 0, null, null, 56);
    }
}
