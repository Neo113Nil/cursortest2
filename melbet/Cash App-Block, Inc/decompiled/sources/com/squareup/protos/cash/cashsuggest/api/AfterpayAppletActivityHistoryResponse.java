package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
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
public final class AfterpayAppletActivityHistoryResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppletActivityHistoryResponse> CREATOR;
    public final Footer footer;
    public final LocalizedString screen_title;

    static {
        AfterpayAppletActivityHistoryResponse$Companion$ADAPTER$1 afterpayAppletActivityHistoryResponse$Companion$ADAPTER$1 = new AfterpayAppletActivityHistoryResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletActivityHistoryResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletActivityHistoryResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletActivityHistory.proto");
        ADAPTER = afterpayAppletActivityHistoryResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletActivityHistoryResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletActivityHistoryResponse(LocalizedString localizedString, Footer footer, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.screen_title = localizedString;
        this.footer = footer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletActivityHistoryResponse)) {
            return false;
        }
        AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse = (AfterpayAppletActivityHistoryResponse) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppletActivityHistoryResponse.unknownFields()) && Intrinsics.areEqual(this.screen_title, afterpayAppletActivityHistoryResponse.screen_title) && Intrinsics.areEqual(this.footer, afterpayAppletActivityHistoryResponse.footer);
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
        int hashCode3 = hashCode2 + (footer != null ? footer.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(11);
        builder.image_url = this.screen_title;
        builder.asset = this.footer;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppletActivityHistoryResponse{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AfterpayAppletActivityHistoryResponse(LocalizedString localizedString, Footer footer) {
        this(localizedString, footer, ByteString.EMPTY);
    }
}
