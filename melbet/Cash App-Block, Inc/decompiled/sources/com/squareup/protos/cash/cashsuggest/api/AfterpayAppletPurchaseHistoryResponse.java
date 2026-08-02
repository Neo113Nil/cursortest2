package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Footer;
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
public final class AfterpayAppletPurchaseHistoryResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppletPurchaseHistoryResponse> CREATOR;
    public final LocalizedString completed_title;
    public final Footer footer;
    public final LocalizedString screen_title;
    public final LocalizedString upcoming_title;

    static {
        AfterpayAppletPurchaseHistoryResponse$Companion$ADAPTER$1 afterpayAppletPurchaseHistoryResponse$Companion$ADAPTER$1 = new AfterpayAppletPurchaseHistoryResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletPurchaseHistoryResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletPurchaseHistoryResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletPurchaseHistory.proto");
        ADAPTER = afterpayAppletPurchaseHistoryResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletPurchaseHistoryResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletPurchaseHistoryResponse(LocalizedString localizedString, Footer footer, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.screen_title = localizedString;
        this.footer = footer;
        this.upcoming_title = localizedString2;
        this.completed_title = localizedString3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletPurchaseHistoryResponse)) {
            return false;
        }
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse = (AfterpayAppletPurchaseHistoryResponse) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppletPurchaseHistoryResponse.unknownFields()) && Intrinsics.areEqual(this.screen_title, afterpayAppletPurchaseHistoryResponse.screen_title) && Intrinsics.areEqual(this.footer, afterpayAppletPurchaseHistoryResponse.footer) && Intrinsics.areEqual(this.upcoming_title, afterpayAppletPurchaseHistoryResponse.upcoming_title) && Intrinsics.areEqual(this.completed_title, afterpayAppletPurchaseHistoryResponse.completed_title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.screen_title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Footer footer = this.footer;
        int hashCode3 = (hashCode2 + (footer != null ? footer.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.upcoming_title;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.completed_title;
        int hashCode5 = hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(13, false);
        builder.icon = this.screen_title;
        builder.title = this.footer;
        builder.enabled = this.upcoming_title;
        builder.id = this.completed_title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.screen_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("screen_title=", localizedString, arrayList);
        }
        Footer footer = this.footer;
        if (footer != null) {
            arrayList.add("footer=" + footer);
        }
        LocalizedString localizedString2 = this.upcoming_title;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("upcoming_title=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.completed_title;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("completed_title=", localizedString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppletPurchaseHistoryResponse{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AfterpayAppletPurchaseHistoryResponse(LocalizedString localizedString, Footer footer, LocalizedString localizedString2, LocalizedString localizedString3) {
        this(localizedString, footer, localizedString2, localizedString3, ByteString.EMPTY);
    }
}
